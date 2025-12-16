package com.avito.android.suggest_locations;

import com.avito.android.suggest_locations.analytics.FromBlock;
import kotlin.Metadata;
import sA0.InterfaceC48020a;

/* compiled from: SuggestLocationsPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class M<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f292114b;

    public M(T t12) {
        this.f292114b = t12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        T t12 = this.f292114b;
        InterfaceC48020a interfaceC48020a = t12.f292169b;
        String str = t12.f292186s;
        FromBlock fromBlock = FromBlock.f292253c;
        Integer num = t12.f292173f;
        String str2 = t12.f292177j;
        String str3 = t12.f292172e;
        String str4 = t12.f292171d;
        interfaceC48020a.a(str3, str4, str, fromBlock, num, str4, str2);
        SuggestLocationsFragment suggestLocationsFragment = t12.f292183p;
        if (suggestLocationsFragment != null) {
            suggestLocationsFragment.D5();
        }
    }
}
