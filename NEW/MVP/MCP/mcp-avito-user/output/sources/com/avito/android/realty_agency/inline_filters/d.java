package com.avito.android.realty_agency.inline_filters;

import android.app.Activity;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import com.avito.android.B2;
import com.avito.android.inline_filters.dialog.InterfaceC30999b;
import com.avito.android.remote.model.search.WidgetType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyAgencyDialogFactory.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/d;", "Lcom/avito/android/inline_filters/dialog/b;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements InterfaceC30999b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Activity f251512a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B2 f251513b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FragmentManager f251514c;

    /* compiled from: RealtyAgencyDialogFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f251515a;

        static {
            int[] iArr = new int[WidgetType.values().length];
            try {
                iArr[WidgetType.NumericRange.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetType.Multiselect.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WidgetType.Quarters.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WidgetType.District.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f251515a = iArr;
        }
    }

    @Inject
    public d(@Y61.k Activity activity, @Y61.k B2 b22) {
        this.f251512a = activity;
        this.f251513b = b22;
        this.f251514c = ((ActivityC22955m) activity).getSupportFragmentManager();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    @Override // com.avito.android.inline_filters.dialog.InterfaceC30999b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.inline_filters.dialog.AbstractC30998a<com.avito.android.inline_filters.dialog.E> a(@Y61.l androidx.fragment.app.Fragment r32, @Y61.k com.avito.android.remote.model.search.Filter r33, @Y61.k java.util.List<com.avito.android.inline_filters.dialog.select.adapter.i> r34, @Y61.l android.os.Parcelable r35, @Y61.l com.avito.android.remote.model.SearchParams r36, @Y61.l com.avito.android.inline_filters.InterfaceC30995b r37, @Y61.l com.avito.android.inline_filters.W r38, @Y61.l com.avito.android.inline_filters.InterfaceC31046f r39, @Y61.l com.avito.android.location.r r40, @Y61.l CN.f r41, @Y61.l com.avito.android.deeplink_handler.handler.composite.a r42, @Y61.l com.avito.android.remote.model.PresentationType r43, @Y61.l java.util.Map<java.lang.String, java.lang.String> r44, @Y61.l com.avito.android.inline_filters.dialog.InlineFilterDialogOpener.Source r45, @Y61.k Y41.p<? super com.avito.android.remote.model.search.Filter, ? super com.avito.android.remote.model.search.InlineFilterValue, kotlin.G0> r46, @Y61.l Y41.l<? super com.avito.android.inline_filters.dialog.location_group.LocationGroupFilterData, kotlin.G0> r47, @Y61.k Y41.p<? super com.avito.android.deep_linking.links.DeepLink, ? super java.lang.Boolean, kotlin.G0> r48, @Y61.l Y41.p<? super com.avito.android.deep_linking.links.DeepLink, ? super java.lang.Boolean, kotlin.G0> r49, @Y61.k Y41.a<kotlin.G0> r50, @Y61.k Y41.l<? super java.lang.Integer, kotlin.G0> r51, @Y61.l Y41.l<? super java.lang.Integer, kotlin.G0> r52, @Y61.l com.avito.android.remote.model.metro_lines.MetroResponseBody r53, @Y61.l com.avito.android.inline_filters.InlineFiltersCommonViewInfo r54, @Y61.l java.lang.String r55, @Y61.l java.lang.String r56, @Y61.l com.avito.android.remote.model.search.Filter r57, @Y61.l com.avito.android.remote.model.search.Filter r58, @Y61.l Y41.l<? super java.util.List<? extends kotlin.Q<com.avito.android.remote.model.search.Filter, ? extends com.avito.android.remote.model.search.InlineFilterValue>>, kotlin.G0> r59) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.realty_agency.inline_filters.d.a(androidx.fragment.app.Fragment, com.avito.android.remote.model.search.Filter, java.util.List, android.os.Parcelable, com.avito.android.remote.model.SearchParams, com.avito.android.inline_filters.b, com.avito.android.inline_filters.W, com.avito.android.inline_filters.f, com.avito.android.location.r, CN.f, com.avito.android.deeplink_handler.handler.composite.a, com.avito.android.remote.model.PresentationType, java.util.Map, com.avito.android.inline_filters.dialog.InlineFilterDialogOpener$Source, Y41.p, Y41.l, Y41.p, Y41.p, Y41.a, Y41.l, Y41.l, com.avito.android.remote.model.metro_lines.MetroResponseBody, com.avito.android.inline_filters.InlineFiltersCommonViewInfo, java.lang.String, java.lang.String, com.avito.android.remote.model.search.Filter, com.avito.android.remote.model.search.Filter, Y41.l):com.avito.android.inline_filters.dialog.a");
    }
}
