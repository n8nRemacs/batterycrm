package Zp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhoneCallOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"LZp/b;", "", "a", "LZp/b$a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zp.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC19584b {

    /* compiled from: PhoneCallOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZp/b$a;", "LZp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Zp.b$a */
    public static final /* data */ class a implements InterfaceC19584b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f20494a;

        public a(@k String str) {
            this.f20494a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f20494a, ((a) obj).f20494a);
        }

        public final int hashCode() {
            return this.f20494a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Call(phone="), this.f20494a, ')');
        }
    }
}
