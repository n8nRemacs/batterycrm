package xI0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CharityAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LxI0/a;", "", "a", "b", "LxI0/a$a;", "LxI0/a$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xI0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC49844a {

    /* compiled from: CharityAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxI0/a$a;", "LxI0/a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xI0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12857a implements InterfaceC49844a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12857a f442329a = new C12857a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12857a);
        }

        public final int hashCode() {
            return -883509073;
        }

        @k
        public final String toString() {
            return "Hide";
        }
    }

    /* compiled from: CharityAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxI0/a$b;", "LxI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xI0.a$b */
    public static final /* data */ class b implements InterfaceC49844a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f442330a;

        public b(@l String str) {
            this.f442330a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f442330a, ((b) obj).f442330a);
        }

        public final int hashCode() {
            String str = this.f442330a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Show(advertId="), this.f442330a, ')');
        }
    }
}
