package com.avito.android.comfortable_deal_info.deeplink;

import androidx.fragment.app.DialogFragment;
import com.avito.android.comfortable_deal_info.ComfortableDealInfoDialogFragment;
import com.avito.android.comfortable_deal_info.ComfortableDealInfoDialogParams;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ComfortableDealInfoDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class a extends N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ComfortableDealInfoLink f123467l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ComfortableDealInfoLink comfortableDealInfoLink) {
        super(0);
        this.f123467l = comfortableDealInfoLink;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        ComfortableDealInfoDialogFragment.a aVar = ComfortableDealInfoDialogFragment.f123435o0;
        ComfortableDealInfoLink comfortableDealInfoLink = this.f123467l;
        ArrayList arrayList = comfortableDealInfoLink.f123465b;
        aVar.getClass();
        ComfortableDealInfoDialogFragment comfortableDealInfoDialogFragment = new ComfortableDealInfoDialogFragment();
        ComfortableDealInfoDialogParams comfortableDealInfoDialogParams = new ComfortableDealInfoDialogParams(comfortableDealInfoLink.f123466c, arrayList);
        comfortableDealInfoDialogFragment.f123440k0.setValue(comfortableDealInfoDialogFragment, ComfortableDealInfoDialogFragment.f123436p0[0], comfortableDealInfoDialogParams);
        return comfortableDealInfoDialogFragment;
    }
}
