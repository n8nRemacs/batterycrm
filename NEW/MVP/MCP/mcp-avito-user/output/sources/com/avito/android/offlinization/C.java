package com.avito.android.offlinization;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: Offlinize.kt */
@Target({ElementType.METHOD})
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/offlinization/C;", "", "", "timeoutMs", "<init>", "(J)V", "_common_offlinization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@P41.d
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes15.dex */
public @interface C {
    long timeoutMs();
}
