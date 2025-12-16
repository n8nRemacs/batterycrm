package com.avito.android.user_advert.advert.items.parameters;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MyAdvertParameterItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/parameters/MyAdvertParameterItem;", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MyAdvertParameterItem implements PersistableSpannedItem {

    @k
    public static final Parcelable.Creator<MyAdvertParameterItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f309766b;

    /* renamed from: c, reason: collision with root package name */
    public final int f309767c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f309768d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f309769e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalColor f309770f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AdvertParameters.Button f309771g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f309772h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final DeepLink f309773i;

    /* compiled from: MyAdvertParameterItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MyAdvertParameterItem> {
        @Override // android.os.Parcelable.Creator
        public final MyAdvertParameterItem createFromParcel(Parcel parcel) {
            return new MyAdvertParameterItem(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(MyAdvertParameterItem.class.getClassLoader()), (AdvertParameters.Button) parcel.readParcelable(MyAdvertParameterItem.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(MyAdvertParameterItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MyAdvertParameterItem[] newArray(int i12) {
            return new MyAdvertParameterItem[i12];
        }
    }

    public MyAdvertParameterItem(@k String str, int i12, @k String str2, @k String str3, @l UniversalColor universalColor, @l AdvertParameters.Button button, @l String str4, @l DeepLink deepLink) {
        this.f309766b = str;
        this.f309767c = i12;
        this.f309768d = str2;
        this.f309769e = str3;
        this.f309770f = universalColor;
        this.f309771g = button;
        this.f309772h = str4;
        this.f309773i = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85018q() {
        return this.f309767c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF236852b() {
        return this.f309766b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f309766b);
        parcel.writeInt(this.f309767c);
        parcel.writeString(this.f309768d);
        parcel.writeString(this.f309769e);
        parcel.writeParcelable(this.f309770f, i12);
        parcel.writeParcelable(this.f309771g, i12);
        parcel.writeString(this.f309772h);
        parcel.writeParcelable(this.f309773i, i12);
    }

    public /* synthetic */ MyAdvertParameterItem(String str, int i12, String str2, String str3, UniversalColor universalColor, AdvertParameters.Button button, String str4, DeepLink deepLink, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? 0 : i12, str2, str3, universalColor, button, str4, deepLink);
    }
}
