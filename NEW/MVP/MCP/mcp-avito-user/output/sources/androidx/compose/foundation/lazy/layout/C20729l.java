package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.C20725j;
import androidx.compose.ui.layout.C22370l;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22368k;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;

/* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/lazy/layout/l;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/modifier/k;", "Landroidx/compose/ui/layout/k;", "Landroidx/compose/ui/node/K;", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.layout.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20729l extends v.d implements androidx.compose.ui.modifier.k, InterfaceC22368k, androidx.compose.ui.node.K {

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public static final a f29455t;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public InterfaceC20731m f29456p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public C20725j f29457q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f29458r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public Orientation f29459s;

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/lazy/layout/l$a", "Landroidx/compose/ui/layout/k$a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.l$a */
    public static final class a implements InterfaceC22368k.a {
        @Override // androidx.compose.ui.layout.InterfaceC22368k.a
        public final boolean a() {
            return false;
        }
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0004*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/lazy/layout/l$b;", "", "<init>", "()V", "androidx/compose/foundation/lazy/layout/l$a", "emptyBeyondBoundsScope", "Landroidx/compose/foundation/lazy/layout/l$a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.l$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.l$c */
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutDirection layoutDirection = LayoutDirection.f42838b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/lazy/layout/l$d", "Landroidx/compose/ui/layout/k$a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.layout.l$d */
    public static final class d implements InterfaceC22368k.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l0.h<C20725j.a> f29461b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f29462c;

        public d(l0.h<C20725j.a> hVar, int i12) {
            this.f29461b = hVar;
            this.f29462c = i12;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22368k.a
        public final boolean a() {
            C20725j.a aVar = this.f29461b.f406842b;
            a aVar2 = C20729l.f29455t;
            return C20729l.this.k2(aVar, this.f29462c);
        }
    }

    /* compiled from: LazyLayoutBeyondBoundsModifierLocal.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.lazy.layout.l$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f29463l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.compose.ui.layout.K0 k02) {
            super(1);
            this.f29463l = k02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            aVar.e(this.f29463l, 0, 0, 0.0f);
            return kotlin.G0.f406611a;
        }
    }

    static {
        new b(null);
        f29455t = new a();
    }

    @Override // androidx.compose.ui.layout.InterfaceC22368k
    @Y61.l
    public final <T> T O1(int i12, @Y61.k Y41.l<? super InterfaceC22368k.a, ? extends T> lVar) {
        if (this.f29456p.P() <= 0 || !this.f29456p.S() || !this.f42893o) {
            return lVar.invoke(f29455t);
        }
        int iT2 = l2(i12) ? this.f29456p.T() : this.f29456p.Q();
        l0.h hVar = new l0.h();
        C20725j c20725j = this.f29457q;
        c20725j.getClass();
        T t12 = (T) new C20725j.a(iT2, iT2);
        c20725j.f29438a.b(t12);
        hVar.f406842b = t12;
        int iR2 = this.f29456p.R() * 2;
        int iP2 = this.f29456p.P();
        if (iR2 > iP2) {
            iR2 = iP2;
        }
        T tInvoke = null;
        int i13 = 0;
        while (tInvoke == null && k2((C20725j.a) hVar.f406842b, i12) && i13 < iR2) {
            C20725j.a aVar = (C20725j.a) hVar.f406842b;
            int i14 = aVar.f29439a;
            boolean zL2 = l2(i12);
            int i15 = aVar.f29440b;
            if (zL2) {
                i15++;
            } else {
                i14--;
            }
            C20725j c20725j2 = this.f29457q;
            c20725j2.getClass();
            T t13 = (T) new C20725j.a(i14, i15);
            c20725j2.f29438a.b(t13);
            this.f29457q.f29438a.j((C20725j.a) hVar.f406842b);
            hVar.f406842b = t13;
            i13++;
            C22421l.g(this).j();
            tInvoke = lVar.invoke(new d(hVar, i12));
        }
        this.f29457q.f29438a.j((C20725j.a) hVar.f406842b);
        C22421l.g(this).j();
        return tInvoke;
    }

    @Override // androidx.compose.ui.modifier.k
    @Y61.k
    public final androidx.compose.ui.modifier.j c1() {
        return androidx.compose.ui.modifier.l.a(new kotlin.Q(C22370l.f40480a, this));
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(j12);
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, P0.c(), new e(k0I));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k2(androidx.compose.foundation.lazy.layout.C20725j.a r5, int r6) {
        /*
            r4 = this;
            androidx.compose.ui.layout.k$b$a r0 = androidx.compose.ui.layout.InterfaceC22368k.b.f40472b
            r0.getClass()
            int r0 = androidx.compose.ui.layout.InterfaceC22368k.b.f40477g
            boolean r0 = androidx.compose.ui.layout.InterfaceC22368k.b.a(r6, r0)
            r1 = 1
            if (r0 == 0) goto L10
            r0 = r1
            goto L16
        L10:
            int r0 = androidx.compose.ui.layout.InterfaceC22368k.b.f40478h
            boolean r0 = androidx.compose.ui.layout.InterfaceC22368k.b.a(r6, r0)
        L16:
            r2 = 0
            if (r0 == 0) goto L23
            androidx.compose.foundation.gestures.Orientation r0 = r4.f29459s
            androidx.compose.foundation.gestures.Orientation r3 = androidx.compose.foundation.gestures.Orientation.f27426c
            if (r0 != r3) goto L21
        L1f:
            r0 = r1
            goto L4f
        L21:
            r0 = r2
            goto L4f
        L23:
            int r0 = androidx.compose.ui.layout.InterfaceC22368k.b.f40475e
            boolean r0 = androidx.compose.ui.layout.InterfaceC22368k.b.a(r6, r0)
            if (r0 == 0) goto L2d
            r0 = r1
            goto L33
        L2d:
            int r0 = androidx.compose.ui.layout.InterfaceC22368k.b.f40476f
            boolean r0 = androidx.compose.ui.layout.InterfaceC22368k.b.a(r6, r0)
        L33:
            if (r0 == 0) goto L3c
            androidx.compose.foundation.gestures.Orientation r0 = r4.f29459s
            androidx.compose.foundation.gestures.Orientation r3 = androidx.compose.foundation.gestures.Orientation.f27425b
            if (r0 != r3) goto L21
            goto L1f
        L3c:
            int r0 = androidx.compose.ui.layout.InterfaceC22368k.b.f40473c
            boolean r0 = androidx.compose.ui.layout.InterfaceC22368k.b.a(r6, r0)
            if (r0 == 0) goto L46
            r0 = r1
            goto L4c
        L46:
            int r0 = androidx.compose.ui.layout.InterfaceC22368k.b.f40474d
            boolean r0 = androidx.compose.ui.layout.InterfaceC22368k.b.a(r6, r0)
        L4c:
            if (r0 == 0) goto L6b
            goto L21
        L4f:
            if (r0 == 0) goto L52
            return r2
        L52:
            boolean r6 = r4.l2(r6)
            if (r6 == 0) goto L66
            int r5 = r5.f29440b
            androidx.compose.foundation.lazy.layout.m r6 = r4.f29456p
            int r6 = r6.P()
            int r6 = r6 - r1
            if (r5 >= r6) goto L64
            goto L6a
        L64:
            r1 = r2
            goto L6a
        L66:
            int r5 = r5.f29439a
            if (r5 <= 0) goto L64
        L6a:
            return r1
        L6b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Lazy list does not support beyond bounds layout for the specified direction"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C20729l.k2(androidx.compose.foundation.lazy.layout.j$a, int):boolean");
    }

    public final boolean l2(int i12) {
        InterfaceC22368k.b.f40472b.getClass();
        if (InterfaceC22368k.b.a(i12, InterfaceC22368k.b.f40473c)) {
            return false;
        }
        if (!InterfaceC22368k.b.a(i12, InterfaceC22368k.b.f40474d)) {
            if (InterfaceC22368k.b.a(i12, InterfaceC22368k.b.f40477g)) {
                return this.f29458r;
            }
            if (InterfaceC22368k.b.a(i12, InterfaceC22368k.b.f40478h)) {
                if (this.f29458r) {
                    return false;
                }
            } else if (InterfaceC22368k.b.a(i12, InterfaceC22368k.b.f40475e)) {
                int iOrdinal = C22421l.g(this).f40609C.ordinal();
                if (iOrdinal == 0) {
                    return this.f29458r;
                }
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.f29458r) {
                    return false;
                }
            } else {
                if (!InterfaceC22368k.b.a(i12, InterfaceC22368k.b.f40476f)) {
                    throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                }
                int iOrdinal2 = C22421l.g(this).f40609C.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        return this.f29458r;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (this.f29458r) {
                    return false;
                }
            }
        }
        return true;
    }
}
