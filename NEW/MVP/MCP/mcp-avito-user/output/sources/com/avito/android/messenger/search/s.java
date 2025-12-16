package com.avito.android.messenger.search;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.search.B;
import com.avito.android.messenger.search.adapter.channel.b;
import com.avito.android.messenger.search.adapter.supportchannel.b;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsSearchPresenter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/search/s;", "LS20/a;", "Lcom/avito/android/messenger/search/B$b;", "Lcom/avito/android/messenger/search/adapter/channel/b$a;", "Lcom/avito/android/messenger/search/adapter/supportchannel/b$a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface s extends S20.a<B.b>, b.a, b.a {

    /* compiled from: ChannelsSearchPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/s$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f197177a;

        /* renamed from: b, reason: collision with root package name */
        public final int f197178b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f197179c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f197180d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f197181e;

        public a(@Y61.k String str, int i12, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4) {
            this.f197177a = str;
            this.f197178b = i12;
            this.f197179c = str2;
            this.f197180d = str3;
            this.f197181e = str4;
        }
    }

    /* compiled from: ChannelsSearchPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    void J();

    void X();

    @Y61.k
    com.avito.android.util.architecture_components.D d5();

    void je(@Y61.k String str, boolean z12);

    void p(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    com.avito.android.util.architecture_components.D rb();
}
