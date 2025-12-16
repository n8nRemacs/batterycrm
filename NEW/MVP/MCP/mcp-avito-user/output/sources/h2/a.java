package H2;

import coil.request.t;
import java.io.File;
import kotlin.Metadata;

/* compiled from: FileKeyer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LH2/a;", "LH2/b;", "Ljava/io/File;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements b<File> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6924a;

    public a(boolean z12) {
        this.f6924a = z12;
    }

    @Override // H2.b
    public final String a(File file, t tVar) {
        File file2 = file;
        if (!this.f6924a) {
            return file2.getPath();
        }
        return file2.getPath() + ':' + file2.lastModified();
    }
}
