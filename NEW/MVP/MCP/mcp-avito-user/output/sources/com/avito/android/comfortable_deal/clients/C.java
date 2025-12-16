package com.avito.android.comfortable_deal.clients;

import androidx.compose.foundation.lazy.InterfaceC20793y;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ClientsScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class C extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20793y, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f120091l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Y41.a<G0> aVar) {
        super(3);
        this.f120091l = aVar;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20793y interfaceC20793y, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            C29444u.a(u0.i.c(a13, R.string.error_title), u0.i.c(a13, R.string.error_message_comfortable_deal), null, u0.i.c(a13, R.string.error_update), this.f120091l, a13, 0, 4);
        }
        return G0.f406611a;
    }
}
