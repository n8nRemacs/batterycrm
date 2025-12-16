package com.avito.android.messenger.conversation.mvi.messages;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.messenger.conversation.T1;
import com.yandex.div2.D8;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: MessageListView.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0;", "Lcom/avito/android/arch/mvi/utils/u;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$c;", "Lcom/avito/android/messenger/conversation/mvi/messages/h0;", "a", "b", "c", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface g0 extends com.avito.android.arch.mvi.utils.u<c, h0> {

    /* compiled from: MessageListView.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0$a;", "", "a", "b", "c", "d", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$b;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$c;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<T1> f192956a;

        /* compiled from: MessageListView.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$a;", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$a$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.g0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC5703a extends a {

            /* compiled from: MessageListView.kt */
            @androidx.compose.runtime.internal.P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$a$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.mvi.messages.g0$a$a$a, reason: collision with other inner class name */
            public static final class C5704a extends AbstractC5703a {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public static final C5704a f192957b = new C5704a();

                public C5704a() {
                    super(null);
                }

                @Y61.k
                public final String toString() {
                    return "ListState.Empty.NoReplyTime";
                }
            }

            /* compiled from: MessageListView.kt */
            @androidx.compose.runtime.internal.P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$a$b;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.mvi.messages.g0$a$a$b */
            public static final /* data */ class b extends AbstractC5703a {

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final NY.c f192958b;

                public b(@Y61.k NY.c cVar) {
                    super(null);
                    this.f192958b = cVar;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f192958b, ((b) obj).f192958b);
                }

                public final int hashCode() {
                    return this.f192958b.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return "ListState.Empty.WithReplyTime(replyTime = " + this.f192958b + ')';
                }
            }

            public /* synthetic */ AbstractC5703a(C42822w c42822w) {
                this();
            }

            public AbstractC5703a() {
                super(C42784z0.f406748b, null);
            }
        }

        /* compiled from: MessageListView.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$b;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f192959b = new b();

            public b() {
                super(C42784z0.f406748b, null);
            }

            @Y61.k
            public final String toString() {
                return "ListState.Error";
            }
        }

        /* compiled from: MessageListView.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$c;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final InterfaceC5705a f192960b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f192961c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final InterfaceC5705a.b f192962d;

            /* compiled from: MessageListView.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$c$a;", "", "a", "b", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$c$a$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$c$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.conversation.mvi.messages.g0$a$c$a, reason: collision with other inner class name */
            public interface InterfaceC5705a {

                /* compiled from: MessageListView.kt */
                @androidx.compose.runtime.internal.P
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$c$a$a;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$c$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.messenger.conversation.mvi.messages.g0$a$c$a$a, reason: collision with other inner class name */
                public static final /* data */ class C5706a implements InterfaceC5705a {

                    /* renamed from: a, reason: collision with root package name */
                    public final int f192963a;

                    public C5706a(int i12) {
                        this.f192963a = i12;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C5706a) && this.f192963a == ((C5706a) obj).f192963a;
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.messages.g0.a.c.InterfaceC5705a
                    /* renamed from: getPosition, reason: from getter */
                    public final int getF192964a() {
                        return this.f192963a;
                    }

                    public final int hashCode() {
                        return Integer.hashCode(this.f192963a);
                    }

                    @Y61.k
                    public final String toString() {
                        return androidx.appcompat.app.r.t(new StringBuilder("JumpTo(position="), this.f192963a, ')');
                    }
                }

                /* compiled from: MessageListView.kt */
                @androidx.compose.runtime.internal.P
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$c$a$b;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$c$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.messenger.conversation.mvi.messages.g0$a$c$a$b */
                public static final /* data */ class b implements InterfaceC5705a {

                    /* renamed from: a, reason: collision with root package name */
                    public final int f192964a;

                    /* renamed from: b, reason: collision with root package name */
                    @Y61.k
                    public final String f192965b;

                    public b(int i12, @Y61.k String str) {
                        this.f192964a = i12;
                        this.f192965b = str;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof b)) {
                            return false;
                        }
                        b bVar = (b) obj;
                        return this.f192964a == bVar.f192964a && kotlin.jvm.internal.L.f(this.f192965b, bVar.f192965b);
                    }

                    @Override // com.avito.android.messenger.conversation.mvi.messages.g0.a.c.InterfaceC5705a
                    /* renamed from: getPosition, reason: from getter */
                    public final int getF192964a() {
                        return this.f192964a;
                    }

                    public final int hashCode() {
                        return this.f192965b.hashCode() + (Integer.hashCode(this.f192964a) * 31);
                    }

                    @Y61.k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("JumpToAndHighlight(position=");
                        sb2.append(this.f192964a);
                        sb2.append(", itemIdToHighlight=");
                        return C22026a.c(sb2, this.f192965b, ')');
                    }
                }

                /* renamed from: getPosition */
                int getF192964a();
            }

            public c(@Y61.k List list, @Y61.l InterfaceC5705a interfaceC5705a, boolean z12, @Y61.l InterfaceC5705a.b bVar) {
                super(list, null);
                this.f192960b = interfaceC5705a;
                this.f192961c = z12;
                this.f192962d = bVar;
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ListState.Loaded(items=(");
                D8.r(this.f192956a, sb2, ")[...], initialScrollInfo=");
                sb2.append(this.f192960b);
                sb2.append(", userInteractedWithList=");
                sb2.append(this.f192961c);
                sb2.append(", quotedMessageScrollInfo=");
                sb2.append(this.f192962d);
                return sb2.toString();
            }
        }

        /* compiled from: MessageListView.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0$a$d;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final d f192966b = new d();

            public d() {
                super(C42784z0.f406748b, null);
            }

            @Y61.k
            public final String toString() {
                return "ListState.LoadingInProgress";
            }
        }

        public a() {
            throw null;
        }

        public a(List list, C42822w c42822w) {
            this.f192956a = list;
        }
    }

    /* compiled from: MessageListView.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0$b;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @F3
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC22204y1 f192967a;

        /* compiled from: MessageListView.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0$b$a;", "", "<init>", "()V", "", "DEFAULT_EXTRA_PADDING_BOTTOM_PX", "I", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }

        public b() {
            this(0, 1, null);
        }

        public b(int i12) {
            this.f192967a = C22126m3.g(Integer.valueOf(i12));
        }

        public /* synthetic */ b(int i12, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? 0 : i12);
        }
    }

    /* compiled from: MessageListView.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0$c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends com.avito.android.analytics.screens.mvi.q {

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public static final a f192968d = new a(null);

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final c f192969e = new c(a.d.f192966b, false);

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final a f192970b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f192971c;

        /* compiled from: MessageListView.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0$c$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public c(@Y61.k a aVar, boolean z12) {
            this.f192970b = aVar;
            this.f192971c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.L.f(this.f192970b, cVar.f192970b) && this.f192971c == cVar.f192971c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f192971c) + (this.f192970b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State(listState=");
            sb2.append(this.f192970b);
            sb2.append(", paginationIsEnabled=");
            return androidx.appcompat.app.r.x(sb2, this.f192971c, ')');
        }
    }

    boolean a(int i12);
}
