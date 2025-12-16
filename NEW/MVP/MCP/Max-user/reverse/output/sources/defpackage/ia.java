package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.members.list.MembersListWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import org.apache.http.util.LangUtils;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class ia implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ia(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        String strS;
        Context context;
        String string;
        int i = 10;
        boolean zContains = false;
        String str = null;
        switch (this.a) {
            case 0:
                ((ka) this.b).d(((ixg) this.c).d, !((Boolean) obj).booleanValue());
                return qqg.a;
            case 1:
                ok okVar = (ok) this.b;
                nwg nwgVar = (nwg) this.c;
                wqi.e(okVar.s0, "fail to load static image", (Throwable) obj);
                okVar.i(jk.a);
                nwgVar.c = null;
                return qqg.a;
            case 2:
                vs1.v((vs1) this.b, (wd0) this.c, ((Boolean) obj).booleanValue());
                return qqg.a;
            case 3:
                hw1 hw1Var = (hw1) this.b;
                ek1 ek1Var = (ek1) this.c;
                Throwable th = (Throwable) obj;
                if (th instanceof ApiInvocationException) {
                    ApiInvocationException apiInvocationException = (ApiInvocationException) th;
                    String message = apiInvocationException.getMessage();
                    if (message == null) {
                        i = 0;
                    } else if (vmf.s(message, "privacy.violation", false) || vmf.s(message, "call.blocked", false)) {
                        i = 3;
                    } else if (vmf.s(message, "not.chat.participant", false)) {
                        i = 8;
                    } else if (vmf.s(message, "wait.for.admin", false)) {
                        i = 9;
                    } else if (!vmf.s(message, "user.restricted.call", false)) {
                        i = 4;
                    }
                    strS = i != 0 ? u45.s(i) : String.valueOf(apiInvocationException.a);
                } else {
                    strS = "UNKNOWN";
                }
                hw1Var.F(ek1Var.c, strS, ek1Var.f);
                hw1.a(hw1Var, th);
                return qqg.a;
            case 4:
                ij2 ij2Var = (ij2) this.b;
                k18 k18Var = ij2Var.f;
                eh9 eh9Var = (eh9) this.c;
                w10 w10Var = (w10) obj;
                Context context2 = ij2Var.a;
                s10 s10Var = w10Var.a;
                if (s10Var == s10.d) {
                    Object[] objArr = w10Var.d.b == 2;
                    Uri uriA = ((z10) k18Var.getValue()).a(w10Var);
                    nwg nwgVar2 = uriA != null ? new nwg(context2, ((z10) k18Var.getValue()).b(w10Var, ssi.l(w10Var, eh9Var)), uriA.toString()) : null;
                    if (nwgVar2 != null) {
                        vtd vtdVarA = objArr == true ? vtd.a() : null;
                        l45 l45Var = nwgVar2.a.d;
                        l45Var.getClass();
                        ((gr6) l45Var).m(vtdVarA);
                    }
                    return new LayerDrawable(new Drawable[]{nwgVar2, new InsetDrawable((Drawable) ij2Var.u.getValue(), objArr != false ? 0.25f : 0.1f)});
                }
                if (s10Var != s10.X) {
                    Uri uriA2 = ((z10) k18Var.getValue()).a(w10Var);
                    if (uriA2 != null) {
                        return new nwg(context2, ((z10) k18Var.getValue()).b(w10Var, ssi.l(w10Var, eh9Var)), uriA2.toString());
                    }
                    return null;
                }
                r10 r10VarO = eh9Var.a.o();
                if (r10VarO != null) {
                    String str2 = r10VarO.h;
                    str = l8g.c(str2) ? r10VarO.b : str2;
                }
                if (str != null) {
                    return new nwg(context2, str);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 5:
                rgc rgcVar = (rgc) this.b;
                os2 os2Var = (os2) this.c;
                rgcVar.invoke(((CharSequence) obj).toString());
                os2Var.F(null);
                return qqg.a;
            case 6:
                ChatNotificationsSettingsScreen chatNotificationsSettingsScreen = (ChatNotificationsSettingsScreen) this.b;
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.c;
                int iIntValue = ((Integer) obj).intValue();
                koe koeVar = chatNotificationsSettingsScreen.c;
                if (iIntValue < 0 || iIntValue >= koeVar.j() || ((ioe) ((t98) koeVar.C(iIntValue))).getItemId() != z7b.f) {
                    return null;
                }
                return z7.e(endlessRecyclerView2.getContext(), b8b.c).toUpperCase(Locale.ROOT);
            case 7:
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.b;
                EndlessRecyclerView2 endlessRecyclerView22 = (EndlessRecyclerView2) this.c;
                int iL = chatsListSearchScreen.E0.l(((Integer) obj).intValue());
                if (iL == u1b.o) {
                    return endlessRecyclerView22.getResources().getString(avd.C0);
                }
                if (iL == u1b.u) {
                    return endlessRecyclerView22.getResources().getString(avd.E0);
                }
                if (iL == i1b.m) {
                    if (chatsListSearchScreen.w0.j() == 0) {
                        return endlessRecyclerView22.getResources().getString(k1b.u);
                    }
                    return null;
                }
                if (iL == i1b.p || iL == i1b.o) {
                    return endlessRecyclerView22.getResources().getString(avd.D0);
                }
                if (iL == i1b.r) {
                    return endlessRecyclerView22.getResources().getString(k1b.w);
                }
                return null;
            case 8:
                k53 k53Var = (k53) this.b;
                ku3 ku3Var = (ku3) this.c;
                if (h43.$EnumSwitchMapping$0[((ecb) obj).ordinal()] == 1) {
                    k53Var.Y0.O(k53Var, k53.d1[0], xfh.o(k53Var, ((q2b) k53Var.Y).b().plus(k53Var.x()), new j53(k53Var, ku3Var.p(), null), 2));
                }
                return qqg.a;
            case 9:
                ChatsListWidget chatsListWidget = (ChatsListWidget) this.b;
                xx3 xx3Var = (xx3) this.c;
                if (((Integer) obj).intValue() != chatsListWidget.y0.j() + chatsListWidget.z0.j() || chatsListWidget.A0.j() <= 0) {
                    return null;
                }
                return xx3Var.b;
            case 10:
                xx3 xx3Var2 = (xx3) this.b;
                b0i b0iVar = (b0i) this.c;
                long jLongValue = ((Long) obj).longValue();
                px3 px3Var = (px3) b0iVar.X;
                if (xx3Var2.u0) {
                    px3Var.S();
                } else if (xx3Var2.X != null) {
                    px3Var.d(jLongValue);
                } else {
                    px3Var.z(jLongValue);
                }
                return qqg.a;
            case 11:
                qk qkVar = (qk) this.b;
                xx3 xx3Var3 = (xx3) this.c;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                qkVar.invoke(Long.valueOf(xx3Var3.a), bool);
                return qqg.a;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ContactListWidget contactListWidget = (ContactListWidget) this.b;
                EndlessRecyclerView2 endlessRecyclerView23 = (EndlessRecyclerView2) this.c;
                int iIntValue2 = ((Integer) obj).intValue();
                yy7[] yy7VarArr = ContactListWidget.O0;
                CharSequence charSequenceA0 = contactListWidget.A0();
                if (charSequenceA0 == null || charSequenceA0.length() == 0) {
                    return null;
                }
                int iL2 = contactListWidget.u0.l(iIntValue2);
                if (iL2 == u1b.o) {
                    return endlessRecyclerView23.getResources().getString(avd.B0);
                }
                if (iL2 == u1b.r) {
                    return endlessRecyclerView23.getResources().getString(avd.D0);
                }
                return null;
            case 13:
                va4 va4Var = (va4) this.b;
                String str3 = (String) this.c;
                String str4 = va4Var.b;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str4, ho7.i("Accessing folder(", str3, ") before them loaded from cache"), null);
                    }
                }
                return ucf.a(null);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ax4 ax4Var = (ax4) this.b;
                lg0 lg0Var = (lg0) this.c;
                Double d = (Double) obj;
                dj1 dj1Var = ax4Var.k;
                Collection collectionI = dj1Var.i();
                HashMap map = new HashMap(collectionI.size());
                Iterator it = collectionI.iterator();
                while (it.hasNext()) {
                    map.put(((yi1) it.next()).a, Float.valueOf(d.floatValue()));
                }
                map.put(dj1Var.a.a, Float.valueOf(d.floatValue()));
                lea leaVar = new lea(map);
                lg0Var.b(ax4Var.f, "DirectCallTopology", "send 'virtual' NetworkStatusNotification: " + leaVar);
                ax4Var.J.b(leaVar);
                return qqg.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                yp5 yp5Var = (yp5) this.b;
                qj1 qj1Var = (qj1) this.c;
                ((Boolean) obj).getClass();
                t9f t9fVar = yp5Var.h;
                yy7[] yy7VarArr2 = yp5.i;
                qt7 qt7Var = (qt7) t9fVar.D(yp5Var, yy7VarArr2[0]);
                if (qt7Var != null) {
                    qt7Var.cancel(null);
                }
                t9fVar.O(yp5Var, yy7VarArr2[0], null);
                yp5Var.b().c = null;
                try {
                    qj1 qj1Var2 = yp5Var.g;
                    WindowManager windowManagerB = (qj1Var2 == null || (context = qj1Var2.getContext()) == null) ? null : e6j.b(context);
                    if (windowManagerB != null) {
                        windowManagerB.removeView(qj1Var);
                    }
                } catch (IllegalArgumentException e) {
                    wqi.e("FakePipController", "can't hide call local pip", e);
                }
                yp5Var.g = null;
                return qqg.a;
            case 16:
                ((xz6) this.b).a.removeCallbacks((zn6) this.c);
                return qqg.a;
            case LangUtils.HASH_SEED /* 17 */:
                yfb yfbVar = (yfb) this.b;
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) this.c;
                yy7[] yy7VarArr3 = InputPhoneScreen.C0;
                api.e(yfbVar);
                ci5 ci5Var = inputPhoneScreen.D0().Z;
                ai8.c.getClass();
                xfh.r(ci5Var, new ei4(":webview/faq"));
                return qqg.a;
            case 18:
                String str5 = (String) this.b;
                ln lnVar = (ln) this.c;
                Intent intent = (Intent) obj;
                if (str5 != null) {
                    Intent intent2 = lnVar.getIntent();
                    Bundle extras = intent2 != null ? intent2.getExtras() : null;
                    intent.putExtra("external_callback_param_arg", str5);
                    if (extras != null && (string = extras.getString("DIGITAL_ID")) != null && intent.putExtra("DIGITAL_ID", string) != null) {
                        intent.putExtra("USER_ID", extras.getLong("USER_ID"));
                        byte[] byteArray = extras.getByteArray("PHOTO_DATA");
                        if (byteArray != null) {
                            intent.putExtra("PHOTO_DATA", byteArray);
                        }
                    }
                }
                return qqg.a;
            case 19:
                lc9 lc9Var = (lc9) this.b;
                fb6 fb6Var = (fb6) this.c;
                ((Long) obj).getClass();
                long j = lc9Var.a;
                MembersListWidget membersListWidget = (MembersListWidget) fb6Var.X;
                if (!lc9Var.t0) {
                    xfh.r(membersListWidget.A0().o, nd9.a);
                } else if (lc9Var.Z) {
                    xfh.r(membersListWidget.A0().o, rd9.a);
                } else if (lc9Var.s0) {
                    xfh.r(membersListWidget.A0().o, new qd9(j));
                } else {
                    membersListWidget.A0().w(j, lc9Var.u0);
                }
                return qqg.a;
            case 20:
                wu7 wu7Var = (wu7) this.b;
                MembersListWidget membersListWidget2 = (MembersListWidget) this.c;
                Integer num = (Integer) obj;
                num.getClass();
                yy7[] yy7VarArr4 = MembersListWidget.C0;
                lc9 lc9Var2 = (lc9) wu7Var.invoke(num);
                if (lc9Var2 != null) {
                    td9 td9VarA0 = membersListWidget2.A0();
                    long j2 = lc9Var2.a;
                    Set set = (Set) td9VarA0.Y.getValue();
                    if (set != null && set.contains(Long.valueOf(j2)) && lc9Var2.u0) {
                        zContains = true;
                    }
                }
                return Boolean.valueOf(zContains);
            case 21:
                hf9 hf9Var = (hf9) this.b;
                si9 si9Var = (si9) this.c;
                ar2 ar2Var = (ar2) obj;
                if (ar2Var.a.a != ((w4e) hf9Var.X).s() && si9Var.c <= ar2Var.c) {
                    zContains = true;
                }
                return Boolean.valueOf(zContains);
            case 22:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) this.b;
                RecyclerView recyclerView = (RecyclerView) this.c;
                t98 t98Var = (t98) messageContextMenuBottomSheet.a1.C(((Integer) obj).intValue());
                if ((t98Var instanceof kc9) && ((kc9) t98Var).s0) {
                    return recyclerView.getContext().getString(l7b.r0);
                }
                return null;
            case 23:
                ((n9a) this.b).g(((m9a) this.c).b);
                return qqg.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                wga wgaVar = (wga) this.b;
                jr6 jr6Var = (jr6) this.c;
                kce kceVar = wgaVar.V0;
                if (kceVar != null) {
                    MessagesListWidget messagesListWidget = (MessagesListWidget) kceVar.b;
                    yy7[] yy7VarArr5 = MessagesListWidget.b1;
                    xfh.r(messagesListWidget.K0().J1, new dib(jr6Var));
                }
                return qqg.a;
            case 25:
                coa coaVar = (coa) this.b;
                cna cnaVar = (cna) this.c;
                long j3 = cnaVar.a;
                dsd dsdVarC = dsd.c(1, "SELECT * FROM notifications_read_marks WHERE chat_id = ?");
                dsdVarC.k(1, j3);
                lrd lrdVar = coaVar.a;
                lrdVar.b();
                Cursor cursorN = lrdVar.n(dsdVarC);
                try {
                    cna cnaVar2 = cursorN.moveToFirst() ? new cna(cursorN.getLong(s7j.c(cursorN, "chat_id")), cursorN.getLong(s7j.c(cursorN, "mark"))) : null;
                    if (cnaVar2 != null) {
                        long j4 = cnaVar2.b;
                        long j5 = cnaVar.b;
                        if (j4 == j5) {
                            return Boolean.FALSE;
                        }
                        if (j4 > j5) {
                            return Boolean.FALSE;
                        }
                    }
                    lrdVar.b();
                    lrdVar.c();
                    try {
                        coaVar.b.B(cnaVar);
                        lrdVar.q();
                        lrdVar.k();
                        return Boolean.TRUE;
                    } catch (Throwable th2) {
                        lrdVar.k();
                        throw th2;
                    }
                } finally {
                    cursorN.close();
                    dsdVarC.y();
                }
            case 26:
                wpa wpaVar = (wpa) this.b;
                List<xs5> list = (List) this.c;
                Continuation continuation = (Continuation) obj;
                ArrayList arrayList = new ArrayList(we3.q(list, 10));
                for (xs5 xs5Var : list) {
                    arrayList.add(xs5Var.a + "_" + xs5Var.b);
                }
                return k7j.b(wpaVar.a, new ci(wpaVar, 26, arrayList), continuation);
            case 27:
                g4b g4bVar = (g4b) this.b;
                jj5 jj5Var = (jj5) this.c;
                b4b b4bVarB = g4bVar.b();
                b4bVarB.getClass();
                BlockingQueue z3bVar = Build.VERSION.SDK_INT >= 35 ? new z3b() : new a4b();
                int i2 = jj5Var.b;
                String str6 = jj5Var.a;
                int i3 = jj5Var.c;
                long j6 = jj5Var.d;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ThreadFactory threadFactoryH = b4bVarB.a.h(str6, Integer.valueOf(jj5Var.g), jj5Var.h, jj5Var.i);
                boolean z = jj5Var.e;
                tz5 tz5Var = new tz5(i2, i3, j6, timeUnit, z3bVar, threadFactoryH);
                if (z && j6 > 0) {
                    tz5Var.allowCoreThreadTimeOut(true);
                }
                tz5Var.setRejectedExecutionHandler(new d22(1));
                if (jj5Var.f) {
                    tz5Var.prestartAllCoreThreads();
                }
                return g4bVar.i(tz5Var, str6);
            case 28:
                if (((SharedPreferences) ((afb) this.b).a.getValue()).getString((String) this.c, null) == null) {
                    return null;
                }
                throw new oia("An operation is not implemented: ONEME-18754 Добавить поддержку кастомных тем");
            default:
                EndlessRecyclerView2 endlessRecyclerView24 = (EndlessRecyclerView2) this.b;
                PickerMembersListWidget pickerMembersListWidget = (PickerMembersListWidget) this.c;
                int iIntValue3 = ((Integer) obj).intValue();
                yy7[] yy7VarArr6 = PickerMembersListWidget.y0;
                phd adapter = endlessRecyclerView24.getAdapter();
                dxb dxbVar = pickerMembersListWidget.Z;
                if (adapter != dxbVar) {
                    dxbVar = pickerMembersListWidget.s0;
                }
                if (dxbVar.j() > iIntValue3 && iIntValue3 >= 0) {
                    zContains = ((Set) pickerMembersListWidget.A0().Y.a.getValue()).contains(Long.valueOf(((fxb) ((t98) dxbVar.C(iIntValue3))).a));
                }
                return Boolean.valueOf(zContains);
        }
    }
}
