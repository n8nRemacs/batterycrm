package com.avito.android.fakedoor_dialog.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.deeplink_handler.handler.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import mC.InterfaceC43944b;
import mC.c;

/* compiled from: FakeDoorDialogOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/fakedoor_dialog/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "LmC/b;", "LmC/c;", "_avito_fakedoor-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements t<InterfaceC43944b, mC.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f155146b;

    @Inject
    public i(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f155146b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final mC.c b(InterfaceC43944b interfaceC43944b) {
        InterfaceC43944b interfaceC43944b2 = interfaceC43944b;
        if (interfaceC43944b2 instanceof InterfaceC43944b.a) {
            return c.a.f414395a;
        }
        if (interfaceC43944b2 instanceof InterfaceC43944b.C11818b) {
            b.a.a(this.f155146b, ((InterfaceC43944b.C11818b) interfaceC43944b2).f414393a, null, null, 6);
        } else if (!(interfaceC43944b2 instanceof InterfaceC43944b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }
}
