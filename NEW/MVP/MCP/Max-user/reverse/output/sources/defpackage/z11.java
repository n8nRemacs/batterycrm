package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import java.util.List;
import one.me.calllist.ui.callpresettings.CallPresettingsScreen;
import one.me.calls.ui.ui.debugmenu.CallDebugMenuScreen;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatscreen.ChatScreen;
import one.me.folders.picker.FolderMemberPickerScreen;
import one.me.profile.ProfileScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class z11 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z11(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        qqg qqgVar = qqg.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((CallAdminSettingsScreen) obj2).getRouter().C();
                return qqgVar;
            case 1:
                ((CallDebugMenuScreen) obj2).getRouter().C();
                return qqgVar;
            case 2:
                ((CallPresettingsScreen) obj2).getRouter().C();
                return qqgVar;
            case 3:
                yy7[] yy7VarArr = ChatMediaViewerScreen.Q0;
                yq2 yq2VarQ0 = ((ChatMediaViewerScreen) obj2).Q0();
                int i2 = fyc.oneme_chatmedia_viewer_toolbar_action_save_gallery;
                yy7[] yy7VarArr2 = yq2.u1;
                yq2VarQ0.O(i2, null);
                return qqgVar;
            case 4:
                int iIntValue = ((Number) obj).intValue();
                yy7[] yy7VarArr3 = ChatScreen.l1;
                xfh.r(((ChatScreen) obj2).X0().Z, new ur9(iIntValue));
                return qqgVar;
            case 5:
                xx3 xx3Var = (xx3) obj;
                ((k53) obj2).W0.h(xx3Var.a, xx3Var.v0);
                return qqgVar;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                b4 b4Var = ((pe8) obj2).T0;
                yy7 yy7Var = pe8.U0[33];
                ((a4) b4Var.o).setValue(bool);
                return qqgVar;
            case 7:
                if (((Throwable) obj) != null) {
                    ((pe4) obj2).close();
                }
                return qqgVar;
            case 8:
                FolderMemberPickerScreen folderMemberPickerScreen = (FolderMemberPickerScreen) obj2;
                yy7[] yy7VarArr4 = FolderMemberPickerScreen.y0;
                la6 la6Var = (la6) folderMemberPickerScreen.I0().c;
                hs hsVar = folderMemberPickerScreen.w0;
                yy7 yy7Var2 = FolderMemberPickerScreen.y0[0];
                String str = (String) hsVar.a(folderMemberPickerScreen);
                if (!la6Var.h) {
                    la6Var.h = true;
                    f84 f84Var = la6Var.g;
                    if (f84Var != null) {
                        svi.d(f84Var, bia.a.plus(((q2b) ((lzf) la6Var.d.getValue())).b()), i84.c, new ja6(la6Var, str, null));
                    }
                }
                return qqgVar;
            case 9:
                ((lwd) obj2).resumeWith((List) obj);
                return qqgVar;
            case 10:
                j8b j8bVar = (j8b) obj2;
                if (((Boolean) obj).booleanValue()) {
                    EditText editText = j8bVar.v0;
                    editText.requestFocus();
                    editText.post(new k79(j8bVar, 17, editText));
                    j8bVar.setOnWindowFocusChanged(null);
                }
                return qqgVar;
            case 11:
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) obj2;
                yy7[] yy7VarArr5 = MessageWriteWidget.L0;
                no9 no9VarI0 = messageWriteWidget.I0();
                no9VarI0.L0.setValue(null);
                pe8 pe8Var = (pe8) ((pb3) no9VarI0.c.getValue());
                pe8Var.J0.O(pe8Var, pe8.U0[23], Boolean.TRUE);
                messageWriteWidget.O0(new n5g(avd.m0), true);
                return qqgVar;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                int iIntValue2 = ((Number) obj).intValue();
                b0i b0iVar = (b0i) obj2;
                if (b0iVar.j() <= 0) {
                    return Boolean.FALSE;
                }
                zea zeaVarJ = b0iVar.J(iIntValue2);
                if (zeaVarJ != null && zeaVarJ.d) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                ((Process) obj2).destroy();
                return qqgVar;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                yy7[] yy7VarArr6 = wxb.E0;
                ((wxb) obj2).u().i = null;
                return qqgVar;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((l42) obj2).resumeWith(qqgVar);
                return qqgVar;
            case 16:
                yy7[] yy7VarArr7 = ProfileEditAdminPermissionsWidget.w0;
                ((ProfileEditAdminPermissionsWidget) obj2).z0().z();
                return qqgVar;
            case LangUtils.HASH_SEED /* 17 */:
                yy7[] yy7VarArr8 = ProfileScreen.C0;
                pnc pncVarD0 = ((ProfileScreen) obj2).D0();
                id0 id0VarE = pncVarD0.T0.e();
                if (id0VarE != null) {
                    xfh.r(pncVarD0.F0, id0VarE);
                }
                return qqgVar;
            case 18:
                String str2 = (String) obj;
                Bundle extras = ((Intent) obj2).getExtras();
                return str2 + ":" + (extras != null ? extras.get(str2) : null);
            default:
                ((py4) obj2).dispose();
                return qqgVar;
        }
    }
}
