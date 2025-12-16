package androidx.compose.foundation.content.internal;

import Y61.k;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import androidx.compose.ui.node.C22423m;
import androidx.compose.ui.node.InterfaceC22419k;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DragAndDropRequestPermission.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {
    public static final void a(@k InterfaceC22419k interfaceC22419k, @k androidx.compose.ui.draganddrop.b bVar) {
        Activity activity;
        ClipData clipData = bVar.f38999a.getClipData();
        int itemCount = clipData.getItemCount();
        for (int i12 = 0; i12 < itemCount; i12++) {
            Uri uri = clipData.getItemAt(i12).getUri();
            if (uri != null && L.f(uri.getScheme(), "content")) {
                if (interfaceC22419k.getF42880b().f42893o) {
                    Context context = C22423m.a(interfaceC22419k).getContext();
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                            break;
                        } else {
                            if (context instanceof Activity) {
                                activity = (Activity) context;
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                    if (activity == null) {
                        return;
                    }
                    activity.requestDragAndDropPermissions(bVar.f38999a);
                    return;
                }
                return;
            }
        }
    }
}
