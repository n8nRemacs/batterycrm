package com.avito.android.cjm_pro.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CjmProDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cjm_pro/deeplink/CjmProDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_cjm-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CjmProDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<CjmProDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f118512b;

    /* compiled from: CjmProDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CjmProDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final CjmProDeepLink createFromParcel(Parcel parcel) {
            return new CjmProDeepLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CjmProDeepLink[] newArray(int i12) {
            return new CjmProDeepLink[i12];
        }
    }

    /* compiled from: CjmProDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cjm_pro/deeplink/CjmProDeepLink$b;", "", "a", "b", "Lcom/avito/android/cjm_pro/deeplink/CjmProDeepLink$b$a;", "Lcom/avito/android/cjm_pro/deeplink/CjmProDeepLink$b$b;", "_avito_cjm-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: CjmProDeepLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cjm_pro/deeplink/CjmProDeepLink$b$a;", "Lcom/avito/android/cjm_pro/deeplink/CjmProDeepLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_cjm-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f118513b = new a();
        }

        /* compiled from: CjmProDeepLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cjm_pro/deeplink/CjmProDeepLink$b$b;", "Lcom/avito/android/cjm_pro/deeplink/CjmProDeepLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_cjm-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.cjm_pro.deeplink.CjmProDeepLink$b$b, reason: collision with other inner class name */
        public static final class C3451b implements b, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C3451b f118514b = new C3451b();
        }
    }

    public CjmProDeepLink(@l String str) {
        this.f118512b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CjmProDeepLink) && L.f(this.f118512b, ((CjmProDeepLink) obj).f118512b);
    }

    public final int hashCode() {
        String str = this.f118512b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("CjmProDeepLink(remoteContext="), this.f118512b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f118512b);
    }
}
