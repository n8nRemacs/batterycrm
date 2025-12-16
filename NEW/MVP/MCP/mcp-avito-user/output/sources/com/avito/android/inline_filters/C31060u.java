package com.avito.android.inline_filters;

import androidx.compose.ui.platform.C22491k0;
import com.avito.android.remote.model.SearchParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: InlineFiltersParametersKeyWrapper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/inline_filters/u;", "Lkotlin/Function1;", "", "<init>", "()V", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31060u implements Y41.l<String, String> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43059p f172371b = new C43059p("\\b(params\\[[a-zA-Z0-9+-_]+])");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43059p f172372c = new C43059p("\\b(searchArea\\[[a-zA-Z0-9+-_]+])");

    @Inject
    public C31060u() {
    }

    @Override // Y41.l
    public final String invoke(String str) {
        String str2 = str;
        return C43059p.b(this.f172371b, str2) != null ? C43066x.a0(str2, "params", "parameters[params]", false) : C43059p.b(this.f172372c, str2) != null ? C43066x.a0(str2, SearchParams.Companion.Params.SEARCH_AREA_PARAM, "parameters[searchArea]", false) : C22491k0.a(']', "parameters[", str2);
    }
}
