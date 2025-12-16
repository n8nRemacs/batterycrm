package com.avito.android.publish.merge_pretend_premoderation;

import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.util.AbstractC35806h3;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import re0.AbstractC47644b;

/* compiled from: MergePretendPremoderationViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class h extends H implements Y41.l<AbstractC35806h3<? super PretendResult>, G0> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(AbstractC35806h3<? super PretendResult> abstractC35806h3) {
        AbstractC47644b aVar;
        AbstractC35806h3<? super PretendResult> abstractC35806h32 = abstractC35806h3;
        j jVar = (j) this.receiver;
        jVar.getClass();
        if (abstractC35806h32 instanceof AbstractC35806h3.a) {
            aVar = new AbstractC47644b.a(((AbstractC35806h3.a) abstractC35806h32).f318890a.getF244063c());
        } else if (abstractC35806h32 instanceof AbstractC35806h3.d) {
            Map<String, PretendErrorValue> errors = ((PretendResult) ((AbstractC35806h3.d) abstractC35806h32).f318893a).getErrors();
            aVar = (errors.isEmpty() || !jVar.f237428L.ze(errors)) ? AbstractC47644b.AbstractC12386b.C12387b.f429942a : AbstractC47644b.AbstractC12386b.a.f429941a;
        } else {
            aVar = AbstractC47644b.c.f429943a;
        }
        jVar.f237433Q = aVar;
        jVar.le();
        return G0.f406611a;
    }
}
