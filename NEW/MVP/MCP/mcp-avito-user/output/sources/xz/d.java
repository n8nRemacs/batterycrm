package XZ;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.mvi.q;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageConsultationState.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LXZ/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d extends q {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final a f18912n = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f18913b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f18914c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18915d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f18916e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18917f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<WZ.a> f18918g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18919h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f18920i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f18921j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f18922k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18923l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final WZ.a f18924m;

    /* compiled from: MortgageConsultationState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LXZ/d$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@l String str, @k String str2, boolean z12, @k String str3, boolean z13, @k List<WZ.a> list, boolean z14, boolean z15, @l String str4, @l String str5, int i12) {
        Object next;
        this.f18913b = str;
        this.f18914c = str2;
        this.f18915d = z12;
        this.f18916e = str3;
        this.f18917f = z13;
        this.f18918g = list;
        this.f18919h = z14;
        this.f18920i = z15;
        this.f18921j = str4;
        this.f18922k = str5;
        this.f18923l = i12;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((WZ.a) next).f17943e) {
                    break;
                }
            }
        }
        this.f18924m = (WZ.a) next;
    }

    public static d a(d dVar, String str, boolean z12, String str2, boolean z13, List list, boolean z14, boolean z15, int i12) {
        String str3 = dVar.f18913b;
        String str4 = (i12 & 2) != 0 ? dVar.f18914c : str;
        boolean z16 = (i12 & 4) != 0 ? dVar.f18915d : z12;
        String str5 = (i12 & 8) != 0 ? dVar.f18916e : str2;
        boolean z17 = (i12 & 16) != 0 ? dVar.f18917f : z13;
        List list2 = (i12 & 32) != 0 ? dVar.f18918g : list;
        boolean z18 = (i12 & 64) != 0 ? dVar.f18919h : z14;
        boolean z19 = (i12 & 128) != 0 ? dVar.f18920i : z15;
        String str6 = dVar.f18921j;
        String str7 = dVar.f18922k;
        int i13 = dVar.f18923l;
        dVar.getClass();
        return new d(str3, str4, z16, str5, z17, list2, z18, z19, str6, str7, i13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f18913b, dVar.f18913b) && L.f(this.f18914c, dVar.f18914c) && this.f18915d == dVar.f18915d && L.f(this.f18916e, dVar.f18916e) && this.f18917f == dVar.f18917f && L.f(this.f18918g, dVar.f18918g) && this.f18919h == dVar.f18919h && this.f18920i == dVar.f18920i && L.f(this.f18921j, dVar.f18921j) && L.f(this.f18922k, dVar.f18922k) && this.f18923l == dVar.f18923l;
    }

    public final int hashCode() {
        String str = this.f18913b;
        int i12 = r.i(r.i(H.e(r.i(H.d(r.i(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f18914c), 31, this.f18915d), 31, this.f18916e), 31, this.f18917f), 31, this.f18918g), 31, this.f18919h), 31, this.f18920i);
        String str2 = this.f18921j;
        int iHashCode = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18922k;
        return Integer.hashCode(this.f18923l) + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MortgageConsultationState(applicationId=");
        sb2.append(this.f18913b);
        sb2.append(", fullName=");
        sb2.append(this.f18914c);
        sb2.append(", isFullNameWithError=");
        sb2.append(this.f18915d);
        sb2.append(", phone=");
        sb2.append(this.f18916e);
        sb2.append(", isPhoneWithError=");
        sb2.append(this.f18917f);
        sb2.append(", slots=");
        sb2.append(this.f18918g);
        sb2.append(", isSlotsAssignLoading=");
        sb2.append(this.f18919h);
        sb2.append(", isFormLoading=");
        sb2.append(this.f18920i);
        sb2.append(", fromPage=");
        sb2.append(this.f18921j);
        sb2.append(", role=");
        sb2.append(this.f18922k);
        sb2.append(", callBackId=");
        return r.t(sb2, this.f18923l, ')');
    }
}
