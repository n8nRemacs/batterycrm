package com.avito.android.messenger.blacklist_reasons;

import com.avito.android.messenger.blacklist_reasons.y;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BlockUserInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y$d;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/blacklist_reasons/y$d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class B<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y.d f186534b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f186535c;

    public B(y.d dVar, z zVar) {
        this.f186534b = dVar;
        this.f186535c = zVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        y.a aVar = ((y.d.C5479d) this.f186534b).f186691a;
        this.f186535c.f186693W.accept(new y.c.b(aVar, (aVar instanceof y.a.C5478a) || ((aVar instanceof y.a.b) && ((y.a.b) aVar).f186681e), true));
    }
}
