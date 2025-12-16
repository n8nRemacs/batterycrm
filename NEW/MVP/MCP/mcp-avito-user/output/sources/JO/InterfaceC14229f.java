package Jo;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CodeConfirmViewState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LJo/f;", "", "a", "b", "c", "LJo/f$a;", "LJo/f$b;", "LJo/f$c;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jo.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14229f {

    /* compiled from: CodeConfirmViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJo/f$a;", "LJo/f;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jo.f$a */
    public static final class a implements InterfaceC14229f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f9156a = new a();
    }

    /* compiled from: CodeConfirmViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJo/f$b;", "LJo/f;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jo.f$b */
    public static final class b implements InterfaceC14229f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f9157a = new b();
    }

    /* compiled from: CodeConfirmViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJo/f$c;", "LJo/f;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jo.f$c */
    public static final /* data */ class c implements InterfaceC14229f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9158a;

        public c(@k String str) {
            this.f9158a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f9158a, ((c) obj).f9158a);
        }

        public final int hashCode() {
            return this.f9158a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Timeout(formattedTimeLeft="), this.f9158a, ')');
        }
    }
}
