package Dz0;

import Bz0.InterfaceC13208a;
import Y61.k;
import Y61.l;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import yz0.InterfaceC50328b;

/* compiled from: SharedViewModelInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LDz0/b;", "", "a", "b", "c", "d", "LDz0/b$a;", "LDz0/b$b;", "LDz0/b$c;", "LDz0/b$d;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: SharedViewModelInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDz0/b$a;", "LDz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            throw null;
        }
    }

    /* compiled from: SharedViewModelInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDz0/b$b;", "LDz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dz0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0206b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC50328b f3599a;

        public C0206b(@k InterfaceC50328b interfaceC50328b) {
            this.f3599a = interfaceC50328b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0206b) && L.f(this.f3599a, ((C0206b) obj).f3599a);
        }

        public final int hashCode() {
            return this.f3599a.hashCode();
        }

        @k
        public final String toString() {
            return "PassActionFromDialog(action=" + this.f3599a + ')';
        }
    }

    /* compiled from: SharedViewModelInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDz0/b$c;", "LDz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC13208a.c f3600a;

        public c(@k InterfaceC13208a.c cVar) {
            this.f3600a = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f3600a, ((c) obj).f3600a);
        }

        public final int hashCode() {
            return this.f3600a.hashCode();
        }

        @k
        public final String toString() {
            return "PassActionToDialog(action=" + this.f3600a + ')';
        }
    }

    /* compiled from: SharedViewModelInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDz0/b$d;", "LDz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final StrSellerOrdersDialogData f3601a;

        public d(@k StrSellerOrdersDialogData strSellerOrdersDialogData) {
            this.f3601a = strSellerOrdersDialogData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f3601a, ((d) obj).f3601a);
        }

        public final int hashCode() {
            return this.f3601a.hashCode();
        }

        @k
        public final String toString() {
            return "PassNewDialogData(dialogData=" + this.f3601a + ')';
        }
    }
}
