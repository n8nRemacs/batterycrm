package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final /* synthetic */ class u32 implements wta, en6 {
    public final /* synthetic */ k a;

    public u32(k kVar) {
        this.a = kVar;
    }

    @Override // defpackage.wta
    public final /* synthetic */ void a(Object obj) throws IOException {
        this.a.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wta) || !(obj instanceof en6)) {
            return false;
        }
        return this.a.equals(((en6) obj).getFunctionDelegate());
    }

    @Override // defpackage.en6
    public final xm6 getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
