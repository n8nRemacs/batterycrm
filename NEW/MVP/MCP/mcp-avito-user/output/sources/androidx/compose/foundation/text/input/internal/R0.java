package androidx.compose.foundation.text.input.internal;

import android.content.ClipData;
import android.view.KeyEvent;
import androidx.compose.foundation.content.g;
import androidx.compose.foundation.content.internal.b;
import androidx.compose.foundation.interaction.g;
import androidx.compose.foundation.text.C20871h;
import androidx.compose.foundation.text.C20981p1;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.InterfaceC20969m1;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.J3;
import androidx.compose.ui.autofill.t;
import androidx.compose.ui.focus.C22220e;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.focus.InterfaceC22224i;
import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22417j;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.InterfaceC22415i;
import androidx.compose.ui.node.InterfaceC22438u;
import androidx.compose.ui.node.InterfaceC22442w;
import androidx.compose.ui.platform.F2;
import androidx.compose.ui.platform.InterfaceC22489j2;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.platform.P1;
import androidx.compose.ui.platform.R1;
import androidx.compose.ui.platform.V1;
import androidx.compose.ui.semantics.C22553a;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.C22654u;
import androidx.compose.ui.text.input.C22655v;
import androidx.compose.ui.text.v0;
import com.facebook.imageutils.JfifUtil;
import java.util.List;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Y1;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: TextFieldDecoratorModifier.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/foundation/text/input/internal/R0;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/u;", "Landroidx/compose/ui/platform/P1;", "Landroidx/compose/ui/node/T0;", "Landroidx/compose/ui/focus/X;", "Landroidx/compose/ui/focus/i;", "Landroidx/compose/ui/node/w;", "Landroidx/compose/ui/node/P0;", "Landroidx/compose/ui/input/key/g;", "Landroidx/compose/ui/node/i;", "Landroidx/compose/ui/modifier/k;", "Landroidx/compose/ui/node/D0;", "Landroidx/compose/ui/node/F;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class R0 extends AbstractC22425n implements InterfaceC22438u, P1, androidx.compose.ui.node.T0, androidx.compose.ui.focus.X, InterfaceC22224i, InterfaceC22442w, androidx.compose.ui.node.P0, androidx.compose.ui.input.key.g, InterfaceC22415i, androidx.compose.ui.modifier.k, androidx.compose.ui.node.D0, androidx.compose.ui.node.F {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public androidx.compose.foundation.interaction.m f30900A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f30901B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public Y1<kotlin.G0> f30902C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.input.pointer.b0 f30903D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public g.a f30904E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.draganddrop.p f30905F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f30906G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public F2 f30907H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f30908I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final C20883c f30909J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final u f30910K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final Y41.l<? super KeyCommand, ? extends kotlin.G0> f30911L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f30912M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final Y41.a<androidx.compose.foundation.content.internal.c> f30913N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f30914O;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public t1 f30915r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public p1 f30916s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public TextFieldSelectionState f30917t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public androidx.compose.foundation.text.input.c f30918u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30919v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f30920w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public C20981p1 f30921x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public androidx.compose.foundation.text.input.f f30922y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f30923z;

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            C22421l.d(R0.this);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            R0 r02 = R0.this;
            C43259k.d(r02.Y1(), null, null, new T0(r02, null), 3);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            R0 r02 = R0.this;
            C43259k.d(r02.Y1(), null, null, new U0(r02, null), 3);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/e;", "newText", "", "invoke", "(Landroidx/compose/ui/text/e;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<C22602e, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f30927l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ R0 f30928m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z12, R0 r02) {
            super(1);
            this.f30927l = z12;
            this.f30928m = r02;
        }

        @Override // Y41.l
        public final Boolean invoke(C22602e c22602e) {
            C22602e c22602e2 = c22602e;
            if (!this.f30927l) {
                return Boolean.FALSE;
            }
            R0 r02 = this.f30928m;
            r02.f30915r.h(c22602e2);
            InterfaceC22204y1 interfaceC22204y1 = r02.f30914O;
            Boolean bool = Boolean.TRUE;
            ((C22082i3) interfaceC22204y1).setValue(bool);
            C43259k.d(r02.Y1(), null, null, new S0(r02, null), 3);
            return bool;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/o0;", "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<List<androidx.compose.ui.text.o0>, Boolean> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(List<androidx.compose.ui.text.o0> list) {
            List<androidx.compose.ui.text.o0> list2 = list;
            androidx.compose.ui.text.o0 o0VarB = R0.this.f30916s.b();
            return Boolean.valueOf(o0VarB != null ? list2.add(o0VarB) : false);
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/e;", "newText", "", "invoke", "(Landroidx/compose/ui/text/e;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<C22602e, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f30930l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ R0 f30931m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z12, R0 r02) {
            super(1);
            this.f30930l = z12;
            this.f30931m = r02;
        }

        @Override // Y41.l
        public final Boolean invoke(C22602e c22602e) {
            C22602e c22602e2 = c22602e;
            if (!this.f30930l) {
                return Boolean.FALSE;
            }
            this.f30931m.f30915r.h(c22602e2);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/e;", "newText", "", "invoke", "(Landroidx/compose/ui/text/e;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<C22602e, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f30932l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ R0 f30933m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z12, R0 r02) {
            super(1);
            this.f30932l = z12;
            this.f30933m = r02;
        }

        @Override // Y41.l
        public final Boolean invoke(C22602e c22602e) {
            C22602e c22602e2 = c22602e;
            if (!this.f30932l) {
                return Boolean.FALSE;
            }
            t1.i(this.f30933m.f30915r, c22602e2, false, 12);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "start", "", "end", "relativeToOriginal", "invoke", "(IIZ)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends kotlin.jvm.internal.N implements Y41.q<Integer, Integer, Boolean, Boolean> {
        public h() {
            super(3);
        }

        @Override // Y41.q
        public final Boolean invoke(Integer num, Integer num2, Boolean bool) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            boolean zBooleanValue = bool.booleanValue();
            R0 r02 = R0.this;
            androidx.compose.foundation.text.input.l lVarB = zBooleanValue ? r02.f30915r.f31452a.b() : r02.f30915r.d();
            long j12 = lVarB.f31512d;
            if (!r02.f30919v || Math.min(iIntValue, iIntValue2) < 0 || Math.max(iIntValue, iIntValue2) > lVarB.f31511c.length()) {
                return Boolean.FALSE;
            }
            v0.a aVar = androidx.compose.ui.text.v0.f42734b;
            if (iIntValue == ((int) (j12 >> 32)) && iIntValue2 == ((int) (j12 & 4294967295L))) {
                return Boolean.TRUE;
            }
            long jA2 = androidx.compose.ui.text.w0.a(iIntValue, iIntValue2);
            if (zBooleanValue || iIntValue == iIntValue2) {
                r02.f30917t.v(TextToolbarState.f31344b);
            } else {
                r02.f30917t.v(TextToolbarState.f31346d);
            }
            if (zBooleanValue) {
                r02.f30915r.l(jA2);
            } else {
                r02.f30915r.k(jA2);
            }
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f30936m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(int i12) {
            super(0);
            this.f30936m = i12;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            R0.o2(R0.this, this.f30936m);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            R0 r02 = R0.this;
            if (!r02.q2()) {
                androidx.compose.ui.focus.Z.a(r02);
            } else if (!r02.f30920w) {
                r02.s2().show();
            }
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            R0 r02 = R0.this;
            if (!r02.q2()) {
                androidx.compose.ui.focus.Z.a(r02);
            }
            r02.f30917t.v(TextToolbarState.f31346d);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            R0 r02 = R0.this;
            C43259k.d(r02.Y1(), null, null, new V0(r02, null), 3);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/text/KeyCommand;", "keyCommand", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/text/KeyCommand;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends kotlin.jvm.internal.N implements Y41.l<KeyCommand, kotlin.G0> {
        public m() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(KeyCommand keyCommand) {
            R0 r02 = R0.this;
            C43259k.d(r02.Y1(), null, CoroutineStart.f410683e, new W0(keyCommand, r02, null), 1);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Landroidx/compose/foundation/content/a;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<Set<? extends androidx.compose.foundation.content.a>> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final Set<? extends androidx.compose.foundation.content.a> invoke() {
            return androidx.compose.foundation.content.internal.e.a(R0.this) != null ? Q0.f30899b : Q0.f30898a;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/platform/K0;", "clipEntry", "Landroidx/compose/ui/platform/L0;", "clipMetadata", "", "invoke", "(Landroidx/compose/ui/platform/K0;Landroidx/compose/ui/platform/L0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.platform.K0, androidx.compose.ui.platform.L0, Boolean> {
        public o() {
            super(2);
        }

        @Override // Y41.p
        public final Boolean invoke(androidx.compose.ui.platform.K0 k02, androidx.compose.ui.platform.L0 l02) {
            ClipData clipData;
            String string;
            androidx.compose.ui.platform.K0 k03 = k02;
            androidx.compose.ui.platform.L0 l03 = l02;
            R0 r02 = R0.this;
            R0.n2(r02);
            r02.f30917t.c();
            int itemCount = k03.f41152a.getItemCount();
            int i12 = 0;
            boolean z12 = false;
            while (true) {
                clipData = k03.f41152a;
                if (i12 >= itemCount) {
                    break;
                }
                z12 = z12 || clipData.getItemAt(i12).getText() != null;
                i12++;
            }
            if (z12) {
                StringBuilder sb2 = new StringBuilder();
                int itemCount2 = clipData.getItemCount();
                boolean z13 = false;
                for (int i13 = 0; i13 < itemCount2; i13++) {
                    CharSequence text = clipData.getItemAt(i13).getText();
                    if (text != null) {
                        if (z13) {
                            sb2.append("\n");
                        }
                        sb2.append(text);
                        z13 = true;
                    }
                }
                string = sb2.toString();
            } else {
                string = null;
            }
            androidx.compose.foundation.content.internal.c cVarA = androidx.compose.foundation.content.internal.e.a(r02);
            if (cVarA == null) {
                if (string != null) {
                    t1.i(r02.f30915r, string, false, 14);
                }
                return Boolean.TRUE;
            }
            g.a.f26980b.getClass();
            ((b.a) cVarA.a()).c(new androidx.compose.foundation.content.g(k03, l03, g.a.f26981c, null, 8, null));
            throw null;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/b;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/draganddrop/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.draganddrop.b, kotlin.G0> {
        public p() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.draganddrop.b bVar) {
            androidx.compose.ui.draganddrop.b bVar2 = bVar;
            R0 r02 = R0.this;
            if (androidx.compose.foundation.content.internal.e.a(r02) != null) {
                androidx.compose.foundation.content.internal.a.a(r02, bVar2);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/b;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/draganddrop/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.draganddrop.b, kotlin.G0> {
        public q() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.draganddrop.b bVar) {
            androidx.compose.foundation.content.d dVarA;
            g.a aVar = new g.a();
            R0 r02 = R0.this;
            r02.f30900A.a(aVar);
            r02.f30904E = aVar;
            androidx.compose.foundation.content.internal.c cVarA = androidx.compose.foundation.content.internal.e.a(r02);
            if (cVarA != null && (dVarA = cVarA.a()) != null) {
                ((b.a) dVarA).a();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "position", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends kotlin.jvm.internal.N implements Y41.l<l0.g, kotlin.G0> {
        public r() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(l0.g gVar) {
            int iG2;
            long jA2 = gVar.f413387a;
            R0 r02 = R0.this;
            androidx.compose.ui.layout.A a12 = (androidx.compose.ui.layout.A) ((C22082i3) r02.f30916s.f31204e).getF42167b();
            if (a12 != null && a12.m()) {
                jA2 = a12.A(jA2);
            }
            p1 p1Var = r02.f30916s;
            androidx.compose.ui.text.o0 o0VarB = p1Var.b();
            if (o0VarB == null) {
                iG2 = -1;
            } else {
                iG2 = o0VarB.f42527b.g(q1.b(p1Var, p1Var.a(jA2)));
            }
            if (iG2 >= 0) {
                r02.f30915r.k(androidx.compose.ui.text.w0.a(iG2, iG2));
            }
            r02.f30917t.y(Handle.f30328b, jA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/b;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/draganddrop/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class s extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.draganddrop.b, kotlin.G0> {
        public s() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.draganddrop.b bVar) {
            androidx.compose.foundation.content.d dVarA;
            R0 r02 = R0.this;
            R0.n2(r02);
            r02.f30917t.c();
            androidx.compose.foundation.content.internal.c cVarA = androidx.compose.foundation.content.internal.e.a(r02);
            if (cVarA != null && (dVarA = cVarA.a()) != null) {
                ((b.a) dVarA).b();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/draganddrop/b;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/draganddrop/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class t extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.draganddrop.b, kotlin.G0> {
        public t() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.draganddrop.b bVar) {
            R0.n2(R0.this);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/text/input/internal/R0$u", "Landroidx/compose/foundation/text/m1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class u implements InterfaceC20969m1 {
        public u() {
        }

        public final void a(int i12) {
            C22654u.f42467b.getClass();
            boolean zB2 = C22654u.b(i12, C22654u.f42474i);
            R0 r02 = R0.this;
            if (zB2) {
                androidx.compose.ui.focus.r rVar = (androidx.compose.ui.focus.r) C22417j.a(r02, androidx.compose.ui.platform.Q0.f41200i);
                C22220e.f39163b.getClass();
                rVar.h(C22220e.f39164c);
            } else if (C22654u.b(i12, C22654u.f42473h)) {
                androidx.compose.ui.focus.r rVar2 = (androidx.compose.ui.focus.r) C22417j.a(r02, androidx.compose.ui.platform.Q0.f41200i);
                C22220e.f39163b.getClass();
                rVar2.h(C22220e.f39165d);
            } else if (C22654u.b(i12, C22654u.f42475j)) {
                r02.s2().hide();
            }
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class v extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public v() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            R0 r02 = R0.this;
            R0.o2(r02, r02.f30921x.b());
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class w extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {
        public w() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            J3 j32 = androidx.compose.ui.platform.Q0.f41211t;
            R0 r02 = R0.this;
            r02.f30907H = (F2) C22417j.a(r02, j32);
            r02.r2();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class x implements PointerInputEventHandler {

        /* compiled from: TextFieldDecoratorModifier.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f30952q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ R0 f30953r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.ui.input.pointer.K f30954s;

            /* compiled from: TextFieldDecoratorModifier.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {JfifUtil.MARKER_SOS}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.foundation.text.input.internal.R0$x$a$a, reason: collision with other inner class name */
            public static final class C1609a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f30955q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ TextFieldSelectionState f30956r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.input.pointer.K f30957s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1609a(TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.input.pointer.K k12, Continuation<? super C1609a> continuation) {
                    super(2, continuation);
                    this.f30956r = textFieldSelectionState;
                    this.f30957s = k12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new C1609a(this.f30956r, this.f30957s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((C1609a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f30955q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f30955q = 1;
                        if (this.f30956r.j(this.f30957s, this) == coroutine_suspended) {
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

            /* compiled from: TextFieldDecoratorModifier.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2", f = "TextFieldDecoratorModifier.kt", i = {}, l = {220}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f30958q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ R0 f30959r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ TextFieldSelectionState f30960s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.input.pointer.K f30961t;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ Y41.a<kotlin.G0> f30962u;

                /* compiled from: TextFieldDecoratorModifier.kt */
                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: androidx.compose.foundation.text.input.internal.R0$x$a$b$a, reason: collision with other inner class name */
                public static final class C1610a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

                    /* renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ R0 f30963l;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C1610a(R0 r02) {
                        super(0);
                        this.f30963l = r02;
                    }

                    @Override // Y41.a
                    public final kotlin.G0 invoke() {
                        R0 r02 = this.f30963l;
                        if (r02.f30912M != null) {
                            r02.s2().show();
                        } else {
                            r02.t2(true);
                        }
                        return kotlin.G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(R0 r02, TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.input.pointer.K k12, Y41.a<kotlin.G0> aVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f30959r = r02;
                    this.f30960s = textFieldSelectionState;
                    this.f30961t = k12;
                    this.f30962u = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f30959r, this.f30960s, this.f30961t, this.f30962u, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f30958q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        R0 r02 = this.f30959r;
                        androidx.compose.foundation.interaction.m mVar = r02.f30900A;
                        C1610a c1610a = new C1610a(r02);
                        this.f30958q = 1;
                        if (this.f30960s.i(this.f30961t, mVar, this.f30962u, c1610a, this) == coroutine_suspended) {
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

            /* compiled from: TextFieldDecoratorModifier.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3", f = "TextFieldDecoratorModifier.kt", i = {}, l = {234}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f30964q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ TextFieldSelectionState f30965r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ androidx.compose.ui.input.pointer.K f30966s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ Y41.a<kotlin.G0> f30967t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(TextFieldSelectionState textFieldSelectionState, androidx.compose.ui.input.pointer.K k12, Y41.a<kotlin.G0> aVar, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f30965r = textFieldSelectionState;
                    this.f30966s = k12;
                    this.f30967t = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f30965r, this.f30966s, this.f30967t, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                    return ((c) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f30964q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f30964q = 1;
                        if (this.f30965r.x(this.f30966s, this.f30967t, this) == coroutine_suspended) {
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

            /* compiled from: TextFieldDecoratorModifier.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class d extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ TextFieldSelectionState f30968l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ R0 f30969m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(TextFieldSelectionState textFieldSelectionState, R0 r02) {
                    super(0);
                    this.f30968l = textFieldSelectionState;
                    this.f30969m = r02;
                }

                @Override // Y41.a
                public final kotlin.G0 invoke() {
                    if (!this.f30968l.f31263d) {
                        androidx.compose.ui.focus.Z.a(this.f30969m);
                    }
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(R0 r02, androidx.compose.ui.input.pointer.K k12, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f30953r = r02;
                this.f30954s = k12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f30953r, this.f30954s, continuation);
                aVar.f30952q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f30952q;
                R0 r02 = this.f30953r;
                TextFieldSelectionState textFieldSelectionState = r02.f30917t;
                d dVar = new d(textFieldSelectionState, r02);
                CoroutineStart coroutineStart = CoroutineStart.f410683e;
                androidx.compose.ui.input.pointer.K k12 = this.f30954s;
                C43259k.d(t12, null, coroutineStart, new C1609a(textFieldSelectionState, k12, null), 1);
                C43259k.d(t12, null, coroutineStart, new b(r02, textFieldSelectionState, k12, dVar, null), 1);
                C43259k.d(t12, null, coroutineStart, new c(textFieldSelectionState, k12, dVar, null), 1);
                return kotlin.G0.f406611a;
            }
        }

        public x() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
            Object objC = kotlinx.coroutines.U.c(new a(R0.this, k12, null), continuation);
            return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/content/internal/c;", "invoke", "()Landroidx/compose/foundation/content/internal/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class y extends kotlin.jvm.internal.N implements Y41.a<androidx.compose.foundation.content.internal.c> {
        public y() {
            super(0);
        }

        @Override // Y41.a
        public final androidx.compose.foundation.content.internal.c invoke() {
            return androidx.compose.foundation.content.internal.e.a(R0.this);
        }
    }

    /* compiled from: TextFieldDecoratorModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {759}, m = "invokeSuspend", n = {}, s = {})
    public static final class z extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f30971q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.content.internal.c f30973s;

        /* compiled from: TextFieldDecoratorModifier.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/V1;", "", "<anonymous>", "(Landroidx/compose/ui/platform/V1;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1", f = "TextFieldDecoratorModifier.kt", i = {}, l = {760}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<V1, Continuation<?>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f30974q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f30975r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ R0 f30976s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ androidx.compose.foundation.content.internal.c f30977t;

            /* compiled from: TextFieldDecoratorModifier.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: androidx.compose.foundation.text.input.internal.R0$z$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C1611a extends kotlin.jvm.internal.H implements Y41.l<C22654u, kotlin.G0> {
                @Override // Y41.l
                public final kotlin.G0 invoke(C22654u c22654u) {
                    R0.o2((R0) this.receiver, c22654u.f42476a);
                    return kotlin.G0.f406611a;
                }
            }

            /* compiled from: TextFieldDecoratorModifier.kt */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ R0 f30978l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(R0 r02) {
                    super(0);
                    this.f30978l = r02;
                }

                @Override // Y41.a
                public final kotlin.G0 invoke() {
                    this.f30978l.f30917t.v(TextToolbarState.f31346d);
                    return kotlin.G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(R0 r02, androidx.compose.foundation.content.internal.c cVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f30976s = r02;
                this.f30977t = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.f30976s, this.f30977t, continuation);
                aVar.f30975r = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(V1 v12, Continuation<?> continuation) {
                return ((a) create(v12, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f30974q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    V1 v12 = (V1) this.f30975r;
                    R0 r02 = this.f30976s;
                    t1 t1Var = r02.f30915r;
                    p1 p1Var = r02.f30916s;
                    C22655v c22655vD = r02.f30921x.d(r02.f30923z);
                    C1611a c1611a = new C1611a(1, r02, R0.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)V", 0);
                    b bVar = new b(r02);
                    Y1<kotlin.G0> y12 = r02.f30902C;
                    InterfaceC22544x2 interfaceC22544x2 = (InterfaceC22544x2) C22417j.a(r02, androidx.compose.ui.platform.Q0.f41210s);
                    this.f30974q = 1;
                    if (C20895i.b(v12, t1Var, p1Var, c22655vD, this.f30977t, c1611a, bVar, y12, interfaceC22544x2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(androidx.compose.foundation.content.internal.c cVar, Continuation<? super z> continuation) {
            super(2, continuation);
            this.f30973s = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            return R0.this.new z(this.f30973s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((z) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f30971q;
            if (i12 == 0) {
                C42729a0.b(obj);
                R0 r02 = R0.this;
                a aVar = new a(r02, this.f30973s, null);
                this.f30971q = 1;
                if (R1.a(r02, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public R0(@Y61.k t1 t1Var, @Y61.k p1 p1Var, @Y61.k TextFieldSelectionState textFieldSelectionState, @Y61.l androidx.compose.foundation.text.input.c cVar, boolean z12, boolean z13, @Y61.k C20981p1 c20981p1, @Y61.l androidx.compose.foundation.text.input.f fVar, boolean z14, @Y61.k androidx.compose.foundation.interaction.m mVar, boolean z15, @Y61.l Y1<kotlin.G0> y12) {
        this.f30915r = t1Var;
        this.f30916s = p1Var;
        this.f30917t = textFieldSelectionState;
        this.f30918u = cVar;
        this.f30919v = z12;
        this.f30920w = z13;
        this.f30921x = c20981p1;
        this.f30922y = fVar;
        this.f30923z = z14;
        this.f30900A = mVar;
        this.f30901B = z15;
        this.f30902C = y12;
        textFieldSelectionState.f31268i = new a();
        androidx.compose.ui.input.pointer.g0 g0VarB = androidx.compose.ui.input.pointer.Z.b(new x());
        k2(g0VarB);
        this.f30903D = g0VarB;
        n nVar = new n();
        o oVar = new o();
        androidx.compose.ui.draganddrop.e eVarA = androidx.compose.ui.draganddrop.l.a(new d1(nVar), new e1(new p(), oVar, new q(), new r(), new s(), new t()));
        k2(eVarA);
        this.f30905F = eVarA;
        this.f30909J = new C20883c();
        this.f30910K = new u();
        this.f30911L = new m();
        this.f30913N = new y();
        this.f30914O = C22126m3.g(Boolean.FALSE);
    }

    public static final void n2(R0 r02) {
        g.a aVar = r02.f30904E;
        if (aVar != null) {
            r02.f30900A.a(new g.b(aVar));
            r02.f30904E = null;
        }
    }

    public static final void o2(R0 r02, int i12) {
        androidx.compose.foundation.text.input.f fVar;
        r02.getClass();
        C22654u.f42467b.getClass();
        if (C22654u.b(i12, 0) || C22654u.b(i12, C22654u.f42469d) || (fVar = r02.f30922y) == null) {
            r02.f30910K.a(i12);
        } else {
            new a1(r02, i12);
            fVar.a();
        }
    }

    @Override // androidx.compose.ui.node.F
    public final void D(@Y61.k androidx.compose.ui.layout.A a12) {
        this.f30905F.D(a12);
    }

    @Override // androidx.compose.ui.node.D0
    public final void K1() {
        androidx.compose.ui.node.E0.a(this, new w());
    }

    @Override // androidx.compose.ui.node.F
    public final void M(long j12) {
        this.f30905F.M(j12);
    }

    @Override // androidx.compose.ui.node.T0
    public final void O(@Y61.k androidx.compose.ui.semantics.F f12) {
        androidx.compose.foundation.text.input.l lVarB = this.f30915r.b();
        long j12 = lVarB.f31512d;
        C22602e c22602e = new C22602e(this.f30915r.f31452a.b().f31511c.toString(), null, 2, null);
        kotlin.reflect.n<Object>[] nVarArr = androidx.compose.ui.semantics.C.f41719a;
        androidx.compose.ui.semantics.y yVar = androidx.compose.ui.semantics.y.f41820a;
        yVar.getClass();
        androidx.compose.ui.semantics.E<C22602e> e12 = androidx.compose.ui.semantics.y.f41809D;
        kotlin.reflect.n<Object>[] nVarArr2 = androidx.compose.ui.semantics.C.f41719a;
        kotlin.reflect.n<Object> nVar = nVarArr2[16];
        e12.getClass();
        f12.a(e12, c22602e);
        C22602e c22602e2 = new C22602e(lVarB.f31511c.toString(), null, 2, null);
        yVar.getClass();
        androidx.compose.ui.semantics.E<C22602e> e13 = androidx.compose.ui.semantics.y.f41810E;
        kotlin.reflect.n<Object> nVar2 = nVarArr2[17];
        e13.getClass();
        f12.a(e13, c22602e2);
        yVar.getClass();
        androidx.compose.ui.semantics.E<androidx.compose.ui.text.v0> e14 = androidx.compose.ui.semantics.y.f41811F;
        kotlin.reflect.n<Object> nVar3 = nVarArr2[18];
        androidx.compose.ui.text.v0 v0VarA = androidx.compose.ui.text.v0.a(j12);
        e14.getClass();
        f12.a(e14, v0VarA);
        if (!this.f30919v) {
            androidx.compose.ui.semantics.C.c(f12);
        }
        if (this.f30901B) {
            yVar.getClass();
            f12.a(androidx.compose.ui.semantics.y.f41815J, kotlin.G0.f406611a);
        }
        boolean z12 = this.f30919v && !this.f30920w;
        yVar.getClass();
        androidx.compose.ui.semantics.E<Boolean> e15 = androidx.compose.ui.semantics.y.f41818M;
        kotlin.reflect.n<Object> nVar4 = nVarArr2[24];
        Boolean boolValueOf = Boolean.valueOf(z12);
        e15.getClass();
        f12.a(e15, boolValueOf);
        androidx.compose.ui.autofill.t.f38898a.getClass();
        androidx.compose.ui.autofill.t tVar = t.a.f38900b;
        yVar.getClass();
        androidx.compose.ui.semantics.E<androidx.compose.ui.autofill.t> e16 = androidx.compose.ui.semantics.y.f41837r;
        kotlin.reflect.n<Object> nVar5 = nVarArr2[8];
        e16.getClass();
        f12.a(e16, tVar);
        d dVar = new d(z12, this);
        androidx.compose.ui.semantics.k kVar = androidx.compose.ui.semantics.k.f41760a;
        kVar.getClass();
        f12.a(androidx.compose.ui.semantics.k.f41767h, new C22553a(null, dVar));
        androidx.compose.ui.semantics.C.f(f12, new e());
        if (z12) {
            f fVar = new f(z12, this);
            kVar.getClass();
            f12.a(androidx.compose.ui.semantics.k.f41770k, new C22553a(null, fVar));
            g gVar = new g(z12, this);
            kVar.getClass();
            f12.a(androidx.compose.ui.semantics.k.f41774o, new C22553a(null, gVar));
        }
        h hVar = new h();
        kVar.getClass();
        f12.a(androidx.compose.ui.semantics.k.f41769j, new C22553a(null, hVar));
        int iB2 = this.f30921x.b();
        androidx.compose.ui.semantics.C.h(f12, iB2, new i(iB2));
        androidx.compose.ui.semantics.C.g(f12, new j());
        androidx.compose.ui.semantics.C.i(f12, null, new k());
        if (!androidx.compose.ui.text.v0.d(j12) && !this.f30901B) {
            l lVar = new l();
            kVar.getClass();
            f12.a(androidx.compose.ui.semantics.k.f41776q, new C22553a(null, lVar));
            if (this.f30919v && !this.f30920w) {
                b bVar = new b();
                kVar.getClass();
                f12.a(androidx.compose.ui.semantics.k.f41777r, new C22553a(null, bVar));
            }
        }
        if (z12) {
            c cVar = new c();
            kVar.getClass();
            f12.a(androidx.compose.ui.semantics.k.f41778s, new C22553a(null, cVar));
        }
        androidx.compose.foundation.text.input.c cVar2 = this.f30918u;
        if (cVar2 != null) {
            cVar2.O(f12);
        }
    }

    @Override // androidx.compose.ui.node.InterfaceC22442w
    public final void P(@Y61.k AbstractC22443w0 abstractC22443w0) {
        ((C22082i3) this.f30916s.f31204e).setValue(abstractC22443w0);
    }

    @Override // androidx.compose.ui.input.key.g
    public final boolean R1(@Y61.k KeyEvent keyEvent) {
        return this.f30909J.a(keyEvent, this.f30915r, this.f30916s, this.f30917t, this.f30911L, this.f30919v && !this.f30920w, this.f30923z, new v());
    }

    @Override // androidx.compose.ui.input.key.g
    public final boolean b0(@Y61.k KeyEvent keyEvent) {
        return this.f30909J.b(keyEvent, this.f30915r, this.f30917t, (androidx.compose.ui.focus.r) C22417j.a(this, androidx.compose.ui.platform.Q0.f41200i), s2());
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        K1();
        this.f30917t.f31269j = this.f30913N;
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        p2();
        this.f30917t.f31269j = null;
    }

    @Override // androidx.compose.ui.node.P0
    public final void p1() {
        this.f30903D.p1();
    }

    public final void p2() {
        kotlinx.coroutines.N0 n02 = this.f30912M;
        if (n02 != null) {
            ((kotlinx.coroutines.V0) n02).c(null);
        }
        this.f30912M = null;
        Y1<kotlin.G0> y12 = this.f30902C;
        if (y12 != null) {
            y12.h4();
        }
    }

    public final boolean q2() {
        F2 f22 = this.f30907H;
        return this.f30906G && (f22 != null && f22.a());
    }

    @Override // androidx.compose.ui.node.P0
    public final void r0(@Y61.k C22340s c22340s, @Y61.k PointerEventPass pointerEventPass, long j12) {
        this.f30903D.r0(c22340s, pointerEventPass, j12);
    }

    public final void r2() {
        this.f30917t.f31263d = q2();
        if (q2() && this.f30908I == null) {
            this.f30908I = C43259k.d(Y1(), null, null, new Z0(this, null), 3);
        } else {
            if (q2()) {
                return;
            }
            kotlinx.coroutines.N0 n02 = this.f30908I;
            if (n02 != null) {
                ((kotlinx.coroutines.V0) n02).c(null);
            }
            this.f30908I = null;
        }
    }

    public final InterfaceC22489j2 s2() {
        InterfaceC22489j2 interfaceC22489j2 = (InterfaceC22489j2) C22417j.a(this, androidx.compose.ui.platform.Q0.f41207p);
        if (interfaceC22489j2 != null) {
            return interfaceC22489j2;
        }
        throw new IllegalStateException("No software keyboard controller");
    }

    @Override // androidx.compose.ui.node.InterfaceC22438u
    public final void t(@Y61.k androidx.compose.ui.node.P p12) {
        p12.y1();
        if (((Boolean) ((C22082i3) this.f30914O).getF42167b()).booleanValue()) {
            androidx.compose.ui.graphics.drawscope.g.c0(p12, ((androidx.compose.ui.graphics.T) C22417j.a(this, C20871h.f30716a)).f39331a, 0L, 0L, 0.0f, null, WebSocketProtocol.PAYLOAD_SHORT);
        }
    }

    public final void t2(boolean z12) {
        if (!z12) {
            Boolean bool = this.f30921x.f31770f;
            if (!(bool != null ? bool.booleanValue() : true)) {
                return;
            }
        }
        this.f30912M = C43259k.d(Y1(), null, null, new z(androidx.compose.foundation.content.internal.e.a(this), null), 3);
    }

    @Override // androidx.compose.ui.focus.InterfaceC22224i
    public final void u(@Y61.k FocusStateImpl focusStateImpl) {
        if (this.f30906G == focusStateImpl.a()) {
            return;
        }
        this.f30906G = focusStateImpl.a();
        r2();
        boolean z12 = this.f30919v && !this.f30920w;
        if (focusStateImpl.a()) {
            if (z12) {
                t2(false);
                return;
            }
            return;
        }
        p2();
        t1 t1Var = this.f30915r;
        androidx.compose.foundation.text.input.p pVar = t1Var.f31452a;
        androidx.compose.foundation.text.input.c cVar = t1Var.f31453b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f31477b;
        pVar.f31519b.a().b();
        androidx.compose.foundation.text.input.i iVar = pVar.f31519b;
        iVar.f(null);
        t1Var.m(iVar);
        androidx.compose.foundation.text.input.p.a(pVar, cVar, true, textFieldEditUndoBehavior);
        t1 t1Var2 = this.f30915r;
        androidx.compose.foundation.text.input.c cVar2 = t1Var2.f31453b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = TextFieldEditUndoBehavior.f31477b;
        androidx.compose.foundation.text.input.p pVar2 = t1Var2.f31452a;
        pVar2.f31519b.a().b();
        androidx.compose.foundation.text.input.i iVar2 = pVar2.f31519b;
        int iF2 = androidx.compose.ui.text.v0.f(iVar2.f30759f);
        androidx.compose.foundation.text.input.k.b(iVar2, iF2, iF2);
        androidx.compose.foundation.text.input.p.a(pVar2, cVar2, true, textFieldEditUndoBehavior2);
    }

    @Override // androidx.compose.ui.node.T0
    /* renamed from: x1 */
    public final boolean getF41731p() {
        return true;
    }
}
