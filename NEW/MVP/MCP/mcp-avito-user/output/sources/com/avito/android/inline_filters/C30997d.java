package com.avito.android.inline_filters;

import com.avito.android.remote.V0;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: GetCategoryTreeUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/d;", "Lcom/avito/android/inline_filters/c;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30997d implements InterfaceC30996c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<V0> f171080a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f171081b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f171082c;

    /* compiled from: GetCategoryTreeUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.inline_filters.d$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171083a;

        static {
            int[] iArr = new int[WidgetType.values().length];
            try {
                iArr[WidgetType.AvitoBlackCategoryNodes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetType.ProfileCategoryNodes.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f171083a = iArr;
        }
    }

    @Inject
    public C30997d(@Y61.k h31.e<V0> eVar, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f171080a = eVar;
        this.f171081b = searchParamsConverter;
        this.f171082c = interfaceC35745a5;
    }

    @Override // com.avito.android.inline_filters.InterfaceC30996c
    @Y61.k
    public final I0 a(@Y61.k SearchParams searchParams, @Y61.l WidgetType widgetType, @Y61.l PresentationType presentationType, @Y61.l Boolean bool) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(SearchParamsConverter.DefaultImpls.convertToMap$default(this.f171081b, searchParams, null, false, presentationType, 6, null));
        if (bool != null) {
            linkedHashMap.put(SearchParamsConverterKt.TRUNCATE_TO_SUBTREE, bool.toString());
        }
        io.reactivex.rxjava3.internal.operators.observable.F f12 = new io.reactivex.rxjava3.internal.operators.observable.F(new com.avito.android.advert.deeplinks.delivery.p(widgetType, this, linkedHashMap, 8));
        InterfaceC35745a5 interfaceC35745a5 = this.f171082c;
        return f12.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e());
    }
}
