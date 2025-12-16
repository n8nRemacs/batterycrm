package com.avito.android.lib.design.animation.animation_overlay;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.lib.design.animation.animation_overlay.b;
import com.avito.android.lib.design.animation.animation_overlay.f;
import com.avito.android.remote.model.AnimationOverlayUrl;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: AnimationOverlayFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/animation/animation_overlay/e;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f178326a = new e();

    @k
    public static b a(@k View view, @k AnimationOverlayUrl animationOverlayUrl, int i12, @k AnimationView.RepeatMode repeatMode, @l Context context) {
        if (context == null) {
            context = view.getContext();
        }
        Object obj = null;
        b bVar = new b(context, null, 0);
        bVar.anchorView = view;
        bVar.f178307b = null;
        AnimationView animationView = bVar.f178313h;
        animationView.setRepeatMode(repeatMode);
        animationView.setRepeatCount(i12);
        animationView.setAnimationProgressListener(new c(i12, bVar));
        animationView.setLoadingStateListener(new d(bVar));
        String landscapeUrl = animationView.getContext().getResources().getConfiguration().orientation == 2 ? animationOverlayUrl.getLandscapeUrl() : animationView.getContext().getResources().getBoolean(R.bool.is_tablet) ? animationOverlayUrl.getTabletPortraitUrl() : animationOverlayUrl.getPortraitUrl();
        if (landscapeUrl == null) {
            landscapeUrl = animationOverlayUrl.getPortraitUrl();
        }
        String str = landscapeUrl;
        if (str != null) {
            animationView.setAnimationData(new AnimationView.a.e(str, null, null, 6, null));
        }
        f.f178327a.getClass();
        f.a.f178329b.getClass();
        b.f178305j.getClass();
        Iterator<T> it = b.f178306k.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((WeakReference) next).get() != null) {
                obj = next;
                break;
            }
        }
        if (obj == null) {
            b.f178306k.add(new WeakReference<>(bVar));
            b bVarA = b.a.a();
            if (!bVar.equals(bVarA) && bVarA != null) {
                bVarA.c();
            }
            bVar.d();
        } else {
            b.f178306k.add(new WeakReference<>(bVar));
            b bVarA2 = b.a.a();
            if (!bVar.equals(bVarA2) && bVarA2 != null) {
                bVarA2.c();
            }
        }
        return bVar;
    }

    public static /* synthetic */ b b(e eVar, View view, AnimationOverlayUrl animationOverlayUrl, int i12) {
        AnimationView.RepeatMode repeatMode = (i12 & 4) != 0 ? AnimationView.RepeatMode.f178282c : null;
        eVar.getClass();
        return a(view, animationOverlayUrl, 0, repeatMode, null);
    }
}
