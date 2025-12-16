package vf0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type.g;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: BedTypesItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvf0/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vf0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C49322c extends RecyclerView.l {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C49323d f440919c;

    /* renamed from: b, reason: collision with root package name */
    public final int f440918b = 2;

    /* renamed from: d, reason: collision with root package name */
    public final int f440920d = y6.b(9);

    /* renamed from: e, reason: collision with root package name */
    public final int f440921e = y6.b(9);

    /* renamed from: f, reason: collision with root package name */
    public final int f440922f = y6.b(16);

    public C49322c(@k C49323d c49323d) {
        this.f440919c = c49323d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        rect.setEmpty();
        RecyclerView.C cW2 = recyclerView.W(view);
        boolean z12 = this.f440919c.e(RecyclerView.U(view), this.f440918b) == 0;
        if (cW2 instanceof com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.subtitle.f) {
            rect.bottom = this.f440922f;
            return;
        }
        if (cW2 instanceof g) {
            int i12 = this.f440920d;
            if (z12) {
                rect.right = i12 / 2;
            }
            if (!z12) {
                rect.left = i12 / 2;
            }
            rect.bottom = this.f440921e;
        }
    }
}
