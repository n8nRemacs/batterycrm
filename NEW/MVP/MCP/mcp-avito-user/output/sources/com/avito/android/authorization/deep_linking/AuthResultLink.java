package com.avito.android.authorization.deep_linking;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.AuthResult;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: AuthResultLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/deep_linking/AuthResultLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class AuthResultLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<AuthResultLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AuthResult f93662b;

    /* compiled from: AuthResultLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AuthResultLink> {
        @Override // android.os.Parcelable.Creator
        public final AuthResultLink createFromParcel(Parcel parcel) {
            return new AuthResultLink((AuthResult) parcel.readParcelable(AuthResultLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AuthResultLink[] newArray(int i12) {
            return new AuthResultLink[i12];
        }
    }

    /* compiled from: AuthResultLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/authorization/deep_linking/AuthResultLink$b;", "", "a", "b", "c", "Lcom/avito/android/authorization/deep_linking/AuthResultLink$b$a;", "Lcom/avito/android/authorization/deep_linking/AuthResultLink$b$b;", "Lcom/avito/android/authorization/deep_linking/AuthResultLink$b$c;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: AuthResultLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/authorization/deep_linking/AuthResultLink$b$a;", "LJu/c$a;", "Lcom/avito/android/authorization/deep_linking/AuthResultLink$b;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.a, b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f93663b = new a();
        }

        /* compiled from: AuthResultLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/authorization/deep_linking/AuthResultLink$b$b;", "LJu/c$b;", "Lcom/avito/android/authorization/deep_linking/AuthResultLink$b;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.authorization.deep_linking.AuthResultLink$b$b, reason: collision with other inner class name */
        public static final class C2776b implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C2776b f93664b = new C2776b();
        }

        /* compiled from: AuthResultLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/authorization/deep_linking/AuthResultLink$b$c;", "LJu/c$a;", "Lcom/avito/android/authorization/deep_linking/AuthResultLink$b;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC14249c.a, b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f93665b = new c();
        }
    }

    public AuthResultLink(@Y61.l AuthResult authResult) {
        this.f93662b = authResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AuthResultLink) && kotlin.jvm.internal.L.f(this.f93662b, ((AuthResultLink) obj).f93662b);
    }

    public final int hashCode() {
        AuthResult authResult = this.f93662b;
        if (authResult == null) {
            return 0;
        }
        return authResult.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "AuthResultLink(authResult=" + this.f93662b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f93662b, i12);
    }
}
