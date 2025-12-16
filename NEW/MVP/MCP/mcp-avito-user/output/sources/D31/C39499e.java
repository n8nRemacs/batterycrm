package d31;

import Yb1.a;
import android.content.Context;
import e.InterfaceC39835a;
import e31.C39939a;
import f61.C40239a;
import java.net.SocketException;
import kotlin.text.C43066x;
import sberid.sdk.app_token.domain.models.models.TypeAuth;
import z.EnumC50330a;

/* renamed from: d31.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39499e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f393652a;

    /* renamed from: b, reason: collision with root package name */
    public final C39939a f393653b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC39835a f393654c;

    /* renamed from: d, reason: collision with root package name */
    public final C40239a f393655d;

    public C39499e(Context context, C39939a c39939a, InterfaceC39835a interfaceC39835a, C40239a c40239a) {
        this.f393652a = context;
        this.f393653b = c39939a;
        this.f393654c = interfaceC39835a;
        this.f393655d = c40239a;
    }

    public final String a() {
        if (AbstractC39500f.a(this.f393652a)) {
            EnumC50330a[] enumC50330aArr = EnumC50330a.f443670b;
            return "none";
        }
        EnumC50330a[] enumC50330aArr2 = EnumC50330a.f443670b;
        return "sbol";
    }

    public final void b(String str) throws SocketException {
        e.h hVar = (e.h) this.f393654c;
        String strA = hVar.a();
        String str2 = (String) y31.c.f442880b.getValue();
        C40239a c40239a = this.f393655d;
        this.f393653b.a(new a.c("android_4.0.0", strA, str2, c40239a.f395679a, a(), hVar.f394234g, hVar.f394235h ? "1" : "0", (str == null || C43066x.K(str)) ? "success" : "fail", str, null, 512, null));
    }

    public final void c(TypeAuth typeAuth) throws SocketException {
        e.h hVar = (e.h) this.f393654c;
        String strA = hVar.a();
        String str = (String) y31.c.f442880b.getValue();
        C40239a c40239a = this.f393655d;
        this.f393653b.a(new a.e("android_4.0.0", strA, str, c40239a.f395679a, a(), hVar.f394234g, hVar.f394235h ? "1" : "0", typeAuth != null ? typeAuth.f437747b : null, null, 256, null));
    }
}
