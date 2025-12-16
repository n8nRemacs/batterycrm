package AO0;

import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.visual_rubricator.J;
import kotlin.Metadata;

/* compiled from: DefaultSpanLookupFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAO0/a;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final J f322e;

    public a(@Y61.k J j12) {
        this.f322e = j12;
        this.f53673c = true;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        return this.f322e.d(i12);
    }
}
