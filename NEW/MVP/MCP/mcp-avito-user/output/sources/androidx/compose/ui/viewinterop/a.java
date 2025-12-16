package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC22198x;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.graphics.C22274n0;
import androidx.compose.ui.input.pointer.Q;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.B;
import androidx.compose.ui.layout.C22392w0;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.layout.InterfaceC22393x;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.C22448z;
import androidx.compose.ui.node.J0;
import androidx.compose.ui.node.K0;
import androidx.compose.ui.node.L0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Z0;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.C22486j;
import androidx.compose.ui.platform.J1;
import androidx.compose.ui.platform.T2;
import androidx.compose.ui.semantics.F;
import androidx.compose.ui.unit.C;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.u;
import androidx.compose.ui.v;
import androidx.compose.ui.viewinterop.c;
import androidx.core.graphics.C22771k;
import androidx.core.view.C22823h0;
import androidx.core.view.G0;
import androidx.core.view.J;
import androidx.core.view.L;
import androidx.core.view.M;
import androidx.view.C23489g;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23487e;
import androidx.view.V0;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import l0.g;
import s0.C47949a;

/* compiled from: AndroidViewHolder.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0013J\u0015\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\tR6\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR6\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fR6\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001fR*\u00101\u001a\u00020*2\u0006\u0010\u0019\u001a\u00020*8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R0\u00109\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u0018\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u0010A\u001a\u00020:2\u0006\u0010\u0019\u001a\u00020:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R0\u0010E\u001a\u0010\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u0018\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u00104\u001a\u0004\bC\u00106\"\u0004\bD\u00108R.\u0010M\u001a\u0004\u0018\u00010F2\b\u0010\u0019\u001a\u0004\u0018\u00010F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR.\u0010U\u001a\u0004\u0018\u00010N2\b\u0010\u0019\u001a\u0004\u0018\u00010N8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR0\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\u0018\u0018\u0001028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u00104\u001a\u0004\bX\u00106\"\u0004\bY\u00108R\u0017\u0010`\u001a\u00020[8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006e"}, d2 = {"Landroidx/compose/ui/viewinterop/a;", "Landroid/view/ViewGroup;", "Landroidx/core/view/J;", "Landroidx/compose/runtime/x;", "Landroidx/compose/ui/node/K0;", "Landroidx/core/view/M;", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "", "getNestedScrollAxes", "()I", "c", "Landroid/view/View;", "getView", "view", "Lkotlin/Function0;", "Lkotlin/G0;", "value", "e", "LY41/a;", "getUpdate", "()LY41/a;", "setUpdate", "(LY41/a;)V", "update", "<set-?>", "g", "getReset", "setReset", "reset", "h", "getRelease", "setRelease", "release", "Landroidx/compose/ui/v;", "i", "Landroidx/compose/ui/v;", "getModifier", "()Landroidx/compose/ui/v;", "setModifier", "(Landroidx/compose/ui/v;)V", "modifier", "Lkotlin/Function1;", "j", "LY41/l;", "getOnModifierChanged$ui_release", "()LY41/l;", "setOnModifierChanged$ui_release", "(LY41/l;)V", "onModifierChanged", "Landroidx/compose/ui/unit/d;", "k", "Landroidx/compose/ui/unit/d;", "getDensity", "()Landroidx/compose/ui/unit/d;", "setDensity", "(Landroidx/compose/ui/unit/d;)V", "density", "l", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "onDensityChanged", "Landroidx/lifecycle/P;", "m", "Landroidx/lifecycle/P;", "getLifecycleOwner", "()Landroidx/lifecycle/P;", "setLifecycleOwner", "(Landroidx/lifecycle/P;)V", "lifecycleOwner", "Landroidx/savedstate/e;", "n", "Landroidx/savedstate/e;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/e;", "setSavedStateRegistryOwner", "(Landroidx/savedstate/e;)V", "savedStateRegistryOwner", "", "t", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "onRequestDisallowInterceptTouchEvent", "Landroidx/compose/ui/node/LayoutNode;", "z", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/L0;", "getSnapshotObserver", "()Landroidx/compose/ui/node/L0;", "snapshotObserver", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class a extends ViewGroup implements J, InterfaceC22198x, K0, M {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<a, G0> f42896A;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.input.nestedscroll.b f42897b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final View view;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final J0 f42899d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Y41.a<G0> update;

    /* renamed from: f, reason: collision with root package name */
    public boolean f42901f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Y41.a<G0> reset;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Y41.a<G0> release;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public v modifier;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Y41.l<? super v, G0> onModifierChanged;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public androidx.compose.ui.unit.d density;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Y41.l<? super androidx.compose.ui.unit.d, G0> onDensityChanged;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public InterfaceC22983P lifecycleOwner;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public InterfaceC23487e savedStateRegistryOwner;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final int[] f42910o;

    /* renamed from: p, reason: collision with root package name */
    public long f42911p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public androidx.core.view.J0 f42912q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f42913r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f42914s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Y41.l<? super Boolean, G0> onRequestDisallowInterceptTouchEvent;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final int[] f42916u;

    /* renamed from: v, reason: collision with root package name */
    public int f42917v;

    /* renamed from: w, reason: collision with root package name */
    public int f42918w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final L f42919x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f42920y;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final LayoutNode layoutNode;

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/viewinterop/a$a", "Landroidx/core/view/G0$b;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.viewinterop.a$a, reason: collision with other inner class name */
    public static final class C1694a extends G0.b {
        public C1694a() {
            super(1);
        }

        @Override // androidx.core.view.G0.b
        public final androidx.core.view.J0 d(androidx.core.view.J0 j02, List<androidx.core.view.G0> list) {
            Y41.l<a, kotlin.G0> lVar = a.f42896A;
            return a.this.e(j02);
        }

        @Override // androidx.core.view.G0.b
        public final G0.a e(androidx.core.view.G0 g02, G0.a aVar) {
            C22448z c22448z = a.this.layoutNode.f40615I.f40875b;
            if (!c22448z.f40957T.f42893o) {
                return aVar;
            }
            long jC2 = androidx.compose.ui.unit.r.c(B.e(c22448z));
            q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
            int i12 = (int) (jC2 >> 32);
            if (i12 < 0) {
                i12 = 0;
            }
            int i13 = (int) (jC2 & 4294967295L);
            if (i13 < 0) {
                i13 = 0;
            }
            long jA2 = B.c(c22448z).a();
            int i14 = (int) (jA2 >> 32);
            int i15 = (int) (jA2 & 4294967295L);
            long j12 = c22448z.f40347d;
            long jC3 = androidx.compose.ui.unit.r.c(c22448z.y((Float.floatToRawIntBits((int) (j12 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j12 & 4294967295L)) & 4294967295L)));
            int i16 = i14 - ((int) (jC3 >> 32));
            if (i16 < 0) {
                i16 = 0;
            }
            int i17 = i15 - ((int) (4294967295L & jC3));
            int i18 = i17 >= 0 ? i17 : 0;
            return (i12 == 0 && i13 == 0 && i16 == 0 && i18 == 0) ? aVar : new G0.a(a.d(aVar.f44905a, i12, i13, i16, i18), a.d(aVar.f44906b, i12, i13, i16, i18));
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/viewinterop/a;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/viewinterop/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f42923l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(a aVar) {
            a aVar2 = aVar;
            aVar2.getHandler().post(new androidx.compose.ui.viewinterop.b(0, aVar2.f42913r));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/viewinterop/a$c;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/viewinterop/a;", "Lkotlin/G0;", "OnCommitAffectingUpdate", "LY41/l;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/v;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/v;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<v, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f42924l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f42925m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LayoutNode layoutNode, v vVar) {
            super(1);
            this.f42924l = layoutNode;
            this.f42925m = vVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(v vVar) {
            this.f42924l.d(vVar.d0(this.f42925m));
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/d;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/unit/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<androidx.compose.ui.unit.d, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f42926l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LayoutNode layoutNode) {
            super(1);
            this.f42926l = layoutNode;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.unit.d dVar) {
            this.f42926l.k(dVar);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/J0;", SearchParamsConverterKt.OWNER, "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/J0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<J0, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f42928m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LayoutNode layoutNode) {
            super(1);
            this.f42928m = layoutNode;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(J0 j02) {
            J0 j03 = j02;
            AndroidComposeView androidComposeView = j03 instanceof AndroidComposeView ? (AndroidComposeView) j03 : null;
            a aVar = a.this;
            if (androidComposeView != null) {
                HashMap<a, LayoutNode> holderToLayoutNode = androidComposeView.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                LayoutNode layoutNode = this.f42928m;
                holderToLayoutNode.put(aVar, layoutNode);
                androidComposeView.getAndroidViewsHandler$ui_release().addView(aVar);
                androidComposeView.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, aVar);
                aVar.setImportantForAccessibility(1);
                C22823h0.C(aVar, new C22486j(androidComposeView, layoutNode, androidComposeView));
            }
            if (aVar.getView().getParent() != aVar) {
                aVar.addView(aVar.getView());
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/J0;", SearchParamsConverterKt.OWNER, "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/node/J0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<J0, kotlin.G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(J0 j02) {
            J0 j03 = j02;
            boolean z12 = androidx.compose.ui.l.f40320a;
            AndroidComposeView androidComposeView = j03 instanceof AndroidComposeView ? (AndroidComposeView) j03 : null;
            a aVar = a.this;
            if (androidComposeView != null) {
                androidComposeView.J(aVar);
            }
            aVar.removeAllViewsInLayout();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/viewinterop/a$h", "Landroidx/compose/ui/layout/i0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h implements InterfaceC22365i0 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f42931b;

        /* compiled from: AndroidViewHolder.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.ui.viewinterop.a$h$a, reason: collision with other inner class name */
        public static final class C1695a extends N implements Y41.l<K0.a, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final C1695a f42932l = new C1695a();

            public C1695a() {
                super(1);
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ kotlin.G0 invoke(K0.a aVar) {
                return kotlin.G0.f406611a;
            }
        }

        /* compiled from: AndroidViewHolder.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends N implements Y41.l<K0.a, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ a f42933l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ LayoutNode f42934m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, LayoutNode layoutNode) {
                super(1);
                this.f42933l = aVar;
                this.f42934m = layoutNode;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(K0.a aVar) {
                androidx.compose.ui.viewinterop.c.a(this.f42933l, this.f42934m);
                return kotlin.G0.f406611a;
            }
        }

        public h(LayoutNode layoutNode) {
            this.f42931b = layoutNode;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22365i0
        public final InterfaceC22367j0 b(InterfaceC22369k0 interfaceC22369k0, List<? extends InterfaceC22363h0> list, long j12) {
            a aVar = a.this;
            if (aVar.getChildCount() == 0) {
                return interfaceC22369k0.L0(C22712b.l(j12), C22712b.k(j12), P0.c(), C1695a.f42932l);
            }
            if (C22712b.l(j12) != 0) {
                aVar.getChildAt(0).setMinimumWidth(C22712b.l(j12));
            }
            if (C22712b.k(j12) != 0) {
                aVar.getChildAt(0).setMinimumHeight(C22712b.k(j12));
            }
            aVar.measure(a.b(aVar, C22712b.l(j12), C22712b.j(j12), aVar.getLayoutParams().width), a.b(aVar, C22712b.k(j12), C22712b.i(j12), aVar.getLayoutParams().height));
            return interfaceC22369k0.L0(aVar.getMeasuredWidth(), aVar.getMeasuredHeight(), P0.c(), new b(aVar, this.f42931b));
        }

        @Override // androidx.compose.ui.layout.InterfaceC22365i0
        public final int c(InterfaceC22393x interfaceC22393x, List<? extends InterfaceC22391w> list, int i12) {
            a aVar = a.this;
            aVar.measure(a.b(aVar, 0, i12, aVar.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return aVar.getMeasuredHeight();
        }

        @Override // androidx.compose.ui.layout.InterfaceC22365i0
        public final int e(InterfaceC22393x interfaceC22393x, List<? extends InterfaceC22391w> list, int i12) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            a aVar = a.this;
            aVar.measure(iMakeMeasureSpec, a.b(aVar, 0, i12, aVar.getLayoutParams().height));
            return aVar.getMeasuredWidth();
        }

        @Override // androidx.compose.ui.layout.InterfaceC22365i0
        public final int f(InterfaceC22393x interfaceC22393x, List<? extends InterfaceC22391w> list, int i12) {
            a aVar = a.this;
            aVar.measure(a.b(aVar, 0, i12, aVar.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return aVar.getMeasuredHeight();
        }

        @Override // androidx.compose.ui.layout.InterfaceC22365i0
        public final int h(InterfaceC22393x interfaceC22393x, List<? extends InterfaceC22391w> list, int i12) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            a aVar = a.this;
            aVar.measure(iMakeMeasureSpec, a.b(aVar, 0, i12, aVar.getLayoutParams().height));
            return aVar.getMeasuredWidth();
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<F, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f42935l = new i();

        public i() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(F f12) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<androidx.compose.ui.graphics.drawscope.g, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f42937m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ a f42938n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(LayoutNode layoutNode, a aVar) {
            super(1);
            this.f42937m = layoutNode;
            this.f42938n = aVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.graphics.drawscope.g gVar) {
            androidx.compose.ui.graphics.M mA2 = gVar.getF39478c().a();
            a aVar = a.this;
            if (aVar.getView().getVisibility() != 8) {
                aVar.f42920y = true;
                AndroidComposeView androidComposeView = this.f42937m.f40641q;
                if (androidComposeView == null) {
                    androidComposeView = null;
                }
                if (androidComposeView != null) {
                    Canvas canvas = C22247d.f39473a;
                    Canvas canvas2 = ((C22245c) mA2).f39351a;
                    androidComposeView.getAndroidViewsHandler$ui_release().getClass();
                    this.f42938n.draw(canvas2);
                }
                aVar.f42920y = false;
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/A;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/A;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<A, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ LayoutNode f42940m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(LayoutNode layoutNode) {
            super(1);
            this.f42940m = layoutNode;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(A a12) {
            WindowInsets windowInsetsR;
            LayoutNode layoutNode = this.f42940m;
            a aVar = a.this;
            androidx.compose.ui.viewinterop.c.a(aVar, layoutNode);
            aVar.f42899d.b();
            int[] iArr = aVar.f42910o;
            int i12 = iArr[0];
            int i13 = iArr[1];
            aVar.getView().getLocationOnScreen(iArr);
            long j12 = aVar.f42911p;
            long jA2 = a12.a();
            aVar.f42911p = jA2;
            androidx.core.view.J0 j02 = aVar.f42912q;
            if (j02 != null && ((i12 != iArr[0] || i13 != iArr[1] || !u.c(j12, jA2)) && (windowInsetsR = aVar.e(j02).r()) != null)) {
                aVar.getView().dispatchApplyWindowInsets(windowInsetsR);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {639, 641}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Y41.p<T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f42941q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f42942r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a f42943s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f42944t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(boolean z12, a aVar, long j12, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f42942r = z12;
            this.f42943s = aVar;
            this.f42944t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return new l(this.f42942r, this.f42943s, this.f42944t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super kotlin.G0> continuation) {
            return ((l) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f42941q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = this.f42943s;
                if (this.f42942r) {
                    androidx.compose.ui.unit.B.f42836b.getClass();
                    this.f42941q = 2;
                    if (aVar.f42897b.a(this.f42944t, 0L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    androidx.compose.ui.unit.B.f42836b.getClass();
                    this.f42941q = 1;
                    if (aVar.f42897b.a(0L, this.f42944t, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {650}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Y41.p<T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f42945q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ long f42947s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(long j12, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f42947s = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return a.this.new m(this.f42947s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super kotlin.G0> continuation) {
            return ((m) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f42945q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = a.this;
                this.f42945q = 1;
                if (aVar.f42897b.c(this.f42947s, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final n f42948l = new n();

        public n() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke() {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final o f42949l = new o();

        public o() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke() {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<kotlin.G0> {
        public p() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            a.this.getLayoutNode().W();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<kotlin.G0> {
        public q() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            a aVar = a.this;
            if (aVar.f42901f && aVar.isAttachedToWindow() && aVar.getView().getParent() == aVar) {
                aVar.getSnapshotObserver().b(aVar, a.f42896A, aVar.getUpdate());
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidViewHolder.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final r f42952l = new r();

        public r() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke() {
            return kotlin.G0.f406611a;
        }
    }

    static {
        new c(null);
        f42896A = b.f42923l;
    }

    public a(@Y61.k Context context, @Y61.l I i12, int i13, @Y61.k androidx.compose.ui.input.nestedscroll.b bVar, @Y61.k View view, @Y61.k J0 j02) {
        super(context);
        this.f42897b = bVar;
        this.view = view;
        this.f42899d = j02;
        if (i12 != null) {
            LinkedHashMap linkedHashMap = T2.f41277a;
            setTag(R.id.androidx_compose_ui_view_composition_context, i12);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        C22823h0.R(this, new C1694a());
        C22823h0.K(this, this);
        this.update = r.f42952l;
        this.reset = o.f42949l;
        this.release = n.f42948l;
        v.a aVar = v.f42878y1;
        this.modifier = aVar;
        this.density = androidx.compose.ui.unit.f.b();
        this.f42910o = new int[2];
        u.f42871b.getClass();
        this.f42911p = 0L;
        this.f42913r = new q();
        this.f42914s = new p();
        this.f42916u = new int[2];
        this.f42917v = BeduinInputModel.MIN_TEXT_VERSION;
        this.f42918w = BeduinInputModel.MIN_TEXT_VERSION;
        this.f42919x = new L();
        LayoutNode layoutNode = new LayoutNode(false, 0, 3, null);
        layoutNode.f40632h = true;
        layoutNode.f40642r = this;
        v vVarA = C22392w0.a(androidx.compose.ui.draw.o.b(C22274n0.b(Q.a(androidx.compose.ui.semantics.r.b(androidx.compose.ui.input.nestedscroll.e.a(aVar, androidx.compose.ui.viewinterop.c.f42955a, bVar), true, i.f42935l), this), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071), new j(layoutNode, this)), new k(layoutNode));
        layoutNode.f40633i = i13;
        layoutNode.d(this.modifier.d0(vVarA));
        this.onModifierChanged = new d(layoutNode, vVarA);
        layoutNode.k(this.density);
        this.onDensityChanged = new e(layoutNode);
        layoutNode.f40622P = new f(layoutNode);
        layoutNode.f40623Q = new g();
        layoutNode.b(new h(layoutNode));
        this.layoutNode = layoutNode;
    }

    public static final int b(a aVar, int i12, int i13, int i14) {
        aVar.getClass();
        return (i14 >= 0 || i12 == i13) ? View.MeasureSpec.makeMeasureSpec(s.g(i14, i12, i13), 1073741824) : (i14 != -2 || i13 == Integer.MAX_VALUE) ? (i14 != -1 || i13 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(i13, BeduinInputModel.MIN_TEXT_VERSION);
    }

    public static C22771k d(C22771k c22771k, int i12, int i13, int i14, int i15) {
        int i16 = c22771k.f44775a - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = c22771k.f44776b - i13;
        if (i17 < 0) {
            i17 = 0;
        }
        int i18 = c22771k.f44777c - i14;
        if (i18 < 0) {
            i18 = 0;
        }
        int i19 = c22771k.f44778d - i15;
        return C22771k.b(i16, i17, i18, i19 >= 0 ? i19 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            C47949a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.f42899d.getSnapshotObserver();
    }

    @Override // androidx.compose.runtime.InterfaceC22198x
    public final void c() {
        this.release.invoke();
    }

    public final androidx.core.view.J0 e(androidx.core.view.J0 j02) {
        if (!j02.l()) {
            return j02;
        }
        C22448z c22448z = this.layoutNode.f40615I.f40875b;
        if (!c22448z.f40957T.f42893o) {
            return j02;
        }
        long jC2 = androidx.compose.ui.unit.r.c(B.e(c22448z));
        q.a aVar = androidx.compose.ui.unit.q.f42862b;
        int i12 = (int) (jC2 >> 32);
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = (int) (jC2 & 4294967295L);
        if (i13 < 0) {
            i13 = 0;
        }
        long jA2 = B.c(c22448z).a();
        int i14 = (int) (jA2 >> 32);
        int i15 = (int) (jA2 & 4294967295L);
        long j12 = c22448z.f40347d;
        long jC3 = androidx.compose.ui.unit.r.c(c22448z.y((Float.floatToRawIntBits((int) (j12 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j12 & 4294967295L)) & 4294967295L)));
        int i16 = i14 - ((int) (jC3 >> 32));
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = i15 - ((int) (4294967295L & jC3));
        int i18 = i17 >= 0 ? i17 : 0;
        return (i12 == 0 && i13 == 0 && i16 == 0 && i18 == 0) ? j02 : j02.m(i12, i13, i16, i18);
    }

    @Override // androidx.compose.runtime.InterfaceC22198x
    public final void f() {
        View view = this.view;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(@Y61.l Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f42916u;
        getLocationInWindow(iArr);
        int i12 = iArr[0];
        region.op(i12, iArr[1], getWidth() + i12, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @Y61.k
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Y61.k
    public final androidx.compose.ui.unit.d getDensity() {
        return this.density;
    }

    @Y61.l
    /* renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    @Y61.k
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    @Y61.l
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Y61.l
    public final InterfaceC22983P getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @Y61.k
    public final v getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f42919x.a();
    }

    @Y61.l
    public final Y41.l<androidx.compose.ui.unit.d, kotlin.G0> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    @Y61.l
    public final Y41.l<v, kotlin.G0> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    @Y61.l
    public final Y41.l<Boolean, kotlin.G0> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    @Y61.k
    public final Y41.a<kotlin.G0> getRelease() {
        return this.release;
    }

    @Y61.k
    public final Y41.a<kotlin.G0> getReset() {
        return this.reset;
    }

    @Y61.l
    public final InterfaceC23487e getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    @Y61.k
    public final Y41.a<kotlin.G0> getUpdate() {
        return this.update;
    }

    @Y61.k
    public final View getView() {
        return this.view;
    }

    @Override // androidx.core.view.M
    @Y61.k
    public final androidx.core.view.J0 h(@Y61.k View view, @Y61.k androidx.core.view.J0 j02) {
        this.f42912q = new androidx.core.view.J0(j02);
        return e(j02);
    }

    @Override // androidx.compose.runtime.InterfaceC22198x
    public final void i() {
        this.reset.invoke();
        boolean z12 = androidx.compose.ui.l.f40320a;
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @Y61.l
    public final ViewParent invalidateChildInParent(@Y61.l int[] iArr, @Y61.l Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f42920y) {
            this.layoutNode.W();
            return null;
        }
        this.view.postOnAnimation(new androidx.compose.ui.viewinterop.b(1, this.f42914s));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.compose.ui.node.K0
    public final boolean n1() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((q) this.f42913r).invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(@Y61.k View view, @Y61.k View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f42920y) {
            this.layoutNode.W();
        } else {
            this.view.postOnAnimation(new androidx.compose.ui.viewinterop.b(1, this.f42914s));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f40586a.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        this.view.layout(0, 0, i14 - i12, i15 - i13);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        View view = this.view;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i12), View.MeasureSpec.getSize(i13));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i12, i13);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f42917v = i12;
        this.f42918w = i13;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@Y61.k View view, float f12, float f13, boolean z12) {
        if (!this.view.isNestedScrollingEnabled()) {
            return false;
        }
        c.a aVar = androidx.compose.ui.viewinterop.c.f42955a;
        C43259k.d(this.f42897b.d(), null, null, new l(z12, this, C.a(f12 * (-1.0f), f13 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@Y61.k View view, float f12, float f13) {
        if (!this.view.isNestedScrollingEnabled()) {
            return false;
        }
        c.a aVar = androidx.compose.ui.viewinterop.c.f42955a;
        C43259k.d(this.f42897b.d(), null, null, new m(C.a(f12 * (-1.0f), f13 * (-1.0f)), null), 3);
        return false;
    }

    @Override // androidx.core.view.I
    public final void onNestedPreScroll(@Y61.k View view, int i12, int i13, @Y61.k int[] iArr, int i14) {
        long jA1;
        if (this.view.isNestedScrollingEnabled()) {
            c.a aVar = androidx.compose.ui.viewinterop.c.f42955a;
            float f12 = i12;
            float f13 = -1;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(f12 * f13) << 32) | (Float.floatToRawIntBits(i13 * f13) & 4294967295L);
            g.a aVar2 = l0.g.f413384b;
            int iB2 = androidx.compose.ui.viewinterop.c.b(i14);
            androidx.compose.ui.input.nestedscroll.f fVar = this.f42897b.f40077a;
            androidx.compose.ui.input.nestedscroll.f fVar2 = null;
            if (fVar != null && fVar.f42893o) {
                fVar2 = (androidx.compose.ui.input.nestedscroll.f) Z0.a(fVar);
            }
            if (fVar2 != null) {
                jA1 = fVar2.a1(iB2, jFloatToRawIntBits);
            } else {
                l0.g.f413384b.getClass();
                jA1 = 0;
            }
            iArr[0] = J1.d(Float.intBitsToFloat((int) (jA1 >> 32)));
            iArr[1] = J1.d(Float.intBitsToFloat((int) (jA1 & 4294967295L)));
        }
    }

    @Override // androidx.core.view.I
    public final void onNestedScroll(@Y61.k View view, int i12, int i13, int i14, int i15, int i16) {
        if (this.view.isNestedScrollingEnabled()) {
            c.a aVar = androidx.compose.ui.viewinterop.c.f42955a;
            g.a aVar2 = l0.g.f413384b;
            this.f42897b.b(androidx.compose.ui.viewinterop.c.b(i16), (Float.floatToRawIntBits(i12 * r2) << 32) | (Float.floatToRawIntBits(i13 * r2) & 4294967295L), (Float.floatToRawIntBits(i14 * (-1)) << 32) | (Float.floatToRawIntBits(i15 * r2) & 4294967295L));
        }
    }

    @Override // androidx.core.view.I
    public final void onNestedScrollAccepted(@Y61.k View view, @Y61.k View view2, int i12, int i13) {
        L l12 = this.f42919x;
        if (i13 == 1) {
            l12.f44969b = i12;
        } else {
            l12.f44968a = i12;
        }
    }

    @Override // androidx.core.view.I
    public final boolean onStartNestedScroll(@Y61.k View view, @Y61.k View view2, int i12, int i13) {
        return ((i12 & 2) == 0 && (i12 & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.I
    public final void onStopNestedScroll(@Y61.k View view, int i12) {
        L l12 = this.f42919x;
        if (i12 == 1) {
            l12.f44969b = 0;
        } else {
            l12.f44968a = 0;
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i12) {
        super.onWindowVisibilityChanged(i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z12) {
        Y41.l<? super Boolean, kotlin.G0> lVar = this.onRequestDisallowInterceptTouchEvent;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z12));
        }
        super.requestDisallowInterceptTouchEvent(z12);
    }

    public final void setDensity(@Y61.k androidx.compose.ui.unit.d dVar) {
        if (dVar != this.density) {
            this.density = dVar;
            Y41.l<? super androidx.compose.ui.unit.d, kotlin.G0> lVar = this.onDensityChanged;
            if (lVar != null) {
                lVar.invoke(dVar);
            }
        }
    }

    public final void setLifecycleOwner(@Y61.l InterfaceC22983P interfaceC22983P) {
        if (interfaceC22983P != this.lifecycleOwner) {
            this.lifecycleOwner = interfaceC22983P;
            V0.b(this, interfaceC22983P);
        }
    }

    public final void setModifier(@Y61.k v vVar) {
        if (vVar != this.modifier) {
            this.modifier = vVar;
            Y41.l<? super v, kotlin.G0> lVar = this.onModifierChanged;
            if (lVar != null) {
                lVar.invoke(vVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(@Y61.l Y41.l<? super androidx.compose.ui.unit.d, kotlin.G0> lVar) {
        this.onDensityChanged = lVar;
    }

    public final void setOnModifierChanged$ui_release(@Y61.l Y41.l<? super v, kotlin.G0> lVar) {
        this.onModifierChanged = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(@Y61.l Y41.l<? super Boolean, kotlin.G0> lVar) {
        this.onRequestDisallowInterceptTouchEvent = lVar;
    }

    public final void setRelease(@Y61.k Y41.a<kotlin.G0> aVar) {
        this.release = aVar;
    }

    public final void setReset(@Y61.k Y41.a<kotlin.G0> aVar) {
        this.reset = aVar;
    }

    public final void setSavedStateRegistryOwner(@Y61.l InterfaceC23487e interfaceC23487e) {
        if (interfaceC23487e != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = interfaceC23487e;
            C23489g.b(this, interfaceC23487e);
        }
    }

    public final void setUpdate(@Y61.k Y41.a<kotlin.G0> aVar) {
        this.update = aVar;
        this.f42901f = true;
        ((q) this.f42913r).invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.J
    public final void onNestedScroll(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, @Y61.k int[] iArr) {
        if (this.view.isNestedScrollingEnabled()) {
            c.a aVar = androidx.compose.ui.viewinterop.c.f42955a;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(i12 * r2) << 32) | (Float.floatToRawIntBits(i13 * r2) & 4294967295L);
            g.a aVar2 = l0.g.f413384b;
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(i14 * (-1));
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(i15 * r2) & 4294967295L;
            long jB2 = this.f42897b.b(androidx.compose.ui.viewinterop.c.b(i16), jFloatToRawIntBits, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << 32));
            iArr[0] = J1.d(Float.intBitsToFloat((int) (jB2 >> 32)));
            iArr[1] = J1.d(Float.intBitsToFloat((int) (jB2 & 4294967295L)));
        }
    }
}
