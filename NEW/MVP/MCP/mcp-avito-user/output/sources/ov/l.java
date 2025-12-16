package Ov;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Tariff.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"LOv/l;", "", "a", "b", "c", "LOv/l$b;", "LOv/l$c;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface l {

    /* compiled from: Tariff.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOv/l$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        static {
            new a();
        }
    }

    /* compiled from: Tariff.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"LOv/l$b;", "LOv/l;", "id", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements l {

        /* renamed from: a, reason: collision with root package name */
        public final long f12697a;

        private /* synthetic */ b(long j12) {
            this.f12697a = j12;
        }

        public static final /* synthetic */ b a(long j12) {
            return new b(j12);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f12697a == ((b) obj).f12697a;
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.f12697a);
        }

        public final String toString() {
            return r.u(new StringBuilder("CustomId(id="), this.f12697a, ')');
        }
    }

    /* compiled from: Tariff.kt */
    @X41.g
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"LOv/l$c;", "LOv/l;", "termsType", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f12698a;

        private /* synthetic */ c(String str) {
            this.f12698a = str;
        }

        public static final /* synthetic */ c a(String str) {
            return new c(str);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return L.f(this.f12698a, ((c) obj).f12698a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f12698a.hashCode();
        }

        public final String toString() {
            return C22026a.c(new StringBuilder("TermsType(termsType="), this.f12698a, ')');
        }
    }
}
