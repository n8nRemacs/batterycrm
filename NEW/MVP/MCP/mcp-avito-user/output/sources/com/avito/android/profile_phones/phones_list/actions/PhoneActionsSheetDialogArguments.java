package com.avito.android.profile_phones.phones_list.actions;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.profile_phones.phones_list.phone_item.PhoneListItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PhoneActionsSheetDialogFragment.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/actions/PhoneActionsSheetDialogArguments;", "Landroid/os/Parcelable;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PhoneActionsSheetDialogArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<PhoneActionsSheetDialogArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<PhoneListItem.Action> f227468b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f227469c;

    /* compiled from: PhoneActionsSheetDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PhoneActionsSheetDialogArguments> {
        @Override // android.os.Parcelable.Creator
        public final PhoneActionsSheetDialogArguments createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(PhoneListItem.Action.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new PhoneActionsSheetDialogArguments(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PhoneActionsSheetDialogArguments[] newArray(int i12) {
            return new PhoneActionsSheetDialogArguments[i12];
        }
    }

    public PhoneActionsSheetDialogArguments(@k List<PhoneListItem.Action> list, @k String str) {
        this.f227468b = list;
        this.f227469c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f227468b, parcel);
        while (itJ.hasNext()) {
            ((PhoneListItem.Action) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f227469c);
    }
}
