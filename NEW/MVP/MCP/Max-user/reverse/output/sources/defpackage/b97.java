package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class b97 implements ca7 {
    public final /* synthetic */ ctc a;
    public final /* synthetic */ InputStream b;

    public b97(ctc ctcVar, elf elfVar) {
        this.a = ctcVar;
        this.b = elfVar;
    }

    @Override // defpackage.ca7
    public final OutputStream a() {
        return this.a.f;
    }

    @Override // defpackage.ca7
    public final InputStream b() {
        return this.b;
    }

    @Override // defpackage.ca7
    public final boolean c() {
        return this.a.c();
    }

    @Override // defpackage.ca7
    public final void d(long j) {
        this.a.e.w(j);
    }

    @Override // defpackage.ca7
    public final void e(long j) {
        this.a.f.w(j);
    }
}
