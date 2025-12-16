package com.avito.android.entry_point_client_room.report.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.entry_point_client_room.report.mvi.entity.SendReportInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import sz.AbstractC48439d;

/* compiled from: SendReportOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/entry_point_client_room/report/mvi/g;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction;", "Lsz/d;", "<init>", "()V", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements t<SendReportInternalAction, AbstractC48439d> {
    @Inject
    public g() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final AbstractC48439d b(SendReportInternalAction sendReportInternalAction) {
        SendReportInternalAction sendReportInternalAction2 = sendReportInternalAction;
        if (sendReportInternalAction2.equals(SendReportInternalAction.Close.f147715b)) {
            return AbstractC48439d.a.f438948a;
        }
        if (sendReportInternalAction2.equals(SendReportInternalAction.CloseWithOkResult.f147716b)) {
            return AbstractC48439d.b.f438949a;
        }
        return null;
    }
}
