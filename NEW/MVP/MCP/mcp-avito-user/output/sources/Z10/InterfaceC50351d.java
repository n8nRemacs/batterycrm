package z10;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OfferItem.kt */
@F3
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lz10/d;", "", "a", "b", "Lz10/d$a;", "Lz10/d$b;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z10.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC50351d {

    /* compiled from: OfferItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz10/d$a;", "Lz10/d;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z10.d$a */
    public static final /* data */ class a implements InterfaceC50351d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC50353f f443778a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f443779b;

        public a(@k InterfaceC50353f interfaceC50353f, @k String str) {
            this.f443778a = interfaceC50353f;
            this.f443779b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f443778a, aVar.f443778a) && L.f(this.f443779b, aVar.f443779b);
        }

        @Override // z10.InterfaceC50351d
        @k
        /* renamed from: getType, reason: from getter */
        public final String getF443779b() {
            return this.f443779b;
        }

        public final int hashCode() {
            return this.f443779b.hashCode() + (this.f443778a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Offer(preview=");
            sb2.append(this.f443778a);
            sb2.append(", type=");
            return C22026a.c(sb2, this.f443779b, ')');
        }
    }

    /* compiled from: OfferItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz10/d$b;", "Lz10/d;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z10.d$b */
    public static final /* data */ class b implements InterfaceC50351d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f443780a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f443781b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final A10.b f443782c;

        public b(@k String str, @k String str2, @k A10.b bVar) {
            this.f443780a = str;
            this.f443781b = str2;
            this.f443782c = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f443780a, bVar.f443780a) && L.f(this.f443781b, bVar.f443781b) && L.f(this.f443782c, bVar.f443782c);
        }

        @Override // z10.InterfaceC50351d
        @k
        /* renamed from: getType */
        public final String getF443779b() {
            return "teaser";
        }

        public final int hashCode() {
            return this.f443782c.hashCode() + H.d(this.f443780a.hashCode() * 31, 31, this.f443781b);
        }

        @k
        public final String toString() {
            return "Teaser(title=" + this.f443780a + ", imageUrl=" + this.f443781b + ", action=" + this.f443782c + ')';
        }
    }

    @k
    /* renamed from: getType */
    String getF443779b();
}
