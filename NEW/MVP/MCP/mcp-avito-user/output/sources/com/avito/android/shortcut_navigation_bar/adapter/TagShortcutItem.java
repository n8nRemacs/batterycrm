package com.avito.android.shortcut_navigation_bar.adapter;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShortcutNavigationItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/TagShortcutItem;", "Lcom/avito/android/shortcut_navigation_bar/adapter/ShortcutNavigationItem;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TagShortcutItem extends ShortcutNavigationItem {

    @k
    public static final Parcelable.Creator<TagShortcutItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f283255b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f283256c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f283257d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final SectionTagPayload f283258e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Boolean f283259f;

    /* compiled from: ShortcutNavigationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TagShortcutItem> {
        @Override // android.os.Parcelable.Creator
        public final TagShortcutItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(TagShortcutItem.class.getClassLoader());
            SectionTagPayload sectionTagPayloadCreateFromParcel = parcel.readInt() == 0 ? null : SectionTagPayload.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TagShortcutItem(string, string2, deepLink, sectionTagPayloadCreateFromParcel, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final TagShortcutItem[] newArray(int i12) {
            return new TagShortcutItem[i12];
        }
    }

    public /* synthetic */ TagShortcutItem(String str, String str2, DeepLink deepLink, SectionTagPayload sectionTagPayload, Boolean bool, int i12, C42822w c42822w) {
        this(str, str2, deepLink, (i12 & 8) != 0 ? null : sectionTagPayload, (i12 & 16) != 0 ? null : bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem
    @l
    /* renamed from: getDeepLink, reason: from getter */
    public final DeepLink getF283257d() {
        return this.f283257d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF283255b() {
        return this.f283255b;
    }

    @Override // com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem
    @k
    /* renamed from: getText, reason: from getter */
    public final String getF283256c() {
        return this.f283256c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f283255b);
        parcel.writeString(this.f283256c);
        parcel.writeParcelable(this.f283257d, i12);
        SectionTagPayload sectionTagPayload = this.f283258e;
        if (sectionTagPayload == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sectionTagPayload.writeToParcel(parcel, i12);
        }
        Boolean bool = this.f283259f;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public TagShortcutItem(@k String str, @k String str2, @l DeepLink deepLink, @l SectionTagPayload sectionTagPayload, @l Boolean bool) {
        super(null);
        this.f283255b = str;
        this.f283256c = str2;
        this.f283257d = deepLink;
        this.f283258e = sectionTagPayload;
        this.f283259f = bool;
    }
}
