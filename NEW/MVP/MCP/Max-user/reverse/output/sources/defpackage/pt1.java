package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.gallery.MediaGalleryWidget;

/* loaded from: classes.dex */
public final class pt1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pt1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, k18] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                qt1 qt1Var = (qt1) this.b;
                x4h videoLayoutUpdatesController = qt1Var.getVideoLayoutUpdatesController();
                if (videoLayoutUpdatesController != null) {
                    videoLayoutUpdatesController.a((View) ((uid) this.c).a, qt1Var.u0);
                    return;
                }
                return;
            case 1:
                view.removeOnLayoutChangeListener(this);
                MediaGalleryWidget mediaGalleryWidget = (MediaGalleryWidget) this.b;
                yy7[] yy7VarArr = MediaGalleryWidget.Y;
                int i9 = mediaGalleryWidget.A0().x0.c;
                xfh.r(mediaGalleryWidget.z0().c, new jp6((((View) this.c).getWidth() / i9) - (mediaGalleryWidget.A0().x0.d - (mediaGalleryWidget.A0().x0.d / i9))));
                xfh.r(mediaGalleryWidget.z0().c, new kp6(-mediaGalleryWidget.y0().computeVerticalScrollOffset()));
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                ik9 ik9Var = (ik9) this.b;
                int measuredHeight = ik9Var.d.getMeasuredHeight();
                ImageView imageView = ik9Var.b;
                int measuredHeight2 = imageView.getMeasuredHeight();
                ?? r7 = ik9Var.s0;
                boolean z = measuredHeight > Math.min(measuredHeight2, dqi.l(r7));
                int iB = z ? (int) (sw4.b(vz2.m.e((t75) this.c), ik9Var.getContext()) * 0.2d) : 0;
                ik9Var.a = u45.c(4, vw4.d().getDisplayMetrics().density, iB);
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = ik9Var.a;
                imageView.setLayoutParams(marginLayoutParams);
                if (r7.e()) {
                    ImageView imageView2 = (ImageView) r7.getValue();
                    ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.bottomMargin = ik9Var.a;
                    imageView2.setLayoutParams(marginLayoutParams2);
                }
                ImageView imageView3 = ik9Var.v0;
                ViewGroup.LayoutParams layoutParams3 = imageView3.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                marginLayoutParams3.bottomMargin = z ? iB : 0;
                imageView3.setLayoutParams(marginLayoutParams3);
                ?? r4 = ik9Var.w0;
                if (r4.e()) {
                    ImageView imageView4 = (ImageView) r4.getValue();
                    ViewGroup.LayoutParams layoutParams4 = imageView4.getLayoutParams();
                    if (layoutParams4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    marginLayoutParams4.bottomMargin = iB;
                    imageView4.setLayoutParams(marginLayoutParams4);
                }
                ?? r3 = ik9Var.t0;
                if (r3.e()) {
                    wbf wbfVar = (wbf) r3.getValue();
                    ViewGroup.LayoutParams layoutParams5 = wbfVar.getLayoutParams();
                    if (layoutParams5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    marginLayoutParams5.bottomMargin = iB;
                    wbfVar.setLayoutParams(marginLayoutParams5);
                    return;
                }
                return;
            case 3:
                view.removeOnLayoutChangeListener(this);
                RecyclerView recyclerView = (RecyclerView) this.b;
                FrameLayout frameLayout = (FrameLayout) this.c;
                recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), frameLayout.getPaddingBottom() + frameLayout.getMeasuredHeight());
                return;
            case 4:
                View view2 = (View) this.b;
                if (view2.getVisibility() == 0) {
                    ((kyf) this.c).c(view2);
                    return;
                }
                return;
            case 5:
                String str = ((VideoMessageWidget) this.b).X;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.o;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, "updating blur for video message screen", null);
                    }
                }
                ((View) this.c).getBackground().invalidateSelf();
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                VideoMessageWidget videoMessageWidget = (VideoMessageWidget) this.b;
                yy7[] yy7VarArr2 = VideoMessageWidget.H0;
                int iZ0 = VideoMessageWidget.z0(videoMessageWidget, (View) videoMessageWidget.C0().getParent());
                o7h o7hVar = (o7h) this.c;
                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(iZ0, iZ0);
                layoutParams6.gravity = 17;
                o7hVar.setLayoutParams(layoutParams6);
                return;
        }
    }

    public pt1(kyf kyfVar, View view) {
        this.a = 4;
        this.c = kyfVar;
        this.b = view;
    }
}
