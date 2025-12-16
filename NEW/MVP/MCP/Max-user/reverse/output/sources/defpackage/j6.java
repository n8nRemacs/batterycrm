package defpackage;

import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import java.io.IOException;
import one.me.android.root.RootController;
import one.me.appupdate.forceupdate.ForceUpdateScreen;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.folders.edit.FolderEditScreen;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class j6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v67, types: [cm6, hn6] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IOException {
        o12 o12Var;
        boolean z = false;
        switch (this.a) {
            case 0:
                ActLocalMedias actLocalMedias = (ActLocalMedias) this.b;
                int i = ActLocalMedias.p1;
                actLocalMedias.onBackPressed();
                break;
            case 1:
                AddChatMembersScreen addChatMembersScreen = (AddChatMembersScreen) this.b;
                yy7[] yy7VarArr = AddChatMembersScreen.y0;
                if (!((m9) addChatMembersScreen.I0().c).h) {
                    yy7[] yy7VarArr2 = BottomSheetWidget.B0;
                    oq3 oq3VarE = az1.e(mvd.R, null, null, 6);
                    oq3VarE.a(new pq3(v8b.i, new n5g(mvd.T), 2, 56));
                    oq3VarE.a(new pq3(v8b.h, new n5g(mvd.S), 2, 56));
                    oq3VarE.a(new pq3(v8b.g, new n5g(mvd.p), 2, 56));
                    oq3VarE.a.putBoolean("memorize_keyboard", false);
                    ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
                    confirmationBottomSheetE.setTargetController(addChatMembersScreen);
                    c54 parentController = addChatMembersScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                    ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                    confirmationBottomSheetE.N0(addChatMembersScreen);
                    if (ytdVarE0 != null) {
                        bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                        az1.u(false, budVar, true, "BottomSheetWidget");
                        ytdVarE0.H(budVar);
                        break;
                    }
                } else {
                    addChatMembersScreen.g(v8b.i, null);
                    break;
                }
                break;
            case 2:
                AddLinkBottomSheet addLinkBottomSheet = (AddLinkBottomSheet) this.b;
                yy7[] yy7VarArr3 = AddLinkBottomSheet.B0;
                addLinkBottomSheet.E0(true);
                fp8 fp8Var = (fp8) addLinkBottomSheet.z0.getValue();
                y9 y9Var = addLinkBottomSheet.w0;
                xfh.r(fp8Var.b, new y9(y9Var.a, y9Var.b, addLinkBottomSheet.L0().getText().toString()));
                break;
            case 3:
                ((ka) this.b).j();
                break;
            case 4:
                ((i91) this.b).I0.e(0, false);
                break;
            case 5:
                CallIndicatorWidget callIndicatorWidget = (CallIndicatorWidget) this.b;
                yy7[] yy7VarArr4 = CallIndicatorWidget.Y;
                api.d(callIndicatorWidget.requireActivity());
                cc1 cc1Var = (cc1) callIndicatorWidget.X.getValue();
                ci5 ci5Var = cc1Var.s0;
                hw1 hw1Var = (hw1) cc1Var.c;
                if (!hw1Var.v()) {
                    xfh.r(ci5Var, vb1.b);
                    break;
                } else {
                    gxi gxiVar = hw1Var.l().a;
                    if (gxiVar != null && gxiVar.a()) {
                        z = true;
                    }
                    xfh.r(ci5Var, new wb1((n41) ((c51) cc1Var.b).j.getValue(), z));
                    break;
                }
                break;
            case 6:
                ((gk1) this.b).L0.invoke();
                break;
            case 7:
                CallRateBottomSheet callRateBottomSheet = (CallRateBottomSheet) this.b;
                yy7[] yy7VarArr5 = CallRateBottomSheet.M0;
                callRateBottomSheet.P0().u(false);
                break;
            case 8:
                p12 p12Var = (p12) this.b;
                ytc ytcVar = p12Var.a;
                if (ytcVar == null) {
                    ytcVar = null;
                }
                buc bucVar = ytcVar.d;
                buc bucVar2 = bucVar != null ? bucVar : null;
                boolean zL = bucVar2.y0.l();
                if (!zL) {
                    xfh.r(bucVar2.w0, qtc.a);
                }
                if (zL) {
                    boolean z2 = p12Var.y0;
                    p12Var.a(!z2, true);
                    if (!z2 && (o12Var = p12Var.x0) != null) {
                        gda.g(((MediaBarWidget) o12Var).d, f1e.CHAT_ATTACH_PICKER_CAMERA);
                        break;
                    }
                }
                break;
            case 9:
                ((sgc) this.b).invoke();
                break;
            case 10:
                ((c62) this.b).E0.invoke();
                break;
            case 11:
                ChangeDisabledDialog changeDisabledDialog = (ChangeDisabledDialog) this.b;
                q85 q85Var = BaseBottomSheetWidget.s0;
                changeDisabledDialog.E0(true);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((dic) this.b).invoke();
                break;
            case 13:
                ChatsListWidget chatsListWidget = (ChatsListWidget) this.b;
                yy7[] yy7VarArr6 = ChatsListWidget.L0;
                a63.c.p0().b(":settings/folder/members-picker?folder_id=".concat(chatsListWidget.b), null);
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                za3 za3Var = (za3) this.b;
                EditText editText = za3Var.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    za3Var.q();
                    break;
                }
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ConfirmAddOpponentToCallBottomSheet confirmAddOpponentToCallBottomSheet = (ConfirmAddOpponentToCallBottomSheet) this.b;
                int i2 = ConfirmAddOpponentToCallBottomSheet.E0;
                confirmAddOpponentToCallBottomSheet.E0(true);
                break;
            case 16:
                ConfirmPhoneScreen confirmPhoneScreen = (ConfirmPhoneScreen) this.b;
                yy7[] yy7VarArr7 = ConfirmPhoneScreen.B0;
                vp3 vp3VarD0 = confirmPhoneScreen.D0();
                vp3VarD0.B0 = null;
                vp3VarD0.b.a(vp3VarD0.a, ((q2b) ((lzf) vp3VarD0.s0.getValue())).b(), i84.a, new rp3(vp3VarD0, null));
                break;
            case LangUtils.HASH_SEED /* 17 */:
                e14 e14Var = (e14) this.b;
                e14Var.E0.x();
                e14Var.F0.a(2, 3, 2);
                break;
            case 18:
                ((k14) this.b).E0.getClass();
                break;
            case 19:
                ((hn6) this.b).invoke();
                break;
            case 20:
                ((x14) this.b).E0.getClass();
                break;
            case 21:
                ContactsPickerScreen contactsPickerScreen = (ContactsPickerScreen) this.b;
                yy7[] yy7VarArr8 = ContactsPickerScreen.v0;
                f24 f24Var = (f24) contactsPickerScreen.I0().c;
                f84 f84Var = f24Var.d;
                f24Var.e.O(f24Var, f24.h[0], f84Var != null ? svi.d(f84Var, ((q2b) ((lzf) f24Var.c.getValue())).b(), i84.b, new e24(f24Var, null)) : null);
                break;
            case 22:
                ((ContextMenuPopupWindow) this.b).dismiss();
                break;
            case 23:
                ((yv4) this.b).a.invoke();
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((d65) this.b).u();
                break;
            case 25:
                ((o91) this.b).invoke();
                break;
            case 26:
                xfh.r(((FolderEditScreen) ((x86) this.b)).z0().B0, c96.a);
                break;
            case 27:
                FolderEditScreen folderEditScreen = (FolderEditScreen) this.b;
                yy7[] yy7VarArr9 = FolderEditScreen.Z;
                folderEditScreen.g(d5b.d, null);
                break;
            case 28:
                ((cm6) ((en0) this.b).F0).invoke();
                break;
            default:
                ForceUpdateScreen forceUpdateScreen = (ForceUpdateScreen) this.b;
                int i3 = ForceUpdateScreen.d;
                Activity activity = forceUpdateScreen.getActivity();
                if (activity != null) {
                    ((vq) forceUpdateScreen.b).a(activity);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j6(cm6 cm6Var) {
        this.a = 19;
        this.b = (hn6) cm6Var;
    }

    public /* synthetic */ j6(mid midVar, d14 d14Var, int i) {
        this.a = i;
        this.b = midVar;
    }
}
