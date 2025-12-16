package com.avito.android.work_profile.profile.gig.mvi;

import com.avito.android.arch.mvi.u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import oQ0.C44681c;
import oQ0.InterfaceC44680b;

/* compiled from: GigReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/mvi/i;", "Lcom/avito/android/arch/mvi/u;", "LoQ0/b;", "LoQ0/c;", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements u<InterfaceC44680b, C44681c> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C44681c a(InterfaceC44680b interfaceC44680b, C44681c c44681c) {
        InterfaceC44680b interfaceC44680b2 = interfaceC44680b;
        C44681c c44681c2 = c44681c;
        if (interfaceC44680b2 instanceof InterfaceC44680b.a) {
            return new C44681c(((InterfaceC44680b.a) interfaceC44680b2).f419762a, true, false, false);
        }
        if (interfaceC44680b2 instanceof InterfaceC44680b.C12188b) {
            return C44681c.a(c44681c2, false, true);
        }
        if (interfaceC44680b2 instanceof InterfaceC44680b.c) {
            return C44681c.a(c44681c2, true, false);
        }
        throw new NoWhenBranchMatchedException();
    }
}
