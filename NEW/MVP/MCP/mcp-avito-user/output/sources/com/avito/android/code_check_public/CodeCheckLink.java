package com.avito.android.code_check_public;

import Ju.InterfaceC14249c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.password_tip.NonLoggableString;
import com.avito.android.remote.model.TfaFlow;
import com.avito.android.remote.model.TfaSource;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CodeCheckLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Arguments", "Flow", "b", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CodeCheckLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<CodeCheckLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Flow f119241b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Arguments f119242c;

    /* compiled from: CodeCheckLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$Arguments;", "Landroid/os/Parcelable;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Arguments implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Arguments> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f119243b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Long f119244c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f119245d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final List<String> f119246e;

        /* compiled from: CodeCheckLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Arguments> {
            @Override // android.os.Parcelable.Creator
            public final Arguments createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                return new Arguments(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), string, parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Arguments[] newArray(int i12) {
                return new Arguments[i12];
            }
        }

        public Arguments() {
            this(null, null, null, null, 15, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Arguments)) {
                return false;
            }
            Arguments arguments = (Arguments) obj;
            return L.f(this.f119243b, arguments.f119243b) && L.f(this.f119244c, arguments.f119244c) && L.f(this.f119245d, arguments.f119245d) && L.f(this.f119246e, arguments.f119246e);
        }

        public final int hashCode() {
            String str = this.f119243b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l12 = this.f119244c;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            Integer num = this.f119245d;
            return this.f119246e.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Arguments(phoneWithoutPrefix=");
            sb2.append(this.f119243b);
            sb2.append(", phoneRequestTimeoutSeconds=");
            sb2.append(this.f119244c);
            sb2.append(", codeLength=");
            sb2.append(this.f119245d);
            sb2.append(", allPhones=");
            return H.p(sb2, this.f119246e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f119243b);
            Long l12 = this.f119244c;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            Integer num = this.f119245d;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeStringList(this.f119246e);
        }

        public Arguments(@l Integer num, @l Long l12, @l String str, @Y61.k List list) {
            this.f119243b = str;
            this.f119244c = l12;
            this.f119245d = num;
            this.f119246e = list;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Arguments(String str, Long l12, Integer num, List list, int i12, C42822w c42822w) {
            str = (i12 & 1) != 0 ? null : str;
            this((i12 & 4) != 0 ? null : num, (i12 & 2) != 0 ? null : l12, str, (i12 & 8) != 0 ? C42784z0.f406748b : list);
        }
    }

    /* compiled from: CodeCheckLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CodeCheckLink> {
        @Override // android.os.Parcelable.Creator
        public final CodeCheckLink createFromParcel(Parcel parcel) {
            return new CodeCheckLink((Flow) parcel.readParcelable(CodeCheckLink.class.getClassLoader()), parcel.readInt() == 0 ? null : Arguments.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CodeCheckLink[] newArray(int i12) {
            return new CodeCheckLink[i12];
        }
    }

    /* compiled from: CodeCheckLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$b;", "", "a", "b", "c", "Lcom/avito/android/code_check_public/CodeCheckLink$b$a;", "Lcom/avito/android/code_check_public/CodeCheckLink$b$b;", "Lcom/avito/android/code_check_public/CodeCheckLink$b$c;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: CodeCheckLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$b$a;", "Lcom/avito/android/code_check_public/CodeCheckLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f119266b = new a();
        }

        /* compiled from: CodeCheckLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$b$b;", "Lcom/avito/android/code_check_public/CodeCheckLink$b;", "LJu/c$b;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.code_check_public.CodeCheckLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3493b implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Parcelable f119267b;

            public C3493b(@l Parcelable parcelable) {
                this.f119267b = parcelable;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3493b) && L.f(this.f119267b, ((C3493b) obj).f119267b);
            }

            public final int hashCode() {
                Parcelable parcelable = this.f119267b;
                if (parcelable == null) {
                    return 0;
                }
                return parcelable.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.o(new StringBuilder("Finished(params="), this.f119267b, ')');
            }
        }

        /* compiled from: CodeCheckLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$b$c;", "Lcom/avito/android/code_check_public/CodeCheckLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements b, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f119268b = new c();
        }
    }

    public /* synthetic */ CodeCheckLink(Flow flow, Arguments arguments, int i12, C42822w c42822w) {
        this(flow, (i12 & 2) != 0 ? null : arguments);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CodeCheckLink)) {
            return false;
        }
        CodeCheckLink codeCheckLink = (CodeCheckLink) obj;
        return L.f(this.f119241b, codeCheckLink.f119241b) && L.f(this.f119242c, codeCheckLink.f119242c);
    }

    public final int hashCode() {
        int iHashCode = this.f119241b.hashCode() * 31;
        Arguments arguments = this.f119242c;
        return iHashCode + (arguments == null ? 0 : arguments.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "CodeCheckLink(flow=" + this.f119241b + ", args=" + this.f119242c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f119241b, i12);
        Arguments arguments = this.f119242c;
        if (arguments == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            arguments.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: CodeCheckLink.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$Flow;", "Landroid/os/Parcelable;", "ActualizePhones", "AutoRecovery", "RecallMe", "Registration", "ResetPassword", "SocReg", "TfaCheck", "TfaEnableConfirm", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow$ActualizePhones;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow$AutoRecovery;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow$RecallMe;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow$Registration;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow$ResetPassword;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow$SocReg;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow$TfaCheck;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow$TfaEnableConfirm;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Flow extends Parcelable {

        /* compiled from: CodeCheckLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$Flow$AutoRecovery;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow;", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class AutoRecovery implements Flow {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final AutoRecovery f119253b = new AutoRecovery();

            @Y61.k
            public static final Parcelable.Creator<AutoRecovery> CREATOR = new a();

            /* compiled from: CodeCheckLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AutoRecovery> {
                @Override // android.os.Parcelable.Creator
                public final AutoRecovery createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return AutoRecovery.f119253b;
                }

                @Override // android.os.Parcelable.Creator
                public final AutoRecovery[] newArray(int i12) {
                    return new AutoRecovery[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: CodeCheckLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$Flow$RecallMe;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RecallMe implements Flow {

            @Y61.k
            public static final Parcelable.Creator<RecallMe> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f119254b;

            /* compiled from: CodeCheckLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RecallMe> {
                @Override // android.os.Parcelable.Creator
                public final RecallMe createFromParcel(Parcel parcel) {
                    return new RecallMe(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final RecallMe[] newArray(int i12) {
                    return new RecallMe[i12];
                }
            }

            public RecallMe(@Y61.k String str) {
                this.f119254b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RecallMe) && L.f(this.f119254b, ((RecallMe) obj).f119254b);
            }

            public final int hashCode() {
                return this.f119254b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("RecallMe(itemId="), this.f119254b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f119254b);
            }
        }

        /* compiled from: CodeCheckLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$Flow$Registration;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow;", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Registration implements Flow {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Registration f119255b = new Registration();

            @Y61.k
            public static final Parcelable.Creator<Registration> CREATOR = new a();

            /* compiled from: CodeCheckLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Registration> {
                @Override // android.os.Parcelable.Creator
                public final Registration createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Registration.f119255b;
                }

                @Override // android.os.Parcelable.Creator
                public final Registration[] newArray(int i12) {
                    return new Registration[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: CodeCheckLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$Flow$ResetPassword;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow;", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ResetPassword implements Flow {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final ResetPassword f119256b = new ResetPassword();

            @Y61.k
            public static final Parcelable.Creator<ResetPassword> CREATOR = new a();

            /* compiled from: CodeCheckLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ResetPassword> {
                @Override // android.os.Parcelable.Creator
                public final ResetPassword createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return ResetPassword.f119256b;
                }

                @Override // android.os.Parcelable.Creator
                public final ResetPassword[] newArray(int i12) {
                    return new ResetPassword[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: CodeCheckLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$Flow$SocReg;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SocReg implements Flow {

            @Y61.k
            public static final Parcelable.Creator<SocReg> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f119257b;

            /* compiled from: CodeCheckLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SocReg> {
                @Override // android.os.Parcelable.Creator
                public final SocReg createFromParcel(Parcel parcel) {
                    return new SocReg(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final SocReg[] newArray(int i12) {
                    return new SocReg[i12];
                }
            }

            public SocReg(@Y61.k String str) {
                this.f119257b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SocReg) && L.f(this.f119257b, ((SocReg) obj).f119257b);
            }

            public final int hashCode() {
                return this.f119257b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("SocReg(socType="), this.f119257b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f119257b);
            }
        }

        /* compiled from: CodeCheckLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$Flow$TfaCheck;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow;", "LoginInfo", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class TfaCheck implements Flow {

            @Y61.k
            public static final Parcelable.Creator<TfaCheck> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final TfaFlow f119258b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final TfaSource f119259c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final LoginInfo f119260d;

            /* compiled from: CodeCheckLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<TfaCheck> {
                @Override // android.os.Parcelable.Creator
                public final TfaCheck createFromParcel(Parcel parcel) {
                    return new TfaCheck(TfaFlow.valueOf(parcel.readString()), TfaSource.valueOf(parcel.readString()), (LoginInfo) parcel.readParcelable(TfaCheck.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final TfaCheck[] newArray(int i12) {
                    return new TfaCheck[i12];
                }
            }

            public TfaCheck(@Y61.k TfaFlow tfaFlow, @Y61.k TfaSource tfaSource, @Y61.k LoginInfo loginInfo) {
                this.f119258b = tfaFlow;
                this.f119259c = tfaSource;
                this.f119260d = loginInfo;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TfaCheck)) {
                    return false;
                }
                TfaCheck tfaCheck = (TfaCheck) obj;
                return this.f119258b == tfaCheck.f119258b && this.f119259c == tfaCheck.f119259c && L.f(this.f119260d, tfaCheck.f119260d);
            }

            public final int hashCode() {
                return this.f119260d.hashCode() + ((this.f119259c.hashCode() + (this.f119258b.hashCode() * 31)) * 31);
            }

            @Y61.k
            public final String toString() {
                return "TfaCheck(flow=" + this.f119258b + ", reason=" + this.f119259c + ", loginInfo=" + this.f119260d + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f119258b.name());
                parcel.writeString(this.f119259c.name());
                parcel.writeParcelable(this.f119260d, i12);
            }

            /* compiled from: CodeCheckLink.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$Flow$TfaCheck$LoginInfo;", "Landroid/os/Parcelable;", "ByLogin", "BySocial", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow$TfaCheck$LoginInfo$ByLogin;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow$TfaCheck$LoginInfo$BySocial;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public interface LoginInfo extends Parcelable {

                /* compiled from: CodeCheckLink.kt */
                @K51.d
                @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$Flow$TfaCheck$LoginInfo$ByLogin;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow$TfaCheck$LoginInfo;", "", "login", "Lcom/avito/android/password_tip/NonLoggableString;", "password", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/w;)V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class ByLogin implements LoginInfo {

                    @Y61.k
                    public static final Parcelable.Creator<ByLogin> CREATOR = new a();

                    /* renamed from: b, reason: collision with root package name */
                    @Y61.k
                    public final String f119261b;

                    /* renamed from: c, reason: collision with root package name */
                    @Y61.k
                    public final String f119262c;

                    /* compiled from: CodeCheckLink.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<ByLogin> {
                        @Override // android.os.Parcelable.Creator
                        public final ByLogin createFromParcel(Parcel parcel) {
                            return new ByLogin(parcel.readString(), ((NonLoggableString) parcel.readParcelable(ByLogin.class.getClassLoader())).f213949b, null);
                        }

                        @Override // android.os.Parcelable.Creator
                        public final ByLogin[] newArray(int i12) {
                            return new ByLogin[i12];
                        }
                    }

                    public ByLogin(String str, String str2, C42822w c42822w) {
                        this.f119261b = str;
                        this.f119262c = str2;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof ByLogin)) {
                            return false;
                        }
                        ByLogin byLogin = (ByLogin) obj;
                        if (!L.f(this.f119261b, byLogin.f119261b)) {
                            return false;
                        }
                        Parcelable.Creator<NonLoggableString> creator = NonLoggableString.CREATOR;
                        return L.f(this.f119262c, byLogin.f119262c);
                    }

                    public final int hashCode() {
                        int iHashCode = this.f119261b.hashCode() * 31;
                        Parcelable.Creator<NonLoggableString> creator = NonLoggableString.CREATOR;
                        return this.f119262c.hashCode() + iHashCode;
                    }

                    @Y61.k
                    public final String toString() {
                        Parcelable.Creator<NonLoggableString> creator = NonLoggableString.CREATOR;
                        return "ByLogin(login=" + this.f119261b + ", password=)";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                        parcel.writeString(this.f119261b);
                        parcel.writeParcelable(NonLoggableString.a(this.f119262c), i12);
                    }
                }

                /* compiled from: CodeCheckLink.kt */
                @K51.d
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$Flow$TfaCheck$LoginInfo$BySocial;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow$TfaCheck$LoginInfo;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class BySocial implements LoginInfo {

                    @Y61.k
                    public static final Parcelable.Creator<BySocial> CREATOR = new a();

                    /* renamed from: b, reason: collision with root package name */
                    @Y61.k
                    public final String f119263b;

                    /* renamed from: c, reason: collision with root package name */
                    @l
                    public final String f119264c;

                    /* compiled from: CodeCheckLink.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<BySocial> {
                        @Override // android.os.Parcelable.Creator
                        public final BySocial createFromParcel(Parcel parcel) {
                            return new BySocial(parcel.readString(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final BySocial[] newArray(int i12) {
                            return new BySocial[i12];
                        }
                    }

                    public BySocial(@Y61.k String str, @l String str2) {
                        this.f119263b = str;
                        this.f119264c = str2;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof BySocial)) {
                            return false;
                        }
                        BySocial bySocial = (BySocial) obj;
                        return L.f(this.f119263b, bySocial.f119263b) && L.f(this.f119264c, bySocial.f119264c);
                    }

                    public final int hashCode() {
                        int iHashCode = this.f119263b.hashCode() * 31;
                        String str = this.f119264c;
                        return iHashCode + (str == null ? 0 : str.hashCode());
                    }

                    @Y61.k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("BySocial(socialNetworkType=");
                        sb2.append(this.f119263b);
                        sb2.append(", socialId=");
                        return C22026a.c(sb2, this.f119264c, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                        parcel.writeString(this.f119263b);
                        parcel.writeString(this.f119264c);
                    }

                    public /* synthetic */ BySocial(String str, String str2, int i12, C42822w c42822w) {
                        this(str, (i12 & 2) != 0 ? null : str2);
                    }
                }
            }
        }

        /* compiled from: CodeCheckLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$Flow$TfaEnableConfirm;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow;", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class TfaEnableConfirm implements Flow {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final TfaEnableConfirm f119265b = new TfaEnableConfirm();

            @Y61.k
            public static final Parcelable.Creator<TfaEnableConfirm> CREATOR = new a();

            /* compiled from: CodeCheckLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<TfaEnableConfirm> {
                @Override // android.os.Parcelable.Creator
                public final TfaEnableConfirm createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return TfaEnableConfirm.f119265b;
                }

                @Override // android.os.Parcelable.Creator
                public final TfaEnableConfirm[] newArray(int i12) {
                    return new TfaEnableConfirm[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: CodeCheckLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$Flow$ActualizePhones;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow;", "Scenario", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class ActualizePhones implements Flow {

            @Y61.k
            public static final Parcelable.Creator<ActualizePhones> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Scenario f119247b;

            /* compiled from: CodeCheckLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ActualizePhones> {
                @Override // android.os.Parcelable.Creator
                public final ActualizePhones createFromParcel(Parcel parcel) {
                    return new ActualizePhones((Scenario) parcel.readParcelable(ActualizePhones.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ActualizePhones[] newArray(int i12) {
                    return new ActualizePhones[i12];
                }
            }

            public ActualizePhones(@Y61.k Scenario scenario) {
                this.f119247b = scenario;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActualizePhones) && L.f(this.f119247b, ((ActualizePhones) obj).f119247b);
            }

            public final int hashCode() {
                return this.f119247b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "ActualizePhones(scenario=" + this.f119247b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f119247b, i12);
            }

            /* compiled from: CodeCheckLink.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$Flow$ActualizePhones$Scenario;", "Landroid/os/Parcelable;", "AddPhone", "ShowActualizePhones", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow$ActualizePhones$Scenario$AddPhone;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow$ActualizePhones$Scenario$ShowActualizePhones;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public interface Scenario extends Parcelable {

                /* compiled from: CodeCheckLink.kt */
                @K51.d
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$Flow$ActualizePhones$Scenario$AddPhone;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow$ActualizePhones$Scenario;", "<init>", "()V", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class AddPhone implements Scenario {

                    /* renamed from: b, reason: collision with root package name */
                    @Y61.k
                    public static final AddPhone f119248b = new AddPhone();

                    @Y61.k
                    public static final Parcelable.Creator<AddPhone> CREATOR = new a();

                    /* compiled from: CodeCheckLink.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<AddPhone> {
                        @Override // android.os.Parcelable.Creator
                        public final AddPhone createFromParcel(Parcel parcel) {
                            parcel.readInt();
                            return AddPhone.f119248b;
                        }

                        @Override // android.os.Parcelable.Creator
                        public final AddPhone[] newArray(int i12) {
                            return new AddPhone[i12];
                        }
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                        parcel.writeInt(1);
                    }
                }

                /* compiled from: CodeCheckLink.kt */
                @K51.d
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check_public/CodeCheckLink$Flow$ActualizePhones$Scenario$ShowActualizePhones;", "Lcom/avito/android/code_check_public/CodeCheckLink$Flow$ActualizePhones$Scenario;", "_avito_code-check_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class ShowActualizePhones implements Scenario {

                    @Y61.k
                    public static final Parcelable.Creator<ShowActualizePhones> CREATOR = new a();

                    /* renamed from: b, reason: collision with root package name */
                    public final boolean f119249b;

                    /* renamed from: c, reason: collision with root package name */
                    @Y61.k
                    public final String f119250c;

                    /* renamed from: d, reason: collision with root package name */
                    @Y61.k
                    public final AttributedText f119251d;

                    /* renamed from: e, reason: collision with root package name */
                    @l
                    public final DeepLink f119252e;

                    /* compiled from: CodeCheckLink.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<ShowActualizePhones> {
                        @Override // android.os.Parcelable.Creator
                        public final ShowActualizePhones createFromParcel(Parcel parcel) {
                            return new ShowActualizePhones((DeepLink) parcel.readParcelable(ShowActualizePhones.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, (AttributedText) parcel.readParcelable(ShowActualizePhones.class.getClassLoader()));
                        }

                        @Override // android.os.Parcelable.Creator
                        public final ShowActualizePhones[] newArray(int i12) {
                            return new ShowActualizePhones[i12];
                        }
                    }

                    public ShowActualizePhones(@l DeepLink deepLink, @Y61.k String str, boolean z12, @Y61.k AttributedText attributedText) {
                        this.f119249b = z12;
                        this.f119250c = str;
                        this.f119251d = attributedText;
                        this.f119252e = deepLink;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof ShowActualizePhones)) {
                            return false;
                        }
                        ShowActualizePhones showActualizePhones = (ShowActualizePhones) obj;
                        return this.f119249b == showActualizePhones.f119249b && L.f(this.f119250c, showActualizePhones.f119250c) && L.f(this.f119251d, showActualizePhones.f119251d) && L.f(this.f119252e, showActualizePhones.f119252e);
                    }

                    public final int hashCode() {
                        int iB2 = com.avito.android.actions_sheet.a.b(H.d(Boolean.hashCode(this.f119249b) * 31, 31, this.f119250c), 31, this.f119251d);
                        DeepLink deepLink = this.f119252e;
                        return iB2 + (deepLink == null ? 0 : deepLink.hashCode());
                    }

                    @Y61.k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("ShowActualizePhones(isConfirmable=");
                        sb2.append(this.f119249b);
                        sb2.append(", title=");
                        sb2.append(this.f119250c);
                        sb2.append(", description=");
                        sb2.append(this.f119251d);
                        sb2.append(", startLink=");
                        return com.avito.android.actions_sheet.a.v(sb2, this.f119252e, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                        parcel.writeInt(this.f119249b ? 1 : 0);
                        parcel.writeString(this.f119250c);
                        parcel.writeParcelable(this.f119251d, i12);
                        parcel.writeParcelable(this.f119252e, i12);
                    }

                    public /* synthetic */ ShowActualizePhones(boolean z12, String str, AttributedText attributedText, DeepLink deepLink, int i12, C42822w c42822w) {
                        this((i12 & 8) != 0 ? null : deepLink, str, z12, attributedText);
                    }
                }
            }
        }
    }

    public CodeCheckLink(@Y61.k Flow flow, @l Arguments arguments) {
        this.f119241b = flow;
        this.f119242c = arguments;
    }
}
