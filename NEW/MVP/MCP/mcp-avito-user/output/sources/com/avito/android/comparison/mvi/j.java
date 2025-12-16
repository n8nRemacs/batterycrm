package com.avito.android.comparison.mvi;

import Rq.b;
import com.avito.android.component.toast.f;
import kotlin.Metadata;

/* compiled from: ComparisonActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LRq/b;", "apply", "(Ljava/lang/Throwable;)LRq/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f124136b;

    public j(m mVar) {
        this.f124136b = mVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String strJ = com.avito.android.error.z.j((Throwable) obj);
        if (strJ == null) {
            strJ = this.f124136b.f124144d.getF123905c();
        }
        return new b.k(strJ, f.a.f125253a);
    }
}
