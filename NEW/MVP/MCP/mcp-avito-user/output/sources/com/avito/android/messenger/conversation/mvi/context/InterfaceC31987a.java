package com.avito.android.messenger.conversation.mvi.context;

import com.avito.android.mvi.b;
import com.avito.android.remote.model.messenger.Channel;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelContextInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "Lcom/avito/android/messenger/conversation/mvi/context/g0;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.context.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC31987a extends S20.a<C5631a>, g0 {

    /* compiled from: ChannelContextInteractor.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.context.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5631a {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final C5632a f190234e = new C5632a(null);

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final C5631a f190235f;

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final MessengerUserHashInfo f190236a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.mvi.b<Channel> f190237b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Set<String> f190238c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f190239d;

        /* compiled from: ChannelContextInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.context.a$a$a, reason: collision with other inner class name */
        public static final class C5632a {
            public /* synthetic */ C5632a(C42822w c42822w) {
                this();
            }

            public C5632a() {
            }
        }

        static {
            b.a aVar = new b.a();
            MessengerUserHashInfo.f430678e.getClass();
            f190235f = new C5631a(MessengerUserHashInfo.f430679f, aVar, B0.f406639b, false);
        }

        public C5631a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k com.avito.android.mvi.b<Channel> bVar, @Y61.k Set<String> set, boolean z12) {
            this.f190236a = messengerUserHashInfo;
            this.f190237b = bVar;
            this.f190238c = set;
            this.f190239d = z12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static C5631a a(C5631a c5631a, MessengerUserHashInfo messengerUserHashInfo, com.avito.android.mvi.b bVar, LinkedHashSet linkedHashSet, boolean z12, int i12) {
            if ((i12 & 1) != 0) {
                messengerUserHashInfo = c5631a.f190236a;
            }
            if ((i12 & 2) != 0) {
                bVar = c5631a.f190237b;
            }
            Set set = linkedHashSet;
            if ((i12 & 4) != 0) {
                set = c5631a.f190238c;
            }
            if ((i12 & 8) != 0) {
                z12 = c5631a.f190239d;
            }
            c5631a.getClass();
            return new C5631a(messengerUserHashInfo, bVar, set, z12);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5631a)) {
                return false;
            }
            C5631a c5631a = (C5631a) obj;
            return kotlin.jvm.internal.L.f(this.f190236a, c5631a.f190236a) && kotlin.jvm.internal.L.f(this.f190237b, c5631a.f190237b) && kotlin.jvm.internal.L.f(this.f190238c, c5631a.f190238c) && this.f190239d == c5631a.f190239d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f190239d) + androidx.media3.exoplayer.analytics.m.g(this.f190238c, (this.f190237b.hashCode() + (this.f190236a.hashCode() * 31)) * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State(currentUserInfo=");
            sb2.append(this.f190236a);
            sb2.append(", channelState=");
            sb2.append(this.f190237b);
            sb2.append(", typingUserIds=");
            sb2.append(this.f190238c);
            sb2.append(", isConnecting=");
            return androidx.appcompat.app.r.x(sb2, this.f190239d, ')');
        }
    }

    void Hd(boolean z12);

    @Y61.k
    io.reactivex.rxjava3.core.z<G0> I1();
}
