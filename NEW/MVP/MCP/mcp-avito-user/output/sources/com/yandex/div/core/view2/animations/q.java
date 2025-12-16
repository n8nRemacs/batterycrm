package com.yandex.div.core.view2.animations;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import androidx.core.view.A0;
import androidx.core.view.C22816e;
import androidx.core.view.C22823h0;
import androidx.core.view.C22833m0;
import com.avito.android.R;
import j.K;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ViewCopies.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class q {

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "com/yandex/div/core/util/n", "core-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.a f367982b;

        public a(Y41.a aVar) {
            this.f367982b = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            view.removeOnLayoutChangeListener(this);
            this.f367982b.invoke();
        }
    }

    /* compiled from: ViewCopies.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ View f367983l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ImageView f367984m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, ImageView imageView) {
            super(0);
            this.f367983l = view;
            this.f367984m = imageView;
        }

        @Override // Y41.a
        public final G0 invoke() {
            View view = this.f367983l;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.translate(-view.getScrollX(), -view.getScrollY());
            view.draw(canvas);
            this.f367984m.setImageBitmap(bitmapCreateBitmap);
            return G0.f406611a;
        }
    }

    @K
    @Y61.k
    public static final View a(@Y61.k View view, @Y61.k ViewGroup viewGroup, @Y61.k e eVar, @Y61.k int[] iArr) {
        Object tag = view.getTag(R.id.save_overlay_view);
        View view2 = tag instanceof View ? (View) tag : null;
        if (view2 != null) {
            return view2;
        }
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        c(view, imageView);
        imageView.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        imageView.layout(0, 0, view.getWidth(), view.getHeight());
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        imageView.offsetLeftAndRight(iArr[0] - iArr2[0]);
        imageView.offsetTopAndBottom(iArr[1] - iArr2[1]);
        view.setTag(R.id.save_overlay_view, imageView);
        ViewGroupOverlay overlay = viewGroup.getOverlay();
        view.setVisibility(4);
        overlay.add(imageView);
        eVar.a(new p(view, overlay, imageView));
        b(new o(view, imageView), view);
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (imageView.isAttachedToWindow()) {
            imageView.addOnAttachStateChangeListener(new n(view, imageView));
        } else {
            b(null, view);
        }
        return imageView;
    }

    public static final void b(@Y61.l Y41.a aVar, @Y61.k View view) {
        if (view instanceof com.yandex.div.core.view2.divs.widgets.i) {
            ((com.yandex.div.core.view2.divs.widgets.i) view).setImageChangeCallback(aVar);
        } else {
            if (!(view instanceof ViewGroup)) {
                return;
            }
            Iterator itA = C22816e.a((ViewGroup) view);
            while (true) {
                C22833m0 c22833m0 = (C22833m0) itA;
                if (!c22833m0.hasNext()) {
                    return;
                } else {
                    b(aVar, (View) c22833m0.next());
                }
            }
        }
    }

    public static final void c(View view, ImageView imageView) {
        Bitmap bitmap;
        ImageView imageView2 = view instanceof ImageView ? (ImageView) view : null;
        Object drawable = imageView2 == null ? null : imageView2.getDrawable();
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        b bVar = new b(view, imageView);
        if (com.yandex.div.core.util.q.b(view)) {
            bVar.invoke();
        } else if (!com.yandex.div.core.util.q.b(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new a(bVar));
        } else {
            bVar.invoke();
        }
    }
}
