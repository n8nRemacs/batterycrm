package CY;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.analytics.graphite_counter.ChatListRefreshResult;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ChatListRefreshTimer.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LCY/g;", "Lcom/avito/android/analytics/timer/a;", "Lcom/avito/android/messenger/analytics/graphite_counter/ChatListRefreshResult;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements com.avito.android.analytics.timer.a<ChatListRefreshResult> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i<ChatListRefreshResult> f2238a;

    public g(@Y61.k com.avito.android.server_time.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f2238a = new i<>(aVar, interfaceC28373a, P0.g(new Q(ChatListRefreshResult.f186279b, "chat-list-refresh.success"), new Q(ChatListRefreshResult.f186280c, "chat-list-refresh.error")));
    }

    @Override // com.avito.android.analytics.timer.a
    public final void a() {
        this.f2238a.a();
    }

    @Override // com.avito.android.analytics.timer.a
    public final void b(ChatListRefreshResult chatListRefreshResult) {
        this.f2238a.b(chatListRefreshResult);
    }
}
