package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Selection;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.NoSuchElementException;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class dp8 implements ActionMode.Callback {
    public final EditText a;
    public final hbd b;
    public final boolean c;
    public final iv6 d;
    public final i8a e = new i8a();

    public dp8(EditText editText, hbd hbdVar, boolean z, iv6 iv6Var) {
        this.a = editText;
        this.b = hbdVar;
        this.c = z;
        this.d = iv6Var;
    }

    /* JADX WARN: Finally extract failed */
    public final void a(int i, Editable editable, int i2, int i3) {
        int i4 = 0;
        if (i == s0d.markdown_bold) {
            ssi.m(editable, i2, i3, false, new zq0(0));
            return;
        }
        if (i == s0d.markdown_italic) {
            ssi.m(editable, i2, i3, false, new zq0(1));
            return;
        }
        if (i == s0d.markdown_underline) {
            ssi.m(editable, i2, i3, true, new lmf(1));
            return;
        }
        if (i == s0d.markdown_mono) {
            ssi.m(editable, i2, i3, true, new c2a());
            return;
        }
        if (i == s0d.markdown_strikethrough) {
            ssi.m(editable, i2, i3, true, new lmf(0));
            return;
        }
        if (i == s0d.markdown_heading) {
            ssi.m(editable, i2, i3, true, new p17());
            return;
        }
        int i5 = s0d.markdown_quote;
        qqg qqgVar = qqg.a;
        EditText editText = this.a;
        if (i != i5) {
            if (i != s0d.markdown_regular) {
                if (i == 16908320 || i == 16908321) {
                    return;
                }
                wqi.c("dp8", String.format(Locale.ENGLISH, "Unidentified item with id = %d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)), new Object[0]);
                return;
            }
            luc[] lucVarArr = (luc[]) editable.getSpans(i2, i3, luc.class);
            if (lucVarArr.length != 0) {
                editText.setTag(v0d.text_change_is_programmatic_tag, qqgVar);
                try {
                    editText.getText();
                    int i6 = i2;
                    int i7 = i3;
                    while (i6 > 0) {
                        int i8 = i6 - 1;
                        if (!ssi.i(editable.charAt(i8))) {
                            break;
                        }
                        Selection.setSelection(editable, Math.min(editable.length(), i7));
                        editable.delete(i8, i6);
                        i6--;
                        i7--;
                    }
                    if (i6 > 0 && editable.charAt(i6 - 1) != '\n') {
                        editable.insert(i6, "\n");
                        i6++;
                        i7++;
                    }
                    while (i7 < editable.length() && ssi.i(editable.charAt(i7))) {
                        editable.delete(i7, i7 + 1);
                    }
                    if (i7 < editable.length() && editable.charAt(i7) != '\n') {
                        editable.insert(i7, "\n");
                    }
                    int iMax = Math.max(0, i6);
                    int iMin = Math.min(i7, editable.length());
                    while (i4 < lucVarArr.length) {
                        int i9 = i4 + 1;
                        try {
                            ssi.n(editable, lucVarArr[i4], iMax - 1, iMin + 1);
                            i4 = i9;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw new NoSuchElementException(e.getMessage());
                        }
                    }
                    wvi.d(editable);
                    editText.setTag(v0d.text_change_is_programmatic_tag, null);
                } catch (Throwable th) {
                    editText.setTag(v0d.text_change_is_programmatic_tag, null);
                    throw th;
                }
            }
            ssi.k(editable, i2, i3);
            return;
        }
        luc[] lucVarArr2 = (luc[]) editable.getSpans(i2, i3, luc.class);
        editText.setTag(v0d.text_change_is_programmatic_tag, qqgVar);
        try {
            editText.getText();
            if (lucVarArr2.length == 0) {
                while (i2 > 0) {
                    int i10 = i2 - 1;
                    if (!ssi.i(editable.charAt(i10))) {
                        break;
                    }
                    Selection.setSelection(editable, Math.min(editable.length(), i3));
                    editable.delete(i10, i2);
                    i2--;
                    i3--;
                }
                if (i2 > 0 && editable.charAt(i2 - 1) != '\n') {
                    editable.insert(i2, "\n");
                    i2++;
                    i3++;
                }
                while (i3 < editable.length() && ssi.i(editable.charAt(i3))) {
                    editable.delete(i3, i3 + 1);
                }
                if (i3 < editable.length() && editable.charAt(i3) != '\n') {
                    editable.insert(i3, "\n");
                }
                int iMax2 = Math.max(0, i2);
                int iMin2 = Math.min(i3, editable.length());
                usi.e(editable, new luc(b()), iMax2, iMin2, 17);
                Selection.setSelection(editable, Math.min(editable.length(), iMin2 + 1));
            } else {
                while (i2 > 0) {
                    int i11 = i2 - 1;
                    if (!ssi.i(editable.charAt(i11))) {
                        break;
                    }
                    Selection.setSelection(editable, Math.min(editable.length(), i3));
                    editable.delete(i11, i2);
                    i2--;
                    i3--;
                }
                if (i2 > 0 && editable.charAt(i2 - 1) != '\n') {
                    editable.insert(i2, "\n");
                    i2++;
                    i3++;
                }
                while (i3 < editable.length() && ssi.i(editable.charAt(i3))) {
                    editable.delete(i3, i3 + 1);
                }
                if (i3 < editable.length() && editable.charAt(i3) != '\n') {
                    editable.insert(i3, "\n");
                }
                int iMax3 = Math.max(0, i2);
                int iMin3 = Math.min(i3, editable.length());
                while (i4 < lucVarArr2.length) {
                    int i12 = i4 + 1;
                    try {
                        ssi.n(editable, lucVarArr2[i4], iMax3 - 1, iMin3 + 1);
                        i4 = i12;
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        throw new NoSuchElementException(e2.getMessage());
                    }
                }
            }
            editText.setTag(v0d.text_change_is_programmatic_tag, null);
            wvi.d(editable);
        } catch (Throwable th2) {
            editText.setTag(v0d.text_change_is_programmatic_tag, null);
            throw th2;
        }
    }

    public final kuc b() {
        EditText editText = this.a;
        Context context = editText.getContext();
        yt0 yt0VarI = a93.s0.x(context).k().a().i();
        t5g t5gVar = vz2.g;
        Drawable drawableA = f6j.a(context, ivd.r1);
        float f = 12;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        int iD2 = kti.d(f * vw4.d().getDisplayMetrics().density);
        float f2 = 2;
        float f3 = 4;
        kuc kucVar = new kuc(context, this.b, yt0VarI, t5gVar, drawableA, iD, iD2, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(6 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        kucVar.f = new wsc(1, new WeakReference(editText));
        return kucVar;
    }

    public final boolean c() {
        EditText editText = this.a;
        return this.c && !(editText.getSelectionStart() < editText.getSelectionEnd() && editText.getText().getSpans(editText.getSelectionStart(), editText.getSelectionEnd(), luc.class).length != 0);
    }

    public final void d(Editable editable, int i, int i2) {
        b88[] b88VarArr = (b88[]) editable.getSpans(i, i2, b88.class);
        iv6 iv6Var = this.d;
        if (b88VarArr == null || b88VarArr.length == 0) {
            MessageWriteWidget messageWriteWidget = (MessageWriteWidget) iv6Var.b;
            yy7[] yy7VarArr = MessageWriteWidget.L0;
            xfh.r(((fp8) messageWriteWidget.c.getValue()).c, new y9(i, i2, null));
            return;
        }
        int i3 = 0;
        while (i3 < b88VarArr.length) {
            int i4 = i3 + 1;
            try {
                b88 b88Var = b88VarArr[i3];
                int spanStart = editable.getSpanStart(b88Var);
                int spanEnd = editable.getSpanEnd(b88Var);
                if (spanStart == i && spanEnd == i2) {
                    String str = b88Var.c;
                    MessageWriteWidget messageWriteWidget2 = (MessageWriteWidget) iv6Var.b;
                    yy7[] yy7VarArr2 = MessageWriteWidget.L0;
                    xfh.r(((fp8) messageWriteWidget2.c.getValue()).c, new y9(i, i2, str));
                    return;
                }
                i3 = i4;
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
        MessageWriteWidget messageWriteWidget3 = (MessageWriteWidget) iv6Var.b;
        yy7[] yy7VarArr3 = MessageWriteWidget.L0;
        xfh.r(((fp8) messageWriteWidget3.c.getValue()).c, new y9(i, i2, null));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        EditText editText = this.a;
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        Editable text = editText.getText();
        if (text != null && text.length() != 0) {
            int itemId = menuItem.getItemId();
            if (itemId == s0d.markdown_bold) {
                a(menuItem.getItemId(), text, selectionStart, selectionEnd);
                actionMode.finish();
                return true;
            }
            if (itemId == s0d.markdown_italic) {
                a(menuItem.getItemId(), text, selectionStart, selectionEnd);
                actionMode.finish();
                return true;
            }
            if (itemId == s0d.markdown_underline) {
                a(menuItem.getItemId(), text, selectionStart, selectionEnd);
                actionMode.finish();
                return true;
            }
            if (itemId == s0d.markdown_mono) {
                a(menuItem.getItemId(), text, selectionStart, selectionEnd);
                actionMode.finish();
                return true;
            }
            if (itemId == s0d.markdown_strikethrough) {
                a(menuItem.getItemId(), text, selectionStart, selectionEnd);
                actionMode.finish();
                return true;
            }
            if (itemId == s0d.markdown_link) {
                d(text, selectionStart, selectionEnd);
                return true;
            }
            if (itemId == s0d.markdown_heading) {
                a(menuItem.getItemId(), text, selectionStart, selectionEnd);
                actionMode.finish();
                return true;
            }
            if (itemId == s0d.markdown_quote) {
                a(menuItem.getItemId(), text, selectionStart, selectionEnd);
                actionMode.finish();
                return true;
            }
            if (itemId == s0d.markdown_regular) {
                a(menuItem.getItemId(), text, selectionStart, selectionEnd);
                actionMode.finish();
                return true;
            }
            if (itemId != 16908320 && itemId != 16908321) {
                wqi.c("dp8", String.format(Locale.ENGLISH, "Unidentified item with id = %d", Arrays.copyOf(new Object[]{Integer.valueOf(menuItem.getItemId())}, 1)), new Object[0]);
            }
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) throws Resources.NotFoundException {
        i8a i8aVar = this.e;
        i8aVar.c();
        i8aVar.a(R.id.cut);
        i8aVar.a(R.id.copy);
        boolean zC = c();
        zo8.c.getClass();
        for (zo8 zo8Var : zo8.o) {
            int i = zo8Var.a;
            if (i != s0d.markdown_quote || zC) {
                String string = this.a.getResources().getString(zo8Var.b);
                menu.add(s0d.markdown_group, i, zo8Var.ordinal(), string).setShowAsAction(0);
                i8aVar.a(i);
            }
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.e.c();
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (c()) {
            int i = 0;
            while (true) {
                if (!(i < menu.size())) {
                    zo8 zo8Var = zo8.X;
                    int i2 = zo8Var.a;
                    menu.add(s0d.markdown_group, i2, 8, this.a.getResources().getString(zo8Var.b)).setShowAsAction(0);
                    this.e.a(i2);
                    break;
                }
                int i3 = i + 1;
                MenuItem item = menu.getItem(i);
                if (item == null) {
                    throw new IndexOutOfBoundsException();
                }
                if (item.getItemId() == s0d.markdown_quote) {
                    break;
                }
                i = i3;
            }
        } else {
            menu.removeItem(s0d.markdown_quote);
        }
        nz5 nz5Var = new nz5(lee.g(new at(4, menu), new wu7(11, this)));
        while (nz5Var.hasNext()) {
            menu.removeItem(((MenuItem) nz5Var.next()).getItemId());
        }
        return true;
    }
}
