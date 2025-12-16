package com.avito.android.extended_profile_ui_components.universal_widget;

import K51.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalWidgetCarouselPreviewView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetCarouselPreviewView;", "Landroid/widget/LinearLayout;", "UniversalWidgetCarouselPreviewState", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UniversalWidgetCarouselPreviewView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UniversalWidgetBlockView f153521b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UniversalWidgetBlockView f153522c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalWidgetBlockView f153523d;

    /* compiled from: UniversalWidgetCarouselPreviewView.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetCarouselPreviewView$UniversalWidgetCarouselPreviewState;", "Landroid/os/Parcelable;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetCarouselPreviewState implements Parcelable {

        @k
        public static final Parcelable.Creator<UniversalWidgetCarouselPreviewState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UniversalWidgetBlockView.UniversalWidgetBlockState f153524b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UniversalWidgetBlockView.UniversalWidgetBlockState f153525c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final UniversalWidgetBlockView.UniversalWidgetBlockState f153526d;

        /* compiled from: UniversalWidgetCarouselPreviewView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UniversalWidgetCarouselPreviewState> {
            @Override // android.os.Parcelable.Creator
            public final UniversalWidgetCarouselPreviewState createFromParcel(Parcel parcel) {
                Parcelable.Creator<UniversalWidgetBlockView.UniversalWidgetBlockState> creator = UniversalWidgetBlockView.UniversalWidgetBlockState.CREATOR;
                return new UniversalWidgetCarouselPreviewState(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final UniversalWidgetCarouselPreviewState[] newArray(int i12) {
                return new UniversalWidgetCarouselPreviewState[i12];
            }
        }

        public UniversalWidgetCarouselPreviewState(@k UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState, @k UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState2, @k UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState3) {
            this.f153524b = universalWidgetBlockState;
            this.f153525c = universalWidgetBlockState2;
            this.f153526d = universalWidgetBlockState3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UniversalWidgetCarouselPreviewState)) {
                return false;
            }
            UniversalWidgetCarouselPreviewState universalWidgetCarouselPreviewState = (UniversalWidgetCarouselPreviewState) obj;
            return L.f(this.f153524b, universalWidgetCarouselPreviewState.f153524b) && L.f(this.f153525c, universalWidgetCarouselPreviewState.f153525c) && L.f(this.f153526d, universalWidgetCarouselPreviewState.f153526d);
        }

        public final int hashCode() {
            return this.f153526d.hashCode() + ((this.f153525c.hashCode() + (this.f153524b.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "UniversalWidgetCarouselPreviewState(firstBlock=" + this.f153524b + ", secondBlock=" + this.f153525c + ", thirdBlock=" + this.f153526d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f153524b.writeToParcel(parcel, i12);
            this.f153525c.writeToParcel(parcel, i12);
            this.f153526d.writeToParcel(parcel, i12);
        }
    }

    public UniversalWidgetCarouselPreviewView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(context).inflate(R.layout.universal_widget_carousel_preview_view, (ViewGroup) this, true);
        this.f153521b = (UniversalWidgetBlockView) getRootView().findViewById(R.id.universal_widget_carousel_preview_first_block);
        this.f153522c = (UniversalWidgetBlockView) getRootView().findViewById(R.id.universal_widget_carousel_preview_second_block);
        this.f153523d = (UniversalWidgetBlockView) getRootView().findViewById(R.id.universal_widget_carousel_preview_third_block);
    }
}
