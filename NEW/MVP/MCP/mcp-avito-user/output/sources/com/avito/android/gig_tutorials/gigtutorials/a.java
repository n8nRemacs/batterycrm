package com.avito.android.gig_tutorials.gigtutorials;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GigTutorialsFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f161114l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f161115m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l<DeepLink, G0> f161116n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f161117o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Y41.a aVar, Y41.a aVar2, l lVar, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f161114l = aVar;
        this.f161115m = aVar2;
        this.f161116n = lVar;
        this.f161117o = interfaceC22204y1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            OH.c cVar = (OH.c) this.f161117o.getF42167b();
            boolean z12 = cVar.f12149b;
            Y41.a<G0> aVar = this.f161114l;
            if (z12) {
                a13.C(358115393);
                com.avito.android.gig_tutorials.gigtutorials.screens.i.a(aVar, a13, 0);
                a13.h();
            } else if (cVar.f12150c) {
                a13.C(358239827);
                com.avito.android.gig_tutorials.gigtutorials.screens.f.a(aVar, this.f161115m, a13, 0);
                a13.h();
            } else {
                a13.C(358377064);
                com.avito.android.gig_tutorials.gigtutorials.screens.j.c(cVar.f12151d, cVar.f12152e, cVar.f12153f, aVar, this.f161116n, a13, 512);
                a13.h();
            }
        }
        return G0.f406611a;
    }
}
