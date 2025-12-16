package xy0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: BookingCalendarRecyclerViewDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxy0/a;", "Lxy0/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xy0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50021a extends AbstractC50022b {
    public C50021a() {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        View viewFindViewById = view.findViewById(R.id.text_view_container);
        if (viewFindViewById == null) {
            return;
        }
        int i12 = i(view);
        c(i12, rect);
        e(view, viewFindViewById, R.id.background_view, i12);
    }
}
