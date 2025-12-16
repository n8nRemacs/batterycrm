package ir;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.advert_details.UserIconType;
import com.avito.android.util.C35949t5;
import com.facebook.drawee.view.SimpleDraweeView;
import hw.InterfaceC41178c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertSellerAvatarRenderer.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lir/b;", "Lir/d;", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ir.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C42094b implements d {
    @Inject
    public C42094b() {
    }

    @Override // ir.d
    public final void a(@k SimpleDraweeView simpleDraweeView, @l com.avito.android.image_loader.a aVar, @k UserIconType userIconType, @l Drawable drawable) {
        simpleDraweeView.getHierarchy().o(drawable, 1);
        if (aVar != null) {
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.d(aVar);
            aVarA.f169490h = new C42093a(userIconType, simpleDraweeView);
            aVarA.c();
        }
    }
}
