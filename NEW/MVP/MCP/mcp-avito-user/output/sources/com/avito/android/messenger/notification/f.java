package com.avito.android.messenger.notification;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.ChannelDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.notification.PushParameters;
import j.l0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VisibleChannelIdHolder.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/notification/f;", "Lcom/avito/android/messenger/notification/e;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public volatile String f196926a;

    @Inject
    public f() {
    }

    @Override // com.avito.android.messenger.notification.e
    public final void a(@l String str) {
        this.f196926a = str;
    }

    @Override // com.avito.android.remote.notification.z
    @l0
    public final boolean b(@k PushParameters pushParameters) {
        DeepLink deepLink = pushParameters.f253975b;
        if (deepLink instanceof ChannelDetailsLink) {
            return L.f(((ChannelDetailsLink) deepLink).f133098b, this.f196926a);
        }
        return false;
    }
}
