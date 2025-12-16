package ew0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoCodeAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lew0/c;", "", "a", "b", "c", "d", "Lew0/c$a;", "Lew0/c$b;", "Lew0/c$c;", "Lew0/c$d;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ew0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC40169c {

    /* compiled from: PromoCodeAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lew0/c$a;", "Lew0/c;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ew0.c$a */
    public static final /* data */ class a implements InterfaceC40169c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f395459a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1456038384;
        }

        @k
        public final String toString() {
            return "ButtonClick";
        }
    }

    /* compiled from: PromoCodeAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lew0/c$b;", "Lew0/c;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ew0.c$b */
    public static final /* data */ class b implements InterfaceC40169c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f395460a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -152458681;
        }

        @k
        public final String toString() {
            return "FlowEnd";
        }
    }

    /* compiled from: PromoCodeAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew0/c$c;", "Lew0/c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ew0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11116c implements InterfaceC40169c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395461a;

        public C11116c(@k String str) {
            this.f395461a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11116c) && L.f(this.f395461a, ((C11116c) obj).f395461a);
        }

        public final int hashCode() {
            return this.f395461a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputPromoCodeChanged(newInputPromoCodeText="), this.f395461a, ')');
        }
    }

    /* compiled from: PromoCodeAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lew0/c$d;", "Lew0/c;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ew0.c$d */
    public static final /* data */ class d implements InterfaceC40169c {

        /* renamed from: a, reason: collision with root package name */
        public final int f395462a;

        public d(int i12) {
            this.f395462a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f395462a == ((d) obj).f395462a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f395462a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("NewPromoCodeClick(newSelectedPromoCodeIndex="), this.f395462a, ')');
        }
    }
}
