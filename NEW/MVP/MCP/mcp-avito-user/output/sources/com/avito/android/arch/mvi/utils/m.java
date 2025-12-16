package com.avito.android.arch.mvi.utils;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FlowExt.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/utils/m;", "T", "", "a", "b", "Lcom/avito/android/arch/mvi/utils/m$a;", "Lcom/avito/android/arch/mvi/utils/m$b;", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface m<T> {

    /* compiled from: FlowExt.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/arch/mvi/utils/m$a;", "Lcom/avito/android/arch/mvi/utils/m;", "", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements m {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f92109a;

        public a(@Y61.k Throwable th2) {
            this.f92109a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f92109a, ((a) obj).f92109a);
        }

        public final int hashCode() {
            return this.f92109a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Event.Error("), this.f92109a, ')');
        }
    }

    /* compiled from: FlowExt.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/arch/mvi/utils/m$b;", "T", "Lcom/avito/android/arch/mvi/utils/m;", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f92110a;

        public b(T t12) {
            this.f92110a = t12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f92110a, ((b) obj).f92110a);
        }

        public final int hashCode() {
            T t12 = this.f92110a;
            if (t12 == null) {
                return 0;
            }
            return t12.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.n(new StringBuilder("Event.Value("), this.f92110a, ')');
        }
    }
}
