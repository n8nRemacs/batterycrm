package com.avito.android.iac_dialer_models.abstract_module;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacPeerInfo.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacPeerInfo;", "Landroid/os/Parcelable;", "a", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacPeerInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<IacPeerInfo> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f166868b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f166869c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Image f166870d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<IacPeerBadge> f166871e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f166872f;

    /* compiled from: IacPeerInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacPeerInfo$a;", "", "<init>", "()V", "", "SUPPORT_USER_ID", "Ljava/lang/String;", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacPeerInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<IacPeerInfo> {
        @Override // android.os.Parcelable.Creator
        public final IacPeerInfo createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(IacPeerInfo.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(IacPeerInfo.class, parcel, arrayList, iL2, 1);
            }
            return new IacPeerInfo(image, string, string2, parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final IacPeerInfo[] newArray(int i12) {
            return new IacPeerInfo[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public IacPeerInfo(@l Image image, @k String str, @l String str2, @k String str3, @k List list) {
        this.f166868b = str;
        this.f166869c = str2;
        this.f166870d = image;
        this.f166871e = list;
        this.f166872f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacPeerInfo)) {
            return false;
        }
        IacPeerInfo iacPeerInfo = (IacPeerInfo) obj;
        return L.f(this.f166868b, iacPeerInfo.f166868b) && L.f(this.f166869c, iacPeerInfo.f166869c) && L.f(this.f166870d, iacPeerInfo.f166870d) && L.f(this.f166871e, iacPeerInfo.f166871e) && L.f(this.f166872f, iacPeerInfo.f166872f);
    }

    public final int hashCode() {
        int iHashCode = this.f166868b.hashCode() * 31;
        String str = this.f166869c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.f166870d;
        return this.f166872f.hashCode() + H.e((iHashCode2 + (image != null ? image.hashCode() : 0)) * 31, 31, this.f166871e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacPeerInfo(userId=");
        sb2.append(this.f166868b);
        sb2.append(", displayName=");
        String str = this.f166869c;
        sb2.append(str != null ? new IacPiiString(str) : null);
        sb2.append(", avatar=");
        Image image = this.f166870d;
        sb2.append(image != null ? new IacPiiImage(image) : null);
        sb2.append(')');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f166868b);
        parcel.writeString(this.f166869c);
        parcel.writeParcelable(this.f166870d, i12);
        Iterator itJ = C0.j(this.f166871e, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f166872f);
    }
}
