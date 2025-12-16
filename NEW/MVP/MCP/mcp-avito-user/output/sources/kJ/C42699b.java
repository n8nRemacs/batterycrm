package kj;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.ownership.Owners;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinAnalyticsInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkj/b;", "", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kj.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C42699b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f406549a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<Owners> f406550b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f406551c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f406552d;

    /* JADX WARN: Multi-variable type inference failed */
    public C42699b(@l String str, @k List<? extends Owners> list, @l String str2, boolean z12) {
        this.f406549a = str;
        this.f406550b = list;
        this.f406551c = str2;
        this.f406552d = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42699b)) {
            return false;
        }
        C42699b c42699b = (C42699b) obj;
        return L.f(this.f406549a, c42699b.f406549a) && L.f(this.f406550b, c42699b.f406550b) && L.f(this.f406551c, c42699b.f406551c) && this.f406552d == c42699b.f406552d;
    }

    public final int hashCode() {
        String str = this.f406549a;
        int iE2 = H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f406550b);
        String str2 = this.f406551c;
        return Boolean.hashCode(this.f406552d) + ((iE2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinAnalyticsInfo(screenName=");
        sb2.append(this.f406549a);
        sb2.append(", owners=");
        sb2.append(this.f406550b);
        sb2.append(", featureName=");
        sb2.append(this.f406551c);
        sb2.append(", contentTrackingEnabled=");
        return r.x(sb2, this.f406552d, ')');
    }

    public /* synthetic */ C42699b(String str, List list, String str2, boolean z12, int i12, C42822w c42822w) {
        this(str, list, str2, (i12 & 8) != 0 ? true : z12);
    }
}
