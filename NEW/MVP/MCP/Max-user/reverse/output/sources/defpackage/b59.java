package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.mediarouter.app.OverlayListView;
import androidx.mediarouter.app.a;
import androidx.mediarouter.app.c;
import androidx.mediarouter.app.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class b59 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d b;

    public b59(d dVar, boolean z) {
        this.b = dVar;
        this.a = z;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iK;
        HashMap map;
        HashMap map2;
        Bitmap bitmap;
        d dVar = this.b;
        dVar.C0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (dVar.o1) {
            dVar.p1 = true;
            return;
        }
        k69 k69Var = dVar.s0;
        int i = dVar.J0.getLayoutParams().height;
        d.o(dVar.J0, -1);
        dVar.v(dVar.h());
        View decorView = dVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(dVar.getWindow().getAttributes().width, 1073741824), 0);
        d.o(dVar.J0, i);
        if (!(dVar.D0.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) dVar.D0.getDrawable()).getBitmap()) == null) {
            iK = 0;
        } else {
            iK = dVar.k(bitmap.getWidth(), bitmap.getHeight());
            dVar.D0.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int iM = dVar.m(dVar.h());
        int size = dVar.P0.size();
        int size2 = dVar.n() ? Collections.unmodifiableList(k69Var.u).size() * dVar.X0 : 0;
        if (size > 0) {
            size2 += dVar.Z0;
        }
        int iMin = Math.min(size2, dVar.Y0);
        if (!dVar.n1) {
            iMin = 0;
        }
        int iMax = Math.max(iK, iMin) + iM;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height() - (dVar.B0.getMeasuredHeight() - dVar.C0.getMeasuredHeight());
        if (iK <= 0 || iMax > iHeight) {
            if (dVar.J0.getMeasuredHeight() + dVar.N0.getLayoutParams().height >= dVar.C0.getMeasuredHeight()) {
                dVar.D0.setVisibility(8);
            }
            iMax = iMin + iM;
            iK = 0;
        } else {
            dVar.D0.setVisibility(0);
            d.o(dVar.D0, iK);
        }
        if (!dVar.h() || iMax > iHeight) {
            dVar.K0.setVisibility(8);
        } else {
            dVar.K0.setVisibility(0);
        }
        dVar.v(dVar.K0.getVisibility() == 0);
        int iM2 = dVar.m(dVar.K0.getVisibility() == 0);
        int iMax2 = Math.max(iK, iMin) + iM2;
        if (iMax2 > iHeight) {
            iMin -= iMax2 - iHeight;
        } else {
            iHeight = iMax2;
        }
        dVar.J0.clearAnimation();
        dVar.N0.clearAnimation();
        dVar.C0.clearAnimation();
        boolean z = this.a;
        if (z) {
            dVar.g(dVar.J0, iM2);
            dVar.g(dVar.N0, iMin);
            dVar.g(dVar.C0, iHeight);
        } else {
            d.o(dVar.J0, iM2);
            d.o(dVar.N0, iMin);
            d.o(dVar.C0, iHeight);
        }
        d.o(dVar.A0, rect.height());
        List listUnmodifiableList = Collections.unmodifiableList(k69Var.u);
        if (listUnmodifiableList.isEmpty()) {
            dVar.P0.clear();
            dVar.O0.notifyDataSetChanged();
            return;
        }
        if (new HashSet(dVar.P0).equals(new HashSet(listUnmodifiableList))) {
            dVar.O0.notifyDataSetChanged();
            return;
        }
        if (z) {
            OverlayListView overlayListView = dVar.N0;
            c cVar = dVar.O0;
            map = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i2 = 0; i2 < overlayListView.getChildCount(); i2++) {
                Object item = cVar.getItem(firstVisiblePosition + i2);
                View childAt = overlayListView.getChildAt(i2);
                map.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            map = null;
        }
        if (z) {
            Context context = dVar.t0;
            OverlayListView overlayListView2 = dVar.N0;
            c cVar2 = dVar.O0;
            map2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i3 = 0; i3 < overlayListView2.getChildCount(); i3++) {
                Object item2 = cVar2.getItem(firstVisiblePosition2 + i3);
                View childAt2 = overlayListView2.getChildAt(i3);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(bitmapCreateBitmap));
                map2.put(item2, new BitmapDrawable(context.getResources(), bitmapCreateBitmap));
            }
        } else {
            map2 = null;
        }
        ArrayList arrayList = dVar.P0;
        HashSet hashSet = new HashSet(listUnmodifiableList);
        hashSet.removeAll(arrayList);
        dVar.Q0 = hashSet;
        HashSet hashSet2 = new HashSet(dVar.P0);
        hashSet2.removeAll(listUnmodifiableList);
        dVar.R0 = hashSet2;
        dVar.P0.addAll(0, dVar.Q0);
        dVar.P0.removeAll(dVar.R0);
        dVar.O0.notifyDataSetChanged();
        if (z && dVar.n1) {
            if (dVar.R0.size() + dVar.Q0.size() > 0) {
                dVar.N0.setEnabled(false);
                dVar.N0.requestLayout();
                dVar.o1 = true;
                dVar.N0.getViewTreeObserver().addOnGlobalLayoutListener(new a(dVar, map, map2));
                return;
            }
        }
        dVar.Q0 = null;
        dVar.R0 = null;
    }
}
