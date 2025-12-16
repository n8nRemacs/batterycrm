package com.avito.android.installments.fakedoor.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InstallmentsFakeDoorLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InstallmentsFakedoorDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/installments/fakedoor/deeplink/c;", "Lev/b;", "Lcom/avito/android/deep_linking/links/InstallmentsFakeDoorLink;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends AbstractC40162b<InstallmentsFakeDoorLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.d f172511d;

    @Inject
    public c(@k a.d dVar) {
        this.f172511d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f172511d.D0("installments_fakedoor_dialog", new b(this, (InstallmentsFakeDoorLink) deepLink));
        return AbstractC14250d.c.f9171c;
    }
}
