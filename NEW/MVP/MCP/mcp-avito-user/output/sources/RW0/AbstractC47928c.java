package rw0;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity.CostInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalculationsInfo.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lrw0/c;", "", "<init>", "()V", "a", "b", "Lrw0/c$a;", "Lrw0/c$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rw0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC47928c {

    /* compiled from: CalculationsInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/c$a;", "Lrw0/c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rw0.c$a */
    public static final /* data */ class a extends AbstractC47928c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final AttributedText f437176a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<CostInfo> f437177b;

        public a(@Y61.k AttributedText attributedText, @Y61.k List<CostInfo> list) {
            super(null);
            this.f437176a = attributedText;
            this.f437177b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f437176a, aVar.f437176a) && L.f(this.f437177b, aVar.f437177b);
        }

        public final int hashCode() {
            return this.f437177b.hashCode() + (this.f437176a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(text=");
            sb2.append(this.f437176a);
            sb2.append(", costInfo=");
            return H.p(sb2, this.f437177b, ')');
        }
    }

    /* compiled from: CalculationsInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrw0/c$b;", "Lrw0/c;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rw0.c$b */
    public static final class b extends AbstractC47928c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f437178a = new b();

        public b() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC47928c(C42822w c42822w) {
        this();
    }

    public AbstractC47928c() {
    }
}
