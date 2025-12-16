package com.avito.android.checkable_image;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: CheckableImageWithAnimation.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class p extends H implements Y41.l<View, ViewGroup> {

    /* renamed from: b, reason: collision with root package name */
    public static final p f118106b = new p();

    public p() {
        super(1, q.class, "findSuitableOverlayHost", "findSuitableOverlayHost(Landroid/view/View;)Landroid/view/ViewGroup;", 1);
    }

    @Override // Y41.l
    public final ViewGroup invoke(View view) {
        return q.a(view);
    }
}
