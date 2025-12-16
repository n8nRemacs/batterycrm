package com.avito.android.suggest_locations;

import com.avito.android.suggest_locations.adapter.SuggestLocationItem;
import com.avito.android.suggest_locations.analytics.FromBlock;
import kotlin.Metadata;
import sA0.InterfaceC48020a;

/* compiled from: SuggestLocationsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/suggest_locations/adapter/SuggestLocationItem;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/suggest_locations/adapter/SuggestLocationItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class E<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f292106b;

    public E(T t12) {
        this.f292106b = t12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SuggestLocationItem suggestLocationItem = (SuggestLocationItem) obj;
        T t12 = this.f292106b;
        InterfaceC48020a interfaceC48020a = t12.f292169b;
        String str = t12.f292186s;
        FromBlock fromBlock = FromBlock.f292254d;
        interfaceC48020a.a(t12.f292172e, suggestLocationItem.f292214b, str, fromBlock, t12.f292173f, t12.f292171d, t12.f292177j);
        T.c(t12, suggestLocationItem);
    }
}
