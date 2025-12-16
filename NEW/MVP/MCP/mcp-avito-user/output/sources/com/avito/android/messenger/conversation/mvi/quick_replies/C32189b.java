package com.avito.android.messenger.conversation.mvi.quick_replies;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.quick_replies.QuickRepliesResponse;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: QuickRepliesInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/quick_replies/b;", "Lcom/avito/android/messenger/conversation/mvi/quick_replies/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.quick_replies.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32189b implements InterfaceC32188a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f194090a;

    @Inject
    public C32189b(@Y61.k InterfaceC47842z interfaceC47842z) {
        this.f194090a = interfaceC47842z;
    }

    @Override // com.avito.android.messenger.conversation.mvi.quick_replies.InterfaceC32188a
    @Y61.k
    public final I a(@Y61.k String str) {
        return this.f194090a.a(str);
    }

    @Override // com.avito.android.messenger.conversation.mvi.quick_replies.InterfaceC32188a
    @Y61.k
    public final I<G0> deleteQuickReply(@Y61.k String str) {
        return this.f194090a.deleteQuickReply(str);
    }

    @Override // com.avito.android.messenger.conversation.mvi.quick_replies.InterfaceC32188a
    @Y61.k
    public final I<QuickRepliesResponse> getQuickReplies() {
        return this.f194090a.getQuickReplies();
    }
}
