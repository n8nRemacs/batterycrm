package com.avito.android.mandatory_verification.data.model;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: MandatoryVerificationData.kt */
@d
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/mandatory_verification/data/model/MandatoryVerificationData;", "Landroid/os/Parcelable;", "AccountVerification", "Benefits", "Button", "Header", "ObjectVerification", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MandatoryVerificationData implements Parcelable {

    @k
    public static final Parcelable.Creator<MandatoryVerificationData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Header f184428b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Benefits f184429c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AccountVerification f184430d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ObjectVerification f184431e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f184432f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f184433g;

    /* renamed from: h, reason: collision with root package name */
    public final long f184434h;

    /* compiled from: MandatoryVerificationData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mandatory_verification/data/model/MandatoryVerificationData$Benefits;", "Landroid/os/Parcelable;", "Benefit", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Benefits implements Parcelable {

        @k
        public static final Parcelable.Creator<Benefits> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f184442b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Object f184443c;

        /* compiled from: MandatoryVerificationData.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/data/model/MandatoryVerificationData$Benefits$Benefit;", "Landroid/os/Parcelable;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Benefit implements Parcelable {

            @k
            public static final Parcelable.Creator<Benefit> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f184444b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f184445c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final UniversalImage f184446d;

            /* compiled from: MandatoryVerificationData.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Benefit> {
                @Override // android.os.Parcelable.Creator
                public final Benefit createFromParcel(Parcel parcel) {
                    return new Benefit(parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(Benefit.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Benefit[] newArray(int i12) {
                    return new Benefit[i12];
                }
            }

            public Benefit(@k String str, @k String str2, @k UniversalImage universalImage) {
                this.f184444b = str;
                this.f184445c = str2;
                this.f184446d = universalImage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Benefit)) {
                    return false;
                }
                Benefit benefit = (Benefit) obj;
                return L.f(this.f184444b, benefit.f184444b) && L.f(this.f184445c, benefit.f184445c) && L.f(this.f184446d, benefit.f184446d);
            }

            public final int hashCode() {
                return this.f184446d.hashCode() + H.d(this.f184444b.hashCode() * 31, 31, this.f184445c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Benefit(title=");
                sb2.append(this.f184444b);
                sb2.append(", description=");
                sb2.append(this.f184445c);
                sb2.append(", icon=");
                return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f184446d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f184444b);
                parcel.writeString(this.f184445c);
                parcel.writeParcelable(this.f184446d, i12);
            }
        }

        /* compiled from: MandatoryVerificationData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Benefits> {
            @Override // android.os.Parcelable.Creator
            public final Benefits createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Benefit.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Benefits(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Benefits[] newArray(int i12) {
                return new Benefits[i12];
            }
        }

        public Benefits(@k String str, @k List<Benefit> list) {
            this.f184442b = str;
            this.f184443c = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Benefits)) {
                return false;
            }
            Benefits benefits = (Benefits) obj;
            return L.f(this.f184442b, benefits.f184442b) && L.f(this.f184443c, benefits.f184443c);
        }

        public final int hashCode() {
            return this.f184443c.hashCode() + (this.f184442b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Benefits(title=");
            sb2.append(this.f184442b);
            sb2.append(", benefits=");
            return H.n(sb2, this.f184443c, ')');
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f184442b);
            ?? r02 = this.f184443c;
            parcel.writeInt(r02.size());
            Iterator it = r02.iterator();
            while (it.hasNext()) {
                ((Benefit) it.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: MandatoryVerificationData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/data/model/MandatoryVerificationData$Button;", "Landroid/os/Parcelable;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f184447b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f184448c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f184449d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f184450e;

        /* compiled from: MandatoryVerificationData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @l DeepLink deepLink, @k String str2, @l String str3) {
            this.f184447b = str;
            this.f184448c = deepLink;
            this.f184449d = str2;
            this.f184450e = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.f184447b, button.f184447b) && L.f(this.f184448c, button.f184448c) && L.f(this.f184449d, button.f184449d) && L.f(this.f184450e, button.f184450e);
        }

        public final int hashCode() {
            int iHashCode = this.f184447b.hashCode() * 31;
            DeepLink deepLink = this.f184448c;
            int iD2 = H.d((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f184449d);
            String str = this.f184450e;
            return iD2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(text=");
            sb2.append(this.f184447b);
            sb2.append(", deeplink=");
            sb2.append(this.f184448c);
            sb2.append(", style=");
            sb2.append(this.f184449d);
            sb2.append(", icon=");
            return C22026a.c(sb2, this.f184450e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f184447b);
            parcel.writeParcelable(this.f184448c, i12);
            parcel.writeString(this.f184449d);
            parcel.writeString(this.f184450e);
        }
    }

    /* compiled from: MandatoryVerificationData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/data/model/MandatoryVerificationData$Header;", "Landroid/os/Parcelable;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Header implements Parcelable {

        @k
        public static final Parcelable.Creator<Header> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f184451b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f184452c;

        /* compiled from: MandatoryVerificationData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Header> {
            @Override // android.os.Parcelable.Creator
            public final Header createFromParcel(Parcel parcel) {
                return new Header(parcel.readString(), (AttributedText) parcel.readParcelable(Header.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Header[] newArray(int i12) {
                return new Header[i12];
            }
        }

        public Header(@k String str, @k AttributedText attributedText) {
            this.f184451b = str;
            this.f184452c = attributedText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return L.f(this.f184451b, header.f184451b) && L.f(this.f184452c, header.f184452c);
        }

        public final int hashCode() {
            return this.f184452c.hashCode() + (this.f184451b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Header(title=");
            sb2.append(this.f184451b);
            sb2.append(", description=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f184452c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f184451b);
            parcel.writeParcelable(this.f184452c, i12);
        }
    }

    /* compiled from: MandatoryVerificationData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MandatoryVerificationData> {
        @Override // android.os.Parcelable.Creator
        public final MandatoryVerificationData createFromParcel(Parcel parcel) {
            return new MandatoryVerificationData(Header.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Benefits.CREATOR.createFromParcel(parcel), AccountVerification.CREATOR.createFromParcel(parcel), ObjectVerification.CREATOR.createFromParcel(parcel), Button.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(MandatoryVerificationData.class.getClassLoader()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final MandatoryVerificationData[] newArray(int i12) {
            return new MandatoryVerificationData[i12];
        }
    }

    public MandatoryVerificationData(@k Header header, @l Benefits benefits, @k AccountVerification accountVerification, @k ObjectVerification objectVerification, @k Button button, @l AttributedText attributedText, long j12) {
        this.f184428b = header;
        this.f184429c = benefits;
        this.f184430d = accountVerification;
        this.f184431e = objectVerification;
        this.f184432f = button;
        this.f184433g = attributedText;
        this.f184434h = j12;
    }

    public static MandatoryVerificationData a(MandatoryVerificationData mandatoryVerificationData, AccountVerification accountVerification, ObjectVerification objectVerification, int i12) {
        Header header = mandatoryVerificationData.f184428b;
        Benefits benefits = mandatoryVerificationData.f184429c;
        if ((i12 & 4) != 0) {
            accountVerification = mandatoryVerificationData.f184430d;
        }
        AccountVerification accountVerification2 = accountVerification;
        if ((i12 & 8) != 0) {
            objectVerification = mandatoryVerificationData.f184431e;
        }
        Button button = mandatoryVerificationData.f184432f;
        AttributedText attributedText = mandatoryVerificationData.f184433g;
        long j12 = mandatoryVerificationData.f184434h;
        mandatoryVerificationData.getClass();
        return new MandatoryVerificationData(header, benefits, accountVerification2, objectVerification, button, attributedText, j12);
    }

    @k
    public final MandatoryVerificationData b(boolean z12, @l com.avito.android.mandatory_verification.domain.file_uploader.a aVar) {
        return a(this, null, ObjectVerification.a(this.f184431e, z12, aVar, null, 16351), 119);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MandatoryVerificationData)) {
            return false;
        }
        MandatoryVerificationData mandatoryVerificationData = (MandatoryVerificationData) obj;
        return L.f(this.f184428b, mandatoryVerificationData.f184428b) && L.f(this.f184429c, mandatoryVerificationData.f184429c) && L.f(this.f184430d, mandatoryVerificationData.f184430d) && L.f(this.f184431e, mandatoryVerificationData.f184431e) && L.f(this.f184432f, mandatoryVerificationData.f184432f) && L.f(this.f184433g, mandatoryVerificationData.f184433g) && this.f184434h == mandatoryVerificationData.f184434h;
    }

    public final int hashCode() {
        int iHashCode = this.f184428b.hashCode() * 31;
        Benefits benefits = this.f184429c;
        int iHashCode2 = (this.f184432f.hashCode() + ((this.f184431e.hashCode() + ((this.f184430d.hashCode() + ((iHashCode + (benefits == null ? 0 : benefits.hashCode())) * 31)) * 31)) * 31)) * 31;
        AttributedText attributedText = this.f184433g;
        return Long.hashCode(this.f184434h) + ((iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MandatoryVerificationData(header=");
        sb2.append(this.f184428b);
        sb2.append(", benefits=");
        sb2.append(this.f184429c);
        sb2.append(", accountVerification=");
        sb2.append(this.f184430d);
        sb2.append(", objectVerification=");
        sb2.append(this.f184431e);
        sb2.append(", proceedButton=");
        sb2.append(this.f184432f);
        sb2.append(", bottomText=");
        sb2.append(this.f184433g);
        sb2.append(", itemId=");
        return r.u(sb2, this.f184434h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f184428b.writeToParcel(parcel, i12);
        Benefits benefits = this.f184429c;
        if (benefits == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            benefits.writeToParcel(parcel, i12);
        }
        this.f184430d.writeToParcel(parcel, i12);
        this.f184431e.writeToParcel(parcel, i12);
        this.f184432f.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f184433g, i12);
        parcel.writeLong(this.f184434h);
    }

    /* compiled from: MandatoryVerificationData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/data/model/MandatoryVerificationData$AccountVerification;", "Landroid/os/Parcelable;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AccountVerification implements Parcelable {

        @k
        public static final Parcelable.Creator<AccountVerification> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f184435b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f184436c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Button f184437d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f184438e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f184439f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f184440g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f184441h;

        /* compiled from: MandatoryVerificationData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AccountVerification> {
            @Override // android.os.Parcelable.Creator
            public final AccountVerification createFromParcel(Parcel parcel) {
                return new AccountVerification(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readString(), null, 64, null);
            }

            @Override // android.os.Parcelable.Creator
            public final AccountVerification[] newArray(int i12) {
                return new AccountVerification[i12];
            }
        }

        public AccountVerification(@k String str, @k String str2, @l Button button, boolean z12, @l String str3, @k String str4, @l String str5) {
            this.f184435b = str;
            this.f184436c = str2;
            this.f184437d = button;
            this.f184438e = z12;
            this.f184439f = str3;
            this.f184440g = str4;
            this.f184441h = str5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AccountVerification)) {
                return false;
            }
            AccountVerification accountVerification = (AccountVerification) obj;
            return L.f(this.f184435b, accountVerification.f184435b) && L.f(this.f184436c, accountVerification.f184436c) && L.f(this.f184437d, accountVerification.f184437d) && this.f184438e == accountVerification.f184438e && L.f(this.f184439f, accountVerification.f184439f) && L.f(this.f184440g, accountVerification.f184440g) && L.f(this.f184441h, accountVerification.f184441h);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f184435b.hashCode() * 31, 31, this.f184436c);
            Button button = this.f184437d;
            int i12 = r.i((iD2 + (button == null ? 0 : button.hashCode())) * 31, 31, this.f184438e);
            String str = this.f184439f;
            int iD3 = H.d((i12 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f184440g);
            String str2 = this.f184441h;
            return iD3 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AccountVerification(title=");
            sb2.append(this.f184435b);
            sb2.append(", description=");
            sb2.append(this.f184436c);
            sb2.append(", button=");
            sb2.append(this.f184437d);
            sb2.append(", isComplete=");
            sb2.append(this.f184438e);
            sb2.append(", verificationFailedMessage=");
            sb2.append(this.f184439f);
            sb2.append(", verificationRequiredMessage=");
            sb2.append(this.f184440g);
            sb2.append(", errorToShow=");
            return C22026a.c(sb2, this.f184441h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f184435b);
            parcel.writeString(this.f184436c);
            Button button = this.f184437d;
            if (button == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                button.writeToParcel(parcel, i12);
            }
            parcel.writeInt(this.f184438e ? 1 : 0);
            parcel.writeString(this.f184439f);
            parcel.writeString(this.f184440g);
        }

        public /* synthetic */ AccountVerification(String str, String str2, Button button, boolean z12, String str3, String str4, String str5, int i12, C42822w c42822w) {
            this(str, str2, button, z12, str3, str4, (i12 & 64) != 0 ? str3 : str5);
        }
    }

    /* compiled from: MandatoryVerificationData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/data/model/MandatoryVerificationData$ObjectVerification;", "Landroid/os/Parcelable;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ObjectVerification implements Parcelable {

        @k
        public static final Parcelable.Creator<ObjectVerification> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f184453b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f184454c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f184455d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f184456e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Button f184457f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f184458g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final List<String> f184459h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final String f184460i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final String f184461j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final String f184462k;

        /* renamed from: l, reason: collision with root package name */
        @k
        public final String f184463l;

        /* renamed from: m, reason: collision with root package name */
        @k
        public final String f184464m;

        /* renamed from: n, reason: collision with root package name */
        public final long f184465n;

        /* renamed from: o, reason: collision with root package name */
        @k
        public final String f184466o;

        /* renamed from: p, reason: collision with root package name */
        @l
        public final com.avito.android.mandatory_verification.domain.file_uploader.a f184467p;

        /* renamed from: q, reason: collision with root package name */
        @l
        public final PrintableText f184468q;

        /* compiled from: MandatoryVerificationData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ObjectVerification> {
            @Override // android.os.Parcelable.Creator
            public final ObjectVerification createFromParcel(Parcel parcel) {
                return new ObjectVerification(parcel.readString(), (AttributedText) parcel.readParcelable(ObjectVerification.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), false, parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), null, null, 49184, null);
            }

            @Override // android.os.Parcelable.Creator
            public final ObjectVerification[] newArray(int i12) {
                return new ObjectVerification[i12];
            }
        }

        public ObjectVerification(@k String str, @k AttributedText attributedText, @l String str2, @l String str3, @l Button button, boolean z12, @k List<String> list, @k String str4, @k String str5, @k String str6, @k String str7, @k String str8, long j12, @k String str9, @l com.avito.android.mandatory_verification.domain.file_uploader.a aVar, @l PrintableText printableText) {
            this.f184453b = str;
            this.f184454c = attributedText;
            this.f184455d = str2;
            this.f184456e = str3;
            this.f184457f = button;
            this.f184458g = z12;
            this.f184459h = list;
            this.f184460i = str4;
            this.f184461j = str5;
            this.f184462k = str6;
            this.f184463l = str7;
            this.f184464m = str8;
            this.f184465n = j12;
            this.f184466o = str9;
            this.f184467p = aVar;
            this.f184468q = printableText;
        }

        public static ObjectVerification a(ObjectVerification objectVerification, boolean z12, com.avito.android.mandatory_verification.domain.file_uploader.a aVar, PrintableText printableText, int i12) {
            String str = objectVerification.f184453b;
            AttributedText attributedText = objectVerification.f184454c;
            String str2 = objectVerification.f184455d;
            String str3 = objectVerification.f184456e;
            Button button = objectVerification.f184457f;
            boolean z13 = (i12 & 32) != 0 ? objectVerification.f184458g : z12;
            List<String> list = objectVerification.f184459h;
            String str4 = objectVerification.f184460i;
            String str5 = objectVerification.f184461j;
            String str6 = objectVerification.f184462k;
            String str7 = objectVerification.f184463l;
            String str8 = objectVerification.f184464m;
            long j12 = objectVerification.f184465n;
            String str9 = objectVerification.f184466o;
            com.avito.android.mandatory_verification.domain.file_uploader.a aVar2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? objectVerification.f184467p : aVar;
            objectVerification.getClass();
            return new ObjectVerification(str, attributedText, str2, str3, button, z13, list, str4, str5, str6, str7, str8, j12, str9, aVar2, printableText);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ObjectVerification)) {
                return false;
            }
            ObjectVerification objectVerification = (ObjectVerification) obj;
            return L.f(this.f184453b, objectVerification.f184453b) && L.f(this.f184454c, objectVerification.f184454c) && L.f(this.f184455d, objectVerification.f184455d) && L.f(this.f184456e, objectVerification.f184456e) && L.f(this.f184457f, objectVerification.f184457f) && this.f184458g == objectVerification.f184458g && L.f(this.f184459h, objectVerification.f184459h) && L.f(this.f184460i, objectVerification.f184460i) && L.f(this.f184461j, objectVerification.f184461j) && L.f(this.f184462k, objectVerification.f184462k) && L.f(this.f184463l, objectVerification.f184463l) && L.f(this.f184464m, objectVerification.f184464m) && this.f184465n == objectVerification.f184465n && L.f(this.f184466o, objectVerification.f184466o) && L.f(this.f184467p, objectVerification.f184467p) && L.f(this.f184468q, objectVerification.f184468q);
        }

        public final int hashCode() {
            int iB2 = com.avito.android.actions_sheet.a.b(this.f184453b.hashCode() * 31, 31, this.f184454c);
            String str = this.f184455d;
            int iHashCode = (iB2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f184456e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Button button = this.f184457f;
            int iD2 = H.d(r.g(H.d(H.d(H.d(H.d(H.d(H.e(r.i((iHashCode2 + (button == null ? 0 : button.hashCode())) * 31, 31, this.f184458g), 31, this.f184459h), 31, this.f184460i), 31, this.f184461j), 31, this.f184462k), 31, this.f184463l), 31, this.f184464m), 31, this.f184465n), 31, this.f184466o);
            com.avito.android.mandatory_verification.domain.file_uploader.a aVar = this.f184467p;
            int iHashCode3 = (iD2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            PrintableText printableText = this.f184468q;
            return iHashCode3 + (printableText != null ? printableText.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ObjectVerification(title=");
            sb2.append(this.f184453b);
            sb2.append(", description=");
            sb2.append(this.f184454c);
            sb2.append(", actionTitle=");
            sb2.append(this.f184455d);
            sb2.append(", actionDescription=");
            sb2.append(this.f184456e);
            sb2.append(", button=");
            sb2.append(this.f184457f);
            sb2.append(", isComplete=");
            sb2.append(this.f184458g);
            sb2.append(", mimeTypes=");
            sb2.append(this.f184459h);
            sb2.append(", fileErrorMessage=");
            sb2.append(this.f184460i);
            sb2.append(", fileRequiredMessage=");
            sb2.append(this.f184461j);
            sb2.append(", fileUploadedTitle=");
            sb2.append(this.f184462k);
            sb2.append(", uploadPath=");
            sb2.append(this.f184463l);
            sb2.append(", deletePath=");
            sb2.append(this.f184464m);
            sb2.append(", maxFileSize=");
            sb2.append(this.f184465n);
            sb2.append(", fileSizeExceedMessage=");
            sb2.append(this.f184466o);
            sb2.append(", uploadedFile=");
            sb2.append(this.f184467p);
            sb2.append(", errorToShow=");
            return c.m(sb2, this.f184468q, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f184453b);
            parcel.writeParcelable(this.f184454c, i12);
            parcel.writeString(this.f184455d);
            parcel.writeString(this.f184456e);
            Button button = this.f184457f;
            if (button == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                button.writeToParcel(parcel, i12);
            }
            parcel.writeStringList(this.f184459h);
            parcel.writeString(this.f184460i);
            parcel.writeString(this.f184461j);
            parcel.writeString(this.f184462k);
            parcel.writeString(this.f184463l);
            parcel.writeString(this.f184464m);
            parcel.writeLong(this.f184465n);
            parcel.writeString(this.f184466o);
        }

        public /* synthetic */ ObjectVerification(String str, AttributedText attributedText, String str2, String str3, Button button, boolean z12, List list, String str4, String str5, String str6, String str7, String str8, long j12, String str9, com.avito.android.mandatory_verification.domain.file_uploader.a aVar, PrintableText printableText, int i12, C42822w c42822w) {
            this(str, attributedText, str2, str3, button, (i12 & 32) != 0 ? false : z12, list, str4, str5, str6, str7, str8, j12, str9, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : aVar, (i12 & 32768) != 0 ? null : printableText);
        }
    }
}
