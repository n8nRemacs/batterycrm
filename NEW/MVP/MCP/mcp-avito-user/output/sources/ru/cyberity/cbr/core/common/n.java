package ru.cyberity.cbr.core.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;

/* compiled from: CBRIOUtils.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"Ljava/io/InputStream;", "Ljava/io/OutputStream;", "outputStream", "", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class n {
    public static final boolean a(@Y61.k InputStream inputStream, @Y61.k OutputStream outputStream) {
        try {
            int iAvailable = inputStream.available();
            if (iAvailable > 1048576) {
                iAvailable = 1048576;
            }
            byte[] bArr = new byte[iAvailable];
            while (true) {
                int i12 = inputStream.read(bArr);
                if (i12 == -1) {
                    inputStream.close();
                    outputStream.close();
                    return true;
                }
                outputStream.write(bArr, 0, i12);
            }
        } catch (IOException unused) {
            return false;
        }
    }
}
