package com.avito.android.favorites.adapter.group_card;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorites.adapter.FavoriteListItem;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: GroupCardItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/group_card/GroupCardItem;", "Lcom/avito/android/favorites/adapter/FavoriteListItem;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GroupCardItem implements FavoriteListItem {

    @Y61.k
    public static final Parcelable.Creator<GroupCardItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f156570b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f156571c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f156572d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f156573e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final DeepLink f156574f;

    /* compiled from: GroupCardItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GroupCardItem> {
        @Override // android.os.Parcelable.Creator
        public final GroupCardItem createFromParcel(Parcel parcel) {
            return new GroupCardItem(parcel.readString(), (AttributedText) parcel.readParcelable(GroupCardItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(GroupCardItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(GroupCardItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(GroupCardItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GroupCardItem[] newArray(int i12) {
            return new GroupCardItem[i12];
        }
    }

    public GroupCardItem(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.l UniversalImage universalImage, @Y61.l DeepLink deepLink) {
        this.f156570b = str;
        this.f156571c = attributedText;
        this.f156572d = attributedText2;
        this.f156573e = universalImage;
        this.f156574f = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF162211b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154918b() {
        return this.f156570b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f156570b);
        parcel.writeParcelable(this.f156571c, i12);
        parcel.writeParcelable(this.f156572d, i12);
        parcel.writeParcelable(this.f156573e, i12);
        parcel.writeParcelable(this.f156574f, i12);
    }
}
