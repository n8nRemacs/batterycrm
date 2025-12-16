package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.b;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import androidx.view.Lifecycle;
import j.N;

/* compiled from: EmojiCompatInitializer.java */
/* loaded from: classes.dex */
class g implements InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f46110b;

    public g(EmojiCompatInitializer emojiCompatInitializer, Lifecycle lifecycle) {
        this.f46110b = lifecycle;
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onResume(@N InterfaceC22983P interfaceC22983P) {
        (Build.VERSION.SDK_INT >= 28 ? b.a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new EmojiCompatInitializer.c(), 500L);
        this.f46110b.c(this);
    }
}
