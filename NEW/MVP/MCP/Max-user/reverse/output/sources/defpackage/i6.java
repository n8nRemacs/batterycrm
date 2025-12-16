package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import one.me.calllist.ui.callpresettings.CallPresettingsScreen;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.mediapicker.crop.AvatarEditScreen;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.photoeditor.ActPhotoEditor;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class i6 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = 5;
        int i2 = 16;
        final int i3 = 1;
        final int i4 = 0;
        switch (this.a) {
            case 0:
                ActLocalMedias actLocalMedias = (ActLocalMedias) this.b;
                int i5 = ActLocalMedias.p1;
                int intExtra = actLocalMedias.getIntent().getIntExtra("act:local_medias:chat_mode", 0);
                es2.b.getClass();
                try {
                    return es2.values()[intExtra];
                } catch (Throwable unused) {
                    return es2.DEFAULT;
                }
            case 1:
                ActPhotoEditor actPhotoEditor = (ActPhotoEditor) this.b;
                int i6 = ActPhotoEditor.W0;
                return Boolean.valueOf(actPhotoEditor.getIntent().getBooleanExtra("photo_editor:regular_sending", true));
            case 2:
                AddChatAdminsScreen addChatAdminsScreen = (AddChatAdminsScreen) this.b;
                yy7[] yy7VarArr = AddChatAdminsScreen.t0;
                n8 n8Var = new n8(i);
                long jY0 = addChatAdminsScreen.y0();
                fdc fdcVar = fdc.a;
                return new td9(n8Var, new g9(jY0, fdcVar.b(), fdcVar.getAccessor().d(HttpStatus.SC_PARTIAL_CONTENT), fdcVar.c(), fdcVar.getAccessor().d(208), fdcVar.f(), 0), 4);
            case 3:
                AddChatMembersScreen addChatMembersScreen = (AddChatMembersScreen) this.b;
                yy7[] yy7VarArr2 = AddChatMembersScreen.y0;
                int i7 = xz7.a;
                if (xz7.b(xz7.c)) {
                    api.c(addChatMembersScreen);
                }
                return qqg.a;
            case 4:
                AddLinkBottomSheet addLinkBottomSheet = (AddLinkBottomSheet) this.b;
                yy7[] yy7VarArr3 = AddLinkBottomSheet.B0;
                bwf bwfVarD = o6i.a.getAccessor().d(497);
                String str = addLinkBottomSheet.w0.c;
                if (str == null) {
                    str = "";
                }
                return new o88(bwfVarD, str);
            case 5:
                AdminWaitingRoomScreen adminWaitingRoomScreen = (AdminWaitingRoomScreen) this.b;
                yy7[] yy7VarArr4 = AdminWaitingRoomScreen.Z;
                return new la(new oa(adminWaitingRoomScreen), gm1.a.b().a(), new rjh(adminWaitingRoomScreen.getContext()));
            case 6:
                AdminsFromContactsScreen adminsFromContactsScreen = (AdminsFromContactsScreen) this.b;
                yy7[] yy7VarArr5 = AdminsFromContactsScreen.t0;
                hs hsVar = adminsFromContactsScreen.a;
                yy7 yy7Var = AdminsFromContactsScreen.t0[0];
                long jLongValue = ((Number) hsVar.a(adminsFromContactsScreen)).longValue();
                fdc fdcVar2 = fdc.a;
                return new ac(jLongValue, (qb) fdcVar2.getAccessor().c(607), fdcVar2.b(), fdcVar2.e());
            case 7:
                return ((ae) this.b).b.getContentResolver();
            case 8:
                ok okVar = (ok) this.b;
                dd5 dd5Var = new dd5();
                dd5Var.setCallback(okVar.t0);
                return dd5Var;
            case 9:
                ArrayList arrayList = (ArrayList) this.b;
                j37 j37Var = (j37) ue3.I(arrayList);
                j37 j37Var2 = (j37) ue3.Q(arrayList);
                return wmf.e("insertDataSourceResult: after iterate with insert, \n                        |first:" + (j37Var != null ? Long.valueOf(j37Var.getA()) : null) + ":" + (j37Var != null ? Long.valueOf(j37Var.getC()) : null) + ", \n                        |last:" + (j37Var2 != null ? Long.valueOf(j37Var2.getA()) : null) + ":" + (j37Var2 != null ? Long.valueOf(j37Var2.getC()) : null) + "\n                        |");
            case 10:
                hx hxVar = (hx) this.b;
                return new jyg(hxVar.d, hxVar.c);
            case 11:
                return s40.a((s40) this.b);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new u40((v40) this.b);
            case 13:
                AvatarEditScreen avatarEditScreen = (AvatarEditScreen) this.b;
                hs hsVar2 = avatarEditScreen.a;
                yy7 yy7Var2 = AvatarEditScreen.u0[0];
                return Uri.parse((String) hsVar2.a(avatarEditScreen));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new td0((vd0) this.b);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                cm6 cm6Var = (cm6) ((i5i) this.b).a;
                return new yd0(r34.b((Context) cm6Var.invoke(), y9b.b).mutate(), kxa.a, (Context) cm6Var.invoke(), new n8(15), new n8(i2));
            case 16:
                rr0 rr0Var = (rr0) this.b;
                qx5 qx5Var = (qx5) rr0Var.a.getValue();
                String str2 = rr0Var.c;
                iz5 iz5Var = (iz5) qx5Var;
                iz5Var.getClass();
                File[] fileArrListFiles = iz5.g(iz5.b(iz5Var.c), "botCommands").listFiles();
                if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                    wqi.q(str2, "deleteBotCommands: directory is empty", new Object[0]);
                } else {
                    while (i4 < fileArrListFiles.length) {
                        int i8 = i4 + 1;
                        try {
                            File file = fileArrListFiles[i4];
                            try {
                                file.delete();
                            } catch (IOException e) {
                                Object obj = file;
                                if (!wqi.a()) {
                                    obj = null;
                                }
                                if (obj == null) {
                                    obj = "*";
                                }
                                wqi.p(str2, "deleteBotCommands: fail to delete file " + obj, e);
                            } catch (SecurityException e2) {
                                Object obj2 = file;
                                if (!wqi.a()) {
                                    obj2 = null;
                                }
                                if (obj2 == null) {
                                    obj2 = "*";
                                }
                                wqi.p(str2, "deleteBotCommands: security exception for file " + obj2, e2);
                            }
                            i4 = i8;
                        } catch (ArrayIndexOutOfBoundsException e3) {
                            throw new NoSuchElementException(e3.getMessage());
                        }
                    }
                }
                return qqg.a;
            case LangUtils.HASH_SEED /* 17 */:
                return Integer.valueOf(a93.s0.y((tr0) this.b).getText().j);
            case 18:
                return ((yi1) this.b).a;
            case 19:
                CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) this.b;
                yy7[] yy7VarArr6 = CallBottomPanelWidget.Z;
                return new w31(new s2i(callBottomPanelWidget, 1), (wo1) callBottomPanelWidget.c.getValue());
            case 20:
                o41 o41Var = (o41) this.b;
                return new yd0(r34.b(o41Var.a, i0b.y).mutate(), kxa.a, o41Var.a, new n8(19), new n8(20));
            case 21:
                return new k81(((CallEventsWidget) this.b).o);
            case 22:
                wqi.e(((ia1) this.b).v0, "Didn't updated calls adapter after 5 times, too much computing!", null);
                return qqg.a;
            case 23:
                final ga1 ga1Var = (ga1) this.b;
                vu3 vu3Var = (vu3) ga1Var.a;
                return new yd0(r34.b(vu3Var.getContext(), iwc.ic_call_24), kxa.a, vu3Var.getContext(), new em6() { // from class: fa1
                    @Override // defpackage.em6
                    public final Object invoke(Object obj3) {
                        int i9;
                        switch (i4) {
                            case 0:
                                a93.s0.y(ga1Var.a).getIcon();
                                i9 = -1;
                                break;
                            default:
                                a93.s0.y(ga1Var.a).b();
                                i9 = 0;
                                break;
                        }
                        return Integer.valueOf(i9);
                    }
                }, new em6() { // from class: fa1
                    @Override // defpackage.em6
                    public final Object invoke(Object obj3) {
                        int i9;
                        switch (i3) {
                            case 0:
                                a93.s0.y(ga1Var.a).getIcon();
                                i9 = -1;
                                break;
                            default:
                                a93.s0.y(ga1Var.a).b();
                                i9 = 0;
                                break;
                        }
                        return Integer.valueOf(i9);
                    }
                });
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                CallIncomingScreen callIncomingScreen = (CallIncomingScreen) this.b;
                v1a v1aVar = CallIncomingScreen.s0;
                return new s2i(callIncomingScreen, 1);
            case 25:
                Context context = ((ec1) this.b).a;
                nwe nweVar = new nwe(context);
                nweVar.d(true);
                nweVar.c(kwe.b);
                mwe mweVar = nweVar.w0;
                yy7[] yy7VarArr7 = nwe.A0;
                mweVar.O(nweVar, yy7VarArr7[5], new float[]{0.9f, 1.1f, 0.9f});
                nweVar.x0.O(nweVar, yy7VarArr7[6], 8000L);
                nweVar.t0.O(nweVar, yy7VarArr7[2], new float[]{0.0f, 0.0f});
                nweVar.v0.O(nweVar, yy7VarArr7[4], 0L);
                nweVar.onThemeChanged(a93.s0.z(context).c);
                return nweVar;
            case 26:
                py0 py0Var = (py0) this.b;
                int i9 = xza.g;
                Context context2 = (Context) py0Var.b;
                mc8 mc8Var = new mc8(i9, a93.s0.z(context2).c.getIcon().g, context2);
                float f = 12;
                mc8Var.setBounds(0, 0, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
                return mc8Var;
            case 27:
                ((md1) this.b).X.set(false);
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, "CallInviteToP2PController", "Success enable invite to p2p feature.", null);
                    }
                }
                return qqg.a;
            case 28:
                return Long.valueOf(((w4e) ((pb3) ((k18) ((he1) this.b).c.b).getValue())).s());
            default:
                CallPresettingsScreen callPresettingsScreen = (CallPresettingsScreen) this.b;
                yy7[] yy7VarArr8 = CallPresettingsScreen.Z;
                return new d9e(a93.s0.x(callPresettingsScreen.getContext()).k(), new xtd(i2, callPresettingsScreen), null, null, 28);
        }
    }
}
