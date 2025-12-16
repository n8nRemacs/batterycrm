package io.ktor.utils.io.core;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Buffer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/utils/io/core/InsufficientSpaceException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InsufficientSpaceException extends Exception {
    public InsufficientSpaceException() {
        this((String) null, 1, (C42822w) null);
    }

    public InsufficientSpaceException(String str, int i12, C42822w c42822w) {
        super((i12 & 1) != 0 ? "Not enough free space" : str);
    }

    public InsufficientSpaceException(@Y61.k String str, int i12, int i13) {
        StringBuilder sb2 = new StringBuilder("Not enough free space to write ");
        sb2.append(str);
        sb2.append(" of ");
        sb2.append(i12);
        sb2.append(" bytes, available ");
        super(AK.c.i(i13, " bytes.", sb2));
    }
}
