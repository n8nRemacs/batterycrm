package com.avito.android.krop;

import com.avito.android.krop.KropView;
import com.avito.android.krop.ZoomableImageView;
import kotlin.Metadata;

/* compiled from: KropView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/krop/b;", "Lcom/avito/android/krop/ZoomableImageView$e;", "krop_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes14.dex */
public final class b implements ZoomableImageView.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ KropView f174832a;

    public b(KropView kropView) {
        this.f174832a = kropView;
    }

    @Override // com.avito.android.krop.ZoomableImageView.e
    public final void a() {
        KropView kropView = this.f174832a;
        KropView.a transformationListener = kropView.getTransformationListener();
        if (transformationListener != null) {
            kropView.getTransformation();
            transformationListener.a();
        }
    }
}
