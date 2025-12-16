package com.avito.android.messenger.channels.adapter.konveyor.notifications_banner;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChannelsNotificationsBannerView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/notifications_banner/j;", "Lcom/avito/android/messenger/channels/adapter/konveyor/notifications_banner/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f186995c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Banner f186996b;

    public j(@Y61.k View view) {
        super(view);
        this.f186996b = (Banner) view.findViewById(R.id.banner_auto_replies_block);
    }

    @Override // com.avito.android.messenger.channels.adapter.konveyor.notifications_banner.i
    public final void YH(@Y61.k ChannelsListItem.a aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
        ViewGroup container;
        Banner banner = this.f186996b;
        if (banner == null || (container = banner.getContainer()) == null) {
            return;
        }
        ((TextView) container.findViewById(R.id.banner_auto_replies_message)).setText(container.getContext().getString(aVar.f186782d));
        Button button = (Button) container.findViewById(R.id.banner_auto_replies_btn);
        button.setText(aVar.f186784f);
        button.setOnClickListener(new com.avito.android.lib.design.list_item.a(25, aVar2));
        ((TextView) container.findViewById(R.id.banner_auto_replies_title)).setText(container.getContext().getString(aVar.f186783e));
        ImageView imageView = (ImageView) container.findViewById(R.id.banner_auto_replies_close);
        if (imageView != null) {
            imageView.setOnClickListener(new com.avito.android.lib.design.list_item.a(26, aVar3));
        }
    }
}
