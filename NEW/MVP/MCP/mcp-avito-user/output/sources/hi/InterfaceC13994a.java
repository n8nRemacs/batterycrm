package Hi;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinV2PageComposeAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LHi/a;", "", "a", "b", "c", "LHi/a$a;", "LHi/a$b;", "LHi/a$c;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hi.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13994a {

    /* compiled from: BeduinV2PageComposeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LHi/a$a;", "LHi/a;", "<init>", "()V", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hi.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0433a implements InterfaceC13994a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0433a f7609a = new C0433a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0433a);
        }

        public final int hashCode() {
            return -613277185;
        }

        @k
        public final String toString() {
            return "DismissLastDetachedComponent";
        }
    }

    /* compiled from: BeduinV2PageComposeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHi/a$b;", "LHi/a;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hi.a$b */
    public static final /* data */ class b implements InterfaceC13994a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final f f7610a;

        public b(@k f fVar) {
            this.f7610a = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f7610a, ((b) obj).f7610a);
        }

        public final int hashCode() {
            return this.f7610a.hashCode();
        }

        @k
        public final String toString() {
            return "HideKeyboard(event=" + this.f7610a + ')';
        }
    }

    /* compiled from: BeduinV2PageComposeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHi/a$c;", "LHi/a;", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Hi.a$c */
    public static final /* data */ class c implements InterfaceC13994a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final e f7611a;

        public c(@k e eVar) {
            this.f7611a = eVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f7611a, ((c) obj).f7611a);
        }

        public final int hashCode() {
            return this.f7611a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowDetachedComponent(detachedComponent=" + this.f7611a + ')';
        }
    }
}
