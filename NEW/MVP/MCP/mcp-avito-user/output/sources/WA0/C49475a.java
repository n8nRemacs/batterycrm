package wA0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.support_bottom_sheet.SupportDialogDeeplink;
import com.avito.android.support_bottom_sheet.ui.SupportDialogFragment;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SupportDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LwA0/a;", "Lev/b;", "Lcom/avito/android/support_bottom_sheet/SupportDialogDeeplink;", "_avito_gig_support-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wA0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49475a extends AbstractC40162b<SupportDialogDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.d f441308d;

    @Inject
    public C49475a(@k a.d dVar) {
        this.f441308d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        SupportDialogDeeplink supportDialogDeeplink = (SupportDialogDeeplink) deepLink;
        SupportDialogFragment.a aVar = SupportDialogFragment.f292497k0;
        String str2 = supportDialogDeeplink.f292392b;
        aVar.getClass();
        this.f441308d.w1(SupportDialogFragment.a.a(str2, null, supportDialogDeeplink.f292393c, supportDialogDeeplink.f292394d, supportDialogDeeplink.f292395e, supportDialogDeeplink.f292396f, supportDialogDeeplink.f292397g), this.f395448b);
        return AbstractC14250d.c.f9171c;
    }
}
