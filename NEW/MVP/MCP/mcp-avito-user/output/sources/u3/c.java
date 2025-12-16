package U3;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AutoFlatsTwoColumnDialogState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LU3/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f16138f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final c f16139g = new c("", null, false, true);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16140b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16141c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f16142d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ArrayList f16143e;

    /* compiled from: AutoFlatsTwoColumnDialogState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU3/c$a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l String str, @l ArrayList arrayList, boolean z12, boolean z13) {
        this.f16140b = z12;
        this.f16141c = z13;
        this.f16142d = str;
        this.f16143e = arrayList;
    }

    public static c a(c cVar, boolean z12, boolean z13) {
        String str = cVar.f16142d;
        cVar.getClass();
        return new c(str, null, z12, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f16140b == cVar.f16140b && this.f16141c == cVar.f16141c && L.f(this.f16142d, cVar.f16142d) && L.f(this.f16143e, cVar.f16143e);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f16140b) * 31, 31, this.f16141c);
        String str = this.f16142d;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        ArrayList arrayList = this.f16143e;
        return iHashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoFlatsTwoColumnDialogState(isError=");
        sb2.append(this.f16140b);
        sb2.append(", isLoading=");
        sb2.append(this.f16141c);
        sb2.append(", bottomSheetTitle=");
        sb2.append(this.f16142d);
        sb2.append(", specItems=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f16143e, ')');
    }
}
