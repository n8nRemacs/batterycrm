package com.avito.android.mvi.rx3.with_monolithic_state;

import androidx.compose.runtime.C22026a;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.I;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Reducible.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mvi/rx3/with_monolithic_state/n;", "", "S", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public class n<S> implements x<S> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f207165a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f207166b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<List<x<S>>> f207167c;

    /* compiled from: Reducible.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "S", "", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<List<? extends p<S>>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f207168l = new a();

        public a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final Object invoke() {
            return Collections.singletonList(new p(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
        }
    }

    public n() {
        this(null, null, null, 7, null);
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.x
    @Y61.k
    public final I<S> a(@Y61.k S s5) {
        V2.f318762a.d("BaseMviEntityWithReducerQueue", this + ": CompositeReducible can't be executed directly!");
        return I.q(s5);
    }

    @Y61.k
    public Y41.a<List<x<S>>> b() {
        return this.f207167c;
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.x
    public final void c(@Y61.k l41.g<x<S>> gVar) {
        Iterator<T> it = b().invoke().iterator();
        while (it.hasNext()) {
            ((x) it.next()).c(gVar);
        }
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f207165a);
        sb2.append('(');
        return C22026a.c(sb2, this.f207166b, ')');
    }

    public n(String str, String str2, Y41.a aVar, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? "" : str;
        str2 = (i12 & 2) != 0 ? "" : str2;
        aVar = (i12 & 4) != 0 ? a.f207168l : aVar;
        this.f207165a = str;
        this.f207166b = str2;
        this.f207167c = aVar;
    }
}
