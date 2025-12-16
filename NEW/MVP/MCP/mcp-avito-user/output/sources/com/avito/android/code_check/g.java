package com.avito.android.code_check;

import android.os.SystemClock;
import androidx.view.C23060r0;
import androidx.view.M0;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.s0;

/* compiled from: CodeCheckDataViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/code_check/g;", "Lcom/avito/android/code_check/d;", "Landroidx/lifecycle/M0;", "Landroidx/lifecycle/r0;", "stateHandle", "<init>", "(Landroidx/lifecycle/r0;)V", "a", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends M0 implements d {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final C23060r0 f118826E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final a<Long> f118827J = new a<>(0L, "timeout");

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final a<String> f118828K = new a<>(null, "phone");

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final a<List<String>> f118829L = new a<>(C42784z0.f406748b, "phones");

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final a<Integer> f118830M = new a<>(null, "codeLen");

    /* compiled from: CodeCheckDataViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/g$a;", "T", "", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Serializable f118831a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f118832b;

        public a(Serializable serializable, @Y61.k String str) {
            this.f118831a = serializable;
            this.f118832b = str;
        }

        @Y61.l
        public final T a() {
            return (T) g.this.f118826E.b(this.f118832b);
        }

        public final void b(T t12) {
            if (a() != null) {
                T tA2 = a();
                Collection collection = tA2 instanceof Collection ? (Collection) tA2 : null;
                if (collection == null || !collection.isEmpty()) {
                    return;
                }
            }
            g.this.f118826E.e(t12, this.f118832b);
        }
    }

    public g(@Y61.k C23060r0 c23060r0) {
        this.f118826E = c23060r0;
    }

    @Override // com.avito.android.code_check.d
    @Y61.k
    public final a<String> G3() {
        return this.f118828K;
    }

    @Override // com.avito.android.code_check.d
    @Y61.k
    public final a<Integer> G5() {
        return this.f118830M;
    }

    @Override // com.avito.android.code_check.d
    @Y61.k
    public final a<List<String>> R5() {
        return this.f118829L;
    }

    @Override // com.avito.android.code_check.d
    @Y61.l
    public final G0 f7(@Y61.k CodeCheckData codeCheckData, @Y61.k Continuation continuation) {
        G0 g0Q4;
        String str = codeCheckData.f118613c;
        if (str != null) {
            this.f118828K.b(str);
        }
        this.f118829L.b(codeCheckData.f118615e);
        Integer num = codeCheckData.f118614d;
        if (num != null) {
            this.f118830M.b(Boxing.boxInt(num.intValue()));
        }
        Long l12 = codeCheckData.f118612b;
        if (l12 != null) {
            long jLongValue = l12.longValue();
            if (this.f118827J.a() == null && (g0Q4 = q4(Boxing.boxLong(jLongValue))) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return g0Q4;
            }
        }
        return G0.f406611a;
    }

    @Override // com.avito.android.code_check.d
    @Y61.l
    public final G0 q4(@Y61.l Long l12) {
        if (l12 != null) {
            Long lBoxLong = Boxing.boxLong((SystemClock.elapsedRealtime() / 1000) + l12.longValue());
            a<Long> aVar = this.f118827J;
            g.this.f118826E.e(lBoxLong, aVar.f118832b);
        }
        return G0.f406611a;
    }

    @Override // com.avito.android.code_check.d
    @Y61.k
    public final h x8() {
        a<Long> aVar = this.f118827J;
        g gVar = g.this;
        return new h(gVar.f118826E.c(aVar.f118832b, aVar.f118831a), this);
    }
}
