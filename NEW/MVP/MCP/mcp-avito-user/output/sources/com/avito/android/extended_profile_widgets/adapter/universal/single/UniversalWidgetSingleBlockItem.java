package com.avito.android.extended_profile_widgets.adapter.universal.single;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetSingleBlockItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/universal/single/UniversalWidgetSingleBlockItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "ViewType", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class UniversalWidgetSingleBlockItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<UniversalWidgetSingleBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154988b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154989c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalWidgetBlockView.UniversalWidgetBlockState f154990d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ViewType f154991e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidgetSingleBlockItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/universal/single/UniversalWidgetSingleBlockItem$ViewType;", "", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ViewType {

        /* renamed from: b, reason: collision with root package name */
        public static final ViewType f154992b;

        /* renamed from: c, reason: collision with root package name */
        public static final ViewType f154993c;

        /* renamed from: d, reason: collision with root package name */
        public static final ViewType f154994d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ViewType[] f154995e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f154996f;

        static {
            ViewType viewType = new ViewType("FULL_WIDTH", 0);
            f154992b = viewType;
            ViewType viewType2 = new ViewType("FACTOID_CAROUSEL_ITEM", 1);
            f154993c = viewType2;
            ViewType viewType3 = new ViewType("IMAGE_CAROUSEL_ITEM", 2);
            f154994d = viewType3;
            ViewType[] viewTypeArr = {viewType, viewType2, viewType3};
            f154995e = viewTypeArr;
            f154996f = kotlin.enums.c.a(viewTypeArr);
        }

        public ViewType() {
            throw null;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) f154995e.clone();
        }
    }

    /* compiled from: UniversalWidgetSingleBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalWidgetSingleBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetSingleBlockItem createFromParcel(Parcel parcel) {
            return new UniversalWidgetSingleBlockItem(parcel.readString(), (GridElementType) parcel.readParcelable(UniversalWidgetSingleBlockItem.class.getClassLoader()), (UniversalWidgetBlockView.UniversalWidgetBlockState) parcel.readParcelable(UniversalWidgetSingleBlockItem.class.getClassLoader()), ViewType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalWidgetSingleBlockItem[] newArray(int i12) {
            return new UniversalWidgetSingleBlockItem[i12];
        }
    }

    public UniversalWidgetSingleBlockItem(@k String str, @k GridElementType gridElementType, @k UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState, @k ViewType viewType) {
        this.f154988b = str;
        this.f154989c = gridElementType;
        this.f154990d = universalWidgetBlockState;
        this.f154991e = viewType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalWidgetSingleBlockItem)) {
            return false;
        }
        UniversalWidgetSingleBlockItem universalWidgetSingleBlockItem = (UniversalWidgetSingleBlockItem) obj;
        return L.f(this.f154988b, universalWidgetSingleBlockItem.f154988b) && L.f(this.f154989c, universalWidgetSingleBlockItem.f154989c) && L.f(this.f154990d, universalWidgetSingleBlockItem.f154990d) && this.f154991e == universalWidgetSingleBlockItem.f154991e;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154235c() {
        return this.f154989c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF136260b() {
        return this.f154988b;
    }

    public final int hashCode() {
        return this.f154991e.hashCode() + ((this.f154990d.hashCode() + com.avito.android.bxcontent.mvi.entity.f.b(this.f154989c, this.f154988b.hashCode() * 31, 31)) * 31);
    }

    @k
    public final String toString() {
        return "UniversalWidgetSingleBlockItem(stringId=" + this.f154988b + ", gridType=" + this.f154989c + ", block=" + this.f154990d + ", viewType=" + this.f154991e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154988b);
        parcel.writeParcelable(this.f154989c, i12);
        parcel.writeParcelable(this.f154990d, i12);
        parcel.writeString(this.f154991e.name());
    }

    public /* synthetic */ UniversalWidgetSingleBlockItem(String str, GridElementType gridElementType, UniversalWidgetBlockView.UniversalWidgetBlockState universalWidgetBlockState, ViewType viewType, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, universalWidgetBlockState, (i12 & 8) != 0 ? ViewType.f154992b : viewType);
    }
}
