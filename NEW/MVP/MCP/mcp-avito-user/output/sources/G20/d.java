package G20;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MultiMessageSendState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LG20/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d extends q {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f6246l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final d f6247m = new d(null, true, false, null, false, null, null, false, null, 509, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<F20.c> f6248b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6249c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6250d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f6251e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f6252f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f6253g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<Long> f6254h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6255i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Boolean f6256j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f6257k;

    /* compiled from: MultiMessageSendState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LG20/d$a;", "", "<init>", "()V", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@l List<F20.c> list, boolean z12, boolean z13, @l String str, boolean z14, @l String str2, @k List<Long> list2, boolean z15, @l Boolean bool) {
        this.f6248b = list;
        this.f6249c = z12;
        this.f6250d = z13;
        this.f6251e = str;
        this.f6252f = z14;
        this.f6253g = str2;
        this.f6254h = list2;
        this.f6255i = z15;
        this.f6256j = bool;
        this.f6257k = list2.size() == 3;
    }

    public static d a(d dVar, ArrayList arrayList, boolean z12, boolean z13, String str, boolean z14, String str2, List list, boolean z15, Boolean bool, int i12) {
        List<F20.c> list2 = (i12 & 1) != 0 ? dVar.f6248b : arrayList;
        boolean z16 = (i12 & 2) != 0 ? dVar.f6249c : z12;
        boolean z17 = (i12 & 4) != 0 ? dVar.f6250d : z13;
        String str3 = (i12 & 8) != 0 ? dVar.f6251e : str;
        boolean z18 = (i12 & 16) != 0 ? dVar.f6252f : z14;
        String str4 = (i12 & 32) != 0 ? dVar.f6253g : str2;
        List list3 = (i12 & 64) != 0 ? dVar.f6254h : list;
        boolean z19 = (i12 & 128) != 0 ? dVar.f6255i : z15;
        Boolean bool2 = (i12 & 256) != 0 ? dVar.f6256j : bool;
        dVar.getClass();
        return new d(list2, z16, z17, str3, z18, str4, list3, z19, bool2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f6248b, dVar.f6248b) && this.f6249c == dVar.f6249c && this.f6250d == dVar.f6250d && L.f(this.f6251e, dVar.f6251e) && this.f6252f == dVar.f6252f && L.f(this.f6253g, dVar.f6253g) && L.f(this.f6254h, dVar.f6254h) && this.f6255i == dVar.f6255i && L.f(this.f6256j, dVar.f6256j);
    }

    public final int hashCode() {
        List<F20.c> list = this.f6248b;
        int i12 = r.i(r.i((list == null ? 0 : list.hashCode()) * 31, 31, this.f6249c), 31, this.f6250d);
        String str = this.f6251e;
        int i13 = r.i((i12 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f6252f);
        String str2 = this.f6253g;
        int i14 = r.i(H.e((i13 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f6254h), 31, this.f6255i);
        Boolean bool = this.f6256j;
        return i14 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiMessageSendState(contentData=");
        sb2.append(this.f6248b);
        sb2.append(", isLoading=");
        sb2.append(this.f6249c);
        sb2.append(", isError=");
        sb2.append(this.f6250d);
        sb2.append(", selectedAnchorId=");
        sb2.append(this.f6251e);
        sb2.append(", isSending=");
        sb2.append(this.f6252f);
        sb2.append(", inputText=");
        sb2.append(this.f6253g);
        sb2.append(", selectedItemIds=");
        sb2.append(this.f6254h);
        sb2.append(", isKeyboardOpened=");
        sb2.append(this.f6255i);
        sb2.append(", anchorsIsVisible=");
        return C0.g(sb2, this.f6256j, ')');
    }

    public d(List list, boolean z12, boolean z13, String str, boolean z14, String str2, List list2, boolean z15, Boolean bool, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : list, z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? false : z14, (i12 & 32) != 0 ? null : str2, (i12 & 64) != 0 ? C42784z0.f406748b : list2, (i12 & 128) != 0 ? false : z15, (i12 & 256) != 0 ? null : bool);
    }
}
