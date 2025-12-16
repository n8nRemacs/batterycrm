package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DividerItemDecoration.java */
/* renamed from: androidx.recyclerview.widget.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C23425p extends RecyclerView.l {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f54091e = {R.attr.listDivider};

    /* renamed from: b, reason: collision with root package name */
    public Drawable f54092b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54093c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f54094d = new Rect();

    public C23425p(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f54091e);
        this.f54092b = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        this.f54093c = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        Drawable drawable = this.f54092b;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f54093c == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null || this.f54092b == null) {
            return;
        }
        int i12 = this.f54093c;
        Rect rect = this.f54094d;
        int i13 = 0;
        if (i12 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i13 < childCount) {
                View childAt = recyclerView.getChildAt(i13);
                RecyclerView.Y(childAt, rect);
                int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                this.f54092b.setBounds(paddingLeft, iRound - this.f54092b.getIntrinsicHeight(), width, iRound);
                this.f54092b.draw(canvas);
                i13++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i13 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i13);
            recyclerView.getLayoutManager().i0(childAt2, rect);
            int iRound2 = Math.round(childAt2.getTranslationX()) + rect.right;
            this.f54092b.setBounds(iRound2 - this.f54092b.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.f54092b.draw(canvas);
            i13++;
        }
        canvas.restore();
    }
}
