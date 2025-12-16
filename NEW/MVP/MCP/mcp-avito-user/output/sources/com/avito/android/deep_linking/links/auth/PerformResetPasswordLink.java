package com.avito.android.deep_linking.links.auth;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: SafetyLinks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class PerformResetPasswordLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PerformResetPasswordLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f133933b;

    /* compiled from: SafetyLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PerformResetPasswordLink> {
        @Override // android.os.Parcelable.Creator
        public final PerformResetPasswordLink createFromParcel(Parcel parcel) {
            return new PerformResetPasswordLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PerformResetPasswordLink[] newArray(int i12) {
            return new PerformResetPasswordLink[i12];
        }
    }

    /* compiled from: SafetyLinks.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink$b;", "", "a", "b", "c", "d", "e", "Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink$b$a;", "Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink$b$b;", "Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink$b$c;", "Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink$b$d;", "Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink$b$e;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: SafetyLinks.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink$b$a;", "Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink$b;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f133934b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1839088178;
            }

            @k
            public final String toString() {
                return "CodeCheck";
            }
        }

        /* compiled from: SafetyLinks.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink$b$b;", "Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.auth.PerformResetPasswordLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4026b implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4026b f133935b = new C4026b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C4026b);
            }

            public final int hashCode() {
                return -942601827;
            }

            @k
            public final String toString() {
                return "ErrorHandled";
            }
        }

        /* compiled from: SafetyLinks.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink$b$c;", "Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink$b;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Map<String, String> f133936b;

            public c(@k Map<String, String> map) {
                this.f133936b = map;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f133936b, ((c) obj).f133936b);
            }

            public final int hashCode() {
                return this.f133936b.hashCode();
            }

            @k
            public final String toString() {
                return r.w(new StringBuilder("HighlightErrors(messages="), this.f133936b, ')');
            }
        }

        /* compiled from: SafetyLinks.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink$b$d;", "Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink$b;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements b, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final d f133937b = new d();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1659236246;
            }

            @k
            public final String toString() {
                return "NextLink";
            }
        }

        /* compiled from: SafetyLinks.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink$b$e;", "Lcom/avito/android/deep_linking/links/auth/PerformResetPasswordLink$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class e implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final e f133938b = new e();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return -2115041867;
            }

            @k
            public final String toString() {
                return "UserDialogShown";
            }
        }
    }

    public PerformResetPasswordLink(@k String str) {
        this.f133933b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PerformResetPasswordLink) && L.f(this.f133933b, ((PerformResetPasswordLink) obj).f133933b);
    }

    public final int hashCode() {
        return this.f133933b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("PerformResetPasswordLink(login="), this.f133933b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f133933b);
    }
}
