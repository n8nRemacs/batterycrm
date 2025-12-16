package com.avito.android.favorite_comparison.presentation;

import com.avito.android.favorite_comparison.presentation.a;
import com.avito.android.favorite_comparison.presentation.b;
import java.util.List;
import kotlin.Metadata;
import sC.AbstractC48027d;
import sC.InterfaceC48028e;

/* compiled from: FavoriteComparisonViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/avito/android/favorite_comparison/presentation/b;", "apply", "(Ljava/lang/Throwable;)Lcom/avito/android/favorite_comparison/presentation/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class u<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f155373b;

    public u(y yVar) {
        this.f155373b = yVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Throwable th2 = (Throwable) obj;
        y yVar = this.f155373b;
        f fVarP0 = yVar.f155384P.P0();
        List<com.avito.android.favorite_comparison.presentation.items.comparison_list_item.a> list = fVarP0 != null ? fVarP0.f155321c : null;
        if (list == null) {
            return new b.d(yVar.f155379K.a(th2));
        }
        InterfaceC48028e interfaceC48028e = yVar.f155382N;
        yVar.f155385Q.onNext(new AbstractC48027d.a(interfaceC48028e.getF437540a(), interfaceC48028e.getF437541b(), a.C4551a.f155312a));
        return new b.a(list);
    }
}
