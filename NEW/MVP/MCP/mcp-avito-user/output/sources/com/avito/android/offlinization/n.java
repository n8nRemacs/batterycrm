package com.avito.android.offlinization;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;

/* compiled from: Offlinize.kt */
@Retention(RetentionPolicy.RUNTIME)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0002\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/offlinization/n;", "", "", "", "includeOnlyQuery", "excludeQuery", "Lcom/avito/android/offlinization/o;", "excludeQueryIfDefault", "<init>", "(Lkotlin/Array;Lkotlin/Array;Lkotlin/Array;)V", "_common_offlinization_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public @interface n {
    String[] excludeQuery() default {};

    o[] excludeQueryIfDefault() default {};

    String[] includeOnlyQuery() default {};
}
