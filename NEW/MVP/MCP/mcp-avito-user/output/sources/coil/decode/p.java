package coil.decode;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ImageSource.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class p extends N implements Y41.a<File> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f58308l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        super(0);
        this.f58308l = context;
    }

    @Override // Y41.a
    public final File invoke() {
        Bitmap.Config[] configArr = coil.util.l.f58781a;
        File cacheDir = this.f58308l.getCacheDir();
        if (cacheDir == null) {
            throw new IllegalStateException("cacheDir == null");
        }
        cacheDir.mkdirs();
        return cacheDir;
    }
}
