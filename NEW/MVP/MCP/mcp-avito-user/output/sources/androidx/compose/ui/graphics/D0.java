package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Outline.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/D0;", "", "<init>", "()V", "a", "b", "c", "Landroidx/compose/ui/graphics/D0$a;", "Landroidx/compose/ui/graphics/D0$b;", "Landroidx/compose/ui/graphics/D0$c;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class D0 {

    /* compiled from: Outline.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/D0$a;", "Landroidx/compose/ui/graphics/D0;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends D0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C22277p f39221a;

        public a(@Y61.k C22277p c22277p) {
            super(null);
            this.f39221a = c22277p;
        }

        @Override // androidx.compose.ui.graphics.D0
        @Y61.k
        /* renamed from: a */
        public final l0.j getF39222a() {
            return this.f39221a.w();
        }
    }

    /* compiled from: Outline.kt */
    @androidx.compose.runtime.H0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/D0$b;", "Landroidx/compose/ui/graphics/D0;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends D0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final l0.j f39222a;

        public b(@Y61.k l0.j jVar) {
            super(null);
            this.f39222a = jVar;
        }

        @Override // androidx.compose.ui.graphics.D0
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final l0.j getF39222a() {
            return this.f39222a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return kotlin.jvm.internal.L.f(this.f39222a, ((b) obj).f39222a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f39222a.hashCode();
        }
    }

    /* compiled from: Outline.kt */
    @androidx.compose.runtime.H0
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/D0$c;", "Landroidx/compose/ui/graphics/D0;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends D0 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final l0.l f39223a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final C22277p f39224b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(@Y61.k l0.l lVar) {
            super(0 == true ? 1 : 0);
            C22277p c22277pA = null;
            this.f39223a = lVar;
            if (!l0.m.c(lVar)) {
                c22277pA = C22315w.a();
                Path.b(c22277pA, lVar);
            }
            this.f39224b = c22277pA;
        }

        @Override // androidx.compose.ui.graphics.D0
        @Y61.k
        /* renamed from: a */
        public final l0.j getF39222a() {
            l0.l lVar = this.f39223a;
            return new l0.j(lVar.f413394a, lVar.f413395b, lVar.f413396c, lVar.f413397d);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return kotlin.jvm.internal.L.f(this.f39223a, ((c) obj).f39223a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f39223a.hashCode();
        }
    }

    public /* synthetic */ D0(C42822w c42822w) {
        this();
    }

    @Y61.k
    /* renamed from: a */
    public abstract l0.j getF39222a();

    public D0() {
    }
}
