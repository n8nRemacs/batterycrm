package pW0;

import I41.h;
import com.facebook.infer.annotation.Nullsafe;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: FileBinaryResource.java */
@Nullsafe
/* renamed from: pW0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C47024c implements InterfaceC47022a {

    /* renamed from: a, reason: collision with root package name */
    public final File f428572a;

    public C47024c(File file) {
        this.f428572a = file;
    }

    @Override // pW0.InterfaceC47022a
    public final InputStream a() {
        return new FileInputStream(this.f428572a);
    }

    public final boolean equals(@h Object obj) {
        if (obj == null || !(obj instanceof C47024c)) {
            return false;
        }
        return this.f428572a.equals(((C47024c) obj).f428572a);
    }

    public final int hashCode() {
        return this.f428572a.hashCode();
    }

    @Override // pW0.InterfaceC47022a
    public final long size() {
        return this.f428572a.length();
    }
}
