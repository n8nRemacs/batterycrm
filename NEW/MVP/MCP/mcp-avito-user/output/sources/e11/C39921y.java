package e11;

import com.yandex.metrica.plugins.PluginErrorDetails;
import e11.P0;

/* renamed from: e11.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39921y {

    /* renamed from: a, reason: collision with root package name */
    public static int f394904a;

    static {
        if (P0.a.f394457a) {
            f394904a |= 2;
        }
        try {
            try {
                Class.forName("com.unity3d.player.UnityPlayerActivity");
            } catch (Throwable unused) {
                Runtime.getRuntime().loadLibrary(PluginErrorDetails.Platform.UNITY);
            }
            f394904a |= 1;
        } catch (Throwable unused2) {
        }
    }
}
