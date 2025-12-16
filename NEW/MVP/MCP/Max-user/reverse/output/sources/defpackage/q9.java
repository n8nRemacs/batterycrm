package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.devmenu.utils.ValueBottomSheet;
import one.me.folders.picker.FolderMemberPickerScreen;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;
import one.me.sdk.permissionhost.PermissionBottomSheet;
import one.me.settings.twofa.password.TwoFACheckPassScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.startconversation.channel.PickSubscribersScreen;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class q9 extends a54 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q9(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // defpackage.a54
    public void a(c54 c54Var, h54 h54Var, i54 i54Var) {
        switch (this.a) {
            case 9:
                if (((Widget) this.b) == c54Var && i54Var.b && h54Var.d()) {
                    View view = c54Var.getView();
                    if ((view != null ? view.getWindowToken() : null) != null) {
                        l48 l48Var = ((ykb) this.c).a;
                        if ((l48Var == null ? null : l48Var).d == l38.d) {
                            (l48Var != null ? l48Var : null).d(k38.ON_RESUME);
                            break;
                        }
                    }
                }
                break;
            case 13:
                ArrayList arrayList = (ArrayList) this.c;
                if (i54Var == i54.POP_EXIT) {
                    for (int size = arrayList.size() - 1; size > 0; size--) {
                        ((j54) this.b).z(null, (bud) arrayList.get(size), true, new c2f());
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.a54
    public void b(c54 c54Var, h54 h54Var, i54 i54Var) {
        switch (this.a) {
            case 9:
                ykb.a((ykb) this.c, (Widget) this.b, c54Var, h54Var, i54Var);
                for (yu6 yu6Var : zu6.a.values()) {
                    if (yu6Var.a.contains(c54Var.getInstanceId())) {
                        yu6Var.b.invoke(c54Var, h54Var, i54Var);
                    }
                }
                break;
        }
    }

    @Override // defpackage.a54
    public void c(c54 c54Var, Bundle bundle) {
        switch (this.a) {
            case 9:
                ((ykb) this.c).d = bundle.getBundle("Registry.savedState");
                break;
        }
    }

    @Override // defpackage.a54
    public void e(c54 c54Var, Bundle bundle) {
        switch (this.a) {
            case 9:
                bundle.putBundle("Registry.savedState", ((ykb) this.c).d);
                break;
        }
    }

    @Override // defpackage.a54
    public void f(c54 c54Var) {
        switch (this.a) {
            case 9:
                ykb ykbVar = (ykb) this.c;
                if (!ykbVar.c) {
                    Bundle bundle = new Bundle();
                    ykbVar.d = bundle;
                    vd vdVar = ykbVar.b;
                    if (vdVar == null) {
                        vdVar = null;
                    }
                    vdVar.s(bundle);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.a54
    public void g(c54 c54Var) {
        switch (this.a) {
            case 9:
                l48 l48Var = ((ykb) this.c).a;
                if (l48Var == null) {
                    l48Var = null;
                }
                l48Var.d(k38.ON_RESUME);
                break;
        }
    }

    @Override // defpackage.a54
    public void h(c54 c54Var) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((AddChatMembersScreen) obj2).getRouter().a((xs0) obj);
                break;
            case 1:
                ((ContactsPickerScreen) obj2).getRouter().a((xs0) obj);
                break;
            case 2:
                ((ContextMenuBottomSheet) obj2).getRouter().a((xs0) obj);
                break;
            case 3:
                ((ContextMenuPopupWindow) obj2).getRouter().a((xs0) obj);
                break;
            case 4:
                ((FakeInAppReviewBottomSheet) obj2).getRouter().a((xs0) obj);
                break;
            case 5:
                ((FolderMemberPickerScreen) obj2).getRouter().a((xs0) obj);
                break;
            case 6:
                ((ForwardPickerScreen) obj2).getRouter().a((xs0) obj);
                break;
            case 7:
                ((c54) obj2).getRouter().a((xs0) obj);
                break;
            case 8:
                ((MessageContextMenuBottomSheet) obj2).getRouter().a((xs0) obj);
                break;
            case 9:
                ykb ykbVar = (ykb) obj2;
                LinkedHashMap linkedHashMap = zu6.a;
                o98 o98VarD = ve3.d();
                for (c54 parentController = c54Var.getParentController(); parentController != null; parentController = parentController.getParentController()) {
                    o98VarD.add(parentController.getInstanceId());
                }
                zu6.a.put(c54Var.getInstanceId(), new yu6(ve3.a(o98VarD), new xkb(ykbVar)));
                break;
            case 10:
                ((PermissionBottomSheet) obj2).getRouter().a((xs0) obj);
                break;
            case 11:
                ((PickChatMembers) obj2).getRouter().a((xs0) obj);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((PickSubscribersScreen) obj2).getRouter().a((xs0) obj);
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((ShareDataPickerScreen) obj2).getRouter().a((xs0) obj);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((TwoFACheckPassScreen) obj2).getRouter().a((xs0) obj);
                break;
            case 16:
                ((ValueBottomSheet) obj2).getRouter().a((xs0) obj);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                ((c54) obj2).getRouter().a((oc3) obj);
                break;
        }
    }

    @Override // defpackage.a54
    public void j(c54 c54Var, View view) {
        switch (this.a) {
            case 9:
                ykb ykbVar = (ykb) this.c;
                if (view.getTag(txc.view_tree_lifecycle_owner) == null && view.getTag(txc.view_tree_saved_state_registry_owner) == null) {
                    pai.d(view, ykbVar);
                    wqi.l(view, ykbVar);
                }
                l48 l48Var = ykbVar.a;
                if (l48Var == null) {
                    l48Var = null;
                }
                l48Var.d(k38.ON_START);
                break;
        }
    }

    @Override // defpackage.a54
    public void p(c54 c54Var) {
        switch (this.a) {
            case 9:
                zu6.a.remove(c54Var.getInstanceId());
                break;
        }
    }

    @Override // defpackage.a54
    public void q(c54 c54Var) {
        switch (this.a) {
            case 9:
                ykb ykbVar = (ykb) this.c;
                ykbVar.c = false;
                ykbVar.a = new l48(ykbVar);
                vd vdVar = new vd(ykbVar);
                ykbVar.b = vdVar;
                vdVar.r(ykbVar.d);
                l48 l48Var = ykbVar.a;
                if (l48Var == null) {
                    l48Var = null;
                }
                l48Var.d(k38.ON_CREATE);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a54
    public void s(c54 c54Var, View view) {
        switch (this.a) {
            case 9:
                ykb ykbVar = (ykb) this.c;
                if (!c54Var.isBeingDestroyed() || c54Var.getRouter().a.a.size() != 0) {
                    l48 l48Var = ykbVar.a;
                    (l48Var != null ? l48Var : null).d(k38.ON_DESTROY);
                    break;
                } else {
                    ViewParent parent = view.getParent();
                    View view2 = parent instanceof View ? (View) parent : null;
                    if (view2 != null) {
                        view2.addOnAttachStateChangeListener(new r40(view2, 10, ykbVar));
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.a54
    public void t(c54 c54Var) {
        switch (this.a) {
            case 9:
                ykb ykbVar = (ykb) this.c;
                l48 l48Var = ykbVar.a;
                if ((l48Var == null ? null : l48Var).d == l38.o) {
                    if (l48Var == null) {
                        l48Var = null;
                    }
                    l48Var.d(k38.ON_PAUSE);
                }
                l48 l48Var2 = ykbVar.a;
                (l48Var2 != null ? l48Var2 : null).d(k38.ON_STOP);
                break;
        }
    }

    public q9(j54 j54Var, ArrayList arrayList) {
        this.a = 13;
        this.b = j54Var;
        this.c = arrayList;
    }
}
