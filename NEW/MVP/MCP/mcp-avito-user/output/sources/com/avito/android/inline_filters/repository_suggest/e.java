package com.avito.android.inline_filters.repository_suggest;

import Y61.k;
import Y61.l;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.O;
import kotlin.Metadata;

/* compiled from: InlineFiltersSelectRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/repository_suggest/e;", "LZp0/c;", "Lcom/avito/android/inline_filters/repository_suggest/g;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements InterfaceC19588c<g> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<V0> f172358a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f172359b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final SearchParams f172360c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SearchParamsConverter f172361d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f172362e;

    public e(@k h31.e<V0> eVar, @k String str, @l SearchParams searchParams, @k SearchParamsConverter searchParamsConverter, boolean z12) {
        this.f172358a = eVar;
        this.f172359b = str;
        this.f172360c = searchParams;
        this.f172361d = searchParamsConverter;
        this.f172362e = z12;
    }

    @Override // Zp0.InterfaceC19588c
    public final O a(InterfaceC19587b interfaceC19587b) {
        g gVar = (g) interfaceC19587b;
        String str = gVar.f172364b;
        int i12 = gVar.f172363a;
        return new C42007e(new c(i12, this, str)).r(new d(i12, this, str));
    }

    @Override // Zp0.InterfaceC19588c
    @k
    public final O b(@k String str) {
        return new C42007e(new c(0, this, str)).r(new d(0, this, str));
    }
}
