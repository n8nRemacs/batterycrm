package com.avito.android.search.filter.preloading;

import com.avito.android.util.P2;
import kotlin.Metadata;
import l41.o;

/* compiled from: FiltersTreePreloadable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/SearchParameters;", "apply", "(Ljava/lang/Throwable;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f263776b;

    public f(g gVar) {
        this.f263776b = gVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new P2.a(this.f263776b.f263783g.a((Throwable) obj));
    }
}
