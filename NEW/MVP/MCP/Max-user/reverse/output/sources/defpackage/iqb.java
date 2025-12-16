package defpackage;

import android.database.Cursor;
import android.opengl.GLES20;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.location.map.pick.PickLocationScreen;
import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;
import one.me.pinbars.PinBarsWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.qrscanner.QrScannerWidget;
import one.me.sdk.arch.Widget;
import one.me.settings.media.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.settings.ringtone.ui.SettingRingtoneScreen;
import one.me.settings.twofa.restore.ProfileDeletionInfoScreen;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class iqb implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iqb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) throws Throwable {
        d3c d3cVar;
        dsd dsdVar;
        int iC;
        int iC2;
        int iC3;
        int iC4;
        int iC5;
        int iC6;
        int iC7;
        int iC8;
        int iC9;
        int iC10;
        int iC11;
        int iC12;
        int iC13;
        int iC14;
        int i;
        byte[] blob;
        int i2 = this.a;
        qqg qqgVar = qqg.a;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                return (l25) obj2;
            case 1:
                yy7[] yy7VarArr = PickChatMembers.x0;
                jva onBackPressedDispatcher = ((PickChatMembers) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return qqgVar;
            case 2:
                yy7[] yy7VarArr2 = PickLocationScreen.v0;
                jva onBackPressedDispatcher2 = ((PickLocationScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher2 != null) {
                    onBackPressedDispatcher2.d();
                }
                return qqgVar;
            case 3:
                uaf uafVar = (uaf) obj;
                uafVar.M0();
                uafVar.s0(uafVar.L0(((iwb) ((jwb) obj2)).a));
                return qqgVar;
            case 4:
                boolean zContains = false;
                PickerChatsListWidget pickerChatsListWidget = (PickerChatsListWidget) obj2;
                int iIntValue = ((Integer) obj).intValue();
                phd phdVar = (phd) ue3.G(pickerChatsListWidget.v0.C());
                dxb dxbVar = pickerChatsListWidget.w0;
                if (phdVar != dxbVar) {
                    dxbVar = pickerChatsListWidget.x0;
                }
                if (dxbVar.j() > iIntValue && iIntValue >= 0) {
                    zContains = ((Set) pickerChatsListWidget.B0().Y.a.getValue()).contains(Long.valueOf(((fxb) ((t98) dxbVar.C(iIntValue))).Z.a));
                }
                return Boolean.valueOf(zContains);
            case 5:
                PickerMembersListWidget pickerMembersListWidget = (PickerMembersListWidget) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                dxb dxbVar2 = pickerMembersListWidget.Z;
                CharSequence charSequence = (CharSequence) pickerMembersListWidget.A0().t0.a.getValue();
                if ((charSequence == null || charSequence.length() == 0) && iIntValue2 < dxbVar2.j()) {
                    return ((fxb) ((t98) dxbVar2.C(iIntValue2))).c;
                }
                return null;
            case 6:
                PinBarsWidget pinBarsWidget = (PinBarsWidget) obj2;
                r0a r0aVar = (r0a) obj;
                int i3 = PinBarsWidget.u0;
                View view = pinBarsWidget.getView();
                if (view != null) {
                    uog.i(view, p07.CONFIRM);
                }
                qzb qzbVarY0 = pinBarsWidget.y0();
                int iOrdinal = r0aVar.ordinal();
                if (iOrdinal == 0) {
                    d3cVar = d3c.b;
                } else if (iOrdinal == 1) {
                    d3cVar = d3c.c;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d3cVar = d3c.d;
                }
                qzbVarY0.x0.d(d3cVar);
                return qqgVar;
            case 7:
                ((j0c) obj2).L0.invoke();
                return qqgVar;
            case 8:
                j5c j5cVar = (j5c) obj2;
                int iIntValue3 = ((Integer) obj).intValue();
                return j5cVar.e[iIntValue3] + ": " + j5cVar.i(iIntValue3).a();
            case 9:
                yy7[] yy7VarArr3 = ProfileAvatarsScreen.y0;
                ((ProfileAvatarsScreen) obj2).getRouter().C();
                return qqgVar;
            case 10:
                yy7[] yy7VarArr4 = ProfileChangeLinkScreen.t0;
                jva onBackPressedDispatcher3 = ((ProfileChangeLinkScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher3 != null) {
                    onBackPressedDispatcher3.d();
                }
                return qqgVar;
            case 11:
                rfc rfcVar = (rfc) obj;
                rfcVar.p0().b(":chat-list", null);
                rfcVar.p0().b(vb9.e(((xcc) ((ddc) obj2)).b, ":start-conversation/add-subscribers?id="), null);
                return qqgVar;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                yy7[] yy7VarArr5 = ProfileDeletionInfoScreen.X;
                jva onBackPressedDispatcher4 = ((ProfileDeletionInfoScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher4 != null) {
                    onBackPressedDispatcher4.d();
                }
                return qqgVar;
            case 13:
                ProfileInviteScreen profileInviteScreen = (ProfileInviteScreen) obj2;
                LinearLayout linearLayout = (LinearLayout) obj;
                yy7[] yy7VarArr6 = ProfileInviteScreen.X;
                yfb yfbVar = new yfb(linearLayout.getContext(), 6);
                yfbVar.setLayoutParams(new kt3(-1, -2));
                yfbVar.setTitle(x8b.p);
                yfbVar.setForm(qfb.a);
                yfbVar.setTextShimmerEnabled(false);
                yfbVar.setLeftActions(new gfb(new dga(27)));
                linearLayout.addView(yfbVar);
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
                recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setClipChildren(false);
                recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), kti.d(16 * vw4.d().getDisplayMetrics().density), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
                recyclerView.setAdapter(profileInviteScreen.d);
                recyclerView.setItemAnimator(null);
                i8a i8aVar = vo7.a;
                i8a i8aVar2 = new i8a(1);
                i8aVar2.h(4);
                recyclerView.j(new d9e(a93.s0.y(recyclerView), new z9a(profileInviteScreen, 9, i8aVar2), null, null, 28));
                float f = 12;
                float f2 = 10;
                recyclerView.j(new vo8(oo7.a(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(24 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density)), oo7.a(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), 0), oo7.a(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f2 * vw4.d().getDisplayMetrics().density), 0), 1));
                linearLayout.addView(recyclerView);
                return qqgVar;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                pnc pncVar = (pnc) obj2;
                if (((ecb) obj) == ecb.o) {
                    svi.e(pncVar.a, ((q2b) pncVar.x()).b(), null, new onc(pncVar, null), 2);
                }
                return qqgVar;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return Integer.valueOf(((nl7) obj2).a);
            case 16:
                yy7[] yy7VarArr7 = QrScannerWidget.E0;
                ((QrScannerWidget) obj2).A0().t(vyd.a);
                return qqgVar;
            case LangUtils.HASH_SEED /* 17 */:
                m9d m9dVar = (m9d) obj;
                w9d w9dVar = ((x9d) obj2).b;
                if (w9dVar != null) {
                    w9dVar.Z(m9dVar);
                }
                return qqgVar;
            case 18:
                yy7[] yy7VarArr8 = RegistrationNeuroAvatarsScreen.D0;
                ((RegistrationNeuroAvatarsScreen) obj2).getRouter().C();
                return qqgVar;
            case 19:
                Size size = (Size) obj;
                GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
                jca.a("glViewport", new int[0]);
                GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
                jca.a("glClearColor", new int[0]);
                GLES20.glClear(16384);
                jca.a("glClear", 1285);
                ((kw6) obj2).k();
                return qqgVar;
            case 20:
                drd drdVar = (drd) obj2;
                drdVar.getClass();
                return drd.b(drdVar, (Continuation) obj);
            case 21:
                List<Long> list = (List) obj;
                lq9 lq9VarD = ((bsd) obj2).d();
                lrd lrdVar = lq9VarD.a;
                StringBuilder sbM = az1.m("SELECT * FROM messages WHERE id in (");
                int size2 = list.size();
                lc4.a(sbM, size2);
                sbM.append(") AND inserted_from_msg_link = 0 AND status <> ");
                sbM.append("?");
                int i4 = size2 + 1;
                dsd dsdVarC = dsd.c(i4, sbM.toString());
                int i5 = 1;
                for (Long l : list) {
                    if (l == null) {
                        dsdVarC.S(i5);
                    } else {
                        dsdVarC.k(i5, l.longValue());
                    }
                    i5++;
                }
                lq9VarD.b().getClass();
                dsdVarC.k(i4, 10);
                lrdVar.b();
                Cursor cursorN = lrdVar.n(dsdVarC);
                try {
                    iC = s7j.c(cursorN, "id");
                    iC2 = s7j.c(cursorN, "server_id");
                    iC3 = s7j.c(cursorN, "time");
                    iC4 = s7j.c(cursorN, "update_time");
                    iC5 = s7j.c(cursorN, "sender");
                    iC6 = s7j.c(cursorN, "cid");
                    iC7 = s7j.c(cursorN, "text");
                    iC8 = s7j.c(cursorN, "delivery_status");
                    iC9 = s7j.c(cursorN, "status");
                    iC10 = s7j.c(cursorN, "time_local");
                    iC11 = s7j.c(cursorN, NegotiationErrorStat.KEY_ERROR);
                    iC12 = s7j.c(cursorN, "localized_error");
                    iC13 = s7j.c(cursorN, "attaches");
                    iC14 = s7j.c(cursorN, "media_type");
                    dsdVar = dsdVarC;
                } catch (Throwable th) {
                    th = th;
                    dsdVar = dsdVarC;
                }
                try {
                    int iC15 = s7j.c(cursorN, "detect_share");
                    int iC16 = s7j.c(cursorN, "msg_link_type");
                    int iC17 = s7j.c(cursorN, "msg_link_id");
                    int iC18 = s7j.c(cursorN, "inserted_from_msg_link");
                    int iC19 = s7j.c(cursorN, "msg_link_chat_id");
                    int iC20 = s7j.c(cursorN, "msg_link_chat_name");
                    int iC21 = s7j.c(cursorN, "msg_link_chat_link");
                    int iC22 = s7j.c(cursorN, "msg_link_chat_icon_url");
                    int iC23 = s7j.c(cursorN, "msg_link_chat_access_type");
                    int iC24 = s7j.c(cursorN, "msg_link_out_chat_id");
                    int iC25 = s7j.c(cursorN, "msg_link_out_msg_id");
                    int iC26 = s7j.c(cursorN, "type");
                    int iC27 = s7j.c(cursorN, "chat_id");
                    int iC28 = s7j.c(cursorN, "channel_views");
                    int iC29 = s7j.c(cursorN, "channel_forwards");
                    int iC30 = s7j.c(cursorN, "view_time");
                    int iC31 = s7j.c(cursorN, "options");
                    int iC32 = s7j.c(cursorN, "live_until");
                    int iC33 = s7j.c(cursorN, "elements");
                    int iC34 = s7j.c(cursorN, "reactions");
                    int iC35 = s7j.c(cursorN, "delayed_attrs_time_to_fire");
                    int iC36 = s7j.c(cursorN, "delayed_attrs_notify_sender");
                    int iC37 = s7j.c(cursorN, "reactions_update_time");
                    int i6 = iC14;
                    ArrayList arrayList = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        long j = cursorN.getLong(iC);
                        long j2 = cursorN.getLong(iC2);
                        long j3 = cursorN.getLong(iC3);
                        long j4 = cursorN.getLong(iC4);
                        long j5 = cursorN.getLong(iC5);
                        long j6 = cursorN.getLong(iC6);
                        String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                        int i7 = cursorN.getInt(iC8);
                        lq9VarD.b().getClass();
                        xi9 xi9VarB = ky9.b(i7);
                        int i8 = cursorN.getInt(iC9);
                        lq9VarD.b().getClass();
                        jm9 jm9VarD = ky9.d(i8);
                        long j7 = cursorN.getLong(iC10);
                        String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                        String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                        byte[] blob2 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                        lq9VarD.b().getClass();
                        jdc jdcVarA = ky9.a(blob2);
                        int i9 = i6;
                        int i10 = cursorN.getInt(i9);
                        int i11 = iC;
                        int i12 = iC15;
                        boolean z = cursorN.getInt(i12) != 0;
                        iC15 = i12;
                        int i13 = iC16;
                        int i14 = cursorN.getInt(i13);
                        iC16 = i13;
                        int i15 = iC17;
                        long j8 = cursorN.getLong(i15);
                        iC17 = i15;
                        int i16 = iC18;
                        boolean z2 = cursorN.getInt(i16) != 0;
                        iC18 = i16;
                        int i17 = iC19;
                        long j9 = cursorN.getLong(i17);
                        iC19 = i17;
                        int i18 = iC20;
                        String string4 = cursorN.isNull(i18) ? null : cursorN.getString(i18);
                        iC20 = i18;
                        int i19 = iC21;
                        String string5 = cursorN.isNull(i19) ? null : cursorN.getString(i19);
                        iC21 = i19;
                        int i20 = iC22;
                        String string6 = cursorN.isNull(i20) ? null : cursorN.getString(i20);
                        iC22 = i20;
                        int i21 = iC23;
                        Integer numValueOf = cursorN.isNull(i21) ? null : Integer.valueOf(cursorN.getInt(i21));
                        lq9VarD.a().getClass();
                        int iA = m73.a(numValueOf);
                        iC23 = i21;
                        int i22 = iC24;
                        long j10 = cursorN.getLong(i22);
                        iC24 = i22;
                        int i23 = iC25;
                        long j11 = cursorN.getLong(i23);
                        iC25 = i23;
                        int i24 = iC26;
                        int i25 = cursorN.getInt(i24);
                        lq9VarD.b().getClass();
                        int iE = ky9.e(i25);
                        iC26 = i24;
                        int i26 = iC27;
                        long j12 = cursorN.getLong(i26);
                        iC27 = i26;
                        int i27 = iC28;
                        int i28 = cursorN.getInt(i27);
                        iC28 = i27;
                        int i29 = iC29;
                        int i30 = cursorN.getInt(i29);
                        iC29 = i29;
                        int i31 = iC30;
                        long j13 = cursorN.getLong(i31);
                        iC30 = i31;
                        int i32 = iC31;
                        int i33 = cursorN.getInt(i32);
                        iC31 = i32;
                        int i34 = iC32;
                        long j14 = cursorN.getLong(i34);
                        iC32 = i34;
                        int i35 = iC33;
                        byte[] blob3 = cursorN.isNull(i35) ? null : cursorN.getBlob(i35);
                        lq9VarD.b().getClass();
                        List listC = ky9.c(blob3);
                        iC33 = i35;
                        int i36 = iC34;
                        if (cursorN.isNull(i36)) {
                            i = i36;
                            blob = null;
                        } else {
                            i = i36;
                            blob = cursorN.getBlob(i36);
                        }
                        int i37 = iC13;
                        xl9 xl9VarF = lq9VarD.b().f(blob);
                        int i38 = iC35;
                        Long lValueOf = cursorN.isNull(i38) ? null : Long.valueOf(cursorN.getLong(i38));
                        int i39 = iC36;
                        Integer numValueOf2 = cursorN.isNull(i39) ? null : Integer.valueOf(cursorN.getInt(i39));
                        Boolean boolValueOf = numValueOf2 == null ? null : Boolean.valueOf(numValueOf2.intValue() != 0);
                        iC35 = i38;
                        int i40 = iC37;
                        iC37 = i40;
                        arrayList.add(new gj9(j, j2, j3, j4, j5, j6, string, xi9VarB, jm9VarD, j7, string2, string3, jdcVarA, i10, z, i14, j8, z2, j9, string4, string5, string6, iA, j10, j11, iE, j12, i28, i30, j13, i33, j14, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i40)));
                        iC36 = i39;
                        iC13 = i37;
                        iC = i11;
                        iC34 = i;
                        i6 = i9;
                    }
                    cursorN.close();
                    dsdVar.y();
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    cursorN.close();
                    dsdVar.y();
                    throw th;
                }
            case 22:
                ((py4) obj2).dispose();
                return qqgVar;
            case 23:
                yy7[] yy7VarArr9 = SafeModeOnboardingScreen.X;
                jva onBackPressedDispatcher5 = ((SafeModeOnboardingScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher5 != null) {
                    onBackPressedDispatcher5.d();
                }
                return qqgVar;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                iu3 iu3Var = (iu3) obj2;
                uzd uzdVar = (uzd) obj;
                if (!(uzdVar instanceof szd)) {
                    if (!(uzdVar instanceof tzd)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iu3Var.accept(uzdVar);
                }
                return qqgVar;
            case 25:
                tee teeVar = (tee) obj2;
                int iIntValue4 = ((Integer) obj).intValue();
                return teeVar.e[iIntValue4] + ": " + teeVar.f[iIntValue4].a();
            case 26:
                yy7[] yy7VarArr10 = SettingMediaScreen.X;
                ((SettingMediaScreen) obj2).getRouter().C();
                return qqgVar;
            case 27:
                yy7[] yy7VarArr11 = SettingRingtoneScreen.Z;
                ((SettingRingtoneScreen) obj2).getRouter().C();
                return qqgVar;
            case 28:
                yy7[] yy7VarArr12 = SettingsBlacklistScreen.Y;
                ((SettingsBlacklistScreen) obj2).getRouter().C();
                return qqgVar;
            default:
                yy7[] yy7VarArr13 = SettingsPrivacyScreen.Z;
                ((SettingsPrivacyScreen) obj2).getRouter().C();
                return qqgVar;
        }
    }

    public /* synthetic */ iqb(Widget widget, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
