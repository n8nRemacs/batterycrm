package com.google.mlkit.common;

import com.google.android.gms.common.internal.C36729v;
import j.N;
import j.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
public class MlKitException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @a
    public final int f362288b;

    /* compiled from: com.google.mlkit:common@@18.10.0 */
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @RX0.a
    public MlKitException(@N String str, @a int i12) {
        super(str);
        C36729v.g(str, "Provided message must not be empty.");
        this.f362288b = i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @RX0.a
    public MlKitException(@a int i12, @N String str, @P Exception exc) {
        super(str, exc);
        C36729v.g(str, "Provided message must not be empty.");
        this.f362288b = i12;
    }
}
