package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.contactlist.ContactListWidget;
import one.me.main.MainScreen;
import one.me.settings.SettingsListScreen;

/* loaded from: classes2.dex */
public final class hm8 extends dtf implements sm6 {
    public final /* synthetic */ MainScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm8(Continuation continuation, MainScreen mainScreen) {
        super(2, continuation);
        this.X = mainScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        hm8 hm8Var = (hm8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hm8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hm8 hm8Var = new hm8(continuation, this.X);
        hm8Var.o = obj;
        return hm8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f1e f1eVar;
        c54 chatsTabWidget;
        c54 c54Var;
        g8j.b(obj);
        zya zyaVar = (zya) this.o;
        rha rhaVar = MainScreen.Y;
        MainScreen mainScreen = this.X;
        aza azaVarZ0 = mainScreen.z0();
        azaVarZ0.getClass();
        int i = 0;
        while (true) {
            boolean z = true;
            boolean z2 = true;
            if (i >= azaVarZ0.getChildCount()) {
                LinkedHashMap linkedHashMap = mainScreen.c;
                Object obj2 = linkedHashMap.get(zyaVar);
                Object obj3 = obj2;
                if (obj2 == null) {
                    f82 f82VarA = czi.a(mainScreen.getContext());
                    f82VarA.setId(zyaVar.c);
                    linkedHashMap.put(zyaVar, f82VarA);
                    obj3 = f82VarA;
                }
                ViewGroup viewGroup = (ViewGroup) obj3;
                ((FrameLayout) mainScreen.d.D(mainScreen, MainScreen.Z[0])).addView(viewGroup, 0, new FrameLayout.LayoutParams(-1, -1));
                String str = zyaVar.d;
                Bundle bundle = null;
                boolean z3 = false;
                String str2 = str.length() > 0 ? str : null;
                ytd childRouter = mainScreen.getChildRouter(viewGroup, str2);
                childRouter.e = 1;
                if (!childRouter.n()) {
                    xl8.b.getClass();
                    if (str.equals(oi4.a(xl8.c.a))) {
                        c54 contactListWidget = new ContactListWidget(bundle, z2 ? 1 : 0, z3 ? 1 : 0);
                        f1eVar = f1e.CONTACTS_TAB;
                        c54Var = contactListWidget;
                    } else if (str.equals(oi4.a(xl8.d.a))) {
                        c54 callHistoryScreen = new CallHistoryScreen();
                        f1eVar = f1e.CALL_HISTORY_TAB;
                        c54Var = callHistoryScreen;
                    } else if (str.equals(oi4.a(xl8.e.a))) {
                        chatsTabWidget = new ChatsTabWidget(mainScreen.getArgs().getString("folder_id"));
                        f1eVar = f1e.CHATS_LIST_TAB;
                        chatsTabWidget.addLifecycleListener(new m54(3, f1eVar));
                        chatsTabWidget.setRetainViewMode(b54.b);
                        bud budVar = new bud(chatsTabWidget, null, null, null, false, -1);
                        budVar.d(str2);
                        childRouter.S(budVar);
                    } else {
                        if (!str.equals(oi4.a(xl8.f.a))) {
                            throw new IllegalStateException("invalid screen! ".concat(str).toString());
                        }
                        c54 settingsListScreen = new SettingsListScreen();
                        f1eVar = f1e.SETTINGS_TAB;
                        c54Var = settingsListScreen;
                    }
                    chatsTabWidget = c54Var;
                    chatsTabWidget.addLifecycleListener(new m54(3, f1eVar));
                    chatsTabWidget.setRetainViewMode(b54.b);
                    bud budVar2 = new bud(chatsTabWidget, null, null, null, false, -1);
                    budVar2.d(str2);
                    childRouter.S(budVar2);
                }
                childRouter.J();
                mainScreen.b.a();
                return qqg.a;
            }
            int i2 = i + 1;
            View childAt = azaVarZ0.getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (rqi.c(childAt, o0d.tag_tab_item) != zyaVar) {
                z = false;
            }
            ((ks0) childAt).setSelected(z);
            i = i2;
        }
    }
}
