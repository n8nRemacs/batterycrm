package gN0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: VideoCardItemDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LgN0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_video-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gN0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40604a extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        if (RecyclerView.U(view) % 2 == 0) {
            rect.right = y6.b(6);
        } else {
            rect.left = y6.b(6);
        }
        rect.bottom = y6.b(12);
    }
}
