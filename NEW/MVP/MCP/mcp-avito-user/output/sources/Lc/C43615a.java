package lC;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.FakeDoorDialogLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.fakedoor_dialog.FakeDoorDialogFragment;
import com.avito.android.fakedoor_dialog.FakeDoorDialogParams;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FakeDoorDialogDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LlC/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/FakeDoorDialogLink;", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lC.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C43615a extends AbstractC40162b<FakeDoorDialogLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.d f413582d;

    @Inject
    public C43615a(@k a.d dVar) {
        this.f413582d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        FakeDoorDialogLink fakeDoorDialogLink = (FakeDoorDialogLink) deepLink;
        String str2 = fakeDoorDialogLink.f133324c;
        if (str2 == null) {
            str2 = "";
        }
        FakeDoorDialogParams fakeDoorDialogParams = new FakeDoorDialogParams(fakeDoorDialogLink.f133323b, str2, fakeDoorDialogLink.f133325d, fakeDoorDialogLink.f133326e);
        FakeDoorDialogFragment.f155081o0.getClass();
        FakeDoorDialogFragment fakeDoorDialogFragment = new FakeDoorDialogFragment();
        fakeDoorDialogFragment.f155083h0.setValue(fakeDoorDialogFragment, FakeDoorDialogFragment.f155082p0[0], fakeDoorDialogParams);
        this.f413582d.w1(fakeDoorDialogFragment, "fakedoor_dialog_handler");
        return AbstractC14250d.c.f9171c;
    }
}
