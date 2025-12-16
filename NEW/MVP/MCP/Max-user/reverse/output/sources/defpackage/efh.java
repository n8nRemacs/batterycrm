package defpackage;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public final class efh implements OnReceiveContentListener {
    public final tva a;

    public efh(tva tvaVar) {
        this.a = tvaVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        f34 f34Var = new f34(new ao6(contentInfo));
        f34 f34VarA = this.a.a(view, f34Var);
        if (f34VarA == null) {
            return null;
        }
        if (f34VarA == f34Var) {
            return contentInfo;
        }
        ContentInfo contentInfoG = f34VarA.a.g();
        Objects.requireNonNull(contentInfoG);
        return q20.k(contentInfoG);
    }
}
