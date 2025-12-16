package com.avito.android.messenger.channels.adapter.konveyor.notifications_banner;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Collections;
import jr.C42417b;
import jr.InterfaceC42416a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChannelsNotificationsBannerView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/notifications_banner/x;", "Lcom/avito/android/messenger/channels/adapter/konveyor/notifications_banner/w;", "Lcom/avito/konveyor/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class x extends com.avito.konveyor.adapter.b implements w {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C42417b f187032b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Resources f187033c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Context f187034d;

    public x(@Y61.k View view) {
        super(view);
        InterfaceC42416a.f405826r2.getClass();
        this.f187032b = new C42417b(view);
        this.f187033c = view.getResources();
        this.f187034d = view.getContext();
    }

    @Override // com.avito.android.messenger.channels.adapter.konveyor.notifications_banner.w
    public final void uq(@Y61.k ChannelsListItem.e eVar, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2) throws Resources.NotFoundException {
        int i12 = eVar.f186818d;
        Resources resources = this.f187033c;
        String string = resources.getString(i12);
        C42417b c42417b = this.f187032b;
        c42417b.P2(string);
        int iJ2 = C35835l0.j(eVar.f186820f, this.f187034d);
        SimpleDraweeView simpleDraweeView = c42417b.f405830b;
        if (iJ2 != 0) {
            D6.H(simpleDraweeView);
            simpleDraweeView.setImageResource(iJ2);
        } else {
            D6.w(simpleDraweeView);
        }
        c42417b.setCloseButtonVisible(true);
        c42417b.h2(Collections.singletonList(new InterfaceC42416a.C11584a(resources.getString(eVar.f186819e), aVar)));
        c42417b.B7(aVar2);
    }
}
