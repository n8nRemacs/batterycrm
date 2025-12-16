package Bz0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersDialogState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LBz0/d;", "", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bz0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C13211d {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f1842c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C13211d f1843d = new C13211d(C42784z0.f406748b, null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f1844a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final AttributedText f1845b;

    /* compiled from: StrSellerOrdersDialogState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBz0/d$a;", "", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bz0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C13211d(@k List<? extends com.avito.conveyor_item.a> list, @l AttributedText attributedText) {
        this.f1844a = list;
        this.f1845b = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13211d)) {
            return false;
        }
        C13211d c13211d = (C13211d) obj;
        return L.f(this.f1844a, c13211d.f1844a) && L.f(this.f1845b, c13211d.f1845b);
    }

    public final int hashCode() {
        int iHashCode = this.f1844a.hashCode() * 31;
        AttributedText attributedText = this.f1845b;
        return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrSellerOrdersDialogViewState(items=");
        sb2.append(this.f1844a);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f1845b, ')');
    }
}
