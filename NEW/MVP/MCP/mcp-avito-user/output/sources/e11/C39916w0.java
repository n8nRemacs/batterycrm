package e11;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.google.android.exoplayer2.C36607v;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.source.AbstractC36538a;
import com.google.android.exoplayer2.source.H;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;

/* renamed from: e11.w0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39916w0 {
    @j.N
    public static AbstractC36538a a(@j.N Context context, @j.N Uri uri) {
        String str;
        int i12 = com.google.android.exoplayer2.util.U.f348106a;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        com.google.android.exoplayer2.upstream.u uVar = new com.google.android.exoplayer2.upstream.u(context, AK.c.s(androidx.appcompat.app.r.A("myTarget/", str, " (Linux;Android "), Build.VERSION.RELEASE, ") ExoPlayerLib/2.18.0"));
        if (com.google.android.exoplayer2.util.U.C(uri) == 2) {
            HlsMediaSource.Factory factory = new HlsMediaSource.Factory(new com.google.android.exoplayer2.source.hls.d(uVar));
            C36607v c36607v = com.google.android.exoplayer2.O.f343527h;
            O.c cVar = new O.c();
            cVar.f343535b = uri;
            return factory.a(cVar.a());
        }
        H.b bVar = new H.b(uVar);
        C36607v c36607v2 = com.google.android.exoplayer2.O.f343527h;
        O.c cVar2 = new O.c();
        cVar2.f343535b = uri;
        return bVar.a(cVar2.a());
    }
}
