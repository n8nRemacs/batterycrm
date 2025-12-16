package w31;

import android.os.StatFs;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.File;
import kotlin.jvm.internal.N;

/* loaded from: classes8.dex */
public final class g extends N implements Y41.a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f441253l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(0);
        this.f441253l = hVar;
    }

    @Override // Y41.a
    public final Object invoke() {
        h hVar = this.f441253l;
        hVar.getClass();
        try {
            File externalFilesDir = hVar.f441254a.getExternalFilesDir(null);
            long totalBytes = new StatFs(externalFilesDir != null ? externalFilesDir.getPath() : null).getTotalBytes();
            return totalBytes <= -1 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : String.valueOf(totalBytes);
        } catch (Exception unused) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }
}
