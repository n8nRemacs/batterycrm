package com.geetest.captcha;

import android.content.pm.PackageManager;
import com.geetest.captcha.x;
import java.io.UnsupportedEncodingException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/geetest/captcha/handlers/PreLoadHandler;", "Lcom/geetest/captcha/handlers/base/HandlerImpl;", "<init>", "()V", "Lcom/geetest/captcha/handlers/Request;", "request", "Lkotlin/G0;", "handler", "(Lcom/geetest/captcha/handlers/Request;)V", "", "getHandlerLevel", "()I", "handlerLevel", "Companion", "HandlerObserver", "captcha_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes4.dex */
public final class o extends u {
    @Override // com.geetest.captcha.t
    public int a() {
        return 1;
    }

    @Override // com.geetest.captcha.t
    public void a(@Y61.k p pVar) throws JSONException, PackageManager.NameNotFoundException, UnsupportedEncodingException {
        if (pVar.a()) {
            return;
        }
        h0.f342732d.c("Step: PreLoadHandler.handler");
        pVar.a(x.a.FLOWING);
        pVar.a(pVar.f342771g, pVar.f342772h, new a(pVar, this));
    }

    public static final class a implements z {

        /* renamed from: a, reason: collision with root package name */
        public final p f342763a;

        /* renamed from: b, reason: collision with root package name */
        public final u f342764b;

        public a(@Y61.k p pVar, @Y61.k u uVar) {
            this.f342763a = pVar;
            this.f342764b = uVar;
        }

        @Override // com.geetest.captcha.z
        public void a() {
            u uVar;
            if (this.f342763a.a()) {
                return;
            }
            h0.f342732d.b("PreLoadHandler", "HandlerObserver.onCallReady");
            this.f342763a.a(x.a.SUCCESS);
            p pVar = this.f342763a;
            x xVar = pVar.f342766b;
            if (xVar == x.NONE || xVar != x.FLOWING || (uVar = this.f342764b.f342782a) == null) {
                return;
            }
            uVar.b(pVar);
        }

        @Override // com.geetest.captcha.z
        public void b() {
            if (this.f342763a.a()) {
                return;
            }
            h0.f342732d.b("PreLoadHandler", "PreLoadHandler.HandlerObserver.onClose");
        }

        @Override // com.geetest.captcha.z
        public void a(@Y61.k String str) {
            u uVar;
            if (this.f342763a.a()) {
                return;
            }
            h0 h0Var = h0.f342732d;
            h0Var.b("PreLoadHandler", "PreLoadHandler.HandlerObserver.onWebError: ".concat(str));
            this.f342763a.a(x.a.FAIL);
            h0Var.c(str);
            p pVar = this.f342763a;
            x xVar = pVar.f342766b;
            if (xVar == x.NONE || xVar != x.FLOWING || (uVar = this.f342764b.f342782a) == null) {
                return;
            }
            uVar.b(pVar);
        }

        @Override // com.geetest.captcha.z
        public void a(@Y61.k String str, @Y61.k String str2, @Y61.k JSONObject jSONObject) throws JSONException {
            u uVar;
            if (this.f342763a.a()) {
                return;
            }
            this.f342763a.a(x.a.FAIL);
            String strA = w.f342797d.a(L.j(str, this.f342763a.f342765a.getType()), str2, jSONObject).a();
            h0.f342732d.b("PreLoadHandler", "PreLoadHandler.HandlerObserver.onError: " + strA);
            p pVar = this.f342763a;
            x xVar = pVar.f342766b;
            if (xVar == x.NONE || xVar != x.FLOWING || (uVar = this.f342764b.f342782a) == null) {
                return;
            }
            uVar.b(pVar);
        }

        @Override // com.geetest.captcha.z
        public void a(boolean z12, @Y61.k String str) {
            if (this.f342763a.a()) {
                return;
            }
            h0.f342732d.b("PreLoadHandler", "PreLoadHandler.HandlerObserver.onResult: ".concat(str));
            this.f342763a.a(x.a.FAIL);
        }
    }
}
