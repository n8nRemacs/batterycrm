package com.avito.android.serp.adapter.empty_placeholder;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.PlaceholderAction;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: EmptyPlaceholderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/empty_placeholder/EmptyPlaceholderItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyPlaceholderItem implements PersistableSerpItem {

    @Y61.k
    public static final Parcelable.Creator<EmptyPlaceholderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f269899b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f269900c;

    /* renamed from: d, reason: collision with root package name */
    public final int f269901d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f269902e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f269903f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final List<PlaceholderAction> f269904g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f269905h = SerpViewType.f268585e;

    /* compiled from: EmptyPlaceholderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EmptyPlaceholderItem> {
        @Override // android.os.Parcelable.Creator
        public final EmptyPlaceholderItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(EmptyPlaceholderItem.class, parcel, arrayList, iL2, 1);
                }
            }
            return new EmptyPlaceholderItem(j12, string, i12, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final EmptyPlaceholderItem[] newArray(int i12) {
            return new EmptyPlaceholderItem[i12];
        }
    }

    public EmptyPlaceholderItem(long j12, @Y61.k String str, int i12, @Y61.k String str2, @Y61.k String str3, @Y61.l List<PlaceholderAction> list) {
        this.f269899b = j12;
        this.f269900c = str;
        this.f269901d = i12;
        this.f269902e = str2;
        this.f269903f = str3;
        this.f269904g = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF80342e() {
        return this.f269899b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80344g() {
        return this.f269901d;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF238671b() {
        return this.f269900c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF80346i() {
        return this.f269905h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f269899b);
        parcel.writeString(this.f269900c);
        parcel.writeInt(this.f269901d);
        parcel.writeString(this.f269902e);
        parcel.writeString(this.f269903f);
        List<PlaceholderAction> list = this.f269904g;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), i12);
        }
    }
}
