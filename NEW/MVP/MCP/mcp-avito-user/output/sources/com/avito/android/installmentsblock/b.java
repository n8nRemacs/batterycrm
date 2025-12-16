package com.avito.android.installmentsblock;

import Y41.l;
import com.avito.android.installments_block.entity.InstallmentsButton;
import dO.InterfaceC39605a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsBlockViewImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsButton;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/installments_block/entity/InstallmentsButton;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements l<InstallmentsButton, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f172888l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar) {
        super(1);
        this.f172888l = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(InstallmentsButton installmentsButton) {
        e.b(this.f172888l).accept(new InterfaceC39605a.C11025a(installmentsButton));
        return G0.f406611a;
    }
}
