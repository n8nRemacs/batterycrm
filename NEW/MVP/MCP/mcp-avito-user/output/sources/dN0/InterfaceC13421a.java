package Dn0;

import Y61.k;
import Y61.l;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReasonDetailsAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LDn0/a;", "", "a", "b", "c", "LDn0/a$a;", "LDn0/a$b;", "LDn0/a$c;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dn0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC13421a {

    /* compiled from: ReasonDetailsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDn0/a$a;", "LDn0/a;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dn0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0191a implements InterfaceC13421a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0191a f3438a = new C0191a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0191a);
        }

        public final int hashCode() {
            return 809665223;
        }

        @k
        public final String toString() {
            return "CancelScreen";
        }
    }

    /* compiled from: ReasonDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDn0/a$b;", "LDn0/a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dn0.a$b */
    public static final /* data */ class b implements InterfaceC13421a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final CharSequence f3439a;

        public b(@l CharSequence charSequence) {
            this.f3439a = charSequence;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f3439a, ((b) obj).f3439a);
        }

        public final int hashCode() {
            CharSequence charSequence = this.f3439a;
            if (charSequence == null) {
                return 0;
            }
            return charSequence.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.r(new StringBuilder("ChangeComment(input="), this.f3439a, ')');
        }
    }

    /* compiled from: ReasonDetailsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDn0/a$c;", "LDn0/a;", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dn0.a$c */
    public static final /* data */ class c implements InterfaceC13421a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ParameterElement.C.b f3440a;

        public c(@k ParameterElement.C.b bVar) {
            this.f3440a = bVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f3440a, ((c) obj).f3440a);
        }

        public final int hashCode() {
            return this.f3440a.hashCode();
        }

        @k
        public final String toString() {
            return "ChangeRadioGroupItem(item=" + this.f3440a + ')';
        }
    }
}
