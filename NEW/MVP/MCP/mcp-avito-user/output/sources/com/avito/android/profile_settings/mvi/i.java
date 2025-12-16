package com.avito.android.profile_settings.mvi;

import Db0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.profile_settings.mvi.entity.a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProfileSettingsOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_settings/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/profile_settings/mvi/entity/a;", "LDb0/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements t<com.avito.android.profile_settings.mvi.entity.a, Db0.b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Db0.b b(com.avito.android.profile_settings.mvi.entity.a aVar) {
        if (aVar instanceof a.c) {
            return b.a.f3257a;
        }
        return null;
    }
}
