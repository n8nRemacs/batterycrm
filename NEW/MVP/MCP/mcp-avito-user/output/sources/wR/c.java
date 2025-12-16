package wR;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.lib.design.chips.h;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import tR.C48597a;

/* compiled from: LfLevelsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LwR/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c extends q {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f441444k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final c f441445l;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f441446b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f441447c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<h> f441448d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C48597a f441449e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f441450f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Map<Integer, List<com.avito.conveyor_item.a>> f441451g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f441452h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f441453i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f441454j;

    /* compiled from: LfLevelsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwR/c$a;", "", "<init>", "()V", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f441445l = new c(null, null, c42784z0, null, c42784z0, P0.c(), null, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@l String str, @l AttributedText attributedText, @k List<? extends h> list, @l C48597a c48597a, @k List<? extends com.avito.conveyor_item.a> list2, @k Map<Integer, ? extends List<? extends com.avito.conveyor_item.a>> map, @l String str2, boolean z12, boolean z13) {
        this.f441446b = str;
        this.f441447c = attributedText;
        this.f441448d = list;
        this.f441449e = c48597a;
        this.f441450f = list2;
        this.f441451g = map;
        this.f441452h = str2;
        this.f441453i = z12;
        this.f441454j = z13;
    }

    public static c a(c cVar, String str, AttributedText attributedText, List list, C48597a c48597a, List list2, Map map, String str2, boolean z12, boolean z13, int i12) {
        String str3 = (i12 & 1) != 0 ? cVar.f441446b : str;
        AttributedText attributedText2 = (i12 & 2) != 0 ? cVar.f441447c : attributedText;
        List list3 = (i12 & 4) != 0 ? cVar.f441448d : list;
        C48597a c48597a2 = (i12 & 8) != 0 ? cVar.f441449e : c48597a;
        List list4 = (i12 & 16) != 0 ? cVar.f441450f : list2;
        Map map2 = (i12 & 32) != 0 ? cVar.f441451g : map;
        String str4 = (i12 & 64) != 0 ? cVar.f441452h : str2;
        boolean z14 = (i12 & 128) != 0 ? cVar.f441453i : z12;
        boolean z15 = (i12 & 256) != 0 ? cVar.f441454j : z13;
        cVar.getClass();
        return new c(str3, attributedText2, list3, c48597a2, list4, map2, str4, z14, z15);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f441446b, cVar.f441446b) && L.f(this.f441447c, cVar.f441447c) && L.f(this.f441448d, cVar.f441448d) && L.f(this.f441449e, cVar.f441449e) && L.f(this.f441450f, cVar.f441450f) && L.f(this.f441451g, cVar.f441451g) && L.f(this.f441452h, cVar.f441452h) && this.f441453i == cVar.f441453i && this.f441454j == cVar.f441454j;
    }

    public final int hashCode() {
        String str = this.f441446b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f441447c;
        int iE2 = H.e((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f441448d);
        C48597a c48597a = this.f441449e;
        int iC2 = AK.c.c(H.e((iE2 + (c48597a == null ? 0 : c48597a.hashCode())) * 31, 31, this.f441450f), 31, this.f441451g);
        String str2 = this.f441452h;
        return Boolean.hashCode(this.f441454j) + r.i((iC2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f441453i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LfLevelsState(title=");
        sb2.append(this.f441446b);
        sb2.append(", description=");
        sb2.append(this.f441447c);
        sb2.append(", levels=");
        sb2.append(this.f441448d);
        sb2.append(", activeLevel=");
        sb2.append(this.f441449e);
        sb2.append(", items=");
        sb2.append(this.f441450f);
        sb2.append(", setItems=");
        sb2.append(this.f441451g);
        sb2.append(", error=");
        sb2.append(this.f441452h);
        sb2.append(", isLoading=");
        sb2.append(this.f441453i);
        sb2.append(", isPostLoading=");
        return r.x(sb2, this.f441454j, ')');
    }
}
