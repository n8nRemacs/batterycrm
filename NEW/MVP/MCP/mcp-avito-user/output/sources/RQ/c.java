package Rq;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.component.toast.f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LRq/c;", "", "a", "b", "c", "d", "LRq/c$a;", "LRq/c$b;", "LRq/c$c;", "LRq/c$d;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface c {

    /* compiled from: ComparisonOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/c$a;", "LRq/c;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ArrayList f14685a;

        public a(@l ArrayList arrayList) {
            this.f14685a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f14685a, ((a) obj).f14685a);
        }

        public final int hashCode() {
            ArrayList arrayList = this.f14685a;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("CloseScreen(currentItems="), this.f14685a, ')');
        }
    }

    /* compiled from: ComparisonOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRq/c$b;", "LRq/c;", "<init>", "()V", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f14686a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -937355209;
        }

        @k
        public final String toString() {
            return "HideBottomSheet";
        }
    }

    /* compiled from: ComparisonOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/c$c;", "LRq/c;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rq.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0986c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f14687a;

        public C0986c(@k ArrayList arrayList) {
            this.f14687a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0986c) && this.f14687a.equals(((C0986c) obj).f14687a);
        }

        public final int hashCode() {
            return this.f14687a.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("ShowBottomSheet(data="), this.f14687a, ')');
        }
    }

    /* compiled from: ComparisonOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/c$d;", "LRq/c;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f14688a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f14689b;

        public d(@k String str, @k f fVar) {
            this.f14688a = str;
            this.f14689b = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f14688a, dVar.f14688a) && L.f(this.f14689b, dVar.f14689b);
        }

        public final int hashCode() {
            return this.f14689b.hashCode() + (this.f14688a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowToastError(toastText=" + this.f14688a + ", toastBarType=" + this.f14689b + ')';
        }
    }
}
