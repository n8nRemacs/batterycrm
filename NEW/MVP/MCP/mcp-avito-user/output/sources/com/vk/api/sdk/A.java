package com.vk.api.sdk;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.vk.api.sdk.utils.log.Logger;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.OkHttpClient;

/* compiled from: VKOkHttpProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/vk/api/sdk/A;", "", "<init>", "()V", "a", "b", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class A {

    /* compiled from: VKOkHttpProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/api/sdk/A$a;", "", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface a {
    }

    /* compiled from: VKOkHttpProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/A$b;", "Lcom/vk/api/sdk/A;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends A {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public volatile OkHttpClient f366520a;

        @Override // com.vk.api.sdk.A
        @Y61.k
        public final OkHttpClient a() throws PackageManager.NameNotFoundException {
            if (this.f366520a == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder builderFollowSslRedirects = builder.connectTimeout(20L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(20L, timeUnit).followRedirects(true).followSslRedirects(true);
                C37878d.f366575a.getClass();
                g gVar = C37878d.f366576b;
                if (gVar == null) {
                    throw new RuntimeException("please call VK.initialize first!");
                }
                PackageManager packageManager = gVar.f366591a.getPackageManager();
                g gVar2 = C37878d.f366576b;
                gVar2.getClass();
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(gVar2.f366591a.getPackageName(), 128);
                String strValueOf = String.valueOf(applicationInfo.metaData.get("VKSdkVersion"));
                String strValueOf2 = String.valueOf(applicationInfo.metaData.get("VKSdkVersionCode"));
                com.vk.api.sdk.utils.n nVar = com.vk.api.sdk.utils.n.f366742a;
                g gVar3 = C37878d.f366576b;
                gVar3.getClass();
                nVar.getClass();
                Point point = new Point();
                Object systemService = gVar3.f366591a.getSystemService("window");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
                }
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                Display.Mode mode = defaultDisplay == null ? null : defaultDisplay.getMode();
                point.x = mode == null ? 0 : mode.getPhysicalWidth();
                point.y = mode != null ? mode.getPhysicalHeight() : 0;
                this.f366520a = builderFollowSslRedirects.addInterceptor(new com.vk.api.sdk.okhttp.s(new com.vk.api.sdk.utils.d(strValueOf, strValueOf2, point))).build();
            }
            return this.f366520a;
        }

        @Override // com.vk.api.sdk.A
        public final void b(@Y61.k com.vk.api.sdk.okhttp.m mVar) {
            OkHttpClient.Builder builderNewBuilder = a().newBuilder();
            Logger.LogLevel logLevel = Logger.LogLevel.f366740f;
            com.vk.api.sdk.okhttp.l lVar = mVar.f366660a;
            if (logLevel != lVar.f366655a.f366661a.f366598h.b().getValue()) {
                g gVar = lVar.f366655a.f366661a;
                builderNewBuilder.addInterceptor(new com.vk.api.sdk.okhttp.c(gVar.f366602l, gVar.f366598h));
            }
            this.f366520a = builderNewBuilder.build();
        }
    }

    @Y61.k
    public abstract OkHttpClient a();

    public abstract void b(@Y61.k com.vk.api.sdk.okhttp.m mVar);
}
