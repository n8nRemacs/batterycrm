package com.avito.beduin.v2.render.android_view;

import android.view.View;
import kotlin.Metadata;

/* compiled from: BeduinView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/render/android_view/E;", "", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f337919a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I f337920b;

    public E(@Y61.k View view, @Y61.k I i12) {
        this.f337919a = view;
        this.f337920b = i12;
        view.addOnAttachStateChangeListener(i12);
        if (view.isAttachedToWindow()) {
            i12.onViewAttachedToWindow(view);
        } else {
            i12.onViewDetachedFromWindow(view);
        }
    }

    public final void a() {
        I i12 = this.f337920b;
        View view = this.f337919a;
        i12.onViewDetachedFromWindow(view);
        i12.a();
        view.removeOnAttachStateChangeListener(i12);
    }
}
