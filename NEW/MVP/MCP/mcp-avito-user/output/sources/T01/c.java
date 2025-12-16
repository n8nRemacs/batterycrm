package t01;

import android.content.Context;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.huawei.hms.framework.common.IoUtils;
import com.huawei.hms.framework.common.Logger;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes7.dex */
public class c {
    public static String a(Context context, String str) throws IOException {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream inputStreamOpen = null;
        try {
            try {
                if (!new File(str).isDirectory()) {
                    inputStreamOpen = context.getAssets().open(str);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i12 = inputStreamOpen.read(bArr);
                        if (i12 == -1) {
                            byteArrayOutputStream.flush();
                            String str2 = new String(byteArrayOutputStream.toByteArray(), Constants.ENCODING);
                            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
                            IoUtils.closeSecure(inputStreamOpen);
                            return str2;
                        }
                        byteArrayOutputStream.write(bArr, 0, i12);
                    }
                }
            } catch (IOException unused) {
                Logger.w("c", "local config file is not exist.filename is {%s}", str);
            }
            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
            IoUtils.closeSecure(inputStreamOpen);
            return "";
        } catch (Throwable th2) {
            IoUtils.closeSecure((OutputStream) byteArrayOutputStream);
            IoUtils.closeSecure(inputStreamOpen);
            throw th2;
        }
    }
}
