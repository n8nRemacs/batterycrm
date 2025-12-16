package Bz0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.StrSellerOrder;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersDialogState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LBz0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bz0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C13210c extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f1836f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C13210c f1837g;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f1838b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<StrSellerOrder> f1839c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1840d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C13211d f1841e;

    /* compiled from: StrSellerOrdersDialogState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBz0/c$a;", "", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bz0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        C13211d.f1842c.getClass();
        f1837g = new C13210c(null, c42784z0, false, C13211d.f1843d);
    }

    public C13210c(@l AttributedText attributedText, @k List<StrSellerOrder> list, boolean z12, @k C13211d c13211d) {
        this.f1838b = attributedText;
        this.f1839c = list;
        this.f1840d = z12;
        this.f1841e = c13211d;
    }

    public static C13210c a(C13210c c13210c, AttributedText attributedText, List list, boolean z12, C13211d c13211d, int i12) {
        if ((i12 & 1) != 0) {
            attributedText = c13210c.f1838b;
        }
        if ((i12 & 2) != 0) {
            list = c13210c.f1839c;
        }
        if ((i12 & 4) != 0) {
            z12 = c13210c.f1840d;
        }
        if ((i12 & 8) != 0) {
            c13211d = c13210c.f1841e;
        }
        c13210c.getClass();
        return new C13210c(attributedText, list, z12, c13211d);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13210c)) {
            return false;
        }
        C13210c c13210c = (C13210c) obj;
        return L.f(this.f1838b, c13210c.f1838b) && L.f(this.f1839c, c13210c.f1839c) && this.f1840d == c13210c.f1840d && L.f(this.f1841e, c13210c.f1841e);
    }

    public final int hashCode() {
        AttributedText attributedText = this.f1838b;
        return this.f1841e.hashCode() + r.i(H.e((attributedText == null ? 0 : attributedText.hashCode()) * 31, 31, this.f1839c), 31, this.f1840d);
    }

    @k
    public final String toString() {
        return "StrSellerOrdersDialogState(title=" + this.f1838b + ", orders=" + this.f1839c + ", isLoading=" + this.f1840d + ", viewState=" + this.f1841e + ')';
    }
}
