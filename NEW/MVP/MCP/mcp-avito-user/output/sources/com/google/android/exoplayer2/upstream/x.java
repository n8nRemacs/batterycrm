package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.z;
import j.P;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: DefaultLoadErrorHandlingPolicy.java */
/* loaded from: classes6.dex */
public class x implements z {
    @Override // com.google.android.exoplayer2.upstream.z
    public final int a(int i12) {
        return i12 == 7 ? 6 : 3;
    }

    @Override // com.google.android.exoplayer2.upstream.z
    public final long b(z.d dVar) {
        Throwable cause = dVar.f348024a;
        if (!(cause instanceof ParserException) && !(cause instanceof FileNotFoundException) && !(cause instanceof HttpDataSource.CleartextNotPermittedException) && !(cause instanceof Loader.UnexpectedLoaderException)) {
            int i12 = DataSourceException.f347726c;
            while (cause != null) {
                if (!(cause instanceof DataSourceException) || ((DataSourceException) cause).f347727b != 2008) {
                    cause = cause.getCause();
                }
            }
            return Math.min((dVar.f348025b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.upstream.z
    @P
    public final z.b c(z.a aVar, z.d dVar) {
        int i12;
        IOException iOException = dVar.f348024a;
        if ((iOException instanceof HttpDataSource.InvalidResponseCodeException) && (((i12 = ((HttpDataSource.InvalidResponseCodeException) iOException).f347735e) == 403 || i12 == 404 || i12 == 410 || i12 == 416 || i12 == 500 || i12 == 503) && aVar.f348020a - aVar.f348021b > 1)) {
            return new z.b(2, 60000L);
        }
        return null;
    }
}
