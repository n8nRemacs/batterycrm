package com.avito.android.vas_performance.screens.stickers.edit.ui.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StickersEditScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class p extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ML0.c f320917l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<ML0.b> f320918m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f320919n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<ML0.a, G0> f320920o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f320921p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v f320922q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f320923r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(ML0.c cVar, InterfaceC43160i interfaceC43160i, Y41.a aVar, Y41.l lVar, Y41.l lVar2, v vVar, int i12) {
        super(2);
        this.f320917l = cVar;
        this.f320918m = interfaceC43160i;
        this.f320919n = (N) aVar;
        this.f320920o = lVar;
        this.f320921p = lVar2;
        this.f320922q = vVar;
        this.f320923r = i12;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f320923r | 1);
        ?? r22 = this.f320919n;
        Y41.l<ML0.a, G0> lVar = this.f320920o;
        q.a(this.f320917l, this.f320918m, r22, lVar, this.f320921p, a12, iA2);
        return G0.f406611a;
    }
}
