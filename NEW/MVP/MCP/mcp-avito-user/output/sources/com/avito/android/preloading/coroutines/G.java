package com.avito.android.preloading.coroutines;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/preloading/coroutines/G;", "T", "", "<init>", "()V", "a", "b", "Lcom/avito/android/preloading/coroutines/G$a;", "Lcom/avito/android/preloading/coroutines/G$b;", "_common_preloading-promise"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class G<T> {

    /* compiled from: Utils.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/preloading/coroutines/G$a;", "Lcom/avito/android/preloading/coroutines/G;", "", "_common_preloading-promise"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends G {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Throwable f221796a;

        public a(@Y61.l Throwable th2) {
            super(null);
            this.f221796a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f221796a, ((a) obj).f221796a);
        }

        public final int hashCode() {
            Throwable th2 = this.f221796a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Completion(exception="), this.f221796a, ')');
        }
    }

    /* compiled from: Utils.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/preloading/coroutines/G$b;", "T", "Lcom/avito/android/preloading/coroutines/G;", "_common_preloading-promise"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b<T> extends G<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f221797a;

        public b(T t12) {
            super(null);
            this.f221797a = t12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f221797a, ((b) obj).f221797a);
        }

        public final int hashCode() {
            T t12 = this.f221797a;
            if (t12 == null) {
                return 0;
            }
            return t12.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.n(new StringBuilder("Value(value="), this.f221797a, ')');
        }
    }

    public /* synthetic */ G(C42822w c42822w) {
        this();
    }

    public G() {
    }
}
