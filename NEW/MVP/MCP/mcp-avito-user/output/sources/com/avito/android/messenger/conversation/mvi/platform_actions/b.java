package com.avito.android.messenger.conversation.mvi.platform_actions;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32232q;
import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.RawJsonKt;
import com.avito.android.remote.model.messenger.context_actions.RecommendationsResponse;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: PlatformActionsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/platform_actions/b;", "Lcom/avito/android/messenger/conversation/mvi/platform_actions/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements InterfaceC32187a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f193824a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ChannelSyncAgent f193825b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32232q f193826c;

    /* compiled from: PlatformActionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "apply", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f193827b = new a<>();

        @Override // l41.o
        public final /* bridge */ /* synthetic */ Object apply(Object obj) {
            ((Boolean) obj).booleanValue();
            return G0.f406611a;
        }
    }

    @Inject
    public b(@Y61.k InterfaceC47842z interfaceC47842z, @Y61.k ChannelSyncAgent channelSyncAgent, @Y61.k InterfaceC32232q interfaceC32232q, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f193824a = interfaceC47842z;
        this.f193825b = channelSyncAgent;
        this.f193826c = interfaceC32232q;
        interfaceC47842z.A().y(500L, TimeUnit.MILLISECONDS, interfaceC35745a5.c()).d0(a.f193827b);
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.InterfaceC32187a
    @Y61.k
    public final I<RawJson> a(@Y61.k String str, @Y61.l RawJson rawJson) {
        return this.f193824a.callMethod(str, RawJsonKt.orEmpty(rawJson));
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.InterfaceC32187a
    @Y61.k
    public final I<RecommendationsResponse> b(@Y61.k String str, @Y61.l RawJson rawJson) {
        return this.f193824a.getRecommendations(str, RawJsonKt.orEmpty(rawJson));
    }

    @Override // com.avito.android.messenger.conversation.mvi.platform_actions.InterfaceC32187a
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.A c(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo) {
        return (io.reactivex.rxjava3.internal.operators.single.A) this.f193826c.f(str2, messengerUserHashInfo).o(new c(this, messengerUserHashInfo, str));
    }
}
