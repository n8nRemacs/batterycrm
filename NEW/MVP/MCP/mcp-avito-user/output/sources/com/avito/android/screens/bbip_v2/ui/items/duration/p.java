package com.avito.android.screens.bbip_v2.ui.items.duration;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.screens.bbip_v2.ui.items.duration.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BbipV2DurationItemViewState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/duration/p;", "", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class p {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f261648e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final p f261649f = new p(C42784z0.f406748b, "", false, null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<b.a> f261650a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f261651b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f261652c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f261653d;

    /* compiled from: BbipV2DurationItemViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/duration/p$a;", "", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public p(@Y61.k List<b.a> list, @Y61.k String str, boolean z12, @Y61.l Integer num) {
        this.f261650a = list;
        this.f261651b = str;
        this.f261652c = z12;
        this.f261653d = num;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return L.f(this.f261650a, pVar.f261650a) && L.f(this.f261651b, pVar.f261651b) && this.f261652c == pVar.f261652c && L.f(this.f261653d, pVar.f261653d);
    }

    public final int hashCode() {
        int i12 = r.i(H.d(this.f261650a.hashCode() * 31, 31, this.f261651b), 31, this.f261652c);
        Integer num = this.f261653d;
        return i12 + (num == null ? 0 : num.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BbipV2DurationItemViewState(items=");
        sb2.append(this.f261650a);
        sb2.append(", moreButtonLabel=");
        sb2.append(this.f261651b);
        sb2.append(", shouldBlockDurations=");
        sb2.append(this.f261652c);
        sb2.append(", indexToScroll=");
        return s.j(sb2, this.f261653d, ')');
    }
}
