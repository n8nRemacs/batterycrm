package androidx.view;

import Y41.l;
import androidx.view.C23280B0;
import androidx.view.C23317W;
import androidx.view.C23324b0;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;

/* compiled from: NavController.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/navigation/E0;", "Lkotlin/G0;", "invoke", "(Landroidx/navigation/E0;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.navigation.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23287F extends N implements l<C23286E0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C23317W f52776l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C23397v f52777m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23287F(C23317W c23317w, C23397v c23397v) {
        super(1);
        this.f52776l = c23317w;
        this.f52777m = c23397v;
    }

    @Override // Y41.l
    public final G0 invoke(C23286E0 c23286e0) {
        C23286E0 c23286e02 = c23286e0;
        C23283D c23283d = C23283D.f52767l;
        C23371i c23371i = new C23371i();
        c23283d.invoke(c23371i);
        int i12 = c23371i.f53164a;
        C23280B0.a aVar = c23286e02.f52769a;
        aVar.f52758g = i12;
        aVar.f52759h = c23371i.f53165b;
        aVar.f52760i = -1;
        aVar.f52761j = -1;
        C23317W c23317w = this.f52776l;
        if (c23317w instanceof C23324b0) {
            C23317W.f52878k.getClass();
            Iterator it = C43033p.u(C23317W.b.a.f52888l, c23317w).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C23397v c23397v = this.f52777m;
                if (zHasNext) {
                    C23317W c23317w2 = (C23317W) it.next();
                    C23317W c23317wH = c23397v.h();
                    if (L.f(c23317w2, c23317wH != null ? c23317wH.f52880c : null)) {
                        break;
                    }
                } else if (C23397v.f53198G) {
                    C23324b0.a aVar2 = C23324b0.f52903p;
                    C23324b0 c23324b0 = c23397v.f53207c;
                    if (c23324b0 == null) {
                        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
                    }
                    aVar2.getClass();
                    int i13 = C23324b0.a.a(c23324b0).f52886i;
                    C23285E c23285e = C23285E.f52768l;
                    c23286e02.f52772d = i13;
                    c23286e02.f52774f = false;
                    C23310R0 c23310r0 = new C23310R0();
                    c23285e.invoke(c23310r0);
                    c23286e02.f52774f = c23310r0.f52867a;
                    c23286e02.f52775g = c23310r0.f52868b;
                }
            }
        }
        return G0.f406611a;
    }
}
