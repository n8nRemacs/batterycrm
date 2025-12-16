package com.avito.android.verification.list_items.image;

import android.widget.FrameLayout;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ImageItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/list_items/image/c;", "LTV0/d;", "Lcom/avito/android/verification/list_items/image/e;", "Lcom/avito/android/verification/list_items/image/ImageItem;", "<init>", "()V", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements TV0.d<e, ImageItem> {
    @Inject
    public c() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        int i13;
        e eVar2 = (e) eVar;
        ImageItem imageItem = (ImageItem) aVar;
        SimpleDraweeView simpleDraweeView = eVar2.f324827b;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) simpleDraweeView.getLayoutParams();
        layoutParams.width = imageItem.f324813c;
        layoutParams.height = imageItem.f324814d;
        int iOrdinal = imageItem.f324815e.ordinal();
        if (iOrdinal == 0) {
            i13 = 8388611;
        } else if (iOrdinal == 1) {
            i13 = 8388613;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = 17;
        }
        layoutParams.gravity = i13;
        simpleDraweeView.requestLayout();
        C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(imageItem.f324816f, com.avito.android.lib.util.darkTheme.c.b(eVar2.f324828c))), null, null, null, 14);
    }
}
