package com.avito.android.shift_list.ui.list.shift_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig_snippet.list.snippet.GigShiftSnippetButton;
import com.avito.android.gig_snippet.list.snippet.GigShiftSnippetHeader;
import com.avito.android.gig_snippet.list.snippet.GigShiftSnippetTimer;
import kotlin.Metadata;

/* compiled from: ShiftItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/shift_list/ui/list/shift_item/ShiftItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShiftItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<ShiftItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f281115b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f281116c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f281117d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f281118e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final GigShiftSnippetTimer f281119f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f281120g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f281121h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f281122i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final GigShiftSnippetButton f281123j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final GigShiftSnippetButton f281124k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final GigShiftSnippetHeader f281125l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f281126m;

    /* compiled from: ShiftItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ShiftItem> {
        @Override // android.os.Parcelable.Creator
        public final ShiftItem createFromParcel(Parcel parcel) {
            return new ShiftItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ShiftItem.class.getClassLoader()), parcel.readString(), (GigShiftSnippetTimer) parcel.readParcelable(ShiftItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (GigShiftSnippetButton) parcel.readParcelable(ShiftItem.class.getClassLoader()), (GigShiftSnippetButton) parcel.readParcelable(ShiftItem.class.getClassLoader()), (GigShiftSnippetHeader) parcel.readParcelable(ShiftItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ShiftItem[] newArray(int i12) {
            return new ShiftItem[i12];
        }
    }

    public ShiftItem(@k String str, @k String str2, @k DeepLink deepLink, @k String str3, @l GigShiftSnippetTimer gigShiftSnippetTimer, @k String str4, @l String str5, @k String str6, @l GigShiftSnippetButton gigShiftSnippetButton, @l GigShiftSnippetButton gigShiftSnippetButton2, @l GigShiftSnippetHeader gigShiftSnippetHeader, boolean z12) {
        this.f281115b = str;
        this.f281116c = str2;
        this.f281117d = deepLink;
        this.f281118e = str3;
        this.f281119f = gigShiftSnippetTimer;
        this.f281120g = str4;
        this.f281121h = str5;
        this.f281122i = str6;
        this.f281123j = gigShiftSnippetButton;
        this.f281124k = gigShiftSnippetButton2;
        this.f281125l = gigShiftSnippetHeader;
        this.f281126m = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return getF16716b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF16716b() {
        return this.f281115b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f281115b);
        parcel.writeString(this.f281116c);
        parcel.writeParcelable(this.f281117d, i12);
        parcel.writeString(this.f281118e);
        parcel.writeParcelable(this.f281119f, i12);
        parcel.writeString(this.f281120g);
        parcel.writeString(this.f281121h);
        parcel.writeString(this.f281122i);
        parcel.writeParcelable(this.f281123j, i12);
        parcel.writeParcelable(this.f281124k, i12);
        parcel.writeParcelable(this.f281125l, i12);
        parcel.writeInt(this.f281126m ? 1 : 0);
    }
}
