package com.avito.android.recall_me.presentation;

import kotlin.Metadata;
import zi0.InterfaceC50572b;
import zi0.InterfaceC50573c;

/* compiled from: RecallMeViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzi0/c;", "apply", "(Ljava/lang/Throwable;)Lzi0/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class z<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f252036b;

    public z(I i12) {
        this.f252036b = i12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        I i12 = this.f252036b;
        boolean z12 = i12.f251885P.getValue() instanceof InterfaceC50573c.C12969c;
        C34240j c34240j = i12.f251882M;
        if (!z12) {
            return new InterfaceC50573c.b(c34240j.f252014h);
        }
        i12.f251886Q.accept(new InterfaceC50572b.e(c34240j.f252014h));
        return InterfaceC50573c.a.f444190a;
    }
}
