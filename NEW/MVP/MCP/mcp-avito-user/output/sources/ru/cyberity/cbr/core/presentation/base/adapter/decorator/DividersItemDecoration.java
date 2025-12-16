package ru.cyberity.cbr.core.presentation.base.adapter.decorator;

import Y61.k;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.view.C22829k0;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.common.s;

/* compiled from: DividersItemDecoration.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/core/presentation/base/adapter/decorator/DividersItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$l;", "", "marginLeft", "marginRight", "separatorHeight", "", "color", "<init>", "(FFFI)V", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", VoiceInfo.STATE, "Lkotlin/G0;", "onDrawOver", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$z;)V", "F", "I", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class DividersItemDecoration extends RecyclerView.l {
    private final int color;
    private final float marginLeft;
    private final float marginRight;

    @k
    private final Paint paint;
    private final float separatorHeight;

    public /* synthetic */ DividersItemDecoration(float f12, float f13, float f14, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0.0f : f12, (i13 & 2) != 0 ? 0.0f : f13, (i13 & 4) != 0 ? s.a(1) : f14, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void onDrawOver(@k Canvas c12, @k RecyclerView parent, @k RecyclerView.z state) {
        int childCount = parent.getChildCount();
        Iterator<View> it = new C22829k0(parent).iterator();
        int i12 = 0;
        while (it.hasNext()) {
            View next = it.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            View view = next;
            if (i12 != childCount - 1) {
                float bottom = view.getBottom();
                c12.drawLine(this.marginLeft, bottom, view.getRight() - this.marginRight, bottom, this.paint);
            }
            i12 = i13;
        }
    }

    public DividersItemDecoration(float f12, float f13, float f14, int i12) {
        this.marginLeft = f12;
        this.marginRight = f13;
        this.separatorHeight = f14;
        this.color = i12;
        Paint paint = new Paint();
        paint.setColor(i12);
        paint.setStrokeWidth(f14);
        this.paint = paint;
    }
}
