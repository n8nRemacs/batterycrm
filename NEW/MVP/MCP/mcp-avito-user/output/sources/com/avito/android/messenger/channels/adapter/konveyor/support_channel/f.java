package com.avito.android.messenger.channels.adapter.konveyor.support_channel;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SupportChannelItemView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/support_channel/f;", "LTV0/e;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface f extends TV0.e {

    /* compiled from: SupportChannelItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: SupportChannelItemView.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/support_channel/f$b;", "Lcom/avito/android/messenger/channels/adapter/konveyor/support_channel/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.konveyor.adapter.b implements f {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.messenger.widget.chat_list_element.e f187050b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Y41.a<G0> f187051c;

        public b(@k View view) {
            super(view);
            this.f187050b = new com.avito.android.messenger.widget.chat_list_element.e(view);
        }

        @Override // com.avito.android.messenger.channels.adapter.konveyor.support_channel.f
        public final void CT(@k ChannelsListItem.g gVar) {
            boolean z12 = gVar.f186828e;
            com.avito.android.messenger.widget.chat_list_element.e eVar = this.f187050b;
            eVar.a(z12);
            eVar.f197510b.setText(gVar.f186829f);
            Image image = gVar.f186830g;
            if (image != null) {
                com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(image);
                D6.H(eVar.f197512d);
                C35949t5.c(eVar.f197512d, aVarB, null, null, null, 14);
            }
            eVar.f197509a.setOnClickListener(new com.avito.android.messenger.widget.chat_list_element.a(1, this.f187051c));
        }

        @Override // com.avito.android.messenger.channels.adapter.konveyor.support_channel.f
        public final void c(@l Y41.a<G0> aVar) {
            this.f187051c = aVar;
        }
    }

    void CT(@k ChannelsListItem.g gVar);

    void c(@l Y41.a<G0> aVar);
}
