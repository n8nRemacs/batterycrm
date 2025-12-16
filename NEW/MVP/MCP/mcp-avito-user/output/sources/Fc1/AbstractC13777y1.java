package Fc1;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.text.C43047d;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.y1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC13777y1<T> extends Request<T> {

    /* renamed from: p, reason: collision with root package name */
    @j.B
    @Y61.k
    public final kotlinx.coroutines.r f5895p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Object f5896q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f5897r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f5898s;

    public AbstractC13777y1(int i12, @Y61.k String str, @Y61.k kotlinx.coroutines.r rVar) {
        super(i12, str, new C13670m1(rVar, 0));
        this.f5895p = rVar;
        this.f5896q = new Object();
        this.f5897r = C42727D.c(P0.f5138l);
        InterfaceC42726C interfaceC42726CC = C42727D.c(C13616g1.f5527l);
        this.f5898s = interfaceC42726CC;
        this.f67036m = new com.android.volley.m(1.0f, ((InterfaceC13753v4) interfaceC42726CC.getValue()).b() * 1000, 0);
    }

    @Override // com.android.volley.Request
    public final void c(T t12) {
        kotlinx.coroutines.r rVar;
        synchronized (this.f5896q) {
            rVar = this.f5895p;
            kotlin.G0 g02 = kotlin.G0.f406611a;
        }
        int i12 = kotlin.Z.f406624c;
        rVar.resumeWith(t12);
    }

    @Override // com.android.volley.Request
    @Y61.k
    public Map<String, String> i() {
        String str;
        String str2;
        HashMap mapG = org.webrtc.h.g("Content-Type", "application/json;charset=utf-8");
        InterfaceC42726C interfaceC42726C = this.f5897r;
        ((F7) interfaceC42726C.getValue()).getClass();
        mapG.put("X-SDK-Version", "4.0.0");
        mapG.put("X-SDK-TargetOS", "Android");
        InterfaceC42726C interfaceC42726C2 = this.f5898s;
        int i12 = ((InterfaceC13753v4) interfaceC42726C2.getValue()).i();
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
        Context contextB = ((F7) interfaceC42726C.getValue()).b();
        try {
            str2 = contextB.getPackageManager().getPackageInfo(contextB.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
            str2 = "";
        }
        mapG.put("X-APP-Version", str2);
        if (((InterfaceC13753v4) interfaceC42726C2.getValue()).i() != 1) {
            mapG.put("X-SDK-Platform-Version", ((InterfaceC13753v4) interfaceC42726C2.getValue()).g());
        }
        return mapG;
    }

    @Override // com.android.volley.Request
    @Y61.k
    public final com.android.volley.w<T> m(@Y61.l com.android.volley.r rVar) {
        Map<String, String> map = rVar.f67101c;
        if (map != null) {
            try {
                p(map);
            } catch (Exception unused) {
            }
        }
        try {
            return new com.android.volley.w<>(o(new String(rVar.f67100b, Charset.forName(com.android.volley.toolbox.n.c(C43047d.f410589b.name(), map)))), com.android.volley.toolbox.n.b(rVar));
        } catch (Exception e12) {
            return new com.android.volley.w<>(new VolleyError(e12.getCause()));
        }
    }

    public abstract T o(@Y61.k String str);

    public void p(@Y61.k Map<String, String> map) {
    }
}
