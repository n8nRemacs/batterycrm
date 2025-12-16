package com.avito.android.messenger.conversation.mvi.video;

import android.media.MediaFormat;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.C23179x;
import com.avito.android.util.X2;
import com.otaliastudios.transcoder.common.TrackStatus;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import w11.C49424b;

/* compiled from: Messenger720pVideoStrategy.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/a;", "Lcom/otaliastudios/transcoder/strategy/f;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.otaliastudios.transcoder.strategy.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Integer f194882a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C49424b f194883b = new C49424b();

    /* compiled from: Messenger720pVideoStrategy.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/video/a$a;", "", "<init>", "()V", "", "TARGET_BIT_RATE", "I", "TARGET_FRAME_RATE", "TARGET_KEY_FRAME_INTERVAL", "TARGET_MAX_SIZE", "", "TARGET_MIME_TYPE", "Ljava/lang/String;", "TARGET_MIN_SIZE", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.video.a$a, reason: collision with other inner class name */
    public static final class C5753a {
        public /* synthetic */ C5753a(C42822w c42822w) {
            this();
        }

        public C5753a() {
        }
    }

    static {
        new C5753a(null);
    }

    public a(@Y61.l Integer num) {
        this.f194882a = num;
    }

    public static void b(String str) {
        X2.f318778a.c("VideoCompressor", str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.otaliastudios.transcoder.strategy.f
    @Y61.k
    public final TrackStatus a(@Y61.k ArrayList arrayList, @Y61.k MediaFormat mediaFormat) {
        Q q12;
        int i12;
        String str;
        Q q13;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                q12 = new Q("video/avc", Boolean.TRUE);
                break;
            }
            String string = ((MediaFormat) it.next()).getString("mime");
            if (!C43066x.C(string, "video/avc", true)) {
                q12 = new Q(string, Boolean.FALSE);
                break;
            }
        }
        String str2 = (String) q12.f406619b;
        boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
        b("inputMimeType = " + str2 + " outMimeType = video/avc, mimeTypeNotChanged = " + zBooleanValue);
        int size = arrayList.size();
        float[] fArr = new float[size];
        boolean[] zArr = new boolean[size];
        float f12 = 0.0f;
        for (int i13 = 0; i13 < size; i13++) {
            MediaFormat mediaFormat2 = (MediaFormat) arrayList.get(i13);
            float integer = mediaFormat2.getInteger("width");
            float integer2 = mediaFormat2.getInteger("height");
            boolean z12 = (mediaFormat2.containsKey("rotation-degrees") ? mediaFormat2.getInteger("rotation-degrees") : 0) % 180 != 0;
            zArr[i13] = z12;
            float f13 = z12 ? integer2 / integer : integer / integer2;
            fArr[i13] = f13;
            f12 += f13;
        }
        float f14 = f12 / size;
        float f15 = Float.MAX_VALUE;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            float fAbs = Math.abs(fArr[i15] - f14);
            if (fAbs < f15) {
                i14 = i15;
                f15 = fAbs;
            }
        }
        MediaFormat mediaFormat3 = (MediaFormat) arrayList.get(i14);
        int integer3 = mediaFormat3.getInteger("width");
        int integer4 = mediaFormat3.getInteger("height");
        boolean z13 = zArr[i14];
        int i16 = z13 ? integer4 : integer3;
        if (!z13) {
            integer3 = integer4;
        }
        com.otaliastudios.transcoder.common.a aVar = new com.otaliastudios.transcoder.common.a(i16, integer3);
        com.otaliastudios.transcoder.common.b bVarA = this.f194883b.a(aVar);
        int i17 = aVar.f365978d;
        int i18 = aVar.f365977c;
        int i19 = bVarA.f365980b;
        int i22 = bVarA.f365979a;
        Q q14 = i18 >= i17 ? new Q(Integer.valueOf(i22), Integer.valueOf(i19)) : new Q(Integer.valueOf(i19), Integer.valueOf(i22));
        int iIntValue = ((Number) q14.f406619b).intValue();
        int iIntValue2 = ((Number) q14.f406620c).intValue();
        boolean z14 = aVar.f365980b == i19 && aVar.f365979a == i22;
        StringBuilder sbY = r.y(i18, i17, "inputSize[w=", ",h=", "], outputSize[w=");
        C23179x.a(sbY, iIntValue, ",h=", iIntValue2, "], resolutionIsEqualOrLowerThanTarget = ");
        sbY.append(z14);
        b(sbY.toString());
        Iterator it2 = arrayList.iterator();
        int iMin = Integer.MAX_VALUE;
        while (it2.hasNext()) {
            MediaFormat mediaFormat4 = (MediaFormat) it2.next();
            if (mediaFormat4.containsKey("frame-rate")) {
                iMin = Math.min(iMin, mediaFormat4.getInteger("frame-rate"));
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            iMin = -1;
        }
        int i23 = 30;
        if (iMin > 0 && iMin <= 30) {
            i23 = iMin;
        }
        boolean z15 = i23 == iMin;
        StringBuilder sbY2 = r.y(iMin, i23, "inputFrameRate = ", ", outputFrameRate = ", ", frameRateNotChanged = ");
        sbY2.append(z15);
        b(sbY2.toString());
        Iterator it3 = arrayList.iterator();
        int i24 = 0;
        int integer5 = 0;
        while (true) {
            i12 = i23;
            if (!it3.hasNext()) {
                break;
            }
            MediaFormat mediaFormat5 = (MediaFormat) it3.next();
            if (mediaFormat5.containsKey("i-frame-interval")) {
                i24++;
                integer5 += mediaFormat5.getInteger("i-frame-interval");
            }
            i23 = i12;
        }
        int iB2 = i24 > 0 ? kotlin.math.b.b(integer5 / i24) : -1;
        boolean z16 = iB2 == -1 || iB2 == 3;
        b("inputKeyFrameInterval = " + iB2 + ", outputKeyFrameInterval = 3 keyFrameIntervalNotChanged = " + z16);
        boolean z17 = arrayList.size() == 1;
        Integer num = this.f194882a;
        if (num == null || num.intValue() < 0 || num.intValue() > 2000000) {
            str = "i-frame-interval";
            q13 = new Q(2000000, Boolean.FALSE);
        } else {
            q13 = new Q(num, Boolean.TRUE);
            str = "i-frame-interval";
        }
        int iIntValue3 = ((Number) q13.f406619b).intValue();
        boolean zBooleanValue2 = ((Boolean) q13.f406620c).booleanValue();
        b("inputBitrate = " + num + ", outputBitrate = " + iIntValue3 + ", oldBitrateIsEqualOrLowerThanTarget = " + zBooleanValue2);
        if (z17 && zBooleanValue && z14 && z15 && z16 && zBooleanValue2) {
            b("Compression verdict: no need to compress");
            return TrackStatus.f365970d;
        }
        mediaFormat.setString("mime", "video/avc");
        mediaFormat.setInteger("width", iIntValue);
        mediaFormat.setInteger("height", iIntValue2);
        mediaFormat.setInteger("rotation-degrees", 0);
        mediaFormat.setInteger("frame-rate", i12);
        mediaFormat.setFloat(str, 3.0f);
        mediaFormat.setInteger("color-format", 2130708361);
        mediaFormat.setInteger("bitrate", iIntValue3);
        b("Compression verdict: compressing");
        return TrackStatus.f365971e;
    }
}
