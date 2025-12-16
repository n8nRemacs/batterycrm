package com.avito.android.messenger.map.sharing;

import com.avito.android.messenger.map.sharing.K;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;

/* compiled from: SharingMapPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$d;", "oldState", "invoke", "(Lcom/avito/android/messenger/map/sharing/K$d;)Lcom/avito/android/messenger/map/sharing/K$d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class y extends N implements Y41.l<K.d, K.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f196754l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ z f196755m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z12, z zVar) {
        super(1);
        this.f196754l = z12;
        this.f196755m = zVar;
    }

    @Override // Y41.l
    public final K.d invoke(K.d dVar) {
        K.d dVar2 = dVar;
        boolean z12 = dVar2 instanceof K.d.b ? true : dVar2 instanceof K.d.c.b ? true : dVar2 instanceof K.d.c.C5786c;
        boolean z13 = dVar2.f196660e;
        boolean z14 = this.f196754l;
        if (z12) {
            boolean z15 = dVar2.f196657b;
            boolean z16 = z14 ? z13 : false;
            K.d.c cVar = dVar2 instanceof K.d.c ? (K.d.c) dVar2 : null;
            return new K.d.a(dVar2.f196656a, z15, dVar2.f196659d, z16, cVar != null ? cVar.f196664g : null);
        }
        if (!(dVar2 instanceof K.d.a ? true : dVar2 instanceof K.d.c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z17 = z14 ? z13 : false;
        if (z13 != z17) {
            return z.me(this.f196755m, dVar2.a(z17));
        }
        return dVar2;
    }
}
