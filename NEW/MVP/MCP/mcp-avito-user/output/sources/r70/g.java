package R70;

import Y61.l;
import android.view.View;
import android.widget.Toast;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: Toasts.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_photo-gallery_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g {
    @InterfaceC42830m
    public static final boolean a(@l Toast toast) {
        View view;
        if (toast == null || (view = toast.getView()) == null) {
            return false;
        }
        return view.isShown();
    }
}
