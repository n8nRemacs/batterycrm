package androidx.compose.foundation.text.input.internal;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.text.C20985q1;
import androidx.compose.foundation.text.Q2;
import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.C22636b;
import androidx.compose.ui.text.input.C22643i;
import androidx.compose.ui.text.input.C22644j;
import androidx.compose.ui.text.input.C22651q;
import androidx.compose.ui.text.input.C22654u;
import androidx.compose.ui.text.input.InterfaceC22645k;
import androidx.compose.ui.text.l0;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.text.C43059p;

/* compiled from: RecordingInputConnection.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/D0;", "Landroid/view/inputmethod/InputConnection;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D0 implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20894h0 f30802a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f30803b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final C20985q1 f30804c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final C21011f1 f30805d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22544x2 f30806e;

    /* renamed from: f, reason: collision with root package name */
    public int f30807f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.text.input.W f30808g;

    /* renamed from: h, reason: collision with root package name */
    public int f30809h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30810i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ArrayList f30811j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f30812k;

    /* compiled from: RecordingInputConnection.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/k;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/input/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<InterfaceC22645k, kotlin.G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(InterfaceC22645k interfaceC22645k) {
            D0.this.b(interfaceC22645k);
            return kotlin.G0.f406611a;
        }
    }

    public D0(@Y61.k androidx.compose.ui.text.input.W w12, @Y61.k InterfaceC20894h0 interfaceC20894h0, boolean z12, @Y61.l C20985q1 c20985q1, @Y61.l C21011f1 c21011f1, @Y61.l InterfaceC22544x2 interfaceC22544x2) {
        this.f30802a = interfaceC20894h0;
        this.f30803b = z12;
        this.f30804c = c20985q1;
        this.f30805d = c21011f1;
        this.f30806e = interfaceC22544x2;
        this.f30808g = w12;
        this.f30811j = new ArrayList();
        this.f30812k = true;
    }

    public final void b(InterfaceC22645k interfaceC22645k) {
        this.f30807f++;
        try {
            this.f30811j.add(interfaceC22645k);
        } finally {
            c();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z12 = this.f30812k;
        if (!z12) {
            return z12;
        }
        this.f30807f++;
        return true;
    }

    public final boolean c() {
        int i12 = this.f30807f - 1;
        this.f30807f = i12;
        if (i12 == 0) {
            ArrayList arrayList = this.f30811j;
            if (!arrayList.isEmpty()) {
                this.f30802a.d(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f30807f > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i12) {
        boolean z12 = this.f30812k;
        if (z12) {
            return false;
        }
        return z12;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f30811j.clear();
        this.f30807f = 0;
        this.f30812k = false;
        this.f30802a.b(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(@Y61.l CompletionInfo completionInfo) {
        boolean z12 = this.f30812k;
        if (z12) {
            return false;
        }
        return z12;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(@Y61.k InputContentInfo inputContentInfo, int i12, @Y61.l Bundle bundle) {
        boolean z12 = this.f30812k;
        if (z12) {
            return false;
        }
        return z12;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(@Y61.l CorrectionInfo correctionInfo) {
        boolean z12 = this.f30812k;
        return z12 ? this.f30803b : z12;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(@Y61.l CharSequence charSequence, int i12) {
        boolean z12 = this.f30812k;
        if (z12) {
            b(new C22636b(String.valueOf(charSequence), i12));
        }
        return z12;
    }

    public final void d(int i12) {
        sendKeyEvent(new KeyEvent(0, i12));
        sendKeyEvent(new KeyEvent(1, i12));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i12, int i13) {
        boolean z12 = this.f30812k;
        if (!z12) {
            return z12;
        }
        b(new C22643i(i12, i13));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i12, int i13) {
        boolean z12 = this.f30812k;
        if (!z12) {
            return z12;
        }
        b(new C22644j(i12, i13));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return c();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z12 = this.f30812k;
        if (!z12) {
            return z12;
        }
        b(new C22651q());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i12) {
        androidx.compose.ui.text.input.W w12 = this.f30808g;
        return TextUtils.getCapsMode(w12.f42383a.f42127c, androidx.compose.ui.text.v0.g(w12.f42384b), i12);
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.k
    public final ExtractedText getExtractedText(@Y61.l ExtractedTextRequest extractedTextRequest, int i12) {
        boolean z12 = (i12 & 1) != 0;
        this.f30810i = z12;
        if (z12) {
            this.f30809h = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return E0.a(this.f30808g);
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.l
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.l
    public final CharSequence getSelectedText(int i12) {
        if (androidx.compose.ui.text.v0.d(this.f30808g.f42384b)) {
            return null;
        }
        return androidx.compose.ui.text.input.X.a(this.f30808g).f42127c;
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.k
    public final CharSequence getTextAfterCursor(int i12, int i13) {
        return androidx.compose.ui.text.input.X.b(this.f30808g, i12).f42127c;
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.k
    public final CharSequence getTextBeforeCursor(int i12, int i13) {
        return androidx.compose.ui.text.input.X.c(this.f30808g, i12).f42127c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i12) {
        boolean z12 = this.f30812k;
        if (z12) {
            z12 = false;
            switch (i12) {
                case R.id.selectAll:
                    b(new androidx.compose.ui.text.input.V(0, this.f30808g.f42383a.f42127c.length()));
                    break;
                case R.id.cut:
                    d(277);
                    break;
                case R.id.copy:
                    d(278);
                    break;
                case R.id.paste:
                    d(279);
                    break;
            }
        }
        return z12;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i12) {
        int i13;
        boolean z12 = this.f30812k;
        if (!z12) {
            return z12;
        }
        if (i12 != 0) {
            switch (i12) {
                case 2:
                    C22654u.f42467b.getClass();
                    i13 = C22654u.f42470e;
                    break;
                case 3:
                    C22654u.f42467b.getClass();
                    i13 = C22654u.f42471f;
                    break;
                case 4:
                    C22654u.f42467b.getClass();
                    i13 = C22654u.f42472g;
                    break;
                case 5:
                    C22654u.f42467b.getClass();
                    i13 = C22654u.f42474i;
                    break;
                case 6:
                    C22654u.f42467b.getClass();
                    i13 = C22654u.f42475j;
                    break;
                case 7:
                    C22654u.f42467b.getClass();
                    i13 = C22654u.f42473h;
                    break;
                default:
                    C22654u.f42467b.getClass();
                    i13 = C22654u.f42469d;
                    break;
            }
        } else {
            C22654u.f42467b.getClass();
            i13 = C22654u.f42469d;
        }
        this.f30802a.e(i13);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(@Y61.k HandwritingGesture handwritingGesture, @Y61.l Executor executor, @Y61.l IntConsumer intConsumer) {
        int i12;
        Q2 q2D;
        androidx.compose.ui.text.o0 o0Var;
        androidx.compose.ui.text.o0 o0Var2;
        androidx.compose.ui.text.G g12;
        Q2 q2D2;
        androidx.compose.ui.text.o0 o0Var3;
        androidx.compose.ui.text.o0 o0Var4;
        androidx.compose.ui.text.G g13;
        androidx.compose.ui.text.o0 o0Var5;
        androidx.compose.ui.text.n0 n0Var;
        int iB2 = 2;
        int i13 = 1;
        if (Build.VERSION.SDK_INT >= 34) {
            C20901l c20901l = C20901l.f31164a;
            a aVar = new a();
            c20901l.getClass();
            C20985q1 c20985q1 = this.f30804c;
            int i14 = 3;
            if (c20985q1 != null) {
                V.f31005a.getClass();
                C22602e c22602e = c20985q1.f31787j;
                if (c22602e != null) {
                    Q2 q2D3 = c20985q1.d();
                    if (c22602e.equals((q2D3 == null || (o0Var5 = q2D3.f30513a) == null || (n0Var = o0Var5.f42526a) == null) ? null : n0Var.f42506a)) {
                        boolean zU2 = IK.d.u(handwritingGesture);
                        C21011f1 c21011f1 = this.f30805d;
                        if (zU2) {
                            SelectGesture selectGestureM = IK.d.m(handwritingGesture);
                            l0.j jVarE = androidx.compose.ui.graphics.X0.e(selectGestureM.getSelectionArea());
                            int iE2 = V.e(selectGestureM.getGranularity());
                            androidx.compose.ui.text.l0.f42495a.getClass();
                            long j12 = X.j(c20985q1, jVarE, iE2, l0.a.f42498c);
                            if (androidx.compose.ui.text.v0.d(j12)) {
                                iB2 = V.b(Q.l(selectGestureM), aVar);
                                i14 = iB2;
                            } else {
                                aVar.invoke(new androidx.compose.ui.text.input.V((int) (j12 >> 32), (int) (j12 & 4294967295L)));
                                if (c21011f1 != null) {
                                    c21011f1.h(true);
                                }
                                iB2 = i13;
                                i14 = iB2;
                            }
                        } else if (Q.A(handwritingGesture)) {
                            DeleteGesture deleteGestureJ = Q.j(handwritingGesture);
                            int iE3 = V.e(deleteGestureJ.getGranularity());
                            l0.j jVarE2 = androidx.compose.ui.graphics.X0.e(deleteGestureJ.getDeletionArea());
                            androidx.compose.ui.text.l0.f42495a.getClass();
                            long j13 = X.j(c20985q1, jVarE2, iE3, l0.a.f42498c);
                            if (androidx.compose.ui.text.v0.d(j13)) {
                                iB2 = V.b(Q.l(deleteGestureJ), aVar);
                                i14 = iB2;
                            } else {
                                androidx.compose.ui.text.k0.f42491b.getClass();
                                V.d(j13, c22602e, androidx.compose.ui.text.k0.a(iE3, androidx.compose.ui.text.k0.f42492c), aVar);
                                iB2 = i13;
                                i14 = iB2;
                            }
                        } else if (Q.C(handwritingGesture)) {
                            SelectRangeGesture selectRangeGestureN = Q.n(handwritingGesture);
                            l0.j jVarE3 = androidx.compose.ui.graphics.X0.e(selectRangeGestureN.getSelectionStartArea());
                            l0.j jVarE4 = androidx.compose.ui.graphics.X0.e(selectRangeGestureN.getSelectionEndArea());
                            int iE4 = V.e(selectRangeGestureN.getGranularity());
                            androidx.compose.ui.text.l0.f42495a.getClass();
                            long jC2 = X.c(c20985q1, jVarE3, jVarE4, iE4, l0.a.f42498c);
                            if (androidx.compose.ui.text.v0.d(jC2)) {
                                iB2 = V.b(Q.l(selectRangeGestureN), aVar);
                                i14 = iB2;
                            } else {
                                aVar.invoke(new androidx.compose.ui.text.input.V((int) (jC2 >> 32), (int) (jC2 & 4294967295L)));
                                if (c21011f1 != null) {
                                    c21011f1.h(true);
                                }
                                iB2 = i13;
                                i14 = iB2;
                            }
                        } else if (Q.D(handwritingGesture)) {
                            DeleteRangeGesture deleteRangeGestureK = Q.k(handwritingGesture);
                            int iE5 = V.e(deleteRangeGestureK.getGranularity());
                            l0.j jVarE5 = androidx.compose.ui.graphics.X0.e(deleteRangeGestureK.getDeletionStartArea());
                            l0.j jVarE6 = androidx.compose.ui.graphics.X0.e(deleteRangeGestureK.getDeletionEndArea());
                            androidx.compose.ui.text.l0.f42495a.getClass();
                            long jC3 = X.c(c20985q1, jVarE5, jVarE6, iE5, l0.a.f42498c);
                            if (androidx.compose.ui.text.v0.d(jC3)) {
                                iB2 = V.b(Q.l(deleteRangeGestureK), aVar);
                                i14 = iB2;
                            } else {
                                androidx.compose.ui.text.k0.f42491b.getClass();
                                V.d(jC3, c22602e, androidx.compose.ui.text.k0.a(iE5, androidx.compose.ui.text.k0.f42492c), aVar);
                                iB2 = i13;
                                i14 = iB2;
                            }
                        } else {
                            boolean zU3 = Q.u(handwritingGesture);
                            InterfaceC22544x2 interfaceC22544x2 = this.f30806e;
                            if (zU3) {
                                JoinOrSplitGesture joinOrSplitGestureM = Q.m(handwritingGesture);
                                if (interfaceC22544x2 == null) {
                                    iB2 = V.b(Q.l(joinOrSplitGestureM), aVar);
                                } else {
                                    long jG2 = X.g(joinOrSplitGestureM.getJoinOrSplitPoint());
                                    Q2 q2D4 = c20985q1.d();
                                    int i15 = (q2D4 == null || (o0Var4 = q2D4.f30513a) == null || (g13 = o0Var4.f42527b) == null) ? -1 : X.i(g13, jG2, c20985q1.c(), interfaceC22544x2);
                                    if (i15 == -1 || !((q2D2 = c20985q1.d()) == null || (o0Var3 = q2D2.f30513a) == null || !X.e(o0Var3, i15))) {
                                        iB2 = V.b(Q.l(joinOrSplitGestureM), aVar);
                                    } else {
                                        long jF2 = X.f(i15, c22602e);
                                        if (androidx.compose.ui.text.v0.d(jF2)) {
                                            int i16 = (int) (jF2 >> 32);
                                            aVar.invoke(new W(new InterfaceC22645k[]{new androidx.compose.ui.text.input.V(i16, i16), new C22636b(" ", 1)}));
                                        } else {
                                            V.d(jF2, c22602e, false, aVar);
                                        }
                                        iB2 = i13;
                                    }
                                }
                                i14 = iB2;
                            } else if (IK.d.x(handwritingGesture)) {
                                InsertGesture insertGestureK = IK.d.k(handwritingGesture);
                                if (interfaceC22544x2 == null) {
                                    iB2 = V.b(Q.l(insertGestureK), aVar);
                                } else {
                                    long jG3 = X.g(insertGestureK.getInsertionPoint());
                                    Q2 q2D5 = c20985q1.d();
                                    int i17 = (q2D5 == null || (o0Var2 = q2D5.f30513a) == null || (g12 = o0Var2.f42527b) == null) ? -1 : X.i(g12, jG3, c20985q1.c(), interfaceC22544x2);
                                    if (i17 == -1 || !((q2D = c20985q1.d()) == null || (o0Var = q2D.f30513a) == null || !X.e(o0Var, i17))) {
                                        iB2 = V.b(Q.l(insertGestureK), aVar);
                                    } else {
                                        aVar.invoke(new W(new InterfaceC22645k[]{new androidx.compose.ui.text.input.V(i17, i17), new C22636b(insertGestureK.getTextToInsert(), 1)}));
                                        iB2 = i13;
                                    }
                                }
                                i14 = iB2;
                            } else {
                                if (IK.d.z(handwritingGesture)) {
                                    RemoveSpaceGesture removeSpaceGestureL = IK.d.l(handwritingGesture);
                                    Q2 q2D6 = c20985q1.d();
                                    long jB2 = X.b(q2D6 != null ? q2D6.f30513a : null, X.g(removeSpaceGestureL.getStartPoint()), X.g(removeSpaceGestureL.getEndPoint()), c20985q1.c(), interfaceC22544x2);
                                    if (androidx.compose.ui.text.v0.d(jB2)) {
                                        iB2 = V.b(Q.l(removeSpaceGestureL), aVar);
                                    } else {
                                        l0.f fVar = new l0.f();
                                        fVar.f406840b = -1;
                                        l0.f fVar2 = new l0.f();
                                        fVar2.f406840b = -1;
                                        String strG = new C43059p("\\s+").g(androidx.compose.ui.text.w0.c(jB2, c22602e), new U(fVar, fVar2));
                                        int i18 = fVar.f406840b;
                                        if (i18 == -1 || (i12 = fVar2.f406840b) == -1) {
                                            iB2 = V.b(Q.l(removeSpaceGestureL), aVar);
                                        } else {
                                            int i19 = (int) (jB2 >> 32);
                                            i13 = 1;
                                            aVar.invoke(new W(new InterfaceC22645k[]{new androidx.compose.ui.text.input.V(i19 + i18, i19 + i12), new C22636b(strG.substring(i18, strG.length() - (androidx.compose.ui.text.v0.e(jB2) - fVar2.f406840b)), 1)}));
                                            iB2 = i13;
                                        }
                                    }
                                }
                                i14 = iB2;
                            }
                        }
                    }
                }
            }
            if (intConsumer == null) {
                return;
            }
            if (executor != null) {
                executor.execute(new RunnableC20899k(intConsumer, i14, 0));
            } else {
                intConsumer.accept(i14);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(@Y61.l String str, @Y61.l Bundle bundle) {
        boolean z12 = this.f30812k;
        if (z12) {
            return true;
        }
        return z12;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(@Y61.k PreviewableHandwritingGesture previewableHandwritingGesture, @Y61.l CancellationSignal cancellationSignal) {
        androidx.compose.ui.text.o0 o0Var;
        androidx.compose.ui.text.n0 n0Var;
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        C20901l.f31164a.getClass();
        C20985q1 c20985q1 = this.f30804c;
        if (c20985q1 == null) {
            return false;
        }
        V.f31005a.getClass();
        C22602e c22602e = c20985q1.f31787j;
        if (c22602e == null) {
            return false;
        }
        Q2 q2D = c20985q1.d();
        if (!c22602e.equals((q2D == null || (o0Var = q2D.f30513a) == null || (n0Var = o0Var.f42526a) == null) ? null : n0Var.f42506a)) {
            return false;
        }
        boolean zU2 = IK.d.u(previewableHandwritingGesture);
        C21011f1 c21011f1 = this.f30805d;
        if (zU2) {
            SelectGesture selectGestureM = IK.d.m(previewableHandwritingGesture);
            if (c21011f1 != null) {
                l0.j jVarE = androidx.compose.ui.graphics.X0.e(selectGestureM.getSelectionArea());
                int iE2 = V.e(selectGestureM.getGranularity());
                androidx.compose.ui.text.l0.f42495a.getClass();
                c21011f1.s(X.j(c20985q1, jVarE, iE2, l0.a.f42498c));
            }
        } else if (Q.A(previewableHandwritingGesture)) {
            DeleteGesture deleteGestureJ = Q.j(previewableHandwritingGesture);
            if (c21011f1 != null) {
                l0.j jVarE2 = androidx.compose.ui.graphics.X0.e(deleteGestureJ.getDeletionArea());
                int iE3 = V.e(deleteGestureJ.getGranularity());
                androidx.compose.ui.text.l0.f42495a.getClass();
                c21011f1.q(X.j(c20985q1, jVarE2, iE3, l0.a.f42498c));
            }
        } else if (Q.C(previewableHandwritingGesture)) {
            SelectRangeGesture selectRangeGestureN = Q.n(previewableHandwritingGesture);
            if (c21011f1 != null) {
                l0.j jVarE3 = androidx.compose.ui.graphics.X0.e(selectRangeGestureN.getSelectionStartArea());
                l0.j jVarE4 = androidx.compose.ui.graphics.X0.e(selectRangeGestureN.getSelectionEndArea());
                int iE4 = V.e(selectRangeGestureN.getGranularity());
                androidx.compose.ui.text.l0.f42495a.getClass();
                c21011f1.s(X.c(c20985q1, jVarE3, jVarE4, iE4, l0.a.f42498c));
            }
        } else {
            if (!Q.D(previewableHandwritingGesture)) {
                return false;
            }
            DeleteRangeGesture deleteRangeGestureK = Q.k(previewableHandwritingGesture);
            if (c21011f1 != null) {
                l0.j jVarE5 = androidx.compose.ui.graphics.X0.e(deleteRangeGestureK.getDeletionStartArea());
                l0.j jVarE6 = androidx.compose.ui.graphics.X0.e(deleteRangeGestureK.getDeletionEndArea());
                int iE5 = V.e(deleteRangeGestureK.getGranularity());
                androidx.compose.ui.text.l0.f42495a.getClass();
                c21011f1.q(X.c(c20985q1, jVarE5, jVarE6, iE5, l0.a.f42498c));
            }
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new S(c21011f1, 0));
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z12) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i12) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16 = this.f30812k;
        if (!z16) {
            return z16;
        }
        boolean z17 = false;
        boolean z18 = (i12 & 1) != 0;
        boolean z19 = (i12 & 2) != 0;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            boolean z22 = (i12 & 16) != 0;
            boolean z23 = (i12 & 8) != 0;
            boolean z24 = (i12 & 4) != 0;
            if (i13 >= 34 && (i12 & 32) != 0) {
                z17 = true;
            }
            if (z22 || z23 || z24 || z17) {
                z15 = z17;
                z14 = z24;
                z13 = z23;
                z12 = z22;
            } else {
                z12 = true;
                z13 = true;
                if (i13 >= 34) {
                    z14 = true;
                } else {
                    z14 = true;
                    z15 = z17;
                }
            }
            this.f30802a.a(z18, z19, z12, z13, z14, z15);
            return true;
        }
        z12 = true;
        z13 = true;
        z14 = false;
        z15 = z14;
        this.f30802a.a(z18, z19, z12, z13, z14, z15);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(@Y61.k KeyEvent keyEvent) {
        boolean z12 = this.f30812k;
        if (!z12) {
            return z12;
        }
        this.f30802a.c(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i12, int i13) {
        boolean z12 = this.f30812k;
        if (z12) {
            b(new androidx.compose.ui.text.input.T(i12, i13));
        }
        return z12;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(@Y61.l CharSequence charSequence, int i12) {
        boolean z12 = this.f30812k;
        if (z12) {
            b(new androidx.compose.ui.text.input.U(String.valueOf(charSequence), i12));
        }
        return z12;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i12, int i13) {
        boolean z12 = this.f30812k;
        if (!z12) {
            return z12;
        }
        b(new androidx.compose.ui.text.input.V(i12, i13));
        return true;
    }

    public /* synthetic */ D0(androidx.compose.ui.text.input.W w12, InterfaceC20894h0 interfaceC20894h0, boolean z12, C20985q1 c20985q1, C21011f1 c21011f1, InterfaceC22544x2 interfaceC22544x2, int i12, C42822w c42822w) {
        this(w12, interfaceC20894h0, z12, (i12 & 8) != 0 ? null : c20985q1, (i12 & 16) != 0 ? null : c21011f1, (i12 & 32) != 0 ? null : interfaceC22544x2);
    }
}
