package com.avito.android.user_advert.advert.items.realty.entry_point_client_room;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: EntryPointToAccountOwnerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/entry_point_client_room/EntryPointToAccountOwnerItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EntryPointToAccountOwnerItem implements com.avito.conveyor_item.a, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<EntryPointToAccountOwnerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f309891b;

    /* renamed from: c, reason: collision with root package name */
    public final int f309892c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f309893d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f309894e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<MyAdvertDetails.Advantage> f309895f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final MyAdvertDetails.MainButtonAction f309896g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f309897h;

    /* compiled from: EntryPointToAccountOwnerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EntryPointToAccountOwnerItem> {
        @Override // android.os.Parcelable.Creator
        public final EntryPointToAccountOwnerItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(EntryPointToAccountOwnerItem.class, parcel, arrayList, iL2, 1);
            }
            MyAdvertDetails.MainButtonAction mainButtonAction = (MyAdvertDetails.MainButtonAction) parcel.readParcelable(EntryPointToAccountOwnerItem.class.getClassLoader());
            int i14 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i14);
            while (iC2 != i14) {
                iC2 = com.avito.android.actions_sheet.a.c(ExtraAction.CREATOR, parcel, arrayList2, iC2, 1);
            }
            return new EntryPointToAccountOwnerItem(string, i12, string2, string3, arrayList, mainButtonAction, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final EntryPointToAccountOwnerItem[] newArray(int i12) {
            return new EntryPointToAccountOwnerItem[i12];
        }
    }

    public EntryPointToAccountOwnerItem(@Y61.k String str, int i12, @Y61.k String str2, @Y61.k String str3, @Y61.k List list, @Y61.k MyAdvertDetails.MainButtonAction mainButtonAction, @Y61.k ArrayList arrayList) {
        this.f309891b = str;
        this.f309892c = i12;
        this.f309893d = str2;
        this.f309894e = str3;
        this.f309895f = list;
        this.f309896g = mainButtonAction;
        this.f309897h = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75535g() {
        return getF75536h().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF75536h() {
        return this.f309891b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f309891b);
        parcel.writeInt(this.f309892c);
        parcel.writeString(this.f309893d);
        parcel.writeString(this.f309894e);
        Iterator itJ = C0.j(this.f309895f, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f309896g, i12);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f309897h, parcel);
        while (itZ.hasNext()) {
            ((ExtraAction) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
