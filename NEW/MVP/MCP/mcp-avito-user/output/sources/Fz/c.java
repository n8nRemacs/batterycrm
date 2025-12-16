package FZ;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.ApiException;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ModelCardState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LFZ/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f4779k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final c f4780l = new c(false, null, null, null, null, null, null, null, null, 511, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4781b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Throwable f4782c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f4783d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f4784e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f4785f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f4786g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f4787h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f4788i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f4789j;

    /* compiled from: ModelCardState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFZ/c$a;", "", "<init>", "()V", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c() {
        this(false, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Throwable] */
    public static c a(c cVar, boolean z12, ApiException apiException, List list, List list2, List list3, int i12) {
        boolean z13 = (i12 & 1) != 0 ? cVar.f4781b : z12;
        ApiException apiException2 = (i12 & 2) != 0 ? cVar.f4782c : apiException;
        String str = cVar.f4783d;
        String str2 = cVar.f4784e;
        String str3 = cVar.f4785f;
        List list4 = (i12 & 32) != 0 ? cVar.f4786g : list;
        List<AbstractC40112a<BeduinModel, InterfaceC40116e>> list5 = cVar.f4787h;
        List list6 = (i12 & 128) != 0 ? cVar.f4788i : list2;
        List list7 = (i12 & 256) != 0 ? cVar.f4789j : list3;
        cVar.getClass();
        return new c(z13, apiException2, str, str2, str3, list4, list5, list6, list7);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4781b == cVar.f4781b && L.f(this.f4782c, cVar.f4782c) && L.f(this.f4783d, cVar.f4783d) && L.f(this.f4784e, cVar.f4784e) && L.f(this.f4785f, cVar.f4785f) && L.f(this.f4786g, cVar.f4786g) && L.f(this.f4787h, cVar.f4787h) && L.f(this.f4788i, cVar.f4788i) && L.f(this.f4789j, cVar.f4789j);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f4781b) * 31;
        Throwable th2 = this.f4782c;
        return this.f4789j.hashCode() + H.e(H.e(H.e(H.d(H.d(H.d((iHashCode + (th2 == null ? 0 : th2.hashCode())) * 31, 31, this.f4783d), 31, this.f4784e), 31, this.f4785f), 31, this.f4786g), 31, this.f4787h), 31, this.f4788i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModelCardState(isLoading=");
        sb2.append(this.f4781b);
        sb2.append(", error=");
        sb2.append(this.f4782c);
        sb2.append(", navBarFormId=");
        sb2.append(this.f4783d);
        sb2.append(", mainFormId=");
        sb2.append(this.f4784e);
        sb2.append(", bottomFormId=");
        sb2.append(this.f4785f);
        sb2.append(", navBarMainComponents=");
        sb2.append(this.f4786g);
        sb2.append(", navBarRightComponents=");
        sb2.append(this.f4787h);
        sb2.append(", bottomComponents=");
        sb2.append(this.f4788i);
        sb2.append(", mainComponents=");
        return H.p(sb2, this.f4789j, ')');
    }

    public c(boolean z12, Throwable th2, String str, String str2, String str3, List list, List list2, List list3, List list4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : th2, (i12 & 4) != 0 ? "" : str, (i12 & 8) != 0 ? "" : str2, (i12 & 16) == 0 ? str3 : "", (i12 & 32) != 0 ? C42784z0.f406748b : list, (i12 & 64) != 0 ? C42784z0.f406748b : list2, (i12 & 128) != 0 ? C42784z0.f406748b : list3, (i12 & 256) != 0 ? C42784z0.f406748b : list4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(boolean z12, @l Throwable th2, @k String str, @k String str2, @k String str3, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list3, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list4) {
        this.f4781b = z12;
        this.f4782c = th2;
        this.f4783d = str;
        this.f4784e = str2;
        this.f4785f = str3;
        this.f4786g = list;
        this.f4787h = list2;
        this.f4788i = list3;
        this.f4789j = list4;
    }
}
