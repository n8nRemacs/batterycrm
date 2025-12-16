package Mq0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CartActionState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LMq0/a;", "", "a", "b", "c", "d", "LMq0/a$a;", "LMq0/a$b;", "LMq0/a$c;", "LMq0/a$d;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mq0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14521a {

    /* compiled from: CartActionState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMq0/a$a;", "LMq0/a;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mq0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0702a implements InterfaceC14521a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11021a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11022b;

        public C0702a(@k String str, int i12) {
            this.f11021a = str;
            this.f11022b = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0702a)) {
                return false;
            }
            C0702a c0702a = (C0702a) obj;
            return L.f(this.f11021a, c0702a.f11021a) && this.f11022b == c0702a.f11022b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f11022b) + (this.f11021a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddToCartButton(itemId=");
            sb2.append(this.f11021a);
            sb2.append(", maxQuantity=");
            return r.t(sb2, this.f11022b, ')');
        }
    }

    /* compiled from: CartActionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMq0/a$b;", "LMq0/a;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mq0.a$b */
    public static final class b implements InterfaceC14521a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f11023a = new b();
    }

    /* compiled from: CartActionState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMq0/a$c;", "LMq0/a;", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mq0.a$c */
    public static final class c implements InterfaceC14521a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f11024a = new c();
    }

    /* compiled from: CartActionState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMq0/a$d;", "LMq0/a;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mq0.a$d */
    public static final /* data */ class d implements InterfaceC14521a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f11025a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Stepper f11026b;

        public d(@k String str, @k Stepper stepper) {
            this.f11025a = str;
            this.f11026b = stepper;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f11025a, dVar.f11025a) && L.f(this.f11026b, dVar.f11026b);
        }

        public final int hashCode() {
            return this.f11026b.hashCode() + (this.f11025a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Stepper(itemId=" + this.f11025a + ", stepper=" + this.f11026b + ')';
        }
    }
}
