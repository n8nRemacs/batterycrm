package com.avito.android.app.task;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.pm.ShortcutManager;
import com.avito.android.R;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.deep_linking.links.ChannelsLink;
import com.avito.android.deep_linking.links.UserAdvertsLink;
import com.avito.android.user_favorites.FavoritesLink;
import com.avito.android.util.InterfaceC35871p5;
import com.avito.android.util.V2;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShortcutsTask.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/android/app/task/ShortcutsTaskImpl;", "Lcom/avito/android/app/task/ShortcutsTask;", "Landroid/content/pm/ShortcutManager;", "shortcutManager", "Lcom/avito/android/util/p5;", "shortcutInfoFactory", "<init>", "(Landroid/content/pm/ShortcutManager;Lcom/avito/android/util/p5;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Landroid/content/pm/ShortcutManager;", "Lcom/avito/android/util/p5;", "Companion", "a", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(AvailableCode.ERROR_ON_ACTIVITY_RESULT)
/* loaded from: classes11.dex */
public final class ShortcutsTaskImpl implements ShortcutsTask {

    @Y61.k
    private static final a Companion = new a(null);

    @Y61.k
    private final InterfaceC35871p5 shortcutInfoFactory;

    @Y61.k
    private final ShortcutManager shortcutManager;

    /* compiled from: ShortcutsTask.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/app/task/ShortcutsTaskImpl$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public ShortcutsTaskImpl(@Y61.k ShortcutManager shortcutManager, @Y61.k InterfaceC35871p5 interfaceC35871p5) {
        this.shortcutManager = shortcutManager;
        this.shortcutInfoFactory = interfaceC35871p5;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        Context baseContext = application.getBaseContext();
        try {
            this.shortcutManager.setDynamicShortcuts(C42745f0.U(this.shortcutInfoFactory.a(baseContext, "user_adverts_shortcut_id", R.string.shortcuts_user_adverts, R.drawable.ic_shortcut_my_items, new UserAdvertsLink(null, null, 3, null)), this.shortcutInfoFactory.a(baseContext, "channels_shortcut_id", R.string.shortcuts_channels, R.drawable.ic_shortcut_message, new ChannelsLink(null, null, 3, null)), this.shortcutInfoFactory.a(baseContext, "favorites_shortcut_id", R.string.shortcuts_favorites, R.drawable.ic_shortcut_favorites, new FavoritesLink(null, 1, null)), this.shortcutInfoFactory.a(baseContext, "publication_shortcut_id", R.string.shortcuts_publication, R.drawable.ic_shortcut_add, new AdvertPublicationLink.Public(null, null, true, null, false, null, null, null, null, null, 1019, null))));
        } catch (IllegalStateException e12) {
            V2.f318762a.a("UserKeysAnalyticsTask", "MC-15: Launcher activity not found", e12);
        }
    }
}
