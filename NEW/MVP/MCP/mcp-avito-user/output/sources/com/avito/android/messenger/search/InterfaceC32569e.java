package com.avito.android.messenger.search;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.Channel;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsSearchInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/search/e;", "LS20/a;", "Lcom/avito/android/messenger/search/e$b;", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.search.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC32569e extends S20.a<b> {

    /* compiled from: ChannelsSearchInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/e$a;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.search.e$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<C5803a> f197121a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f197122b;

        /* compiled from: ChannelsSearchInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/e$a$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.search.e$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5803a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Channel f197123a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f197124b;

            public C5803a(@Y61.k Channel channel, @Y61.l String str) {
                this.f197123a = channel;
                this.f197124b = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5803a)) {
                    return false;
                }
                C5803a c5803a = (C5803a) obj;
                return L.f(this.f197123a, c5803a.f197123a) && L.f(this.f197124b, c5803a.f197124b);
            }

            public final int hashCode() {
                int iHashCode = this.f197123a.hashCode() * 31;
                String str = this.f197124b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Result(channel=");
                sb2.append(this.f197123a);
                sb2.append(", messageId=");
                return C22026a.c(sb2, this.f197124b, ')');
            }
        }

        public a() {
            this(null, false, 3, null);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f197121a, aVar.f197121a) && this.f197122b == aVar.f197122b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f197122b) + (this.f197121a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchResults(items=");
            sb2.append(this.f197121a);
            sb2.append(", hasMore=");
            return androidx.appcompat.app.r.x(sb2, this.f197122b, ')');
        }

        public a(List list, boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? false : z12);
        }

        public a(@Y61.k List<C5803a> list, boolean z12) {
            this.f197121a = list;
            this.f197122b = z12;
        }
    }

    /* compiled from: ChannelsSearchInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/messenger/search/e$b;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/messenger/search/e$b$a;", "Lcom/avito/android/messenger/search/e$b$b;", "Lcom/avito/android/messenger/search/e$b$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.search.e$b */
    public static abstract class b {

        /* compiled from: ChannelsSearchInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/e$b$a;", "Lcom/avito/android/messenger/search/e$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.search.e$b$a */
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final MessengerUserHashInfo f197125a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final F f197126b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final a f197127c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final MessengerUserHashInfo f197128d;

            public a() {
                this(null, 1, null);
            }

            @Override // com.avito.android.messenger.search.InterfaceC32569e.b
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final MessengerUserHashInfo getF197134a() {
                return this.f197125a;
            }

            @Override // com.avito.android.messenger.search.InterfaceC32569e.b
            @Y61.k
            /* renamed from: b, reason: from getter */
            public final MessengerUserHashInfo getF197135b() {
                return this.f197128d;
            }

            @Override // com.avito.android.messenger.search.InterfaceC32569e.b
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final F getF197136c() {
                return this.f197126b;
            }

            @Override // com.avito.android.messenger.search.InterfaceC32569e.b
            @Y61.k
            /* renamed from: d, reason: from getter */
            public final a getF197137d() {
                return this.f197127c;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f197125a, ((a) obj).f197125a);
            }

            public final int hashCode() {
                return this.f197125a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Empty("), com.avito.android.messenger.util.i.b(this.f197125a, new Q[0]), ')');
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public a(MessengerUserHashInfo messengerUserHashInfo, int i12, C42822w c42822w) {
                if ((i12 & 1) != 0) {
                    MessengerUserHashInfo.f430678e.getClass();
                    messengerUserHashInfo = MessengerUserHashInfo.f430679f;
                }
                this(messengerUserHashInfo);
            }

            public a(@Y61.k MessengerUserHashInfo messengerUserHashInfo) {
                super(null);
                this.f197125a = messengerUserHashInfo;
                this.f197126b = new F(0L, null, 3, null);
                this.f197127c = new a(null, false, 3, null);
                MessengerUserHashInfo.f430678e.getClass();
                this.f197128d = MessengerUserHashInfo.f430679f;
            }
        }

        /* compiled from: ChannelsSearchInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/e$b$b;", "Lcom/avito/android/messenger/search/e$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.search.e$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5804b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final MessengerUserHashInfo f197129a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final MessengerUserHashInfo f197130b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final F f197131c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final Throwable f197132d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final a f197133e;

            public C5804b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k MessengerUserHashInfo messengerUserHashInfo2, @Y61.k F f12, @Y61.l Throwable th2) {
                super(null);
                this.f197129a = messengerUserHashInfo;
                this.f197130b = messengerUserHashInfo2;
                this.f197131c = f12;
                this.f197132d = th2;
                this.f197133e = new a(null, false, 3, null);
            }

            @Override // com.avito.android.messenger.search.InterfaceC32569e.b
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final MessengerUserHashInfo getF197134a() {
                return this.f197129a;
            }

            @Override // com.avito.android.messenger.search.InterfaceC32569e.b
            @Y61.k
            /* renamed from: b, reason: from getter */
            public final MessengerUserHashInfo getF197135b() {
                return this.f197130b;
            }

            @Override // com.avito.android.messenger.search.InterfaceC32569e.b
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final F getF197136c() {
                return this.f197131c;
            }

            @Override // com.avito.android.messenger.search.InterfaceC32569e.b
            @Y61.k
            /* renamed from: d, reason: from getter */
            public final a getF197137d() {
                return this.f197133e;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5804b)) {
                    return false;
                }
                C5804b c5804b = (C5804b) obj;
                return L.f(this.f197129a, c5804b.f197129a) && L.f(this.f197130b, c5804b.f197130b) && L.f(this.f197131c, c5804b.f197131c) && L.f(this.f197132d, c5804b.f197132d);
            }

            public final int hashCode() {
                int iHashCode = (this.f197131c.hashCode() + ((this.f197130b.hashCode() + (this.f197129a.hashCode() * 31)) * 31)) * 31;
                Throwable th2 = this.f197132d;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Loaded.Error(query=");
                sb2.append(this.f197131c);
                sb2.append(", error=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f197132d, ')');
            }
        }

        /* compiled from: ChannelsSearchInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/search/e$b$d;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/search/e$b$d$a;", "Lcom/avito/android/messenger/search/e$b$d$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.search.e$b$d */
        public static abstract class d {

            /* compiled from: ChannelsSearchInteractor.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/e$b$d$a;", "Lcom/avito/android/messenger/search/e$b$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.search.e$b$d$a */
            public static final /* data */ class a extends d {

                /* renamed from: a, reason: collision with root package name */
                @Y61.l
                public final Throwable f197139a;

                public a(@Y61.l Throwable th2) {
                    super(null);
                    this.f197139a = th2;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && L.f(this.f197139a, ((a) obj).f197139a);
                }

                public final int hashCode() {
                    Throwable th2 = this.f197139a;
                    if (th2 == null) {
                        return 0;
                    }
                    return th2.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(error = "), this.f197139a, ')');
                }
            }

            /* compiled from: ChannelsSearchInteractor.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/search/e$b$d$b;", "Lcom/avito/android/messenger/search/e$b$d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.search.e$b$d$b, reason: collision with other inner class name */
            public static final class C5805b extends d {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C5805b f197140a = new C5805b();

                public C5805b() {
                    super(null);
                }

                @Y61.k
                public final String toString() {
                    return "Idle";
                }
            }

            public /* synthetic */ d(C42822w c42822w) {
                this();
            }

            public d() {
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Y61.k
        /* renamed from: a */
        public abstract MessengerUserHashInfo getF197134a();

        @Y61.k
        /* renamed from: b */
        public abstract MessengerUserHashInfo getF197135b();

        @Y61.k
        /* renamed from: c */
        public abstract F getF197136c();

        @Y61.k
        /* renamed from: d */
        public abstract a getF197137d();

        /* compiled from: ChannelsSearchInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/e$b$c;", "Lcom/avito/android/messenger/search/e$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.search.e$b$c */
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final MessengerUserHashInfo f197134a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final MessengerUserHashInfo f197135b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final F f197136c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final a f197137d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final d f197138e;

            public /* synthetic */ c(MessengerUserHashInfo messengerUserHashInfo, MessengerUserHashInfo messengerUserHashInfo2, F f12, a aVar, d dVar, int i12, C42822w c42822w) {
                this(messengerUserHashInfo, messengerUserHashInfo2, f12, aVar, (i12 & 16) != 0 ? d.C5805b.f197140a : dVar);
            }

            public static c e(c cVar, MessengerUserHashInfo messengerUserHashInfo, a aVar, d dVar, int i12) {
                if ((i12 & 1) != 0) {
                    messengerUserHashInfo = cVar.f197134a;
                }
                MessengerUserHashInfo messengerUserHashInfo2 = messengerUserHashInfo;
                MessengerUserHashInfo messengerUserHashInfo3 = cVar.f197135b;
                F f12 = cVar.f197136c;
                if ((i12 & 8) != 0) {
                    aVar = cVar.f197137d;
                }
                a aVar2 = aVar;
                if ((i12 & 16) != 0) {
                    dVar = cVar.f197138e;
                }
                cVar.getClass();
                return new c(messengerUserHashInfo2, messengerUserHashInfo3, f12, aVar2, dVar);
            }

            @Override // com.avito.android.messenger.search.InterfaceC32569e.b
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final MessengerUserHashInfo getF197134a() {
                return this.f197134a;
            }

            @Override // com.avito.android.messenger.search.InterfaceC32569e.b
            @Y61.k
            /* renamed from: b, reason: from getter */
            public final MessengerUserHashInfo getF197135b() {
                return this.f197135b;
            }

            @Override // com.avito.android.messenger.search.InterfaceC32569e.b
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final F getF197136c() {
                return this.f197136c;
            }

            @Override // com.avito.android.messenger.search.InterfaceC32569e.b
            @Y61.k
            /* renamed from: d, reason: from getter */
            public final a getF197137d() {
                return this.f197137d;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f197134a, cVar.f197134a) && L.f(this.f197135b, cVar.f197135b) && L.f(this.f197136c, cVar.f197136c) && L.f(this.f197137d, cVar.f197137d) && L.f(this.f197138e, cVar.f197138e);
            }

            public final int hashCode() {
                return this.f197138e.hashCode() + ((this.f197137d.hashCode() + ((this.f197136c.hashCode() + ((this.f197135b.hashCode() + (this.f197134a.hashCode() * 31)) * 31)) * 31)) * 31);
            }

            @Y61.k
            public final String toString() {
                return "Loaded.Results(query=" + this.f197136c + ", paginationState=" + this.f197138e + ", results=" + this.f197137d + ')';
            }

            public c(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k MessengerUserHashInfo messengerUserHashInfo2, @Y61.k F f12, @Y61.k a aVar, @Y61.k d dVar) {
                super(null);
                this.f197134a = messengerUserHashInfo;
                this.f197135b = messengerUserHashInfo2;
                this.f197136c = f12;
                this.f197137d = aVar;
                this.f197138e = dVar;
            }
        }

        public b() {
        }
    }

    @Y61.k
    B0 F0();

    void J();

    void Z6(@Y61.k F f12);
}
