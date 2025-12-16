package PV;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VerticalListItemDecoration.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LPV/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Drawable f13083b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<Integer, Drawable> f13084c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13085d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13086e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13087f;

    /* compiled from: VerticalListItemDecoration.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPV/b$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Drawable f13088a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LinkedHashMap f13089b;

        /* renamed from: c, reason: collision with root package name */
        public int f13090c;

        /* renamed from: d, reason: collision with root package name */
        public int f13091d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f13092e;

        public a() {
            this(null, 1, null);
        }

        @k
        public final b a() {
            return new b(this.f13088a, this.f13089b, this.f13090c, this.f13091d, this.f13092e, null);
        }

        @k
        public final void b(@l Drawable drawable, int i12) {
            this.f13089b.put(Integer.valueOf(i12), drawable);
        }

        public a(Drawable drawable, int i12, C42822w c42822w) {
            this.f13088a = (i12 & 1) != 0 ? null : drawable;
            this.f13089b = new LinkedHashMap();
            this.f13092e = true;
        }
    }

    public b() {
        throw null;
    }

    public b(Drawable drawable, Map map, int i12, int i13, boolean z12, C42822w c42822w) {
        this.f13083b = drawable;
        this.f13084c = map;
        this.f13085d = i12;
        this.f13086e = i13;
        this.f13087f = z12;
    }

    public final Drawable c(View view, RecyclerView.z zVar) {
        int bindingAdapterPosition = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition();
        if (!this.f13087f && bindingAdapterPosition == zVar.b() - 1) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(bindingAdapterPosition);
        Map<Integer, Drawable> map = this.f13084c;
        return map.containsKey(numValueOf) ? map.get(Integer.valueOf(bindingAdapterPosition)) : this.f13083b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        Drawable drawableC = c(view, zVar);
        rect.set(0, 0, 0, drawableC != null ? drawableC.getIntrinsicHeight() : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDrawOver(@k Canvas canvas, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.onDrawOver(canvas, recyclerView, zVar);
        int paddingLeft = recyclerView.getPaddingLeft() + this.f13085d;
        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.f13086e;
        int childCount = recyclerView.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            Drawable drawableC = c(childAt, zVar);
            Drawable drawableMutate = drawableC != null ? drawableC.mutate() : null;
            if (drawableMutate != null) {
                int translationY = (int) (childAt.getTranslationY() + childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) childAt.getLayoutParams())).bottomMargin);
                int intrinsicHeight = drawableMutate.getIntrinsicHeight() + translationY;
                drawableMutate.setAlpha((int) (childAt.getAlpha() * 255));
                drawableMutate.setBounds(paddingLeft, translationY, width, intrinsicHeight);
                drawableMutate.draw(canvas);
            }
        }
    }
}
