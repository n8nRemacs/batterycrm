package com.avito.android.messenger.conversation.mvi.menu;

import androidx.compose.runtime.internal.P;
import arrow.core.AbstractC23662a;
import com.avito.android.remote.model.messenger.Channel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelMenuInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/a;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/menu/a$a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.menu.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC32109a extends S20.a<AbstractC5655a> {

    /* compiled from: ChannelMenuInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/a$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/menu/a$a$a;", "Lcom/avito/android/messenger/conversation/mvi/menu/a$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.menu.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC5655a {

        /* compiled from: ChannelMenuInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/a$a$a;", "Lcom/avito/android/messenger/conversation/mvi/menu/a$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.menu.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5656a extends AbstractC5655a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C5656a f191420a = new C5656a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final MessengerUserHashInfo f191421b;

            static {
                MessengerUserHashInfo.f430678e.getClass();
                f191421b = MessengerUserHashInfo.f430679f;
            }

            public C5656a() {
                super(null);
            }

            @Override // com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a.AbstractC5655a
            @Y61.l
            /* renamed from: a */
            public final Channel getF191423b() {
                return null;
            }

            @Override // com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a.AbstractC5655a
            @Y61.k
            /* renamed from: b */
            public final MessengerUserHashInfo getF191422a() {
                return f191421b;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C5656a);
            }

            public final int hashCode() {
                return 971975041;
            }

            @Y61.k
            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: ChannelMenuInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/menu/a$a$b;", "Lcom/avito/android/messenger/conversation/mvi/menu/a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.menu.a$a$b */
        public static final /* data */ class b extends AbstractC5655a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final MessengerUserHashInfo f191422a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Channel f191423b;

            public b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Channel channel) {
                super(null);
                this.f191422a = messengerUserHashInfo;
                this.f191423b = channel;
            }

            @Override // com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a.AbstractC5655a
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final Channel getF191423b() {
                return this.f191423b;
            }

            @Override // com.avito.android.messenger.conversation.mvi.menu.InterfaceC32109a.AbstractC5655a
            @Y61.k
            /* renamed from: b, reason: from getter */
            public final MessengerUserHashInfo getF191422a() {
                return this.f191422a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f191422a, bVar.f191422a) && L.f(this.f191423b, bVar.f191423b);
            }

            public final int hashCode() {
                return this.f191423b.hashCode() + (this.f191422a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                return "Loaded(currentUserInfo=" + this.f191422a + ", channel=" + this.f191423b + ')';
            }
        }

        public /* synthetic */ AbstractC5655a(C42822w c42822w) {
            this();
        }

        @Y61.l
        /* renamed from: a */
        public abstract Channel getF191423b();

        @Y61.k
        /* renamed from: b */
        public abstract MessengerUserHashInfo getF191422a();

        public AbstractC5655a() {
        }
    }

    @Y61.k
    io.reactivex.rxjava3.core.z<AbstractC23662a<Throwable, G0>> D0();

    @Y61.k
    io.reactivex.rxjava3.core.z<AbstractC23662a<Throwable, G0>> D1();

    void Q2();

    void Q8();

    @Y61.k
    io.reactivex.rxjava3.core.z<AbstractC23662a<Throwable, G0>> Z();

    void i9(@Y61.k String str);

    void q1(@Y61.k String str);
}
