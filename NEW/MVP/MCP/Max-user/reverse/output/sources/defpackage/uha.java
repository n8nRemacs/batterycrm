package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.CamcorderProfile;
import android.net.Uri;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.firebase.components.ComponentRegistrar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import org.apache.http.entity.ContentLengthStrategy;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.api.http.NoHttpApiEndpointException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public final class uha implements be7, p20, zc3, sy2, tm6, rl3, c6f, wzg, pug, ghg, if9, ey1, sl3, xmb, hw8, f97, ox7, jn8, pmb {
    public static uha b;
    public static final uha x0;
    public static final uha y0;
    public final /* synthetic */ int a;
    public static final uha c = new uha(1);
    public static final uha d = new uha(2);
    public static final uha o = new uha(3);
    public static final yt0 X = new yt0(new rt0(new qt0(-1557290188, -1557290188, 1714266932), new st0(new tt0(523084596, 2990900), new ut0(1026401076, 2990900), new vt0(1029346407, 5936231)), new wt0(-13786316, 338535220, -1, -2060606668), new xt0(1294836532, 170763060, 2990900, new int[]{1294836532, -2144492748}), -13786316, 1026401076, 338535220, -1, 338535220, -4112, 338535220, -1, 338535220, 2049811252, new int[]{-1, -1, -1}, new int[]{-1, -1}), new zt0(-1, -13786316, -1685946, -53188, -13786316, -1305631948, -2062807540, -1, -9135753, -9135753, -13786316, -871625458, -1895035380, 1879838220, -1895035380), new au0(-1, 338535220, -13786316, -1), new bu0(new cu0(-1, -13786316, -13786316, -1), -13786316, -13786316, -13786316, -15987188, -2062807540, -2062807540, -1207169524, -13786316, 16777215, -2062807540, -1207169524, -2062807540));
    public static final yt0 Y = new yt0(new rt0(new qt0(-1728006644, -1728006644, 1711322636), new st0(new tt0(523084596, 2990900), new ut0(1026401076, 2990900), new vt0(1026401076, 2990900)), new wt0(-13786316, 523084596, -1, -2060606668), new xt0(1294836532, 170763060, 2990900, new int[]{1294836532, -2144492748}), -13786316, 1546494772, 338535220, -1900599, 338535220, 338535220, 523084596, -656897, 338535220, 2049811252, new int[]{-1900599, -1900599, -1900599}, new int[]{-1900599, -1900599}), new zt0(-1900599, -16741368, -1685946, -16711919, -16741368, -16741368, -16741368, -1, -2063256816, -2063256816, -16711919, -872074480, -1895484656, 1879388944, -1895484656), new au0(-1900599, 335580168, -16741368, -1), new bu0(new cu0(-1, -13786316, -13786316, -1), -13786316, -13786316, -16711919, -16436464, -2063256816, -2063256816, -1207618800, -16741368, 16777215, -2063256816, -1207618800, -16741368));
    public static final th3 Z = new th3(new hg3(new gg3(-53188, -15921907, -13786316, -2693121), new ig3(-15987188, -4605511, -13786316)), new kg3(new jg3(0, 0, 526344, 0, 0, 0, -6236251, -2104376, 1886698102, 1886698102, 1886698102, 0, 0, 0, 0, 0, 0), new lg3(1033643952, 698099632, -6543440, -1543503873, 1024489791, 688945471, -15697601, -371456, 1039815936, 704271616, -371456, -16544549, 1023642843, 688098523, -16544549, -2409396, 1037777996, 702233676, -2409396, -10587743, 1029599649, 694055329, -10587743, 1025203902, 689659582, -14983490, -13786316, 1026401076, 690856756, -13786316, -9158436, 1031028956, 695484636, -9158436), new og3(new mg3(1308622847, new int[]{16777215, 1090519039, -2130706433}), new ng3(-986638, new int[]{16777215, 1090519039, -2130706433}), new qg3(new pg3(-2130706433, new int[]{16777215, -1711276033}), new int[]{-2130706433, -1}), new sg3(new rg3(-986638, new int[]{16777215, -1}), new int[]{-2134193204, 13290444})), new tg3(new int[]{-1543503873, -520093697, -520093697}, -14245331, -16729857, 47359, -7034368, 9742848, 872415231, 452984831, -1, -2130706433), -13786316, 1543503872, -2060621244, -1192234767, -1249810, -1184014, -15921907, 856230153, 336136457, -15921907, 1376521740, -871625204, -1727263220, -9127306, -13786316, -1184014, -5252173, new int[]{-2060621244, -2060621244}, new int[]{-520093697, -520093697}, new int[]{-637534209, -1291845633, -1929379841}, new int[]{-6236251, -2104376}), new vh3(-13786316, -13786316, -53188, -2062807794, -13786316, -1), new bi3(new ci3(251658240, 167772160), new di3(251658240), new ei3(251658240)), new ji3(new hi3(new gi3(new fi3(-16741368), 520093696), new ii3(-1725062348, 168627469, 2047675661)), new ki3(new li3(-1545253546, -1725062348)), new mi3(new ni3(-1543503873, -1191182337, -1545253546, -1552977290, -1725062348))), new oi3(new pi3(688655630, 252448014), -1, 1308622847), new qi3(-1, -15987188, -1, -53188, -15987698, -2062808050, 1712065550, -13786316));
    public static final wcg s0 = new wcg(new tcg(new ucg(-15921907, 336136457, -13786316, -1), new vcg(2047675661, 168364297, -1725062348)), new xcg(new ycg(-1, 336136457, -15921907, -4276546, -11184811, -7566196, -13786316), new zcg(-1191182337, -1191182337, -1545253546, 168364297, -1552517514, -1552517514, -1552517514, -1552517514, -1725062348)), new adg(new bdg(new cdg(688655884, 252448268))), new ddg(new edg(-1, -15921907, -2062742259, -13786316), new fdg(-1543503873, -1191182337, -1552517514, -1552517514, -1725062348)));
    public static final r6i t0 = new r6i(new q6i(-592138, -1, 336136457, -1), new s6i(-15987188, -7566196, -7566196, -13786316, 1879838220), new t6i(252448268, 252448268, -13786316), new u6i(-15987188, -13786316, 1712066060, -15987188, -1207169524, -2062807540, -2062807540, -13786316));
    public static final uha u0 = new uha(4);
    public static final uha v0 = new uha(5);
    public static final uha w0 = new uha(6);
    public static final uha z0 = new uha(9);
    public static final String[] A0 = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};
    public static final uha B0 = new uha(11);
    public static final /* synthetic */ uha C0 = new uha(12);

    static {
        int i = 7;
        x0 = new uha(i);
        y0 = new uha(i);
    }

    public /* synthetic */ uha(int i) {
        this.a = i;
    }

    public static uxa B(LinearLayout linearLayout, Drawable drawable, cm6 cm6Var, cm6 cm6Var2, int i, int i2, dga dgaVar, dga dgaVar2) {
        uxa uxaVar = new uxa(linearLayout.getContext());
        uxaVar.setId(xyc.oneme_login_neuro_avatars_avatar);
        uxaVar.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        linearLayout.setGravity(1);
        uxaVar.setCloseBadgeClickListener(cm6Var);
        uxaVar.setOnImageLoadedListener(cm6Var2);
        uxa.o(uxaVar, drawable, dgaVar, dgaVar2, 6);
        uxaVar.setAvatarShape(kxa.a);
        linearLayout.addView(uxaVar);
        return uxaVar;
    }

    public static void C(ViewGroup viewGroup) {
        cga cgaVar = new cga(viewGroup.getContext(), null, 0);
        float f = 8;
        cgaVar.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(f * vw4.d().getDisplayMetrics().density), 0);
        cgaVar.setId(xyc.oneme_login_neuro_avatars_tabs_shimmer);
        cgaVar.setElevation(0.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        float f2 = 32;
        marginLayoutParams.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f2);
        cgaVar.setLayoutParams(marginLayoutParams);
        cgaVar.setVisibility(8);
        cgaVar.setTabs(3);
        cgaVar.setOverScrollMode(2);
        viewGroup.addView(cgaVar);
        neb nebVar = new neb(viewGroup.getContext(), 0);
        nebVar.setId(xyc.oneme_login_neuro_avatars_tabs);
        nebVar.setTabMode(0);
        nebVar.setElevation(0.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.topMargin = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        nebVar.setLayoutParams(marginLayoutParams2);
        nebVar.setOverScrollMode(2);
        viewGroup.addView(nebVar);
    }

    public static void D(LinearLayout linearLayout, o6g o6gVar) {
        int i = o6gVar.a;
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(xyc.oneme_login_neuro_avatars_title);
        dpg.c.b(textView, t75.b);
        textView.setText(i);
        textView.setGravity(1);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        float f = 12;
        marginLayoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(vw4.d().getDisplayMetrics().density * f), 0);
        textView.setLayoutParams(marginLayoutParams);
        int i2 = 3;
        Continuation continuation = null;
        tqi.c(new x9(i2, continuation, 25), textView);
        linearLayout.addView(textView);
        int i3 = o6gVar.b;
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(xyc.oneme_login_neuro_avatars_description);
        dpg.i.b(textView2, t75.b);
        textView2.setText(i3);
        textView2.setGravity(1);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density), 0);
        textView2.setLayoutParams(marginLayoutParams2);
        tqi.c(new x9(i2, continuation, 24), textView2);
        linearLayout.addView(textView2);
    }

    public static void E(ViewGroup viewGroup, o6g o6gVar, em6 em6Var) {
        yfb yfbVar = new yfb(viewGroup.getContext(), 6);
        yfbVar.setId(xyc.oneme_login_neuro_avatars_toolbar);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(em6Var));
        yfbVar.setTitle(o6gVar.a);
        yfbVar.setTitleAlpha(0.0f);
        viewGroup.addView(yfbVar);
    }

    public static final void y(uha uhaVar, String str) {
        lg8 lg8Var;
        uhaVar.getClass();
        int iV = az1.v(2);
        if (iV == 0) {
            lg8Var = lg8.d;
        } else if (iV == 1) {
            lg8Var = lg8.o;
        } else if (iV == 2) {
            lg8Var = lg8.X;
        } else {
            if (iV != 3) {
                if (iV != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            lg8Var = lg8.Y;
        }
        wqi.k(lg8Var, "Scout", str, new Object[0]);
    }

    public static m7f z(CharSequence charSequence) {
        SpannableString spannableString;
        try {
            spannableString = new SpannableString(charSequence);
            ssi.a(spannableString);
        } catch (IndexOutOfBoundsException unused) {
            if (charSequence instanceof Spannable) {
                ssi.a((Spannable) charSequence);
            }
            spannableString = new SpannableString(charSequence);
        }
        return new m7f(spannableString);
    }

    @Override // defpackage.zc3
    public l0g A(tm9 tm9Var) {
        int iM;
        String strP;
        int iM2;
        String strP2;
        switch (this.a) {
            case 2:
                if (!tm9Var.l()) {
                    return new q51("");
                }
                try {
                    iM = efi.m(tm9Var);
                } catch (Throwable th) {
                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
                    Iterator it = vfe.a.iterator();
                    while (it.hasNext()) {
                        ((qwa) it.next()).getClass();
                        qwa.a(th);
                    }
                    int iV = az1.v(ctd.a);
                    if (iV != 0) {
                        if (iV != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th;
                    }
                    iM = 0;
                }
                String strP3 = null;
                for (int i = 0; i < iM; i++) {
                    try {
                        strP = efi.p(tm9Var, null);
                    } catch (Throwable th2) {
                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                        Iterator it2 = vfe.a.iterator();
                        while (it2.hasNext()) {
                            ((qwa) it2.next()).getClass();
                            qwa.a(th2);
                        }
                        int iV2 = az1.v(ctd.a);
                        if (iV2 != 0) {
                            if (iV2 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th2;
                        }
                        strP = null;
                    }
                    if (strP != null) {
                        try {
                            if (strP.equals(ApiProtocol.PARAM_JOIN_LINK)) {
                                try {
                                    strP3 = efi.p(tm9Var, null);
                                } catch (Throwable th3) {
                                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                                    Iterator it3 = vfe.a.iterator();
                                    while (it3.hasNext()) {
                                        ((qwa) it3.next()).getClass();
                                        qwa.a(th3);
                                    }
                                    int iV3 = az1.v(ctd.a);
                                    if (iV3 != 0) {
                                        if (iV3 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th3;
                                    }
                                    strP3 = null;
                                }
                            } else {
                                try {
                                    tm9Var.v();
                                } catch (Throwable th4) {
                                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                                    Iterator it4 = vfe.a.iterator();
                                    while (it4.hasNext()) {
                                        ((qwa) it4.next()).getClass();
                                        qwa.a(th4);
                                    }
                                    int iV4 = az1.v(ctd.a);
                                    if (iV4 != 0) {
                                        if (iV4 != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        throw th4;
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                                Iterator it5 = vfe.a.iterator();
                                while (it5.hasNext()) {
                                    ((qwa) it5.next()).getClass();
                                    qwa.a(th5);
                                }
                                int iV5 = az1.v(ctd.a);
                                if (iV5 != 0) {
                                    if (iV5 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th5;
                                }
                            } catch (Throwable th6) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                Iterator it6 = vfe.a.iterator();
                                while (it6.hasNext()) {
                                    ((qwa) it6.next()).getClass();
                                    qwa.a(th6);
                                }
                                int iV6 = az1.v(ctd.a);
                                if (iV6 != 0) {
                                    if (iV6 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th6;
                                }
                            }
                        }
                    }
                }
                return new q51(strP3 != null ? strP3 : "");
            default:
                if (!tm9Var.l()) {
                    return new ix3(null);
                }
                try {
                    iM2 = efi.m(tm9Var);
                } catch (Throwable th7) {
                    wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th7);
                    Iterator it7 = vfe.a.iterator();
                    while (it7.hasNext()) {
                        ((qwa) it7.next()).getClass();
                        qwa.a(th7);
                    }
                    int iV7 = az1.v(ctd.a);
                    if (iV7 != 0) {
                        if (iV7 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th7;
                    }
                    iM2 = 0;
                }
                if (iM2 == 0) {
                    return new ix3(null);
                }
                gx3 gx3VarG = null;
                for (int i2 = 0; i2 < iM2; i2++) {
                    try {
                        strP2 = efi.p(tm9Var, null);
                    } catch (Throwable th8) {
                        wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                        Iterator it8 = vfe.a.iterator();
                        while (it8.hasNext()) {
                            ((qwa) it8.next()).getClass();
                            qwa.a(th8);
                        }
                        int iV8 = az1.v(ctd.a);
                        if (iV8 != 0) {
                            if (iV8 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th8;
                        }
                        strP2 = null;
                    }
                    if (strP2 != null) {
                        if (strP2.equals("contact")) {
                            try {
                                gx3VarG = gx3.g(tm9Var);
                            } catch (Throwable th9) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th9);
                                Iterator it9 = vfe.a.iterator();
                                while (it9.hasNext()) {
                                    ((qwa) it9.next()).getClass();
                                    qwa.a(th9);
                                }
                                int iV9 = az1.v(ctd.a);
                                if (iV9 != 0) {
                                    if (iV9 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th9;
                                }
                                gx3VarG = null;
                            }
                        } else {
                            try {
                                tm9Var.v();
                            } catch (Throwable th10) {
                                wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                                Iterator it10 = vfe.a.iterator();
                                while (it10.hasNext()) {
                                    ((qwa) it10.next()).getClass();
                                    qwa.a(th10);
                                }
                                int iV10 = az1.v(ctd.a);
                                if (iV10 != 0) {
                                    if (iV10 != 1) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw th10;
                                }
                            }
                        }
                    }
                }
                return new ix3(gx3VarG);
        }
    }

    @Override // defpackage.sy2
    public th3 G() {
        return Z;
    }

    @Override // defpackage.sl3
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (cl3 cl3Var : componentRegistrar.getComponents()) {
            String str = cl3Var.a;
            if (str != null) {
                cl3Var = new cl3(str, cl3Var.b, cl3Var.c, cl3Var.d, cl3Var.e, new i00(str, 14, cl3Var), cl3Var.g);
            }
            arrayList.add(cl3Var);
        }
        return arrayList;
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case 5:
                return vqa.i((List) obj);
            default:
                return (byte[]) obj;
        }
    }

    @Override // defpackage.be7
    public void b() {
    }

    @Override // defpackage.ey1
    public CamcorderProfile c(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    @Override // defpackage.pmb
    public Object d() {
        throw new RuntimeException("No update");
    }

    @Override // defpackage.jn8
    public Object e(pub pubVar) {
        return Integer.valueOf(pubVar.T0);
    }

    @Override // defpackage.be7
    public void f() {
    }

    @Override // defpackage.sy2
    public int g(int i) {
        r6i r6iVar = t0;
        t6i t6iVar = r6iVar.c;
        q6i q6iVar = r6iVar.a;
        s6i s6iVar = r6iVar.b;
        u6i u6iVar = r6iVar.d;
        wcg wcgVar = s0;
        adg adgVar = wcgVar.c;
        tcg tcgVar = wcgVar.a;
        ddg ddgVar = wcgVar.d;
        xcg xcgVar = wcgVar.b;
        th3 th3Var = Z;
        oi3 oi3Var = th3Var.f;
        bi3 bi3Var = th3Var.d;
        vh3 vh3Var = th3Var.c;
        hg3 hg3Var = th3Var.a;
        qi3 qi3Var = th3Var.g;
        ji3 ji3Var = th3Var.e;
        kg3 kg3Var = th3Var.b;
        if (i == vuc.chat_common_action_background_error) {
            return hg3Var.a.a;
        }
        if (i == vuc.chat_common_action_background_neutral) {
            return hg3Var.a.b;
        }
        if (i == vuc.chat_common_action_background_themed) {
            return hg3Var.a.c;
        }
        if (i == vuc.chat_common_action_background_themedFade) {
            return hg3Var.a.d;
        }
        if (i == vuc.chat_common_action_icon_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_action_icon_neutral) {
            return hg3Var.b.a;
        }
        if (i == vuc.chat_common_action_icon_neutralSecondary) {
            return hg3Var.b.b;
        }
        if (i == vuc.chat_common_action_icon_themedFade) {
            return hg3Var.b.c;
        }
        if (i == vuc.chat_common_background_accent) {
            return kg3Var.e;
        }
        if (i == vuc.chat_common_background_capsule) {
            return kg3Var.f;
        }
        if (i == vuc.chat_common_background_capsuleOutside) {
            return kg3Var.g;
        }
        if (i == vuc.chat_common_background_capsuleSecondary) {
            return kg3Var.h;
        }
        if (i == vuc.chat_common_background_chatFAB) {
            return kg3Var.i;
        }
        if (i == vuc.chat_common_background_contrastFloatingSecondary) {
            return kg3Var.j;
        }
        if (i == vuc.chat_common_background_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_background_neutral) {
            return kg3Var.k;
        }
        if (i == vuc.chat_common_background_neutralFade) {
            return 1543503872;
        }
        if (i == vuc.chat_common_background_neutralFadeSecondary) {
            return kg3Var.l;
        }
        if (i == vuc.chat_common_background_neutralFadeTertiary) {
            return kg3Var.m;
        }
        if (i == vuc.chat_common_background_neutralThemed) {
            return kg3Var.n;
        }
        if (i == vuc.chat_common_background_overlay) {
            return kg3Var.o;
        }
        if (i == vuc.chat_common_background_overlayHard) {
            return kg3Var.p;
        }
        if (i == vuc.chat_common_background_overlaySecondary) {
            return kg3Var.q;
        }
        if (i == vuc.chat_common_background_pattern) {
            return kg3Var.r;
        }
        if (i == vuc.chat_common_background_searchHighlight) {
            return kg3Var.s;
        }
        if (i == vuc.chat_common_background_stickerBlank) {
            return kg3Var.t;
        }
        if (i == vuc.chat_common_background_surfaceGround) {
            return kg3Var.u;
        }
        if (i == vuc.chat_common_background_timelineActive) {
            return -1191182337;
        }
        if (i == vuc.chat_common_background_timelinePassive) {
            return 1392508927;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep1) {
            return kg3Var.a.a;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep2) {
            return kg3Var.a.b;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep3) {
            return kg3Var.a.c;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep4) {
            return kg3Var.a.d;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep5) {
            return kg3Var.a.e;
        }
        if (i == vuc.chat_common_background_chatBackground_additionalStep6) {
            return kg3Var.a.f;
        }
        if (i == vuc.chat_common_background_chatBackground_backgroundStep1) {
            return kg3Var.a.g;
        }
        if (i == vuc.chat_common_background_chatBackground_backgroundStep2) {
            return kg3Var.a.h;
        }
        if (i == vuc.chat_common_background_chatBackground_patternColor) {
            return kg3Var.a.i;
        }
        if (i == vuc.chat_common_background_chatBackground_patternGradientStep1) {
            return kg3Var.a.j;
        }
        if (i == vuc.chat_common_background_chatBackground_patternGradientStep2) {
            return kg3Var.a.k;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep1) {
            return kg3Var.a.l;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep2) {
            return kg3Var.a.m;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep3) {
            return kg3Var.a.n;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep4) {
            return kg3Var.a.o;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep5) {
            return kg3Var.a.p;
        }
        if (i == vuc.chat_common_background_chatBackground_patternStep6) {
            return kg3Var.a.q;
        }
        if (i == vuc.chat_common_background_fileType_archiveBadge) {
            return -6543440;
        }
        if (i == vuc.chat_common_background_fileType_archiveBkg) {
            return kg3Var.b.a;
        }
        if (i == vuc.chat_common_background_fileType_archiveElement) {
            return kg3Var.b.b;
        }
        if (i == vuc.chat_common_background_fileType_archiveIcon) {
            return kg3Var.b.c;
        }
        if (i == vuc.chat_common_background_fileType_background) {
            return kg3Var.b.d;
        }
        if (i == vuc.chat_common_background_fileType_dataBadge) {
            return -15697601;
        }
        if (i == vuc.chat_common_background_fileType_dataBkg) {
            return kg3Var.b.e;
        }
        if (i == vuc.chat_common_background_fileType_dataElement) {
            return kg3Var.b.f;
        }
        if (i == vuc.chat_common_background_fileType_dataIcon) {
            return kg3Var.b.g;
        }
        if (i == vuc.chat_common_background_fileType_imageBadge) {
            return kg3Var.b.h;
        }
        if (i == vuc.chat_common_background_fileType_imageBkg) {
            return kg3Var.b.i;
        }
        if (i == vuc.chat_common_background_fileType_imageElement) {
            return kg3Var.b.j;
        }
        if (i == vuc.chat_common_background_fileType_imageIcon) {
            return kg3Var.b.k;
        }
        if (i == vuc.chat_common_background_fileType_musicBadge) {
            return kg3Var.b.l;
        }
        if (i == vuc.chat_common_background_fileType_musicBkg) {
            return kg3Var.b.m;
        }
        if (i == vuc.chat_common_background_fileType_musicElement) {
            return kg3Var.b.n;
        }
        if (i == vuc.chat_common_background_fileType_musicIcon) {
            return kg3Var.b.o;
        }
        if (i == vuc.chat_common_background_fileType_presentationBadge) {
            return kg3Var.b.p;
        }
        if (i == vuc.chat_common_background_fileType_presentationBkg) {
            return kg3Var.b.q;
        }
        if (i == vuc.chat_common_background_fileType_presentationElement) {
            return kg3Var.b.r;
        }
        if (i == vuc.chat_common_background_fileType_presentationIcon) {
            return kg3Var.b.s;
        }
        if (i == vuc.chat_common_background_fileType_programBadge) {
            return kg3Var.b.t;
        }
        if (i == vuc.chat_common_background_fileType_programBkg) {
            return kg3Var.b.u;
        }
        if (i == vuc.chat_common_background_fileType_programElement) {
            return kg3Var.b.v;
        }
        if (i == vuc.chat_common_background_fileType_programIcon) {
            return kg3Var.b.w;
        }
        if (i == vuc.chat_common_background_fileType_textBadge) {
            return -14983490;
        }
        if (i == vuc.chat_common_background_fileType_textBkg) {
            return kg3Var.b.x;
        }
        if (i == vuc.chat_common_background_fileType_textElement) {
            return kg3Var.b.y;
        }
        if (i == vuc.chat_common_background_fileType_textIcon) {
            return kg3Var.b.z;
        }
        if (i == vuc.chat_common_background_fileType_unknownBadge) {
            return kg3Var.b.A;
        }
        if (i == vuc.chat_common_background_fileType_unknownBkg) {
            return kg3Var.b.B;
        }
        if (i == vuc.chat_common_background_fileType_unknownElement) {
            return kg3Var.b.C;
        }
        if (i == vuc.chat_common_background_fileType_unknownIcon) {
            return kg3Var.b.D;
        }
        if (i == vuc.chat_common_background_fileType_videoBadge) {
            return kg3Var.b.E;
        }
        if (i == vuc.chat_common_background_fileType_videoBkg) {
            return kg3Var.b.F;
        }
        if (i == vuc.chat_common_background_fileType_videoElement) {
            return kg3Var.b.G;
        }
        if (i == vuc.chat_common_background_fileType_videoIcon) {
            return kg3Var.b.H;
        }
        if (i == vuc.chat_common_background_skeleton_bubbleGradientPrimary_staticBackground) {
            return kg3Var.c.a.b;
        }
        if (i == vuc.chat_common_background_skeleton_bubbleGradientSecondary_staticBackground) {
            return kg3Var.c.b.b;
        }
        if (i == vuc.chat_common_background_skeleton_stickerPrimary_baseGradient_staticBackground) {
            return kg3Var.c.c.a.b;
        }
        if (i == vuc.chat_common_background_skeleton_stickerSecondary_baseGradient_staticBackground) {
            return kg3Var.c.d.a.b;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRBackground) {
            return kg3Var.d.b;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRStep1) {
            return kg3Var.d.c;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRStep2) {
            return kg3Var.d.d;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRStep3) {
            return kg3Var.d.e;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_qRStep4) {
            return kg3Var.d.f;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_strokeFadeStep1) {
            return kg3Var.d.g;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_strokeFadeStep2) {
            return kg3Var.d.h;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_strokeStep1) {
            return kg3Var.d.i;
        }
        if (i == vuc.chat_common_background_systemBubbleGradient_strokeStep2) {
            return kg3Var.d.j;
        }
        if (i == vuc.chat_common_icon_accent) {
            return vh3Var.a;
        }
        if (i == vuc.chat_common_icon_accentContrast) {
            return vh3Var.b;
        }
        if (i == vuc.chat_common_icon_capsule || i == vuc.chat_common_icon_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_icon_negative) {
            return vh3Var.c;
        }
        if (i == vuc.chat_common_icon_secondary) {
            return vh3Var.d;
        }
        if (i == vuc.chat_common_icon_themed) {
            return vh3Var.e;
        }
        if (i == vuc.chat_common_icon_verificationCapsule) {
            return vh3Var.f;
        }
        if (i == vuc.chat_common_shadows_elevation2_primary) {
            return bi3Var.a.a;
        }
        if (i == vuc.chat_common_shadows_elevation2_secondary) {
            return bi3Var.a.b;
        }
        if (i == vuc.chat_common_shadows_topBar_color) {
            return bi3Var.b.a;
        }
        if (i == vuc.chat_common_shadows_writeBar_color) {
            return bi3Var.c.a;
        }
        if (i == vuc.chat_common_states_background_active_neutralFadeTertiary) {
            return ji3Var.a.a.b;
        }
        if (i == vuc.chat_common_states_background_active_action_themed) {
            return ji3Var.a.a.a.a;
        }
        if (i == vuc.chat_common_states_background_disabled_accent) {
            return ji3Var.a.b.a;
        }
        if (i == vuc.chat_common_states_background_disabled_neutralFadeSecondary) {
            return ji3Var.a.b.b;
        }
        if (i == vuc.chat_common_states_background_disabled_neutralThemed) {
            return ji3Var.a.b.c;
        }
        if (i == vuc.chat_common_states_icon_disabled_negative) {
            return ji3Var.b.a.a;
        }
        if (i == vuc.chat_common_states_icon_disabled_themed) {
            return ji3Var.b.a.b;
        }
        if (i == vuc.chat_common_states_text_disabled_contrast) {
            return ji3Var.c.a.a;
        }
        if (i == vuc.chat_common_states_text_disabled_contrastStatic) {
            return ji3Var.c.a.b;
        }
        if (i == vuc.chat_common_states_text_disabled_negative) {
            return ji3Var.c.a.c;
        }
        if (i == vuc.chat_common_states_text_disabled_primary) {
            return ji3Var.c.a.d;
        }
        if (i == vuc.chat_common_states_text_disabled_themed) {
            return ji3Var.c.a.e;
        }
        if (i == vuc.chat_common_stroke_contrast) {
            return oi3Var.b;
        }
        if (i == vuc.chat_common_stroke_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_stroke_glass) {
            return oi3Var.c;
        }
        if (i == vuc.chat_common_stroke_separator_primary) {
            return oi3Var.a.a;
        }
        if (i == vuc.chat_common_stroke_separator_secondary) {
            return oi3Var.a.b;
        }
        if (i == vuc.chat_common_text_capsule) {
            return qi3Var.a;
        }
        if (i == vuc.chat_common_text_capsuleSecondary) {
            return qi3Var.b;
        }
        if (i == vuc.chat_common_text_contrast) {
            return qi3Var.c;
        }
        if (i == vuc.chat_common_text_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_common_text_fileType) {
            return -520093697;
        }
        if (i == vuc.chat_common_text_negative) {
            return qi3Var.d;
        }
        if (i == vuc.chat_common_text_primary) {
            return qi3Var.e;
        }
        if (i == vuc.chat_common_text_secondary) {
            return qi3Var.f;
        }
        if (i == vuc.chat_common_text_tertiary) {
            return qi3Var.g;
        }
        if (i == vuc.chat_common_text_themed) {
            return qi3Var.h;
        }
        if (i == vuc.chat_topbar_background_default_neutral) {
            return tcgVar.a.a;
        }
        if (i == vuc.chat_topbar_background_default_neutralFade) {
            return tcgVar.a.b;
        }
        if (i == vuc.chat_topbar_background_default_primary) {
            return -855638017;
        }
        if (i == vuc.chat_topbar_background_default_themed) {
            return tcgVar.a.c;
        }
        if (i == vuc.chat_topbar_background_default_topbar) {
            return tcgVar.a.d;
        }
        if (i == vuc.chat_topbar_background_disabled_neutral) {
            return tcgVar.b.a;
        }
        if (i == vuc.chat_topbar_background_disabled_neutralFade) {
            return tcgVar.b.b;
        }
        if (i == vuc.chat_topbar_background_disabled_themed) {
            return tcgVar.b.c;
        }
        if (i == vuc.chat_topbar_icon_default_contrast) {
            return xcgVar.a.a;
        }
        if (i == vuc.chat_topbar_icon_default_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_topbar_icon_default_neutralFade) {
            return xcgVar.a.b;
        }
        if (i == vuc.chat_topbar_icon_default_primary) {
            return xcgVar.a.c;
        }
        if (i == vuc.chat_topbar_icon_default_quaternary) {
            return xcgVar.a.d;
        }
        if (i == vuc.chat_topbar_icon_default_secondary) {
            return xcgVar.a.e;
        }
        if (i == vuc.chat_topbar_icon_default_tertiary) {
            return xcgVar.a.f;
        }
        if (i == vuc.chat_topbar_icon_default_themed) {
            return xcgVar.a.g;
        }
        if (i == vuc.chat_topbar_icon_disabled_contrast) {
            return xcgVar.b.a;
        }
        if (i == vuc.chat_topbar_icon_disabled_contrastStatic) {
            return xcgVar.b.b;
        }
        if (i == vuc.chat_topbar_icon_disabled_negative) {
            return xcgVar.b.c;
        }
        if (i == vuc.chat_topbar_icon_disabled_neutralFade) {
            return xcgVar.b.d;
        }
        if (i == vuc.chat_topbar_icon_disabled_primary) {
            return xcgVar.b.e;
        }
        if (i == vuc.chat_topbar_icon_disabled_quaternary) {
            return xcgVar.b.f;
        }
        if (i == vuc.chat_topbar_icon_disabled_secondary) {
            return xcgVar.b.g;
        }
        if (i == vuc.chat_topbar_icon_disabled_tertiary) {
            return xcgVar.b.h;
        }
        if (i == vuc.chat_topbar_icon_disabled_themed) {
            return xcgVar.b.i;
        }
        if (i == vuc.chat_topbar_stroke_separator_default_primary) {
            return adgVar.a.a.a;
        }
        if (i == vuc.chat_topbar_stroke_separator_default_secondary) {
            return adgVar.a.a.b;
        }
        if (i == vuc.chat_topbar_text_default_contrast) {
            return ddgVar.a.a;
        }
        if (i == vuc.chat_topbar_text_default_contrastStatic) {
            return -1;
        }
        if (i == vuc.chat_topbar_text_default_primary) {
            return ddgVar.a.b;
        }
        if (i == vuc.chat_topbar_text_default_secondary) {
            return ddgVar.a.c;
        }
        if (i == vuc.chat_topbar_text_default_themed) {
            return ddgVar.a.d;
        }
        if (i == vuc.chat_topbar_text_disabled_contrast) {
            return ddgVar.b.a;
        }
        if (i == vuc.chat_topbar_text_disabled_contrastStatic) {
            return ddgVar.b.b;
        }
        if (i == vuc.chat_topbar_text_disabled_primary) {
            return ddgVar.b.c;
        }
        if (i == vuc.chat_topbar_text_disabled_secondary) {
            return ddgVar.b.d;
        }
        if (i == vuc.chat_topbar_text_disabled_themed) {
            return ddgVar.b.e;
        }
        if (i == vuc.chat_writebar_background_emojiArea) {
            return q6iVar.a;
        }
        if (i == vuc.chat_writebar_background_input) {
            return q6iVar.b;
        }
        if (i == vuc.chat_writebar_background_neutralFade) {
            return q6iVar.c;
        }
        if (i == vuc.chat_writebar_background_surface) {
            return q6iVar.d;
        }
        if (i == vuc.chat_writebar_icon_neutral) {
            return s6iVar.a;
        }
        if (i == vuc.chat_writebar_icon_neutralSecondary) {
            return s6iVar.b;
        }
        if (i == vuc.chat_writebar_icon_neutralTertiary) {
            return s6iVar.c;
        }
        if (i == vuc.chat_writebar_icon_themed) {
            return s6iVar.d;
        }
        if (i == vuc.chat_writebar_icon_verificationReplyTo) {
            return s6iVar.e;
        }
        if (i == vuc.chat_writebar_stroke_areaSeparator) {
            return t6iVar.a;
        }
        if (i == vuc.chat_writebar_stroke_input) {
            return t6iVar.b;
        }
        if (i == vuc.chat_writebar_stroke_themed) {
            return t6iVar.c;
        }
        if (i == vuc.chat_writebar_text_input) {
            return u6iVar.a;
        }
        if (i == vuc.chat_writebar_text_inputMDLink) {
            return u6iVar.b;
        }
        if (i == vuc.chat_writebar_text_inputPlaceholder) {
            return u6iVar.c;
        }
        if (i == vuc.chat_writebar_text_primary) {
            return u6iVar.d;
        }
        if (i == vuc.chat_writebar_text_replyMessage) {
            return u6iVar.e;
        }
        if (i == vuc.chat_writebar_text_replyTo) {
            return u6iVar.f;
        }
        if (i == vuc.chat_writebar_text_secondary) {
            return u6iVar.g;
        }
        if (i == vuc.chat_writebar_text_themed) {
            return u6iVar.h;
        }
        throw new IllegalArgumentException(ho7.f(i, "Unknown attr res passed "));
    }

    @Override // defpackage.sy2
    public yt0 i() {
        return X;
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        return taj.b((Executor) v6dVar.f(new fsc(o48.class, Executor.class)));
    }

    @Override // defpackage.sy2
    public r6i k() {
        return t0;
    }

    @Override // defpackage.be7
    public void l() {
    }

    @Override // defpackage.xmb
    public Object m(Uri uri, ve4 ve4Var) {
        return Long.valueOf(zxg.X(new BufferedReader(new InputStreamReader(ve4Var)).readLine()));
    }

    @Override // defpackage.wzg
    public long n(yeb yebVar) {
        yebVar.getIcon();
        return ipi.a(-1, yebVar.getIcon().k);
    }

    @Override // defpackage.hw8
    public jw8 o(gw8 gw8Var) {
        String string;
        if (xxg.a < 31) {
            return new dwf().o(gw8Var);
        }
        int iG = wz9.g(gw8Var.c.v0);
        switch (iG) {
            case ContentLengthStrategy.CHUNKED /* -2 */:
                string = "none";
                break;
            case -1:
                string = "unknown";
                break;
            case 0:
                string = "default";
                break;
            case 1:
                string = MediaStreamTrack.AUDIO_TRACK_KIND;
                break;
            case 2:
                string = MediaStreamTrack.VIDEO_TRACK_KIND;
                break;
            case 3:
                string = "text";
                break;
            case 4:
                string = "image";
                break;
            case 5:
                string = "metadata";
                break;
            case 6:
                string = "camera motion";
                break;
            default:
                if (iG < 10000) {
                    string = "?";
                    break;
                } else {
                    StringBuilder sb = new StringBuilder(20);
                    sb.append("custom (");
                    sb.append(iG);
                    sb.append(")");
                    string = sb.toString();
                    break;
                }
        }
        String strValueOf = String.valueOf(string);
        Log.i("DMCodecAdapterFactory", strValueOf.length() != 0 ? "Creating an asynchronous MediaCodec adapter for track type ".concat(strValueOf) : new String("Creating an asynchronous MediaCodec adapter for track type "));
        return new xo8(iG).o(gw8Var);
    }

    @Override // defpackage.ey1
    public boolean p(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    @Override // defpackage.ox7
    public Object parse(xx7 xx7Var) {
        if (xx7Var.peek() == 0) {
            return null;
        }
        xx7Var.v();
        return null;
    }

    @Override // defpackage.pmb
    public boolean q() {
        return false;
    }

    @Override // defpackage.sy2
    public yt0 r() {
        return Y;
    }

    @Override // defpackage.be7
    public void s() {
    }

    @Override // defpackage.pmb
    public Object t() {
        return null;
    }

    @Override // defpackage.sy2
    public wcg u() {
        return s0;
    }

    @Override // defpackage.f97
    public Uri v(String str) {
        if (!str.equals("api")) {
            throw new NoHttpApiEndpointException(str);
        }
        Uri uri = wm.a;
        return wm.a;
    }

    @Override // defpackage.be7
    public void w() {
    }

    @Override // defpackage.if9
    public double x(pf9 pf9Var) {
        int iOrdinal = pf9Var.ordinal();
        if (iOrdinal == 0) {
            return 0.5d;
        }
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 5) {
            return 1.0d;
        }
        op5.n("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", pf9Var);
        return 0.0d;
    }

    public uha(Context context, ona onaVar) {
        this.a = 25;
    }
}
