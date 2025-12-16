package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.J;
import androidx.media3.datasource.j;
import j.P;
import java.util.List;
import java.util.Map;

/* compiled from: ResolvingDataSource.java */
@J
/* loaded from: classes.dex */
public final class y implements j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f48317a;

    /* compiled from: ResolvingDataSource.java */
    public static final class a implements j.a {
        @Override // androidx.media3.datasource.j.a
        public final j a() {
            throw null;
        }
    }

    /* compiled from: ResolvingDataSource.java */
    public interface b {
    }

    @Override // androidx.media3.datasource.j
    public final Map<String, List<String>> c() {
        throw null;
    }

    @Override // androidx.media3.datasource.j
    public final void close() {
        if (this.f48317a) {
            this.f48317a = false;
            throw null;
        }
    }

    @Override // androidx.media3.datasource.j
    public final long e(o oVar) {
        throw null;
    }

    @Override // androidx.media3.datasource.j
    @P
    public final Uri getUri() {
        throw null;
    }

    @Override // androidx.media3.datasource.j
    public final void j(B b12) {
        b12.getClass();
        throw null;
    }

    @Override // androidx.media3.common.InterfaceC23102m
    public final int read(byte[] bArr, int i12, int i13) {
        throw null;
    }
}
