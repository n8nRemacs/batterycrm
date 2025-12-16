package androidx.compose.foundation.contextmenu;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: ContextMenuState.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/contextmenu/s;", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f27057a;

    /* compiled from: ContextMenuState.android.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/contextmenu/s$a;", "", "<init>", "()V", "a", "b", "Landroidx/compose/foundation/contextmenu/s$a$a;", "Landroidx/compose/foundation/contextmenu/s$a$b;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: ContextMenuState.android.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/contextmenu/s$a$a;", "Landroidx/compose/foundation/contextmenu/s$a;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.contextmenu.s$a$a, reason: collision with other inner class name */
        public static final class C1563a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1563a f27058a = new C1563a();

            public C1563a() {
                super(null);
            }

            @Y61.k
            public final String toString() {
                return "Closed";
            }
        }

        /* compiled from: ContextMenuState.android.kt */
        @P
        @s0
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/contextmenu/s$a$b;", "Landroidx/compose/foundation/contextmenu/s$a;", "Ll0/g;", "offset", "<init>", "(JLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public final long f27059a;

            public b(long j12, C42822w c42822w) {
                super(null);
                this.f27059a = j12;
                if ((j12 & 9223372034707292159L) != 9205357640488583168L) {
                    return;
                }
                androidx.compose.foundation.internal.e.c("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
            }

            public final boolean equals(@Y61.l Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                return l0.g.d(this.f27059a, ((b) obj).f27059a);
            }

            public final int hashCode() {
                g.a aVar = l0.g.f413384b;
                return Long.hashCode(this.f27059a);
            }

            @Y61.k
            public final String toString() {
                return "Open(offset=" + ((Object) l0.g.l(this.f27059a)) + ')';
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public s() {
        this(null, 1, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            return L.f((a) ((C22082i3) ((s) obj).f27057a).getF42167b(), (a) ((C22082i3) this.f27057a).getF42167b());
        }
        return false;
    }

    public final int hashCode() {
        return ((a) ((C22082i3) this.f27057a).getF42167b()).hashCode();
    }

    @Y61.k
    public final String toString() {
        return "ContextMenuState(status=" + ((a) ((C22082i3) this.f27057a).getF42167b()) + ')';
    }

    public s(a aVar, int i12, C42822w c42822w) {
        this.f27057a = C22126m3.g((i12 & 1) != 0 ? a.C1563a.f27058a : aVar);
    }
}
