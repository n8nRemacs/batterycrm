package androidx.customview.poolingcontainer;

import X41.i;
import Y61.k;
import android.annotation.SuppressLint;
import android.view.View;
import androidx.compose.ui.platform.AbstractC22450a;
import androidx.compose.ui.platform.C22491k0;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: PoolingContainer.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"customview-poolingcontainer_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final class a {
    @SuppressLint({"ExecutorRegistration"})
    public static final void a(@k AbstractC22450a abstractC22450a, @k C22491k0 c22491k0) {
        c cVar = (c) abstractC22450a.getTag(R.id.pooling_container_listener_holder_tag);
        if (cVar == null) {
            cVar = new c();
            abstractC22450a.setTag(R.id.pooling_container_listener_holder_tag, cVar);
        }
        cVar.f45353a.add(c22491k0);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static final void b(@k View view, @k C22491k0 c22491k0) {
        c cVar = (c) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (cVar == null) {
            cVar = new c();
            view.setTag(R.id.pooling_container_listener_holder_tag, cVar);
        }
        cVar.f45353a.remove(c22491k0);
    }
}
