package x11;

import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: FilePathDataSource.java */
/* loaded from: classes7.dex */
public class h extends e {

    /* renamed from: b, reason: collision with root package name */
    public FileInputStream f442113b;

    @Override // x11.e, x11.d
    public final void a() {
        try {
            this.f442113b = new FileInputStream((String) null);
            this.f442098a = new g(this.f442113b.getFD());
            super.a();
        } catch (IOException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // x11.e, x11.d
    public final void g() throws IOException {
        try {
            this.f442113b.close();
        } catch (IOException unused) {
        }
        super.g();
    }
}
