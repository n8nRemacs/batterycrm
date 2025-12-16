package com.avito.android.contact_access.links;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: ContactsPackagesBuyLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/contact_access/links/ContactsPackagesBuyLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class ContactsPackagesBuyLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ContactsPackagesBuyLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f126158b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f126159c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f126160d;

    /* compiled from: ContactsPackagesBuyLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContactsPackagesBuyLink> {
        @Override // android.os.Parcelable.Creator
        public final ContactsPackagesBuyLink createFromParcel(Parcel parcel) {
            return new ContactsPackagesBuyLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ContactsPackagesBuyLink[] newArray(int i12) {
            return new ContactsPackagesBuyLink[i12];
        }
    }

    /* compiled from: ContactsPackagesBuyLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/contact_access/links/ContactsPackagesBuyLink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/contact_access/links/ContactsPackagesBuyLink$b$a;", "Lcom/avito/android/contact_access/links/ContactsPackagesBuyLink$b$b;", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: ContactsPackagesBuyLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/contact_access/links/ContactsPackagesBuyLink$b$a;", "Lcom/avito/android/contact_access/links/ContactsPackagesBuyLink$b;", "<init>", "()V", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f126161b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: ContactsPackagesBuyLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/contact_access/links/ContactsPackagesBuyLink$b$b;", "Lcom/avito/android/contact_access/links/ContactsPackagesBuyLink$b;", "<init>", "()V", "_avito_job_contact-access_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.contact_access.links.ContactsPackagesBuyLink$b$b, reason: collision with other inner class name */
        public static final class C3747b extends b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C3747b f126162b = new C3747b();

            public C3747b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ ContactsPackagesBuyLink(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f126158b);
        parcel.writeString(this.f126159c);
        parcel.writeString(this.f126160d);
    }

    public ContactsPackagesBuyLink(@k String str, @l String str2, @l String str3) {
        this.f126158b = str;
        this.f126159c = str2;
        this.f126160d = str3;
    }
}
