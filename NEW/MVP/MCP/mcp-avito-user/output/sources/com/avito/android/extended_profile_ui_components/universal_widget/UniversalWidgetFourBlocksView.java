package com.avito.android.extended_profile_ui_components.universal_widget;

import X41.j;
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
import com.avito.android.advert.item.compatibility.v2.m;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: UniversalWidgetFourBlocksView.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\tJ!\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetFourBlocksView;", "Landroid/widget/LinearLayout;", "Lkotlin/Function1;", "", "Lkotlin/G0;", "action", "setOnRemoveClickListener", "(LY41/l;)V", "setOnBlockClickListener", "UniversalWidgetFourBlocksState", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UniversalWidgetFourBlocksView extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f153527g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UniversalWidgetBlockView f153528b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UniversalWidgetBlockView f153529c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalWidgetBlockView f153530d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UniversalWidgetBlockView f153531e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ViewGroup f153532f;

    /* compiled from: UniversalWidgetFourBlocksView.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/universal_widget/UniversalWidgetFourBlocksView$UniversalWidgetFourBlocksState;", "Landroid/os/Parcelable;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UniversalWidgetFourBlocksState implements Parcelable {

        @k
        public static final Parcelable.Creator<UniversalWidgetFourBlocksState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UniversalWidgetBlockView.UniversalWidgetBlockState f153533b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UniversalWidgetBlockView.UniversalWidgetBlockState f153534c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final UniversalWidgetBlockView.UniversalWidgetBlockState f153535d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final UniversalWidgetBlockView.UniversalWidgetBlockState f153536e;

        /* renamed from: f, reason: collision with root package name */
        public final int f153537f;

        /* compiled from: UniversalWidgetFourBlocksView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UniversalWidgetFourBlocksState> {
            @Override // android.os.Parcelable.Creator
            public final UniversalWidgetFourBlocksState createFromParcel(Parcel parcel) {
                Parcelable.Creator<UniversalWidgetBlockView.UniversalWidgetBlockState> creator = UniversalWidgetBlockView.UniversalWidgetBlockState.CREATOR;
                return new UniversalWidgetFourBlocksState(creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final UniversalWidgetFourBlocksState[] newArray(int i12) {
                return new UniversalWidgetFourBlocksState[i12];
            }
        }

        public UniversalWidgetFourBlocksState(@k UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState, @k UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState2, @k UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState3, @k UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState4, int i12) {
            this.f153533b = universalWidgetBlockState;
            this.f153534c = universalWidgetBlockState2;
            this.f153535d = universalWidgetBlockState3;
            this.f153536e = universalWidgetBlockState4;
            this.f153537f = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UniversalWidgetFourBlocksState)) {
                return false;
            }
            UniversalWidgetFourBlocksState universalWidgetFourBlocksState = (UniversalWidgetFourBlocksState) obj;
            return L.f(this.f153533b, universalWidgetFourBlocksState.f153533b) && L.f(this.f153534c, universalWidgetFourBlocksState.f153534c) && L.f(this.f153535d, universalWidgetFourBlocksState.f153535d) && L.f(this.f153536e, universalWidgetFourBlocksState.f153536e) && this.f153537f == universalWidgetFourBlocksState.f153537f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f153537f) + ((this.f153536e.hashCode() + ((this.f153535d.hashCode() + ((this.f153534c.hashCode() + (this.f153533b.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UniversalWidgetFourBlocksState(topLeftBlock=");
            sb2.append(this.f153533b);
            sb2.append(", topRightBlock=");
            sb2.append(this.f153534c);
            sb2.append(", bottomLeftBlock=");
            sb2.append(this.f153535d);
            sb2.append(", bottomRightBlock=");
            sb2.append(this.f153536e);
            sb2.append(", verticalPaddingBetween=");
            return r.t(sb2, this.f153537f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f153533b.writeToParcel(parcel, i12);
            this.f153534c.writeToParcel(parcel, i12);
            this.f153535d.writeToParcel(parcel, i12);
            this.f153536e.writeToParcel(parcel, i12);
            parcel.writeInt(this.f153537f);
        }
    }

    /* compiled from: UniversalWidgetFourBlocksView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f153538l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Integer, G0> lVar) {
            super(0);
            this.f153538l = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f153538l.invoke(0);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetFourBlocksView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f153539l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super Integer, G0> lVar) {
            super(0);
            this.f153539l = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f153539l.invoke(1);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetFourBlocksView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f153540l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super Integer, G0> lVar) {
            super(0);
            this.f153540l = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f153540l.invoke(2);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetFourBlocksView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f153541l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Y41.l<? super Integer, G0> lVar) {
            super(0);
            this.f153541l = lVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f153541l.invoke(3);
            return G0.f406611a;
        }
    }

    @j
    public UniversalWidgetFourBlocksView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void a(@k UniversalWidgetFourBlocksState universalWidgetFourBlocksState) {
        this.f153528b.g(universalWidgetFourBlocksState.f153533b);
        this.f153529c.g(universalWidgetFourBlocksState.f153534c);
        this.f153530d.g(universalWidgetFourBlocksState.f153535d);
        this.f153531e.g(universalWidgetFourBlocksState.f153536e);
        D6.c(this.f153532f, null, null, null, Integer.valueOf(universalWidgetFourBlocksState.f153537f), 7);
    }

    public final void setOnBlockClickListener(@k Y41.l<? super Integer, G0> action) {
        this.f153528b.setOnClickListener(new m(24, action));
        this.f153529c.setOnClickListener(new m(25, action));
        this.f153530d.setOnClickListener(new m(26, action));
        this.f153531e.setOnClickListener(new m(27, action));
    }

    public final void setOnRemoveClickListener(@k Y41.l<? super Integer, G0> action) {
        this.f153528b.setOnRemoveClickListener(new a(action));
        this.f153529c.setOnRemoveClickListener(new b(action));
        this.f153530d.setOnRemoveClickListener(new c(action));
        this.f153531e.setOnRemoveClickListener(new d(action));
    }

    public UniversalWidgetFourBlocksView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(context).inflate(R.layout.universal_widget_four_blocks_view, (ViewGroup) this, true);
        this.f153528b = (UniversalWidgetBlockView) getRootView().findViewById(R.id.universal_widget_four_blocks_top_left_block);
        this.f153529c = (UniversalWidgetBlockView) getRootView().findViewById(R.id.universal_widget_four_blocks_top_right_block);
        this.f153530d = (UniversalWidgetBlockView) getRootView().findViewById(R.id.universal_widget_four_blocks_bottom_left_block);
        this.f153531e = (UniversalWidgetBlockView) getRootView().findViewById(R.id.universal_widget_four_blocks_bottom_right_block);
        this.f153532f = (ViewGroup) getRootView().findViewById(R.id.universal_widget_four_blocks_top_block);
    }
}
