package com.avito.android.beduin.common.component.input;

import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TextValidator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/common/component/input/k;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/beduin/common/component/input/k$a;", "Lcom/avito/android/beduin/common/component/input/k$b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class k {

    /* compiled from: TextValidator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/input/k$a;", "Lcom/avito/android/beduin/common/component/input/k;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f101560a;

        public a(@Y61.k String str) {
            super(null);
            this.f101560a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f101560a, ((a) obj).f101560a);
        }

        public final int hashCode() {
            return this.f101560a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Invalid(errorText="), this.f101560a, ')');
        }
    }

    /* compiled from: TextValidator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/input/k$b;", "Lcom/avito/android/beduin/common/component/input/k;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f101561a = new b();

        public b() {
            super(null);
        }
    }

    public /* synthetic */ k(C42822w c42822w) {
        this();
    }

    public k() {
    }
}
