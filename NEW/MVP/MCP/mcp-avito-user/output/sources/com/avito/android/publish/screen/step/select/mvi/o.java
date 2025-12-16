package com.avito.android.publish.screen.step.select.mvi;

import Ne0.InterfaceC14567b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/step/select/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "LNe0/b;", "LNe0/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o implements u<InterfaceC14567b, Ne0.d> {
    @Inject
    public o() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Ne0.d a(InterfaceC14567b interfaceC14567b, Ne0.d dVar) {
        InterfaceC14567b interfaceC14567b2 = interfaceC14567b;
        Ne0.d dVar2 = dVar;
        if (interfaceC14567b2 instanceof InterfaceC14567b.C0751b) {
            InterfaceC14567b.C0751b c0751b = (InterfaceC14567b.C0751b) interfaceC14567b2;
            return Ne0.d.a(dVar2, c0751b.f11671a, 0, c0751b.f11672b, 2);
        }
        if (interfaceC14567b2 instanceof InterfaceC14567b.a) {
            return Ne0.d.a(dVar2, null, ((InterfaceC14567b.a) interfaceC14567b2).f11670a, false, 5);
        }
        if (interfaceC14567b2.equals(InterfaceC14567b.c.f11673a) ? true : interfaceC14567b2 instanceof InterfaceC14567b.d ? true : interfaceC14567b2 instanceof InterfaceC14567b.e) {
            return dVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
