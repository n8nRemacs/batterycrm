package O41;

import Y41.l;
import cc1.C27176a;
import kotlin.G0;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class c extends N implements l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f11962l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar) {
        super(1);
        this.f11962l = eVar;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) {
        C27176a c27176a = (C27176a) obj;
        if (c27176a != null) {
            C27176a c27176aA = C27176a.a(c27176a, System.currentTimeMillis());
            C27176a c27176aA2 = C27176a.a(c27176aA, c27176aA.getExpiresTime() + 600000);
            e eVar = this.f11962l;
            ((t31.c) eVar.f11968b).c(c27176aA2);
            Q51.a.a(eVar.f11969c, c27176aA2.getExpiresTime());
        }
        return G0.f406611a;
    }
}
