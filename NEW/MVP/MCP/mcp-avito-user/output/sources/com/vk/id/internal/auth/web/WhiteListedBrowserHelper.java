package com.vk.id.internal.auth.web;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.vk.id.internal.context.InternalVKIDPackageManager;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: WhiteListedBrowserHelper.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/vk/id/internal/auth/web/WhiteListedBrowserHelper;", "", "<init>", "()V", "WHITE_LIST", "", "Lcom/vk/id/internal/auth/web/VersionedBrowserMatcher;", "selectBestBrowser", "Lcom/vk/id/internal/auth/web/BrowserDescriptor;", "pm", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WhiteListedBrowserHelper {

    @k
    public static final WhiteListedBrowserHelper INSTANCE = new WhiteListedBrowserHelper();

    @k
    private static final List<VersionedBrowserMatcher> WHITE_LIST = C42745f0.U(VersionedBrowserMatcher.CHROME_BROWSER, VersionedBrowserMatcher.CHROME_CUSTOM_TAB, VersionedBrowserMatcher.FIREFOX_CUSTOM_TAB, VersionedBrowserMatcher.FIREFOX_BROWSER, VersionedBrowserMatcher.SAMSUNG_BROWSER, VersionedBrowserMatcher.SAMSUNG_CUSTOM_TAB);
    public static final int $stable = 8;

    private WhiteListedBrowserHelper() {
    }

    @l
    public final BrowserDescriptor selectBestBrowser(@k InternalVKIDPackageManager pm2) {
        try {
            List<BrowserDescriptor> allBrowsers = BrowserSelector.INSTANCE.getAllBrowsers(pm2);
            for (BrowserDescriptor browserDescriptor : allBrowsers) {
                Iterator<VersionedBrowserMatcher> it = WHITE_LIST.iterator();
                while (it.hasNext()) {
                    if (it.next().matches(browserDescriptor)) {
                        return browserDescriptor;
                    }
                }
            }
            if (allBrowsers.isEmpty()) {
                return null;
            }
            return allBrowsers.get(0);
        } catch (Exception unused) {
            return null;
        }
    }
}
