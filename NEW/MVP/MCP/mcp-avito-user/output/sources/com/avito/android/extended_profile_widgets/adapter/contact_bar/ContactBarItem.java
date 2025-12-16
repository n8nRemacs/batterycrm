package com.avito.android.extended_profile_widgets.adapter.contact_bar;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.extended_profile_ui_components.FloatingButton;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContactBarItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/contact_bar/ContactBarItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ContactBarItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<ContactBarItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154352b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154353c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ContactBar.Button.Action f154354d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ContactBar.Button.Action f154355e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<FloatingButton> f154356f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f154357g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f154358h;

    /* compiled from: ContactBarItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContactBarItem> {
        @Override // android.os.Parcelable.Creator
        public final ContactBarItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            GridElementType gridElementType = (GridElementType) parcel.readParcelable(ContactBarItem.class.getClassLoader());
            ContactBar.Button.Action action = (ContactBar.Button.Action) parcel.readParcelable(ContactBarItem.class.getClassLoader());
            ContactBar.Button.Action action2 = (ContactBar.Button.Action) parcel.readParcelable(ContactBarItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ContactBarItem.class, parcel, arrayList, iL2, 1);
            }
            return new ContactBarItem(string, gridElementType, action, action2, arrayList, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ContactBarItem[] newArray(int i12) {
            return new ContactBarItem[i12];
        }
    }

    public ContactBarItem(@k String str, @k GridElementType gridElementType, @l ContactBar.Button.Action action, @l ContactBar.Button.Action action2, @k List<FloatingButton> list, @l String str2, boolean z12) {
        this.f154352b = str;
        this.f154353c = gridElementType;
        this.f154354d = action;
        this.f154355e = action2;
        this.f154356f = list;
        this.f154357g = str2;
        this.f154358h = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactBarItem)) {
            return false;
        }
        ContactBarItem contactBarItem = (ContactBarItem) obj;
        return L.f(this.f154352b, contactBarItem.f154352b) && L.f(this.f154353c, contactBarItem.f154353c) && L.f(this.f154354d, contactBarItem.f154354d) && L.f(this.f154355e, contactBarItem.f154355e) && L.f(this.f154356f, contactBarItem.f154356f) && L.f(this.f154357g, contactBarItem.f154357g) && this.f154358h == contactBarItem.f154358h;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154849c() {
        return this.f154353c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF96836b() {
        return this.f154352b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.bxcontent.mvi.entity.f.b(this.f154353c, this.f154352b.hashCode() * 31, 31);
        ContactBar.Button.Action action = this.f154354d;
        int iHashCode = (iB2 + (action == null ? 0 : action.hashCode())) * 31;
        ContactBar.Button.Action action2 = this.f154355e;
        int iE2 = H.e((iHashCode + (action2 == null ? 0 : action2.hashCode())) * 31, 31, this.f154356f);
        String str = this.f154357g;
        return Boolean.hashCode(this.f154358h) + ((iE2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactBarItem(stringId=");
        sb2.append(this.f154352b);
        sb2.append(", gridType=");
        sb2.append(this.f154353c);
        sb2.append(", callAction=");
        sb2.append(this.f154354d);
        sb2.append(", writeAction=");
        sb2.append(this.f154355e);
        sb2.append(", floatingButtons=");
        sb2.append(this.f154356f);
        sb2.append(", replySpeed=");
        sb2.append(this.f154357g);
        sb2.append(", disableFloating=");
        return r.x(sb2, this.f154358h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154352b);
        parcel.writeParcelable(this.f154353c, i12);
        parcel.writeParcelable(this.f154354d, i12);
        parcel.writeParcelable(this.f154355e, i12);
        Iterator itJ = C0.j(this.f154356f, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f154357g);
        parcel.writeInt(this.f154358h ? 1 : 0);
    }

    public /* synthetic */ ContactBarItem(String str, GridElementType gridElementType, ContactBar.Button.Action action, ContactBar.Button.Action action2, List list, String str2, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, action, action2, list, str2, z12);
    }
}
