package com.avito.android.realty_agency.inline_filters;

import Y41.p;
import android.app.Activity;
import com.avito.android.realty_agency.inline_filters_public.generated.api.api_2_nd_trx_developments_suggest_post.DevelopmentSuggestV1Suggest;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.WidgetType;
import hi0.C40944a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oi0.C44783b;

/* compiled from: InlineFilterBottomSheetFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/b;", "Lcom/avito/android/realty_agency/inline_filters/a;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.realty_agency.inline_filters.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Activity f251505a;

    /* compiled from: InlineFilterBottomSheetFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f251506a;

        static {
            int[] iArr = new int[WidgetType.values().length];
            try {
                iArr[WidgetType.Location.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetType.SuggestLocation.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f251506a = iArr;
        }
    }

    /* compiled from: InlineFilterBottomSheetFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters_public/generated/api/api_2_nd_trx_developments_suggest_post/DevelopmentSuggestV1Suggest;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/realty_agency/inline_filters_public/generated/api/api_2_nd_trx_developments_suggest_post/DevelopmentSuggestV1Suggest;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.realty_agency.inline_filters.b$b, reason: collision with other inner class name */
    public static final class C7544b extends N implements Y41.l<DevelopmentSuggestV1Suggest, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f251507l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Filter f251508m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7544b(p<? super Filter, ? super InlineFilterValue, G0> pVar, Filter filter) {
            super(1);
            this.f251507l = (N) pVar;
            this.f251508m = filter;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.p, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(DevelopmentSuggestV1Suggest developmentSuggestV1Suggest) {
            this.f251507l.invoke(this.f251508m, C40944a.a(developmentSuggestV1Suggest));
            return G0.f406611a;
        }
    }

    /* compiled from: InlineFilterBottomSheetFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loi0/b;", "location", "Lkotlin/G0;", "invoke", "(Loi0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C44783b, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Filter f251509l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f251510m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(p pVar, Filter filter) {
            super(1);
            this.f251509l = filter;
            this.f251510m = (N) pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v5, types: [com.avito.android.remote.model.search.InlineFilterValue$InlineFilterSuggestLocationValue] */
        /* JADX WARN: Type inference failed for: r6v3, types: [Y41.p, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(C44783b c44783b) {
            C44783b c44783b2 = c44783b;
            Filter filter = this.f251509l;
            Filter.Widget widget = filter.getWidget();
            this.f251510m.invoke(filter, (widget != null ? widget.getType() : null) == WidgetType.SuggestLocation ? new InlineFilterValue.InlineFilterSuggestLocationValue(String.valueOf(c44783b2.getId()), null, 2, false ? 1 : 0) : new InlineFilterValue.InlineFilterLocationValue(String.valueOf(c44783b2.getId())));
            return G0.f406611a;
        }
    }

    @Inject
    public b(@Y61.k Activity activity) {
        this.f251505a = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    @Override // com.avito.android.realty_agency.inline_filters.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.lib.design.bottom_sheet.d a(@Y61.k com.avito.android.remote.model.search.Filter r11, @Y61.l com.avito.android.remote.model.SearchParams r12, @Y61.k Y41.p<? super com.avito.android.remote.model.search.Filter, ? super com.avito.android.remote.model.search.InlineFilterValue, kotlin.G0> r13, @Y61.k Y41.a<kotlin.G0> r14) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.realty_agency.inline_filters.b.a(com.avito.android.remote.model.search.Filter, com.avito.android.remote.model.SearchParams, Y41.p, Y41.a):com.avito.android.lib.design.bottom_sheet.d");
    }
}
