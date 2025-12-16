package com.google.firebase;

import com.google.android.gms.common.api.C36621f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC36679y;
import j.N;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* loaded from: classes10.dex */
public class j implements InterfaceC36679y {
    @Override // com.google.android.gms.common.api.internal.InterfaceC36679y
    @N
    public final Exception a(@N Status status) {
        int i12 = status.f348905b;
        int i13 = status.f348905b;
        String strA = status.f348906c;
        if (i12 == 8) {
            if (strA == null) {
                strA = C36621f.a(i13);
            }
            return new FirebaseException(strA);
        }
        if (strA == null) {
            strA = C36621f.a(i13);
        }
        return new FirebaseApiNotAvailableException(strA);
    }
}
