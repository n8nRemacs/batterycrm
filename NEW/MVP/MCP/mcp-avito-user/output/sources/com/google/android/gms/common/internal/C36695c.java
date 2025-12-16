package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.internal.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36695c {
    @j.N
    @RX0.a
    public static ApiException a(@j.N Status status) {
        return status.f348907d != null ? new ResolvableApiException(status) : new ApiException(status);
    }
}
