package Fc1;

import Fc1.F7;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.android.volley.w;
import com.google.gson.Gson;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.text.C43047d;

@kotlin.jvm.internal.s0
@InterfaceC42830m
/* loaded from: classes9.dex */
public class O1<T> extends Request<T> {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Class f5118p;

    /* renamed from: q, reason: collision with root package name */
    @j.B
    @Y61.l
    public final w.b<T> f5119q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Object f5120r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Gson f5121s;

    public O1(@Y61.k String str, @Y61.k Class cls, @Y61.l w.b bVar, @Y61.k w.a aVar) {
        super(1, str, aVar);
        this.f5118p = cls;
        this.f5119q = bVar;
        this.f5120r = new Object();
        D6 d62 = F7.a.f4960a;
        this.f5121s = (Gson) (d62 == null ? null : d62).f4886y.get();
        D6 d63 = F7.a.f4960a;
        this.f67036m = new com.android.volley.m(1.0f, (d63 != null ? d63 : null).f4864c.f5865a.f2305e * 1000, 0);
    }

    @Override // com.android.volley.Request
    public final void c(T t12) {
        w.b<T> bVar;
        synchronized (this.f5120r) {
            bVar = this.f5119q;
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        if (bVar != null) {
            bVar.b(t12);
        }
    }

    @Override // com.android.volley.Request
    @Y61.k
    public Map<String, String> i() {
        String str;
        HashMap mapG = org.webrtc.h.g("Content-Type", "application/json;charset=utf-8");
        D6 d62 = F7.a.f4960a;
        if (d62 == null) {
            d62 = null;
        }
        d62.getClass();
        mapG.put("X-SDK-Version", "4.0.0");
        mapG.put("X-SDK-TargetOS", "Android");
        D6 d63 = F7.a.f4960a;
        if (d63 == null) {
            d63 = null;
        }
        int i12 = d63.f4864c.i();
        if (i12 == 1) {
            str = "Native";
        } else if (i12 == 2) {
            str = "RN";
        } else {
            if (i12 != 3) {
                throw null;
            }
            str = "Flutter";
        }
        mapG.put("X-SDK-Platform", str);
        D6 d64 = F7.a.f4960a;
        if (d64 == null) {
            d64 = null;
        }
        if (d64.f4864c.i() != 1) {
            D6 d65 = F7.a.f4960a;
            mapG.put("X-SDK-Platform-Version", (d65 != null ? d65 : null).f4864c.f5865a.f2317q);
        }
        return mapG;
    }

    @Override // com.android.volley.Request
    @Y61.k
    public final com.android.volley.w<T> m(@Y61.l com.android.volley.r rVar) {
        try {
            return new com.android.volley.w<>(this.f5121s.e(new String(rVar.f67100b, Charset.forName(com.android.volley.toolbox.n.c(C43047d.f410589b.name(), rVar.f67101c))), this.f5118p), com.android.volley.toolbox.n.b(rVar));
        } catch (Exception e12) {
            return new com.android.volley.w<>(new VolleyError(e12.getCause()));
        }
    }
}
