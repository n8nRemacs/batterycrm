package com.avito.android.messenger.search;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import fZ.AbstractC40377a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChannelsSearchView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/search/B;", "Lcom/avito/android/mvi/g;", "Lcom/avito/android/messenger/search/B$b;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface B extends com.avito.android.mvi.g<b> {

    /* compiled from: ChannelsSearchView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: ChannelsSearchView.kt */
    @P
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/messenger/search/B$b;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "Lcom/avito/android/messenger/search/B$b$a;", "Lcom/avito/android/messenger/search/B$b$b;", "Lcom/avito/android/messenger/search/B$b$c;", "Lcom/avito/android/messenger/search/B$b$d;", "Lcom/avito/android/messenger/search/B$b$g;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: ChannelsSearchView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/B$b$b;", "Lcom/avito/android/messenger/search/B$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.search.B$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5794b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final F f196947a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final f f196948b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final PrintableText f196949c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final Throwable f196950d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final Set<String> f196951e;

            public C5794b(@Y61.k F f12, @Y61.k f fVar, @Y61.k PrintableText printableText, @Y61.l Throwable th2, @Y61.k Set<String> set) {
                super(null);
                this.f196947a = f12;
                this.f196948b = fVar;
                this.f196949c = printableText;
                this.f196950d = th2;
                this.f196951e = set;
            }

            @Override // com.avito.android.messenger.search.B.b
            @Y61.k
            public final Set<String> a() {
                return this.f196951e;
            }

            @Override // com.avito.android.messenger.search.B.b
            @Y61.k
            /* renamed from: b, reason: from getter */
            public final F getF196972a() {
                return this.f196947a;
            }

            @Override // com.avito.android.messenger.search.B.b
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final f getF196974c() {
                return this.f196948b;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5794b)) {
                    return false;
                }
                C5794b c5794b = (C5794b) obj;
                return L.f(this.f196947a, c5794b.f196947a) && L.f(this.f196948b, c5794b.f196948b) && L.f(this.f196949c, c5794b.f196949c) && L.f(this.f196950d, c5794b.f196950d) && L.f(this.f196951e, c5794b.f196951e);
            }

            public final int hashCode() {
                int iF2 = com.avito.android.actions_sheet.a.f(this.f196949c, (this.f196948b.hashCode() + (this.f196947a.hashCode() * 31)) * 31, 31);
                Throwable th2 = this.f196950d;
                return this.f196951e.hashCode() + ((iF2 + (th2 == null ? 0 : th2.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(query=");
                sb2.append(this.f196947a);
                sb2.append(", results=");
                sb2.append(this.f196948b);
                sb2.append(", message=");
                sb2.append(this.f196949c);
                sb2.append(", error=");
                sb2.append(this.f196950d);
                sb2.append(", channelIdsToBeDeleted=");
                return AK.c.u(sb2, this.f196951e, ')');
            }
        }

        /* compiled from: ChannelsSearchView.kt */
        @P
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/search/B$b$c;", "Lcom/avito/android/messenger/search/B$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/search/B$b$c$a;", "Lcom/avito/android/messenger/search/B$b$c$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class c extends b {
            public /* synthetic */ c(C42822w c42822w) {
                this();
            }

            @Y61.k
            /* renamed from: d */
            public abstract e getF196957b();

            public c() {
                super(null);
            }

            /* compiled from: ChannelsSearchView.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/B$b$c$b;", "Lcom/avito/android/messenger/search/B$b$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.search.B$b$c$b, reason: collision with other inner class name */
            public static final /* data */ class C5795b extends c {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final f f196956a;

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final e f196957b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final Set<String> f196958c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.k
                public final F f196959d;

                public C5795b(f fVar, e eVar, Set set, F f12, int i12, C42822w c42822w) {
                    this((i12 & 2) != 0 ? e.C5796b.f196965a : eVar, fVar, (i12 & 8) != 0 ? fVar.f196969a : f12, set);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v2, types: [com.avito.android.messenger.search.B$b$e] */
                public static C5795b e(C5795b c5795b, f fVar, e.c cVar, Set set, int i12) {
                    if ((i12 & 1) != 0) {
                        fVar = c5795b.f196956a;
                    }
                    e.c cVar2 = cVar;
                    if ((i12 & 2) != 0) {
                        cVar2 = c5795b.f196957b;
                    }
                    if ((i12 & 4) != 0) {
                        set = c5795b.f196958c;
                    }
                    return new C5795b(cVar2, fVar, c5795b.f196959d, set);
                }

                @Override // com.avito.android.messenger.search.B.b
                @Y61.k
                public final Set<String> a() {
                    return this.f196958c;
                }

                @Override // com.avito.android.messenger.search.B.b
                @Y61.k
                /* renamed from: b, reason: from getter */
                public final F getF196972a() {
                    return this.f196959d;
                }

                @Override // com.avito.android.messenger.search.B.b
                @Y61.k
                /* renamed from: c, reason: from getter */
                public final f getF196974c() {
                    return this.f196956a;
                }

                @Override // com.avito.android.messenger.search.B.b.c
                @Y61.k
                /* renamed from: d, reason: from getter */
                public final e getF196957b() {
                    return this.f196957b;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C5795b)) {
                        return false;
                    }
                    C5795b c5795b = (C5795b) obj;
                    return L.f(this.f196956a, c5795b.f196956a) && L.f(this.f196957b, c5795b.f196957b) && L.f(this.f196958c, c5795b.f196958c) && L.f(this.f196959d, c5795b.f196959d);
                }

                public final int hashCode() {
                    return this.f196959d.hashCode() + androidx.media3.exoplayer.analytics.m.g(this.f196958c, (this.f196957b.hashCode() + (this.f196956a.hashCode() * 31)) * 31, 31);
                }

                @Y61.k
                public final String toString() {
                    return "Results(results=" + this.f196956a + ", paginationState=" + this.f196957b + ", channelIdsToBeDeleted=" + this.f196958c + ", query=" + this.f196959d + ')';
                }

                public C5795b(@Y61.k e eVar, @Y61.k f fVar, @Y61.k F f12, @Y61.k Set set) {
                    super(null);
                    this.f196956a = fVar;
                    this.f196957b = eVar;
                    this.f196958c = set;
                    this.f196959d = f12;
                }
            }

            /* compiled from: ChannelsSearchView.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/B$b$c$a;", "Lcom/avito/android/messenger/search/B$b$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a extends c {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final F f196952a;

                /* renamed from: b, reason: collision with root package name */
                @Y61.k
                public final Set<String> f196953b;

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final f f196954c;

                /* renamed from: d, reason: collision with root package name */
                @Y61.k
                public final e f196955d;

                /* JADX WARN: Illegal instructions before constructor call */
                public a(F f12, Set set, f fVar, e eVar, int i12, C42822w c42822w) {
                    if ((i12 & 4) != 0) {
                        f.f196967d.getClass();
                        fVar = f.f196968e;
                    }
                    this((i12 & 8) != 0 ? e.C5796b.f196965a : eVar, fVar, f12, set);
                }

                @Override // com.avito.android.messenger.search.B.b
                @Y61.k
                public final Set<String> a() {
                    return this.f196953b;
                }

                @Override // com.avito.android.messenger.search.B.b
                @Y61.k
                /* renamed from: b, reason: from getter */
                public final F getF196972a() {
                    return this.f196952a;
                }

                @Override // com.avito.android.messenger.search.B.b
                @Y61.k
                /* renamed from: c, reason: from getter */
                public final f getF196974c() {
                    return this.f196954c;
                }

                @Override // com.avito.android.messenger.search.B.b.c
                @Y61.k
                /* renamed from: d, reason: from getter */
                public final e getF196957b() {
                    return this.f196955d;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return L.f(this.f196952a, aVar.f196952a) && L.f(this.f196953b, aVar.f196953b) && L.f(this.f196954c, aVar.f196954c) && L.f(this.f196955d, aVar.f196955d);
                }

                public final int hashCode() {
                    return this.f196955d.hashCode() + ((this.f196954c.hashCode() + androidx.media3.exoplayer.analytics.m.g(this.f196953b, this.f196952a.hashCode() * 31, 31)) * 31);
                }

                @Y61.k
                public final String toString() {
                    return "Loaded.Empty(query=" + this.f196952a + ')';
                }

                public a(@Y61.k e eVar, @Y61.k f fVar, @Y61.k F f12, @Y61.k Set set) {
                    super(null);
                    this.f196952a = f12;
                    this.f196953b = set;
                    this.f196954c = fVar;
                    this.f196955d = eVar;
                }
            }
        }

        /* compiled from: ChannelsSearchView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/B$b$d;", "Lcom/avito/android/messenger/search/B$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final F f196960a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final f f196961b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final Set<String> f196962c;

            public d(@Y61.k f fVar, @Y61.k F f12, @Y61.k Set set) {
                super(null);
                this.f196960a = f12;
                this.f196961b = fVar;
                this.f196962c = set;
            }

            @Override // com.avito.android.messenger.search.B.b
            @Y61.k
            public final Set<String> a() {
                return this.f196962c;
            }

            @Override // com.avito.android.messenger.search.B.b
            @Y61.k
            /* renamed from: b, reason: from getter */
            public final F getF196972a() {
                return this.f196960a;
            }

            @Override // com.avito.android.messenger.search.B.b
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final f getF196974c() {
                return this.f196961b;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return L.f(this.f196960a, dVar.f196960a) && L.f(this.f196961b, dVar.f196961b) && L.f(this.f196962c, dVar.f196962c);
            }

            public final int hashCode() {
                return this.f196962c.hashCode() + ((this.f196961b.hashCode() + (this.f196960a.hashCode() * 31)) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Loading(query=");
                sb2.append(this.f196960a);
                sb2.append(", results=");
                sb2.append(this.f196961b);
                sb2.append(", channelIdsToBeDeleted=");
                return AK.c.u(sb2, this.f196962c, ')');
            }
        }

        /* compiled from: ChannelsSearchView.kt */
        @P
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/search/B$b$e;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/messenger/search/B$b$e$a;", "Lcom/avito/android/messenger/search/B$b$e$b;", "Lcom/avito/android/messenger/search/B$b$e$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class e {

            /* compiled from: ChannelsSearchView.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/B$b$e$a;", "Lcom/avito/android/messenger/search/B$b$e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class a extends e {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public final PrintableText f196963a;

                /* renamed from: b, reason: collision with root package name */
                @Y61.l
                public final Throwable f196964b;

                public a(@Y61.k PrintableText printableText, @Y61.l Throwable th2) {
                    super(null);
                    this.f196963a = printableText;
                    this.f196964b = th2;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return L.f(this.f196963a, aVar.f196963a) && L.f(this.f196964b, aVar.f196964b);
                }

                public final int hashCode() {
                    int iHashCode = this.f196963a.hashCode() * 31;
                    Throwable th2 = this.f196964b;
                    return iHashCode + (th2 == null ? 0 : th2.hashCode());
                }

                @Y61.k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Error(message=");
                    sb2.append(this.f196963a);
                    sb2.append(", error=");
                    return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f196964b, ')');
                }
            }

            /* compiled from: ChannelsSearchView.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/search/B$b$e$b;", "Lcom/avito/android/messenger/search/B$b$e;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.messenger.search.B$b$e$b, reason: collision with other inner class name */
            public static final class C5796b extends e {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final C5796b f196965a = new C5796b();

                public C5796b() {
                    super(null);
                }
            }

            /* compiled from: ChannelsSearchView.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/search/B$b$e$c;", "Lcom/avito/android/messenger/search/B$b$e;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class c extends e {

                /* renamed from: a, reason: collision with root package name */
                @Y61.k
                public static final c f196966a = new c();

                public c() {
                    super(null);
                }
            }

            public /* synthetic */ e(C42822w c42822w) {
                this();
            }

            public e() {
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Y61.k
        public abstract Set<String> a();

        @Y61.k
        /* renamed from: b */
        public abstract F getF196972a();

        @Y61.k
        /* renamed from: c */
        public abstract f getF196974c();

        /* compiled from: ChannelsSearchView.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/B$b$f;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class f {

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public static final a f196967d = new a(null);

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public static final f f196968e;

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final F f196969a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final List<AbstractC40377a> f196970b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f196971c;

            /* compiled from: ChannelsSearchView.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/search/B$b$f$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(C42822w c42822w) {
                    this();
                }

                public a() {
                }
            }

            static {
                F.f197039c.getClass();
                f196968e = new f(F.f197040d, null, false, 6, null);
            }

            public f(F f12, List list, boolean z12, int i12, C42822w c42822w) {
                this(f12, (i12 & 2) != 0 ? C42784z0.f406748b : list, (i12 & 4) != 0 ? false : z12);
            }

            public static f a(f fVar, ArrayList arrayList, boolean z12) {
                F f12 = fVar.f196969a;
                fVar.getClass();
                return new f(f12, arrayList, z12);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return L.f(this.f196969a, fVar.f196969a) && L.f(this.f196970b, fVar.f196970b) && this.f196971c == fVar.f196971c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f196971c) + H.e(this.f196969a.hashCode() * 31, 31, this.f196970b);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SearchResults(query=");
                sb2.append(this.f196969a);
                sb2.append(", items=");
                sb2.append(this.f196970b);
                sb2.append(", hasMorePages=");
                return androidx.appcompat.app.r.x(sb2, this.f196971c, ')');
            }

            /* JADX WARN: Multi-variable type inference failed */
            public f(@Y61.k F f12, @Y61.k List<? extends AbstractC40377a> list, boolean z12) {
                this.f196969a = f12;
                this.f196970b = list;
                this.f196971c = z12;
            }
        }

        /* compiled from: ChannelsSearchView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/B$b$g;", "Lcom/avito/android/messenger/search/B$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class g extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final F f196972a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Set<String> f196973b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final f f196974c;

            public /* synthetic */ g(F f12, Set set, f fVar, int i12, C42822w c42822w) {
                this((i12 & 4) != 0 ? new f(f12, null, false, 6, null) : fVar, f12, set);
            }

            @Override // com.avito.android.messenger.search.B.b
            @Y61.k
            public final Set<String> a() {
                return this.f196973b;
            }

            @Override // com.avito.android.messenger.search.B.b
            @Y61.k
            /* renamed from: b, reason: from getter */
            public final F getF196972a() {
                return this.f196972a;
            }

            @Override // com.avito.android.messenger.search.B.b
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final f getF196974c() {
                return this.f196974c;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return L.f(this.f196972a, gVar.f196972a) && L.f(this.f196973b, gVar.f196973b) && L.f(this.f196974c, gVar.f196974c);
            }

            public final int hashCode() {
                return this.f196974c.hashCode() + androidx.media3.exoplayer.analytics.m.g(this.f196973b, this.f196972a.hashCode() * 31, 31);
            }

            @Y61.k
            public final String toString() {
                return "ShortQuery(query=" + this.f196972a + ", channelIdsToBeDeleted=" + this.f196973b + ", results=" + this.f196974c + ')';
            }

            public g(@Y61.k f fVar, @Y61.k F f12, @Y61.k Set set) {
                super(null);
                this.f196972a = f12;
                this.f196973b = set;
                this.f196974c = fVar;
            }
        }

        public b() {
        }

        /* compiled from: ChannelsSearchView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/search/B$b$a;", "Lcom/avito/android/messenger/search/B$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Set<String> f196944a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final F f196945b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final f f196946c;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(Set set, F f12, f fVar, int i12, C42822w c42822w) {
                if ((i12 & 2) != 0) {
                    F.f197039c.getClass();
                    f12 = F.f197040d;
                }
                this((i12 & 4) != 0 ? new f(f12, null, false, 6, null) : fVar, f12, set);
            }

            @Override // com.avito.android.messenger.search.B.b
            @Y61.k
            public final Set<String> a() {
                return this.f196944a;
            }

            @Override // com.avito.android.messenger.search.B.b
            @Y61.k
            /* renamed from: b, reason: from getter */
            public final F getF196972a() {
                return this.f196945b;
            }

            @Override // com.avito.android.messenger.search.B.b
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final f getF196974c() {
                return this.f196946c;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f196944a, aVar.f196944a) && L.f(this.f196945b, aVar.f196945b) && L.f(this.f196946c, aVar.f196946c);
            }

            public final int hashCode() {
                return this.f196946c.hashCode() + ((this.f196945b.hashCode() + (this.f196944a.hashCode() * 31)) * 31);
            }

            @Y61.k
            public final String toString() {
                return "Empty(channelIdsToBeDeleted=" + this.f196944a + ", query=" + this.f196945b + ", results=" + this.f196946c + ')';
            }

            public a(@Y61.k f fVar, @Y61.k F f12, @Y61.k Set set) {
                super(null);
                this.f196944a = set;
                this.f196945b = f12;
                this.f196946c = fVar;
            }
        }
    }
}
