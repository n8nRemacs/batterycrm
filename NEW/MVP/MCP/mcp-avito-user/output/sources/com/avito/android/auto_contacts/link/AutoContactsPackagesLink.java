package com.avito.android.auto_contacts.link;

import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: AutoContactsPackagesLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/auto_contacts/link/AutoContactsPackagesLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final class AutoContactsPackagesLink extends DeepLink {

    @k
    public static final Parcelable.Creator<AutoContactsPackagesLink> CREATOR = new a();

    /* compiled from: AutoContactsPackagesLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoContactsPackagesLink> {
        @Override // android.os.Parcelable.Creator
        public final AutoContactsPackagesLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new AutoContactsPackagesLink();
        }

        @Override // android.os.Parcelable.Creator
        public final AutoContactsPackagesLink[] newArray(int i12) {
            return new AutoContactsPackagesLink[i12];
        }
    }

    /* compiled from: AutoContactsPackagesLink.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_contacts/link/AutoContactsPackagesLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f94885b = new b();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
