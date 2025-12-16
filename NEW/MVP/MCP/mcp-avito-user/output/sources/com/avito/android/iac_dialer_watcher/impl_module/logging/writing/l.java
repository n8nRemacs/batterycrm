package com.avito.android.iac_dialer_watcher.impl_module.logging.writing;

import com.avito.android.InterfaceC32900o;
import com.avito.android.account.G;
import com.avito.android.remote.H;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.Gson;
import com.huawei.hms.api.FailedBinderCallBack;
import com.squareup.anvil.annotations.ContributesBinding;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: IacLogHeaderFactory.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/l;", "Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/k;", "a", "b", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final G f168086a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final H f168087b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f168088c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32900o f168089d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f168090e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Gson f168091f;

    /* compiled from: IacLogHeaderFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/l$a;", "", "<init>", "()V", "", "TIME_FORMAT", "Ljava/lang/String;", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IacLogHeaderFactory.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/avito/android/iac_dialer_watcher/impl_module/logging/writing/l$b;", "", "", ChannelContext.Item.USER_ID, "hashUserId", "createdAt", "deviceId", "app", "appVersion", "model", "vendor", "os", "osVersion", FailedBinderCallBack.CALLER_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "getHashUserId", "getCreatedAt", "getDeviceId", "getApp", "getAppVersion", "getModel", "getVendor", "getOs", "getOsVersion", "getCallId", "_avito_iac-dialer-watcher_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        @com.google.gson.annotations.c("app")
        @Y61.k
        private final String app;

        @com.google.gson.annotations.c("appVersion")
        @Y61.k
        private final String appVersion;

        @com.google.gson.annotations.c(FailedBinderCallBack.CALLER_ID)
        @Y61.k
        private final String callId;

        @com.google.gson.annotations.c("createdAt")
        @Y61.k
        private final String createdAt;

        @com.google.gson.annotations.c("deviceId")
        @Y61.k
        private final String deviceId;

        @com.google.gson.annotations.c("hashUserId")
        @Y61.k
        private final String hashUserId;

        @com.google.gson.annotations.c("model")
        @Y61.k
        private final String model;

        @com.google.gson.annotations.c("os")
        @Y61.k
        private final String os;

        @com.google.gson.annotations.c("osVersion")
        @Y61.k
        private final String osVersion;

        @com.google.gson.annotations.c(ChannelContext.Item.USER_ID)
        @Y61.k
        private final String userId;

        @com.google.gson.annotations.c("vendor")
        @Y61.k
        private final String vendor;

        public b(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k String str5, @Y61.k String str6, @Y61.k String str7, @Y61.k String str8, @Y61.k String str9, @Y61.k String str10, @Y61.k String str11) {
            this.userId = str;
            this.hashUserId = str2;
            this.createdAt = str3;
            this.deviceId = str4;
            this.app = str5;
            this.appVersion = str6;
            this.model = str7;
            this.vendor = str8;
            this.os = str9;
            this.osVersion = str10;
            this.callId = str11;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public l(@Y61.k G g12, @Y61.k H h12, @Y61.k com.avito.android.util.C c12, @Y61.k InterfaceC32900o interfaceC32900o, @Y61.k com.avito.android.server_time.f fVar, @Y61.k Gson gson) {
        this.f168086a = g12;
        this.f168087b = h12;
        this.f168088c = c12;
        this.f168089d = interfaceC32900o;
        this.f168090e = fVar;
        this.f168091f = gson;
    }

    @Override // com.avito.android.iac_dialer_watcher.impl_module.logging.writing.k
    @Y61.k
    public final String a(@Y61.k String str) {
        G g12 = this.f168086a;
        String userId = g12.e().getUserId();
        if (userId == null) {
            userId = "";
        }
        String userHashId = g12.e().getUserHashId();
        String str2 = userHashId != null ? userHashId : "";
        String str3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", Locale.US).format(new Date(this.f168090e.now()));
        String f253025a = this.f168087b.getF253025a();
        com.avito.android.util.C c12 = this.f168088c;
        return this.f168091f.l(new b(userId, str2, str3, f253025a, c12.getF125485e(), this.f168089d.f().invoke(), c12.getF125482b(), c12.getF125483c(), "android", String.valueOf(c12.getF125487g()), str));
    }
}
