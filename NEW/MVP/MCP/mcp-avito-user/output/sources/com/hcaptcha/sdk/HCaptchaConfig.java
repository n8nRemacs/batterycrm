package com.hcaptcha.sdk;

import edu.umd.cs.findbugs.annotations.Nullable;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.util.Locale;
import lombok.Generated;
import lombok.NonNull;

/* loaded from: classes7.dex */
public class HCaptchaConfig implements Serializable {

    @com.fasterxml.jackson.annotation.o
    @Deprecated
    private String apiEndpoint;
    private String assethost;
    private String customTheme;
    private Boolean diagnosticLog;
    private String endpoint;
    private Boolean hideDialog;
    private String host;
    private String imghost;
    private String jsSrc;
    private Boolean loading;
    private String locale;
    private HCaptchaOrientation orientation;
    private String reportapi;

    @Deprecated
    private Boolean resetOnTimeout;

    @com.fasterxml.jackson.annotation.o
    private s retryPredicate;
    private String rqdata;
    private Boolean sentry;

    @NonNull
    private String siteKey;
    private HCaptchaSize size;
    private HCaptchaTheme theme;
    private long tokenExpiration;

    public static class a {

        /* renamed from: A, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f363037A;

        /* renamed from: B, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Boolean f363038B;

        /* renamed from: C, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f363039C;

        /* renamed from: D, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public s f363040D;

        /* renamed from: E, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f363041E;

        /* renamed from: F, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public long f363042F;

        /* renamed from: G, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f363043G;

        /* renamed from: H, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Boolean f363044H;

        /* renamed from: a, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f363045a;

        /* renamed from: b, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f363046b;

        /* renamed from: c, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Boolean f363047c;

        /* renamed from: d, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f363048d;

        /* renamed from: e, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Boolean f363049e;

        /* renamed from: f, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f363050f;

        /* renamed from: g, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public Boolean f363051g;

        /* renamed from: h, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f363052h;

        /* renamed from: i, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f363053i;

        /* renamed from: j, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f363054j;

        /* renamed from: k, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f363055k;

        /* renamed from: l, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f363056l;

        /* renamed from: m, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f363057m;

        /* renamed from: n, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f363058n;

        /* renamed from: o, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f363059o;

        /* renamed from: p, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f363060p;

        /* renamed from: q, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f363061q;

        /* renamed from: r, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public HCaptchaSize f363062r;

        /* renamed from: s, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f363063s;

        /* renamed from: t, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public HCaptchaOrientation f363064t;

        /* renamed from: u, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f363065u;

        /* renamed from: v, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public HCaptchaTheme f363066v;

        /* renamed from: w, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f363067w;

        /* renamed from: x, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f363068x;

        /* renamed from: y, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public boolean f363069y;

        /* renamed from: z, reason: collision with root package name */
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public String f363070z;

        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public a() {
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public final HCaptchaConfig a() {
            Boolean bool$default$sentry = this.f363047c;
            if (!this.f363046b) {
                bool$default$sentry = HCaptchaConfig.$default$sentry();
            }
            Boolean bool = bool$default$sentry;
            Boolean bool$default$loading = this.f363049e;
            if (!this.f363048d) {
                bool$default$loading = HCaptchaConfig.$default$loading();
            }
            Boolean bool2 = bool$default$loading;
            Boolean bool$default$hideDialog = this.f363051g;
            if (!this.f363050f) {
                bool$default$hideDialog = HCaptchaConfig.$default$hideDialog();
            }
            Boolean bool3 = bool$default$hideDialog;
            String str$default$apiEndpoint = HCaptchaConfig.$default$apiEndpoint();
            String str$default$jsSrc = this.f363054j;
            if (!this.f363053i) {
                str$default$jsSrc = HCaptchaConfig.$default$jsSrc();
            }
            String str = str$default$jsSrc;
            String str$default$locale = this.f363060p;
            if (!this.f363059o) {
                str$default$locale = HCaptchaConfig.$default$locale();
            }
            String str2 = str$default$locale;
            HCaptchaSize hCaptchaSize$default$size = this.f363062r;
            if (!this.f363061q) {
                hCaptchaSize$default$size = HCaptchaConfig.$default$size();
            }
            HCaptchaSize hCaptchaSize = hCaptchaSize$default$size;
            HCaptchaOrientation hCaptchaOrientation$default$orientation = this.f363064t;
            if (!this.f363063s) {
                hCaptchaOrientation$default$orientation = HCaptchaConfig.$default$orientation();
            }
            HCaptchaOrientation hCaptchaOrientation = hCaptchaOrientation$default$orientation;
            HCaptchaTheme hCaptchaTheme$default$theme = this.f363066v;
            if (!this.f363065u) {
                hCaptchaTheme$default$theme = HCaptchaConfig.$default$theme();
            }
            HCaptchaTheme hCaptchaTheme = hCaptchaTheme$default$theme;
            String str$default$host = this.f363068x;
            if (!this.f363067w) {
                str$default$host = HCaptchaConfig.$default$host();
            }
            String str3 = str$default$host;
            String str$default$customTheme = this.f363070z;
            if (!this.f363069y) {
                str$default$customTheme = HCaptchaConfig.$default$customTheme();
            }
            String str4 = str$default$customTheme;
            Boolean bool$default$resetOnTimeout = this.f363038B;
            if (!this.f363037A) {
                bool$default$resetOnTimeout = HCaptchaConfig.$default$resetOnTimeout();
            }
            Boolean bool4 = bool$default$resetOnTimeout;
            s sVar$default$retryPredicate = this.f363040D;
            if (!this.f363039C) {
                sVar$default$retryPredicate = HCaptchaConfig.$default$retryPredicate();
            }
            s sVar = sVar$default$retryPredicate;
            long j$default$tokenExpiration = this.f363042F;
            if (!this.f363041E) {
                j$default$tokenExpiration = HCaptchaConfig.$default$tokenExpiration();
            }
            long j12 = j$default$tokenExpiration;
            Boolean bool$default$diagnosticLog = this.f363044H;
            if (!this.f363043G) {
                bool$default$diagnosticLog = HCaptchaConfig.$default$diagnosticLog();
            }
            return new HCaptchaConfig(this.f363045a, bool, bool2, bool3, this.f363052h, str$default$apiEndpoint, str, this.f363055k, this.f363056l, this.f363057m, this.f363058n, str2, hCaptchaSize, hCaptchaOrientation, hCaptchaTheme, str3, str4, bool4, sVar, j12, bool$default$diagnosticLog);
        }

        @edu.umd.cs.findbugs.annotations.NonNull
        @SuppressFBWarnings(justification = "generated code")
        @Generated
        public final String toString() {
            return "HCaptchaConfig.HCaptchaConfigBuilder(siteKey=" + this.f363045a + ", sentry$value=" + this.f363047c + ", loading$value=" + this.f363049e + ", hideDialog$value=" + this.f363051g + ", rqdata=" + this.f363052h + ", apiEndpoint$value=null, jsSrc$value=" + this.f363054j + ", endpoint=" + this.f363055k + ", reportapi=" + this.f363056l + ", assethost=" + this.f363057m + ", imghost=" + this.f363058n + ", locale$value=" + this.f363060p + ", size$value=" + this.f363062r + ", orientation$value=" + this.f363064t + ", theme$value=" + this.f363066v + ", host$value=" + this.f363068x + ", customTheme$value=" + this.f363070z + ", resetOnTimeout$value=" + this.f363038B + ", retryPredicate$value=" + this.f363040D + ", tokenExpiration$value=" + this.f363042F + ", diagnosticLog$value=" + this.f363044H + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static String $default$apiEndpoint() {
        return "https://js.hcaptcha.com/1/api.js";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static String $default$customTheme() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static Boolean $default$diagnosticLog() {
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static Boolean $default$hideDialog() {
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static String $default$host() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static String $default$jsSrc() {
        return "https://js.hcaptcha.com/1/api.js";
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static Boolean $default$loading() {
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static String $default$locale() {
        return Locale.getDefault().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static HCaptchaOrientation $default$orientation() {
        return HCaptchaOrientation.PORTRAIT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static Boolean $default$resetOnTimeout() {
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static s $default$retryPredicate() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static Boolean $default$sentry() {
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static HCaptchaSize $default$size() {
        return HCaptchaSize.INVISIBLE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static HCaptchaTheme $default$theme() {
        return HCaptchaTheme.LIGHT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static long $default$tokenExpiration() {
        return 120L;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaConfig(@NonNull String str, Boolean bool, Boolean bool2, Boolean bool3, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, HCaptchaSize hCaptchaSize, HCaptchaOrientation hCaptchaOrientation, HCaptchaTheme hCaptchaTheme, String str10, String str11, Boolean bool4, s sVar, long j12, Boolean bool5) {
        if (str == null) {
            throw new NullPointerException("siteKey is marked non-null but is null");
        }
        this.siteKey = str;
        this.sentry = bool;
        this.loading = bool2;
        this.hideDialog = bool3;
        this.rqdata = str2;
        this.apiEndpoint = str3;
        this.jsSrc = str4;
        this.endpoint = str5;
        this.reportapi = str6;
        this.assethost = str7;
        this.imghost = str8;
        this.locale = str9;
        this.size = hCaptchaSize;
        this.orientation = hCaptchaOrientation;
        this.theme = hCaptchaTheme;
        this.host = str10;
        this.customTheme = str11;
        this.resetOnTimeout = bool4;
        this.retryPredicate = sVar;
        this.tokenExpiration = j12;
        this.diagnosticLog = bool5;
    }

    @edu.umd.cs.findbugs.annotations.NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public static a builder() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$$default$retryPredicate$41a513e9$1(HCaptchaConfig hCaptchaConfig, HCaptchaException hCaptchaException) {
        return Boolean.TRUE.equals(hCaptchaConfig.resetOnTimeout) && hCaptchaException.f363082b == HCaptchaError.SESSION_TIMEOUT;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean canEqual(@Nullable Object obj) {
        return obj instanceof HCaptchaConfig;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HCaptchaConfig)) {
            return false;
        }
        HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) obj;
        if (!hCaptchaConfig.canEqual(this) || getTokenExpiration() != hCaptchaConfig.getTokenExpiration()) {
            return false;
        }
        Boolean sentry = getSentry();
        Boolean sentry2 = hCaptchaConfig.getSentry();
        if (sentry != null ? !sentry.equals(sentry2) : sentry2 != null) {
            return false;
        }
        Boolean loading = getLoading();
        Boolean loading2 = hCaptchaConfig.getLoading();
        if (loading != null ? !loading.equals(loading2) : loading2 != null) {
            return false;
        }
        Boolean hideDialog = getHideDialog();
        Boolean hideDialog2 = hCaptchaConfig.getHideDialog();
        if (hideDialog != null ? !hideDialog.equals(hideDialog2) : hideDialog2 != null) {
            return false;
        }
        Boolean resetOnTimeout = getResetOnTimeout();
        Boolean resetOnTimeout2 = hCaptchaConfig.getResetOnTimeout();
        if (resetOnTimeout != null ? !resetOnTimeout.equals(resetOnTimeout2) : resetOnTimeout2 != null) {
            return false;
        }
        Boolean diagnosticLog = getDiagnosticLog();
        Boolean diagnosticLog2 = hCaptchaConfig.getDiagnosticLog();
        if (diagnosticLog != null ? !diagnosticLog.equals(diagnosticLog2) : diagnosticLog2 != null) {
            return false;
        }
        String siteKey = getSiteKey();
        String siteKey2 = hCaptchaConfig.getSiteKey();
        if (siteKey != null ? !siteKey.equals(siteKey2) : siteKey2 != null) {
            return false;
        }
        String rqdata = getRqdata();
        String rqdata2 = hCaptchaConfig.getRqdata();
        if (rqdata != null ? !rqdata.equals(rqdata2) : rqdata2 != null) {
            return false;
        }
        String apiEndpoint = getApiEndpoint();
        String apiEndpoint2 = hCaptchaConfig.getApiEndpoint();
        if (apiEndpoint != null ? !apiEndpoint.equals(apiEndpoint2) : apiEndpoint2 != null) {
            return false;
        }
        String jsSrc = getJsSrc();
        String jsSrc2 = hCaptchaConfig.getJsSrc();
        if (jsSrc != null ? !jsSrc.equals(jsSrc2) : jsSrc2 != null) {
            return false;
        }
        String endpoint = getEndpoint();
        String endpoint2 = hCaptchaConfig.getEndpoint();
        if (endpoint != null ? !endpoint.equals(endpoint2) : endpoint2 != null) {
            return false;
        }
        String reportapi = getReportapi();
        String reportapi2 = hCaptchaConfig.getReportapi();
        if (reportapi != null ? !reportapi.equals(reportapi2) : reportapi2 != null) {
            return false;
        }
        String assethost = getAssethost();
        String assethost2 = hCaptchaConfig.getAssethost();
        if (assethost != null ? !assethost.equals(assethost2) : assethost2 != null) {
            return false;
        }
        String imghost = getImghost();
        String imghost2 = hCaptchaConfig.getImghost();
        if (imghost != null ? !imghost.equals(imghost2) : imghost2 != null) {
            return false;
        }
        String locale = getLocale();
        String locale2 = hCaptchaConfig.getLocale();
        if (locale != null ? !locale.equals(locale2) : locale2 != null) {
            return false;
        }
        HCaptchaSize size = getSize();
        HCaptchaSize size2 = hCaptchaConfig.getSize();
        if (size != null ? !size.equals(size2) : size2 != null) {
            return false;
        }
        HCaptchaOrientation orientation = getOrientation();
        HCaptchaOrientation orientation2 = hCaptchaConfig.getOrientation();
        if (orientation != null ? !orientation.equals(orientation2) : orientation2 != null) {
            return false;
        }
        HCaptchaTheme theme = getTheme();
        HCaptchaTheme theme2 = hCaptchaConfig.getTheme();
        if (theme != null ? !theme.equals(theme2) : theme2 != null) {
            return false;
        }
        String host = getHost();
        String host2 = hCaptchaConfig.getHost();
        if (host != null ? !host.equals(host2) : host2 != null) {
            return false;
        }
        String customTheme = getCustomTheme();
        String customTheme2 = hCaptchaConfig.getCustomTheme();
        if (customTheme != null ? !customTheme.equals(customTheme2) : customTheme2 != null) {
            return false;
        }
        s retryPredicate = getRetryPredicate();
        s retryPredicate2 = hCaptchaConfig.getRetryPredicate();
        return retryPredicate != null ? retryPredicate.equals(retryPredicate2) : retryPredicate2 == null;
    }

    @Deprecated
    public String getApiEndpoint() {
        return this.jsSrc;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getAssethost() {
        return this.assethost;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getCustomTheme() {
        return this.customTheme;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getDiagnosticLog() {
        return this.diagnosticLog;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getEndpoint() {
        return this.endpoint;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getHideDialog() {
        return this.hideDialog;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getHost() {
        return this.host;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getImghost() {
        return this.imghost;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getJsSrc() {
        return this.jsSrc;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getLoading() {
        return this.loading;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getLocale() {
        return this.locale;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaOrientation getOrientation() {
        return this.orientation;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getReportapi() {
        return this.reportapi;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @Deprecated
    public Boolean getResetOnTimeout() {
        return this.resetOnTimeout;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public s getRetryPredicate() {
        return this.retryPredicate;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getRqdata() {
        return this.rqdata;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public Boolean getSentry() {
        return this.sentry;
    }

    @NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String getSiteKey() {
        return this.siteKey;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaSize getSize() {
        return this.size;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public HCaptchaTheme getTheme() {
        return this.theme;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public long getTokenExpiration() {
        return this.tokenExpiration;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public int hashCode() {
        long tokenExpiration = getTokenExpiration();
        Boolean sentry = getSentry();
        int iHashCode = ((((int) (tokenExpiration ^ (tokenExpiration >>> 32))) + 59) * 59) + (sentry == null ? 43 : sentry.hashCode());
        Boolean loading = getLoading();
        int iHashCode2 = (iHashCode * 59) + (loading == null ? 43 : loading.hashCode());
        Boolean hideDialog = getHideDialog();
        int iHashCode3 = (iHashCode2 * 59) + (hideDialog == null ? 43 : hideDialog.hashCode());
        Boolean resetOnTimeout = getResetOnTimeout();
        int iHashCode4 = (iHashCode3 * 59) + (resetOnTimeout == null ? 43 : resetOnTimeout.hashCode());
        Boolean diagnosticLog = getDiagnosticLog();
        int iHashCode5 = (iHashCode4 * 59) + (diagnosticLog == null ? 43 : diagnosticLog.hashCode());
        String siteKey = getSiteKey();
        int iHashCode6 = (iHashCode5 * 59) + (siteKey == null ? 43 : siteKey.hashCode());
        String rqdata = getRqdata();
        int iHashCode7 = (iHashCode6 * 59) + (rqdata == null ? 43 : rqdata.hashCode());
        String apiEndpoint = getApiEndpoint();
        int iHashCode8 = (iHashCode7 * 59) + (apiEndpoint == null ? 43 : apiEndpoint.hashCode());
        String jsSrc = getJsSrc();
        int iHashCode9 = (iHashCode8 * 59) + (jsSrc == null ? 43 : jsSrc.hashCode());
        String endpoint = getEndpoint();
        int iHashCode10 = (iHashCode9 * 59) + (endpoint == null ? 43 : endpoint.hashCode());
        String reportapi = getReportapi();
        int iHashCode11 = (iHashCode10 * 59) + (reportapi == null ? 43 : reportapi.hashCode());
        String assethost = getAssethost();
        int iHashCode12 = (iHashCode11 * 59) + (assethost == null ? 43 : assethost.hashCode());
        String imghost = getImghost();
        int iHashCode13 = (iHashCode12 * 59) + (imghost == null ? 43 : imghost.hashCode());
        String locale = getLocale();
        int iHashCode14 = (iHashCode13 * 59) + (locale == null ? 43 : locale.hashCode());
        HCaptchaSize size = getSize();
        int iHashCode15 = (iHashCode14 * 59) + (size == null ? 43 : size.hashCode());
        HCaptchaOrientation orientation = getOrientation();
        int iHashCode16 = (iHashCode15 * 59) + (orientation == null ? 43 : orientation.hashCode());
        HCaptchaTheme theme = getTheme();
        int iHashCode17 = (iHashCode16 * 59) + (theme == null ? 43 : theme.hashCode());
        String host = getHost();
        int iHashCode18 = (iHashCode17 * 59) + (host == null ? 43 : host.hashCode());
        String customTheme = getCustomTheme();
        int iHashCode19 = (iHashCode18 * 59) + (customTheme == null ? 43 : customTheme.hashCode());
        s retryPredicate = getRetryPredicate();
        return (iHashCode19 * 59) + (retryPredicate != null ? retryPredicate.hashCode() : 43);
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @Deprecated
    @com.fasterxml.jackson.annotation.o
    public void setApiEndpoint(String str) {
        this.apiEndpoint = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setAssethost(String str) {
        this.assethost = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setCustomTheme(String str) {
        this.customTheme = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setDiagnosticLog(Boolean bool) {
        this.diagnosticLog = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setEndpoint(String str) {
        this.endpoint = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setHideDialog(Boolean bool) {
        this.hideDialog = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setHost(String str) {
        this.host = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setImghost(String str) {
        this.imghost = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setJsSrc(String str) {
        this.jsSrc = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setLoading(Boolean bool) {
        this.loading = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setLocale(String str) {
        this.locale = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setOrientation(HCaptchaOrientation hCaptchaOrientation) {
        this.orientation = hCaptchaOrientation;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setReportapi(String str) {
        this.reportapi = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @Deprecated
    public void setResetOnTimeout(Boolean bool) {
        this.resetOnTimeout = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    @com.fasterxml.jackson.annotation.o
    public void setRetryPredicate(s sVar) {
        this.retryPredicate = sVar;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setRqdata(String str) {
        this.rqdata = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSentry(Boolean bool) {
        this.sentry = bool;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSiteKey(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("siteKey is marked non-null but is null");
        }
        this.siteKey = str;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setSize(HCaptchaSize hCaptchaSize) {
        this.size = hCaptchaSize;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setTheme(HCaptchaTheme hCaptchaTheme) {
        this.theme = hCaptchaTheme;
    }

    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public void setTokenExpiration(long j12) {
        this.tokenExpiration = j12;
    }

    @edu.umd.cs.findbugs.annotations.NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public a toBuilder() {
        a aVar = new a();
        String str = this.siteKey;
        if (str == null) {
            throw new NullPointerException("siteKey is marked non-null but is null");
        }
        aVar.f363045a = str;
        aVar.f363047c = this.sentry;
        aVar.f363046b = true;
        aVar.f363049e = this.loading;
        aVar.f363048d = true;
        aVar.f363051g = this.hideDialog;
        aVar.f363050f = true;
        aVar.f363052h = this.rqdata;
        aVar.f363054j = this.jsSrc;
        aVar.f363053i = true;
        aVar.f363055k = this.endpoint;
        aVar.f363056l = this.reportapi;
        aVar.f363057m = this.assethost;
        aVar.f363058n = this.imghost;
        aVar.f363060p = this.locale;
        aVar.f363059o = true;
        aVar.f363062r = this.size;
        aVar.f363061q = true;
        aVar.f363064t = this.orientation;
        aVar.f363063s = true;
        aVar.f363066v = this.theme;
        aVar.f363065u = true;
        aVar.f363068x = this.host;
        aVar.f363067w = true;
        aVar.f363070z = this.customTheme;
        aVar.f363069y = true;
        aVar.f363038B = this.resetOnTimeout;
        aVar.f363037A = true;
        aVar.f363040D = this.retryPredicate;
        aVar.f363039C = true;
        aVar.f363042F = this.tokenExpiration;
        aVar.f363041E = true;
        aVar.f363044H = this.diagnosticLog;
        aVar.f363043G = true;
        return aVar;
    }

    @edu.umd.cs.findbugs.annotations.NonNull
    @SuppressFBWarnings(justification = "generated code")
    @Generated
    public String toString() {
        return "HCaptchaConfig(siteKey=" + getSiteKey() + ", sentry=" + getSentry() + ", loading=" + getLoading() + ", hideDialog=" + getHideDialog() + ", rqdata=" + getRqdata() + ", apiEndpoint=" + getApiEndpoint() + ", jsSrc=" + getJsSrc() + ", endpoint=" + getEndpoint() + ", reportapi=" + getReportapi() + ", assethost=" + getAssethost() + ", imghost=" + getImghost() + ", locale=" + getLocale() + ", size=" + getSize() + ", orientation=" + getOrientation() + ", theme=" + getTheme() + ", host=" + getHost() + ", customTheme=" + getCustomTheme() + ", resetOnTimeout=" + getResetOnTimeout() + ", retryPredicate=" + getRetryPredicate() + ", tokenExpiration=" + getTokenExpiration() + ", diagnosticLog=" + getDiagnosticLog() + ")";
    }
}
