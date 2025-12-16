package ys;

import Y61.k;
import Y61.l;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CreditPartnerState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lys/d;", "", "a", "b", "c", "d", "Lys/d$b;", "Lys/d$c;", "Lys/d$d;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ys.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC50289d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f443541a = a.f443542a;

    /* compiled from: CreditPartnerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lys/d$a;", "", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f443542a = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C12925d f443543b = C12925d.f443546b;
    }

    /* compiled from: CreditPartnerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lys/d$b;", "Lys/d;", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.d$b */
    public static final /* data */ class b implements InterfaceC50289d {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Boolean f443544b;

        /* JADX WARN: Multi-variable type inference failed */
        public b() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f443544b, ((b) obj).f443544b);
        }

        public final int hashCode() {
            Boolean bool = this.f443544b;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @k
        public final String toString() {
            return C0.g(new StringBuilder("Error(isUnknownError="), this.f443544b, ')');
        }

        public b(@l Boolean bool) {
            this.f443544b = bool;
        }

        public /* synthetic */ b(Boolean bool, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : bool);
        }
    }

    /* compiled from: CreditPartnerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lys/d$c;", "Lys/d;", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.d$c */
    public static final class c implements InterfaceC50289d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final c f443545b = new c();
    }

    /* compiled from: CreditPartnerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lys/d$d;", "Lys/d;", "<init>", "()V", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ys.d$d, reason: collision with other inner class name */
    public static final class C12925d implements InterfaceC50289d {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C12925d f443546b = new C12925d();
    }
}
