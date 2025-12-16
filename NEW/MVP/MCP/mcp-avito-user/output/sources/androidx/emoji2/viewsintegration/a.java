package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.util.z;
import androidx.emoji2.text.e;
import j.N;
import j.P;
import j.X;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: EmojiEditTextHelper.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C1786a f46164a;

    /* compiled from: EmojiEditTextHelper.java */
    @X
    /* renamed from: androidx.emoji2.viewsintegration.a$a, reason: collision with other inner class name */
    public static class C1786a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final EditText f46165a;

        /* renamed from: b, reason: collision with root package name */
        public final g f46166b;

        public C1786a(@N EditText editText) {
            this.f46165a = editText;
            g gVar = new g(editText);
            this.f46166b = gVar;
            editText.addTextChangedListener(gVar);
            if (androidx.emoji2.viewsintegration.b.f46168b == null) {
                synchronized (androidx.emoji2.viewsintegration.b.f46167a) {
                    try {
                        if (androidx.emoji2.viewsintegration.b.f46168b == null) {
                            androidx.emoji2.viewsintegration.b.f46168b = new androidx.emoji2.viewsintegration.b();
                        }
                    } finally {
                    }
                }
            }
            editText.setEditableFactory(androidx.emoji2.viewsintegration.b.f46168b);
        }
    }

    /* compiled from: EmojiEditTextHelper.java */
    public static class b {
    }

    public a(@N EditText editText) {
        this.f46164a = new C1786a(editText);
    }

    @P
    public final KeyListener a(@P KeyListener keyListener) {
        this.f46164a.getClass();
        if (keyListener instanceof e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
    }

    @P
    public final InputConnection b(@P InputConnection inputConnection, @N EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        C1786a c1786a = this.f46164a;
        c1786a.getClass();
        return inputConnection instanceof c ? inputConnection : new c(c1786a.f46165a, inputConnection, editorInfo);
    }

    public final void c(boolean z12) {
        g gVar = this.f46164a.f46166b;
        if (gVar.f46185d != z12) {
            if (gVar.f46184c != null) {
                androidx.emoji2.text.e eVarA = androidx.emoji2.text.e.a();
                e.g gVar2 = gVar.f46184c;
                eVarA.getClass();
                z.f(gVar2, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = eVarA.f46067a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    eVarA.f46068b.remove(gVar2);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            gVar.f46185d = z12;
            if (z12) {
                g.a(gVar.f46183b, androidx.emoji2.text.e.a().d());
            }
        }
    }
}
