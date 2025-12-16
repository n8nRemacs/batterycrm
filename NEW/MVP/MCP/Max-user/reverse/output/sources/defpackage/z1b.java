package defpackage;

import android.text.Editable;
import android.text.method.TextKeyListener;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.material.chip.Chip;
import java.util.Map;

/* loaded from: classes2.dex */
public final class z1b extends TextKeyListener {
    public final /* synthetic */ a2b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1b(a2b a2bVar) {
        super(TextKeyListener.Capitalize.NONE, false);
        this.a = a2bVar;
    }

    @Override // android.text.method.MetaKeyKeyListener, android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
    }

    @Override // android.text.method.TextKeyListener, android.text.method.BaseKeyListener, android.text.method.MetaKeyKeyListener, android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        if (i == 67) {
            a2b a2bVar = this.a;
            if (a2bVar.getEditText().getText().length() == 0 && !a2bVar.C0.isEmpty()) {
                Map.Entry entry = (Map.Entry) ue3.O(a2bVar.C0.entrySet());
                if (((Chip) entry.getValue()).isChecked()) {
                    y1b callback = a2bVar.getCallback();
                    if (callback != null) {
                        ((i5i) callback).n(((Number) entry.getKey()).longValue());
                    }
                    a2bVar.c(((Number) entry.getKey()).longValue());
                } else {
                    ((Chip) entry.getValue()).setChecked(true);
                }
                return true;
            }
        }
        return super.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.TextKeyListener, android.text.method.BaseKeyListener, android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.text.method.TextKeyListener, android.text.method.MetaKeyKeyListener, android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return true;
    }
}
