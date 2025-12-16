package defpackage;

import android.graphics.Rect;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.datepicker.MaterialDatePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import one.me.android.join.JoinChatWidget;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.partialmediaaccess.PartialMediaAccessWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.mediapicker.permissions.MediaPickerPermissionWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.gallery.view.NumericCheckButton;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalGif;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class ye6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ye6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v59, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object, k18] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        op6 op6Var;
        fce fceVar;
        Object value;
        int i = 3;
        int iX = 0;
        z = false;
        boolean z = false;
        iX = 0;
        switch (this.a) {
            case 0:
                ForgotPinCodeDialog forgotPinCodeDialog = (ForgotPinCodeDialog) this.b;
                int i2 = ForgotPinCodeDialog.C0;
                hs hsVar = forgotPinCodeDialog.z0;
                yy7 yy7Var = BottomSheetWidget.B0[0];
                hsVar.b(forgotPinCodeDialog, Boolean.FALSE);
                qk qkVar = new qk(11, forgotPinCodeDialog);
                l5c l5cVar = (l5c) ((age) bqe.a.getAccessor().d(47).getValue());
                l5cVar.getClass();
                azi.a(forgotPinCodeDialog, l5cVar.p(PmsKey.f143supportaccount, "max.ru/support"), qkVar);
                return;
            case 1:
                ((FrgLocalGif) this.b).c();
                return;
            case 2:
                ((lo2) ((za0) this.b).e).invoke();
                return;
            case 3:
                tp6 tp6Var = (tp6) this.b;
                tq6 tq6Var = tp6Var.E0;
                int iG = tp6Var.g();
                if (tq6Var.b.a) {
                    iG--;
                }
                if (iG >= 0 && (op6Var = (op6) ue3.J(iG, (List) tq6Var.v0.getValue())) != null) {
                    iX = tq6Var.x(op6Var.c, true);
                    op6Var.h = iX;
                }
                NumericCheckButton numericCheckButton = tp6Var.F0;
                if (numericCheckButton != null) {
                    numericCheckButton.setNumber(iX);
                    return;
                }
                return;
            case 4:
                ((sgc) this.b).invoke();
                return;
            case 5:
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) this.b;
                yy7[] yy7VarArr = InputPhoneScreen.C0;
                yn7 yn7VarD0 = inputPhoneScreen.D0();
                yn7VarD0.v0.O(yn7VarD0, yn7.H0[0], (x9f) yn7VarD0.b.a(yn7VarD0.a, ((q2b) ((lzf) yn7VarD0.d.getValue())).b(), i84.b, new ln7(inputPhoneScreen.C0().getCode(), inputPhoneScreen.C0().getPhoneWithoutCode(), yn7VarD0, null)));
                boolean z2 = inputPhoneScreen.D0().A0;
                OneMeButton oneMeButtonA0 = inputPhoneScreen.A0();
                oneMeButtonA0.setProgressEnabled(z2);
                oneMeButtonA0.setClickable(!z2);
                return;
            case 6:
                ((l3b) this.b).invoke();
                return;
            case 7:
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) this.b;
                yy7[] yy7VarArr2 = InviteByPhoneScreen.z0;
                wr7 wr7VarB0 = inviteByPhoneScreen.B0();
                wr7VarB0.E0.O(wr7VarB0, wr7.K0[0], (x9f) wr7VarB0.b.a(wr7VarB0.a, ((q2b) ((lzf) wr7VarB0.Y.getValue())).b().plus((a84) wr7VarB0.t0.getValue()), i84.b, new qr7(inviteByPhoneScreen.A0().getCode(), inviteByPhoneScreen.A0().getPhoneWithoutCode(), wr7VarB0, null)));
                AppCompatTextView appCompatTextView = inviteByPhoneScreen.u0;
                if (appCompatTextView != null && appCompatTextView.getVisibility() == 0) {
                    z = true;
                }
                OneMeButton oneMeButtonZ0 = inviteByPhoneScreen.z0();
                oneMeButtonZ0.setProgressEnabled(!z);
                oneMeButtonZ0.setClickable(z);
                return;
            case 8:
                InviteByQrBottomSheet inviteByQrBottomSheet = (InviteByQrBottomSheet) this.b;
                yy7[] yy7VarArr3 = InviteByQrBottomSheet.O0;
                t9f t9fVar = inviteByQrBottomSheet.L0;
                yy7[] yy7VarArr4 = InviteByQrBottomSheet.O0;
                qt7 qt7Var = (qt7) t9fVar.D(inviteByQrBottomSheet, yy7VarArr4[3]);
                if (qt7Var == null || !qt7Var.isActive()) {
                    is7 is7Var = (is7) inviteByQrBottomSheet.I0.getValue();
                    Integer numD = ((gda) is7Var.b.getValue()).d();
                    is7Var.a("clicked_to_invite", (numD != null && numD.intValue() == 100) ? "plus" : "main", "invite_friends");
                    t9fVar.O(inviteByQrBottomSheet, yy7VarArr4[3], svi.e(inviteByQrBottomSheet.getViewLifecycleScope(), null, i84.b, new bs7(inviteByQrBottomSheet, null), 1));
                    return;
                }
                return;
            case 9:
                InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet = (InviteFriendsToMaxBottomSheet) this.b;
                yy7[] yy7VarArr5 = InviteFriendsToMaxBottomSheet.L0;
                t9f t9fVar2 = inviteFriendsToMaxBottomSheet.J0;
                yy7[] yy7VarArr6 = InviteFriendsToMaxBottomSheet.L0;
                qt7 qt7Var2 = (qt7) t9fVar2.D(inviteFriendsToMaxBottomSheet, yy7VarArr6[0]);
                if (qt7Var2 == null || !qt7Var2.isActive()) {
                    t9fVar2.O(inviteFriendsToMaxBottomSheet, yy7VarArr6[0], svi.e(inviteFriendsToMaxBottomSheet.getViewLifecycleScope(), null, i84.b, new gs7(inviteFriendsToMaxBottomSheet, null), 1));
                    return;
                }
                return;
            case 10:
                JoinChatWidget joinChatWidget = (JoinChatWidget) this.b;
                yy7[] yy7VarArr7 = JoinChatWidget.B0;
                joinChatWidget.E0(true);
                if (joinChatWidget.requireActivity() instanceof ksd) {
                    joinChatWidget.getRouter().C();
                    return;
                } else {
                    joinChatWidget.requireActivity().finish();
                    return;
                }
            case 11:
                ((sgc) this.b).invoke();
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((MaterialDatePicker) this.b).y0();
                throw null;
            case 13:
                st8 st8Var = (st8) this.b;
                rt8 rt8Var = st8Var.F0;
                if (rt8Var == null || (fceVar = st8Var.K0) == null) {
                    return;
                }
                gr6 gr6Var = (gr6) st8Var.L0.getHierarchy();
                if (gr6Var != null) {
                    vtd vtdVar = gr6Var.c;
                }
                pd8 pd8Var = fceVar.a;
                int iG2 = st8Var.g();
                pt8 pt8Var = ((MediaBarPreviewLayout) rt8Var).S0;
                if (pt8Var != null) {
                    ActLocalMedias actLocalMedias = (ActLocalMedias) pt8Var;
                    ArrayList arrayList = actLocalMedias.S0;
                    if (fni.a(actLocalMedias.V0.o, "SELECTED_MEDIA_ALBUM")) {
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            if (((pd8) arrayList.get(i3)).b == pd8Var.b) {
                                actLocalMedias.Z0.e(i3, true);
                                actLocalMedias.c1.w(iG2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                MediaBarWidget mediaBarWidget = (MediaBarWidget) this.b;
                yy7[] yy7VarArr8 = MediaBarWidget.c1;
                xfh.r(mediaBarWidget.G0().d, bp6.a);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                MediaPickerPermissionWidget mediaPickerPermissionWidget = (MediaPickerPermissionWidget) this.b;
                yy7[] yy7VarArr9 = MediaPickerPermissionWidget.d;
                k18 k18Var = mediaPickerPermissionWidget.c;
                if (((qsb) k18Var.getValue()).c(qsb.m)) {
                    ((qsb) k18Var.getValue()).l(new s2i(mediaPickerPermissionWidget, 1));
                    return;
                } else {
                    ((qsb) k18Var.getValue()).j(new s2i(mediaPickerPermissionWidget, 1), qsb.o, 162);
                    return;
                }
            case 16:
                ca9 ca9Var = (ca9) this.b;
                kce kceVar = ca9Var.b;
                int i4 = ca9Var.h;
                ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) kceVar.b;
                yy7[] yy7VarArr10 = ChatMediaViewerScreen.Q0;
                int iV = az1.v(i4);
                if (iV == 1 || iV == 2) {
                    if (!chatMediaViewerScreen.O0().d()) {
                        chatMediaViewerScreen.O0().play();
                        chatMediaViewerScreen.Q0().I();
                        return;
                    }
                    chatMediaViewerScreen.O0().pause();
                    yq2 yq2VarQ0 = chatMediaViewerScreen.Q0();
                    yq2VarQ0.x();
                    tcf tcfVar = yq2VarQ0.h1;
                    do {
                        value = tcfVar.getValue();
                    } while (!tcfVar.c(value, w54.d));
                    return;
                }
                if (iV != 4) {
                    return;
                }
                ca9 ca9Var2 = chatMediaViewerScreen.B0;
                if (ca9Var2 != null) {
                    ca9Var2.b(4);
                }
                yq2 yq2VarQ02 = chatMediaViewerScreen.Q0();
                j09 j09VarE = yq2VarQ02.E();
                if (j09VarE instanceof b09) {
                    xfh.r(yq2VarQ02.U0, new rh5((b09) j09VarE));
                    return;
                } else {
                    if (j09VarE instanceof h09) {
                        h09 h09Var = (h09) j09VarE;
                        yq2VarQ02.C(h09Var.a, h09Var.o);
                        return;
                    }
                    return;
                }
            case LangUtils.HASH_SEED /* 17 */:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) this.b;
                yy7[] yy7VarArr11 = MessageContextMenuBottomSheet.d1;
                messageContextMenuBottomSheet.E0(true);
                return;
            case 18:
                uk9 uk9Var = (uk9) this.b;
                tk9 tk9Var = uk9Var.X;
                if (tk9Var == null) {
                    return;
                }
                long j = tk9Var.a;
                lk9 lk9Var = tk9Var.e;
                if (lk9Var == null || tk9Var.d != null) {
                    sm6 sm6Var = uk9Var.d;
                    if (sm6Var != null) {
                        sm6Var.invoke(Long.valueOf(j), Long.valueOf(tk9Var.b));
                        return;
                    }
                    return;
                }
                sm6 sm6Var2 = uk9Var.o;
                if (sm6Var2 != null) {
                    sm6Var2.invoke(lk9Var, Long.valueOf(j));
                    return;
                }
                return;
            case 19:
                Iterator it = ((Set) ((hba) this.b).a).iterator();
                while (it.hasNext()) {
                    ((fba) it.next()).j(new dk0(i));
                }
                return;
            case 20:
                ((ia) this.b).invoke(view);
                return;
            case 21:
                NotificationsSettingsScreen notificationsSettingsScreen = (NotificationsSettingsScreen) this.b;
                yy7[] yy7VarArr12 = NotificationsSettingsScreen.u0;
                cpa cpaVarY0 = notificationsSettingsScreen.y0();
                cpaVarY0.B0.O(cpaVarY0, cpa.F0[0], svi.d(cpaVarY0.a, ((q2b) ((lzf) cpaVarY0.X.getValue())).b(), i84.b, new apa(cpaVarY0, null)));
                return;
            case 22:
                vza vzaVar = (vza) this.b;
                Rect rect = vzaVar.u0;
                ArrayList arrayList2 = new ArrayList();
                w8a w8aVar = vzaVar.s0;
                Object[] objArr = w8aVar.a;
                int i5 = w8aVar.b;
                for (int i6 = 0; i6 < i5; i6++) {
                    arrayList2.add(vza.c((sza) objArr[i6]));
                }
                w8a w8aVar2 = vzaVar.t0;
                Object[] objArr2 = w8aVar2.a;
                int i7 = w8aVar2.b;
                for (int i8 = 0; i8 < i7; i8++) {
                    arrayList2.add(vza.c((sza) objArr2[i8]));
                }
                g1f g1fVar = new g1f(vzaVar.getContext(), vzaVar.getCustomTheme() != null, arrayList2, new wu7(25, vzaVar));
                view.getGlobalVisibleRect(rect);
                g1fVar.showAtLocation(view, 8388661, f6j.b(vzaVar.getContext()) - rect.right, u45.c(8, vw4.d().getDisplayMetrics().density, rect.bottom));
                return;
            case 23:
                ((i40) this.b).d(ecb.o);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                veb vebVar = (veb) this.b;
                w3b w3bVar = vebVar.a;
                em6 em6Var = vebVar.u0;
                if (em6Var != null) {
                    em6Var.invoke(vebVar.getText());
                    return;
                }
                if (vebVar.getTypingMode() != teb.b) {
                    Editable text = w3bVar.getText();
                    if (text != null) {
                        text.clear();
                        return;
                    }
                    return;
                }
                if (w3bVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
                    vebVar.setEndIconDrawable(vebVar.o);
                    int selectionStart = w3bVar.getSelectionStart();
                    int selectionEnd = w3bVar.getSelectionEnd();
                    w3bVar.setTransformationMethod(SingleLineTransformationMethod.getInstance());
                    w3bVar.setSelection(selectionStart, selectionEnd);
                    return;
                }
                vebVar.setEndIconDrawable(vebVar.d);
                int selectionStart2 = w3bVar.getSelectionStart();
                int selectionEnd2 = w3bVar.getSelectionEnd();
                w3bVar.setTransformationMethod(PasswordTransformationMethod.getInstance());
                w3bVar.setSelection(selectionStart2, selectionEnd2);
                return;
            case 25:
                PopupWindow popupWindow = (PopupWindow) this.b;
                if (popupWindow != null) {
                    popupWindow.showAsDropDown(view);
                    return;
                }
                return;
            case 26:
                PartialMediaAccessWidget partialMediaAccessWidget = (PartialMediaAccessWidget) this.b;
                ((qsb) partialMediaAccessWidget.a.getValue()).l(new s2i(partialMediaAccessWidget, 1));
                return;
            case 27:
                hob hobVar = (hob) this.b;
                EditText editText = hobVar.f;
                if (editText == null) {
                    return;
                }
                int selectionEnd3 = editText.getSelectionEnd();
                EditText editText2 = hobVar.f;
                if (editText2 == null || !(editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    hobVar.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    hobVar.f.setTransformationMethod(null);
                }
                if (selectionEnd3 >= 0) {
                    hobVar.f.setSelection(selectionEnd3);
                }
                hobVar.q();
                return;
            case 28:
                PickChatMembers pickChatMembers = (PickChatMembers) this.b;
                yy7[] yy7VarArr13 = PickChatMembers.x0;
                uaf.c.p0().b(":chat/add-icon?ids=".concat(ue3.N((Iterable) pickChatMembers.I0().Y.a.getValue(), ",", null, null, null, 62)), null);
                return;
            default:
                o6c o6cVar = (o6c) this.b;
                i6c i6cVar = o6cVar.a;
                if (i6cVar == null || !i6cVar.j()) {
                    return;
                }
                o6cVar.j(true);
                return;
        }
    }
}
