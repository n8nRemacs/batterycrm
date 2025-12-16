package com.avito.android.extended_profile_serp.mvi;

import bB.InterfaceC25487a;
import bB.b;
import com.avito.android.extended_profile_serp.C30558v;
import com.avito.android.extended_profile_serp.ExtendedProfileSerpConfig;
import com.avito.android.extended_profile_serp.deep_linking.ExtendedProfileSerpStartMode;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction;
import com.avito.android.search.filter.FilterAnalyticsData;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExtendedProfileSerpOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/v;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "LbB/b;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class v implements com.avito.android.arch.mvi.t<ExtendedProfileSerpInternalAction, bB.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileSerpConfig f153064b;

    /* compiled from: ExtendedProfileSerpOneTimeEventProducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ExtendedProfileSerpStartMode.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ExtendedProfileSerpStartMode extendedProfileSerpStartMode = ExtendedProfileSerpStartMode.f152656b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public v(@Y61.k ExtendedProfileSerpConfig extendedProfileSerpConfig) {
        this.f153064b = extendedProfileSerpConfig;
    }

    @Override // com.avito.android.arch.mvi.t
    public final bB.b b(ExtendedProfileSerpInternalAction extendedProfileSerpInternalAction) {
        ExtendedProfileSerpInternalAction extendedProfileSerpInternalAction2 = extendedProfileSerpInternalAction;
        if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.CloseScreen) {
            return new b.C1994b(((ExtendedProfileSerpInternalAction.CloseScreen) extendedProfileSerpInternalAction2).f152933b);
        }
        if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.OpenFiltersScreen) {
            ExtendedProfileSerpInternalAction.OpenFiltersScreen openFiltersScreen = (ExtendedProfileSerpInternalAction.OpenFiltersScreen) extendedProfileSerpInternalAction2;
            return new b.c(openFiltersScreen.f152937b, openFiltersScreen.f152938c, openFiltersScreen.f152939d);
        }
        if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.AdvertsLoadingError) {
            ExtendedProfileSerpInternalAction.AdvertsLoadingError advertsLoadingError = (ExtendedProfileSerpInternalAction.AdvertsLoadingError) extendedProfileSerpInternalAction2;
            if (!advertsLoadingError.f152931c) {
                return new b.f(advertsLoadingError.f152930b, new InterfaceC25487a.l(false));
            }
        } else {
            if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.OpenShare) {
                return new b.e(((ExtendedProfileSerpInternalAction.OpenShare) extendedProfileSerpInternalAction2).f152940b);
            }
            if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.PageParamsLoaded) {
                ExtendedProfileSerpConfig extendedProfileSerpConfig = this.f153064b;
                int iOrdinal = extendedProfileSerpConfig.f152447g.ordinal();
                if (iOrdinal == 1) {
                    ExtendedProfileSerpInternalAction.PageParamsLoaded pageParamsLoaded = (ExtendedProfileSerpInternalAction.PageParamsLoaded) extendedProfileSerpInternalAction2;
                    C30558v c30558v = pageParamsLoaded.f152941b;
                    return new b.c(pageParamsLoaded.f152942c, c30558v.f153112c, new FilterAnalyticsData(FilterAnalyticsData.Source.f261814g, extendedProfileSerpConfig.f152442b, null, c30558v.f153113d));
                }
                if (iOrdinal == 2) {
                    return new b.d(((ExtendedProfileSerpInternalAction.PageParamsLoaded) extendedProfileSerpInternalAction2).f152942c);
                }
            } else {
                if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.ApplySuggest) {
                    return new b.a(((ExtendedProfileSerpInternalAction.ApplySuggest) extendedProfileSerpInternalAction2).f152932b);
                }
                if (extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.UpdateSearchInputText) {
                    return new b.g(((ExtendedProfileSerpInternalAction.UpdateSearchInputText) extendedProfileSerpInternalAction2).f152950b);
                }
                if (!(extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.UpdateItems ? true : extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.UserNotExistError ? true : extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.PageParamsLoading ? true : extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.AdvertsLoaded ? true : extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.ShowPhoneDialog ? true : extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.OnPhoneCallCanceled ? true : extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.AdvertsLoading ? true : extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.InlineFiltersLoading ? true : extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.SuggestLoaded ? true : extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.SuggestLoadingError ? true : extendedProfileSerpInternalAction2 instanceof ExtendedProfileSerpInternalAction.InlineFiltersLoaded)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return null;
    }
}
