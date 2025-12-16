package com.avito.android.travel_search.domain;

import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.travel_search.deeplink.TravelSearchLink;
import com.avito.android.travel_search.mvi.entity.TravelSearchInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import sF0.InterfaceC48043a;

/* compiled from: TravelSearchInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_search/domain/i;", "Lcom/avito/android/travel_search/domain/h;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48043a f303103a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f303104b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f303105c;

    /* compiled from: TravelSearchInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TravelSearchLink.TravelSearchFlow.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TravelSearchLink.TravelSearchFlow.a aVar = TravelSearchLink.TravelSearchFlow.f302772b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public i(@Y61.k InterfaceC48043a interfaceC48043a, @Y61.k R0 r02, @Y61.k SearchParamsConverter searchParamsConverter) {
        this.f303103a = interfaceC48043a;
        this.f303104b = r02;
        this.f303105c = searchParamsConverter;
    }

    @Override // com.avito.android.travel_search.domain.h
    @Y61.k
    public final InterfaceC43160i a(@Y61.k SearchParams searchParams, @Y61.k TravelSearchLink.TravelSearchFlow travelSearchFlow) {
        int iOrdinal = travelSearchFlow.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return new C43210w(new TravelSearchInternalAction.ContentError(com.avito.android.remote.error.j.d(3, null)));
            }
            throw new NoWhenBranchMatchedException();
        }
        return new C43137a0(new k(2, null), C43175k.I(this.f303104b.a(), C43175k.G(new j(this, searchParams, null))));
    }
}
