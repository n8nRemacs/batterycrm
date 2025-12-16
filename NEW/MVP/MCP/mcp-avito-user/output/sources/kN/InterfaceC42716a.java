package kn;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartActionState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lkn/a;", "", "a", "b", "c", "d", "Lkn/a$a;", "Lkn/a$b;", "Lkn/a$c;", "Lkn/a$d;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kn.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC42716a {

    /* compiled from: CartActionState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkn/a$a;", "Lkn/a;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kn.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11626a implements InterfaceC42716a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f406585a;

        /* renamed from: b, reason: collision with root package name */
        public final int f406586b;

        public C11626a(@k String str, int i12) {
            this.f406585a = str;
            this.f406586b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11626a)) {
                return false;
            }
            C11626a c11626a = (C11626a) obj;
            return L.f(this.f406585a, c11626a.f406585a) && this.f406586b == c11626a.f406586b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f406586b) + (this.f406585a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddToCartButton(itemId=");
            sb2.append(this.f406585a);
            sb2.append(", maxQuantity=");
            return r.t(sb2, this.f406586b, ')');
        }
    }

    /* compiled from: CartActionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkn/a$b;", "Lkn/a;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kn.a$b */
    public static final class b implements InterfaceC42716a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f406587a = new b();
    }

    /* compiled from: CartActionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkn/a$c;", "Lkn/a;", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kn.a$c */
    public static final class c implements InterfaceC42716a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f406588a = new c();
    }

    /* compiled from: CartActionState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkn/a$d;", "Lkn/a;", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kn.a$d */
    public static final /* data */ class d implements InterfaceC42716a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f406589a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Stepper f406590b;

        public d(@k String str, @k Stepper stepper) {
            this.f406589a = str;
            this.f406590b = stepper;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f406589a, dVar.f406589a) && L.f(this.f406590b, dVar.f406590b);
        }

        public final int hashCode() {
            return this.f406590b.hashCode() + (this.f406589a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Stepper(itemId=" + this.f406589a + ", stepper=" + this.f406590b + ')';
        }
    }
}
