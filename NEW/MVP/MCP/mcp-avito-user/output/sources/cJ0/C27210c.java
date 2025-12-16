package cj0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.beduin.v2.engine.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RelatedProductsBottomSheetState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcj0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cj0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C27210c extends q {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f58116c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C27210c f58117d = new C27210c(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f58118b;

    /* compiled from: RelatedProductsBottomSheetState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcj0/c$a;", "", "<init>", "()V", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cj0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RelatedProductsBottomSheetState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcj0/c$b;", "", "a", "b", "c", "Lcj0/c$b$a;", "Lcj0/c$b$b;", "Lcj0/c$b$c;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: cj0.c$b */
    public interface b {

        /* compiled from: RelatedProductsBottomSheetState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcj0/c$b$a;", "Lcj0/c$b;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: cj0.c$b$a */
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final D f58119a;

            public a(@k D d12) {
                this.f58119a = d12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f58119a, ((a) obj).f58119a);
            }

            public final int hashCode() {
                return this.f58119a.hashCode();
            }

            @k
            public final String toString() {
                return "Content(rendererState=" + this.f58119a + ')';
            }
        }

        /* compiled from: RelatedProductsBottomSheetState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcj0/c$b$b;", "Lcj0/c$b;", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: cj0.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C2060b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Throwable f58120a;

            public C2060b(@k Throwable th2) {
                this.f58120a = th2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2060b) && L.f(this.f58120a, ((C2060b) obj).f58120a);
            }

            public final int hashCode() {
                return this.f58120a.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(error="), this.f58120a, ')');
            }
        }

        /* compiled from: RelatedProductsBottomSheetState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcj0/c$b$c;", "Lcj0/c$b;", "<init>", "()V", "_avito_related-products_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: cj0.c$b$c, reason: collision with other inner class name */
        public static final class C2061c implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C2061c f58121a = new C2061c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C27210c() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27210c) && L.f(this.f58118b, ((C27210c) obj).f58118b);
    }

    public final int hashCode() {
        return this.f58118b.hashCode();
    }

    @k
    public final String toString() {
        return "RelatedProductsBottomSheetState(viewState=" + this.f58118b + ')';
    }

    public /* synthetic */ C27210c(b bVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? b.C2061c.f58121a : bVar);
    }

    public C27210c(@k b bVar) {
        this.f58118b = bVar;
    }
}
