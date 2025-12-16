package com.avito.android.publish.slots.contact_method.publish.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PublishContactMethodItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/contact_method/publish/item/PublishContactMethodItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PublishContactMethodItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<PublishContactMethodItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f243329b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f243330c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f243331d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<ContactMethodSelect> f243332e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f243333f;

    /* compiled from: PublishContactMethodItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PublishContactMethodItem> {
        @Override // android.os.Parcelable.Creator
        public final PublishContactMethodItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ContactMethodSelect.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new PublishContactMethodItem(string, string2, string3, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PublishContactMethodItem[] newArray(int i12) {
            return new PublishContactMethodItem[i12];
        }
    }

    public PublishContactMethodItem(@k String str, @k String str2, @l String str3, @k List<ContactMethodSelect> list, boolean z12) {
        this.f243329b = str;
        this.f243330c = str2;
        this.f243331d = str3;
        this.f243332e = list;
        this.f243333f = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishContactMethodItem)) {
            return false;
        }
        PublishContactMethodItem publishContactMethodItem = (PublishContactMethodItem) obj;
        return L.f(this.f243329b, publishContactMethodItem.f243329b) && L.f(this.f243330c, publishContactMethodItem.f243330c) && L.f(this.f243331d, publishContactMethodItem.f243331d) && L.f(this.f243332e, publishContactMethodItem.f243332e) && this.f243333f == publishContactMethodItem.f243333f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84654b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229206b() {
        return this.f243329b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f243329b.hashCode() * 31, 31, this.f243330c);
        String str = this.f243331d;
        return Boolean.hashCode(this.f243333f) + H.e((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f243332e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublishContactMethodItem(stringId=");
        sb2.append(this.f243329b);
        sb2.append(", title=");
        sb2.append(this.f243330c);
        sb2.append(", selectedId=");
        sb2.append(this.f243331d);
        sb2.append(", values=");
        sb2.append(this.f243332e);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f243333f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f243329b);
        parcel.writeString(this.f243330c);
        parcel.writeString(this.f243331d);
        Iterator itJ = C0.j(this.f243332e, parcel);
        while (itJ.hasNext()) {
            ((ContactMethodSelect) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f243333f ? 1 : 0);
    }
}
