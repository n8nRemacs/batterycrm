package com.avito.android.advert.advert_details_style;

import Y41.p;
import android.content.res.ColorStateList;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.advert.navbar.r;
import com.avito.android.advert.navbar.s;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsStyleConfig.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/MenuItem;", "item", "Lcom/avito/android/advert/navbar/r;", "iconTint", "Lkotlin/G0;", "invoke", "(Landroid/view/MenuItem;Lcom/avito/android/advert/navbar/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements p<MenuItem, r, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final d f68659l = new d();

    public d() {
        super(2);
    }

    @Override // Y41.p
    public final G0 invoke(MenuItem menuItem, r rVar) {
        r rVar2 = rVar;
        View actionView = menuItem.getActionView();
        if (actionView != null) {
            View viewFindViewById = actionView.findViewById(R.id.cart_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ((ImageView) viewFindViewById).setImageTintList(ColorStateList.valueOf(s.a(rVar2, actionView.getContext())));
        }
        return G0.f406611a;
    }
}
