package com.avito.android.iac_util_deeplinks.public_module;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: RunMultipleLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/RunMultipleLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class RunMultipleLink extends DeepLink {

    @k
    public static final Parcelable.Creator<RunMultipleLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<DeepLink> f169285b;

    /* compiled from: RunMultipleLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RunMultipleLink> {
        @Override // android.os.Parcelable.Creator
        public final RunMultipleLink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(RunMultipleLink.class, parcel, arrayList, iL2, 1);
            }
            return new RunMultipleLink(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RunMultipleLink[] newArray(int i12) {
            return new RunMultipleLink[i12];
        }
    }

    /* compiled from: RunMultipleLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/RunMultipleLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.a {
    }

    public RunMultipleLink() {
        this(null, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RunMultipleLink) && L.f(this.f169285b, ((RunMultipleLink) obj).f169285b);
    }

    public final int hashCode() {
        return this.f169285b.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("RunMultipleLink(nextLinks="), this.f169285b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f169285b, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RunMultipleLink(@k List<? extends DeepLink> list) {
        this.f169285b = list;
    }

    public RunMultipleLink(@k DeepLink... deepLinkArr) {
        this((List<? extends DeepLink>) C42756l.g0(deepLinkArr));
    }

    public RunMultipleLink(List list, int i12, C42822w c42822w) {
        this((List<? extends DeepLink>) ((i12 & 1) != 0 ? C42784z0.f406748b : list));
    }
}
