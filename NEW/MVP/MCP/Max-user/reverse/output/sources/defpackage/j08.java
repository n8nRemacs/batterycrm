package defpackage;

import android.view.View;
import java.util.Objects;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* loaded from: classes2.dex */
public final class j08 implements vn4 {
    public final View a;
    public final i08 b;
    public int c = 0;

    public j08(View view, ActLocalMedias actLocalMedias) {
        this.a = view;
        Objects.requireNonNull(view);
        this.b = new i08(actLocalMedias, new g6(6, view));
    }

    @Override // defpackage.vn4
    public final void onPause(j48 j48Var) {
        wqi.c("j08", "onPause: unregisterGlobalLayoutListener", new Object[0]);
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
    }

    @Override // defpackage.vn4
    public final void onResume(j48 j48Var) {
        wqi.c("j08", "onResume: registerGlobalLayoutListener", new Object[0]);
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(this.b);
    }
}
