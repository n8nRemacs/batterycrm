package com.avito.android.imv_similiar_adverts.item.header;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: ImvHeaderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/item/header/ImvHeaderItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class ImvHeaderItem implements PersistableSerpItem {

    @k
    public static final Parcelable.Creator<ImvHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f170863b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f170864c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f170865d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f170866e;

    /* renamed from: f, reason: collision with root package name */
    public final int f170867f;

    /* compiled from: ImvHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final ImvHeaderItem createFromParcel(Parcel parcel) {
            return new ImvHeaderItem(parcel.readString(), (AttributedText) parcel.readParcelable(ImvHeaderItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(ImvHeaderItem.class.getClassLoader()), SerpViewType.valueOf(parcel.readString()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ImvHeaderItem[] newArray(int i12) {
            return new ImvHeaderItem[i12];
        }
    }

    public ImvHeaderItem(@k String str, @k AttributedText attributedText, @l AttributedText attributedText2, @k SerpViewType serpViewType, int i12) {
        this.f170863b = str;
        this.f170864c = attributedText;
        this.f170865d = attributedText2;
        this.f170866e = serpViewType;
        this.f170867f = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF68263k() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF152637c() {
        return this.f170867f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF163033b() {
        return this.f170863b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF157924d() {
        return this.f170866e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f170863b);
        parcel.writeParcelable(this.f170864c, i12);
        parcel.writeParcelable(this.f170865d, i12);
        parcel.writeString(this.f170866e.name());
        parcel.writeInt(this.f170867f);
    }
}
