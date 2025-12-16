package Kl;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddAutoToC2CTrxResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LKl/a;", "", "a", "b", "LKl/a$a;", "LKl/a$b;", "_avito_c2c-trx_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Kl.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14324a {

    /* compiled from: AddAutoToC2CTrxResult.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LKl/a$a;", "LKl/a;", "LJu/c$b;", "_avito_c2c-trx_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Kl.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0595a implements InterfaceC14324a, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f9642b;

        public C0595a(@k String str) {
            this.f9642b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0595a) && L.f(this.f9642b, ((C0595a) obj).f9642b);
        }

        public final int hashCode() {
            return this.f9642b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("AddAutoToC2CTrxErrorResult(errorMessage="), this.f9642b, ')');
        }
    }

    /* compiled from: AddAutoToC2CTrxResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LKl/a$b;", "LKl/a;", "LJu/c$b;", "<init>", "()V", "_avito_c2c-trx_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Kl.a$b */
    public static final class b implements InterfaceC14324a, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f9643b = new b();
    }
}
