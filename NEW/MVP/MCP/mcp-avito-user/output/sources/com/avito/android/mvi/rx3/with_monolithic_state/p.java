package com.avito.android.mvi.rx3.with_monolithic_state;

import androidx.compose.runtime.C22026a;
import io.reactivex.rxjava3.core.I;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;

/* compiled from: Reducible.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "", "S", "Lcom/avito/android/mvi/rx3/with_monolithic_state/x;", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public class p<S> implements x<S> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f207172a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<S, I<S>> f207173b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f207174c;

    /* compiled from: Reducible.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<S, I<S>> {
        @Override // Y41.l
        public final Object invoke(Object obj) {
            return ((p) this.receiver).b(obj);
        }
    }

    public p(@Y61.k String str, @Y61.k String str2) {
        this.f207172a = str.length() == 0 ? getClass().getSimpleName() : str;
        this.f207174c = str2;
        this.f207173b = new a(1, this, p.class, "invoke", "invoke(Ljava/lang/Object;)Lio/reactivex/rxjava3/core/Single;", 0);
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.x
    @Y61.k
    public final I<S> a(@Y61.k S s5) {
        return this.f207173b.invoke(s5);
    }

    @Y61.k
    public I<S> b(@Y61.k S s5) {
        return I.q(s5);
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.x
    public final void c(@Y61.k l41.g<x<S>> gVar) {
        gVar.accept(this);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f207172a);
        sb2.append('(');
        return C22026a.c(sb2, this.f207174c, ')');
    }

    public /* synthetic */ p(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2);
    }

    public /* synthetic */ p(String str, String str2, Y41.l lVar, int i12, C42822w c42822w) {
        this(lVar, (i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2);
    }

    public p(@Y61.k Y41.l lVar, @Y61.k String str, @Y61.k String str2) {
        this.f207172a = str.length() == 0 ? getClass().getSimpleName() : str;
        this.f207174c = str2;
        this.f207173b = lVar;
    }
}
