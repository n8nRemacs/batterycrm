package defpackage;

import android.media.metrics.EditingEndedEvent;
import android.media.metrics.MediaItemInfo;
import javax.crypto.spec.ChaCha20ParameterSpec;

/* loaded from: classes.dex */
public abstract /* synthetic */ class xx {
    public static /* synthetic */ EditingEndedEvent.Builder a(int i) {
        return new EditingEndedEvent.Builder(i);
    }

    public static /* synthetic */ MediaItemInfo.Builder f() {
        return new MediaItemInfo.Builder();
    }

    public static /* bridge */ /* synthetic */ MediaItemInfo h(Object obj) {
        return (MediaItemInfo) obj;
    }

    public static /* synthetic */ ChaCha20ParameterSpec i(int i, byte[] bArr) {
        return new ChaCha20ParameterSpec(bArr, i);
    }

    public static /* synthetic */ void j() {
    }
}
