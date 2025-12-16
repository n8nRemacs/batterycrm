package com.avito.android.advert_core.contactbar;

import com.avito.android.C29640d;
import kotlin.Metadata;

/* compiled from: AdvertContactsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "show", "Lio/reactivex/rxjava3/core/O;", "apply", "(Z)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28266e f83236b;

    public k(C28266e c28266e) {
        this.f83236b = c28266e;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        com.avito.android.advert_core.advert.c cVar;
        if (((Boolean) obj).booleanValue()) {
            return io.reactivex.rxjava3.core.I.q(Boolean.TRUE);
        }
        C28266e c28266e = this.f83236b;
        c28266e.getClass();
        boolean z12 = System.currentTimeMillis() - c28266e.f83186b0 > 10000;
        if (c28266e.f83184a0 && z12) {
            C29640d c29640d = c28266e.f83199i;
            c29640d.getClass();
            kotlin.reflect.n<Object> nVar = C29640d.f132175X[6];
            if (((Boolean) c29640d.f132205h.a().invoke()).booleanValue() && (cVar = c28266e.f83171O) != null) {
                cVar.ma();
            }
        }
        return io.reactivex.rxjava3.core.I.q(Boolean.FALSE);
    }
}
