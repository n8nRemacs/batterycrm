package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi;

import TI0.b;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ShortcutsOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/a0;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "LTI0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a0 implements com.avito.android.arch.mvi.t<ShortcutsInternalAction, TI0.b> {
    @Inject
    public a0() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final TI0.b b(ShortcutsInternalAction shortcutsInternalAction) {
        ShortcutsInternalAction shortcutsInternalAction2 = shortcutsInternalAction;
        if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.RefreshTab) {
            return new b.f(((ShortcutsInternalAction.RefreshTab) shortcutsInternalAction2).f314039b);
        }
        if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.Login) {
            return new b.c(((ShortcutsInternalAction.Login) shortcutsInternalAction2).f314031b.f92737b);
        }
        Object obj = null;
        if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.ShowStatus) {
            String str = ((ShortcutsInternalAction.ShowStatus) shortcutsInternalAction2).f314041b;
            if (str.length() > 0) {
                return new b.h(str);
            }
        } else {
            if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.OpenTab) {
                return new b.e(((ShortcutsInternalAction.OpenTab) shortcutsInternalAction2).f314033b);
            }
            if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.AddAdvert) {
                return b.d.f15548a;
            }
            if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.LoadingResult) {
                Iterator it = ((ShortcutsInternalAction.LoadingResult) shortcutsInternalAction2).f314028b.f313851b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    nI0.i iVar = nI0.i.f414995a;
                    String str2 = ((UserAdvertsShortcuts.Shortcut) next).f313853c;
                    iVar.getClass();
                    if (str2.equals("active")) {
                        obj = next;
                        break;
                    }
                }
                UserAdvertsShortcuts.Shortcut shortcut = (UserAdvertsShortcuts.Shortcut) obj;
                return new b.C1058b(shortcut != null ? shortcut.f313852b : 0);
            }
            if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.ShowPendingMsg) {
                String str3 = ((ShortcutsInternalAction.ShowPendingMsg) shortcutsInternalAction2).f314040b;
                if (str3.length() > 0) {
                    return new b.g(str3);
                }
            } else {
                if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.LoadingError ? true : shortcutsInternalAction2 instanceof ShortcutsInternalAction.RefreshError) {
                    return b.a.f15545a;
                }
            }
        }
        return null;
    }
}
