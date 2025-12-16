package com.avito.android.deep_linking.universal_deeplink;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: UniversalDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/universal_deeplink/UniversalDeepLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "b", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class UniversalDeepLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<UniversalDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Uri f134035b;

    /* compiled from: UniversalDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final UniversalDeepLink createFromParcel(Parcel parcel) {
            return new UniversalDeepLink((Uri) parcel.readParcelable(UniversalDeepLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalDeepLink[] newArray(int i12) {
            return new UniversalDeepLink[i12];
        }
    }

    /* compiled from: UniversalDeepLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/universal_deeplink/UniversalDeepLink$b;", "", "a", "b", "c", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: UniversalDeepLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/universal_deeplink/UniversalDeepLink$b$a;", "LJu/a$a;", "<init>", "()V", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f134036b = new a();
        }

        /* compiled from: UniversalDeepLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/universal_deeplink/UniversalDeepLink$b$b;", "LJu/a$b;", "<init>", "()V", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.universal_deeplink.UniversalDeepLink$b$b, reason: collision with other inner class name */
        public static final class C4031b implements InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4031b f134037b = new C4031b();
        }

        /* compiled from: UniversalDeepLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/universal_deeplink/UniversalDeepLink$b$c;", "LJu/c$a;", "<init>", "()V", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final c f134038b = new c();
        }
    }

    public UniversalDeepLink(@k Uri uri) {
        this.f134035b = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UniversalDeepLink) && L.f(this.f134035b, ((UniversalDeepLink) obj).f134035b);
    }

    public final int hashCode() {
        return this.f134035b.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.t(new StringBuilder("UniversalDeepLink(url="), this.f134035b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f134035b, i12);
    }
}
