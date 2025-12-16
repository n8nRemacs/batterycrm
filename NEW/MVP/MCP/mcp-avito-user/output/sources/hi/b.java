package Hi;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinV2PageComposeInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LHi/b;", "", "a", "b", "c", "LHi/b$a;", "LHi/b$b;", "LHi/b$c;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: BeduinV2PageComposeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHi/b$a;", "LHi/b;", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f7612a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1378723330;
        }

        @k
        public final String toString() {
            return "DismissLastDetachedComponent";
        }
    }

    /* compiled from: BeduinV2PageComposeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHi/b$b;", "LHi/b;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hi.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0434b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final f f7613a;

        public C0434b(@k f fVar) {
            this.f7613a = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0434b) && L.f(this.f7613a, ((C0434b) obj).f7613a);
        }

        public final int hashCode() {
            return this.f7613a.hashCode();
        }

        @k
        public final String toString() {
            return "HideKeyboard(event=" + this.f7613a + ')';
        }
    }

    /* compiled from: BeduinV2PageComposeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHi/b$c;", "LHi/b;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final e f7614a;

        public c(@k e eVar) {
            this.f7614a = eVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f7614a, ((c) obj).f7614a);
        }

        public final int hashCode() {
            return this.f7614a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowDetachedComponent(detachedComponent=" + this.f7614a + ')';
        }
    }
}
