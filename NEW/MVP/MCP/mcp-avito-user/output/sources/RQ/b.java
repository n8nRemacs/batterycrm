package Rq;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"LRq/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "LRq/b$a;", "LRq/b$b;", "LRq/b$c;", "LRq/b$d;", "LRq/b$e;", "LRq/b$f;", "LRq/b$g;", "LRq/b$h;", "LRq/b$i;", "LRq/b$j;", "LRq/b$k;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: ComparisonInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRq/b$a;", "LRq/b;", "<init>", "()V", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f14675a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2107508171;
        }

        @Y61.k
        public final String toString() {
            return "CloseBottomSheet";
        }
    }

    /* compiled from: ComparisonInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/b$b;", "LRq/b;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rq.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0985b implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ArrayList f14676a;

        public C0985b(@l ArrayList arrayList) {
            this.f14676a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0985b) && L.f(this.f14676a, ((C0985b) obj).f14676a);
        }

        public final int hashCode() {
            ArrayList arrayList = this.f14676a;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("CloseScreen(currentItems="), this.f14676a, ')');
        }
    }

    /* compiled from: ComparisonInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/b$c;", "LRq/b;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Sq.j f14677a;

        public c(@Y61.k Sq.j jVar) {
            this.f14677a = jVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f14677a, ((c) obj).f14677a);
        }

        public final int hashCode() {
            return this.f14677a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ComparisonItemsLoaded(items=" + this.f14677a + ')';
        }
    }

    /* compiled from: ComparisonInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRq/b$d;", "LRq/b;", "<init>", "()V", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f14678a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1532393477;
        }

        @Y61.k
        public final String toString() {
            return "ComparisonLoadedStart";
        }
    }

    /* compiled from: ComparisonInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRq/b$e;", "LRq/b;", "<init>", "()V", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {
        static {
            new e();
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2122957930;
        }

        @Y61.k
        public final String toString() {
            return "ComparisonNoChanges";
        }
    }

    /* compiled from: ComparisonInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/b$f;", "LRq/b;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f14679a;

        public f(@Y61.k String str) {
            this.f14679a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f14679a, ((f) obj).f14679a);
        }

        public final int hashCode() {
            return this.f14679a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ComparisonOverlayError(message="), this.f14679a, ')');
        }
    }

    /* compiled from: ComparisonInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRq/b$g;", "LRq/b;", "<init>", "()V", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {
        static {
            new g();
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1343496702;
        }

        @Y61.k
        public final String toString() {
            return "HideProgress";
        }
    }

    /* compiled from: ComparisonInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/b$h;", "LRq/b;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14680a;

        public h() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f14680a == ((h) obj).f14680a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14680a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("LoadItems(force="), this.f14680a, ')');
        }

        public h(boolean z12, int i12, C42822w c42822w) {
            this.f14680a = (i12 & 1) != 0 ? true : z12;
        }
    }

    /* compiled from: ComparisonInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/b$i;", "LRq/b;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f14681a;

        public i(@Y61.k ArrayList arrayList) {
            this.f14681a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f14681a.equals(((i) obj).f14681a);
        }

        public final int hashCode() {
            return this.f14681a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("ShowBottomSheet(buttons="), this.f14681a, ')');
        }
    }

    /* compiled from: ComparisonInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRq/b$j;", "LRq/b;", "<init>", "()V", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f14682a = new j();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -70699847;
        }

        @Y61.k
        public final String toString() {
            return "ShowProgress";
        }
    }

    /* compiled from: ComparisonInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRq/b$k;", "LRq/b;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f14683a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.component.toast.f f14684b;

        public k(@Y61.k String str, @Y61.k com.avito.android.component.toast.f fVar) {
            this.f14683a = str;
            this.f14684b = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f14683a, kVar.f14683a) && L.f(this.f14684b, kVar.f14684b);
        }

        public final int hashCode() {
            return this.f14684b.hashCode() + (this.f14683a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ShowToastError(toastText=" + this.f14683a + ", toastBarType=" + this.f14684b + ')';
        }
    }
}
