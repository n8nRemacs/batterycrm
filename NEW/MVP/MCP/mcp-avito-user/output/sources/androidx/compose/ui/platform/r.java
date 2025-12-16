package androidx.compose.ui.platform;

import Fc1.G3;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.collection.C20203c;
import androidx.collection.C20245x0;
import androidx.collection.C20247y0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.C22553a;
import androidx.compose.ui.text.C22602e;
import androidx.core.view.C22808a;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.channels.C43108m;
import l0.g;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/r;", "Landroidx/core/view/a;", "b", "c", "d", "e", "f", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r extends C22808a {

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public static final C20247y0 f41532P;

    /* renamed from: A, reason: collision with root package name */
    public boolean f41533A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public f f41534B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public androidx.collection.A0 f41535C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.B0 f41536D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final C20245x0 f41537E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final C20245x0 f41538F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final String f41539G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final String f41540H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.platform.C f41541I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.A0<C22473f2> f41542J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public C22473f2 f41543K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f41544L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final G3 f41545M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final ArrayList f41546N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C22469e2, kotlin.G0> f41547O;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AndroidComposeView f41548d;

    /* renamed from: e, reason: collision with root package name */
    public int f41549e = BeduinInputModel.MIN_TEXT_VERSION;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Y41.l<? super AccessibilityEvent, Boolean> f41550f = new g();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AccessibilityManager f41551g;

    /* renamed from: h, reason: collision with root package name */
    public long f41552h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AccessibilityManagerAccessibilityStateChangeListenerC22510p f41553i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final AccessibilityManagerTouchExplorationStateChangeListenerC22514q f41554j;

    /* renamed from: k, reason: collision with root package name */
    public List<AccessibilityServiceInfo> f41555k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Handler f41556l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final e f41557m;

    /* renamed from: n, reason: collision with root package name */
    public int f41558n;

    /* renamed from: o, reason: collision with root package name */
    public int f41559o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public androidx.core.view.accessibility.f f41560p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public androidx.core.view.accessibility.f f41561q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f41562r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.A0<androidx.compose.ui.semantics.j> f41563s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.A0<androidx.compose.ui.semantics.j> f41564t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.q1<androidx.collection.q1<CharSequence>> f41565u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.q1<androidx.collection.M0<CharSequence>> f41566v;

    /* renamed from: w, reason: collision with root package name */
    public int f41567w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public Integer f41568x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final C20203c<LayoutNode> f41569y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final C43108m f41570z;

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/platform/r$a", "Landroid/view/View$OnAttachStateChangeListener;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            r rVar = r.this;
            AccessibilityManager accessibilityManager = rVar.f41551g;
            accessibilityManager.addAccessibilityStateChangeListener(rVar.f41553i);
            accessibilityManager.addTouchExplorationStateChangeListener(rVar.f41554j);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            r rVar = r.this;
            rVar.f41556l.removeCallbacks(rVar.f41545M);
            AccessibilityManager accessibilityManager = rVar.f41551g;
            accessibilityManager.removeAccessibilityStateChangeListener(rVar.f41553i);
            accessibilityManager.removeTouchExplorationStateChangeListener(rVar.f41554j);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/r$b;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @j.X
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f41572a = 0;

        static {
            new b();
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/r$c;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @j.X
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f41573a = 0;

        static {
            new c();
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/r$d;", "", "<init>", "()V", "Landroidx/collection/F;", "AccessibilityActionsResourceIds", "Landroidx/collection/F;", "", "AccessibilityCursorPositionUndefined", "I", "AccessibilitySliderStepsCount", "", "ClassName", "Ljava/lang/String;", "ExtraDataIdKey", "ExtraDataTestTagKey", "InvalidId", "LogTag", "ParcelSafeTextLength", "TextClassName", "TextFieldClassName", "", "TextTraversedEventTimeoutMillis", "J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/r$e;", "Landroidx/core/view/accessibility/g;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class e extends androidx.core.view.accessibility.g {
        public e() {
        }

        @Override // androidx.core.view.accessibility.g
        public final void a(int i12, @Y61.k androidx.core.view.accessibility.f fVar, @Y61.k String str, @Y61.l Bundle bundle) {
            C20247y0 c20247y0 = r.f41532P;
            r.this.j(i12, fVar, str, bundle);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x02f3  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x0301  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0324  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x0354  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x038a  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x03ac  */
        /* JADX WARN: Removed duplicated region for block: B:184:0x03c0  */
        /* JADX WARN: Removed duplicated region for block: B:206:0x0444  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x044d  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x0450  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x04b6  */
        /* JADX WARN: Removed duplicated region for block: B:241:0x04da  */
        /* JADX WARN: Removed duplicated region for block: B:248:0x04fc  */
        /* JADX WARN: Removed duplicated region for block: B:255:0x0514  */
        /* JADX WARN: Removed duplicated region for block: B:258:0x0526  */
        /* JADX WARN: Removed duplicated region for block: B:282:0x05dd  */
        /* JADX WARN: Removed duplicated region for block: B:283:0x05ea  */
        /* JADX WARN: Removed duplicated region for block: B:307:0x0676  */
        /* JADX WARN: Removed duplicated region for block: B:310:0x068b  */
        /* JADX WARN: Removed duplicated region for block: B:313:0x0695  */
        /* JADX WARN: Removed duplicated region for block: B:332:0x06d9  */
        /* JADX WARN: Removed duplicated region for block: B:335:0x06ee  */
        /* JADX WARN: Removed duplicated region for block: B:338:0x06f8  */
        /* JADX WARN: Removed duplicated region for block: B:346:0x071e  */
        /* JADX WARN: Removed duplicated region for block: B:367:0x07af  */
        /* JADX WARN: Removed duplicated region for block: B:368:0x07b3  */
        /* JADX WARN: Removed duplicated region for block: B:371:0x07c2  */
        /* JADX WARN: Removed duplicated region for block: B:424:0x094d  */
        /* JADX WARN: Removed duplicated region for block: B:427:0x0962  */
        /* JADX WARN: Removed duplicated region for block: B:432:0x0982  */
        @Override // androidx.core.view.accessibility.g
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.core.view.accessibility.f b(int r24) {
            /*
                Method dump skipped, instructions count: 2512
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.e.b(int):androidx.core.view.accessibility.f");
        }

        @Override // androidx.core.view.accessibility.g
        @Y61.l
        public final androidx.core.view.accessibility.f c(int i12) {
            r rVar = r.this;
            if (i12 != 1) {
                if (i12 == 2) {
                    return b(rVar.f41558n);
                }
                throw new IllegalArgumentException(AK.c.g(i12, "Unknown focus type: "));
            }
            int i13 = rVar.f41559o;
            if (i13 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i13);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:448:0x019a, code lost:
        
            r1 = null;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:159:0x0364  */
        /* JADX WARN: Removed duplicated region for block: B:308:0x05fe  */
        /* JADX WARN: Removed duplicated region for block: B:367:0x06df  */
        /* JADX WARN: Removed duplicated region for block: B:425:0x07d1  */
        /* JADX WARN: Removed duplicated region for block: B:432:0x07ee A[PHI: r8
  0x07ee: PHI (r8v1 boolean) = (r8v0 boolean), (r8v0 boolean), (r8v0 boolean), (r8v0 boolean), (r8v4 boolean) binds: [B:437:0x0809, B:439:0x080f, B:441:0x0813, B:434:0x07f3, B:348:0x06a7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r0v197, types: [Y41.a, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.internal.w] */
        /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.platform.b$f] */
        /* JADX WARN: Type inference failed for: r4v38 */
        /* JADX WARN: Type inference failed for: r4v41 */
        /* JADX WARN: Type inference failed for: r4v42 */
        /* JADX WARN: Type inference failed for: r4v43 */
        /* JADX WARN: Type inference failed for: r4v47 */
        /* JADX WARN: Type inference failed for: r4v48 */
        /* JADX WARN: Type inference failed for: r4v49 */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r8v22, types: [androidx.compose.ui.platform.b$a, androidx.compose.ui.platform.b$g] */
        @Override // androidx.core.view.accessibility.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean d(int r20, int r21, @Y61.l android.os.Bundle r22) {
            /*
                Method dump skipped, instructions count: 2170
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.e.d(int, int, android.os.Bundle):boolean");
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/r$f;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final androidx.compose.ui.semantics.u f41575a;

        /* renamed from: b, reason: collision with root package name */
        public final int f41576b;

        /* renamed from: c, reason: collision with root package name */
        public final int f41577c;

        /* renamed from: d, reason: collision with root package name */
        public final int f41578d;

        /* renamed from: e, reason: collision with root package name */
        public final int f41579e;

        /* renamed from: f, reason: collision with root package name */
        public final long f41580f;

        public f(@Y61.k androidx.compose.ui.semantics.u uVar, int i12, int i13, int i14, int i15, long j12) {
            this.f41575a = uVar;
            this.f41576b = i12;
            this.f41577c = i13;
            this.f41578d = i14;
            this.f41579e = i15;
            this.f41580f = j12;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/accessibility/AccessibilityEvent;", "invoke", "(Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<AccessibilityEvent, Boolean> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            r rVar = r.this;
            return Boolean.valueOf(rVar.f41548d.getParent().requestSendAccessibilityEvent(rVar.f41548d, accessibilityEvent));
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/e2;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/platform/e2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<C22469e2, kotlin.G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(C22469e2 c22469e2) {
            C22469e2 c22469e22 = c22469e2;
            C20247y0 c20247y0 = r.f41532P;
            r rVar = r.this;
            rVar.getClass();
            if (c22469e22.f41437c.contains(c22469e22)) {
                rVar.f41548d.getSnapshotObserver().b(c22469e22, rVar.f41547O, new C22525t(c22469e22, rVar));
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/LayoutNode;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends kotlin.jvm.internal.N implements Y41.l<LayoutNode, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f41583l = new i();

        public i() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(LayoutNode layoutNode) {
            androidx.compose.ui.semantics.l lVarQ = layoutNode.Q();
            boolean z12 = false;
            if (lVarQ != null && lVarQ.f41788d) {
                z12 = true;
            }
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/node/LayoutNode;", "invoke", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j extends kotlin.jvm.internal.N implements Y41.l<LayoutNode, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final j f41584l = new j();

        public j() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(LayoutNode layoutNode) {
            return Boolean.valueOf(layoutNode.f40615I.d(8));
        }
    }

    static {
        new d(null);
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        C20247y0 c20247y0 = androidx.collection.G.f25546a;
        C20247y0 c20247y02 = new C20247y0(32, null);
        int i12 = c20247y02.f25545b;
        if (i12 < 0) {
            K.f.b("");
            throw null;
        }
        int i13 = i12 + 32;
        c20247y02.e(i13);
        int[] iArr2 = c20247y02.f25544a;
        int i14 = c20247y02.f25545b;
        if (i12 != i14) {
            C42756l.k(i13, i12, i14, iArr2, iArr2);
        }
        C42756l.p(i12, 0, 12, iArr, iArr2);
        c20247y02.f25545b += 32;
        f41532P = c20247y02;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.platform.p] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.platform.q] */
    public r(@Y61.k AndroidComposeView androidComposeView) {
        this.f41548d = androidComposeView;
        AccessibilityManager accessibilityManager = (AccessibilityManager) androidComposeView.getContext().getSystemService("accessibility");
        this.f41551g = accessibilityManager;
        this.f41552h = 100L;
        this.f41553i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.p
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z12) {
                List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
                r rVar = this.f41522b;
                if (z12) {
                    enabledAccessibilityServiceList = rVar.f41551g.getEnabledAccessibilityServiceList(-1);
                } else {
                    C20247y0 c20247y0 = r.f41532P;
                    enabledAccessibilityServiceList = C42784z0.f406748b;
                }
                rVar.f41555k = enabledAccessibilityServiceList;
            }
        };
        this.f41554j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.q
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z12) {
                r rVar = this.f41528b;
                rVar.f41555k = rVar.f41551g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f41555k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f41556l = new Handler(Looper.getMainLooper());
        this.f41557m = new e();
        this.f41558n = BeduinInputModel.MIN_TEXT_VERSION;
        this.f41559o = BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = 0;
        int i13 = 1;
        C42822w c42822w = null;
        this.f41563s = new androidx.collection.A0<>(i12, i13, c42822w);
        this.f41564t = new androidx.collection.A0<>(i12, i13, c42822w);
        this.f41565u = new androidx.collection.q1<>(0, 1, null);
        this.f41566v = new androidx.collection.q1<>(0, 1, null);
        this.f41567w = -1;
        this.f41569y = new C20203c<>(i12, i13, c42822w);
        this.f41570z = kotlinx.coroutines.channels.A.a(1, null, null, 6);
        this.f41533A = true;
        androidx.collection.A0 a02 = androidx.collection.K.f25558a;
        this.f41535C = a02;
        this.f41536D = new androidx.collection.B0(i12, i13, c42822w);
        this.f41537E = new C20245x0(i12, i13, c42822w);
        this.f41538F = new C20245x0(i12, i13, c42822w);
        this.f41539G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f41540H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f41541I = new androidx.compose.ui.text.platform.C();
        this.f41542J = androidx.collection.K.a();
        this.f41543K = new C22473f2(androidComposeView.getSemanticsOwner().a(), a02);
        androidComposeView.addOnAttachStateChangeListener(new a());
        this.f41545M = new G3(this, 9);
        this.f41546N = new ArrayList();
        this.f41547O = new h();
    }

    public static /* synthetic */ void E(r rVar, int i12, int i13, Integer num, int i14) {
        if ((i14 & 4) != 0) {
            num = null;
        }
        rVar.D(i12, i13, num, null);
    }

    public static CharSequence L(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i12 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i12 = 99999;
                }
                return charSequence.subSequence(0, i12);
            }
        }
        return charSequence;
    }

    public static String t(androidx.compose.ui.semantics.u uVar) {
        C22602e c22602e;
        if (uVar == null) {
            return null;
        }
        androidx.compose.ui.semantics.y.f41820a.getClass();
        androidx.compose.ui.semantics.E<List<String>> e12 = androidx.compose.ui.semantics.y.f41821b;
        androidx.compose.ui.semantics.l lVar = uVar.f41797d;
        androidx.collection.R0<androidx.compose.ui.semantics.E<?>, Object> r02 = lVar.f41786b;
        if (r02.c(e12)) {
            return E0.d.b((List) lVar.d(e12), ",", null, 62);
        }
        if (r02.c(androidx.compose.ui.semantics.y.f41810E)) {
            C22602e c22602eU = u(lVar);
            if (c22602eU != null) {
                return c22602eU.f42127c;
            }
            return null;
        }
        List list = (List) androidx.compose.ui.semantics.m.a(lVar, androidx.compose.ui.semantics.y.f41806A);
        if (list == null || (c22602e = (C22602e) C42745f0.G(list)) == null) {
            return null;
        }
        return c22602e.f42127c;
    }

    public static C22602e u(androidx.compose.ui.semantics.l lVar) {
        androidx.compose.ui.semantics.y.f41820a.getClass();
        return (C22602e) androidx.compose.ui.semantics.m.a(lVar, androidx.compose.ui.semantics.y.f41810E);
    }

    public static final boolean x(androidx.compose.ui.semantics.j jVar, float f12) {
        Y41.a<Float> aVar = jVar.f41754a;
        return (f12 < 0.0f && aVar.invoke().floatValue() > 0.0f) || (f12 > 0.0f && aVar.invoke().floatValue() < jVar.f41755b.invoke().floatValue());
    }

    public static final boolean y(androidx.compose.ui.semantics.j jVar) {
        Y41.a<Float> aVar = jVar.f41754a;
        float fFloatValue = aVar.invoke().floatValue();
        boolean z12 = jVar.f41756c;
        return (fFloatValue > 0.0f && !z12) || (aVar.invoke().floatValue() < jVar.f41755b.invoke().floatValue() && z12);
    }

    public static final boolean z(androidx.compose.ui.semantics.j jVar) {
        Y41.a<Float> aVar = jVar.f41754a;
        float fFloatValue = aVar.invoke().floatValue();
        float fFloatValue2 = jVar.f41755b.invoke().floatValue();
        boolean z12 = jVar.f41756c;
        return (fFloatValue < fFloatValue2 && !z12) || (aVar.invoke().floatValue() > 0.0f && z12);
    }

    public final int A(int i12) {
        if (i12 == this.f41548d.getSemanticsOwner().a().f41800g) {
            return -1;
        }
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(androidx.compose.ui.semantics.u r21, androidx.compose.ui.platform.C22473f2 r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = 1
            int[] r4 = androidx.collection.M.f25564a
            androidx.collection.B0 r4 = new androidx.collection.B0
            r5 = 0
            r6 = 0
            r4.<init>(r5, r3, r6)
            r6 = 4
            java.util.List r7 = androidx.compose.ui.semantics.u.h(r6, r1)
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
            r9 = r5
        L1d:
            androidx.compose.ui.node.LayoutNode r10 = r1.f41796c
            if (r9 >= r8) goto L46
            java.lang.Object r11 = r7.get(r9)
            androidx.compose.ui.semantics.u r11 = (androidx.compose.ui.semantics.u) r11
            androidx.collection.J r12 = r20.s()
            int r13 = r11.f41800g
            boolean r12 = r12.a(r13)
            if (r12 == 0) goto L44
            androidx.collection.B0 r12 = r2.f41447b
            int r11 = r11.f41800g
            boolean r12 = r12.a(r11)
            if (r12 != 0) goto L41
            r0.w(r10)
            return
        L41:
            r4.b(r11)
        L44:
            int r9 = r9 + r3
            goto L1d
        L46:
            androidx.collection.B0 r2 = r2.f41447b
            int[] r7 = r2.f25560b
            long[] r2 = r2.f25559a
            int r8 = r2.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L93
            r9 = r5
        L52:
            r11 = r2[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8e
            int r13 = r9 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = r5
        L6c:
            if (r15 >= r13) goto L8c
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L88
            int r16 = r9 << 3
            int r16 = r16 + r15
            r5 = r7[r16]
            boolean r5 = r4.a(r5)
            if (r5 != 0) goto L88
            r0.w(r10)
            return
        L88:
            long r11 = r11 >> r14
            int r15 = r15 + r3
            r5 = 0
            goto L6c
        L8c:
            if (r13 != r14) goto L93
        L8e:
            if (r9 == r8) goto L93
            int r9 = r9 + r3
            r5 = 0
            goto L52
        L93:
            java.util.List r1 = androidx.compose.ui.semantics.u.h(r6, r1)
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r5 = 0
        L9f:
            if (r5 >= r2) goto Lc2
            java.lang.Object r4 = r1.get(r5)
            androidx.compose.ui.semantics.u r4 = (androidx.compose.ui.semantics.u) r4
            androidx.collection.J r6 = r20.s()
            int r7 = r4.f41800g
            boolean r6 = r6.a(r7)
            if (r6 == 0) goto Lc0
            androidx.collection.A0<androidx.compose.ui.platform.f2> r6 = r0.f41542J
            int r7 = r4.f41800g
            java.lang.Object r6 = r6.b(r7)
            androidx.compose.ui.platform.f2 r6 = (androidx.compose.ui.platform.C22473f2) r6
            r0.B(r4, r6)
        Lc0:
            int r5 = r5 + r3
            goto L9f
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.B(androidx.compose.ui.semantics.u, androidx.compose.ui.platform.f2):void");
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f41562r = true;
        }
        try {
            return ((Boolean) ((g) this.f41550f).invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f41562r = false;
        }
    }

    public final boolean D(int i12, int i13, Integer num, List<String> list) {
        if (i12 == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i12, i13);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(E0.d.b(list, ",", null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(int i12, int i13, String str) {
        AccessibilityEvent accessibilityEventO = o(A(i12), 32);
        accessibilityEventO.setContentChangeTypes(i13);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i12) {
        f fVar = this.f41534B;
        if (fVar != null) {
            androidx.compose.ui.semantics.u uVar = fVar.f41575a;
            if (i12 != uVar.f41800g) {
                return;
            }
            if (SystemClock.uptimeMillis() - fVar.f41580f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(uVar.f41800g), 131072);
                accessibilityEventO.setFromIndex(fVar.f41578d);
                accessibilityEventO.setToIndex(fVar.f41579e);
                accessibilityEventO.setAction(fVar.f41576b);
                accessibilityEventO.setMovementGranularity(fVar.f41577c);
                accessibilityEventO.getText().add(t(uVar));
                C(accessibilityEventO);
            }
        }
        this.f41534B = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(androidx.collection.J<androidx.compose.ui.platform.C22477g2> r56) {
        /*
            Method dump skipped, instructions count: 1833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.H(androidx.collection.J):void");
    }

    public final void I(LayoutNode layoutNode, androidx.collection.B0 b02) {
        androidx.compose.ui.semantics.l lVarQ;
        LayoutNode layoutNodeB;
        if (layoutNode.m() && !this.f41548d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.f40615I.d(8)) {
                layoutNode = C22537w.b(layoutNode, j.f41584l);
            }
            if (layoutNode == null || (lVarQ = layoutNode.Q()) == null) {
                return;
            }
            if (!lVarQ.f41788d && (layoutNodeB = C22537w.b(layoutNode, i.f41583l)) != null) {
                layoutNode = layoutNodeB;
            }
            int i12 = layoutNode.f40627c;
            if (b02.b(i12)) {
                E(this, A(i12), 2048, 1, 8);
            }
        }
    }

    public final void J(LayoutNode layoutNode) {
        if (layoutNode.m() && !this.f41548d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int i12 = layoutNode.f40627c;
            androidx.compose.ui.semantics.j jVarB = this.f41563s.b(i12);
            androidx.compose.ui.semantics.j jVarB2 = this.f41564t.b(i12);
            if (jVarB == null && jVarB2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventO = o(i12, 4096);
            if (jVarB != null) {
                accessibilityEventO.setScrollX((int) jVarB.f41754a.invoke().floatValue());
                accessibilityEventO.setMaxScrollX((int) jVarB.f41755b.invoke().floatValue());
            }
            if (jVarB2 != null) {
                accessibilityEventO.setScrollY((int) jVarB2.f41754a.invoke().floatValue());
                accessibilityEventO.setMaxScrollY((int) jVarB2.f41755b.invoke().floatValue());
            }
            C(accessibilityEventO);
        }
    }

    public final boolean K(androidx.compose.ui.semantics.u uVar, int i12, int i13, boolean z12) {
        String strT;
        androidx.compose.ui.semantics.l lVar = uVar.f41797d;
        androidx.compose.ui.semantics.k.f41760a.getClass();
        androidx.compose.ui.semantics.E<C22553a<Y41.q<Integer, Integer, Boolean, Boolean>>> e12 = androidx.compose.ui.semantics.k.f41769j;
        if (lVar.f41786b.c(e12) && C22537w.a(uVar)) {
            Y41.q qVar = (Y41.q) ((C22553a) uVar.f41797d.d(e12)).f41728b;
            if (qVar != null) {
                return ((Boolean) qVar.invoke(Integer.valueOf(i12), Integer.valueOf(i13), Boolean.valueOf(z12))).booleanValue();
            }
            return false;
        }
        if ((i12 == i13 && i13 == this.f41567w) || (strT = t(uVar)) == null) {
            return false;
        }
        if (i12 < 0 || i12 != i13 || i13 > strT.length()) {
            i12 = -1;
        }
        this.f41567w = i12;
        boolean z13 = strT.length() > 0;
        int i14 = uVar.f41800g;
        C(p(A(i14), z13 ? Integer.valueOf(this.f41567w) : null, z13 ? Integer.valueOf(this.f41567w) : null, z13 ? Integer.valueOf(strT.length()) : null, strT));
        G(i14);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x014a, code lost:
    
        r31 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0158, code lost:
    
        if (((r1 & ((~r1) << 6)) & (-9187201950435737472L)) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015a, code lost:
    
        r29 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M() {
        /*
            Method dump skipped, instructions count: 599
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.M():void");
    }

    @Override // androidx.core.view.C22808a
    @Y61.k
    public final androidx.core.view.accessibility.g b(@Y61.k View view) {
        return this.f41557m;
    }

    public final void j(int i12, androidx.core.view.accessibility.f fVar, String str, Bundle bundle) {
        androidx.compose.ui.semantics.u uVar;
        androidx.compose.ui.text.o0 o0VarD;
        int i13;
        int i14;
        r rVar = this;
        C22477g2 c22477g2B = s().b(i12);
        if (c22477g2B == null || (uVar = c22477g2B.f41462a) == null) {
            return;
        }
        String strT = t(uVar);
        boolean zF2 = kotlin.jvm.internal.L.f(str, rVar.f41539G);
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f44999a;
        if (zF2) {
            int iB2 = rVar.f41537E.b(i12);
            if (iB2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iB2);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.L.f(str, rVar.f41540H)) {
            int iB3 = rVar.f41538F.b(i12);
            if (iB3 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iB3);
                return;
            }
            return;
        }
        androidx.compose.ui.semantics.k.f41760a.getClass();
        androidx.compose.ui.semantics.E<C22553a<Y41.l<List<androidx.compose.ui.text.o0>, Boolean>>> e12 = androidx.compose.ui.semantics.k.f41761b;
        androidx.compose.ui.semantics.l lVar = uVar.f41797d;
        androidx.collection.R0<androidx.compose.ui.semantics.E<?>, Object> r02 = lVar.f41786b;
        if (!r02.c(e12) || bundle == null || !kotlin.jvm.internal.L.f(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            androidx.compose.ui.semantics.y.f41820a.getClass();
            androidx.compose.ui.semantics.E<String> e13 = androidx.compose.ui.semantics.y.f41844y;
            if (!r02.c(e13) || bundle == null || !kotlin.jvm.internal.L.f(str, "androidx.compose.ui.semantics.testTag")) {
                if (kotlin.jvm.internal.L.f(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, uVar.f41800g);
                    return;
                }
                return;
            } else {
                String str2 = (String) androidx.compose.ui.semantics.m.a(lVar, e13);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i15 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i16 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i16 <= 0 || i15 < 0) {
            return;
        }
        if (i15 < (strT != null ? strT.length() : Integer.MAX_VALUE) && (o0VarD = C22481h2.d(lVar)) != null) {
            ArrayList arrayList = new ArrayList();
            int i17 = 0;
            while (i17 < i16) {
                int i18 = i15 + i17;
                RectF rectF = null;
                if (i18 >= o0VarD.f42526a.f42506a.f42127c.length()) {
                    arrayList.add(null);
                    i13 = i15;
                    i14 = i17;
                } else {
                    l0.j jVarN = o0VarD.b(i18).n(uVar.k());
                    l0.j jVarE = uVar.e();
                    if ((jVarN.l(jVarE) ? jVarN.j(jVarE) : null) != null) {
                        g.a aVar = l0.g.f413384b;
                        AndroidComposeView androidComposeView = rVar.f41548d;
                        long jV2 = androidComposeView.v((Float.floatToRawIntBits(r10.f413390a) << 32) | (Float.floatToRawIntBits(r10.f413391b) & 4294967295L));
                        i14 = i17;
                        i13 = i15;
                        long jV3 = androidComposeView.v((Float.floatToRawIntBits(r10.f413393d) & 4294967295L) | (Float.floatToRawIntBits(r10.f413392c) << 32));
                        rectF = new RectF(Float.intBitsToFloat((int) (jV2 >> 32)), Float.intBitsToFloat((int) (jV2 & 4294967295L)), Float.intBitsToFloat((int) (jV3 >> 32)), Float.intBitsToFloat((int) (jV3 & 4294967295L)));
                    } else {
                        i13 = i15;
                        i14 = i17;
                    }
                    arrayList.add(rectF);
                }
                i17 = i14 + 1;
                rVar = this;
                i15 = i13;
            }
            accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
        }
    }

    public final Rect k(C22477g2 c22477g2) {
        Rect rect = c22477g2.f41463b;
        float f12 = rect.left;
        float f13 = rect.top;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
        g.a aVar = l0.g.f413384b;
        AndroidComposeView androidComposeView = this.f41548d;
        long jV2 = androidComposeView.v(jFloatToRawIntBits);
        float f14 = rect.right;
        float f15 = rect.bottom;
        long jV3 = androidComposeView.v((Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L));
        return new Rect((int) Math.floor(Float.intBitsToFloat((int) (jV2 >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (jV2 & 4294967295L))), (int) Math.ceil(Float.intBitsToFloat((int) (jV3 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (jV3 & 4294967295L))));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0033, B:26:0x005f, B:30:0x0073, B:32:0x007b, B:35:0x0086, B:37:0x008b, B:38:0x009a, B:40:0x00a2, B:42:0x00c4, B:44:0x00d3, B:46:0x00df, B:21:0x004b), top: B:60:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00ff -> B:15:0x0037). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.l(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6 A[PHI: r10
  0x00f6: PHI (r10v2 boolean) = (r10v1 boolean), (r10v4 boolean) binds: [B:18:0x0070, B:48:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r21, long r22, boolean r24) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.r.m(int, long, boolean):boolean");
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.f41548d.getSemanticsOwner().a(), this.f41543K);
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                H(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    M();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @j.k0
    public final AccessibilityEvent o(int i12, int i13) {
        C22477g2 c22477g2B;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i13);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.f41548d;
        accessibilityEventObtain.setPackageName(androidComposeView.getContext().getPackageName());
        accessibilityEventObtain.setSource(androidComposeView, i12);
        if (v() && (c22477g2B = s().b(i12)) != null) {
            androidx.compose.ui.semantics.l lVar = c22477g2B.f41462a.f41797d;
            androidx.compose.ui.semantics.y.f41820a.getClass();
            accessibilityEventObtain.setPassword(lVar.f41786b.c(androidx.compose.ui.semantics.y.f41815J));
        }
        return accessibilityEventObtain;
    }

    public final AccessibilityEvent p(int i12, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i12, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(androidx.compose.ui.semantics.u uVar) {
        androidx.compose.ui.semantics.l lVar = uVar.f41797d;
        androidx.compose.ui.semantics.y yVar = androidx.compose.ui.semantics.y.f41820a;
        yVar.getClass();
        if (!lVar.f41786b.c(androidx.compose.ui.semantics.y.f41821b)) {
            yVar.getClass();
            androidx.compose.ui.semantics.E<androidx.compose.ui.text.v0> e12 = androidx.compose.ui.semantics.y.f41811F;
            androidx.compose.ui.semantics.l lVar2 = uVar.f41797d;
            if (lVar2.f41786b.c(e12)) {
                yVar.getClass();
                return (int) (4294967295L & ((androidx.compose.ui.text.v0) lVar2.d(e12)).f42736a);
            }
        }
        return this.f41567w;
    }

    public final int r(androidx.compose.ui.semantics.u uVar) {
        androidx.compose.ui.semantics.l lVar = uVar.f41797d;
        androidx.compose.ui.semantics.y yVar = androidx.compose.ui.semantics.y.f41820a;
        yVar.getClass();
        if (!lVar.f41786b.c(androidx.compose.ui.semantics.y.f41821b)) {
            yVar.getClass();
            androidx.compose.ui.semantics.E<androidx.compose.ui.text.v0> e12 = androidx.compose.ui.semantics.y.f41811F;
            androidx.compose.ui.semantics.l lVar2 = uVar.f41797d;
            if (lVar2.f41786b.c(e12)) {
                yVar.getClass();
                return (int) (((androidx.compose.ui.text.v0) lVar2.d(e12)).f42736a >> 32);
            }
        }
        return this.f41567w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.collection.J<C22477g2> s() {
        if (this.f41533A) {
            this.f41533A = false;
            AndroidComposeView androidComposeView = this.f41548d;
            this.f41535C = C22481h2.b(androidComposeView.getSemanticsOwner());
            if (v()) {
                androidx.collection.A0 a02 = this.f41535C;
                Resources resources = androidComposeView.getContext().getResources();
                Comparator<androidx.compose.ui.semantics.u>[] comparatorArr = C22537w.f41629a;
                C20245x0 c20245x0 = this.f41537E;
                c20245x0.c();
                C20245x0 c20245x02 = this.f41538F;
                c20245x02.c();
                C22477g2 c22477g2 = (C22477g2) a02.b(-1);
                androidx.compose.ui.semantics.u uVar = c22477g2 != null ? c22477g2.f41462a : null;
                ArrayList arrayListI = C22537w.i(C22537w.g(uVar), Collections.singletonList(uVar), a02, resources);
                int size = arrayListI.size() - 1;
                if (1 <= size) {
                    int i12 = 1;
                    while (true) {
                        int i13 = ((androidx.compose.ui.semantics.u) arrayListI.get(i12 - 1)).f41800g;
                        int i14 = ((androidx.compose.ui.semantics.u) arrayListI.get(i12)).f41800g;
                        c20245x0.f(i13, i14);
                        c20245x02.f(i14, i13);
                        if (i12 == size) {
                            break;
                        }
                        i12++;
                    }
                }
            }
        }
        return this.f41535C;
    }

    public final boolean v() {
        return this.f41551g.isEnabled() && !this.f41555k.isEmpty();
    }

    public final void w(LayoutNode layoutNode) {
        if (this.f41569y.add(layoutNode)) {
            this.f41570z.w(kotlin.G0.f406611a);
        }
    }
}
