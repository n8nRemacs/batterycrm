package ZF0;

import RF0.f;
import RF0.h;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"LZF0/e;", "", "<init>", "()V", "a", "b", "c", "d", "LZF0/e$b;", "LZF0/e$c;", "LZF0/e$d;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f20053a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final d f20054b = new d(R.drawable.ic_back_24);

    /* compiled from: TrxPromoState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZF0/e$a;", "", "<init>", "()V", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TrxPromoState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZF0/e$b;", "LZF0/e;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* renamed from: c, reason: collision with root package name */
        public final int f20055c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final RF0.k f20056d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f20057e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final List<h> f20058f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final AttributedText f20059g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final f f20060h;

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i12, @l RF0.k kVar, @k List<? extends com.avito.conveyor_item.a> list, @k List<h> list2, @l AttributedText attributedText, @k f fVar) {
            super(null);
            this.f20055c = i12;
            this.f20056d = kVar;
            this.f20057e = list;
            this.f20058f = list2;
            this.f20059g = attributedText;
            this.f20060h = fVar;
        }

        @Override // ZF0.e
        @l
        /* renamed from: a, reason: from getter */
        public final RF0.k getF20056d() {
            return this.f20056d;
        }

        @Override // ZF0.e
        /* renamed from: b, reason: from getter */
        public final int getF20063c() {
            return this.f20055c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f20055c == bVar.f20055c && L.f(this.f20056d, bVar.f20056d) && L.f(this.f20057e, bVar.f20057e) && L.f(this.f20058f, bVar.f20058f) && L.f(this.f20059g, bVar.f20059g) && L.f(this.f20060h, bVar.f20060h);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f20055c) * 31;
            RF0.k kVar = this.f20056d;
            int iE2 = H.e(H.e((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31, 31, this.f20057e), 31, this.f20058f);
            AttributedText attributedText = this.f20059g;
            return this.f20060h.hashCode() + ((iE2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            return "Content(navigationIcon=" + this.f20055c + ", navBar=" + this.f20056d + ", items=" + this.f20057e + ", buttonActions=" + this.f20058f + ", agreement=" + this.f20059g + ", datePickerInfo=" + this.f20060h + ')';
        }
    }

    /* compiled from: TrxPromoState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZF0/e$c;", "LZF0/e;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends e {

        /* renamed from: c, reason: collision with root package name */
        public final int f20061c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f20062d;

        public c(int i12, @k String str) {
            super(null);
            this.f20061c = i12;
            this.f20062d = str;
        }

        @Override // ZF0.e
        @l
        /* renamed from: a */
        public final RF0.k getF20056d() {
            return null;
        }

        @Override // ZF0.e
        /* renamed from: b, reason: from getter */
        public final int getF20063c() {
            return this.f20061c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f20061c == cVar.f20061c && L.f(null, null) && L.f(this.f20062d, cVar.f20062d);
        }

        public final int hashCode() {
            return this.f20062d.hashCode() + (Integer.hashCode(this.f20061c) * 961);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(navigationIcon=");
            sb2.append(this.f20061c);
            sb2.append(", navBar=null, message=");
            return C22026a.c(sb2, this.f20062d, ')');
        }
    }

    /* compiled from: TrxPromoState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZF0/e$d;", "LZF0/e;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends e {

        /* renamed from: c, reason: collision with root package name */
        public final int f20063c;

        public d(int i12) {
            super(null);
            this.f20063c = i12;
        }

        @Override // ZF0.e
        @l
        /* renamed from: a */
        public final RF0.k getF20056d() {
            return null;
        }

        @Override // ZF0.e
        /* renamed from: b, reason: from getter */
        public final int getF20063c() {
            return this.f20063c;
        }
    }

    public /* synthetic */ e(C42822w c42822w) {
        this();
    }

    @l
    /* renamed from: a */
    public abstract RF0.k getF20056d();

    /* renamed from: b */
    public abstract int getF20063c();

    public e() {
    }
}
