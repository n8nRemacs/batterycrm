package com.avito.android.early_access;

import androidx.compose.runtime.internal.P;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.util.C35966w1;
import kotlin.Metadata;

/* compiled from: EarlyAccessDialogFactory.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/early_access/p;", "Lcom/avito/android/early_access/o;", "<init>", "()V", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class p implements o {
    @Override // com.avito.android.early_access.o
    @Y61.k
    public final EarlyAccessDialog a(@Y61.k ReEarlyAccessData reEarlyAccessData) {
        EarlyAccessDialog.f145055q0.getClass();
        EarlyAccessDialog earlyAccessDialog = new EarlyAccessDialog();
        C35966w1.a(earlyAccessDialog, -1, new f(reEarlyAccessData));
        return earlyAccessDialog;
    }
}
