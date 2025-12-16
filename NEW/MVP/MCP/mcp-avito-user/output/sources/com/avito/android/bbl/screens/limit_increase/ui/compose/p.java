package com.avito.android.bbl.screens.limit_increase.ui.compose;

import Eh.InterfaceC13485a;
import Eh.InterfaceC13486b;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: LimitIncreaseScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class p extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Eh.c f99910l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC13486b> f99911m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f99912n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC13485a, G0> f99913o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f99914p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f99915q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f99916r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(Eh.c cVar, InterfaceC43160i interfaceC43160i, Y41.a aVar, Y41.l lVar, Y41.l lVar2, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f99910l = cVar;
        this.f99911m = interfaceC43160i;
        this.f99912n = (N) aVar;
        this.f99913o = lVar;
        this.f99914p = lVar2;
        this.f99915q = vVar;
        this.f99916r = i12;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f99916r | 1);
        ?? r22 = this.f99912n;
        Y41.l<InterfaceC13485a, G0> lVar = this.f99913o;
        q.a(this.f99910l, this.f99911m, r22, lVar, this.f99914p, a12, iA2);
        return G0.f406611a;
    }
}
