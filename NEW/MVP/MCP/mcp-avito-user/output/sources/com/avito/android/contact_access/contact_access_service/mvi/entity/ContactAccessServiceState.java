package com.avito.android.contact_access.contact_access_service.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContactAccessServiceState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/contact_access/contact_access_service/mvi/entity/ContactAccessServiceState;", "Landroid/os/Parcelable;", "()V", "Content", "Error", "Lcom/avito/android/contact_access/contact_access_service/mvi/entity/ContactAccessServiceState$Content;", "Lcom/avito/android/contact_access/contact_access_service/mvi/entity/ContactAccessServiceState$Error;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ContactAccessServiceState implements Parcelable {

    /* compiled from: ContactAccessServiceState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/contact_access/contact_access_service/mvi/entity/ContactAccessServiceState$Content;", "Lcom/avito/android/contact_access/contact_access_service/mvi/entity/ContactAccessServiceState;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content extends ContactAccessServiceState {

        @k
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f125987b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f125988c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f125989d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f125990e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f125991f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final AttributedText f125992g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f125993h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final DeepLink f125994i;

        /* compiled from: ContactAccessServiceState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Content> {
            @Override // android.os.Parcelable.Creator
            public final Content createFromParcel(Parcel parcel) {
                return new Content(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (AttributedText) parcel.readParcelable(Content.class.getClassLoader()), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(Content.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Content[] newArray(int i12) {
                return new Content[i12];
            }
        }

        public Content(@k String str, @l String str2, @k String str3, @k String str4, boolean z12, @l AttributedText attributedText, boolean z13, @k DeepLink deepLink) {
            super(null);
            this.f125987b = str;
            this.f125988c = str2;
            this.f125989d = str3;
            this.f125990e = str4;
            this.f125991f = z12;
            this.f125992g = attributedText;
            this.f125993h = z13;
            this.f125994i = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f125987b, content.f125987b) && L.f(this.f125988c, content.f125988c) && L.f(this.f125989d, content.f125989d) && L.f(this.f125990e, content.f125990e) && this.f125991f == content.f125991f && L.f(this.f125992g, content.f125992g) && this.f125993h == content.f125993h && L.f(this.f125994i, content.f125994i);
        }

        public final int hashCode() {
            int iHashCode = this.f125987b.hashCode() * 31;
            String str = this.f125988c;
            int i12 = r.i(H.d(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f125989d), 31, this.f125990e), 31, this.f125991f);
            AttributedText attributedText = this.f125992g;
            return this.f125994i.hashCode() + r.i((i12 + (attributedText != null ? attributedText.hashCode() : 0)) * 31, 31, this.f125993h);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(title=");
            sb2.append(this.f125987b);
            sb2.append(", subtitle=");
            sb2.append(this.f125988c);
            sb2.append(", name=");
            sb2.append(this.f125989d);
            sb2.append(", price=");
            sb2.append(this.f125990e);
            sb2.append(", isMultiContact=");
            sb2.append(this.f125991f);
            sb2.append(", legal=");
            sb2.append(this.f125992g);
            sb2.append(", isLoading=");
            sb2.append(this.f125993h);
            sb2.append(", continueDeepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f125994i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f125987b);
            parcel.writeString(this.f125988c);
            parcel.writeString(this.f125989d);
            parcel.writeString(this.f125990e);
            parcel.writeInt(this.f125991f ? 1 : 0);
            parcel.writeParcelable(this.f125992g, i12);
            parcel.writeInt(this.f125993h ? 1 : 0);
            parcel.writeParcelable(this.f125994i, i12);
        }
    }

    /* compiled from: ContactAccessServiceState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/contact_access/contact_access_service/mvi/entity/ContactAccessServiceState$Error;", "Lcom/avito/android/contact_access/contact_access_service/mvi/entity/ContactAccessServiceState;", "_avito_job_contact-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error extends ContactAccessServiceState {

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f125995b;

        /* compiled from: ContactAccessServiceState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error(@l String str) {
            super(null);
            this.f125995b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f125995b, ((Error) obj).f125995b);
        }

        public final int hashCode() {
            String str = this.f125995b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(errorMsg="), this.f125995b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f125995b);
        }
    }

    public /* synthetic */ ContactAccessServiceState(C42822w c42822w) {
        this();
    }

    public ContactAccessServiceState() {
    }
}
