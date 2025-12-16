package oO;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ShowPinMapLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import oO.f;

/* compiled from: ShowPinMapLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LoO/i;", "Lev/b;", "Lcom/avito/android/deep_linking/links/ShowPinMapLink;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends AbstractC40162b<ShowPinMapLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final f f419752d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f419753e;

    /* compiled from: ShowPinMapLinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f419754a;

        static {
            int[] iArr = new int[ShowPinMapLink.NavigationSource.values().length];
            try {
                ShowPinMapLink.NavigationSource[] navigationSourceArr = ShowPinMapLink.NavigationSource.f133671b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f419754a = iArr;
        }
    }

    @Inject
    public i(@Y61.k f fVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f419752d = fVar;
        this.f419753e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        Intent intentA;
        ShowPinMapLink showPinMapLink = (ShowPinMapLink) deepLink;
        ShowPinMapLink.Argument.f133669c.getClass();
        ShowPinMapLink.Argument argument = bundle != null ? (ShowPinMapLink.Argument) bundle.getParcelable("show_pin_map_argument_key") : null;
        ShowPinMapLink.NavigationSource navigationSource = argument != null ? argument.f133670b : null;
        if ((navigationSource == null ? -1 : a.f419754a[navigationSource.ordinal()]) == 1) {
            NavigationTabSetItem navigationTabSetItem = bundle != null ? (NavigationTabSetItem) bundle.getParcelable("key_current_tab") : null;
            intentA = f.a.a(this.f419752d, showPinMapLink.f133666d, true, null, null, null, showPinMapLink.f133665c, null, showPinMapLink.f133664b, null, null, showPinMapLink.f133668f, null, showPinMapLink.f133667e, true, navigationTabSetItem, null, null, null, null, false, null, false, false, 134158008);
        } else {
            intentA = f.a.a(this.f419752d, showPinMapLink.f133666d, false, null, null, null, showPinMapLink.f133665c, null, showPinMapLink.f133664b, null, null, showPinMapLink.f133668f, null, showPinMapLink.f133667e, false, null, null, null, null, null, false, null, false, false, 134207166);
        }
        this.f419753e.R(intentA, com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
