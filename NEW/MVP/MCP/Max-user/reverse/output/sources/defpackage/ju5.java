package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class ju5 implements b91 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.b91
    public final void onFeedback(a91 a91Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((b91) it.next()).onFeedback(a91Var);
        }
    }
}
