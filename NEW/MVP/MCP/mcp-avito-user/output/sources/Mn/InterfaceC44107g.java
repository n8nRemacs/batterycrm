package mn;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: CartSimilarItemsState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lmn/g;", "", "a", "b", "c", "Lmn/g$a;", "Lmn/g$b;", "Lmn/g$c;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mn.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC44107g {

    /* compiled from: CartSimilarItemsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmn/g$a;", "Lmn/g;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.g$a */
    public static final class a implements InterfaceC44107g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f414722a = new a();
    }

    /* compiled from: CartSimilarItemsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmn/g$b;", "Lmn/g;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.g$b */
    public static final /* data */ class b implements InterfaceC44107g {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f414723a;

        public b(boolean z12) {
            this.f414723a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f414723a == ((b) obj).f414723a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f414723a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Loaded(isLastItems="), this.f414723a, ')');
        }
    }

    /* compiled from: CartSimilarItemsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmn/g$c;", "Lmn/g;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.g$c */
    public static final class c implements InterfaceC44107g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f414724a = new c();
    }
}
