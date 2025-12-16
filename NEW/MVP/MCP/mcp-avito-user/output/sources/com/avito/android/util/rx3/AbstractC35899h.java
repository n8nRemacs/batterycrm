package com.avito.android.util.rx3;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DelayedProgress.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/util/rx3/h;", "T", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/util/rx3/h$a;", "Lcom/avito/android/util/rx3/h$b;", "Lcom/avito/android/util/rx3/h$c;", "_common_rx_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.rx3.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC35899h<T> {

    /* compiled from: DelayedProgress.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/rx3/h$a;", "Lcom/avito/android/util/rx3/h;", "", "_common_rx_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.rx3.h$a */
    public static final /* data */ class a extends AbstractC35899h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Throwable f319025a;

        public a(@Y61.k Throwable th2) {
            super(null);
            this.f319025a = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f319025a, ((a) obj).f319025a);
        }

        public final int hashCode() {
            return this.f319025a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(error="), this.f319025a, ')');
        }
    }

    /* compiled from: DelayedProgress.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/rx3/h$b;", "T", "Lcom/avito/android/util/rx3/h;", "_common_rx_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.rx3.h$b */
    public static final /* data */ class b<T> extends AbstractC35899h<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f319026a;

        public b(T t12) {
            super(null);
            this.f319026a = t12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.L.f(this.f319026a, ((b) obj).f319026a);
        }

        public final int hashCode() {
            T t12 = this.f319026a;
            if (t12 == null) {
                return 0;
            }
            return t12.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.foundation.H.n(new StringBuilder("Loaded(data="), this.f319026a, ')');
        }
    }

    /* compiled from: DelayedProgress.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/rx3/h$c;", "Lcom/avito/android/util/rx3/h;", "", "<init>", "()V", "_common_rx_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.util.rx3.h$c */
    public static final class c extends AbstractC35899h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f319027a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC35899h(C42822w c42822w) {
        this();
    }

    public AbstractC35899h() {
    }
}
