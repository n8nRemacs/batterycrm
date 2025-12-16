package com.avito.android.extended_profile_widgets.adapter.categorizer.adapter;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategorizerSnippetItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/categorizer/adapter/CategorizerSnippetItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CategorizerSnippetItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<CategorizerSnippetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154316b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f154317c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f154318d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f154319e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalImage f154320f;

    /* compiled from: CategorizerSnippetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategorizerSnippetItem> {
        @Override // android.os.Parcelable.Creator
        public final CategorizerSnippetItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            return new CategorizerSnippetItem(string, (DeepLink) parcel.readParcelable(CategorizerSnippetItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(CategorizerSnippetItem.class.getClassLoader()), string2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CategorizerSnippetItem[] newArray(int i12) {
            return new CategorizerSnippetItem[i12];
        }
    }

    public CategorizerSnippetItem(@k String str, @k DeepLink deepLink, @l UniversalImage universalImage, @k String str2, @l String str3) {
        this.f154316b = str;
        this.f154317c = str2;
        this.f154318d = deepLink;
        this.f154319e = str3;
        this.f154320f = universalImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategorizerSnippetItem)) {
            return false;
        }
        CategorizerSnippetItem categorizerSnippetItem = (CategorizerSnippetItem) obj;
        return L.f(this.f154316b, categorizerSnippetItem.f154316b) && L.f(this.f154317c, categorizerSnippetItem.f154317c) && L.f(this.f154318d, categorizerSnippetItem.f154318d) && L.f(this.f154319e, categorizerSnippetItem.f154319e) && L.f(this.f154320f, categorizerSnippetItem.f154320f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return getF215842g().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF215842g() {
        return this.f154316b;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f154318d, H.d(this.f154316b.hashCode() * 31, 31, this.f154317c), 31);
        String str = this.f154319e;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        UniversalImage universalImage = this.f154320f;
        return iHashCode + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategorizerSnippetItem(stringId=");
        sb2.append(this.f154316b);
        sb2.append(", title=");
        sb2.append(this.f154317c);
        sb2.append(", uri=");
        sb2.append(this.f154318d);
        sb2.append(", backgroundColor=");
        sb2.append(this.f154319e);
        sb2.append(", icon=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f154320f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154316b);
        parcel.writeString(this.f154317c);
        parcel.writeParcelable(this.f154318d, i12);
        parcel.writeString(this.f154319e);
        parcel.writeParcelable(this.f154320f, i12);
    }
}
