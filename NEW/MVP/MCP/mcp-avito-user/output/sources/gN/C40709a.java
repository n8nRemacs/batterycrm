package gn;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import com.avito.android.cart_sheet_after_adding.ui.components.B;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartSheetAfterAddingState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lgn/a;", "", "a", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C40709a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C11226a f396789a;

    /* compiled from: CartSheetAfterAddingState.kt */
    @H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn/a$a;", "", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11226a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AttributedText f396790a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<B> f396791b;

        public C11226a(@k AttributedText attributedText, @k List<B> list) {
            this.f396790a = attributedText;
            this.f396791b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11226a)) {
                return false;
            }
            C11226a c11226a = (C11226a) obj;
            return L.f(this.f396790a, c11226a.f396790a) && L.f(this.f396791b, c11226a.f396791b);
        }

        public final int hashCode() {
            return this.f396791b.hashCode() + (this.f396790a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DiscountOnDelivery(text=");
            sb2.append(this.f396790a);
            sb2.append(", progressFractions=");
            return H.p(sb2, this.f396791b, ')');
        }
    }

    public C40709a(@l C11226a c11226a) {
        this.f396789a = c11226a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C40709a) && L.f(this.f396789a, ((C40709a) obj).f396789a);
    }

    public final int hashCode() {
        C11226a c11226a = this.f396789a;
        if (c11226a == null) {
            return 0;
        }
        return c11226a.hashCode();
    }

    @k
    public final String toString() {
        return "BottomFormState(discountOnDelivery=" + this.f396789a + ')';
    }
}
