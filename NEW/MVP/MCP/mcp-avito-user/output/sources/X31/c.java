package x31;

import Yb1.a;
import d31.C39498d;
import java.net.SocketException;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class c extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g0.h f442151l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f442152m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g0.h hVar, String str) {
        super(0);
        this.f442151l = hVar;
        this.f442152m = str;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.a
    public final Object invoke() throws SocketException {
        g0.h hVar = this.f442151l;
        C39498d c39498d = (C39498d) hVar.f396208f0.getValue();
        c39498d.getClass();
        String str = this.f442152m;
        e.h hVar2 = (e.h) c39498d.f393650b;
        String strA = hVar2.a();
        String str2 = (String) y31.c.f442880b.getValue();
        c39498d.f393649a.a(new a.b(null, null, "Close", hVar2.f394234g, c39498d.f393651c.f395679a, str2, "android_4.0.0", strA, str, null, 515, null));
        hVar.dismiss();
        return G0.f406611a;
    }
}
