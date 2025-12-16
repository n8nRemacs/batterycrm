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
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.foundation.text.input.internal.C20893h;
import androidx.compose.foundation.text.input.internal.R0;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.text.input.C22654u;
import androidx.compose.ui.text.l0;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: StatelessInputConnection.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/J0;", "Landroid/view/inputmethod/InputConnection;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J0 implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C20893h.d f30850a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<Y41.l<Y, kotlin.G0>> f30851b = new androidx.compose.runtime.collection.e<>(new Y41.l[16], 0);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InputConnection f30852c;

    public J0(@Y61.k C20893h.d dVar, @Y61.k EditorInfo editorInfo) {
        this.f30850a = dVar;
        this.f30852c = androidx.core.view.inputmethod.c.a(new I0(this, false), editorInfo, new H0(this));
    }

    public final void b(int i12) {
        sendKeyEvent(new KeyEvent(0, i12));
        sendKeyEvent(new KeyEvent(1, i12));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        this.f30850a.f31111a.a();
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i12) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f30851b.g();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(@Y61.l CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(@Y61.k InputContentInfo inputContentInfo, int i12, @Y61.l Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        C20897j c20897j = C20897j.f31123a;
        InputConnection inputConnection = this.f30852c;
        c20897j.getClass();
        return inputConnection.commitContent(inputContentInfo, i12, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(@Y61.l CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(@Y61.l CharSequence charSequence, int i12) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        this.f30850a.a(new Z(charSequence.toString(), i12));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i12, int i13) {
        this.f30850a.a(new C20880a0(i12, i13));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i12, int i13) {
        this.f30850a.a(new C20882b0(i12, i13));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return this.f30850a.f31111a.b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        this.f30850a.a(C20884c0.f31055l);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i12) {
        t1 t1Var = this.f30850a.f31112b;
        return TextUtils.getCapsMode(t1Var.d(), androidx.compose.ui.text.v0.g(t1Var.d().f31512d), i12);
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.k
    public final ExtractedText getExtractedText(@Y61.l ExtractedTextRequest extractedTextRequest, int i12) {
        Objects.toString(extractedTextRequest);
        androidx.compose.foundation.text.input.l lVarD = this.f30850a.f31112b.d();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = lVarD;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = lVarD.f31511c.length();
        extractedText.partialStartOffset = -1;
        long j12 = lVarD.f31512d;
        extractedText.selectionStart = androidx.compose.ui.text.v0.g(j12);
        extractedText.selectionEnd = androidx.compose.ui.text.v0.f(j12);
        extractedText.flags = !C43066x.r(lVarD, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.l
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.l
    public final CharSequence getSelectedText(int i12) {
        t1 t1Var = this.f30850a.f31112b;
        if (androidx.compose.ui.text.v0.d(t1Var.d().f31512d)) {
            return null;
        }
        androidx.compose.foundation.text.input.l lVarD = t1Var.d();
        return lVarD.f31511c.subSequence(androidx.compose.ui.text.v0.g(lVarD.f31512d), androidx.compose.ui.text.v0.f(lVarD.f31512d)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.k
    public final CharSequence getTextAfterCursor(int i12, int i13) {
        androidx.compose.foundation.text.input.l lVarD = this.f30850a.f31112b.d();
        int iF2 = androidx.compose.ui.text.v0.f(lVarD.f31512d);
        int iF3 = androidx.compose.ui.text.v0.f(lVarD.f31512d) + i12;
        CharSequence charSequence = lVarD.f31511c;
        return charSequence.subSequence(iF2, Math.min(iF3, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.k
    public final CharSequence getTextBeforeCursor(int i12, int i13) {
        androidx.compose.foundation.text.input.l lVarD = this.f30850a.f31112b.d();
        return lVarD.f31511c.subSequence(Math.max(0, androidx.compose.ui.text.v0.g(lVarD.f31512d) - i12), androidx.compose.ui.text.v0.g(lVarD.f31512d)).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i12) {
        switch (i12) {
            case R.id.selectAll:
                C20893h.d dVar = this.f30850a;
                dVar.a(new C20890f0(dVar, 0, dVar.f31112b.d().f31511c.length()));
                return false;
            case R.id.cut:
                b(277);
                return false;
            case R.id.copy:
                b(278);
                return false;
            case R.id.paste:
                b(279);
                return false;
            default:
                return false;
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i12) {
        int i13;
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
        Y41.l<C22654u, kotlin.G0> lVar = this.f30850a.f31114d;
        if (lVar == null) {
            return true;
        }
        ((R0.z.a.C1611a) lVar).invoke(C22654u.a(i13));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(@Y61.k HandwritingGesture handwritingGesture, @Y61.l Executor executor, @Y61.l IntConsumer intConsumer) {
        int iA2;
        int i12;
        androidx.compose.ui.text.G g12;
        androidx.compose.ui.text.o0 o0VarB;
        androidx.compose.ui.text.G g13;
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 34) {
            return;
        }
        C20903m.f31169a.getClass();
        C20893h.d dVar = this.f30850a;
        int i14 = 2;
        if (i13 >= 34) {
            V.f31005a.getClass();
            boolean zU2 = IK.d.u(handwritingGesture);
            Y41.a<kotlin.G0> aVar = dVar.f31118h;
            t1 t1Var = dVar.f31112b;
            p1 p1Var = dVar.f31117g;
            if (zU2) {
                SelectGesture selectGestureM = IK.d.m(handwritingGesture);
                l0.j jVarE = androidx.compose.ui.graphics.X0.e(selectGestureM.getSelectionArea());
                int iE2 = V.e(selectGestureM.getGranularity());
                androidx.compose.ui.text.l0.f42495a.getClass();
                long jK2 = X.k(p1Var, jVarE, iE2, l0.a.f42498c);
                if (androidx.compose.ui.text.v0.d(jK2)) {
                    iA2 = V.a(t1Var, Q.l(selectGestureM));
                    i14 = iA2;
                } else {
                    t1Var.k(jK2);
                    if (aVar != null) {
                        ((R0.z.a.b) aVar).invoke();
                    }
                    i14 = 1;
                }
            } else if (Q.A(handwritingGesture)) {
                DeleteGesture deleteGestureJ = Q.j(handwritingGesture);
                int iE3 = V.e(deleteGestureJ.getGranularity());
                l0.j jVarE2 = androidx.compose.ui.graphics.X0.e(deleteGestureJ.getDeletionArea());
                androidx.compose.ui.text.l0.f42495a.getClass();
                long jK3 = X.k(p1Var, jVarE2, iE3, l0.a.f42498c);
                if (androidx.compose.ui.text.v0.d(jK3)) {
                    iA2 = V.a(t1Var, Q.l(deleteGestureJ));
                    i14 = iA2;
                } else {
                    androidx.compose.ui.text.k0.f42491b.getClass();
                    t1.j(t1Var, "", androidx.compose.ui.text.k0.a(iE3, androidx.compose.ui.text.k0.f42492c) ? X.a(jK3, t1Var.d()) : jK3, false, 12);
                    i14 = 1;
                }
            } else if (Q.C(handwritingGesture)) {
                SelectRangeGesture selectRangeGestureN = Q.n(handwritingGesture);
                l0.j jVarE3 = androidx.compose.ui.graphics.X0.e(selectRangeGestureN.getSelectionStartArea());
                l0.j jVarE4 = androidx.compose.ui.graphics.X0.e(selectRangeGestureN.getSelectionEndArea());
                int iE4 = V.e(selectRangeGestureN.getGranularity());
                androidx.compose.ui.text.l0.f42495a.getClass();
                long jD2 = X.d(p1Var, jVarE3, jVarE4, iE4, l0.a.f42498c);
                if (androidx.compose.ui.text.v0.d(jD2)) {
                    iA2 = V.a(t1Var, Q.l(selectRangeGestureN));
                    i14 = iA2;
                } else {
                    t1Var.k(jD2);
                    if (aVar != null) {
                        ((R0.z.a.b) aVar).invoke();
                    }
                    i14 = 1;
                }
            } else if (Q.D(handwritingGesture)) {
                DeleteRangeGesture deleteRangeGestureK = Q.k(handwritingGesture);
                int iE5 = V.e(deleteRangeGestureK.getGranularity());
                l0.j jVarE5 = androidx.compose.ui.graphics.X0.e(deleteRangeGestureK.getDeletionStartArea());
                l0.j jVarE6 = androidx.compose.ui.graphics.X0.e(deleteRangeGestureK.getDeletionEndArea());
                androidx.compose.ui.text.l0.f42495a.getClass();
                long jD3 = X.d(p1Var, jVarE5, jVarE6, iE5, l0.a.f42498c);
                if (androidx.compose.ui.text.v0.d(jD3)) {
                    iA2 = V.a(t1Var, Q.l(deleteRangeGestureK));
                    i14 = iA2;
                } else {
                    androidx.compose.ui.text.k0.f42491b.getClass();
                    t1.j(t1Var, "", androidx.compose.ui.text.k0.a(iE5, androidx.compose.ui.text.k0.f42492c) ? X.a(jD3, t1Var.d()) : jD3, false, 12);
                    i14 = 1;
                }
            } else {
                boolean zU3 = Q.u(handwritingGesture);
                InterfaceC22544x2 interfaceC22544x2 = dVar.f31119i;
                if (zU3) {
                    JoinOrSplitGesture joinOrSplitGestureM = Q.m(handwritingGesture);
                    if (t1Var.b() != t1Var.f31452a.b()) {
                        iA2 = 3;
                    } else {
                        long jG2 = X.g(joinOrSplitGestureM.getJoinOrSplitPoint());
                        androidx.compose.ui.text.o0 o0VarB2 = p1Var.b();
                        int i15 = (o0VarB2 == null || (g13 = o0VarB2.f42527b) == null) ? -1 : X.i(g13, jG2, p1Var.c(), interfaceC22544x2);
                        if (i15 == -1 || ((o0VarB = p1Var.b()) != null && X.e(o0VarB, i15))) {
                            iA2 = V.a(t1Var, Q.l(joinOrSplitGestureM));
                        } else {
                            long jF2 = X.f(i15, t1Var.d());
                            if (androidx.compose.ui.text.v0.d(jF2)) {
                                t1.j(t1Var, " ", jF2, false, 12);
                            } else {
                                t1.j(t1Var, "", jF2, false, 12);
                            }
                            i14 = 1;
                        }
                    }
                    i14 = iA2;
                } else if (IK.d.x(handwritingGesture)) {
                    InsertGesture insertGestureK = IK.d.k(handwritingGesture);
                    long jG3 = X.g(insertGestureK.getInsertionPoint());
                    androidx.compose.ui.text.o0 o0VarB3 = p1Var.b();
                    int i16 = (o0VarB3 == null || (g12 = o0VarB3.f42527b) == null) ? -1 : X.i(g12, jG3, p1Var.c(), interfaceC22544x2);
                    if (i16 == -1) {
                        iA2 = V.a(t1Var, Q.l(insertGestureK));
                        i14 = iA2;
                    } else {
                        t1.j(t1Var, insertGestureK.getTextToInsert(), androidx.compose.ui.text.w0.a(i16, i16), false, 12);
                        i14 = 1;
                    }
                } else if (IK.d.z(handwritingGesture)) {
                    RemoveSpaceGesture removeSpaceGestureL = IK.d.l(handwritingGesture);
                    long jB2 = X.b(p1Var.b(), X.g(removeSpaceGestureL.getStartPoint()), X.g(removeSpaceGestureL.getEndPoint()), p1Var.c(), interfaceC22544x2);
                    if (androidx.compose.ui.text.v0.d(jB2)) {
                        iA2 = V.a(t1Var, Q.l(removeSpaceGestureL));
                    } else {
                        l0.f fVar = new l0.f();
                        fVar.f406840b = -1;
                        l0.f fVar2 = new l0.f();
                        fVar2.f406840b = -1;
                        String strG = new C43059p("\\s+").g(androidx.compose.ui.text.w0.c(jB2, t1Var.d()), new T(fVar, fVar2));
                        int i17 = fVar.f406840b;
                        if (i17 == -1 || (i12 = fVar2.f406840b) == -1) {
                            iA2 = V.a(t1Var, Q.l(removeSpaceGestureL));
                        } else {
                            int i18 = (int) (jB2 >> 32);
                            t1.j(t1Var, strG.substring(fVar.f406840b, strG.length() - (androidx.compose.ui.text.v0.e(jB2) - fVar2.f406840b)), androidx.compose.ui.text.w0.a(i17 + i18, i18 + i12), false, 12);
                            i14 = 1;
                        }
                    }
                    i14 = iA2;
                }
            }
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new RunnableC20899k(intConsumer, i14, 1));
        } else {
            intConsumer.accept(i14);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(@Y61.l String str, @Y61.l Bundle bundle) {
        Objects.toString(bundle);
        return ((InputConnectionWrapper) this.f30852c).performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(@Y61.k PreviewableHandwritingGesture previewableHandwritingGesture, @Y61.l CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 34) {
            return false;
        }
        C20903m.f31169a.getClass();
        C20893h.d dVar = this.f30850a;
        if (i12 < 34) {
            return false;
        }
        V.f31005a.getClass();
        boolean zU2 = IK.d.u(previewableHandwritingGesture);
        t1 t1Var = dVar.f31112b;
        p1 p1Var = dVar.f31117g;
        if (zU2) {
            SelectGesture selectGestureM = IK.d.m(previewableHandwritingGesture);
            l0.j jVarE = androidx.compose.ui.graphics.X0.e(selectGestureM.getSelectionArea());
            int iE2 = V.e(selectGestureM.getGranularity());
            androidx.compose.ui.text.l0.f42495a.getClass();
            long jK2 = X.k(p1Var, jVarE, iE2, l0.a.f42498c);
            androidx.compose.foundation.text.input.s.f31524b.getClass();
            V.c(t1Var, jK2, 0);
        } else if (Q.A(previewableHandwritingGesture)) {
            DeleteGesture deleteGestureJ = Q.j(previewableHandwritingGesture);
            l0.j jVarE2 = androidx.compose.ui.graphics.X0.e(deleteGestureJ.getDeletionArea());
            int iE3 = V.e(deleteGestureJ.getGranularity());
            androidx.compose.ui.text.l0.f42495a.getClass();
            long jK3 = X.k(p1Var, jVarE2, iE3, l0.a.f42498c);
            androidx.compose.foundation.text.input.s.f31524b.getClass();
            V.c(t1Var, jK3, androidx.compose.foundation.text.input.s.f31525c);
        } else if (Q.C(previewableHandwritingGesture)) {
            SelectRangeGesture selectRangeGestureN = Q.n(previewableHandwritingGesture);
            l0.j jVarE3 = androidx.compose.ui.graphics.X0.e(selectRangeGestureN.getSelectionStartArea());
            l0.j jVarE4 = androidx.compose.ui.graphics.X0.e(selectRangeGestureN.getSelectionEndArea());
            int iE4 = V.e(selectRangeGestureN.getGranularity());
            androidx.compose.ui.text.l0.f42495a.getClass();
            long jD2 = X.d(p1Var, jVarE3, jVarE4, iE4, l0.a.f42498c);
            androidx.compose.foundation.text.input.s.f31524b.getClass();
            V.c(t1Var, jD2, 0);
        } else {
            if (!Q.D(previewableHandwritingGesture)) {
                return false;
            }
            DeleteRangeGesture deleteRangeGestureK = Q.k(previewableHandwritingGesture);
            l0.j jVarE5 = androidx.compose.ui.graphics.X0.e(deleteRangeGestureK.getDeletionStartArea());
            l0.j jVarE6 = androidx.compose.ui.graphics.X0.e(deleteRangeGestureK.getDeletionEndArea());
            int iE5 = V.e(deleteRangeGestureK.getGranularity());
            androidx.compose.ui.text.l0.f42495a.getClass();
            long jD3 = X.d(p1Var, jVarE5, jVarE6, iE5, l0.a.f42498c);
            androidx.compose.foundation.text.input.s.f31524b.getClass();
            V.c(t1Var, jD3, androidx.compose.foundation.text.input.s.f31525c);
        }
        if (cancellationSignal != null) {
            cancellationSignal.setOnCancelListener(new S(t1Var, 1));
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
        CursorAnchorInfo cursorAnchorInfoA;
        G g12 = this.f30850a.f31116f;
        boolean z15 = false;
        boolean z16 = (i12 & 1) != 0;
        boolean z17 = (i12 & 2) != 0;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            z12 = (i12 & 16) != 0;
            z13 = (i12 & 8) != 0;
            boolean z18 = (i12 & 4) != 0;
            if (i13 >= 34 && (i12 & 32) != 0) {
                z15 = true;
            }
            if (z12 || z13 || z18 || z15) {
                z14 = z15;
                z15 = z18;
            } else if (i13 >= 34) {
                z14 = true;
                z15 = true;
                z12 = true;
                z13 = true;
            } else {
                z12 = true;
                z13 = true;
                z14 = z15;
                z15 = true;
            }
        } else {
            z12 = true;
            z13 = true;
            z14 = false;
        }
        g12.f30825f = z12;
        g12.f30826g = z13;
        g12.f30827h = z15;
        g12.f30828i = z14;
        if (z16 && (cursorAnchorInfoA = g12.a()) != null) {
            g12.f30822c.a(cursorAnchorInfoA);
        }
        if (z17) {
            kotlinx.coroutines.N0 n02 = g12.f30824e;
            if (n02 == null || !((AbstractC43075a) n02).isActive()) {
                g12.f30824e = C43259k.d(g12.f30823d, null, CoroutineStart.f410683e, new F(g12, null), 1);
            }
        } else {
            kotlinx.coroutines.N0 n03 = g12.f30824e;
            if (n03 != null) {
                ((kotlinx.coroutines.V0) n03).c(null);
            }
            g12.f30824e = null;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(@Y61.k KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        this.f30850a.f31113c.sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i12, int i13) {
        this.f30850a.a(new C20886d0(i12, i13));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025b  */
    /* JADX WARN: Type inference failed for: r10v15, types: [androidx.compose.ui.text.font.j0] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean setComposingText(@Y61.l java.lang.CharSequence r59, int r60) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.J0.setComposingText(java.lang.CharSequence, int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i12, int i13) {
        C20893h.d dVar = this.f30850a;
        dVar.a(new C20890f0(dVar, i12, i13));
        return true;
    }
}
