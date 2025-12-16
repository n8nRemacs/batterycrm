package Dz0;

import Bz0.InterfaceC13208a;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import yz0.InterfaceC50328b;

/* compiled from: SharedViewModelOneTimeNavEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LDz0/c;", "", "a", "b", "LDz0/c$a;", "LDz0/c$b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface c {

    /* compiled from: SharedViewModelOneTimeNavEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDz0/c$a;", "LDz0/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC50328b f3602a;

        public a(@k InterfaceC50328b interfaceC50328b) {
            this.f3602a = interfaceC50328b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f3602a, ((a) obj).f3602a);
        }

        public final int hashCode() {
            return this.f3602a.hashCode();
        }

        @k
        public final String toString() {
            return "PassActionFromDialog(action=" + this.f3602a + ')';
        }
    }

    /* compiled from: SharedViewModelOneTimeNavEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDz0/c$b;", "LDz0/c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC13208a.c f3603a;

        public b(@k InterfaceC13208a.c cVar) {
            this.f3603a = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f3603a, ((b) obj).f3603a);
        }

        public final int hashCode() {
            return this.f3603a.hashCode();
        }

        @k
        public final String toString() {
            return "PassActionToDialog(action=" + this.f3603a + ')';
        }
    }
}
