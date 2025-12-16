package com.avito.android.iac_util_deeplinks.public_module.control_flow;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: SetExecutableArgsLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/control_flow/SetExecutableArgsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class SetExecutableArgsLink extends DeepLink {

    @k
    public static final Parcelable.Creator<SetExecutableArgsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f169291b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f169292c;

    /* compiled from: SetExecutableArgsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SetExecutableArgsLink> {
        @Override // android.os.Parcelable.Creator
        public final SetExecutableArgsLink createFromParcel(Parcel parcel) {
            DeepLink deepLink = (DeepLink) parcel.readParcelable(SetExecutableArgsLink.class.getClassLoader());
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = f.c(SetExecutableArgsLink.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
            }
            return new SetExecutableArgsLink(linkedHashMap, deepLink);
        }

        @Override // android.os.Parcelable.Creator
        public final SetExecutableArgsLink[] newArray(int i12) {
            return new SetExecutableArgsLink[i12];
        }
    }

    /* compiled from: SetExecutableArgsLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/control_flow/SetExecutableArgsLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f169293b = new b();
    }

    public SetExecutableArgsLink(@k Map map, @k DeepLink deepLink) {
        this.f169291b = deepLink;
        this.f169292c = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetExecutableArgsLink)) {
            return false;
        }
        SetExecutableArgsLink setExecutableArgsLink = (SetExecutableArgsLink) obj;
        return L.f(this.f169291b, setExecutableArgsLink.f169291b) && L.f(this.f169292c, setExecutableArgsLink.f169292c);
    }

    public final int hashCode() {
        return this.f169292c.hashCode() + (this.f169291b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetExecutableArgsLink(run=");
        sb2.append(this.f169291b);
        sb2.append(", keys=");
        return H.n(sb2, this.f169292c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f169291b, i12);
        Iterator itO = f.o(this.f169292c, parcel);
        while (itO.hasNext()) {
            Map.Entry entry = (Map.Entry) itO.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), i12);
        }
    }
}
