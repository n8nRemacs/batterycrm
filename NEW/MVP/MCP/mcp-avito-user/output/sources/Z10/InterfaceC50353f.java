package z10;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: OfferPreview.kt */
@F3
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lz10/f;", "", "b", "c", "d", "Lz10/f$b;", "Lz10/f$c;", "Lz10/f$d;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z10.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC50353f {

    /* compiled from: OfferPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z10.f$a */
    public static final class a {
    }

    /* compiled from: OfferPreview.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz10/f$c;", "Lz10/f;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z10.f$c */
    public static final /* data */ class c implements InterfaceC50353f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AttributedText f443786a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f443787b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f443788c;

        public c(@k AttributedText attributedText, @k String str, @k String str2) {
            this.f443786a = attributedText;
            this.f443787b = str;
            this.f443788c = str2;
        }

        @Override // z10.InterfaceC50353f
        @l
        public final b a() {
            return null;
        }

        @Override // z10.InterfaceC50353f
        @l
        public final d b() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f443786a, cVar.f443786a) && L.f(this.f443787b, cVar.f443787b) && L.f(this.f443788c, cVar.f443788c);
        }

        public final int hashCode() {
            return this.f443788c.hashCode() + H.d(this.f443786a.hashCode() * 31, 31, this.f443787b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NothingFound(title=");
            sb2.append(this.f443786a);
            sb2.append(", errorTitle=");
            sb2.append(this.f443787b);
            sb2.append(", errorDescription=");
            return C22026a.c(sb2, this.f443788c, ')');
        }
    }

    @l
    b a();

    @l
    d b();

    /* compiled from: OfferPreview.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz10/f$b;", "Lz10/f;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z10.f$b */
    public static final /* data */ class b implements InterfaceC50353f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AttributedText f443783a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f443784b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final A10.a f443785c;

        public b(@k AttributedText attributedText, @k String str, @k A10.a aVar) {
            this.f443783a = attributedText;
            this.f443784b = str;
            this.f443785c = aVar;
        }

        @Override // z10.InterfaceC50353f
        @l
        public final d b() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f443783a, bVar.f443783a) && L.f(this.f443784b, bVar.f443784b) && L.f(this.f443785c, bVar.f443785c);
        }

        public final int hashCode() {
            return this.f443785c.hashCode() + H.d(this.f443783a.hashCode() * 31, 31, this.f443784b);
        }

        @k
        public final String toString() {
            return "LimitsFailure(title=" + this.f443783a + ", hint=" + this.f443784b + ", action=" + this.f443785c + ')';
        }

        @Override // z10.InterfaceC50353f
        @l
        public final b a() {
            return this;
        }
    }

    /* compiled from: OfferPreview.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz10/f$d;", "Lz10/f;", "_avito_mortgage-calculator_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z10.f$d */
    public static final /* data */ class d implements InterfaceC50353f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AttributedText f443789a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final B10.e f443790b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final B10.b f443791c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f443792d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f443793e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final B10.b f443794f;

        public d(@k AttributedText attributedText, @k B10.e eVar, @l B10.b bVar, @k ArrayList arrayList, @l String str) {
            List<B10.a> list;
            this.f443789a = attributedText;
            this.f443790b = eVar;
            this.f443791c = bVar;
            this.f443792d = arrayList;
            this.f443793e = str;
            if (bVar == null || (list = bVar.f795b) == null) {
                bVar = null;
            } else if (list.size() > 1) {
                B10.a aVar = (B10.a) C42745f0.E(list);
                bVar = new B10.b(bVar.f794a, Collections.singletonList(new B10.a(aVar.f790a, aVar.f791b, aVar.f792c, com.avito.android.printable_text.b.b(R.plurals.discounts_summary, list.size(), Integer.valueOf(list.size())))));
            }
            this.f443794f = bVar;
        }

        @Override // z10.InterfaceC50353f
        @l
        public final b a() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f443789a, dVar.f443789a) && this.f443790b.equals(dVar.f443790b) && L.f(this.f443791c, dVar.f443791c) && this.f443792d.equals(dVar.f443792d) && L.f(this.f443793e, dVar.f443793e);
        }

        public final int hashCode() {
            int iHashCode = (this.f443790b.hashCode() + (this.f443789a.hashCode() * 31)) * 31;
            B10.b bVar = this.f443791c;
            int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f443792d, (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
            String str = this.f443793e;
            return iG2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Success(title=");
            sb2.append(this.f443789a);
            sb2.append(", paymentOffer=");
            sb2.append(this.f443790b);
            sb2.append(", allBadgesBlock=");
            sb2.append(this.f443791c);
            sb2.append(", conditions=");
            sb2.append(this.f443792d);
            sb2.append(", hint=");
            return C22026a.c(sb2, this.f443793e, ')');
        }

        @Override // z10.InterfaceC50353f
        @l
        public final d b() {
            return this;
        }
    }
}
