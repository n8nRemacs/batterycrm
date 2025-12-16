package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.view.inputmethod.d;
import j.N;
import j.P;
import j.X;

/* compiled from: InputConnectionCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class c {

    /* compiled from: InputConnectionCompat.java */
    public class a extends InputConnectionWrapper {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f45074a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputConnection inputConnection, d dVar) {
            super(inputConnection, false);
            this.f45074a = dVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean commitContent(InputContentInfo inputContentInfo, int i12, Bundle bundle) {
            if (this.f45074a.a(inputContentInfo == null ? null : new androidx.core.view.inputmethod.d(new d.a(inputContentInfo)), i12, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i12, bundle);
        }
    }

    /* compiled from: InputConnectionCompat.java */
    public class b extends InputConnectionWrapper {
        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean performPrivateCommand(String str, Bundle bundle) {
            throw null;
        }
    }

    /* compiled from: InputConnectionCompat.java */
    @X
    /* renamed from: androidx.core.view.inputmethod.c$c, reason: collision with other inner class name */
    public static class C1759c {
    }

    /* compiled from: InputConnectionCompat.java */
    public interface d {
        boolean a(@N androidx.core.view.inputmethod.d dVar, int i12, @P Bundle bundle);
    }

    @Deprecated
    public c() {
    }

    @N
    @Deprecated
    public static InputConnection a(@N InputConnection inputConnection, @N EditorInfo editorInfo, @N d dVar) {
        if (editorInfo != null) {
            return new a(inputConnection, dVar);
        }
        throw new NullPointerException("editorInfo must be non-null");
    }
}
