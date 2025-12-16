package NY;

import NY.d;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.yandex.div2.D8;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageListPartialState.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LNY/f;", "", "<init>", "()V", "a", "b", "c", "LNY/f$a;", "LNY/f$b;", "LNY/f$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class f {

    /* compiled from: MessageListPartialState.kt */
    @P
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LNY/f$a;", "LNY/f;", "<init>", "()V", "a", "b", "c", "d", "LNY/f$a$a;", "LNY/f$a$b;", "LNY/f$a$c;", "LNY/f$a$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a extends f {

        /* compiled from: MessageListPartialState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNY/f$a$a;", "LNY/f$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: NY.f$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0737a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C0737a f11547a = new C0737a();

            public C0737a() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C0737a);
            }

            public final int hashCode() {
                return 1132595649;
            }

            @Y61.k
            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: MessageListPartialState.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LNY/f$a$b;", "LNY/f$a;", "LNY/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a implements NY.b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final MessengerUserHashInfo f11548a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final ChannelContext f11549b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final List<User> f11550c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final NY.c f11551d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final MY.c f11552e;

            public b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k ChannelContext channelContext, @Y61.k List<User> list, @Y61.l NY.c cVar, @Y61.k MY.c cVar2) {
                super(null);
                this.f11548a = messengerUserHashInfo;
                this.f11549b = channelContext;
                this.f11550c = list;
                this.f11551d = cVar;
                this.f11552e = cVar2;
            }

            @Override // NY.b
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final MessengerUserHashInfo getF11554a() {
                return this.f11548a;
            }

            @Y61.k
            public final String toString() {
                return "Context.Loaded(" + com.avito.android.messenger.util.i.b(this.f11548a, new Q[0]) + ", channel = " + this.f11549b + ", users = " + this.f11550c + ", chatReplyTimeState = " + this.f11551d + ')';
            }
        }

        /* compiled from: MessageListPartialState.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LNY/f$a$c;", "LNY/f$a;", "LNY/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends a implements NY.b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final MessengerUserHashInfo f11553a;

            public c(@Y61.k MessengerUserHashInfo messengerUserHashInfo) {
                super(null);
                this.f11553a = messengerUserHashInfo;
            }

            @Override // NY.b
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final MessengerUserHashInfo getF11554a() {
                return this.f11553a;
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Context.LoadedOnlyUserId("), com.avito.android.messenger.util.i.b(this.f11553a, new Q[0]), ')');
            }
        }

        /* compiled from: MessageListPartialState.kt */
        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LNY/f$a$d;", "LNY/f$a;", "LNY/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends a implements NY.b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final MessengerUserHashInfo f11554a;

            public d(@Y61.k MessengerUserHashInfo messengerUserHashInfo) {
                super(null);
                this.f11554a = messengerUserHashInfo;
            }

            @Override // NY.b
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final MessengerUserHashInfo getF11554a() {
                return this.f11554a;
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Context.LoadingError("), com.avito.android.messenger.util.i.b(this.f11554a, new Q[0]), ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
            super(null);
        }
    }

    /* compiled from: MessageListPartialState.kt */
    @P
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LNY/f$b;", "LNY/f;", "<init>", "()V", "a", "b", "c", "d", "LNY/f$b$a;", "LNY/f$b$b;", "LNY/f$b$c;", "LNY/f$b$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b extends f {

        /* compiled from: MessageListPartialState.kt */
        @P
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LNY/f$b$a;", "LNY/f$b;", "<init>", "()V", "a", "b", "LNY/f$b$a$a;", "LNY/f$b$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class a extends b {

            /* compiled from: MessageListPartialState.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNY/f$b$a$a;", "LNY/f$b$a;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: NY.f$b$a$a, reason: collision with other inner class name */
            public static final /* data */ class C0738a extends a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C0738a f11555a = new C0738a();

                public C0738a() {
                    super(null);
                }

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof C0738a);
                }

                public final int hashCode() {
                    return 2135777069;
                }

                @Y61.k
                public final String toString() {
                    return "List.Bottom.Empty";
                }
            }

            /* compiled from: MessageListPartialState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNY/f$b$a$b;", "LNY/f$b$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: NY.f$b$a$b, reason: collision with other inner class name */
            public static final /* data */ class C0739b extends a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final T1.h f11556a;

                public C0739b(@Y61.k T1.h hVar) {
                    super(null);
                    this.f11556a = hVar;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0739b) && L.f(this.f11556a, ((C0739b) obj).f11556a);
                }

                public final int hashCode() {
                    return this.f11556a.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return AK.c.s(new StringBuilder("List.Bottom.UsersTyping(typingIndicator = TypingIndicator(userId = "), this.f11556a.f189212b, "))");
                }
            }

            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
                super(null);
            }
        }

        /* compiled from: MessageListPartialState.kt */
        @P
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LNY/f$b$b;", "LNY/f$b;", "<init>", "()V", "a", "b", "c", "d", "LNY/f$b$b$a;", "LNY/f$b$b$b;", "LNY/f$b$b$c;", "LNY/f$b$b$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: NY.f$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC0740b extends b {

            /* compiled from: MessageListPartialState.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNY/f$b$b$a;", "LNY/f$b$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: NY.f$b$b$a */
            public static final /* data */ class a extends AbstractC0740b {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final a f11557a = new a();

                public a() {
                    super(null);
                }

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -287316201;
                }

                @Y61.k
                public final String toString() {
                    return "Empty";
                }
            }

            /* compiled from: MessageListPartialState.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNY/f$b$b$b;", "LNY/f$b$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: NY.f$b$b$b, reason: collision with other inner class name */
            public static final /* data */ class C0741b extends AbstractC0740b {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C0741b f11558a = new C0741b();

                public C0741b() {
                    super(null);
                }

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof C0741b);
                }

                public final int hashCode() {
                    return -1465299678;
                }

                @Y61.k
                public final String toString() {
                    return "LoadingError";
                }
            }

            /* compiled from: MessageListPartialState.kt */
            @P
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LNY/f$b$b$c;", "LNY/f$b$b;", "LNY/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: NY.f$b$b$c */
            public static final /* data */ class c extends AbstractC0740b implements NY.a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final List<Q<LocalMessage, Q1>> f11559a;

                public c(@Y61.k List<Q<LocalMessage, Q1>> list) {
                    super(null);
                    this.f11559a = list;
                }

                @Override // NY.a
                @Y61.k
                public final List<Q<LocalMessage, Q1>> b() {
                    return this.f11559a;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && L.f(this.f11559a, ((c) obj).f11559a);
                }

                public final int hashCode() {
                    return this.f11559a.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return "List.Middle.LoadingInProgress(rawItems=(" + this.f11559a.size() + ")[add logging to see contents])";
                }
            }

            public /* synthetic */ AbstractC0740b(C42822w c42822w) {
                this();
            }

            /* compiled from: MessageListPartialState.kt */
            @P
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LNY/f$b$b$d;", "LNY/f$b$b;", "LNY/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: NY.f$b$b$d */
            public static final /* data */ class d extends AbstractC0740b implements NY.a {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final List<T1> f11560a;

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final List<Q<LocalMessage, Q1>> f11561b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final NY.d f11562c;

                /* renamed from: d, reason: collision with root package name */
                public final int f11563d;

                /* renamed from: e, reason: collision with root package name */
                public final boolean f11564e;

                public /* synthetic */ d(List list, List list2, NY.d dVar, int i12, boolean z12, int i13, C42822w c42822w) {
                    this(list, list2, (i13 & 4) != 0 ? d.c.f11546a : dVar, i12, z12);
                }

                @Override // NY.a
                @Y61.k
                public final List<Q<LocalMessage, Q1>> b() {
                    return this.f11561b;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj;
                    return L.f(this.f11560a, dVar.f11560a) && L.f(this.f11561b, dVar.f11561b) && L.f(this.f11562c, dVar.f11562c) && this.f11563d == dVar.f11563d && this.f11564e == dVar.f11564e;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f11564e) + r.e(this.f11563d, (this.f11562c.hashCode() + H.e(this.f11560a.hashCode() * 31, 31, this.f11561b)) * 31, 31);
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("List.Middle.LoadingSuccess(items=<");
                    D8.r(this.f11560a, sb2, " items>, rawItems = <");
                    D8.r(this.f11561b, sb2, " items>, latestReadMessageBeforeOpen = ");
                    sb2.append(this.f11562c);
                    sb2.append(", newMessagesDividerPosition = ");
                    sb2.append(this.f11563d);
                    sb2.append(", userInteractedWithList = ");
                    return r.x(sb2, this.f11564e, ')');
                }

                /* JADX WARN: Multi-variable type inference failed */
                public d(@Y61.k List<? extends T1> list, @Y61.k List<Q<LocalMessage, Q1>> list2, @Y61.k NY.d dVar, int i12, boolean z12) {
                    super(null);
                    this.f11560a = list;
                    this.f11561b = list2;
                    this.f11562c = dVar;
                    this.f11563d = i12;
                    this.f11564e = z12;
                }
            }

            public AbstractC0740b() {
                super(null);
            }
        }

        /* compiled from: MessageListPartialState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNY/f$b$c;", "LNY/f$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final T1.g f11565a;

            public c(@Y61.l T1.g gVar) {
                super(null);
                this.f11565a = gVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f11565a, ((c) obj).f11565a);
            }

            public final int hashCode() {
                T1.g gVar = this.f11565a;
                if (gVar == null) {
                    return 0;
                }
                return gVar.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "SpamActions(spamActions=" + this.f11565a + ')';
            }
        }

        /* compiled from: MessageListPartialState.kt */
        @P
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LNY/f$b$d;", "LNY/f$b;", "<init>", "()V", "a", "b", "c", "LNY/f$b$d$a;", "LNY/f$b$d$b;", "LNY/f$b$d$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class d extends b {

            /* compiled from: MessageListPartialState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNY/f$b$d$a;", "LNY/f$b$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a extends d {

                /* renamed from: a, reason: collision with root package name */
                public final boolean f11566a;

                public a(boolean z12) {
                    super(null);
                    this.f11566a = z12;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && this.f11566a == ((a) obj).f11566a;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.f11566a);
                }

                @Y61.k
                public final String toString() {
                    return r.x(new StringBuilder("Empty(paginationIsEnabled="), this.f11566a, ')');
                }
            }

            /* compiled from: MessageListPartialState.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNY/f$b$d$b;", "LNY/f$b$d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: NY.f$b$d$b, reason: collision with other inner class name */
            public static final /* data */ class C0742b extends d {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C0742b f11567a = new C0742b();

                public C0742b() {
                    super(null);
                }

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof C0742b);
                }

                public final int hashCode() {
                    return -1510035726;
                }

                @Y61.k
                public final String toString() {
                    return "PaginationError";
                }
            }

            /* compiled from: MessageListPartialState.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNY/f$b$d$c;", "LNY/f$b$d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class c extends d {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final c f11568a = new c();

                public c() {
                    super(null);
                }

                public final boolean equals(@Y61.l Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 1150542792;
                }

                @Y61.k
                public final String toString() {
                    return "PaginationInProgress";
                }
            }

            public /* synthetic */ d(C42822w c42822w) {
                this();
            }

            public d() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
            super(null);
        }
    }

    /* compiled from: MessageListPartialState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNY/f$c;", "LNY/f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Long f11569a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f11570b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f11571c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f11572d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f11573e;

        public c(@Y61.l Long l12, @Y61.l String str, @Y61.l String str2, @Y61.l Integer num, boolean z12) {
            super(null);
            this.f11569a = l12;
            this.f11570b = str;
            this.f11571c = str2;
            this.f11572d = num;
            this.f11573e = z12;
        }

        public static c c(c cVar, Long l12, String str, String str2, Integer num, int i12) {
            if ((i12 & 1) != 0) {
                l12 = cVar.f11569a;
            }
            Long l13 = l12;
            if ((i12 & 2) != 0) {
                str = cVar.f11570b;
            }
            String str3 = str;
            boolean z12 = (i12 & 16) != 0 ? cVar.f11573e : true;
            cVar.getClass();
            return new c(l13, str3, str2, num, z12);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f11569a, cVar.f11569a) && L.f(this.f11570b, cVar.f11570b) && L.f(this.f11571c, cVar.f11571c) && L.f(this.f11572d, cVar.f11572d) && this.f11573e == cVar.f11573e;
        }

        public final int hashCode() {
            Long l12 = this.f11569a;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            String str = this.f11570b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f11571c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f11572d;
            return Boolean.hashCode(this.f11573e) + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Meta(openTimestamp=");
            sb2.append(this.f11569a);
            sb2.append(", initialListPositionMessageId=");
            sb2.append(this.f11570b);
            sb2.append(", quotedMessageIdToBeFound=");
            sb2.append(this.f11571c);
            sb2.append(", quotedMessageChunkIndexToBeFound=");
            sb2.append(this.f11572d);
            sb2.append(", scrolledToMessageAtLeastOnce=");
            return r.x(sb2, this.f11573e, ')');
        }
    }

    public /* synthetic */ f(C42822w c42822w) {
        this();
    }

    public f() {
    }
}
