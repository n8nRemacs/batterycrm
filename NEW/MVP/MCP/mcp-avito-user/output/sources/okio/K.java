package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.StandardOpenOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: NioFileSystemWrappingFileSystem.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/K;", "Lokio/L;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class K extends L {
    @Override // okio.I, okio.AbstractC44811v
    public final void a(@Y61.k S s5) throws InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        s5.f420035b.t();
        throw null;
    }

    @Override // okio.I, okio.AbstractC44811v
    @Y61.k
    public final List<S> c(@Y61.k S s5) {
        s5.f420035b.t();
        throw null;
    }

    @Override // okio.I, okio.AbstractC44811v
    @Y61.l
    public final List<S> d(@Y61.k S s5) {
        s5.f420035b.t();
        throw null;
    }

    @Override // okio.L, okio.I, okio.AbstractC44811v
    @Y61.l
    public final C44810u f(@Y61.k S s5) {
        s5.f420035b.t();
        throw null;
    }

    @Override // okio.I, okio.AbstractC44811v
    @Y61.k
    public final AbstractC44809t g(@Y61.k S s5) throws FileNotFoundException {
        try {
            s5.f420035b.t();
            throw null;
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + s5);
        }
    }

    @Override // okio.I, okio.AbstractC44811v
    @Y61.k
    public final c0 h(@Y61.k S s5) throws FileNotFoundException {
        C42745f0.p(C42745f0.t());
        try {
            s5.f420035b.t();
            throw null;
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + s5);
        }
    }

    @Override // okio.I, okio.AbstractC44811v
    @Y61.k
    public final e0 i(@Y61.k S s5) throws FileNotFoundException {
        try {
            s5.f420035b.t();
            throw null;
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + s5);
        }
    }

    @Override // okio.I
    @Y61.k
    public final c0 j(@Y61.k S s5) {
        kotlin.collections.builders.b bVarT = C42745f0.t();
        bVarT.add(StandardOpenOption.APPEND);
        bVarT.add(StandardOpenOption.CREATE);
        C42745f0.p(bVarT);
        s5.f420035b.t();
        throw null;
    }

    @Override // okio.L, okio.I
    public final void k(@Y61.k S s5, @Y61.k S s12) throws IOException {
        try {
            s5.f420035b.t();
            throw null;
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e12) {
            throw new FileNotFoundException(e12.getMessage());
        }
    }

    @Override // okio.I
    public final void l(@Y61.k S s5) {
        f(s5);
        throw null;
    }

    @Override // okio.L, okio.I
    @Y61.k
    public final String toString() {
        throw null;
    }
}
