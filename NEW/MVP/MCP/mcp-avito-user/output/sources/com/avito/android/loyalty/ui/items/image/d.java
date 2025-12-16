package com.avito.android.loyalty.ui.items.image;

import androidx.compose.runtime.internal.P;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImageItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/items/image/d;", "LTV0/d;", "Lcom/avito/android/loyalty/ui/items/image/f;", "Lcom/avito/android/loyalty/ui/items/image/a;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements TV0.d<f, a> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        a aVar2 = (a) aVar;
        SimpleDraweeView simpleDraweeView = fVar.f183689b;
        simpleDraweeView.getLayoutParams().width = aVar2.f183682d;
        simpleDraweeView.getLayoutParams().height = aVar2.f183681c;
        C35949t5.c(fVar.f183689b, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnTheme(aVar2.f183683e, com.avito.android.lib.util.darkTheme.c.b(fVar.itemView.getContext()))), null, null, null, 14);
    }
}
