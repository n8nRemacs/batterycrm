package com.avito.android.payment.deeplink;

import com.avito.android.util.V2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SbpPaymentAppLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lkotlin/G0;", "invoke", "(Ljava/lang/Exception;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class B extends N implements Y41.l<Exception, G0> {

    /* renamed from: l, reason: collision with root package name */
    public static final B f214006l = new B();

    public B() {
        super(1);
    }

    @Override // Y41.l
    public final G0 invoke(Exception exc) {
        V2.f318762a.a("SbpPaymentAppLinkHandler", "StartActivityError", exc);
        return G0.f406611a;
    }
}
