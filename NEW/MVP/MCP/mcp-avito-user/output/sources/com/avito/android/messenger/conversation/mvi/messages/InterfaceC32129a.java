package com.avito.android.messenger.conversation.mvi.messages;

import com.akita.compose.theme.re23.style.C0;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageListInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/a;", "LS20/a;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "b", "c", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.conversation.mvi.messages.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC32129a extends S20.a<c> {

    /* compiled from: MessageListInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.a$a, reason: collision with other inner class name */
    public static final class C5676a {
    }

    /* compiled from: MessageListInteractor.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "", "a", "b", "c", "d", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c$b;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c$c;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.a$c */
    public interface c {

        /* compiled from: MessageListInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/a$c$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.a$c$a, reason: collision with other inner class name */
        public static final /* data */ class C5679a implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C5679a f192125a = new C5679a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C5679a);
            }

            public final int hashCode() {
                return -526638927;
            }

            @Y61.k
            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: MessageListInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/a$c$b;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.a$c$b */
        public static final /* data */ class b implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f192126a = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -412897985;
            }

            @Y61.k
            public final String toString() {
                return "FirstPageLoadError";
            }
        }

        /* compiled from: MessageListInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/a$c$c;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.a$c$c, reason: collision with other inner class name */
        public static final /* data */ class C5680c implements c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final io.reactivex.rxjava3.core.z<List<kotlin.Q<LocalMessage, Q1>>> f192127a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final b f192128b;

            /* renamed from: c, reason: collision with root package name */
            public final int f192129c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f192130d;

            public C5680c(@Y61.k io.reactivex.rxjava3.core.z<List<kotlin.Q<LocalMessage, Q1>>> zVar, @Y61.k b bVar, int i12, boolean z12) {
                this.f192127a = zVar;
                this.f192128b = bVar;
                this.f192129c = i12;
                this.f192130d = z12;
            }

            public static C5680c a(C5680c c5680c, io.reactivex.rxjava3.core.z zVar, b bVar, int i12, int i13) {
                if ((i13 & 1) != 0) {
                    zVar = c5680c.f192127a;
                }
                if ((i13 & 4) != 0) {
                    i12 = c5680c.f192129c;
                }
                boolean z12 = (i13 & 8) != 0 ? c5680c.f192130d : false;
                c5680c.getClass();
                return new C5680c(zVar, bVar, i12, z12);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5680c)) {
                    return false;
                }
                C5680c c5680c = (C5680c) obj;
                return kotlin.jvm.internal.L.f(this.f192127a, c5680c.f192127a) && kotlin.jvm.internal.L.f(this.f192128b, c5680c.f192128b) && this.f192129c == c5680c.f192129c && this.f192130d == c5680c.f192130d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f192130d) + androidx.appcompat.app.r.e(this.f192129c, (this.f192128b.hashCode() + (this.f192127a.hashCode() * 31)) * 31, 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("FirstPageLoaded(messagesObservable=");
                sb2.append(this.f192127a);
                sb2.append(", paginationState=");
                sb2.append(this.f192128b);
                sb2.append(", requestedMessageCount=");
                sb2.append(this.f192129c);
                sb2.append(", firstPageSyncFailed=");
                return androidx.appcompat.app.r.x(sb2, this.f192130d, ')');
            }
        }

        /* compiled from: MessageListInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/a$c$d;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.a$c$d */
        public static final /* data */ class d implements c {

            /* renamed from: a, reason: collision with root package name */
            public final long f192131a;

            public d(long j12) {
                this.f192131a = j12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f192131a == ((d) obj).f192131a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f192131a);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.u(new StringBuilder("FirstPageLoadingInProgress(loadingId="), this.f192131a, ')');
            }
        }
    }

    @Y61.k
    com.jakewharton.rxrelay3.c B2();

    void L4(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.l Integer num);

    void o9(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.l Integer num);

    void pc(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l Integer num);

    /* compiled from: MessageListInteractor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/a$b;", "", "a", "b", "c", "Lcom/avito/android/messenger/conversation/mvi/messages/a$b$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$b$b;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$b$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.messages.a$b */
    public interface b {

        /* compiled from: MessageListInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/a$b$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C5677a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Boolean f192121a;

            public C5677a() {
                this(null, 1, null);
            }

            @Override // com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a.b
            @Y61.l
            /* renamed from: a, reason: from getter */
            public final Boolean getF192124b() {
                return this.f192121a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5677a) && kotlin.jvm.internal.L.f(this.f192121a, ((C5677a) obj).f192121a);
            }

            public final int hashCode() {
                Boolean bool = this.f192121a;
                if (bool == null) {
                    return 0;
                }
                return bool.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C0.g(new StringBuilder("Error(quotedMessageFound="), this.f192121a, ')');
            }

            public C5677a(Boolean bool, int i12, C42822w c42822w) {
                this.f192121a = (i12 & 1) != 0 ? null : bool;
            }
        }

        /* compiled from: MessageListInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/a$b$b;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5678b implements b {

            /* renamed from: a, reason: collision with root package name */
            public final long f192122a;

            public C5678b(long j12) {
                this.f192122a = j12;
            }

            @Override // com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a.b
            @Y61.l
            /* renamed from: a */
            public final Boolean getF192124b() {
                return null;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5678b) && this.f192122a == ((C5678b) obj).f192122a;
            }

            public final int hashCode() {
                return Long.hashCode(this.f192122a);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.u(new StringBuilder("InProgress(loadingId="), this.f192122a, ')');
            }
        }

        @Y61.l
        /* renamed from: a */
        Boolean getF192124b();

        /* compiled from: MessageListInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/a$b$c;", "Lcom/avito/android/messenger/conversation/mvi/messages/a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.a$b$c */
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f192123a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Boolean f192124b;

            public c(boolean z12, @Y61.l Boolean bool) {
                this.f192123a = z12;
                this.f192124b = bool;
            }

            @Override // com.avito.android.messenger.conversation.mvi.messages.InterfaceC32129a.b
            @Y61.l
            /* renamed from: a, reason: from getter */
            public final Boolean getF192124b() {
                return this.f192124b;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f192123a == cVar.f192123a && kotlin.jvm.internal.L.f(this.f192124b, cVar.f192124b);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.f192123a) * 31;
                Boolean bool = this.f192124b;
                return iHashCode + (bool == null ? 0 : bool.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Success(hasMorePages=");
                sb2.append(this.f192123a);
                sb2.append(", quotedMessageFound=");
                return C0.g(sb2, this.f192124b, ')');
            }

            public /* synthetic */ c(boolean z12, Boolean bool, int i12, C42822w c42822w) {
                this(z12, (i12 & 2) != 0 ? null : bool);
            }
        }
    }
}
