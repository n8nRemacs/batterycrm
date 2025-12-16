package com.avito.android.api;

import com.avito.android.P;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApiErrorsHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class i extends N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f91318l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar) {
        super(1);
        this.f91318l = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        Throwable th3 = th2;
        k kVar = this.f91318l;
        P p12 = kVar.f91327h;
        kotlin.reflect.n<Object> nVar = P.f67370w0[62];
        if (((Boolean) p12.f67392V.a().invoke()).booleanValue()) {
            kVar.f91321b.c(new NonFatalErrorEvent("Unexpected error in ApiErrorsHandler", th3, null, null, 12, null));
        }
        return G0.f406611a;
    }
}
