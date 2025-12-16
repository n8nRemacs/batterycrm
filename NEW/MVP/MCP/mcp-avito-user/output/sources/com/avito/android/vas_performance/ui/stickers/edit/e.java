package com.avito.android.vas_performance.ui.stickers.edit;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertDetailsLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StickersEditVasFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StickersEditVasFragment f322025l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StickersEditVasFragment stickersEditVasFragment) {
        super(1);
        this.f322025l = stickersEditVasFragment;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink myAdvertDetailsLink = deepLink;
        StickersEditVasFragment stickersEditVasFragment = this.f322025l;
        com.avito.android.deeplink_handler.handler.composite.a aVar = stickersEditVasFragment.f322014u0;
        if (aVar == null) {
            aVar = null;
        }
        if (myAdvertDetailsLink == null) {
            String string = stickersEditVasFragment.requireArguments().getString("item_id");
            if (string == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            myAdvertDetailsLink = new MyAdvertDetailsLink(string, null, false, 6, null);
        }
        b.a.a(aVar, myAdvertDetailsLink, null, null, 6);
        return G0.f406611a;
    }
}
