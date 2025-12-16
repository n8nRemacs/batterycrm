package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.google.android.material.R;
import j.N;
import j.P;
import j.X;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* compiled from: MaterialContainerTransformSharedElementCallback.java */
@X
/* loaded from: classes6.dex */
public class t extends SharedElementCallback {

    /* renamed from: e, reason: collision with root package name */
    @P
    public static WeakReference<View> f357957e;

    /* renamed from: c, reason: collision with root package name */
    @P
    public Rect f357960c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f357958a = true;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f357959b = true;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final b f357961d = new b();

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    public interface a {
    }

    /* compiled from: MaterialContainerTransformSharedElementCallback.java */
    public static class b implements a {
    }

    @Override // android.app.SharedElementCallback
    @P
    public final Parcelable onCaptureSharedElementSnapshot(@N View view, @N Matrix matrix, @N RectF rectF) {
        f357957e = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @P
    public final View onCreateSnapshotView(@N Context context, @P Parcelable parcelable) {
        WeakReference<View> weakReference;
        KeyEvent.Callback callback;
        View viewOnCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (viewOnCreateSnapshotView != null && (weakReference = f357957e) != null && this.f357961d != null && (callback = (View) weakReference.get()) != null) {
            com.google.android.material.shape.q shapeAppearanceModel = callback instanceof com.google.android.material.shape.v ? ((com.google.android.material.shape.v) callback).getShapeAppearanceModel() : null;
            if (shapeAppearanceModel != null) {
                viewOnCreateSnapshotView.setTag(R.id.mtrl_motion_snapshot_view, shapeAppearanceModel);
            }
        }
        return viewOnCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public final void onMapSharedElements(@N List<String> list, @N Map<String, View> map) {
        View view;
        Activity activity;
        if (list.isEmpty() || map.isEmpty() || (view = map.get(list.get(0))) == null) {
            return;
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            Window window = activity.getWindow();
            boolean z12 = this.f357958a;
            boolean z13 = this.f357959b;
            if (z12) {
                Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
                if (sharedElementEnterTransition instanceof p) {
                    p pVar = (p) sharedElementEnterTransition;
                    window.setSharedElementReenterTransition(null);
                    if (z13) {
                        if (pVar.getDuration() >= 0) {
                            window.setTransitionBackgroundFadeDuration(pVar.getDuration());
                        }
                        pVar.addListener(new q(window));
                        return;
                    }
                    return;
                }
                return;
            }
            Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
            if (sharedElementReturnTransition instanceof p) {
                p pVar2 = (p) sharedElementReturnTransition;
                pVar2.f357893b = true;
                pVar2.addListener(new r(activity));
                if (z13) {
                    if (pVar2.getDuration() >= 0) {
                        window.setTransitionBackgroundFadeDuration(pVar2.getDuration());
                    }
                    pVar2.addListener(new s(window));
                }
            }
        }
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementEnd(@N List<String> list, @N List<View> list2, @N List<View> list3) {
        if (!list2.isEmpty() && (list2.get(0).getTag(R.id.mtrl_motion_snapshot_view) instanceof View)) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, null);
        }
        if (!this.f357958a && !list2.isEmpty()) {
            View view = list2.get(0);
            RectF rectF = H.f357855a;
            this.f357960c = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        this.f357958a = false;
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementStart(@N List<String> list, @N List<View> list2, @N List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (this.f357958a || list2.isEmpty() || this.f357960c == null) {
            return;
        }
        View view = list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f357960c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f357960c.height(), 1073741824));
        Rect rect = this.f357960c;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }
}
