package androidx.media3.exoplayer.upstream;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.J;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.l;
import java.io.FileNotFoundException;

/* compiled from: DefaultLoadErrorHandlingPolicy.java */
@J
/* loaded from: classes.dex */
public class k implements l {
    @Override // androidx.media3.exoplayer.upstream.l
    public final int a(int i12) {
        return i12 == 7 ? 6 : 3;
    }

    @Override // androidx.media3.exoplayer.upstream.l
    public final long b(l.d dVar) {
        Throwable cause = dVar.f50153a;
        if (!(cause instanceof ParserException) && !(cause instanceof FileNotFoundException) && !(cause instanceof HttpDataSource.CleartextNotPermittedException) && !(cause instanceof Loader.UnexpectedLoaderException)) {
            int i12 = DataSourceException.f48171c;
            while (cause != null) {
                if (!(cause instanceof DataSourceException) || ((DataSourceException) cause).f48172b != 2008) {
                    cause = cause.getCause();
                }
            }
            return Math.min((dVar.f50154b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }
}
