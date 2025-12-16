package com.avito.android.mvi.rx3.with_monolithic_state;

import androidx.compose.runtime.C22026a;
import io.reactivex.rxjava3.core.I;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: Reducible.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mvi/rx3/with_monolithic_state/b;", "", "S", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mvi.rx3.with_monolithic_state.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C32891b<S> implements x<S> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f207128a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<S, I<?>> f207129b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f207130c;

    /* compiled from: Reducible.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mvi.rx3.with_monolithic_state.b$a */
    public /* synthetic */ class a extends H implements Y41.l<S, I<?>> {
        @Override // Y41.l
        public final I<?> invoke(Object obj) {
            return ((C32891b) this.receiver).b(obj);
        }
    }

    public C32891b() {
        throw null;
    }

    public C32891b(@Y61.k String str, @Y61.k String str2) {
        this.f207128a = str.length() == 0 ? getClass().getSimpleName() : str;
        this.f207130c = str2;
        this.f207129b = new a(1, this, C32891b.class, "invoke", "invoke(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/Single;", 0);
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.x
    @Y61.k
    public final I<S> a(@Y61.k S s5) {
        return new p(new B(this), this.f207128a, this.f207130c).f207173b.invoke(s5);
    }

    @Y61.k
    public I<?> b(@Y61.k S s5) {
        return I.q(G0.f406611a);
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.x
    public final void c(@Y61.k l41.g<x<S>> gVar) {
        gVar.accept(this);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f207128a);
        sb2.append('(');
        return C22026a.c(sb2, this.f207130c, ')');
    }

    public /* synthetic */ C32891b(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2);
    }

    public C32891b(String str, String str2, Y41.l lVar, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? "" : str;
        str2 = (i12 & 2) != 0 ? "" : str2;
        this.f207128a = str.length() == 0 ? getClass().getSimpleName() : str;
        this.f207130c = str2;
        this.f207129b = lVar;
    }
}
