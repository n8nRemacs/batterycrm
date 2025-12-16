package e31;

import B31.j;
import android.content.Context;
import c31.C26934a;
import e.InterfaceC39835a;
import kotlin.InterfaceC42726C;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import l31.C43537b;
import l31.h;
import q31.C47194b;
import s31.C47991a;
import sc1.l;
import w31.C49437b;
import w31.k;
import x2.C49751g;

/* loaded from: classes8.dex */
public final class f implements y31.e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f394940a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC39835a f394941b;

    /* renamed from: c, reason: collision with root package name */
    public final C47991a f394942c;

    /* renamed from: d, reason: collision with root package name */
    public n31.d f394943d;

    /* renamed from: e, reason: collision with root package name */
    public s2.c f394944e;

    /* renamed from: f, reason: collision with root package name */
    public String f394945f;

    public f(Context context, InterfaceC39835a interfaceC39835a, C47991a c47991a, D31.a aVar) {
        this.f394940a = context;
        this.f394941b = interfaceC39835a;
        this.f394942c = c47991a;
        n31.b bVar = n31.b.f414892c;
        this.f394943d = bVar;
        this.f394944e = a(bVar);
        this.f394945f = "";
        InterfaceC42726C interfaceC42726C = ((D31.g) aVar).f2880a;
        C43259k.d((T) interfaceC42726C.getValue(), null, null, new C39941c(this, null), 3);
        C43259k.d((T) interfaceC42726C.getValue(), null, null, new e(this, null), 3);
    }

    public final s2.c a(n31.d dVar) {
        String strA = l.a(dVar.f414894a);
        String strA2 = l.a(dVar.f414895b);
        Context context = this.f394940a;
        C47991a c47991a = this.f394942c;
        C26934a c26934a = new C26934a(strA2, strA);
        c26934a.f57630d = 10000L;
        InterfaceC42726C interfaceC42726C = G31.b.f6271a;
        Context applicationContext = context.getApplicationContext();
        h hVar = new h(c26934a, (S51.a) G31.b.f6271a.getValue());
        L41.b bVar = new L41.b(c26934a, c47991a.f437456a);
        w31.h hVar2 = new w31.h(applicationContext, c26934a);
        if (G31.b.f6273c == null) {
            G31.b.f6273c = new B31.f(applicationContext, new B31.d());
        }
        B31.f fVar = G31.b.f6273c;
        if (fVar == null) {
            G31.b.f6273c = new B31.f(applicationContext, new B31.d());
        }
        k kVar = new k(applicationContext, fVar, new B31.l(G31.b.f6273c));
        G31.b.f6272b = kVar;
        return new s2.c(new C43537b(new C49751g(hVar, bVar, new q31.d(hVar2, kVar)), new C47194b(new C49437b(applicationContext, new B31.b(applicationContext), new B31.h(), new j(applicationContext, c26934a)))), G31.b.f6272b);
    }
}
