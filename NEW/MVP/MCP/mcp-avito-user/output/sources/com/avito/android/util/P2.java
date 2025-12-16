package com.avito.android.util;

import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LoadingState.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/util/P2;", "T", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/util/P2$a;", "Lcom/avito/android/util/P2$b;", "Lcom/avito/android/util/P2$c;", "_avito-discouraged_avito-network_loading-state"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class P2<T> {

    /* compiled from: LoadingState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/P2$a;", "Lcom/avito/android/util/P2;", "", "_avito-discouraged_avito-network_loading-state"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends P2<Object> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f318719a;

        public a(@Y61.k ApiError apiError) {
            super(null);
            this.f318719a = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f318719a, ((a) obj).f318719a);
        }

        public final int hashCode() {
            return this.f318719a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f318719a, ')');
        }
    }

    /* compiled from: LoadingState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/P2$b;", "T", "Lcom/avito/android/util/P2;", "_avito-discouraged_avito-network_loading-state"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b<T> extends P2<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f318720a;

        public b(T t12) {
            super(null);
            this.f318720a = t12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f318720a, ((b) obj).f318720a);
        }

        public final int hashCode() {
            T t12 = this.f318720a;
            if (t12 == null) {
                return 0;
            }
            return t12.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.foundation.H.n(new StringBuilder("Loaded(data="), this.f318720a, ')');
        }
    }

    /* compiled from: LoadingState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/P2$c;", "Lcom/avito/android/util/P2;", "", "<init>", "()V", "_avito-discouraged_avito-network_loading-state"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends P2<Object> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f318721a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ P2(C42822w c42822w) {
        this();
    }

    public P2() {
    }
}
