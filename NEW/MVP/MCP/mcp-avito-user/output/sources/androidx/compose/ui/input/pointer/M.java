package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.Collection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PointerInteropFilter.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/pointer/M;", "Landroidx/compose/ui/input/pointer/J;", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class M implements J {

    /* renamed from: b, reason: collision with root package name */
    public kotlin.jvm.internal.N f40155b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public X f40156c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40157d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final b f40158e = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PointerInteropFilter.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/M$a;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f40159b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f40160c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f40161d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f40162e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f40163f;

        static {
            a aVar = new a("Unknown", 0);
            f40159b = aVar;
            a aVar2 = new a("Dispatching", 1);
            f40160c = aVar2;
            a aVar3 = new a("NotDispatching", 2);
            f40161d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            f40162e = aVarArr;
            f40163f = kotlin.enums.c.a(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f40162e.clone();
        }
    }

    /* compiled from: PointerInteropFilter.android.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/input/pointer/M$b", "Landroidx/compose/ui/input/pointer/I;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends I {

        /* renamed from: b, reason: collision with root package name */
        public a f40164b = a.f40159b;

        /* compiled from: PointerInteropFilter.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Lkotlin/G0;", "invoke", "(Landroid/view/MotionEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<MotionEvent, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ M f40166l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(M m12) {
                super(1);
                this.f40166l = m12;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v4 */
            @Override // Y41.l
            public final G0 invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                kotlin.jvm.internal.N n12 = this.f40166l.f40155b;
                ?? r02 = n12;
                if (n12 == null) {
                    r02 = 0;
                }
                r02.invoke(motionEvent2);
                return G0.f406611a;
            }
        }

        /* compiled from: PointerInteropFilter.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Lkotlin/G0;", "invoke", "(Landroid/view/MotionEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.input.pointer.M$b$b, reason: collision with other inner class name */
        public static final class C1664b extends kotlin.jvm.internal.N implements Y41.l<MotionEvent, G0> {

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ M f40168m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1664b(M m12) {
                super(1);
                this.f40168m = m12;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.N] */
            /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.N] */
            @Override // Y41.l
            public final G0 invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                int actionMasked = motionEvent2.getActionMasked();
                M m12 = this.f40168m;
                if (actionMasked == 0) {
                    ?? r02 = m12.f40155b;
                    b.this.f40164b = ((Boolean) (r02 != 0 ? r02 : null).invoke(motionEvent2)).booleanValue() ? a.f40160c : a.f40161d;
                } else {
                    ?? r03 = m12.f40155b;
                    (r03 != 0 ? r03 : null).invoke(motionEvent2);
                }
                return G0.f406611a;
            }
        }

        /* compiled from: PointerInteropFilter.android.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "Lkotlin/G0;", "invoke", "(Landroid/view/MotionEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class c extends kotlin.jvm.internal.N implements Y41.l<MotionEvent, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ M f40169l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(M m12) {
                super(1);
                this.f40169l = m12;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v4 */
            @Override // Y41.l
            public final G0 invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                kotlin.jvm.internal.N n12 = this.f40169l.f40155b;
                ?? r02 = n12;
                if (n12 == null) {
                    r02 = 0;
                }
                r02.invoke(motionEvent2);
                return G0.f406611a;
            }
        }

        public b() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        public final void a(C22340s c22340s) {
            ?? r02 = c22340s.f40278a;
            Collection collection = (Collection) r02;
            int size = collection.size();
            int i12 = 0;
            while (true) {
                M m12 = M.this;
                if (i12 >= size) {
                    androidx.compose.ui.layout.A a12 = this.f40154a;
                    if (a12 == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    l0.g.f413384b.getClass();
                    S.a(c22340s, a12.y(0L), new C1664b(m12), false);
                    if (this.f40164b == a.f40160c) {
                        int size2 = collection.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            ((C) r02.get(i13)).a();
                        }
                        C22333k c22333k = c22340s.f40279b;
                        if (c22333k == null) {
                            return;
                        }
                        c22333k.f40259c = !m12.f40157d;
                        return;
                    }
                    return;
                }
                if (((C) r02.get(i12)).b()) {
                    if (this.f40164b == a.f40160c) {
                        androidx.compose.ui.layout.A a13 = this.f40154a;
                        if (a13 == null) {
                            throw new IllegalStateException("layoutCoordinates not set");
                        }
                        l0.g.f413384b.getClass();
                        S.a(c22340s, a13.y(0L), new a(m12), true);
                    }
                    this.f40164b = a.f40161d;
                    return;
                }
                i12++;
            }
        }

        public final void b() {
            if (this.f40164b == a.f40160c) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                M m12 = M.this;
                c cVar = new c(m12);
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                motionEventObtain.setSource(0);
                cVar.invoke(motionEventObtain);
                motionEventObtain.recycle();
                this.f40164b = a.f40159b;
                m12.f40157d = false;
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        public final void c(C22340s c22340s, PointerEventPass pointerEventPass) {
            boolean z12;
            ?? r02 = c22340s.f40278a;
            M m12 = M.this;
            if (m12.f40157d) {
                z12 = true;
                break;
            }
            int size = ((Collection) r02).size();
            for (int i12 = 0; i12 < size; i12++) {
                C c12 = (C) r02.get(i12);
                if (C22341t.a(c12) || C22341t.c(c12)) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
            if (this.f40164b != a.f40161d) {
                if (pointerEventPass == PointerEventPass.f40173b && z12) {
                    a(c22340s);
                }
                if (pointerEventPass == PointerEventPass.f40175d && !z12) {
                    a(c22340s);
                }
            }
            if (pointerEventPass == PointerEventPass.f40175d) {
                int size2 = ((Collection) r02).size();
                for (int i13 = 0; i13 < size2; i13++) {
                    if (!C22341t.c((C) r02.get(i13))) {
                        return;
                    }
                }
                this.f40164b = a.f40159b;
                m12.f40157d = false;
            }
        }
    }

    @Override // androidx.compose.ui.input.pointer.J
    @Y61.k
    /* renamed from: S1, reason: from getter */
    public final b getF40158e() {
        return this.f40158e;
    }
}
