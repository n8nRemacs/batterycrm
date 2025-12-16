package R00;

import R00.a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mortgage.api.model.DictionariesResult;
import com.avito.android.mortgage.pre_approval.form.model.PreApprovalFormStep;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PreApprovalFormState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LR00/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f14054h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final b f14055i;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<String, P00.a> f14056b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DictionariesResult f14057c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PreApprovalFormStep f14058d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f14059e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final R00.a f14060f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final c f14061g;

    /* compiled from: PreApprovalFormState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LR00/b$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        Map mapC = P0.c();
        PreApprovalFormStep preApprovalFormStep = PreApprovalFormStep.f201845d;
        a.c cVar = a.c.f14053a;
        f14055i = new b(mapC, null, preApprovalFormStep, null, cVar, new c(com.avito.android.printable_text.b.c(R.string.mortgage_pre_approval_screen_title, Integer.valueOf(preApprovalFormStep.f201851b), Integer.valueOf(((AbstractC42734a) PreApprovalFormStep.f201850i).getF406718e())), C42784z0.f406748b, false, com.avito.android.printable_text.b.c(R.string.next, new Serializable[0]), cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k Map<String, ? extends P00.a> map, @l DictionariesResult dictionariesResult, @k PreApprovalFormStep preApprovalFormStep, @l String str, @k R00.a aVar, @k c cVar) {
        this.f14056b = map;
        this.f14057c = dictionariesResult;
        this.f14058d = preApprovalFormStep;
        this.f14059e = str;
        this.f14060f = aVar;
        this.f14061g = cVar;
    }

    public static b a(b bVar, Map map, DictionariesResult dictionariesResult, PreApprovalFormStep preApprovalFormStep, String str, R00.a aVar, c cVar, int i12) {
        if ((i12 & 1) != 0) {
            map = bVar.f14056b;
        }
        Map map2 = map;
        if ((i12 & 2) != 0) {
            dictionariesResult = bVar.f14057c;
        }
        DictionariesResult dictionariesResult2 = dictionariesResult;
        if ((i12 & 4) != 0) {
            preApprovalFormStep = bVar.f14058d;
        }
        PreApprovalFormStep preApprovalFormStep2 = preApprovalFormStep;
        if ((i12 & 8) != 0) {
            str = bVar.f14059e;
        }
        String str2 = str;
        if ((i12 & 16) != 0) {
            aVar = bVar.f14060f;
        }
        R00.a aVar2 = aVar;
        if ((i12 & 32) != 0) {
            cVar = bVar.f14061g;
        }
        bVar.getClass();
        return new b(map2, dictionariesResult2, preApprovalFormStep2, str2, aVar2, cVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f14056b, bVar.f14056b) && L.f(this.f14057c, bVar.f14057c) && this.f14058d == bVar.f14058d && L.f(this.f14059e, bVar.f14059e) && L.f(this.f14060f, bVar.f14060f) && L.f(this.f14061g, bVar.f14061g);
    }

    public final int hashCode() {
        int iHashCode = this.f14056b.hashCode() * 31;
        DictionariesResult dictionariesResult = this.f14057c;
        int iHashCode2 = (this.f14058d.hashCode() + ((iHashCode + (dictionariesResult == null ? 0 : dictionariesResult.hashCode())) * 31)) * 31;
        String str = this.f14059e;
        return this.f14061g.hashCode() + ((this.f14060f.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "PreApprovalFormState(data=" + this.f14056b + ", dictionaries=" + this.f14057c + ", step=" + this.f14058d + ", source=" + this.f14059e + ", loadingState=" + this.f14060f + ", viewState=" + this.f14061g + ')';
    }
}
