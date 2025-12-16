package com.avito.android.payment.lib;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaymentMethodsView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class l extends N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33021f f214683l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C33021f c33021f) {
        super(1);
        this.f214683l = c33021f;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        Boolean bool2 = bool;
        C33021f c33021f = this.f214683l;
        c33021f.f214665l.setLoading(bool2.booleanValue());
        c33021f.f214671r.accept(bool2);
        return G0.f406611a;
    }
}
