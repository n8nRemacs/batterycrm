package com.avito.android.review_gallery.router;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.async_phone.AsyncPhoneItem;
import com.avito.android.remote.model.Image;
import com.avito.android.serp.adapter.C34734g0;
import com.avito.android.serp.adapter.InAppCallsAwareItem;
import com.avito.conveyor_item.a;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: ContactBarCallItem.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/review_gallery/router/ContactBarCallItem;", "Lcom/avito/android/async_phone/AsyncPhoneItem;", "Lcom/avito/android/serp/adapter/InAppCallsAwareItem;", "_avito_review-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ContactBarCallItem implements AsyncPhoneItem, InAppCallsAwareItem {

    @k
    public static final Parcelable.Creator<ContactBarCallItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f255553b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f255554c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Image f255555d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f255556e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f255557f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f255558g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public PhoneLoadingState f255559h = PhoneLoadingState.f430441b;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f255560i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final InterfaceC42726C f255561j;

    /* compiled from: ContactBarCallItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContactBarCallItem> {
        @Override // android.os.Parcelable.Creator
        public final ContactBarCallItem createFromParcel(Parcel parcel) {
            return new ContactBarCallItem(parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(ContactBarCallItem.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ContactBarCallItem[] newArray(int i12) {
            return new ContactBarCallItem[i12];
        }
    }

    /* compiled from: ContactBarCallItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/g0;", "invoke", "()Lcom/avito/android/serp/adapter/g0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<C34734g0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final C34734g0 invoke() {
            ContactBarCallItem contactBarCallItem = ContactBarCallItem.this;
            return new C34734g0(contactBarCallItem.f255553b, contactBarCallItem.f255554c, contactBarCallItem.f255555d, contactBarCallItem.f255556e, null, contactBarCallItem.f255558g, contactBarCallItem.f255557f, null, null);
        }
    }

    public ContactBarCallItem(@l String str, @l String str2, @l String str3, @l Image image, @l String str4, @l String str5) {
        this.f255553b = str;
        this.f255554c = str2;
        this.f255555d = image;
        this.f255556e = str3;
        this.f255557f = str4;
        this.f255558g = str5;
        this.f255560i = str == null ? "" : str;
        this.f255561j = C42727D.c(new b());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactBarCallItem)) {
            return false;
        }
        ContactBarCallItem contactBarCallItem = (ContactBarCallItem) obj;
        return L.f(this.f255553b, contactBarCallItem.f255553b) && L.f(this.f255554c, contactBarCallItem.f255554c) && L.f(this.f255555d, contactBarCallItem.f255555d) && L.f(this.f255556e, contactBarCallItem.f255556e) && L.f(this.f255557f, contactBarCallItem.f255557f) && L.f(this.f255558g, contactBarCallItem.f255558g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF77493b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.InAppCallsAwareItem
    @k
    public final C34734g0 getInAppCallsAwareItemData() {
        return (C34734g0) this.f255561j.getValue();
    }

    @Override // com.avito.android.async_phone.AsyncPhoneItem
    @k
    /* renamed from: getPhoneLoadingState, reason: from getter */
    public final PhoneLoadingState getF268802o0() {
        return this.f255559h;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF199644b() {
        return this.f255560i;
    }

    public final int hashCode() {
        String str = this.f255553b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f255554c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.f255555d;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str3 = this.f255556e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f255557f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f255558g;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // com.avito.android.async_phone.AsyncPhoneItem
    public final void setPhoneLoadingState(@k PhoneLoadingState phoneLoadingState) {
        this.f255559h = phoneLoadingState;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactBarCallItem(userHash=");
        sb2.append(this.f255553b);
        sb2.append(", name=");
        sb2.append(this.f255554c);
        sb2.append(", avatar=");
        sb2.append(this.f255555d);
        sb2.append(", itemId=");
        sb2.append(this.f255556e);
        sb2.append(", price=");
        sb2.append(this.f255557f);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f255558g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f255553b);
        parcel.writeString(this.f255554c);
        parcel.writeParcelable(this.f255555d, i12);
        parcel.writeString(this.f255556e);
        parcel.writeString(this.f255557f);
        parcel.writeString(this.f255558g);
    }
}
