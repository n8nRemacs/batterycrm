package Qo;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.code_check_public.model.Phone;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhoneListAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LQo/a;", "", "a", "LQo/a$a;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Qo.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14914a {

    /* compiled from: PhoneListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQo/a$a;", "LQo/a;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Qo.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0928a implements InterfaceC14914a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f14008a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Object f14009b;

        public C0928a(@k String str, @k List<Phone> list) {
            this.f14008a = str;
            this.f14009b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0928a)) {
                return false;
            }
            C0928a c0928a = (C0928a) obj;
            return L.f(this.f14008a, c0928a.f14008a) && L.f(this.f14009b, c0928a.f14009b);
        }

        public final int hashCode() {
            return this.f14009b.hashCode() + (this.f14008a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateSearch(text=");
            sb2.append(this.f14008a);
            sb2.append(", phones=");
            return H.n(sb2, this.f14009b, ')');
        }
    }
}
