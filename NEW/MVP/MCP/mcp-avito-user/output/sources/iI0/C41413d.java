package ii0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.inline_filters.dialog.select.adapter.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DistrictState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lii0/d;", "", "a", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ii0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C41413d {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f398698e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final C41413d f398699f;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<i> f398700a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f398701b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<i> f398702c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f398703d;

    /* compiled from: DistrictState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lii0/d$a;", "", "<init>", "()V", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ii0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f398699f = new C41413d("", false, c42784z0, c42784z0);
    }

    public C41413d(@k String str, boolean z12, @k List list, @k List list2) {
        this.f398700a = list;
        this.f398701b = str;
        this.f398702c = list2;
        this.f398703d = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C41413d a(C41413d c41413d, List list, String str, ArrayList arrayList, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            list = c41413d.f398700a;
        }
        if ((i12 & 2) != 0) {
            str = c41413d.f398701b;
        }
        List list2 = arrayList;
        if ((i12 & 4) != 0) {
            list2 = c41413d.f398702c;
        }
        if ((i12 & 8) != 0) {
            z12 = c41413d.f398703d;
        }
        c41413d.getClass();
        return new C41413d(str, z12, list, list2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41413d)) {
            return false;
        }
        C41413d c41413d = (C41413d) obj;
        return L.f(this.f398700a, c41413d.f398700a) && L.f(this.f398701b, c41413d.f398701b) && L.f(this.f398702c, c41413d.f398702c) && this.f398703d == c41413d.f398703d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f398703d) + H.e(H.d(this.f398700a.hashCode() * 31, 31, this.f398701b), 31, this.f398702c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DistrictState(items=");
        sb2.append(this.f398700a);
        sb2.append(", lastQueryString=");
        sb2.append(this.f398701b);
        sb2.append(", shownItems=");
        sb2.append(this.f398702c);
        sb2.append(", isResetButtonClickable=");
        return r.x(sb2, this.f398703d, ')');
    }
}
