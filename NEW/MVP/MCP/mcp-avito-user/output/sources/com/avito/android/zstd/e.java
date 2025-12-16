package com.avito.android.zstd;

import com.github.luben.zstd.ZstdInputStreamNoFinalizer;
import com.github.luben.zstd.ZstdOutputStreamNoFinalizer;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;

/* compiled from: ZstdCompressor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/zstd/e;", "", "_common_zstd_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface e {
    @Y61.k
    byte[] b(@Y61.k String str);

    @Y61.k
    ZstdInputStreamNoFinalizer c(@Y61.k InputStream inputStream);

    @Y61.k
    ZstdOutputStreamNoFinalizer d(@Y61.k OutputStream outputStream);
}
