package com.avito.android.favorites;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FavoriteAdvertsSyncEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/favorites/Q;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/favorites/Q$a;", "Lcom/avito/android/favorites/Q$b;", "Lcom/avito/android/favorites/Q$c;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class Q {

    /* compiled from: FavoriteAdvertsSyncEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/Q$a;", "Lcom/avito/android/favorites/Q;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends Q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f156321a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<String> f156322b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final List<String> f156323c;

        public a() {
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, List list, List list2, int i12, C42822w c42822w) {
            super(null);
            str = (i12 & 1) != 0 ? UUID.randomUUID().toString() : str;
            this.f156321a = str;
            this.f156322b = list;
            this.f156323c = list2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f156321a, aVar.f156321a) && kotlin.jvm.internal.L.f(this.f156322b, aVar.f156322b) && kotlin.jvm.internal.L.f(this.f156323c, aVar.f156323c);
        }

        public final int hashCode() {
            return this.f156323c.hashCode() + androidx.compose.foundation.H.e(this.f156321a.hashCode() * 31, 31, this.f156322b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Completed(id=");
            sb2.append(this.f156321a);
            sb2.append(", removedAdvert=");
            sb2.append(this.f156322b);
            sb2.append(", addedAdvert=");
            return androidx.compose.foundation.H.p(sb2, this.f156323c, ')');
        }
    }

    /* compiled from: FavoriteAdvertsSyncEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/Q$b;", "Lcom/avito/android/favorites/Q;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends Q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f156324a;

        public b(@Y61.k Throwable th2) {
            super(null);
            this.f156324a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f156324a, ((b) obj).f156324a);
        }

        public final int hashCode() {
            return this.f156324a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Failed(reason="), this.f156324a, ')');
        }
    }

    /* compiled from: FavoriteAdvertsSyncEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/Q$c;", "Lcom/avito/android/favorites/Q;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends Q {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f156325a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ Q(C42822w c42822w) {
        this();
    }

    public Q() {
    }
}
