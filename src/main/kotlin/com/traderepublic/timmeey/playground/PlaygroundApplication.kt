package com.traderepublic.timmeey.playground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletRequest
import java.util.HashMap



@SpringBootApplication
class PlaygroundApplication

fun main(args: Array<String>) {
	runApplication<PlaygroundApplication>(*args)
}




@RestController
@RequestMapping("/muh")
class SubLedgerAccountControllerV2(){


	@GetMapping("/1/")
	fun test(request: HttpServletRequest): MutableMap<String, Array<String>>? {
		return request.getParameterMap()

	}

	@GetMapping("/2/")
	fun test1(@RequestParam("filter")filter: CustomWrapper): CustomWrapper {
		return filter

	}


}

class CustomWrapper {

	var customMap: Map<String, List<String>> = HashMap()

}

