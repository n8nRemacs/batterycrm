package Z40;

import Y61.k;
import Y61.l;
import com.avito.android.beduin_shared.model.progress_overlay.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOrdersAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LZ40/a;", "", "a", "b", "c", "d", "LZ40/a$a;", "LZ40/a$b;", "LZ40/a$c;", "LZ40/a$d;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: BeduinOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ40/a$a;", "LZ40/a;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Z40.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1416a implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final b.a f19856a;

        public C1416a(@l b.a aVar) {
            this.f19856a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1416a) && L.f(this.f19856a, ((C1416a) obj).f19856a);
        }

        public final int hashCode() {
            b.a aVar = this.f19856a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @k
        public final String toString() {
            return "ChangeContentPlaceholderState(placeholderState=" + this.f19856a + ')';
        }
    }

    /* compiled from: BeduinOrdersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZ40/a$b;", "LZ40/a;", "<init>", "()V", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f19857a = new b();
    }

    /* compiled from: BeduinOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ40/a$c;", "LZ40/a;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final G0 f19858a;

        public c() {
            this(null, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f19858a, ((c) obj).f19858a);
        }

        public final int hashCode() {
            return this.f19858a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.v(new StringBuilder("RefreshContent(stub="), this.f19858a, ')');
        }

        public c(G0 g02, int i12, C42822w c42822w) {
            this.f19858a = (i12 & 1) != 0 ? G0.f406611a : g02;
        }
    }

    /* compiled from: BeduinOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ40/a$d;", "LZ40/a;", "_avito_orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final G0 f19859a;

        public d() {
            this(null, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f19859a, ((d) obj).f19859a);
        }

        public final int hashCode() {
            return this.f19859a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.v(new StringBuilder("ReloadContent(stub="), this.f19859a, ')');
        }

        public d(G0 g02, int i12, C42822w c42822w) {
            this.f19859a = (i12 & 1) != 0 ? G0.f406611a : g02;
        }
    }
}
