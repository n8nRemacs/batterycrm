package com.avito.android.success_screen_after_apply.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.success_screen_after_apply.mvi.i;
import com.avito.android.success_screen_after_apply.mvi.j;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SuccessScreenAfterApplyOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/success_screen_after_apply/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/success_screen_after_apply/mvi/i;", "Lcom/avito/android/success_screen_after_apply/mvi/j;", "<init>", "()V", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements t<i, j> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final j b(i iVar) {
        i iVar2 = iVar;
        if (iVar2 instanceof i.a) {
            return new j.a(((i.a) iVar2).f291740a);
        }
        if (iVar2 instanceof i.b) {
            return new j.b(((i.b) iVar2).f291741a);
        }
        return null;
    }
}
