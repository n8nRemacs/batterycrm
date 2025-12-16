package androidx.compose.ui.text.input;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.ui.text.v0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RecordingInputConnection.android.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/Q;", "Landroid/view/inputmethod/InputConnection;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes.dex */
public final class Q implements InputConnection {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c0 f42367a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f42368b;

    /* renamed from: c, reason: collision with root package name */
    public int f42369c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public W f42370d;

    /* renamed from: e, reason: collision with root package name */
    public int f42371e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f42372f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ArrayList f42373g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f42374h = true;

    public Q(@Y61.k W w12, @Y61.k c0 c0Var, boolean z12) {
        this.f42367a = c0Var;
        this.f42368b = z12;
        this.f42370d = w12;
    }

    public final void b(InterfaceC22645k interfaceC22645k) {
        this.f42369c++;
        try {
            this.f42373g.add(interfaceC22645k);
        } finally {
            c();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z12 = this.f42374h;
        if (!z12) {
            return z12;
        }
        this.f42369c++;
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Y41.l, kotlin.jvm.internal.N] */
    public final boolean c() {
        int i12 = this.f42369c - 1;
        this.f42369c = i12;
        if (i12 == 0) {
            ArrayList arrayList = this.f42373g;
            if (!arrayList.isEmpty()) {
                this.f42367a.f42417a.f42395e.invoke(new ArrayList(arrayList));
                arrayList.clear();
            }
        }
        return this.f42369c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i12) {
        boolean z12 = this.f42374h;
        if (z12) {
            return false;
        }
        return z12;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f42373g.clear();
        this.f42369c = 0;
        this.f42374h = false;
        a0 a0Var = this.f42367a.f42417a;
        int size = a0Var.f42399i.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (kotlin.jvm.internal.L.f(((WeakReference) a0Var.f42399i.get(i12)).get(), this)) {
                a0Var.f42399i.remove(i12);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(@Y61.l CompletionInfo completionInfo) {
        boolean z12 = this.f42374h;
        if (z12) {
            return false;
        }
        return z12;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(@Y61.k InputContentInfo inputContentInfo, int i12, @Y61.l Bundle bundle) {
        boolean z12 = this.f42374h;
        if (z12) {
            return false;
        }
        return z12;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(@Y61.l CorrectionInfo correctionInfo) {
        boolean z12 = this.f42374h;
        return z12 ? this.f42368b : z12;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(@Y61.l CharSequence charSequence, int i12) {
        boolean z12 = this.f42374h;
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
        boolean z12 = this.f42374h;
        if (!z12) {
            return z12;
        }
        b(new C22643i(i12, i13));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i12, int i13) {
        boolean z12 = this.f42374h;
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
        boolean z12 = this.f42374h;
        if (!z12) {
            return z12;
        }
        b(new C22651q());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i12) {
        W w12 = this.f42370d;
        return TextUtils.getCapsMode(w12.f42383a.f42127c, v0.g(w12.f42384b), i12);
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.k
    public final ExtractedText getExtractedText(@Y61.l ExtractedTextRequest extractedTextRequest, int i12) {
        boolean z12 = (i12 & 1) != 0;
        this.f42372f = z12;
        if (z12) {
            this.f42371e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return A.a(this.f42370d);
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.l
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.l
    public final CharSequence getSelectedText(int i12) {
        if (v0.d(this.f42370d.f42384b)) {
            return null;
        }
        return X.a(this.f42370d).f42127c;
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.k
    public final CharSequence getTextAfterCursor(int i12, int i13) {
        return X.b(this.f42370d, i12).f42127c;
    }

    @Override // android.view.inputmethod.InputConnection
    @Y61.k
    public final CharSequence getTextBeforeCursor(int i12, int i13) {
        return X.c(this.f42370d, i12).f42127c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i12) {
        boolean z12 = this.f42374h;
        if (z12) {
            z12 = false;
            switch (i12) {
                case R.id.selectAll:
                    b(new V(0, this.f42370d.f42383a.f42127c.length()));
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

    /* JADX WARN: Type inference failed for: r0v3, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i12) {
        int i13;
        boolean z12 = this.f42374h;
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
        this.f42367a.f42417a.f42396f.invoke(C22654u.a(i13));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(@Y61.l String str, @Y61.l Bundle bundle) {
        boolean z12 = this.f42374h;
        if (z12) {
            return true;
        }
        return z12;
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
        boolean z15 = this.f42374h;
        if (!z15) {
            return z15;
        }
        boolean z16 = false;
        boolean z17 = (i12 & 1) != 0;
        boolean z18 = (i12 & 2) != 0;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 33) {
            z12 = (i12 & 16) != 0;
            z13 = (i12 & 8) != 0;
            boolean z19 = (i12 & 4) != 0;
            if (i13 >= 34 && (i12 & 32) != 0) {
                z16 = true;
            }
            if (z12 || z13 || z19 || z16) {
                z14 = z16;
                z16 = z19;
            } else if (i13 >= 34) {
                z14 = true;
                z16 = true;
                z12 = true;
                z13 = true;
            } else {
                z12 = true;
                z13 = true;
                z14 = z16;
                z16 = true;
            }
        } else {
            z12 = true;
            z13 = true;
            z14 = false;
        }
        C22641g c22641g = this.f42367a.f42417a.f42402l;
        synchronized (c22641g.f42425c) {
            try {
                c22641g.f42428f = z12;
                c22641g.f42429g = z13;
                c22641g.f42430h = z16;
                c22641g.f42431i = z14;
                if (z17) {
                    c22641g.f42427e = true;
                    if (c22641g.f42432j != null) {
                        c22641g.a();
                    }
                }
                c22641g.f42426d = z18;
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.C] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(@Y61.k KeyEvent keyEvent) {
        boolean z12 = this.f42374h;
        if (!z12) {
            return z12;
        }
        ((BaseInputConnection) this.f42367a.f42417a.f42400j.getValue()).sendKeyEvent(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i12, int i13) {
        boolean z12 = this.f42374h;
        if (z12) {
            b(new T(i12, i13));
        }
        return z12;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(@Y61.l CharSequence charSequence, int i12) {
        boolean z12 = this.f42374h;
        if (z12) {
            b(new U(String.valueOf(charSequence), i12));
        }
        return z12;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i12, int i13) {
        boolean z12 = this.f42374h;
        if (!z12) {
            return z12;
        }
        b(new V(i12, i13));
        return true;
    }
}
