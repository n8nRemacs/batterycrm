package CA;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.q6;
import com.avito.beduin.v2.render.android_view.BeduinView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42754k;
import kotlin.jvm.internal.s0;

/* compiled from: Utils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_extended-profile-native-widgets-beduin-v2-wrapper_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b {
    @l
    public static final RecyclerView a(@k BeduinView beduinView) {
        C42754k c42754k = new C42754k();
        c42754k.addFirst(beduinView);
        while (!c42754k.isEmpty()) {
            View view = (View) c42754k.removeFirst();
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
            if (view instanceof ViewGroup) {
                Iterator<View> it = new q6((ViewGroup) view).iterator();
                while (it.hasNext()) {
                    c42754k.addLast(it.next());
                }
            }
        }
        return null;
    }
}
