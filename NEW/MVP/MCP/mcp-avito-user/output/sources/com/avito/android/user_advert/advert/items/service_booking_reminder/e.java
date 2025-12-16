package com.avito.android.user_advert.advert.items.service_booking_reminder;

import android.net.Uri;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingReminderItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ContextActionHandler.Link.URL, "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f310162l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f310163m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, c cVar) {
        super(1);
        this.f310162l = hVar;
        this.f310163m = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        h hVar = this.f310162l;
        MyAdvertDetailsActivity myAdvertDetailsActivity = hVar.f310169c;
        if (myAdvertDetailsActivity != null && str2 != null) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = myAdvertDetailsActivity.f308324p;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, new WebViewLink.OnlyAvitoDomain(Uri.parse(str2), null, null, 6, null), null, null, 6);
        }
        MyAdvertDetails.SbStatusBlock.Event event = this.f310163m.f310156i;
        if (event != null) {
            hVar.f310168b.a(event);
        }
        return G0.f406611a;
    }
}
