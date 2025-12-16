package com.avito.android.messenger.conversation.mvi.multi_message;

import F20.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.messenger.conversation.mvi.multi_message.composable.i;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MultiMessageBannerStateMapper.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/multi_message/b;", "Lcom/avito/android/messenger/conversation/mvi/multi_message/a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.messenger.conversation.mvi.multi_message.a
    @Y61.k
    public final com.avito.android.messenger.conversation.mvi.multi_message.composable.i a(@Y61.k F20.a aVar) {
        DeepLink deepLink = aVar.f4490f;
        boolean z12 = (deepLink == null || (deepLink instanceof NoMatchLink)) ? false : true;
        a.C0272a c0272a = aVar.f4489e;
        return new com.avito.android.messenger.conversation.mvi.multi_message.composable.i(aVar.f4485a, aVar.f4486b, aVar.f4487c, aVar.f4488d, z12, new i.a(c0272a.f4491a, c0272a.f4493c));
    }
}
