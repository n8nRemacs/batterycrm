package androidx.media3.datasource;

import androidx.media3.common.util.J;
import j.P;
import java.io.IOException;

/* loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f48171c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f48172b;

    @J
    public DataSourceException(int i12) {
        this.f48172b = i12;
    }

    @J
    public DataSourceException(@P Exception exc, int i12) {
        super(exc);
        this.f48172b = i12;
    }

    @J
    public DataSourceException(@P String str, int i12) {
        super(str);
        this.f48172b = i12;
    }

    @J
    public DataSourceException(int i12, @P String str, @P Exception exc) {
        super(str, exc);
        this.f48172b = i12;
    }
}
