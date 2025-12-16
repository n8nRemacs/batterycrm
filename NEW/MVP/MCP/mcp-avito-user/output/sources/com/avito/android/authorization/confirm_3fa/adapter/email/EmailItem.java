package com.avito.android.authorization.confirm_3fa.adapter.email;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.authorization.confirm_3fa.adapter.EmailListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmailItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/adapter/email/EmailItem;", "Lcom/avito/android/authorization/confirm_3fa/adapter/EmailListItem;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class EmailItem implements EmailListItem {

    @k
    public static final Parcelable.Creator<EmailItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f93560b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f93561c;

    /* compiled from: EmailItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EmailItem> {
        @Override // android.os.Parcelable.Creator
        public final EmailItem createFromParcel(Parcel parcel) {
            return new EmailItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EmailItem[] newArray(int i12) {
            return new EmailItem[i12];
        }
    }

    public EmailItem(@k String str, @k String str2) {
        this.f93560b = str;
        this.f93561c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailItem)) {
            return false;
        }
        EmailItem emailItem = (EmailItem) obj;
        return L.f(this.f93560b, emailItem.f93560b) && L.f(this.f93561c, emailItem.f93561c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287615b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF175461b() {
        return "com.avito.android.authorization.confirm_3fa.adapter.email.EmailItem";
    }

    public final int hashCode() {
        return this.f93561c.hashCode() + (this.f93560b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmailItem(label=");
        sb2.append(this.f93560b);
        sb2.append(", serverId=");
        return C22026a.c(sb2, this.f93561c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f93560b);
        parcel.writeString(this.f93561c);
    }
}
