package defpackage;

import android.app.SharedElementCallback;
import android.graphics.Rect;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.messages.media.mediabar.ActLocalMedias;

/* loaded from: classes2.dex */
public final class l6 extends SharedElementCallback {
    public final /* synthetic */ Rect a;
    public final /* synthetic */ ActLocalMedias b;

    public l6(ActLocalMedias actLocalMedias, Rect rect) {
        this.b = actLocalMedias;
        this.a = rect;
    }

    @Override // android.app.SharedElementCallback
    public final void onMapSharedElements(List list, Map map) {
        Rect rect;
        if (map == null || (rect = this.a) == null) {
            return;
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            yni.c(rect, (View) it.next());
        }
    }

    @Override // android.app.SharedElementCallback
    public final void onRejectSharedElements(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.b.Z0.postDelayed(new o3(1, this), 100L);
    }
}
