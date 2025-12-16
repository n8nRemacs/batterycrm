package com.avito.android.inline_filters;

import Hq0.C14020b;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Y5;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GetCounterAndMapButtonsUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/l;", "Lcom/avito/android/inline_filters/f;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31052l implements InterfaceC31046f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<V0> f172305a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f172306b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f172307c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InlineFiltersSource f172308d;

    /* compiled from: GetCounterAndMapButtonsUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.inline_filters.l$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[InlineFiltersSource.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InlineFiltersSource inlineFiltersSource = InlineFiltersSource.f170993b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InlineFiltersSource inlineFiltersSource2 = InlineFiltersSource.f170993b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public C31052l(@Y61.k h31.e<V0> eVar, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InlineFiltersSource inlineFiltersSource) {
        this.f172305a = eVar;
        this.f172306b = searchParamsConverter;
        this.f172307c = interfaceC35745a5;
        this.f172308d = inlineFiltersSource;
    }

    @Override // com.avito.android.inline_filters.InterfaceC31046f
    @Y61.k
    public final I0 a(@Y61.k SearchParams searchParams, @Y61.l PresentationType presentationType) {
        io.reactivex.rxjava3.core.z zVarA = Y5.a(new io.reactivex.rxjava3.internal.operators.observable.F(new C14020b(10, this, SearchParamsConverter.DefaultImpls.convertToMap$default(this.f172306b, searchParams, C31053m.f172318l, false, presentationType, 4, null))));
        InterfaceC35745a5 interfaceC35745a5 = this.f172307c;
        return zVarA.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e());
    }
}
