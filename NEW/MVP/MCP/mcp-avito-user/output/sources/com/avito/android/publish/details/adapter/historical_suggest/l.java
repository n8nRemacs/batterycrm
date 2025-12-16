package com.avito.android.publish.details.adapter.historical_suggest;

import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: HistoricalSuggestsRe23Presenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "id", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class l extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JO.d f233251l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f233252m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(JO.d dVar, m mVar) {
        super(1);
        this.f233251l = dVar;
        this.f233252m = mVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        Object next;
        String str2 = str;
        JO.d dVar = this.f233251l;
        Iterator<T> it = dVar.f8945e.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((JO.c) next).f8938a, str2)) {
                break;
            }
        }
        JO.c cVar = (JO.c) next;
        if (cVar != null) {
            dVar.f8944d = cVar;
            this.f233252m.f233253b.accept(cVar.f8941d);
        }
        return G0.f406611a;
    }
}
