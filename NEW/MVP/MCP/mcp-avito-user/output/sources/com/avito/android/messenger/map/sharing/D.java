package com.avito.android.messenger.map.sharing;

import com.avito.android.messenger.map.sharing.K;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SharingMapPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/map/sharing/K$d;", "curState", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/messenger/map/sharing/K$d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class D extends N implements Y41.l<K.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f196637l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(z zVar) {
        super(1);
        this.f196637l = zVar;
    }

    @Override // Y41.l
    public final G0 invoke(K.d dVar) {
        this.f196637l.f196763c0.postValue(dVar.f196659d);
        return G0.f406611a;
    }
}
