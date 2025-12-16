package com.avito.android.messenger.blacklist_reasons;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.avito.messenger.api.entity.BlacklistReasons;

/* compiled from: BlacklistReasonsProvider.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/m;", "LS20/a;", "Lcom/avito/android/messenger/blacklist_reasons/m$b;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface m extends S20.a<b> {

    /* compiled from: BlacklistReasonsProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: BlacklistReasonsProvider.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/m$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/messenger/blacklist_reasons/m$b$a;", "Lcom/avito/android/messenger/blacklist_reasons/m$b$b;", "Lcom/avito/android/messenger/blacklist_reasons/m$b$c;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: BlacklistReasonsProvider.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/m$b$a;", "Lcom/avito/android/messenger/blacklist_reasons/m$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.l
            public final Throwable f186639a;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f186639a, ((a) obj).f186639a);
            }

            public final int hashCode() {
                Throwable th2 = this.f186639a;
                if (th2 == null) {
                    return 0;
                }
                return th2.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Empty(error="), this.f186639a, ')');
            }

            public a(@Y61.l Throwable th2) {
                super(null);
                this.f186639a = th2;
            }

            public /* synthetic */ a(Throwable th2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : th2);
            }
        }

        /* compiled from: BlacklistReasonsProvider.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/m$b$b;", "Lcom/avito/android/messenger/blacklist_reasons/m$b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.blacklist_reasons.m$b$b, reason: collision with other inner class name */
        public static final /* data */ class C5477b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final BlacklistReasons f186640a;

            public C5477b(@Y61.k BlacklistReasons blacklistReasons) {
                super(null);
                this.f186640a = blacklistReasons;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C5477b) && L.f(this.f186640a, ((C5477b) obj).f186640a);
            }

            public final int hashCode() {
                return this.f186640a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Loaded(reasons=" + this.f186640a + ')';
            }
        }

        /* compiled from: BlacklistReasonsProvider.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/blacklist_reasons/m$b$c;", "Lcom/avito/android/messenger/blacklist_reasons/m$b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f186641a = new c();

            public c() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    void J3(boolean z12);
}
