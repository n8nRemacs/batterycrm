package com.google.firebase;

import com.google.android.gms.common.internal.C36729v;
import j.N;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes10.dex */
public class FirebaseException extends Exception {
    @Deprecated
    public FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(@N String str) {
        super(str);
        C36729v.g(str, "Detail message must not be empty");
    }
}
