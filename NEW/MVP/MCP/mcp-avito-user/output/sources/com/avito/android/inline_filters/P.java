package com.avito.android.inline_filters;

import EN.b;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.inline_filters.calendar.deeplink.FiltersCalendarPickerDeepLink;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: InlineFiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "deepLinkResultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class P<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f171013b;

    public P(z zVar) {
        this.f171013b = zVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C43501a c43501a = (C43501a) obj;
        z zVar = this.f171013b;
        Filter filter = zVar.f172398O;
        if (filter != null) {
            String id2 = filter.getId();
            Bundle bundle = c43501a.f413260a.f134522c;
            if (kotlin.jvm.internal.L.f(id2, bundle != null ? bundle.getString("inline_filter_deep_link_filter_id") : null)) {
                InterfaceC14249c interfaceC14249c = c43501a.f413261b;
                if (interfaceC14249c instanceof FiltersCalendarPickerDeepLink.b) {
                    T t12 = ((FiltersCalendarPickerDeepLink.b) interfaceC14249c).f171067b;
                    boolean z12 = t12 instanceof b.a ? true : t12 instanceof b.C0228b ? true : t12 instanceof b.d;
                    CN.f fVar = zVar.f172415i;
                    if (z12) {
                        zVar.f172425s.getClass();
                        InlineFilterValue.InlineFilterDateRangeValue inlineFilterDateRangeValueA = com.avito.android.inline_filters.dialog.calendar.date_range.a.a(t12);
                        if (inlineFilterDateRangeValueA != null) {
                            SearchParams searchParams = zVar.f172400Q;
                            PresentationType presentationType = zVar.f172401R;
                            String str = zVar.f172402S;
                            if (inlineFilterDateRangeValueA.isEmpty()) {
                                fVar.k();
                            }
                            if (!kotlin.jvm.internal.L.f(filter.getValue(), inlineFilterDateRangeValueA)) {
                                zVar.e(filter, inlineFilterDateRangeValueA, searchParams, presentationType, str);
                            }
                            zVar.f172398O = null;
                        }
                    } else if (kotlin.jvm.internal.L.f(t12, b.c.f3941a)) {
                        fVar.g();
                        zVar.f172398O = null;
                    }
                }
            }
        }
        zVar.f172398O = null;
    }
}
