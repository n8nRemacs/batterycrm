package com.avito.android;

import android.content.Context;
import android.content.Intent;
import androidx.work.C23544h;
import androidx.work.J;
import androidx.work.WorkManager;
import androidx.work.impl.utils.C23593c;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncOnPushWorker;
import com.avito.android.messenger.service.direct_reply.DirectReplyIntentService;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.remote.notification.NotificationIdentifier;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MessengerServiceIntentFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/k1;", "Lcom/avito/android/j1;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.k1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C31095k1 implements InterfaceC31091j1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PhotoPickerIntentFactory f174736a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f174737b;

    @Inject
    public C31095k1(@Y61.k Context context, @Y61.k PhotoPickerIntentFactory photoPickerIntentFactory) {
        this.f174736a = photoPickerIntentFactory;
        this.f174737b = context.getApplicationContext();
    }

    @Override // com.avito.android.InterfaceC31091j1
    @Y61.k
    public final Intent a(@Y61.k String str, @Y61.l String str2) {
        return this.f174736a.b(this.f174737b, str, str2, false);
    }

    @Override // com.avito.android.InterfaceC31091j1
    @Y61.k
    public final Intent b(int i12, @Y61.k String str, @Y61.l String str2) {
        return new Intent(this.f174737b, (Class<?>) DirectReplyIntentService.class).putExtra("channel_id", str).putExtra("direct_reply_key", "direct_reply").putExtra("notification_id", new NotificationIdentifier(str2, i12));
    }

    @Override // com.avito.android.InterfaceC31091j1
    public final void c(@Y61.k String str) {
        ChannelSyncOnPushWorker.f188324b.getClass();
        String strConcat = "ChannelSyncOnPushWorker".concat(str);
        J.a aVar = new J.a(ChannelSyncOnPushWorker.class);
        C23544h.a aVar2 = new C23544h.a();
        aVar2.f55511a.put("channelId", str);
        androidx.work.J jB2 = aVar.h(aVar2.a()).a(strConcat).b();
        WorkManager.f55428a.getClass();
        androidx.work.impl.Y yF2 = androidx.work.impl.Y.f(this.f174737b);
        C23593c.e(yF2, strConcat);
        yF2.e(Collections.singletonList(jB2));
    }

    @Override // com.avito.android.InterfaceC31091j1
    @Y61.k
    public final Intent d(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        return new Intent(this.f174737b, (Class<?>) DirectReplyIntentService.class).putExtra("channel_id", str).putExtra("text", str2).putExtra("is_retry", true).putExtra("random_id", str3);
    }
}
