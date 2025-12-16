package androidx.compose.ui;

import androidx.compose.foundation.C20409a1;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.F0;
import androidx.compose.ui.node.InterfaceC22419k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.P0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import s0.C47949a;

/* compiled from: Modifier.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/v;", "", "a", "c", "d", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface v {

    /* renamed from: y1, reason: collision with root package name */
    @Y61.k
    public static final a f42878y1 = a.f42879b;

    /* compiled from: Modifier.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/v$c;", "Landroidx/compose/ui/v;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends v {

        /* compiled from: Modifier.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }

        @Override // androidx.compose.ui.v
        default <R> R C(R r12, @Y61.k Y41.p<? super R, ? super c, ? extends R> pVar) {
            return pVar.invoke(r12, this);
        }

        @Override // androidx.compose.ui.v
        default boolean I(@Y61.k Y41.l<? super c, Boolean> lVar) {
            return lVar.invoke(this).booleanValue();
        }
    }

    <R> R C(R r12, @Y61.k Y41.p<? super R, ? super c, ? extends R> pVar);

    boolean I(@Y61.k Y41.l<? super c, Boolean> lVar);

    @Y61.k
    default v d0(@Y61.k v vVar) {
        return vVar == f42878y1 ? this : new k(this, vVar);
    }

    /* compiled from: Modifier.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/k;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d implements InterfaceC22419k {

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public C43238h f42881c;

        /* renamed from: d, reason: collision with root package name */
        public int f42882d;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public d f42884f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public d f42885g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public F0 f42886h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public AbstractC22443w0 f42887i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f42888j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f42889k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f42890l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f42891m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public Y41.a<G0> f42892n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f42893o;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public d f42880b = this;

        /* renamed from: e, reason: collision with root package name */
        public int f42883e = -1;

        @Override // androidx.compose.ui.node.InterfaceC22419k
        @Y61.k
        /* renamed from: N, reason: from getter */
        public final d getF42880b() {
            return this.f42880b;
        }

        @Y61.k
        public final T Y1() {
            C43238h c43238h = this.f42881c;
            if (c43238h != null) {
                return c43238h;
            }
            C43238h c43238hA = U.a(C22421l.h(this).getCoroutineContext().plus(new P0((N0) C22421l.h(this).getCoroutineContext().get(N0.f410716u2))));
            this.f42881c = c43238hA;
            return c43238hA;
        }

        public boolean Z1() {
            return !(this instanceof C20409a1);
        }

        public void a2() {
            if (this.f42893o) {
                C47949a.b("node attached multiple times");
            }
            if (this.f42887i == null) {
                C47949a.b("attach invoked on a node without a coordinator");
            }
            this.f42893o = true;
            this.f42890l = true;
        }

        public void b2() {
            if (!this.f42893o) {
                C47949a.b("Cannot detach a node that is not attached");
            }
            if (this.f42890l) {
                C47949a.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.f42891m) {
                C47949a.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.f42893o = false;
            C43238h c43238h = this.f42881c;
            if (c43238h != null) {
                U.b(c43238h, new ModifierNodeDetachedCancellationException());
                this.f42881c = null;
            }
        }

        public void f2() {
            if (!this.f42893o) {
                C47949a.b("reset() called on an unattached node");
            }
            e2();
        }

        public void g2() {
            if (!this.f42893o) {
                C47949a.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.f42890l) {
                C47949a.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.f42890l = false;
            c2();
            this.f42891m = true;
        }

        public void h2() {
            if (!this.f42893o) {
                C47949a.b("node detached multiple times");
            }
            if (this.f42887i == null) {
                C47949a.b("detach invoked on a node without a coordinator");
            }
            if (!this.f42891m) {
                C47949a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.f42891m = false;
            Y41.a<G0> aVar = this.f42892n;
            if (aVar != null) {
                aVar.invoke();
            }
            d2();
        }

        public void i2(@Y61.k d dVar) {
            this.f42880b = dVar;
        }

        public void j2(@Y61.l AbstractC22443w0 abstractC22443w0) {
            this.f42887i = abstractC22443w0;
        }

        public void c2() {
        }

        public void d2() {
        }

        public void e2() {
        }
    }

    /* compiled from: Modifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/v$a;", "Landroidx/compose/ui/v;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements v {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a f42879b = new a();

        @Override // androidx.compose.ui.v
        public final boolean I(@Y61.k Y41.l<? super c, Boolean> lVar) {
            return true;
        }

        @Y61.k
        public final String toString() {
            return "Modifier";
        }

        @Override // androidx.compose.ui.v
        @Y61.k
        public final v d0(@Y61.k v vVar) {
            return vVar;
        }

        @Override // androidx.compose.ui.v
        public final <R> R C(R r12, @Y61.k Y41.p<? super R, ? super c, ? extends R> pVar) {
            return r12;
        }
    }
}
