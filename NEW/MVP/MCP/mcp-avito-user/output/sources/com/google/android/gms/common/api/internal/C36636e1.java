package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.InterfaceC37020c;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: com.google.android.gms.common.api.internal.e1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C36636e1 implements InterfaceC37020c {
    @Override // com.google.android.gms.tasks.InterfaceC37020c
    public final Object then(@j.N Task task) throws ApiException {
        if (((Boolean) task.n()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered", null, null));
    }
}
