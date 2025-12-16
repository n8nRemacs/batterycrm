package androidx.view.compose;

import Y41.q;
import Y41.r;
import Y61.k;
import Y61.l;
import androidx.compose.animation.InterfaceC20395w;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC23301M0;
import androidx.view.C23280B0;
import androidx.view.C23317W;
import androidx.view.C23395u;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ComposeNavigator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/navigation/compose/e;", "Landroidx/navigation/M0;", "Landroidx/navigation/compose/e$b;", "<init>", "()V", "a", "b", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@AbstractC23301M0.b("composable")
/* renamed from: androidx.navigation.compose.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23339e extends AbstractC23301M0<b> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC22204y1<Boolean> f52942c = C22126m3.g(Boolean.FALSE);

    /* compiled from: ComposeNavigator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/compose/e$a;", "", "<init>", "()V", "", "NAME", "Ljava/lang/String;", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.compose.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // androidx.view.AbstractC23301M0
    public final C23317W a() {
        C23336b.f52936a.getClass();
        return new b(this, C23336b.f52937b);
    }

    @Override // androidx.view.AbstractC23301M0
    public final void d(@k List<C23395u> list, @l C23280B0 c23280b0, @l AbstractC23301M0.a aVar) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            b().h((C23395u) it.next());
        }
        ((C22082i3) this.f52942c).setValue(Boolean.FALSE);
    }

    @Override // androidx.view.AbstractC23301M0
    public final void i(@k C23395u c23395u, boolean z12) {
        b().e(c23395u, z12);
        ((C22082i3) this.f52942c).setValue(Boolean.TRUE);
    }

    /* compiled from: ComposeNavigator.kt */
    @P
    @C23317W.a
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0004¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/navigation/compose/e$b;", "Landroidx/navigation/W;", "Landroidx/navigation/compose/e;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation/u;", "Lkotlin/G0;", "LX41/o;", "Landroidx/compose/runtime/o;", "content", "<init>", "(Landroidx/navigation/compose/e;LY41/q;)V", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.compose.e$b */
    public static final class b extends C23317W {

        /* renamed from: l, reason: collision with root package name */
        @k
        public final C22096n f52943l;

        /* compiled from: ComposeNavigator.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u000b\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/animation/w;", "Landroidx/navigation/u;", "LX41/o;", "entry", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/w;Landroidx/navigation/u;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.navigation.compose.e$b$a */
        public static final class a extends N implements r<InterfaceC20395w, C23395u, A, Integer, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ q<C23395u, A, Integer, G0> f52944l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(q<? super C23395u, ? super A, ? super Integer, G0> qVar) {
                super(4);
                this.f52944l = qVar;
            }

            @Override // Y41.r
            public final G0 invoke(InterfaceC20395w interfaceC20395w, C23395u c23395u, A a12, Integer num) {
                num.intValue();
                this.f52944l.invoke(c23395u, a12, 8);
                return G0.f406611a;
            }
        }

        public b(@k C23339e c23339e, @k C22096n c22096n) {
            super(c23339e);
            this.f52943l = c22096n;
        }

        @InterfaceC42830m
        public b(C23339e c23339e, q qVar) {
            this(c23339e, new C22096n(1587956030, new a(qVar), true));
        }
    }
}
