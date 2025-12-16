package com.avito.android.fakedoor_dialog.mvi;

import com.avito.android.fakedoor_dialog.FakeDoorDialogParams;
import jC.InterfaceC42231a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.InterfaceC43160i;
import mC.InterfaceC43944b;
import nC.InterfaceC44228a;

/* compiled from: FakeDoorDialogBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fakedoor_dialog/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "LmC/b;", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.arch.mvi.b<InterfaceC43944b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FakeDoorDialogParams f155131a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42231a f155132b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44228a f155133c;

    @Inject
    public d(@Y61.k FakeDoorDialogParams fakeDoorDialogParams, @Y61.k InterfaceC42231a interfaceC42231a, @Y61.k InterfaceC44228a interfaceC44228a) {
        this.f155131a = fakeDoorDialogParams;
        this.f155132b = interfaceC42231a;
        this.f155133c = interfaceC44228a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC43944b> a() {
        FakeDoorDialogParams fakeDoorDialogParams = this.f155131a;
        this.f155133c.a(fakeDoorDialogParams.f155100b);
        this.f155132b.c(fakeDoorDialogParams.f155100b, fakeDoorDialogParams.f155103e);
        return new C43207v(new InterfaceC43944b[0]);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
