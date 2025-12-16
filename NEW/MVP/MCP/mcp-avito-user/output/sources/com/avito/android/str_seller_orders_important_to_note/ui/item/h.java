package com.avito.android.str_seller_orders_important_to_note.ui.item;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderItemView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/ui/item/h;", "LTV0/e;", "a", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface h extends TV0.e {

    /* compiled from: OrderItemView.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/ui/item/h$a;", "", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f291460a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f291461b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f291462c;

        public a(boolean z12, @k String str, @k String str2) {
            this.f291460a = z12;
            this.f291461b = str;
            this.f291462c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f291460a == aVar.f291460a && L.f(this.f291461b, aVar.f291461b) && L.f(this.f291462c, aVar.f291462c);
        }

        public final int hashCode() {
            return this.f291462c.hashCode() + H.d(Boolean.hashCode(this.f291460a) * 31, 31, this.f291461b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonConfig(isVisible=");
            sb2.append(this.f291460a);
            sb2.append(", title=");
            sb2.append(this.f291461b);
            sb2.append(", style=");
            return C22026a.c(sb2, this.f291462c, ')');
        }
    }

    /* compiled from: OrderItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    void CN(@l AttributedText attributedText);

    void N70(@k a aVar, @l Y41.a<G0> aVar2);

    void R(@l AttributedText attributedText);

    void V2();

    void VL(@k a aVar, @l Y41.a<G0> aVar2);

    void a(@k Y41.a<G0> aVar);

    void e(@k AttributedText attributedText);

    void q(@l AttributedText attributedText);

    void r10(@l Image image);

    void tF(@l Image image);
}
