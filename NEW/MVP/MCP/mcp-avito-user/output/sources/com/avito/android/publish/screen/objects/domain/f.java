package com.avito.android.publish.screen.objects.domain;

import com.avito.android.publish.screen.objects.mvi.entity.ObjectFillFormInternalAction;
import kotlin.Metadata;

/* compiled from: ObjectFillFormItemsClicksInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/imv/a;", "data", "Lkotlin/G0;", "accept", "(Lcom/avito/android/publish/imv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f239989b;

    public f(e eVar) {
        this.f239989b = eVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f239989b.f239984p.K5(new ObjectFillFormInternalAction.UpdatedInstantMarketValue((com.avito.android.publish.imv.a) obj));
    }
}
