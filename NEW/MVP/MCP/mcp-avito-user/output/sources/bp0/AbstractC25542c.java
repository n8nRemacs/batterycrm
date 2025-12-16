package bP0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TopUpFormScreenState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LbP0/c;", "", "<init>", "()V", "a", "b", "LbP0/c$a;", "LbP0/c$b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bP0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25542c {

    /* compiled from: TopUpFormScreenState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbP0/c$a;", "LbP0/c;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bP0.c$a */
    public static final /* data */ class a extends AbstractC25542c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57057a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<TV0.a> f57058b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f57059c;

        public /* synthetic */ a(String str, List list, boolean z12, int i12, C42822w c42822w) {
            this(str, list, (i12 & 4) != 0 ? false : z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f57057a, aVar.f57057a) && L.f(this.f57058b, aVar.f57058b) && this.f57059c == aVar.f57059c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57059c) + H.e(this.f57057a.hashCode() * 31, 31, this.f57058b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(title=");
            sb2.append(this.f57057a);
            sb2.append(", items=");
            sb2.append(this.f57058b);
            sb2.append(", forceKeyboard=");
            return r.x(sb2, this.f57059c, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k String str, @k List<? extends TV0.a> list, boolean z12) {
            super(null);
            this.f57057a = str;
            this.f57058b = list;
            this.f57059c = z12;
        }
    }

    /* compiled from: TopUpFormScreenState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LbP0/c$b;", "LbP0/c;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bP0.c$b */
    public static final /* data */ class b extends AbstractC25542c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f57060a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -17507867;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ AbstractC25542c(C42822w c42822w) {
        this();
    }

    public AbstractC25542c() {
    }
}
