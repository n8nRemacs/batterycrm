package com.avito.android.messenger.blacklist.mvi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import ru.avito.messenger.api.entity.BlockedUser;

/* compiled from: BlacklistInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/m;", "LS20/a;", "Lcom/avito/android/messenger/blacklist/mvi/m$a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.blacklist.mvi.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC31683m extends S20.a<a> {

    /* compiled from: BlacklistInteractor.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/m$a;", "", "a", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.blacklist.mvi.m$a */
    public static final /* data */ class a {

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public static final C5469a f186469g = new C5469a(null);

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public static final a f186470h;

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final b f186471a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final b f186472b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final b f186473c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final List<BlockedUser> f186474d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f186475e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Map<String, Long> f186476f;

        /* compiled from: BlacklistInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/m$a$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.blacklist.mvi.m$a$a, reason: collision with other inner class name */
        public static final class C5469a {
            public /* synthetic */ C5469a(C42822w c42822w) {
                this();
            }

            public C5469a() {
            }
        }

        /* compiled from: BlacklistInteractor.kt */
        @androidx.compose.runtime.internal.P
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/m$a$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/messenger/blacklist/mvi/m$a$b$a;", "Lcom/avito/android/messenger/blacklist/mvi/m$a$b$b;", "Lcom/avito/android/messenger/blacklist/mvi/m$a$b$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.blacklist.mvi.m$a$b */
        public static abstract class b {

            /* compiled from: BlacklistInteractor.kt */
            @androidx.compose.runtime.internal.P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/m$a$b$a;", "Lcom/avito/android/messenger/blacklist/mvi/m$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.blacklist.mvi.m$a$b$a, reason: collision with other inner class name */
            public static final class C5470a extends b {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final Throwable f186477a;

                public C5470a(@Y61.k Throwable th2) {
                    super(null);
                    this.f186477a = th2;
                }

                @Y61.k
                public final String toString() {
                    return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Loading.Error("), this.f186477a, ')');
                }
            }

            /* compiled from: BlacklistInteractor.kt */
            @androidx.compose.runtime.internal.P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/m$a$b$b;", "Lcom/avito/android/messenger/blacklist/mvi/m$a$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.blacklist.mvi.m$a$b$b, reason: collision with other inner class name */
            public static final class C5471b extends b {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C5471b f186478a = new C5471b();

                public C5471b() {
                    super(null);
                }

                @Y61.k
                public final String toString() {
                    return "Loading.Finished";
                }
            }

            /* compiled from: BlacklistInteractor.kt */
            @androidx.compose.runtime.internal.P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/m$a$b$c;", "Lcom/avito/android/messenger/blacklist/mvi/m$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.blacklist.mvi.m$a$b$c */
            public static final class c extends b {

                /* renamed from: a, reason: collision with root package name */
                public final long f186479a;

                public c(long j12) {
                    super(null);
                    this.f186479a = j12;
                }

                @Y61.k
                public final String toString() {
                    return "Loading.InProgress#" + this.f186479a;
                }
            }

            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        static {
            b.c cVar = new b.c(-1L);
            b.C5471b c5471b = b.C5471b.f186478a;
            f186470h = new a(cVar, c5471b, c5471b, C42784z0.f406748b, false, P0.c());
        }

        public a(@Y61.k b bVar, @Y61.k b bVar2, @Y61.k b bVar3, @Y61.k List<BlockedUser> list, boolean z12, @Y61.k Map<String, Long> map) {
            this.f186471a = bVar;
            this.f186472b = bVar2;
            this.f186473c = bVar3;
            this.f186474d = list;
            this.f186475e = z12;
            this.f186476f = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(a aVar, b bVar, b bVar2, b bVar3, ArrayList arrayList, boolean z12, Map map, int i12) {
            if ((i12 & 1) != 0) {
                bVar = aVar.f186471a;
            }
            b bVar4 = bVar;
            if ((i12 & 2) != 0) {
                bVar2 = aVar.f186472b;
            }
            b bVar5 = bVar2;
            if ((i12 & 4) != 0) {
                bVar3 = aVar.f186473c;
            }
            b bVar6 = bVar3;
            List list = arrayList;
            if ((i12 & 8) != 0) {
                list = aVar.f186474d;
            }
            List list2 = list;
            if ((i12 & 16) != 0) {
                z12 = aVar.f186475e;
            }
            boolean z13 = z12;
            if ((i12 & 32) != 0) {
                map = aVar.f186476f;
            }
            aVar.getClass();
            return new a(bVar4, bVar5, bVar6, list2, z13, map);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f186471a, aVar.f186471a) && kotlin.jvm.internal.L.f(this.f186472b, aVar.f186472b) && kotlin.jvm.internal.L.f(this.f186473c, aVar.f186473c) && kotlin.jvm.internal.L.f(this.f186474d, aVar.f186474d) && this.f186475e == aVar.f186475e && kotlin.jvm.internal.L.f(this.f186476f, aVar.f186476f);
        }

        public final int hashCode() {
            return this.f186476f.hashCode() + androidx.appcompat.app.r.i(androidx.compose.foundation.H.e((this.f186473c.hashCode() + ((this.f186472b.hashCode() + (this.f186471a.hashCode() * 31)) * 31)) * 31, 31, this.f186474d), 31, this.f186475e);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("State(initialLoadingState=");
            sb2.append(this.f186471a);
            sb2.append(", refreshState=");
            sb2.append(this.f186472b);
            sb2.append(", nextPageLoadingState=");
            sb2.append(this.f186473c);
            sb2.append(", blockedUsers=");
            sb2.append(this.f186474d);
            sb2.append(", hasMoreItems=");
            sb2.append(this.f186475e);
            sb2.append(", unblockingUsers=");
            return androidx.appcompat.app.r.w(sb2, this.f186476f, ')');
        }
    }

    void J();

    void N1();

    void p0();

    void sc(@Y61.k String str);
}
