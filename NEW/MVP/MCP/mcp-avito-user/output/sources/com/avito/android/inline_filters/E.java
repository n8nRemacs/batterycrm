package com.avito.android.inline_filters;

import com.avito.android.InterfaceC31096k2;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: InlineFiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class E<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f170982b;

    public E(z zVar) {
        this.f170982b = zVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        z zVar = this.f170982b;
        zVar.f172416j.j(th2);
        InterfaceC31096k2 interfaceC31096k2 = zVar.f172385B;
        if (interfaceC31096k2 != null) {
            Boolean boolF = interfaceC31096k2.f();
            interfaceC31096k2.e(boolF != null ? boolF.booleanValue() : false, true);
        }
        V2.f318762a.f(th2);
        zVar.f172395L.accept(th2);
    }
}
