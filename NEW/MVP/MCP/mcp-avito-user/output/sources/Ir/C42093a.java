package ir;

import android.graphics.drawable.ColorDrawable;
import com.avito.android.R;
import com.avito.android.image_loader.o;
import com.avito.android.remote.model.advert_details.UserIconType;
import com.avito.android.util.C35835l0;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: AdvertSellerAvatarRenderer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lir/a;", "Lcom/avito/android/image_loader/o;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ir.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C42093a extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UserIconType f405270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SimpleDraweeView f405271c;

    public C42093a(UserIconType userIconType, SimpleDraweeView simpleDraweeView) {
        this.f405270b = userIconType;
        this.f405271c = simpleDraweeView;
    }

    @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
    public final void H(int i12, int i13) {
        if (this.f405270b == UserIconType.SHOP) {
            SimpleDraweeView simpleDraweeView = this.f405271c;
            simpleDraweeView.getHierarchy().s(null);
            simpleDraweeView.getHierarchy().o(new ColorDrawable(C35835l0.d(R.attr.white, simpleDraweeView.getContext())), 0);
            simpleDraweeView.getHierarchy().n(s.c.f340136h);
        }
    }
}
