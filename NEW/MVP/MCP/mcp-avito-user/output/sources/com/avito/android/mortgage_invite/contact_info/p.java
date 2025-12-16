package com.avito.android.mortgage_invite.contact_info;

import androidx.compose.foundation.lazy.InterfaceC20793y;
import b20.e;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApplicationContactInfoScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class p extends N implements Y41.q<InterfaceC20793y, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e.a f205748l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ContactInfoFieldId, Boolean, G0> f205749m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ContactInfoFieldId, String, G0> f205750n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(e.a aVar, Y41.p<? super ContactInfoFieldId, ? super Boolean, G0> pVar, Y41.p<? super ContactInfoFieldId, ? super String, G0> pVar2) {
        super(3);
        this.f205748l = aVar;
        this.f205749m = pVar;
        this.f205750n = pVar2;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20793y interfaceC20793y, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            com.avito.android.mortgage_invite.common.presentation.a.a(this.f205748l.f56849a.f20714f, this.f205749m, this.f205750n, null, a13, 8, 8);
        }
        return G0.f406611a;
    }
}
