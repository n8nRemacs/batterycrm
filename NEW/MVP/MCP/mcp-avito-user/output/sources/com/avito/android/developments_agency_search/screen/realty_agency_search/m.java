package com.avito.android.developments_agency_search.screen.realty_agency_search;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.avito_map.icon_factory.AvitoMarkerIconFactoryKt;
import com.avito.android.developments_agency_search.domain.GetMapMarkersResponse;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import id.C41383a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyAgencySearchMapMarkerGenerator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/m;", "Lcom/avito/android/developments_agency_search/screen/realty_agency_search/l;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C41383a f138651a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f138652b = C42727D.c(b.f138654l);

    /* compiled from: RealtyAgencySearchMapMarkerGenerator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f138653a;

        static {
            int[] iArr = new int[GetMapMarkersResponse.Marker.Type.values().length];
            try {
                iArr[GetMapMarkersResponse.Marker.Type.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetMapMarkersResponse.Marker.Type.SMALL_PIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GetMapMarkersResponse.Marker.Type.MEDIUM_PIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f138653a = iArr;
        }
    }

    /* compiled from: RealtyAgencySearchMapMarkerGenerator.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Bitmap;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Bitmap> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f138654l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Bitmap invoke() {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }
    }

    @Inject
    public m(@Y61.k C41383a c41383a) {
        this.f138651a = c41383a;
    }

    @Override // com.avito.android.developments_agency_search.screen.realty_agency_search.l
    @Y61.k
    public final Bitmap a(@Y61.k GetMapMarkersResponse.Marker marker, boolean z12) {
        Activity activity = this.f138651a.get();
        if (activity == null) {
            return (Bitmap) this.f138652b.getValue();
        }
        ContextThemeWrapper contextThemeWrapperB = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, activity, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
        if (z12) {
            View viewInflate = View.inflate(contextThemeWrapperB, R.layout.agency_search_map_selected_medium_pin, null);
            View viewFindViewById = viewInflate.findViewById(R.id.content);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            float fB2 = y6.b(14);
            Ow.f.a(viewFindViewById, fB2, fB2, fB2, fB2, C35835l0.e(R.attr.black, viewInflate.getContext()));
            View viewFindViewById2 = viewInflate.findViewById(R.id.price);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById2).setText(b(marker));
            View viewFindViewById3 = viewInflate.findViewById(R.id.development);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById3).setText(marker.getSubtitle());
            return AvitoMarkerIconFactoryKt.toBitmap(viewInflate);
        }
        int i12 = a.f138653a[marker.getType().ordinal()];
        if (i12 == 1) {
            return AvitoMarkerIconFactoryKt.toBitmap(View.inflate(contextThemeWrapperB, R.layout.agency_search_map_point_pin, null));
        }
        if (i12 == 2) {
            View viewInflate2 = View.inflate(contextThemeWrapperB, R.layout.agency_search_map_small_pin, null);
            View viewFindViewById4 = viewInflate2.findViewById(R.id.content);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            float fB3 = y6.b(16);
            Ow.f.a(viewFindViewById4, fB3, fB3, fB3, fB3, viewInflate2.getContext().getColorStateList(R.color.agency_search_map_pin_color));
            View viewFindViewById5 = viewInflate2.findViewById(R.id.price);
            if (viewFindViewById5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById5).setText(b(marker));
            return AvitoMarkerIconFactoryKt.toBitmap(viewInflate2);
        }
        if (i12 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        View viewInflate3 = View.inflate(contextThemeWrapperB, R.layout.agency_search_map_medium_pin, null);
        View viewFindViewById6 = viewInflate3.findViewById(R.id.content);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        float fB4 = y6.b(14);
        Ow.f.a(viewFindViewById6, fB4, fB4, fB4, fB4, viewInflate3.getContext().getColorStateList(R.color.agency_search_map_pin_color));
        View viewFindViewById7 = viewInflate3.findViewById(R.id.price);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById7).setText(b(marker));
        View viewFindViewById8 = viewInflate3.findViewById(R.id.development);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById8).setText(marker.getSubtitle());
        return AvitoMarkerIconFactoryKt.toBitmap(viewInflate3);
    }

    public final SpannableStringBuilder b(GetMapMarkersResponse.Marker marker) {
        Activity activity = this.f138651a.get();
        if (activity == null) {
            return new SpannableStringBuilder();
        }
        ContextThemeWrapper contextThemeWrapperB = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, activity, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) marker.getTitle());
        if (marker.isResidentialComplexCompleted()) {
            SpannableStringBuilder spannableStringBuilderAppend2 = spannableStringBuilderAppend.append((CharSequence) " ");
            FV.a.f4720a.getClass();
            spannableStringBuilderAppend2.append(FV.a.b(R.attr.textIconKey, contextThemeWrapperB));
        }
        return spannableStringBuilderAppend;
    }
}
