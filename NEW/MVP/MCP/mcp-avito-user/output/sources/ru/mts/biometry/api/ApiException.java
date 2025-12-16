package ru.mts.biometry.api;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ApiException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/mts/biometry/api/ApiException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ApiException extends Exception {
    public ApiException(int i12, String str, String str2, int i13, C42822w c42822w) {
        super(AK.c.g(i12, "Api returned code: "));
    }
}
