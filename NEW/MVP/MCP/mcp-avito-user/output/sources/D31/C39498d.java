package d31;

import Yb1.a;
import e.InterfaceC39835a;
import e31.C39939a;
import f61.C40239a;
import java.net.SocketException;

/* renamed from: d31.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39498d {

    /* renamed from: a, reason: collision with root package name */
    public final C39939a f393649a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC39835a f393650b;

    /* renamed from: c, reason: collision with root package name */
    public final C40239a f393651c;

    public C39498d(C39939a c39939a, InterfaceC39835a interfaceC39835a, C40239a c40239a) {
        this.f393649a = c39939a;
        this.f393650b = interfaceC39835a;
        this.f393651c = c40239a;
    }

    public final void a(String str) throws SocketException {
        e.h hVar = (e.h) this.f393650b;
        String strA = hVar.a();
        String str2 = (String) y31.c.f442880b.getValue();
        this.f393649a.a(new a.b(null, null, "Click", hVar.f394234g, this.f393651c.f395679a, str2, "android_4.0.0", strA, str, null, 515, null));
    }
}
