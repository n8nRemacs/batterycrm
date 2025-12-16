package com.avito.android.advertising.loaders;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NoAdException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/NoAdException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class NoAdException extends Exception {
    public NoAdException() {
        this(null, 1, null);
    }

    public NoAdException(String str, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? "" : str);
    }
}
