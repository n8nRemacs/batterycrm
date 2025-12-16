package Dz0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SharedViewModelState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LDz0/d;", "", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f3604c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final d f3605d = new d(null, false);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final StrSellerOrdersDialogData f3606a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3607b;

    /* compiled from: SharedViewModelState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDz0/d$a;", "", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@l StrSellerOrdersDialogData strSellerOrdersDialogData, boolean z12) {
        this.f3606a = strSellerOrdersDialogData;
        this.f3607b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f3606a, dVar.f3606a) && this.f3607b == dVar.f3607b;
    }

    public final int hashCode() {
        StrSellerOrdersDialogData strSellerOrdersDialogData = this.f3606a;
        return Boolean.hashCode(this.f3607b) + ((strSellerOrdersDialogData == null ? 0 : strSellerOrdersDialogData.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SharedViewModelState(dialogData=");
        sb2.append(this.f3606a);
        sb2.append(", needsDebounce=");
        return r.x(sb2, this.f3607b, ')');
    }
}
