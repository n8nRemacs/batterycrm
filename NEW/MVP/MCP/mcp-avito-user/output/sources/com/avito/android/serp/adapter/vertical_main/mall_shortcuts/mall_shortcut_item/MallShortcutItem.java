package com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MallShortcutItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/mall_shortcut_item/MallShortcutItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Layout", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MallShortcutItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<MallShortcutItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f272999b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f273000c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f273001d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f273002e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Layout f273003f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final UniversalColor f273004g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final UniversalImage f273005h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MallShortcutItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/mall_shortcut_item/MallShortcutItem$Layout;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Layout {

        /* renamed from: b, reason: collision with root package name */
        public static final Layout f273006b;

        /* renamed from: c, reason: collision with root package name */
        public static final Layout f273007c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Layout[] f273008d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f273009e;

        static {
            Layout layout = new Layout("Small", 0);
            f273006b = layout;
            Layout layout2 = new Layout("Large", 1);
            f273007c = layout2;
            Layout[] layoutArr = {layout, layout2};
            f273008d = layoutArr;
            f273009e = kotlin.enums.c.a(layoutArr);
        }

        public Layout() {
            throw null;
        }

        public static Layout valueOf(String str) {
            return (Layout) Enum.valueOf(Layout.class, str);
        }

        public static Layout[] values() {
            return (Layout[]) f273008d.clone();
        }
    }

    /* compiled from: MallShortcutItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MallShortcutItem> {
        @Override // android.os.Parcelable.Creator
        public final MallShortcutItem createFromParcel(Parcel parcel) {
            return new MallShortcutItem((AttributedText) parcel.readParcelable(MallShortcutItem.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(MallShortcutItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(MallShortcutItem.class.getClassLoader()), Layout.valueOf(parcel.readString()), (UniversalColor) parcel.readParcelable(MallShortcutItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(MallShortcutItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MallShortcutItem[] newArray(int i12) {
            return new MallShortcutItem[i12];
        }
    }

    public MallShortcutItem(@k AttributedText attributedText, @k String str, @k DeepLink deepLink, @l AttributedText attributedText2, @k Layout layout, @k UniversalColor universalColor, @l UniversalImage universalImage) {
        this.f272999b = attributedText;
        this.f273000c = str;
        this.f273001d = deepLink;
        this.f273002e = attributedText2;
        this.f273003f = layout;
        this.f273004g = universalColor;
        this.f273005h = universalImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallShortcutItem)) {
            return false;
        }
        MallShortcutItem mallShortcutItem = (MallShortcutItem) obj;
        return L.f(this.f272999b, mallShortcutItem.f272999b) && L.f(this.f273000c, mallShortcutItem.f273000c) && L.f(this.f273001d, mallShortcutItem.f273001d) && L.f(this.f273002e, mallShortcutItem.f273002e) && this.f273003f == mallShortcutItem.f273003f && L.f(this.f273004g, mallShortcutItem.f273004g) && L.f(this.f273005h, mallShortcutItem.f273005h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF270893b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF273000c() {
        return this.f273000c;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f273001d, H.d(this.f272999b.hashCode() * 31, 31, this.f273000c), 31);
        AttributedText attributedText = this.f273002e;
        int i12 = com.avito.android.actions_sheet.a.i(this.f273004g, (this.f273003f.hashCode() + ((iE2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31, 31);
        UniversalImage universalImage = this.f273005h;
        return i12 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MallShortcutItem(title=");
        sb2.append(this.f272999b);
        sb2.append(", stringId=");
        sb2.append(this.f273000c);
        sb2.append(", uri=");
        sb2.append(this.f273001d);
        sb2.append(", titleWithTransfer=");
        sb2.append(this.f273002e);
        sb2.append(", layout=");
        sb2.append(this.f273003f);
        sb2.append(", backgroundColor=");
        sb2.append(this.f273004g);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f273005h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f272999b, i12);
        parcel.writeString(this.f273000c);
        parcel.writeParcelable(this.f273001d, i12);
        parcel.writeParcelable(this.f273002e, i12);
        parcel.writeString(this.f273003f.name());
        parcel.writeParcelable(this.f273004g, i12);
        parcel.writeParcelable(this.f273005h, i12);
    }

    public /* synthetic */ MallShortcutItem(AttributedText attributedText, String str, DeepLink deepLink, AttributedText attributedText2, Layout layout, UniversalColor universalColor, UniversalImage universalImage, int i12, C42822w c42822w) {
        this(attributedText, (i12 & 2) != 0 ? attributedText.getText() : str, deepLink, attributedText2, layout, universalColor, universalImage);
    }
}
