package com.avito.android.iac_util_deeplinks.public_module;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: IgnoreInDialogRouterLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/IgnoreInDialogRouterLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class IgnoreInDialogRouterLink extends DeepLink {

    @k
    public static final Parcelable.Creator<IgnoreInDialogRouterLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f169246b;

    /* compiled from: IgnoreInDialogRouterLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IgnoreInDialogRouterLink> {
        @Override // android.os.Parcelable.Creator
        public final IgnoreInDialogRouterLink createFromParcel(Parcel parcel) {
            return new IgnoreInDialogRouterLink((DeepLink) parcel.readParcelable(IgnoreInDialogRouterLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final IgnoreInDialogRouterLink[] newArray(int i12) {
            return new IgnoreInDialogRouterLink[i12];
        }
    }

    /* compiled from: IgnoreInDialogRouterLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/IgnoreInDialogRouterLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.a {
    }

    public IgnoreInDialogRouterLink(@k DeepLink deepLink) {
        this.f169246b = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IgnoreInDialogRouterLink) && L.f(this.f169246b, ((IgnoreInDialogRouterLink) obj).f169246b);
    }

    public final int hashCode() {
        return this.f169246b.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.v(new StringBuilder("IgnoreInDialogRouterLink(next="), this.f169246b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f169246b, i12);
    }
}
