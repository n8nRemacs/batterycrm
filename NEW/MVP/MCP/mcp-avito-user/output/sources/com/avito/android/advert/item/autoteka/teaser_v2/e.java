package com.avito.android.advert.item.autoteka.teaser_v2;

import Y41.l;
import android.net.Uri;
import com.avito.android.advert.item.W0;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsAutotekaTeaserV2Presenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "Lkotlin/G0;", "invoke", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements l<Uri, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f73113l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar) {
        super(1);
        this.f73113l = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(Uri uri) {
        Uri uri2 = uri;
        W0 w02 = this.f73113l.f73115b;
        if (w02 != null) {
            w02.c(uri2);
        }
        return G0.f406611a;
    }
}
