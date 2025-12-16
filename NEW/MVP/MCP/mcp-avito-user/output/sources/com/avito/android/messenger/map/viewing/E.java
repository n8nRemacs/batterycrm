package com.avito.android.messenger.map.viewing;

import com.avito.android.messenger.map.viewing.view.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PlatformMapPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/map/viewing/view/d$b;", "oldState", "invoke", "(Lcom/avito/android/messenger/map/viewing/view/d$b;)Lcom/avito/android/messenger/map/viewing/view/d$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class E extends N implements Y41.l<d.b, d.b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f196782l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f196783m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(A a12, boolean z12) {
        super(1);
        this.f196782l = a12;
        this.f196783m = z12;
    }

    @Override // Y41.l
    public final d.b invoke(d.b bVar) {
        d.b bVar2 = bVar;
        boolean z12 = bVar2.f196876g;
        if (bVar2.f196875f && !z12) {
            return bVar2;
        }
        this.f196782l.f196775d0.postValue(G0.f406611a);
        return (!z12 || bVar2.f196877h) ? d.b.a(bVar2, null, null, null, null, this.f196783m, false, true, false, 47) : bVar2;
    }
}
