package com.vk.id.internal.auth.web;

import Y61.k;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.h;
import androidx.compose.runtime.internal.P;
import com.vk.id.internal.auth.AuthEventBridge;
import com.vk.id.internal.auth.AuthOptions;
import com.vk.id.internal.auth.AuthOptionsKt;
import com.vk.id.internal.auth.AuthResult;
import com.vk.id.internal.auth.VKIDAuthProvider;
import com.vk.id.internal.context.InternalVKIDActivityStarter;
import com.vk.id.internal.context.InternalVKIDPackageManager;
import com.vk.id.logger.InternalVKIDLog;
import com.vk.id.logger.InternalVKIDLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WebAuthProvider.kt */
@P
@s0
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/vk/id/internal/auth/web/WebAuthProvider;", "Lcom/vk/id/internal/auth/VKIDAuthProvider;", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "context", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "starter", "<init>", "(Lcom/vk/id/internal/context/InternalVKIDPackageManager;Lcom/vk/id/internal/context/InternalVKIDActivityStarter;)V", "", "throwable", "Lkotlin/G0;", "sendNoBrowserAuthEvent", "(Ljava/lang/Throwable;)V", "Lcom/vk/id/internal/auth/AuthOptions;", "authOptions", "auth", "(Lcom/vk/id/internal/auth/AuthOptions;)V", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "Lcom/vk/id/internal/context/InternalVKIDActivityStarter;", "Lcom/vk/id/logger/InternalVKIDLogger;", "logger", "Lcom/vk/id/logger/InternalVKIDLogger;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WebAuthProvider implements VKIDAuthProvider {

    @k
    private final InternalVKIDPackageManager context;

    @k
    private final InternalVKIDLogger logger = InternalVKIDLog.INSTANCE.createLoggerForTag("WebAuthProvider");

    @k
    private final InternalVKIDActivityStarter starter;

    public WebAuthProvider(@k InternalVKIDPackageManager internalVKIDPackageManager, @k InternalVKIDActivityStarter internalVKIDActivityStarter) {
        this.context = internalVKIDPackageManager;
        this.starter = internalVKIDActivityStarter;
    }

    private final void sendNoBrowserAuthEvent(Throwable throwable) {
        this.logger.error("Can't start browser to auth", throwable);
        AuthEventBridge.INSTANCE.onAuthResult$vkid_release(new AuthResult.NoBrowserAvailable("Error. Make sure you have a browser installed.", throwable));
    }

    @Override // com.vk.id.internal.auth.VKIDAuthProvider
    public void auth(@k AuthOptions authOptions) {
        Uri authUriBrowser = AuthOptionsKt.toAuthUriBrowser(authOptions);
        BrowserDescriptor browserDescriptorSelectBestBrowser = WhiteListedBrowserHelper.INSTANCE.selectBestBrowser(this.context);
        if (browserDescriptorSelectBestBrowser == null) {
            sendNoBrowserAuthEvent(null);
            return;
        }
        this.logger.debug("Auth with browser " + browserDescriptorSelectBestBrowser.getPackageName());
        Intent intentAddCategory = browserDescriptorSelectBestBrowser.getUseCustomTab() ? new h.i().a().f22864a : new Intent("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE");
        intentAddCategory.setData(authUriBrowser);
        intentAddCategory.setPackage(browserDescriptorSelectBestBrowser.getPackageName());
        try {
            this.starter.startActivity(intentAddCategory);
        } catch (ActivityNotFoundException e12) {
            sendNoBrowserAuthEvent(e12);
        }
    }
}
