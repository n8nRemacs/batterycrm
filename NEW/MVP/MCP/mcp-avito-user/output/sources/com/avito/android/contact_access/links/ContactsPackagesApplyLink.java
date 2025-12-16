package com.avito.android.contact_access.links;

import Ju.InterfaceC14247a;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: ContactsPackagesApplyLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/contact_access/links/ContactsPackagesApplyLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class ContactsPackagesApplyLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ContactsPackagesApplyLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f126153b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f126154c;

    /* compiled from: ContactsPackagesApplyLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContactsPackagesApplyLink> {
        @Override // android.os.Parcelable.Creator
        public final ContactsPackagesApplyLink createFromParcel(Parcel parcel) {
            return new ContactsPackagesApplyLink(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ContactsPackagesApplyLink[] newArray(int i12) {
            return new ContactsPackagesApplyLink[i12];
        }
    }

    /* compiled from: ContactsPackagesApplyLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/avito/android/contact_access/links/ContactsPackagesApplyLink$b;", "", "<init>", "()V", "a", "b", "c", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: ContactsPackagesApplyLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/contact_access/links/ContactsPackagesApplyLink$b$a;", "LJu/a$a;", "<init>", "()V", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f126155b = new a();
        }

        /* compiled from: ContactsPackagesApplyLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/contact_access/links/ContactsPackagesApplyLink$b$b;", "LJu/a$b;", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.contact_access.links.ContactsPackagesApplyLink$b$b, reason: collision with other inner class name */
        public static final class C3746b implements InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f126156b;

            public C3746b(@k DeepLink deepLink) {
                this.f126156b = deepLink;
            }
        }

        /* compiled from: ContactsPackagesApplyLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/contact_access/links/ContactsPackagesApplyLink$b$c;", "LJu/a$b;", "<init>", "()V", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f126157b = new c();
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public ContactsPackagesApplyLink(@k String str, boolean z12) {
        this.f126153b = str;
        this.f126154c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f126153b);
        parcel.writeInt(this.f126154c ? 1 : 0);
    }
}
