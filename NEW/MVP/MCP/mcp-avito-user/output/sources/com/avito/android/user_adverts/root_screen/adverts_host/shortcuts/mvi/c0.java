package com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi;

import TI0.c;
import com.avito.android.user_adverts.root_screen.adverts_host.TabItem;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.domain.UserAdvertsShortcuts;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.entity.ShortcutsInternalAction;
import com.avito.android.util.InterfaceC35863o4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: ShortcutsReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/c0;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/shortcuts/mvi/entity/ShortcutsInternalAction;", "LTI0/c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c0 implements com.avito.android.arch.mvi.u<ShortcutsInternalAction, TI0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f314015b;

    @Inject
    public c0(@Y61.k InterfaceC35863o4 interfaceC35863o4) {
        this.f314015b = interfaceC35863o4;
    }

    public static UI0.a b(ArrayList arrayList, UI0.a aVar, boolean z12) {
        String str = aVar.f16330a;
        if (arrayList.isEmpty()) {
            UI0.a.f16328d.getClass();
            return UI0.a.f16329e;
        }
        if (z12) {
            return new UI0.a(((UserAdvertsShortcuts.Shortcut) C42745f0.E(arrayList)).f313853c, 0);
        }
        UserAdvertsShortcuts.Shortcut shortcut = (UserAdvertsShortcuts.Shortcut) C42745f0.K(aVar.f16331b, arrayList);
        if (kotlin.jvm.internal.L.f(shortcut != null ? shortcut.f313853c : null, str)) {
            return aVar;
        }
        Iterator it = arrayList.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            int i13 = i12 + 1;
            if (kotlin.jvm.internal.L.f(str, ((UserAdvertsShortcuts.Shortcut) it.next()).f313853c)) {
                return new UI0.a(aVar.f16330a, i12);
            }
            i12 = i13;
        }
        return new UI0.a(((UserAdvertsShortcuts.Shortcut) C42745f0.E(arrayList)).f313853c, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static TI0.c.b c(com.avito.android.remote.error.ApiError r2, java.lang.Throwable r3) {
        /*
            boolean r0 = r2 instanceof com.avito.android.remote.error.ApiError.Unauthorized
            if (r0 != 0) goto Lf
            r0 = 0
            if (r3 == 0) goto Lc
            boolean r1 = com.avito.android.util.K5.a(r3)
            goto Ld
        Lc:
            r1 = r0
        Ld:
            if (r1 == 0) goto L10
        Lf:
            r0 = 1
        L10:
            if (r0 == 0) goto L15
            TI0.c$b$e r2 = TI0.c.b.e.f15575a
            goto L1b
        L15:
            TI0.c$b$b r0 = new TI0.c$b$b
            r0.<init>(r2, r3)
            r2 = r0
        L1b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.c0.c(com.avito.android.remote.error.ApiError, java.lang.Throwable):TI0.c$b");
    }

    @Override // com.avito.android.arch.mvi.u
    public final TI0.c a(ShortcutsInternalAction shortcutsInternalAction, TI0.c cVar) {
        String str;
        String str2;
        ShortcutsInternalAction shortcutsInternalAction2 = shortcutsInternalAction;
        TI0.c cVar2 = cVar;
        if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.LoadingStart) {
            return TI0.c.a(cVar2, null, null, null, null, 0, null, false, c.b.C1060c.f15573a, 255);
        }
        if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.LoadingError) {
            ShortcutsInternalAction.LoadingError loadingError = (ShortcutsInternalAction.LoadingError) shortcutsInternalAction2;
            return TI0.c.a(cVar2, null, null, null, null, 0, null, false, c(loadingError.f314026c, loadingError.f314027d), 255);
        }
        boolean z12 = shortcutsInternalAction2 instanceof ShortcutsInternalAction.LoadingResult;
        UI0.a aVar = cVar2.f15555d;
        if (z12) {
            ShortcutsInternalAction.LoadingResult loadingResult = (ShortcutsInternalAction.LoadingResult) shortcutsInternalAction2;
            UserAdvertsShortcuts userAdvertsShortcuts = loadingResult.f314028b;
            UI0.a aVarB = b(userAdvertsShortcuts.f313851b, aVar, loadingResult.f314029c);
            int i12 = cVar2.f15558g + 1;
            UI0.a.f16328d.getClass();
            UI0.a aVar2 = UI0.a.f16329e;
            ArrayList arrayListD = d(userAdvertsShortcuts, null);
            int i13 = aVarB.f16331b;
            UI0.c cVar3 = loadingResult.f314030d;
            boolean z13 = cVar3.f16335a;
            ArrayList<UserAdvertsShortcuts.Shortcut> arrayList = userAdvertsShortcuts.f313851b;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            for (UserAdvertsShortcuts.Shortcut shortcut : arrayList) {
                arrayList2.add(new TabItem(Integer.valueOf(shortcut.f313852b), shortcut.f313854d, shortcut.f313853c, z13));
            }
            return TI0.c.a(cVar2, cVar3, aVarB, aVar2, arrayListD, i12, null, false, new c.b.a(false, false, i13, i12, arrayList2, 2, null), 194);
        }
        boolean z14 = shortcutsInternalAction2 instanceof ShortcutsInternalAction.RefreshStart;
        c.b bVar = cVar2.f15561j;
        if (z14) {
            return TI0.c.a(cVar2, null, null, ((ShortcutsInternalAction.RefreshStart) shortcutsInternalAction2).f314038f, null, 0, null, false, bVar instanceof c.b.a ? c.b.a.a((c.b.a) bVar, true) : bVar, 247);
        }
        if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.RefreshError) {
            ShortcutsInternalAction.RefreshError refreshError = (ShortcutsInternalAction.RefreshError) shortcutsInternalAction2;
            UI0.a.f16328d.getClass();
            return TI0.c.a(cVar2, null, null, UI0.a.f16329e, null, 0, null, false, c(refreshError.f314034c, refreshError.f314035d), 247);
        }
        boolean z15 = shortcutsInternalAction2 instanceof ShortcutsInternalAction.RefreshResult;
        int i14 = 0;
        List<c.a> list = cVar2.f15557f;
        if (z15) {
            UserAdvertsShortcuts userAdvertsShortcuts2 = ((ShortcutsInternalAction.RefreshResult) shortcutsInternalAction2).f314037c;
            UI0.a aVarB2 = b(userAdvertsShortcuts2.f313851b, aVar, false);
            UI0.a.f16328d.getClass();
            UI0.a aVar3 = UI0.a.f16329e;
            ArrayList arrayListD2 = d(userAdvertsShortcuts2, list);
            if (!kotlin.jvm.internal.L.f(aVarB2, aVar3)) {
                ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayListD2, 10));
                Iterator it = arrayListD2.iterator();
                while (it.hasNext()) {
                    c.a aVarA = (c.a) it.next();
                    if (kotlin.jvm.internal.L.f(aVarA.f15564c.f313853c, aVarB2.f16330a)) {
                        aVarA = c.a.a(aVarA, this.f314015b.a(), null, 5);
                    }
                    arrayList3.add(aVarA);
                }
                arrayListD2 = arrayList3;
            }
            return TI0.c.a(cVar2, null, aVarB2, aVar3, arrayListD2, 0, null, false, bVar instanceof c.b.a ? c.b.a.a((c.b.a) bVar, false) : bVar, 227);
        }
        if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.Unauthorized) {
            return TI0.c.a(cVar2, new UI0.c(false, false, 3, null), null, null, null, 0, null, false, c.b.e.f15575a, 254);
        }
        if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.ChangeIndex) {
            int i15 = ((ShortcutsInternalAction.ChangeIndex) shortcutsInternalAction2).f314024b;
            c.a aVar4 = (c.a) C42745f0.K(i15, list);
            return (aVar4 == null || (str2 = aVar4.f15564c.f313853c) == null) ? cVar2 : TI0.c.a(cVar2, null, new UI0.a(str2, i15), null, null, 0, null, false, null, 507);
        }
        if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.ChangeShortcut) {
            ShortcutsInternalAction.ChangeShortcut changeShortcut = (ShortcutsInternalAction.ChangeShortcut) shortcutsInternalAction2;
            Iterator<c.a> it2 = list.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                str = changeShortcut.f314025b;
                if (!zHasNext) {
                    i14 = -1;
                    break;
                }
                if (kotlin.jvm.internal.L.f(it2.next().f15564c.f313853c, str)) {
                    break;
                }
                i14++;
            }
            return i14 == -1 ? cVar2 : TI0.c.a(cVar2, null, new UI0.a(str, i14), null, null, 0, null, false, null, 507);
        }
        if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.ShowPendingMsg) {
            return TI0.c.a(cVar2, null, null, null, null, 0, null, false, null, 447);
        }
        if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.UpdatePendingMsg) {
            return TI0.c.a(cVar2, null, null, null, null, 0, ((ShortcutsInternalAction.UpdatePendingMsg) shortcutsInternalAction2).f314048b, false, null, 447);
        }
        if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.ShowToastBarForUpdateAdverts) {
            return TI0.c.a(cVar2, null, null, null, null, 0, null, true, null, 383);
        }
        if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.ToastBarForUpdateAdvertsIsShown) {
            return TI0.c.a(cVar2, null, null, null, null, 0, null, false, null, 383);
        }
        if (shortcutsInternalAction2 instanceof ShortcutsInternalAction.Login ? true : shortcutsInternalAction2 instanceof ShortcutsInternalAction.ShowStatus ? true : shortcutsInternalAction2 instanceof ShortcutsInternalAction.RefreshTab ? true : shortcutsInternalAction2 instanceof ShortcutsInternalAction.OpenTab ? true : shortcutsInternalAction2 instanceof ShortcutsInternalAction.AddAdvert ? true : shortcutsInternalAction2 instanceof ShortcutsInternalAction.NoChange) {
            return cVar2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ArrayList d(UserAdvertsShortcuts userAdvertsShortcuts, List list) {
        c.a aVar;
        List list2 = list;
        InterfaceC35863o4 interfaceC35863o4 = this.f314015b;
        if (list2 == null || list2.isEmpty()) {
            ArrayList<UserAdvertsShortcuts.Shortcut> arrayList = userAdvertsShortcuts.f313851b;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            for (UserAdvertsShortcuts.Shortcut shortcut : arrayList) {
                String strA = interfaceC35863o4.a();
                arrayList2.add(new c.a(strA, strA, shortcut));
            }
            return arrayList2;
        }
        List list3 = list;
        int iF2 = P0.f(C42745f0.q(list3, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : list3) {
            linkedHashMap.put(((c.a) obj).f15564c.f313853c, obj);
        }
        ArrayList<UserAdvertsShortcuts.Shortcut> arrayList3 = userAdvertsShortcuts.f313851b;
        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
        for (UserAdvertsShortcuts.Shortcut shortcut2 : arrayList3) {
            c.a aVar2 = (c.a) linkedHashMap.get(shortcut2.f313853c);
            if (aVar2 != null) {
                aVar = c.a.a(aVar2, null, shortcut2, 3);
            } else {
                String strA2 = interfaceC35863o4.a();
                aVar = new c.a(strA2, strA2, shortcut2);
            }
            arrayList4.add(aVar);
        }
        return arrayList4;
    }
}
