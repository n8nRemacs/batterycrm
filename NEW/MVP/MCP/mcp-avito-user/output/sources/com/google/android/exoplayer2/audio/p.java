package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;

/* compiled from: DefaultAudioTrackBufferSizeProvider.java */
/* loaded from: classes6.dex */
public class p implements DefaultAudioSink.d {

    /* compiled from: DefaultAudioTrackBufferSizeProvider.java */
    public static class a {
    }

    public static int a(int i12) {
        switch (i12) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return JosStatusCodes.RTN_CODE_COMMON_ERROR;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }
}
