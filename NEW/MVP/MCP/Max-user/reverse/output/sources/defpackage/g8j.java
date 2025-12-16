package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g8j {
    public static String a(String str, String str2) {
        Object next;
        if (str == null) {
            return "unknown";
        }
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (!mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length = supportedTypes.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (dnf.n(supportedTypes[i], str, true)) {
                        arrayList.add(mediaCodecInfo);
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (fni.a(((MediaCodecInfo) next).getName(), str2)) {
                break;
            }
        }
        MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) next;
        if (mediaCodecInfo2 == null) {
            return "unknown";
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 ? mediaCodecInfo2.isHardwareAccelerated() : false) {
            return "HW";
        }
        return i2 >= 29 ? mediaCodecInfo2.isSoftwareOnly() : false ? "SW" : "unknown";
    }

    public static final void b(Object obj) {
        if (obj instanceof ipd) {
            throw ((ipd) obj).a;
        }
    }
}
