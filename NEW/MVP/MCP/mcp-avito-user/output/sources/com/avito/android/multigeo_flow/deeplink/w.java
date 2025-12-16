package com.avito.android.multigeo_flow.deeplink;

import android.content.Intent;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rv.C47918a;
import sv.C48421d;

/* compiled from: JobMultiGeoFullListDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "emit", "(Lrv/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class w<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f206864b;

    public w(x xVar) {
        this.f206864b = xVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        C47918a c47918a = (C47918a) obj;
        int i12 = c47918a.f437155a;
        x xVar = this.f206864b;
        if (i12 == C48421d.a(xVar) && c47918a.f437156b == -1) {
            Intent intent = c47918a.f437157c;
            String stringExtra = intent != null ? intent.getStringExtra("ARG_RESULT_JWT") : null;
            xVar.j(stringExtra == null ? JobMultiGeoLink.a.d.f206983b : new JobMultiGeoLink.a.e(stringExtra));
        }
        return G0.f406611a;
    }
}
