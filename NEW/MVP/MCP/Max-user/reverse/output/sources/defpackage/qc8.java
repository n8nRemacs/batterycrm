package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class qc8 extends gd8 {
    public final /* synthetic */ int c;
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qc8(Executor executor, py0 py0Var, Object obj, int i) {
        super(executor, py0Var);
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.gd8
    public final ce5 d(rf7 rf7Var) throws Resources.NotFoundException, IOException {
        int length;
        int length2;
        String path;
        switch (this.c) {
            case 0:
                AssetManager assetManager = (AssetManager) this.d;
                InputStream inputStreamOpen = assetManager.open(rf7Var.b.getPath().substring(1), 2);
                AssetFileDescriptor assetFileDescriptorOpenFd = null;
                try {
                    assetFileDescriptorOpenFd = assetManager.openFd(rf7Var.b.getPath().substring(1));
                    length = (int) assetFileDescriptorOpenFd.getLength();
                    try {
                        assetFileDescriptorOpenFd.close();
                    } catch (IOException unused) {
                    }
                } catch (IOException unused2) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (IOException unused3) {
                        }
                    }
                    length = -1;
                } catch (Throwable th) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
                return c(inputStreamOpen, length);
            default:
                Resources resources = (Resources) this.d;
                String path2 = rf7Var.b.getPath();
                if (path2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                InputStream inputStreamOpenRawResource = resources.openRawResource(Integer.parseInt(path2.substring(1)));
                AssetFileDescriptor assetFileDescriptor = null;
                try {
                    path = rf7Var.b.getPath();
                } catch (Resources.NotFoundException unused5) {
                    if (0 != 0) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException unused6) {
                        }
                    }
                    length2 = -1;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException unused7) {
                        }
                    }
                    throw th2;
                }
                if (path == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(Integer.parseInt(path.substring(1)));
                length2 = (int) assetFileDescriptorOpenRawResourceFd.getLength();
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (IOException unused8) {
                }
                return c(inputStreamOpenRawResource, length2);
        }
    }

    @Override // defpackage.gd8
    public final String e() {
        switch (this.c) {
            case 0:
                return "LocalAssetFetchProducer";
            default:
                return "LocalResourceFetchProducer";
        }
    }
}
