package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RestrictTo;
import j.X;

/* compiled from: EmojiKeyListener.java */
@RestrictTo
@X
/* loaded from: classes.dex */
final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f46176a;

    /* renamed from: b, reason: collision with root package name */
    public final a f46177b;

    /* compiled from: EmojiKeyListener.java */
    public static class a {
    }

    public e(KeyListener keyListener) {
        a aVar = new a();
        this.f46176a = keyListener;
        this.f46177b = aVar;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i12) {
        this.f46176a.clearMetaKeyState(view, editable, i12);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f46176a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i12, KeyEvent keyEvent) {
        this.f46177b.getClass();
        return androidx.emoji2.text.e.f(editable, i12, keyEvent) || this.f46176a.onKeyDown(view, editable, i12, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f46176a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i12, KeyEvent keyEvent) {
        return this.f46176a.onKeyUp(view, editable, i12, keyEvent);
    }
}
