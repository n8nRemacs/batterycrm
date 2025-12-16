package com.avito.android.iac_util_deeplinks.public_module.checkable_test_link;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: IacCheckableTestLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/checkable_test_link/IacCheckableTestLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "a", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IacCheckableTestLink extends DeepLink implements Parcelable {

    @k
    public static final Parcelable.Creator<IacCheckableTestLink> CREATOR;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static Object f169288c;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f169289b;

    /* compiled from: IacCheckableTestLink.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/checkable_test_link/IacCheckableTestLink$a;", "", "<init>", "()V", "", "Lcom/avito/android/iac_util_deeplinks/public_module/checkable_test_link/IacCheckableTestLink;", "launchedLinks", "Ljava/util/List;", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacCheckableTestLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<IacCheckableTestLink> {
        @Override // android.os.Parcelable.Creator
        public final IacCheckableTestLink createFromParcel(Parcel parcel) {
            return new IacCheckableTestLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IacCheckableTestLink[] newArray(int i12) {
            return new IacCheckableTestLink[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
        f169288c = C42784z0.f406748b;
    }

    public IacCheckableTestLink(@l String str) {
        this.f169289b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IacCheckableTestLink) && L.f(this.f169289b, ((IacCheckableTestLink) obj).f169289b);
    }

    public final int hashCode() {
        String str = this.f169289b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("IacCheckableTestLink(id="), this.f169289b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f169289b);
    }
}
