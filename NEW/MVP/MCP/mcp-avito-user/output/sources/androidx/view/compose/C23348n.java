package androidx.view.compose;

import Y41.q;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.window.H;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.view.AbstractC23301M0;
import androidx.view.C23280B0;
import androidx.view.C23317W;
import androidx.view.C23395u;
import androidx.view.InterfaceC23373j;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: DialogNavigator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/navigation/compose/n;", "Landroidx/navigation/M0;", "Landroidx/navigation/compose/n$b;", "<init>", "()V", "a", "b", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@AbstractC23301M0.b("dialog")
/* renamed from: androidx.navigation.compose.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23348n extends AbstractC23301M0<b> {

    /* compiled from: DialogNavigator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/compose/n$a;", "", "<init>", "()V", "", "NAME", "Ljava/lang/String;", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.compose.n$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DialogNavigator.kt */
    @P
    @C23317W.a
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/compose/n$b;", "Landroidx/navigation/W;", "Landroidx/navigation/j;", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.compose.n$b */
    public static final class b extends C23317W implements InterfaceC23373j {

        /* renamed from: l, reason: collision with root package name */
        @k
        public final H f52974l;

        /* renamed from: m, reason: collision with root package name */
        @k
        public final q<C23395u, A, Integer, G0> f52975m;

        public b() {
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C23348n c23348n, H h12, q qVar, int i12, C42822w c42822w) {
            super(c23348n);
            h12 = (i12 & 2) != 0 ? new H(false, false, (SecureFlagPolicy) null, 7, (C42822w) null) : h12;
            this.f52974l = h12;
            this.f52975m = qVar;
        }
    }

    static {
        new a(null);
    }

    @Override // androidx.view.AbstractC23301M0
    public final C23317W a() {
        C23337c.f52939a.getClass();
        return new b(this, null, C23337c.f52940b, 2, null);
    }

    @Override // androidx.view.AbstractC23301M0
    public final void d(@k List<C23395u> list, @l C23280B0 c23280b0, @l AbstractC23301M0.a aVar) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b().g((C23395u) it.next());
        }
    }

    @Override // androidx.view.AbstractC23301M0
    public final void i(@k C23395u c23395u, boolean z12) {
        b().e(c23395u, z12);
        int iL2 = C42745f0.L(b().f52866f.getValue(), c23395u);
        int i12 = 0;
        for (Object obj : b().f52866f.getValue()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            C23395u c23395u2 = (C23395u) obj;
            if (i12 > iL2) {
                b().b(c23395u2);
            }
            i12 = i13;
        }
    }
}
