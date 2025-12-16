package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.B;
import com.google.android.gms.common.api.internal.InterfaceC36652k;
import com.google.android.gms.common.internal.C36695c;
import com.google.android.gms.tasks.C37028k;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@18.0.2 */
/* loaded from: classes6.dex */
final class zzo extends InterfaceC36652k.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C37028k f349965a;

    public zzo(C37028k c37028k) {
        this.f349965a = c37028k;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC36652k
    public final void onResult(Status status) {
        int i12 = status.f348905b;
        C37028k c37028k = this.f349965a;
        if (i12 == 6) {
            c37028k.c(C36695c.a(status));
        } else {
            B.a(status, null, c37028k);
        }
    }
}
