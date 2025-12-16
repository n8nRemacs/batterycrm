package com.avito.android.zstd;

import com.github.luben.zstd.Zstd;
import com.github.luben.zstd.ZstdInputStreamNoFinalizer;
import com.github.luben.zstd.ZstdOutputStreamNoFinalizer;
import java.io.BufferedOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43047d;

/* compiled from: ZstdCompressor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/zstd/f;", "Lcom/avito/android/zstd/e;", "<init>", "()V", "_common_zstd_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements e {
    @Inject
    public f() {
    }

    @Override // com.avito.android.zstd.e
    @Y61.k
    public final byte[] b(@Y61.k String str) {
        return Zstd.compress(str.getBytes(C43047d.f410589b), 4);
    }

    @Override // com.avito.android.zstd.e
    public final ZstdInputStreamNoFinalizer c(InputStream inputStream) {
        return new ZstdInputStreamNoFinalizer(inputStream);
    }

    @Override // com.avito.android.zstd.e
    @Y61.k
    public final ZstdOutputStreamNoFinalizer d(@Y61.k OutputStream outputStream) {
        return new ZstdOutputStreamNoFinalizer(outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192), 4);
    }
}
