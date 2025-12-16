package com.avito.android.messenger.conversation.mvi.sync;

import androidx.compose.runtime.C22026a;
import com.avito.android.util.X2;
import com.yandex.div2.D8;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "messages", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class Z<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f194740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194741c;

    public Z(String str, MessengerUserHashInfo messengerUserHashInfo) {
        this.f194740b = str;
        this.f194741c = messengerUserHashInfo;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        X2 x22 = X2.f318778a;
        StringBuilder sb2 = new StringBuilder("Loaded ");
        D8.r((List) obj, sb2, " messages (");
        sb2.append(this.f194740b);
        sb2.append(", ");
        x22.i("MessageSyncAgent", C22026a.c(sb2, com.avito.android.messenger.util.i.b(this.f194741c, new kotlin.Q[0]), ')'), null);
    }
}
