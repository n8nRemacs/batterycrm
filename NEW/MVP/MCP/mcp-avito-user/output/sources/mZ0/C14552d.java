package Mz0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MonthSelectorState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LMz0/d;", "", "a", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mz0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C14552d {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f11163c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C14552d f11164d = new C14552d(null, C42784z0.f406748b);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final PrintableText f11165a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f11166b;

    /* compiled from: MonthSelectorState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMz0/d$a;", "", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mz0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14552d(@l PrintableText printableText, @k List<? extends com.avito.conveyor_item.a> list) {
        this.f11165a = printableText;
        this.f11166b = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14552d)) {
            return false;
        }
        C14552d c14552d = (C14552d) obj;
        return L.f(this.f11165a, c14552d.f11165a) && L.f(this.f11166b, c14552d.f11166b);
    }

    public final int hashCode() {
        PrintableText printableText = this.f11165a;
        return this.f11166b.hashCode() + ((printableText == null ? 0 : printableText.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MonthSelectorViewState(title=");
        sb2.append(this.f11165a);
        sb2.append(", items=");
        return H.n(sb2, this.f11166b, ')');
    }
}
