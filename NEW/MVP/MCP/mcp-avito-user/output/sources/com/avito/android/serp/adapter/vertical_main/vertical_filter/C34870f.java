package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalFilterAnalyticsInteractorImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/f;", "LCN/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.vertical_main.vertical_filter.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34870f implements CN.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f273532a;

    @Inject
    public C34870f(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f273532a = interfaceC28373a;
    }

    @Override // CN.f
    public final void o(@Y61.l SearchParams searchParams, @Y61.k Filter filter, @Y61.k InlineFilterValue inlineFilterValue) {
        this.f273532a.c(new Nr0.f(searchParams != null ? searchParams.getCategoryId() : null, filter.getTitle(), inlineFilterValue.toStringList()));
    }

    @Override // CN.f
    public final void g() {
    }

    @Override // CN.f
    public final void k() {
    }

    @Override // CN.f
    public final void a(@Y61.k SearchParams searchParams) {
    }

    @Override // CN.f
    public final void d(@Y61.k SearchParams searchParams) {
    }

    @Override // CN.f
    public final void j(@Y61.l String str) {
    }

    @Override // CN.f
    public final void m(@Y61.l String str) {
    }

    @Override // CN.f
    public final void e(@Y61.k String str, @Y61.k String str2) {
    }

    @Override // CN.f
    public final void f(@Y61.l String str, @Y61.l ArrayList arrayList) {
    }

    @Override // CN.f
    public final void i(@Y61.k SearchParams searchParams, @Y61.k Filter filter) {
    }

    @Override // CN.f
    public final void l(@Y61.k SearchParams searchParams, @Y61.k Filter filter) {
    }

    @Override // CN.f
    public final void n(@Y61.k SearchParams searchParams, @Y61.k Filter filter) {
    }

    @Override // CN.f
    public final void b(@Y61.l String str, @Y61.k Filter filter, @Y61.k InlineFilterValue inlineFilterValue) {
    }

    @Override // CN.f
    public final void c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
    }

    @Override // CN.f
    public final void h(@Y61.l Integer num, @Y61.l String str, @Y61.l String str2) {
    }
}
