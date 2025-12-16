package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* loaded from: classes.dex */
public final class va5 implements vn4 {
    public final /* synthetic */ l48 a;

    public va5(EmojiCompatInitializer emojiCompatInitializer, l48 l48Var) {
        this.a = l48Var;
    }

    @Override // defpackage.vn4
    public final void onResume(j48 j48Var) {
        (Build.VERSION.SDK_INT >= 28 ? on3.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new o6(2), 500L);
        this.a.f(this);
    }
}
