package Uv0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.shift_list.ShiftListDeeplink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ShiftListDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LUv0/a;", "Lev/b;", "Lcom/avito/android/shift_list/ShiftListDeeplink;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Uv0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15573a extends AbstractC40162b<ShiftListDeeplink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f16776d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.shift_list.ui.b f16777e;

    @Inject
    public C15573a(@k a.InterfaceC4053a interfaceC4053a, @k com.avito.android.shift_list.ui.b bVar) {
        this.f16776d = interfaceC4053a;
        this.f16777e = bVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f16776d.R(this.f16777e.a(), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
