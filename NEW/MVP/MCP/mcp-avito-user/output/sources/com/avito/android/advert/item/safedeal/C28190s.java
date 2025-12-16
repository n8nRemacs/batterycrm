package com.avito.android.advert.item.safedeal;

import com.avito.android.advert_core.contactbar.SourceScreen;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.advert_details.ContactBarData;
import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: AdvertSafeDealPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LH6/c;", "result", "Lkotlin/G0;", "accept", "(LH6/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.safedeal.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28190s<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28180h f79003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdvertDetails f79004c;

    public C28190s(C28180h c28180h, AdvertDetails advertDetails) {
        this.f79003b = c28180h;
        this.f79004c = advertDetails;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        H6.c cVar = (H6.c) obj;
        boolean z12 = cVar instanceof H6.b;
        C28180h c28180h = this.f79003b;
        if (!z12) {
            if (cVar instanceof H6.a) {
                AdvertDetails advertDetails = c28180h.f78814C;
                if (advertDetails != null) {
                    c28180h.f78822c.x0(advertDetails);
                }
                c28180h.f78830k.b();
                return;
            }
            return;
        }
        c28180h.getClass();
        AdvertDetails advertDetails2 = this.f79004c;
        ContactBarData contactBarDataC = V9.a.c(advertDetails2, "d", false, false, false, false, false, 254);
        if (contactBarDataC != null) {
            c28180h.f78822c.G1(contactBarDataC, false, SourceScreen.f83145c, null, "delivery_checkout");
        }
        c28180h.f78827h.mb(new CreateChannelLink(advertDetails2.getId(), null, null, null, false, false, null, WebSocketProtocol.PAYLOAD_SHORT, null));
    }
}
