package ru.ok.android.externcalls.sdk.stat.supportedcodecs;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import defpackage.a9h;
import defpackage.de;
import defpackage.gu3;
import defpackage.imb;
import defpackage.qu1;
import defpackage.t7c;
import defpackage.to8;
import defpackage.y6d;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.api.request.ClientSupportedCodecs;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/supportedcodecs/SupportedCodecsStatistics;", "", "<init>", "()V", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "okApiService", "Lt7c;", "preferencesHelper", "Ly6d;", "rtcLog", "Lqqg;", "tryToReport", "(Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;Lt7c;Ly6d;)V", "Lorg/json/JSONObject;", "buildCodecLists", "()Lorg/json/JSONObject;", "", "LOG_TAG", "Ljava/lang/String;", "", "ONE_MONTH_IN_MS", "J", "", "CODEC_ALIASES", "Ljava/util/Map;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SupportedCodecsStatistics {
    private static final String LOG_TAG = "SupportedCodecsStatistics";
    public static final SupportedCodecsStatistics INSTANCE = new SupportedCodecsStatistics();
    private static final long ONE_MONTH_IN_MS = TimeUnit.DAYS.toMillis(30);
    private static final Map<String, String> CODEC_ALIASES = to8.j(new imb("video/av1", "AV1"), new imb("video/av01", "AV1"), new imb("video/x-vnd.on2.vp8", "VP8"), new imb("video/x-vnd.on2.vp9", "VP9"), new imb("video/avc", "H264"), new imb("video/hevc", "H265"), new imb("audio/opus", "OPUS"));

    private SupportedCodecsStatistics() {
    }

    private final JSONObject buildCodecLists() throws JSONException {
        int i = 0;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        int length = codecInfos.length;
        int i2 = 0;
        while (i2 < length) {
            MediaCodecInfo mediaCodecInfo = codecInfos[i2];
            JSONObject jSONObject2 = new JSONObject();
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            if (supportedTypes != null && supportedTypes.length != 0) {
                int length2 = supportedTypes.length;
                int i3 = i;
                while (i3 < length2) {
                    String str = supportedTypes[i3];
                    String str2 = CODEC_ALIASES.get(str);
                    if (str2 != null) {
                        jSONObject2.put("codec_name", str2);
                        jSONObject2.put("codec_implementation", mediaCodecInfo.getName());
                        jSONObject2.put("mime_type", str);
                        jSONObject2.put("is_encoder", mediaCodecInfo.isEncoder());
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                        int length3 = codecProfileLevelArr.length;
                        int i4 = i;
                        int i5 = i4;
                        while (i4 < length3) {
                            i5 += codecProfileLevelArr[i4].profile;
                            i4++;
                        }
                        jSONObject2.put("profiles", i5);
                        int i6 = Build.VERSION.SDK_INT;
                        jSONObject2.put("instance_count", capabilitiesForType.getMaxSupportedInstances());
                        if (i6 >= 29) {
                            jSONObject2.put("is_hardware", mediaCodecInfo.isHardwareAccelerated());
                        }
                        jSONArray.put(jSONObject2);
                    }
                    i3++;
                    i = 0;
                }
            }
            i2++;
            i = 0;
        }
        jSONObject.put("codecs", jSONArray);
        return jSONObject;
    }

    @SuppressLint({"CheckResult"})
    public static final void tryToReport(OkApiServiceInternal okApiService, final t7c preferencesHelper, final y6d rtcLog) {
        final long time = new Date().getTime();
        if (time - preferencesHelper.a.getLong("supportedCodecsLastUpdate", 0L) < ONE_MONTH_IN_MS) {
            return;
        }
        JSONObject jSONObjectBuildCodecLists = INSTANCE.buildCodecLists();
        rtcLog.log(LOG_TAG, "Sending supported codecs " + jSONObjectBuildCodecLists);
        okApiService.sendSupportedCodecsStatistics(jSONObjectBuildCodecLists).i(de.a()).k(new qu1(new gu3() { // from class: ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics.tryToReport.1
            @Override // defpackage.gu3
            public final void accept(ClientSupportedCodecs.Response response) {
                rtcLog.log(SupportedCodecsStatistics.LOG_TAG, "Supported codecs are sent with success=" + response.getSuccess());
                if (response.getSuccess()) {
                    preferencesHelper.a.edit().putLong("supportedCodecsLastUpdate", time).apply();
                }
            }
        }, 2, new gu3() { // from class: ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics.tryToReport.2
            @Override // defpackage.gu3
            public final void accept(Throwable th) {
                a9h.o("Failed to send supported codecs with error: ", th.getMessage(), rtcLog, SupportedCodecsStatistics.LOG_TAG);
            }
        }));
    }
}
