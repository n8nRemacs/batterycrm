package com.avito.android.recall_me.presentation;

import com.avito.android.recall_me.domain.h;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import zi0.InterfaceC50572b;
import zi0.InterfaceC50573c;

/* compiled from: RecallMeViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/recall_me/domain/h$b;", "it", "Lzi0/c;", "apply", "(Lcom/avito/android/recall_me/domain/h$b;)Lzi0/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class D<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f251873b;

    public D(I i12) {
        this.f251873b = i12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        h.b bVar = (h.b) obj;
        boolean z12 = bVar instanceof h.b.d;
        I i12 = this.f251873b;
        if (z12) {
            h.b.d dVar = (h.b.d) bVar;
            i12.f251886Q.accept(new InterfaceC50572b.c(dVar.f251846a, dVar.f251847b));
            return InterfaceC50573c.a.f444190a;
        }
        if (bVar instanceof h.b.c) {
            i12.f251890U = true;
            return new InterfaceC50573c.C12969c(((h.b.c) bVar).f251844a);
        }
        if (bVar instanceof h.b.C7557b) {
            i12.f251886Q.accept(new InterfaceC50572b.e(((h.b.C7557b) bVar).f251843a));
            return InterfaceC50573c.a.f444190a;
        }
        if (!(bVar instanceof h.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        i12.f251886Q.accept(new InterfaceC50572b.C12968b(((h.b.a) bVar).f251842a, null, 2, null));
        return InterfaceC50573c.a.f444190a;
    }
}
