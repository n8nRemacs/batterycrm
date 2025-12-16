package com.avito.android.advert.item.beduin.v2.favorite;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.AdvertDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.AdvertisementVerticalAliasKt;
import com.avito.android.remote.model.NameIdEntity;
import com.avito.android.serp.adapter.InterfaceC34863v;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.google.android.material.internal.CheckableImageButton;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.m;
import io.reactivex.rxjava3.kotlin.A1;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FavoriteButtonComponent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/beduin/v2/favorite/d;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/android/advert/item/beduin/v2/favorite/j;", "Lcom/google/android/material/internal/CheckableImageButton;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends AbstractC36333c<j, CheckableImageButton> {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34863v f73322m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f73323n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final x f73324o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f73325p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public m f73326q;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@Y61.k InterfaceC34863v interfaceC34863v, @Y61.k com.avito.android.favorite.h hVar, @Y61.k x xVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        super(null, 1, 0 == true ? 1 : 0);
        this.f73322m = interfaceC34863v;
        this.f73323n = hVar;
        this.f73324o = xVar;
        this.f73325p = interfaceC35745a5;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, j jVar) {
        String str;
        CheckableImageButton checkableImageButton = (CheckableImageButton) view;
        j jVar2 = jVar;
        m mVar = this.f73326q;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f73326q = A1.g(this.f73323n.b(jVar2.f73338a, jVar2.f73339b).s(this.f73325p.e()), null, new b(checkableImageButton), 1);
        String str2 = jVar2.f73340c;
        if (str2 != null) {
            str = str2;
        } else {
            String str3 = jVar2.f73341d;
            if (str3 != null) {
                DeepLink deepLinkB = this.f73324o.b(str3);
                AdvertDetailsLink advertDetailsLink = deepLinkB instanceof AdvertDetailsLink ? (AdvertDetailsLink) deepLinkB : null;
                str2 = advertDetailsLink != null ? advertDetailsLink.f132948c : null;
                str = str2;
            } else {
                str = null;
            }
        }
        String str4 = jVar2.f73342e;
        checkableImageButton.setOnClickListener(new a(checkableImageButton, this, str, str4 != null ? AdvertisementVerticalAliasKt.toVerticalAlias(new NameIdEntity(str4, null)) : null, jVar2, 0));
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        CheckableImageButton checkableImageButton = new CheckableImageButton(viewGroup.getContext(), null);
        checkableImageButton.setBackgroundResource(R.drawable.bg_btn_circle_warmgray);
        checkableImageButton.setImageResource(R.drawable.advert_constructor_favorite_red_redesign);
        return checkableImageButton;
    }
}
