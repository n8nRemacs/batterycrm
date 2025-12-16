package androidx.emoji2.viewsintegration;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.s;
import j.B;
import j.N;
import j.P;

/* compiled from: EmojiEditableFactory.java */
/* loaded from: classes.dex */
final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f46167a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @B
    public static volatile Editable.Factory f46168b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public static Class<?> f46169c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f46169c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(@N CharSequence charSequence) {
        Class<?> cls = f46169c;
        return cls != null ? new s(cls, charSequence) : super.newEditable(charSequence);
    }
}
