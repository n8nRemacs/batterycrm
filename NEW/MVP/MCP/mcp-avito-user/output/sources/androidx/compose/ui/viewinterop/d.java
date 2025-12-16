package androidx.compose.ui.viewinterop;

import Y41.p;
import android.content.Context;
import android.view.View;
import androidx.compose.foundation.H;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.I;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.runtime.saveable.r;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.node.J0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23487e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidView.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<View, G0> f42956a = h.f42974l;

    /* compiled from: AndroidView.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Context, T> f42957l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f42958m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<T, G0> f42959n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f42960o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f42961p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Context, ? extends T> lVar, v vVar, Y41.l<? super T, G0> lVar2, int i12, int i13) {
            super(2);
            this.f42957l = lVar;
            this.f42958m = vVar;
            this.f42959n = lVar2;
            this.f42960o = i12;
            this.f42961p = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f42960o | 1);
            Y41.l<Context, T> lVar = this.f42957l;
            d.b(lVar, this.f42958m, this.f42959n, a12, iA2, this.f42961p);
            return G0.f406611a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "Lkotlin/G0;", "it", "invoke", "(Landroidx/compose/ui/node/LayoutNode;LY41/l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> extends N implements p<LayoutNode, Y41.l<? super T, ? extends G0>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f42962l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(LayoutNode layoutNode, Object obj) {
            d.c(layoutNode).setResetBlock((Y41.l) obj);
            return G0.f406611a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "Lkotlin/G0;", "it", "invoke", "(Landroidx/compose/ui/node/LayoutNode;LY41/l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> extends N implements p<LayoutNode, Y41.l<? super T, ? extends G0>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f42963l = new c();

        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(LayoutNode layoutNode, Object obj) {
            d.c(layoutNode).setUpdateBlock((Y41.l) obj);
            return G0.f406611a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "Lkotlin/G0;", "it", "invoke", "(Landroidx/compose/ui/node/LayoutNode;LY41/l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.viewinterop.d$d, reason: collision with other inner class name */
    public static final class C1696d<T> extends N implements p<LayoutNode, Y41.l<? super T, ? extends G0>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C1696d f42964l = new C1696d();

        public C1696d() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(LayoutNode layoutNode, Object obj) {
            d.c(layoutNode).setReleaseBlock((Y41.l) obj);
            return G0.f406611a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "Lkotlin/G0;", "it", "invoke", "(Landroidx/compose/ui/node/LayoutNode;LY41/l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> extends N implements p<LayoutNode, Y41.l<? super T, ? extends G0>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f42965l = new e();

        public e() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(LayoutNode layoutNode, Object obj) {
            d.c(layoutNode).setUpdateBlock((Y41.l) obj);
            return G0.f406611a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Function1;", "Lkotlin/G0;", "it", "invoke", "(Landroidx/compose/ui/node/LayoutNode;LY41/l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> extends N implements p<LayoutNode, Y41.l<? super T, ? extends G0>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f42966l = new f();

        public f() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(LayoutNode layoutNode, Object obj) {
            d.c(layoutNode).setReleaseBlock((Y41.l) obj);
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Context, T> f42967l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f42968m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f42969n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<T, G0> f42970o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<T, G0> f42971p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f42972q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f42973r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Y41.l<? super Context, ? extends T> lVar, v vVar, Y41.l<? super T, G0> lVar2, Y41.l<? super T, G0> lVar3, Y41.l<? super T, G0> lVar4, int i12, int i13) {
            super(2);
            this.f42967l = lVar;
            this.f42968m = vVar;
            this.f42969n = (N) lVar2;
            this.f42970o = lVar3;
            this.f42971p = lVar4;
            this.f42972q = i12;
            this.f42973r = i13;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f42972q | 1);
            ?? r22 = this.f42969n;
            d.a(this.f42967l, this.f42968m, r22, this.f42970o, this.f42971p, a12, iA2, this.f42973r);
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f42974l = new h();

        public h() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(View view) {
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/node/LayoutNode;", "T", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends N implements Y41.a<LayoutNode> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f42975l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Context, T> f42976m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ I f42977n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ r f42978o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f42979p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ View f42980q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Context context, Y41.l<? super Context, ? extends T> lVar, I i12, r rVar, int i13, View view) {
            super(0);
            this.f42975l = context;
            this.f42976m = lVar;
            this.f42977n = i12;
            this.f42978o = rVar;
            this.f42979p = i13;
            this.f42980q = view;
        }

        @Override // Y41.a
        public final LayoutNode invoke() {
            J0 j02 = (J0) this.f42980q;
            return new androidx.compose.ui.viewinterop.k(this.f42975l, this.f42976m, this.f42977n, this.f42978o, this.f42979p, j02).getLayoutNode();
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/v;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/v;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements p<LayoutNode, v, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final j f42981l = new j();

        public j() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(LayoutNode layoutNode, v vVar) {
            d.c(layoutNode).setModifier(vVar);
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/unit/d;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/unit/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements p<LayoutNode, androidx.compose.ui.unit.d, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final k f42982l = new k();

        public k() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(LayoutNode layoutNode, androidx.compose.ui.unit.d dVar) {
            d.c(layoutNode).setDensity(dVar);
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/lifecycle/P;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/lifecycle/P;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements p<LayoutNode, InterfaceC22983P, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final l f42983l = new l();

        public l() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(LayoutNode layoutNode, InterfaceC22983P interfaceC22983P) {
            d.c(layoutNode).setLifecycleOwner(interfaceC22983P);
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/savedstate/e;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/savedstate/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements p<LayoutNode, InterfaceC23487e, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final m f42984l = new m();

        public m() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(LayoutNode layoutNode, InterfaceC23487e interfaceC23487e) {
            d.c(layoutNode).setSavedStateRegistryOwner(interfaceC23487e);
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/unit/LayoutDirection;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/unit/LayoutDirection;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements p<LayoutNode, LayoutDirection, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final n f42985l = new n();

        /* compiled from: AndroidView.android.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {
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

        public n() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(LayoutNode layoutNode, LayoutDirection layoutDirection) {
            int i12;
            androidx.compose.ui.viewinterop.k kVarC = d.c(layoutNode);
            int iOrdinal = layoutDirection.ordinal();
            if (iOrdinal != 0) {
                i12 = 1;
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i12 = 0;
            }
            kVarC.setLayoutDirection(i12);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.ui.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends android.view.View> void a(@Y61.k Y41.l<? super android.content.Context, ? extends T> r20, @Y61.l androidx.compose.ui.v r21, @Y61.l Y41.l<? super T, kotlin.G0> r22, @Y61.l Y41.l<? super T, kotlin.G0> r23, @Y61.l Y41.l<? super T, kotlin.G0> r24, @Y61.l androidx.compose.runtime.A r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.d.a(Y41.l, androidx.compose.ui.v, Y41.l, Y41.l, Y41.l, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.ui.D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends android.view.View> void b(@Y61.k Y41.l<? super android.content.Context, ? extends T> r14, @Y61.l androidx.compose.ui.v r15, @Y61.l Y41.l<? super T, kotlin.G0> r16, @Y61.l androidx.compose.runtime.A r17, int r18, int r19) {
        /*
            r4 = r18
            r0 = -1783766393(0xffffffff95ade287, float:-7.023154E-26)
            r1 = r17
            androidx.compose.runtime.B r0 = r1.E(r0)
            r1 = r4 & 6
            if (r1 != 0) goto L1b
            r1 = r14
            boolean r2 = r0.u(r14)
            if (r2 == 0) goto L18
            r2 = 4
            goto L19
        L18:
            r2 = 2
        L19:
            r2 = r2 | r4
            goto L1d
        L1b:
            r1 = r14
            r2 = r4
        L1d:
            r3 = r19 & 2
            if (r3 == 0) goto L25
            r2 = r2 | 48
        L23:
            r5 = r15
            goto L36
        L25:
            r5 = r4 & 48
            if (r5 != 0) goto L23
            r5 = r15
            boolean r6 = r0.B(r15)
            if (r6 == 0) goto L33
            r6 = 32
            goto L35
        L33:
            r6 = 16
        L35:
            r2 = r2 | r6
        L36:
            r6 = r4 & 384(0x180, float:5.38E-43)
            r13 = r16
            if (r6 != 0) goto L48
            boolean r6 = r0.u(r13)
            if (r6 == 0) goto L45
            r6 = 256(0x100, float:3.59E-43)
            goto L47
        L45:
            r6 = 128(0x80, float:1.8E-43)
        L47:
            r2 = r2 | r6
        L48:
            r6 = r2 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 == r7) goto L50
            r6 = 1
            goto L51
        L50:
            r6 = 0
        L51:
            r7 = r2 & 1
            boolean r6 = r0.p(r7, r6)
            if (r6 == 0) goto L7c
            if (r3 == 0) goto L5e
            androidx.compose.ui.v$a r3 = androidx.compose.ui.v.f42878y1
            goto L5f
        L5e:
            r3 = r5
        L5f:
            Y41.l<android.view.View, kotlin.G0> r8 = androidx.compose.ui.viewinterop.d.f42956a
            r5 = r2 & 14
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            r6 = r2 & 112(0x70, float:1.57E-43)
            r5 = r5 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            int r2 = r2 << 6
            r2 = r2 & r6
            r11 = r5 | r2
            r12 = 4
            r7 = 0
            r5 = r14
            r6 = r3
            r9 = r16
            r10 = r0
            a(r5, r6, r7, r8, r9, r10, r11, r12)
            r2 = r3
            goto L80
        L7c:
            r0.f()
            r2 = r5
        L80:
            androidx.compose.runtime.c2 r6 = r0.Z()
            if (r6 == 0) goto L95
            androidx.compose.ui.viewinterop.d$a r7 = new androidx.compose.ui.viewinterop.d$a
            r0 = r7
            r1 = r14
            r3 = r16
            r4 = r18
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f38184d = r7
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.d.b(Y41.l, androidx.compose.ui.v, Y41.l, androidx.compose.runtime.A, int, int):void");
    }

    public static final androidx.compose.ui.viewinterop.k c(LayoutNode layoutNode) {
        androidx.compose.ui.viewinterop.a aVar = layoutNode.f40642r;
        if (aVar != null) {
            return (androidx.compose.ui.viewinterop.k) aVar;
        }
        throw H.s("Required value was null.");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v9 ??, still in use, count: 1, list:
          (r10v9 ?? I:java.lang.Object) from 0x0066: INVOKE (r9v0 ?? I:androidx.compose.runtime.A), (r10v9 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.A.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:103)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.InterfaceC22132o
    public static final <T extends android.view.View> Y41.a<androidx.compose.ui.node.LayoutNode> d(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v9 ??, still in use, count: 1, list:
          (r10v9 ?? I:java.lang.Object) from 0x0066: INVOKE (r9v0 ?? I:androidx.compose.runtime.A), (r10v9 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.A.H(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:103)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r8v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */

    public static final <T extends View> void e(A a12, v vVar, int i12, androidx.compose.ui.unit.d dVar, InterfaceC22983P interfaceC22983P, InterfaceC23487e interfaceC23487e, LayoutDirection layoutDirection, U u12) {
        InterfaceC22413h.f40789C1.getClass();
        R3.b(InterfaceC22413h.a.f40795f, a12, u12);
        R3.b(j.f42981l, a12, vVar);
        R3.b(k.f42982l, a12, dVar);
        R3.b(l.f42983l, a12, interfaceC22983P);
        R3.b(m.f42984l, a12, interfaceC23487e);
        R3.b(n.f42985l, a12, layoutDirection);
        p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (a12.getF37887P() || !L.f(a12.t(), Integer.valueOf(i12))) {
            androidx.appcompat.app.r.B(i12, a12, i12, pVar);
        }
    }
}
