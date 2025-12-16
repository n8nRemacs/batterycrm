package VM0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.data.model.CBRSDKState;

/* compiled from: PassportAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LVM0/a;", "", "a", "b", "c", "LVM0/a$a;", "LVM0/a$b;", "LVM0/a$c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: PassportAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVM0/a$a;", "LVM0/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: VM0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1175a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CBRSDKState f17093a;

        public C1175a(@k CBRSDKState cBRSDKState) {
            this.f17093a = cBRSDKState;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1175a) && L.f(this.f17093a, ((C1175a) obj).f17093a);
        }

        public final int hashCode() {
            return this.f17093a.hashCode();
        }

        @k
        public final String toString() {
            return "ChangeSDKState(newState=" + this.f17093a + ')';
        }
    }

    /* compiled from: PassportAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVM0/a$b;", "LVM0/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Throwable f17094a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CBRSDKState f17095b;

        public b(@l Throwable th2, @k CBRSDKState cBRSDKState) {
            this.f17094a = th2;
            this.f17095b = cBRSDKState;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f17094a, bVar.f17094a) && L.f(this.f17095b, bVar.f17095b);
        }

        public final int hashCode() {
            Throwable th2 = this.f17094a;
            return this.f17095b.hashCode() + ((th2 == null ? 0 : th2.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "SetSDKError(exception=" + this.f17094a + ", state=" + this.f17095b + ')';
        }
    }

    /* compiled from: PassportAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVM0/a$c;", "LVM0/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CBRSDKState f17096a;

        public c(@k CBRSDKState cBRSDKState) {
            this.f17096a = cBRSDKState;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f17096a, ((c) obj).f17096a);
        }

        public final int hashCode() {
            return this.f17096a.hashCode();
        }

        @k
        public final String toString() {
            return "SetSDKSuccess(state=" + this.f17096a + ')';
        }
    }
}
