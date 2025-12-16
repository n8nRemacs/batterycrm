package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class bz4 extends vhd {
    public static final int[] o = {R.attr.listDivider};
    public final /* synthetic */ int a;
    public final int b;
    public Object c;
    public final Object d;

    public bz4(zid zidVar, int i) {
        this.a = 1;
        this.c = zidVar;
        this.b = i;
        i8a i8aVar = vo7.a;
        this.d = new i8a();
    }

    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.c;
                if (drawable != null) {
                    if (this.b != 1) {
                        rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
                        break;
                    } else {
                        rect.set(0, 0, 0, drawable.getIntrinsicHeight());
                        break;
                    }
                } else {
                    rect.set(0, 0, 0, 0);
                    break;
                }
            default:
                i8a i8aVar = (i8a) this.d;
                int iR = RecyclerView.R(view);
                if (iR != -1) {
                    int iG = ((b9e) this.c).g(iR);
                    int i = iG != 0 ? e9e.$EnumSwitchMapping$0[az1.v(iG)] : -1;
                    int i2 = this.b;
                    if (i == 1) {
                        if (iR != 0) {
                            rect.top = kti.d(i2 * vw4.d().getDisplayMetrics().density);
                        }
                        i8aVar.a(iR);
                        break;
                    } else if (i == 2) {
                        if (iR != 0) {
                            rect.top = kti.d(i2 * vw4.d().getDisplayMetrics().density);
                        }
                        i8aVar.a(iR);
                        break;
                    } else {
                        i8aVar.i(iR);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.vhd
    public void g(Canvas canvas, RecyclerView recyclerView, iid iidVar) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        switch (this.a) {
            case 0:
                Rect rect = (Rect) this.d;
                if (recyclerView.getLayoutManager() != null && ((Drawable) this.c) != null) {
                    int i = 0;
                    if (this.b != 1) {
                        canvas.save();
                        if (recyclerView.getClipToPadding()) {
                            paddingTop = recyclerView.getPaddingTop();
                            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
                        } else {
                            height = recyclerView.getHeight();
                            paddingTop = 0;
                        }
                        int childCount = recyclerView.getChildCount();
                        while (i < childCount) {
                            View childAt = recyclerView.getChildAt(i);
                            recyclerView.getLayoutManager().B(rect, childAt);
                            int iRound = Math.round(childAt.getTranslationX()) + rect.right;
                            ((Drawable) this.c).setBounds(iRound - ((Drawable) this.c).getIntrinsicWidth(), paddingTop, iRound, height);
                            ((Drawable) this.c).draw(canvas);
                            i++;
                        }
                        canvas.restore();
                        break;
                    } else {
                        canvas.save();
                        if (recyclerView.getClipToPadding()) {
                            paddingLeft = recyclerView.getPaddingLeft();
                            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                        } else {
                            width = recyclerView.getWidth();
                            paddingLeft = 0;
                        }
                        int childCount2 = recyclerView.getChildCount();
                        while (i < childCount2) {
                            View childAt2 = recyclerView.getChildAt(i);
                            RecyclerView.V(rect, childAt2);
                            int iRound2 = Math.round(childAt2.getTranslationY()) + rect.bottom;
                            ((Drawable) this.c).setBounds(paddingLeft, iRound2 - ((Drawable) this.c).getIntrinsicHeight(), width, iRound2);
                            ((Drawable) this.c).draw(canvas);
                            i++;
                        }
                        canvas.restore();
                        break;
                    }
                }
                break;
        }
    }

    public bz4(Context context) {
        this.a = 0;
        this.d = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(o);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.c = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        this.b = 1;
    }
}
