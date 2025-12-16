package com.avito.android.advert;

import android.content.Intent;
import com.avito.android.R;
import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.advert.item.Z0;
import com.avito.android.advert_core.analytics.sharing.a;
import com.avito.android.remote.model.AdjustParameters;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertSharing;
import com.avito.android.util.C35800g5;
import kotlin.Metadata;

/* compiled from: AdvertDetailsToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class T<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28245z f68570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdvertDetails f68571c;

    public T(C28245z c28245z, AdvertDetails advertDetails) {
        this.f68570b = c28245z;
        this.f68571c = advertDetails;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C28245z c28245z = this.f68570b;
        c28245z.getClass();
        AdvertDetails advertDetails = this.f68571c;
        AdvertSharing sharing = advertDetails.getSharing();
        if (sharing == null) {
            return;
        }
        String strB = C35800g5.b(c28245z.f81080F);
        if (c28245z.f81094m.v().invoke().booleanValue()) {
            String id2 = advertDetails.getId();
            String categoryId = advertDetails.getCategoryId();
            AdjustParameters adjustParameters = advertDetails.getAdjustParameters();
            String microCategoryId = adjustParameters != null ? adjustParameters.getMicroCategoryId() : null;
            String locationId = advertDetails.getLocationId();
            d0 d0Var = c28245z.f81107z;
            boolean z12 = false;
            if (d0Var != null && d0Var.Tc()) {
                z12 = true;
            }
            c28245z.f81083b.a(id2, categoryId, microCategoryId, locationId, strB, c28245z.f81093l.Q5(z12));
        } else {
            String id3 = advertDetails.getId();
            String categoryId2 = advertDetails.getCategoryId();
            String locationId2 = advertDetails.getLocationId();
            AdjustParameters adjustParameters2 = advertDetails.getAdjustParameters();
            a.C2455a.a(c28245z.f81083b, id3, categoryId2, locationId2, adjustParameters2 != null ? adjustParameters2.getMicroCategoryId() : null, strB, 32);
        }
        String url = sharing.getNative();
        if (url == null) {
            url = sharing.getUrl();
        }
        Z0 z02 = c28245z.f81075A;
        if (z02 != null) {
            Intent intentD = z02.f72315t.d(url, advertDetails.getTitle());
            AdvertDetailsFragment advertDetailsFragment = z02.f72298c;
            advertDetailsFragment.startActivityForResult(Intent.createChooser(intentD, advertDetailsFragment.getResources().getString(R.string.advert_details_menu_share)), 10);
        }
    }
}
