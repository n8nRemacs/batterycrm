package one.me.callssdk;

import android.content.Context;
import androidx.annotation.Keep;
import defpackage.r4j;
import defpackage.s55;
import defpackage.ue3;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0086 J \u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0014\u0010\u000f\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¨\u0006\u0012"}, d2 = {"Lone/me/callssdk/CallsSdkInitializer;", "", "<init>", "()V", "initializeSessionSeed", "", "context", "Landroid/content/Context;", "seed", "deviceId", "calculateMeta", "filter", "", "sizeLimit", "", "readExactly", "Ljava/io/InputStream;", "size", "integrity-protection_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallsSdkInitializer {
    public static final CallsSdkInitializer INSTANCE = new CallsSdkInitializer();

    private CallsSdkInitializer() {
    }

    public static final byte[] calculateMeta(Context context, String filter, int sizeLimit) throws IOException {
        ZipFile zipFile = new ZipFile(context.getApplicationInfo().sourceDir);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            ArrayList list = Collections.list(zipFile.entries());
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ZipEntry) obj).getName().endsWith(filter)) {
                    arrayList.add(obj);
                }
            }
            for (ZipEntry zipEntry : ue3.X(arrayList, new s55(14))) {
                int size = sizeLimit < 0 ? (int) zipEntry.getSize() : Math.min(sizeLimit, (int) zipEntry.getSize());
                InputStream inputStream = zipFile.getInputStream(zipEntry);
                try {
                    messageDigest.update(INSTANCE.readExactly(inputStream, size));
                    r4j.a(inputStream, null);
                } finally {
                }
            }
            byte[] bArrDigest = messageDigest.digest();
            zipFile.close();
            return bArrDigest;
        } finally {
        }
    }

    private final byte[] readExactly(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        do {
            i2 += inputStream.read(bArr, i2, i - i2);
        } while (i2 < i);
        return bArr;
    }

    public final native byte[] initializeSessionSeed(Context context, byte[] seed, byte[] deviceId);
}
