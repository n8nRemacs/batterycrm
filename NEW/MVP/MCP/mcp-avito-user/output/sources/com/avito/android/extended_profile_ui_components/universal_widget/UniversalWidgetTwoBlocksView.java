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
import androidx.appcompat.app.r;
import com.avito.android.R;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetTwoBlocksView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetTwoBlocksView;", "Landroid/widget/LinearLayout;", "UniversalWidgetTwoBlocksState", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UniversalWidgetTwoBlocksView extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UniversalWidgetBlockView f153635b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UniversalWidgetBlockView f153636c;

    /* compiled from: UniversalWidgetTwoBlocksView.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetTwoBlocksView$UniversalWidgetTwoBlocksState;", "Landroid/os/Parcelable;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetTwoBlocksState implements Parcelable {

        @k
        public static final Parcelable.Creator<UniversalWidgetTwoBlocksState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UniversalWidgetBlockView.UniversalWidgetBlockState f153637b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UniversalWidgetBlockView.UniversalWidgetBlockState f153638c;

        /* renamed from: d, reason: collision with root package name */
        public final int f153639d;

        /* compiled from: UniversalWidgetTwoBlocksView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UniversalWidgetTwoBlocksState> {
            @Override // android.os.Parcelable.Creator
            public final UniversalWidgetTwoBlocksState createFromParcel(Parcel parcel) {
                Parcelable.Creator<UniversalWidgetBlockView.UniversalWidgetBlockState> creator = UniversalWidgetBlockView.UniversalWidgetBlockState.CREATOR;
                return new UniversalWidgetTwoBlocksState(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final UniversalWidgetTwoBlocksState[] newArray(int i12) {
                return new UniversalWidgetTwoBlocksState[i12];
            }
        }

        public UniversalWidgetTwoBlocksState(@k UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState, @k UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState2, int i12) {
            this.f153637b = universalWidgetBlockState;
            this.f153638c = universalWidgetBlockState2;
            this.f153639d = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UniversalWidgetTwoBlocksState)) {
                return false;
            }
            UniversalWidgetTwoBlocksState universalWidgetTwoBlocksState = (UniversalWidgetTwoBlocksState) obj;
            return L.f(this.f153637b, universalWidgetTwoBlocksState.f153637b) && L.f(this.f153638c, universalWidgetTwoBlocksState.f153638c) && this.f153639d == universalWidgetTwoBlocksState.f153639d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f153639d) + ((this.f153638c.hashCode() + (this.f153637b.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UniversalWidgetTwoBlocksState(topBlock=");
            sb2.append(this.f153637b);
            sb2.append(", bottomBlock=");
            sb2.append(this.f153638c);
            sb2.append(", verticalPaddingBetween=");
            return r.t(sb2, this.f153639d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f153637b.writeToParcel(parcel, i12);
            this.f153638c.writeToParcel(parcel, i12);
            parcel.writeInt(this.f153639d);
        }
    }

    public UniversalWidgetTwoBlocksView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(context).inflate(R.layout.universal_widget_two_blocks_view, (ViewGroup) this, true);
        this.f153635b = (UniversalWidgetBlockView) getRootView().findViewById(R.id.universal_widget_two_blocks_top_block);
        this.f153636c = (UniversalWidgetBlockView) getRootView().findViewById(R.id.universal_widget_two_blocks_bottom_block);
    }
}
