package com.adjust.sdk;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import androidx.camera.camera2.internal.G;
import com.adjust.sdk.GooglePlayServicesClient;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;
import com.adjust.sdk.scheduler.SingleThreadFutureScheduler;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.yandex.metrica.plugins.PluginErrorDetails;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class Util {
    private static final String fieldReadErrorMessage = "Unable to read '%s' field in migration device with message (%s)";
    public static final DecimalFormat SecondsDisplayFormat = newLocalDecimalFormat();
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'Z";
    public static final SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_FORMAT, Locale.US);
    private static volatile SingleThreadFutureScheduler playAdIdScheduler = null;

    public class a implements Callable<Object> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f58978a;

        public a(Context context) {
            this.f58978a = context;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                return Reflection.getAdvertisingInfoObject(this.f58978a);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public class b implements Callable<String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f58979a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f58980b;

        public b(Context context, Object obj) {
            this.f58979a = context;
            this.f58980b = obj;
        }

        @Override // java.util.concurrent.Callable
        public final String call() {
            return Reflection.getPlayAdId(this.f58979a, this.f58980b);
        }
    }

    public class c implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f58981a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f58982b;

        public c(Context context, Object obj) {
            this.f58981a = context;
            this.f58982b = obj;
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() {
            return Reflection.isPlayTrackingEnabled(this.f58981a, this.f58982b);
        }
    }

    public class d extends AsyncTaskExecutor<Context, String> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnGoogleAdIdReadListener f58983a;

        public d(OnGoogleAdIdReadListener onGoogleAdIdReadListener) {
            this.f58983a = onGoogleAdIdReadListener;
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final String doInBackground(Context[] contextArr) {
            ILogger logger = AdjustFactory.getLogger();
            String googleAdId = Util.getGoogleAdId(contextArr[0]);
            logger.debug(G.f("GoogleAdId read ", googleAdId), new Object[0]);
            return googleAdId;
        }

        @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
        public final void onPostExecute(String str) {
            String str2 = str;
            OnGoogleAdIdReadListener onGoogleAdIdReadListener = this.f58983a;
            if (onGoogleAdIdReadListener != null) {
                onGoogleAdIdReadListener.onGoogleAdIdRead(str2);
            }
        }
    }

    public static AdjustAttribution attributionFromJson(JSONObject jSONObject, String str) {
        String strOptString;
        if (jSONObject == null) {
            return null;
        }
        AdjustAttribution adjustAttribution = new AdjustAttribution();
        if (PluginErrorDetails.Platform.UNITY.equals(str)) {
            adjustAttribution.trackerToken = jSONObject.optString("tracker_token", "");
            adjustAttribution.trackerName = jSONObject.optString("tracker_name", "");
            adjustAttribution.network = jSONObject.optString("network", "");
            adjustAttribution.campaign = jSONObject.optString("campaign", "");
            adjustAttribution.adgroup = jSONObject.optString("adgroup", "");
            adjustAttribution.creative = jSONObject.optString("creative", "");
            adjustAttribution.clickLabel = jSONObject.optString("click_label", "");
            adjustAttribution.costType = jSONObject.optString("cost_type", "");
            adjustAttribution.costAmount = Double.valueOf(jSONObject.optDouble("cost_amount", 0.0d));
            adjustAttribution.costCurrency = jSONObject.optString("cost_currency", "");
            strOptString = jSONObject.optString("fb_install_referrer", "");
        } else {
            adjustAttribution.trackerToken = jSONObject.optString("tracker_token");
            adjustAttribution.trackerName = jSONObject.optString("tracker_name");
            adjustAttribution.network = jSONObject.optString("network");
            adjustAttribution.campaign = jSONObject.optString("campaign");
            adjustAttribution.adgroup = jSONObject.optString("adgroup");
            adjustAttribution.creative = jSONObject.optString("creative");
            adjustAttribution.clickLabel = jSONObject.optString("click_label");
            adjustAttribution.costType = jSONObject.optString("cost_type");
            adjustAttribution.costAmount = Double.valueOf(jSONObject.optDouble("cost_amount"));
            adjustAttribution.costCurrency = jSONObject.optString("cost_currency");
            strOptString = jSONObject.optString("fb_install_referrer");
        }
        adjustAttribution.fbInstallReferrer = strOptString;
        return adjustAttribution;
    }

    public static boolean canReadNonPlayIds(AdjustConfig adjustConfig) {
        return (adjustConfig.coppaComplianceEnabled || adjustConfig.playStoreKidsComplianceEnabled) ? false : true;
    }

    public static boolean canReadPlayIds(AdjustConfig adjustConfig) {
        return (adjustConfig.coppaComplianceEnabled || adjustConfig.playStoreKidsComplianceEnabled) ? false : true;
    }

    public static boolean checkPermission(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Exception e12) {
            getLogger().debug("Unable to check permission '%s' with message (%s)", str, e12.getMessage());
            return false;
        }
    }

    public static String convertToHex(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return formatString(AK.c.i(bArr.length << 1, "x", new StringBuilder("%0")), bigInteger);
    }

    public static String createUuid() {
        return UUID.randomUUID().toString();
    }

    public static boolean equalBoolean(Boolean bool, Boolean bool2) {
        return equalObject(bool, bool2);
    }

    public static boolean equalEnum(Enum r02, Enum r12) {
        return equalObject(r02, r12);
    }

    public static boolean equalInt(Integer num, Integer num2) {
        return equalObject(num, num2);
    }

    public static boolean equalLong(Long l12, Long l13) {
        return equalObject(l12, l13);
    }

    public static boolean equalObject(Object obj, Object obj2) {
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : obj.equals(obj2);
    }

    public static boolean equalString(String str, String str2) {
        return equalObject(str, str2);
    }

    public static boolean equalsDouble(Double d12, Double d13) {
        return (d12 == null || d13 == null) ? d12 == null && d13 == null : Double.doubleToLongBits(d12.doubleValue()) == Double.doubleToLongBits(d13.doubleValue());
    }

    public static String formatString(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Object getAdvertisingInfoObject(Context context, long j12) {
        return runSyncInPlayAdIdSchedulerWithTimeout(context, new a(context), j12);
    }

    public static String getAndroidId(Context context) {
        return AndroidIdUtil.getAndroidId(context);
    }

    public static String getCpuAbi() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getGoogleAdId(Context context) {
        Object advertisingInfoObject;
        GooglePlayServicesClient.GooglePlayServicesInfo googlePlayServicesInfo;
        try {
            googlePlayServicesInfo = GooglePlayServicesClient.getGooglePlayServicesInfo(context, 11000L);
        } catch (Exception unused) {
        }
        String gpsAdid = googlePlayServicesInfo != null ? googlePlayServicesInfo.getGpsAdid() : null;
        return (gpsAdid != null || (advertisingInfoObject = getAdvertisingInfoObject(context, 11000L)) == null) ? gpsAdid : getPlayAdId(context, advertisingInfoObject, 1000L);
    }

    public static Locale getLocale(Configuration configuration) {
        LocaleList locales = configuration.getLocales();
        if (locales == null || locales.isEmpty()) {
            return null;
        }
        return locales.get(0);
    }

    private static ILogger getLogger() {
        return AdjustFactory.getLogger();
    }

    public static String getPlayAdId(Context context, Object obj, long j12) {
        return (String) runSyncInPlayAdIdSchedulerWithTimeout(context, new b(context, obj), j12);
    }

    public static String getReasonString(String str, Throwable th2) {
        return th2 != null ? formatString("%s: %s", str, th2) : formatString("%s", str);
    }

    public static String getRootCause(Exception exc) {
        if (!hasRootCause(exc)) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        int iIndexOf = string.indexOf("Caused by:");
        return string.substring(iIndexOf, string.indexOf("\n", iIndexOf));
    }

    private static String getSdkPrefix(String str) {
        String[] strArrSplit;
        if (str != null && str.contains("@") && (strArrSplit = str.split("@")) != null && strArrSplit.length == 2) {
            return strArrSplit[0];
        }
        return null;
    }

    public static String getSdkPrefixPlatform(String str) {
        String[] strArrSplit;
        String sdkPrefix = getSdkPrefix(str);
        if (sdkPrefix == null || (strArrSplit = sdkPrefix.split(InlineFilterValue.InlineFilterDateRangeValue.NUMERIC_ID_REGEX_PATTERN, 2)) == null || strArrSplit.length == 0) {
            return null;
        }
        return strArrSplit[0];
    }

    public static String getSdkVersion() {
        return Constants.CLIENT_SDK;
    }

    public static String[] getSupportedAbis() {
        return Build.SUPPORTED_ABIS;
    }

    public static long getWaitingTime(int i12, BackoffStrategy backoffStrategy) {
        if (i12 < backoffStrategy.minRetries) {
            return 0L;
        }
        return (long) (Math.min(((long) Math.pow(2.0d, i12 - r0)) * backoffStrategy.milliSecondMultiplier, backoffStrategy.maxWait) * randomInRange(backoffStrategy.minRange, backoffStrategy.maxRange));
    }

    public static boolean hasRootCause(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString().contains("Caused by:");
    }

    public static String hash(String str, String str2) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes(Constants.ENCODING);
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            messageDigest.update(bytes, 0, bytes.length);
            return convertToHex(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    public static int hashBoolean(Boolean bool, int i12) {
        int i13 = i12 * 37;
        return bool == null ? i13 : bool.hashCode() + i13;
    }

    public static int hashDouble(Double d12, int i12) {
        int i13 = i12 * 37;
        return d12 == null ? i13 : d12.hashCode() + i13;
    }

    public static int hashEnum(Enum r02, int i12) {
        int i13 = i12 * 37;
        return r02 == null ? i13 : r02.hashCode() + i13;
    }

    public static int hashLong(Long l12, int i12) {
        int i13 = i12 * 37;
        return l12 == null ? i13 : l12.hashCode() + i13;
    }

    public static int hashObject(Object obj, int i12) {
        int i13 = i12 * 37;
        return obj == null ? i13 : obj.hashCode() + i13;
    }

    public static int hashString(String str, int i12) {
        int i13 = i12 * 37;
        return str == null ? i13 : str.hashCode() + i13;
    }

    public static boolean isAdjustUninstallDetectionPayload(Map<String, String> map) {
        return map != null && map.size() == 1 && Objects.equals(map.get(Constants.FCM_PAYLOAD_KEY), Constants.FCM_PAYLOAD_VALUE);
    }

    public static boolean isEnabledFromActivityStateFile(Context context) {
        ActivityState activityState = (ActivityState) readObject(context, Constants.ACTIVITY_STATE_FILENAME, "Activity state", ActivityState.class);
        if (activityState == null) {
            return true;
        }
        return activityState.enabled;
    }

    private static boolean isEqualGoogleReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTime && referrerDetails.installBeginTimestampSeconds == activityState.installBegin && referrerDetails.referrerClickTimestampServerSeconds == activityState.clickTimeServer && referrerDetails.installBeginTimestampServerSeconds == activityState.installBeginServer && equalString(referrerDetails.installReferrer, activityState.installReferrer) && equalString(referrerDetails.installVersion, activityState.installVersion) && equalBoolean(referrerDetails.googlePlayInstant, activityState.googlePlayInstant);
    }

    private static boolean isEqualHuaweiReferrerAdsDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeHuawei && referrerDetails.installBeginTimestampSeconds == activityState.installBeginHuawei && equalString(referrerDetails.installReferrer, activityState.installReferrerHuawei);
    }

    private static boolean isEqualHuaweiReferrerAppGalleryDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeHuawei && referrerDetails.installBeginTimestampSeconds == activityState.installBeginHuawei && equalString(referrerDetails.installReferrer, activityState.installReferrerHuaweiAppGallery);
    }

    private static boolean isEqualMetaReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeMeta && equalString(referrerDetails.installReferrer, activityState.installReferrerMeta) && equalBoolean(referrerDetails.isClick, activityState.isClickMeta);
    }

    public static boolean isEqualReferrerDetails(ReferrerDetails referrerDetails, String str, ActivityState activityState) {
        if (str.equals(Constants.REFERRER_API_GOOGLE)) {
            return isEqualGoogleReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_HUAWEI_ADS)) {
            return isEqualHuaweiReferrerAdsDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_HUAWEI_APP_GALLERY)) {
            return isEqualHuaweiReferrerAppGalleryDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_SAMSUNG)) {
            return isEqualSamsungReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_XIAOMI)) {
            return isEqualXiaomiReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_VIVO)) {
            return isEqualVivoReferrerDetails(referrerDetails, activityState);
        }
        if (str.equals(Constants.REFERRER_API_META)) {
            return isEqualMetaReferrerDetails(referrerDetails, activityState);
        }
        return false;
    }

    private static boolean isEqualSamsungReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeSamsung && referrerDetails.installBeginTimestampSeconds == activityState.installBeginSamsung && equalString(referrerDetails.installReferrer, activityState.installReferrerSamsung);
    }

    private static boolean isEqualVivoReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeVivo && referrerDetails.installBeginTimestampSeconds == activityState.installBeginVivo && equalString(referrerDetails.installReferrer, activityState.installReferrerVivo) && equalString(referrerDetails.installVersion, activityState.installVersionVivo);
    }

    private static boolean isEqualXiaomiReferrerDetails(ReferrerDetails referrerDetails, ActivityState activityState) {
        return referrerDetails.referrerClickTimestampSeconds == activityState.clickTimeXiaomi && referrerDetails.installBeginTimestampSeconds == activityState.installBeginXiaomi && referrerDetails.referrerClickTimestampServerSeconds == activityState.clickTimeServerXiaomi && referrerDetails.installBeginTimestampServerSeconds == activityState.installBeginServerXiaomi && equalString(referrerDetails.installReferrer, activityState.installReferrerXiaomi) && equalString(referrerDetails.installVersion, activityState.installVersionXiaomi);
    }

    public static boolean isGooglePlayGamesForPC(Context context) {
        return context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
    }

    public static Boolean isPlayTrackingEnabled(Context context, Object obj, long j12) {
        return (Boolean) runSyncInPlayAdIdSchedulerWithTimeout(context, new c(context, obj), j12);
    }

    public static boolean isUrlFilteredOut(Uri uri) {
        String string;
        return uri == null || (string = uri.toString()) == null || string.length() == 0 || string.matches(Constants.FB_AUTH_REGEX);
    }

    public static boolean isValidParameter(String str, String str2, String str3) {
        if (str == null) {
            getLogger().error("%s parameter %s is missing", str3, str2);
            return false;
        }
        if (!str.equals("")) {
            return true;
        }
        getLogger().error("%s parameter %s is empty", str3, str2);
        return false;
    }

    public static Map<String, String> mergeParameters(Map<String, String> map, Map<String, String> map2, String str) {
        if (map == null) {
            return map2;
        }
        if (map2 == null) {
            return map;
        }
        HashMap map3 = new HashMap(map);
        ILogger logger = getLogger();
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String str2 = (String) map3.put(entry.getKey(), entry.getValue());
            if (str2 != null) {
                logger.warn("Key %s with value %s from %s parameter was replaced by value %s", entry.getKey(), str2, str, entry.getValue());
            }
        }
        return map3;
    }

    private static DecimalFormat newLocalDecimalFormat() {
        return new DecimalFormat("0.0", new DecimalFormatSymbols(Locale.US));
    }

    public static String quote(String str) {
        if (str == null) {
            return null;
        }
        return !Pattern.compile("\\s").matcher(str).find() ? str : formatString("'%s'", str);
    }

    private static double randomInRange(double d12, double d13) {
        return (new Random().nextDouble() * (d13 - d12)) + d12;
    }

    public static boolean readBooleanField(ObjectInputStream.GetField getField, String str, boolean z12) {
        try {
            return getField.get(str, z12);
        } catch (Exception e12) {
            getLogger().debug(fieldReadErrorMessage, str, e12.getMessage());
            return z12;
        }
    }

    public static double readDoubleField(ObjectInputStream.GetField getField, String str, double d12) {
        try {
            return getField.get(str, d12);
        } catch (Exception e12) {
            getLogger().debug(fieldReadErrorMessage, str, e12.getMessage());
            return d12;
        }
    }

    public static int readIntField(ObjectInputStream.GetField getField, String str, int i12) {
        try {
            return getField.get(str, i12);
        } catch (Exception e12) {
            getLogger().debug(fieldReadErrorMessage, str, e12.getMessage());
            return i12;
        }
    }

    public static long readLongField(ObjectInputStream.GetField getField, String str, long j12) {
        try {
            return getField.get(str, j12);
        } catch (Exception e12) {
            getLogger().debug(fieldReadErrorMessage, str, e12.getMessage());
            return j12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.BufferedInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T readObject(android.content.Context r3, java.lang.String r4, java.lang.String r5, java.lang.Class<T> r6) throws java.io.IOException {
        /*
            r0 = 0
            java.io.FileInputStream r3 = r3.openFileInput(r4)     // Catch: java.lang.Exception -> L6e java.io.FileNotFoundException -> L83
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch: java.lang.Exception -> L3f java.io.FileNotFoundException -> L44
            r4.<init>(r3)     // Catch: java.lang.Exception -> L3f java.io.FileNotFoundException -> L44
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch: java.lang.Exception -> L6c java.io.FileNotFoundException -> L86
            r3.<init>(r4)     // Catch: java.lang.Exception -> L6c java.io.FileNotFoundException -> L86
            java.lang.Object r4 = r3.readObject()     // Catch: java.lang.Exception -> L26 java.lang.ClassCastException -> L28 java.lang.ClassNotFoundException -> L2a
            java.lang.Object r0 = r6.cast(r4)     // Catch: java.lang.Exception -> L26 java.lang.ClassCastException -> L28 java.lang.ClassNotFoundException -> L2a
            com.adjust.sdk.ILogger r4 = getLogger()     // Catch: java.lang.Exception -> L26 java.lang.ClassCastException -> L28 java.lang.ClassNotFoundException -> L2a
            java.lang.String r6 = "Read %s: %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r0}     // Catch: java.lang.Exception -> L26 java.lang.ClassCastException -> L28 java.lang.ClassNotFoundException -> L2a
            r4.debug(r6, r1)     // Catch: java.lang.Exception -> L26 java.lang.ClassCastException -> L28 java.lang.ClassNotFoundException -> L2a
            goto L94
        L26:
            r4 = move-exception
            goto L2c
        L28:
            r4 = move-exception
            goto L48
        L2a:
            r4 = move-exception
            goto L5a
        L2c:
            com.adjust.sdk.ILogger r6 = getLogger()     // Catch: java.lang.Exception -> L3f java.io.FileNotFoundException -> L44
            java.lang.String r1 = "Failed to read %s object (%s)"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Exception -> L3f java.io.FileNotFoundException -> L44
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4}     // Catch: java.lang.Exception -> L3f java.io.FileNotFoundException -> L44
            r6.error(r1, r4)     // Catch: java.lang.Exception -> L3f java.io.FileNotFoundException -> L44
            goto L94
        L3f:
            r4 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
            goto L70
        L44:
            r2 = r0
            r0 = r3
            r3 = r2
            goto L84
        L48:
            com.adjust.sdk.ILogger r6 = getLogger()     // Catch: java.lang.Exception -> L3f java.io.FileNotFoundException -> L44
            java.lang.String r1 = "Failed to cast %s object (%s)"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Exception -> L3f java.io.FileNotFoundException -> L44
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4}     // Catch: java.lang.Exception -> L3f java.io.FileNotFoundException -> L44
            r6.error(r1, r4)     // Catch: java.lang.Exception -> L3f java.io.FileNotFoundException -> L44
            goto L94
        L5a:
            com.adjust.sdk.ILogger r6 = getLogger()     // Catch: java.lang.Exception -> L3f java.io.FileNotFoundException -> L44
            java.lang.String r1 = "Failed to find %s class (%s)"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Exception -> L3f java.io.FileNotFoundException -> L44
            java.lang.Object[] r4 = new java.lang.Object[]{r5, r4}     // Catch: java.lang.Exception -> L3f java.io.FileNotFoundException -> L44
            r6.error(r1, r4)     // Catch: java.lang.Exception -> L3f java.io.FileNotFoundException -> L44
            goto L94
        L6c:
            r3 = move-exception
            goto L74
        L6e:
            r4 = move-exception
            r3 = r0
        L70:
            r2 = r0
            r0 = r3
            r3 = r4
            r4 = r2
        L74:
            com.adjust.sdk.ILogger r6 = getLogger()
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r3}
            java.lang.String r1 = "Failed to open %s file for reading (%s)"
            r6.error(r1, r3)
        L81:
            r3 = r4
            goto L94
        L83:
            r3 = r0
        L84:
            r4 = r0
            r0 = r3
        L86:
            com.adjust.sdk.ILogger r3 = getLogger()
            java.lang.Object[] r6 = new java.lang.Object[]{r5}
            java.lang.String r1 = "%s file not found"
            r3.debug(r1, r6)
            goto L81
        L94:
            if (r3 == 0) goto La8
            r3.close()     // Catch: java.lang.Exception -> L9a
            goto La8
        L9a:
            r3 = move-exception
            com.adjust.sdk.ILogger r4 = getLogger()
            java.lang.Object[] r3 = new java.lang.Object[]{r5, r3}
            java.lang.String r5 = "Failed to close %s file for reading (%s)"
            r4.error(r5, r3)
        La8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.Util.readObject(android.content.Context, java.lang.String, java.lang.String, java.lang.Class):java.lang.Object");
    }

    public static <T> T readObjectField(ObjectInputStream.GetField getField, String str, T t12) {
        try {
            return (T) getField.get(str, t12);
        } catch (Exception e12) {
            getLogger().debug(fieldReadErrorMessage, str, e12.getMessage());
            return t12;
        }
    }

    public static String readStringField(ObjectInputStream.GetField getField, String str, String str2) {
        return (String) readObjectField(getField, str, str2);
    }

    public static boolean resolveContentProvider(Context context, String str) {
        try {
            return context.getPackageManager().resolveContentProvider(str, 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    private static <R> R runSyncInPlayAdIdSchedulerWithTimeout(Context context, Callable<R> callable, long j12) {
        if (playAdIdScheduler == null) {
            synchronized (Util.class) {
                try {
                    if (playAdIdScheduler == null) {
                        playAdIdScheduler = new SingleThreadFutureScheduler("PlayAdIdLibrary", true);
                    }
                } finally {
                }
            }
        }
        try {
            return (R) playAdIdScheduler.scheduleFutureWithReturn(callable, 0L).get(j12, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.ObjectOutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> void writeObject(T r1, android.content.Context r2, java.lang.String r3, java.lang.String r4) throws java.io.IOException {
        /*
            r0 = 0
            java.io.FileOutputStream r2 = r2.openFileOutput(r3, r0)     // Catch: java.lang.Exception -> L32
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> L20
            r3.<init>(r2)     // Catch: java.lang.Exception -> L20
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Exception -> L30
            r2.<init>(r3)     // Catch: java.lang.Exception -> L30
            r2.writeObject(r1)     // Catch: java.lang.Exception -> L20 java.io.NotSerializableException -> L22
            com.adjust.sdk.ILogger r3 = getLogger()     // Catch: java.lang.Exception -> L20 java.io.NotSerializableException -> L22
            java.lang.String r0 = "Wrote %s: %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1}     // Catch: java.lang.Exception -> L20 java.io.NotSerializableException -> L22
            r3.debug(r0, r1)     // Catch: java.lang.Exception -> L20 java.io.NotSerializableException -> L22
            goto L43
        L20:
            r1 = move-exception
            goto L34
        L22:
            com.adjust.sdk.ILogger r1 = getLogger()     // Catch: java.lang.Exception -> L20
            java.lang.String r3 = "Failed to serialize %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L20
            r1.error(r3, r0)     // Catch: java.lang.Exception -> L20
            goto L43
        L30:
            r1 = move-exception
            goto L35
        L32:
            r1 = move-exception
            r2 = 0
        L34:
            r3 = r2
        L35:
            com.adjust.sdk.ILogger r2 = getLogger()
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1}
            java.lang.String r0 = "Failed to open %s for writing (%s)"
            r2.error(r0, r1)
            r2 = r3
        L43:
            if (r2 == 0) goto L57
            r2.close()     // Catch: java.lang.Exception -> L49
            goto L57
        L49:
            r1 = move-exception
            com.adjust.sdk.ILogger r2 = getLogger()
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1}
            java.lang.String r3 = "Failed to close %s file for writing (%s)"
            r2.error(r3, r1)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.sdk.Util.writeObject(java.lang.Object, android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static void getGoogleAdId(Context context, OnGoogleAdIdReadListener onGoogleAdIdReadListener) {
        new d(onGoogleAdIdReadListener).execute(context);
    }
}
