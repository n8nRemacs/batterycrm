package bz0;

import TV0.e;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderItemView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lbz0/b;", "LTV0/e;", "a", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC25739b extends e {

    /* compiled from: OrderItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbz0/b$a;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bz0.b$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f57590a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f57591b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f57592c;

        public a(boolean z12, @k String str, @k String str2) {
            this.f57590a = z12;
            this.f57591b = str;
            this.f57592c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f57590a == aVar.f57590a && L.f(this.f57591b, aVar.f57591b) && L.f(this.f57592c, aVar.f57592c);
        }

        public final int hashCode() {
            return this.f57592c.hashCode() + H.d(Boolean.hashCode(this.f57590a) * 31, 31, this.f57591b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonConfig(isVisible=");
            sb2.append(this.f57590a);
            sb2.append(", title=");
            sb2.append(this.f57591b);
            sb2.append(", style=");
            return C22026a.c(sb2, this.f57592c, ')');
        }
    }

    /* compiled from: OrderItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bz0.b$b, reason: collision with other inner class name */
    public static final class C2024b {
    }

    void B0(@l String str);

    void BT(@k a aVar, @l Y41.a<G0> aVar2);

    void V2();

    void Yt(@l String str);

    void a(@k Y41.a<G0> aVar);

    void gN(@k a aVar, @l Y41.a<G0> aVar2);

    void j(@l String str);

    void mO(@l String str);

    void q(@l AttributedText attributedText);

    void q20(@l String str);

    void setTitle(@k String str);
}
