package com.avito.android.advert.item.video_call_request;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.InterfaceC28153o;
import com.avito.android.advert.item.video_call_request.AdvertVideoCallRequestItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AdvertVideoCallRequestItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/video_call_request/d;", "Lcom/avito/android/advert/item/video_call_request/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final OL.a f80691b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28153o f80692c;

    /* compiled from: AdvertVideoCallRequestItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[AdvertVideoCallRequestItem.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AdvertVideoCallRequestItem.Type type = AdvertVideoCallRequestItem.Type.f80683b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public d(@k OL.a aVar, @k InterfaceC28153o interfaceC28153o) {
        this.f80691b = aVar;
        this.f80692c = interfaceC28153o;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        int i13;
        g gVar = (g) eVar;
        AdvertVideoCallRequestItem advertVideoCallRequestItem = (AdvertVideoCallRequestItem) aVar;
        if (this.f80691b.f()) {
            gVar.UQ();
        }
        int iOrdinal = advertVideoCallRequestItem.f80680f.ordinal();
        if (iOrdinal == 0) {
            i13 = R.string.advert_details_advert_video_call_request_action;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = R.string.advert_details_advert_video_call_request_chat;
        }
        gVar.XU(i13, new e(this, advertVideoCallRequestItem), advertVideoCallRequestItem.f80681g, advertVideoCallRequestItem.f80682h);
    }
}
