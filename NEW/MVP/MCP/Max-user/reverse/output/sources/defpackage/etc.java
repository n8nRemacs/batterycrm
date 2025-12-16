package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class etc implements htc {
    public final File a;

    public etc(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof etc) && fni.a(this.a, ((etc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StartRecordVideo(file=" + this.a + ")";
    }
}
