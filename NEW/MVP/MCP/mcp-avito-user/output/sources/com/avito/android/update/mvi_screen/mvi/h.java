package com.avito.android.update.mvi_screen.mvi;

import GG0.b;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.update.mvi_screen.mvi.entity.UpdateApplicationInternalAction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UpdateApplicationOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/update/mvi_screen/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/update/mvi_screen/mvi/entity/UpdateApplicationInternalAction;", "LGG0/b;", "<init>", "()V", "_avito_update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements t<UpdateApplicationInternalAction, GG0.b> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final h f306699b = new h();

    @Override // com.avito.android.arch.mvi.t
    public final GG0.b b(UpdateApplicationInternalAction updateApplicationInternalAction) {
        UpdateApplicationInternalAction updateApplicationInternalAction2 = updateApplicationInternalAction;
        if (updateApplicationInternalAction2 instanceof UpdateApplicationInternalAction.OpenPlayStore) {
            return b.a.f6400a;
        }
        if (updateApplicationInternalAction2 instanceof UpdateApplicationInternalAction.ShowNoAppInstalledForIntentError) {
            return b.C0339b.f6401a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
