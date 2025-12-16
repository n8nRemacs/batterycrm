package com.avito.android.messenger.blacklist_reasons;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BlockUserInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y;", "LS20/a;", "Lcom/avito/android/messenger/blacklist_reasons/y$d;", "a", "c", "d", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface y extends S20.a<d> {

    /* compiled from: BlockUserInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/blacklist_reasons/y$a$a;", "Lcom/avito/android/messenger/blacklist_reasons/y$a$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: BlockUserInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y$a$a;", "Lcom/avito/android/messenger/blacklist_reasons/y$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.blacklist_reasons.y$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5478a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f186672a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f186673b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f186674c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final Long f186675d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final String f186676e;

            public /* synthetic */ C5478a(String str, String str2, String str3, Long l12, String str4, int i12, C42822w c42822w) {
                this(str, str2, str3, (i12 & 8) != 0 ? null : l12, (i12 & 16) != 0 ? null : str4);
            }

            @Override // com.avito.android.messenger.blacklist_reasons.y.a
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final String getF186678b() {
                return this.f186673b;
            }

            @Override // com.avito.android.messenger.blacklist_reasons.y.a
            @Y61.l
            /* renamed from: b, reason: from getter */
            public final String getF186679c() {
                return this.f186674c;
            }

            @Override // com.avito.android.messenger.blacklist_reasons.y.a
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final String getF186677a() {
                return this.f186672a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5478a)) {
                    return false;
                }
                C5478a c5478a = (C5478a) obj;
                return L.f(this.f186672a, c5478a.f186672a) && L.f(this.f186673b, c5478a.f186673b) && L.f(this.f186674c, c5478a.f186674c) && L.f(this.f186675d, c5478a.f186675d) && L.f(this.f186676e, c5478a.f186676e);
            }

            public final int hashCode() {
                int iD2 = H.d(this.f186672a.hashCode() * 31, 31, this.f186673b);
                String str = this.f186674c;
                int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                Long l12 = this.f186675d;
                int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
                String str2 = this.f186676e;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("BlockUser(userId=");
                sb2.append(this.f186672a);
                sb2.append(", channelId=");
                sb2.append(this.f186673b);
                sb2.append(", itemId=");
                sb2.append(this.f186674c);
                sb2.append(", reasonId=");
                sb2.append(this.f186675d);
                sb2.append(", reasonText=");
                return C22026a.c(sb2, this.f186676e, ')');
            }

            public C5478a(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l Long l12, @Y61.l String str4) {
                super(null);
                this.f186672a = str;
                this.f186673b = str2;
                this.f186674c = str3;
                this.f186675d = l12;
                this.f186676e = str4;
            }
        }

        /* compiled from: BlockUserInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y$a$b;", "Lcom/avito/android/messenger/blacklist_reasons/y$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f186677a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f186678b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f186679c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f186680d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f186681e;

            public b(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k String str4, boolean z12) {
                super(null);
                this.f186677a = str;
                this.f186678b = str2;
                this.f186679c = str3;
                this.f186680d = str4;
                this.f186681e = z12;
            }

            @Override // com.avito.android.messenger.blacklist_reasons.y.a
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final String getF186678b() {
                return this.f186678b;
            }

            @Override // com.avito.android.messenger.blacklist_reasons.y.a
            @Y61.l
            /* renamed from: b, reason: from getter */
            public final String getF186679c() {
                return this.f186679c;
            }

            @Override // com.avito.android.messenger.blacklist_reasons.y.a
            @Y61.k
            /* renamed from: c, reason: from getter */
            public final String getF186677a() {
                return this.f186677a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f186677a, bVar.f186677a) && L.f(this.f186678b, bVar.f186678b) && L.f(this.f186679c, bVar.f186679c) && L.f(this.f186680d, bVar.f186680d) && this.f186681e == bVar.f186681e;
            }

            public final int hashCode() {
                int iD2 = H.d(this.f186677a.hashCode() * 31, 31, this.f186678b);
                String str = this.f186679c;
                return Boolean.hashCode(this.f186681e) + H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f186680d);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ConfirmChatAsSpam(userId=");
                sb2.append(this.f186677a);
                sb2.append(", channelId=");
                sb2.append(this.f186678b);
                sb2.append(", itemId=");
                sb2.append(this.f186679c);
                sb2.append(", messageId=");
                sb2.append(this.f186680d);
                sb2.append(", isSpam=");
                return androidx.appcompat.app.r.x(sb2, this.f186681e, ')');
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        /* renamed from: a */
        public abstract String getF186678b();

        @Y61.l
        /* renamed from: b */
        public abstract String getF186679c();

        @Y61.k
        /* renamed from: c */
        public abstract String getF186677a();

        public a() {
        }
    }

    /* compiled from: BlockUserInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public static /* synthetic */ void a(y yVar, String str, String str2, String str3, Long l12, int i12) {
            if ((i12 & 8) != 0) {
                l12 = null;
            }
            yVar.X2(str, str2, str3, l12, null);
        }
    }

    /* compiled from: BlockUserInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y$c;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/messenger/blacklist_reasons/y$c$a;", "Lcom/avito/android/messenger/blacklist_reasons/y$c$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* compiled from: BlockUserInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y$c$a;", "Lcom/avito/android/messenger/blacklist_reasons/y$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final a f186682a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Throwable f186683b;

            public a(@Y61.k a aVar, @Y61.k Throwable th2) {
                super(null);
                this.f186682a = aVar;
                this.f186683b = th2;
            }

            @Override // com.avito.android.messenger.blacklist_reasons.y.c
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final a getF186684a() {
                return this.f186682a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f186682a, aVar.f186682a) && L.f(this.f186683b, aVar.f186683b);
            }

            public final int hashCode() {
                return this.f186683b.hashCode() + (this.f186682a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(action=");
                sb2.append(this.f186682a);
                sb2.append(", error=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f186683b, ')');
            }
        }

        /* compiled from: BlockUserInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y$c$b;", "Lcom/avito/android/messenger/blacklist_reasons/y$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final a f186684a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f186685b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f186686c;

            public b(@Y61.k a aVar, boolean z12, boolean z13) {
                super(null);
                this.f186684a = aVar;
                this.f186685b = z12;
                this.f186686c = z13;
            }

            @Override // com.avito.android.messenger.blacklist_reasons.y.c
            @Y61.k
            /* renamed from: a, reason: from getter */
            public final a getF186684a() {
                return this.f186684a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f186684a, bVar.f186684a) && this.f186685b == bVar.f186685b && this.f186686c == bVar.f186686c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f186686c) + androidx.appcompat.app.r.i(this.f186684a.hashCode() * 31, 31, this.f186685b);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Success(action=");
                sb2.append(this.f186684a);
                sb2.append(", isBlocked=");
                sb2.append(this.f186685b);
                sb2.append(", isLocal=");
                return androidx.appcompat.app.r.x(sb2, this.f186686c, ')');
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        @Y61.k
        /* renamed from: a */
        public abstract a getF186684a();

        public c() {
        }
    }

    /* compiled from: BlockUserInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y$d;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/messenger/blacklist_reasons/y$d$a;", "Lcom/avito/android/messenger/blacklist_reasons/y$d$b;", "Lcom/avito/android/messenger/blacklist_reasons/y$d$c;", "Lcom/avito/android/messenger/blacklist_reasons/y$d$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d {

        /* compiled from: BlockUserInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y$d$a;", "Lcom/avito/android/messenger/blacklist_reasons/y$d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f186687a = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: BlockUserInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y$d$b;", "Lcom/avito/android/messenger/blacklist_reasons/y$d;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f186688a = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: BlockUserInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y$d$c;", "Lcom/avito/android/messenger/blacklist_reasons/y$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final a f186689a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Throwable f186690b;

            public c(@Y61.k a aVar, @Y61.l Throwable th2) {
                super(null);
                this.f186689a = aVar;
                this.f186690b = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f186689a, cVar.f186689a) && L.f(this.f186690b, cVar.f186690b);
            }

            public final int hashCode() {
                int iHashCode = this.f186689a.hashCode() * 31;
                Throwable th2 = this.f186690b;
                return iHashCode + (th2 == null ? 0 : th2.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Error(action=");
                sb2.append(this.f186689a);
                sb2.append(", error=");
                return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f186690b, ')');
            }
        }

        /* compiled from: BlockUserInteractor.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/y$d$d;", "Lcom/avito/android/messenger/blacklist_reasons/y$d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.blacklist_reasons.y$d$d, reason: collision with other inner class name */
        public static final /* data */ class C5479d extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final a f186691a;

            public C5479d(@Y61.k a aVar) {
                super(null);
                this.f186691a = aVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5479d) && L.f(this.f186691a, ((C5479d) obj).f186691a);
            }

            public final int hashCode() {
                return this.f186691a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "InProgress(action=" + this.f186691a + ')';
            }
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    void X2(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l Long l12, @Y61.l String str4);

    @Y61.k
    io.reactivex.rxjava3.core.z<c> g7();

    void q5(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, boolean z12);

    void w0();
}
