package androidx.media;

import android.media.session.MediaSessionManager;
import android.view.DisplayCutout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p {
    public static /* bridge */ /* synthetic */ boolean A(Object obj) {
        return obj instanceof DisplayCutout;
    }

    public static /* bridge */ /* synthetic */ DisplayCutout l(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* synthetic */ void o(int i12, int i13, String str) {
        new MediaSessionManager.RemoteUserInfo(str, i12, i13);
    }
}
