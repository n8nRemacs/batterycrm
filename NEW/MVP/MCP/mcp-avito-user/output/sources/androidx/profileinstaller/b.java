package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.profileinstaller.f;
import com.huawei.hms.adapter.internal.AvailableCode;
import j.N;
import j.P;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: DeviceProfileWriter.java */
@RestrictTo
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final Executor f53599a;

    /* renamed from: b, reason: collision with root package name */
    @N
    public final f.d f53600b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final byte[] f53601c;

    /* renamed from: d, reason: collision with root package name */
    @N
    public final File f53602d;

    /* renamed from: e, reason: collision with root package name */
    @N
    public final String f53603e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f53604f = false;

    /* renamed from: g, reason: collision with root package name */
    @P
    public c[] f53605g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public byte[] f53606h;

    @RestrictTo
    public b(@N AssetManager assetManager, @N Executor executor, @N f.d dVar, @N String str, @N File file) {
        byte[] bArr;
        this.f53599a = executor;
        this.f53600b = dVar;
        this.f53603e = str;
        this.f53602d = file;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 31) {
            switch (i12) {
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    bArr = k.f53640c;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case 30:
                    bArr = k.f53639b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = k.f53638a;
        }
        this.f53601c = bArr;
    }

    @P
    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e12) {
            String message = e12.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f53600b.a();
            }
            return null;
        }
    }

    public final void b(int i12, @P Serializable serializable) {
        this.f53599a.execute(new androidx.media3.exoplayer.drm.d(this, i12, serializable));
    }
}
