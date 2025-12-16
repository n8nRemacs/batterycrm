package com.vk.id.network.useragent;

import AK.c;
import Y41.a;
import Y61.k;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import androidx.core.content.pm.b;
import com.vk.id.network.useragent.UserAgentProvider;
import java.util.Arrays;
import java.util.Locale;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.u0;
import okio.C44802l;

/* compiled from: UserAgentProvider.kt */
@s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u001b\u0010\u000f\u001a\u00020\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u001b\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001f\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\"\u001a\n  *\u0004\u0018\u00010\u00060\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u000e¨\u0006#"}, d2 = {"Lcom/vk/id/network/useragent/UserAgentProvider;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "string", "toHumanReadableAscii", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "userAgent$delegate", "Lkotlin/C;", "getUserAgent$network_release", "()Ljava/lang/String;", "userAgent", "Landroid/content/pm/PackageInfo;", "packageInfo$delegate", "getPackageInfo", "()Landroid/content/pm/PackageInfo;", "packageInfo", "Landroid/graphics/Point;", "displaySize$delegate", "getDisplaySize", "()Landroid/graphics/Point;", "getDisplaySize$annotations", "()V", "displaySize", "getAppBuild", "appBuild", "getAppVersion", "appVersion", "kotlin.jvm.PlatformType", "getPackageName", "packageName", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserAgentProvider {

    @k
    private final Context context;

    /* renamed from: displaySize$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C displaySize;

    /* renamed from: packageInfo$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C packageInfo;

    /* renamed from: userAgent$delegate, reason: from kotlin metadata */
    @k
    private final InterfaceC42726C userAgent;

    public UserAgentProvider(@k Context context) {
        this.context = context;
        final int i12 = 0;
        this.userAgent = C42727D.c(new a(this) { // from class: S11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UserAgentProvider f14792c;

            {
                this.f14792c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return UserAgentProvider.userAgent_delegate$lambda$0(this.f14792c);
                    case 1:
                        return UserAgentProvider.packageInfo_delegate$lambda$1(this.f14792c);
                    default:
                        return UserAgentProvider.displaySize_delegate$lambda$3(this.f14792c);
                }
            }
        });
        final int i13 = 1;
        this.packageInfo = C42727D.c(new a(this) { // from class: S11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UserAgentProvider f14792c;

            {
                this.f14792c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return UserAgentProvider.userAgent_delegate$lambda$0(this.f14792c);
                    case 1:
                        return UserAgentProvider.packageInfo_delegate$lambda$1(this.f14792c);
                    default:
                        return UserAgentProvider.displaySize_delegate$lambda$3(this.f14792c);
                }
            }
        });
        final int i14 = 2;
        this.displaySize = C42727D.c(new a(this) { // from class: S11.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UserAgentProvider f14792c;

            {
                this.f14792c = this;
            }

            @Override // Y41.a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return UserAgentProvider.userAgent_delegate$lambda$0(this.f14792c);
                    case 1:
                        return UserAgentProvider.packageInfo_delegate$lambda$1(this.f14792c);
                    default:
                        return UserAgentProvider.displaySize_delegate$lambda$3(this.f14792c);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Point displaySize_delegate$lambda$3(UserAgentProvider userAgentProvider) {
        WindowManager windowManager = (WindowManager) userAgentProvider.context.getSystemService("window");
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        return point;
    }

    private final String getAppBuild() {
        PackageInfo packageInfo = getPackageInfo();
        String string = packageInfo != null ? Long.valueOf(b.a(packageInfo)).toString() : null;
        return string == null ? "" : string;
    }

    private final String getAppVersion() {
        PackageInfo packageInfo = getPackageInfo();
        String str = packageInfo != null ? packageInfo.versionName : null;
        return str == null ? "" : str;
    }

    private final Point getDisplaySize() {
        return (Point) this.displaySize.getValue();
    }

    private final PackageInfo getPackageInfo() {
        return (PackageInfo) this.packageInfo.getValue();
    }

    private final String getPackageName() {
        return this.context.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageInfo packageInfo_delegate$lambda$1(UserAgentProvider userAgentProvider) {
        try {
            return userAgentProvider.context.getPackageManager().getPackageInfo(userAgentProvider.context.getPackageName(), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    private final String toHumanReadableAscii(String string) {
        int iCharCount = 0;
        while (iCharCount < string.length()) {
            int iCodePointAt = string.codePointAt(iCharCount);
            if (32 > iCodePointAt || iCodePointAt >= 127) {
                C44802l c44802l = new C44802l();
                c44802l.N(0, iCharCount, string);
                while (iCharCount < string.length()) {
                    int iCodePointAt2 = string.codePointAt(iCharCount);
                    c44802l.P((32 > iCodePointAt2 || iCodePointAt2 >= 127) ? 63 : iCodePointAt2);
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return c44802l.u();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String userAgent_delegate$lambda$0(UserAgentProvider userAgentProvider) {
        u0 u0Var = u0.f406856a;
        return userAgentProvider.toHumanReadableAscii(String.format(Locale.US, "%s/%s-%s (Android %s; SDK %d; %s; %s %s; %s; %dx%d)", Arrays.copyOf(new Object[]{c.k("VKID_2.5.1(", userAgentProvider.getPackageName(), ")"), userAgentProvider.getAppVersion(), userAgentProvider.getAppBuild(), Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT), Build.SUPPORTED_ABIS[0], Build.MANUFACTURER, Build.MODEL, System.getProperty("user.language"), Integer.valueOf(Math.max(userAgentProvider.getDisplaySize().x, userAgentProvider.getDisplaySize().y)), Integer.valueOf(Math.min(userAgentProvider.getDisplaySize().x, userAgentProvider.getDisplaySize().y))}, 11)));
    }

    @k
    public final String getUserAgent$network_release() {
        return (String) this.userAgent.getValue();
    }
}
