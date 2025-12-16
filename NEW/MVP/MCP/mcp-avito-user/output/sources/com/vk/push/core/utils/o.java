package com.vk.push.core.utils;

import android.os.Parcelable;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import com.vk.push.core.base.AidlException;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import kotlin.C42729a0;
import kotlin.Metadata;

/* compiled from: ResultExtensions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk-public-push-core_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class o {
    @Y61.k
    public static final <T extends Parcelable> AidlResult<?> a(@Y61.k Object obj) {
        try {
            AidlResult.b bVar = AidlResult.f367014c;
            C42729a0.b(obj);
            bVar.getClass();
            return new AidlResult<>((Parcelable) obj);
        } catch (Exception e12) {
            AidlResult.f367014c.getClass();
            String strValueOf = String.valueOf(e12.getMessage());
            return new AidlResult<>(e12 instanceof HostIsNotMasterException ? new AidlException(103, strValueOf) : e12 instanceof IllegalStateException ? new AidlException(102, strValueOf) : e12 instanceof IllegalArgumentException ? new AidlException(UpdateStatusCode.DialogButton.CONFIRM, strValueOf) : e12 instanceof RuntimeException ? new AidlException(100, strValueOf) : new AidlException(0, strValueOf));
        }
    }
}
