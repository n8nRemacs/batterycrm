package com.avito.android.component.user_hat;

import com.avito.android.image_loader.o;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: Avatar.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/user_hat/a;", "Lcom/avito/android/image_loader/o;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SimpleDraweeView f125293b;

    public a(SimpleDraweeView simpleDraweeView) {
        this.f125293b = simpleDraweeView;
    }

    @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
    public final void H(int i12, int i13) {
        if (i13 > 0) {
            this.f125293b.setAspectRatio(i12 / i13);
        }
    }
}
