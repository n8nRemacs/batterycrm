package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Geocoder;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.calls.ui.ui.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.screens.media.ChatMediaListWidget;
import one.me.sdk.arch.Widget;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.messages.views.widgets.VideoInfoTextView;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class m3 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m3(Bundle bundle, Widget widget, int i) {
        this.a = i;
        this.c = bundle;
        this.b = widget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v76, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v37, types: [lf1] */
    /* JADX WARN: Type inference failed for: r6v49, types: [android.view.ViewGroup, rm2] */
    @Override // defpackage.cm6
    public final Object invoke() {
        int i;
        String string;
        mf1 mf1Var;
        String string2;
        int i2 = this.a;
        int i3 = 4;
        qqg qqgVar = qqg.a;
        k51 k51Var = null;
        lValueOf = null;
        Long lValueOf = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                AbstractPickerScreen abstractPickerScreen = (AbstractPickerScreen) obj2;
                yy7[] yy7VarArr = AbstractPickerScreen.s0;
                return new jxb(abstractPickerScreen.J0((Bundle) obj), abstractPickerScreen.z0(), abstractPickerScreen.C0(), (lzf) e03.a.getAccessor().c(8));
            case 1:
                return new Geocoder((Context) obj2, (Locale) ((bwf) obj).getValue());
            case 2:
                nwg nwgVar = new nwg((Context) obj2);
                nwgVar.setCallback(((ok) obj).t0);
                return nwgVar;
            case 3:
                ArrayList arrayList = (ArrayList) obj2;
                List list = (List) obj;
                j37 j37Var = (j37) ue3.I(arrayList);
                j37 j37Var2 = (j37) ue3.Q(arrayList);
                j37 j37Var3 = (j37) ue3.I(list);
                j37 j37Var4 = (j37) ue3.Q(list);
                return wmf.e("insertDataSourceResult: before iterate with insert, \n                        |first:" + (j37Var != null ? Long.valueOf(j37Var.getA()) : null) + ":" + (j37Var != null ? Long.valueOf(j37Var.getC()) : null) + ",\n                        |last:" + (j37Var2 != null ? Long.valueOf(j37Var2.getA()) : null) + ":" + (j37Var2 != null ? Long.valueOf(j37Var2.getC()) : null) + ",\n                        |firstInsertList:" + (j37Var3 != null ? Long.valueOf(j37Var3.getA()) : null) + ":" + (j37Var3 != null ? Long.valueOf(j37Var3.getC()) : null) + ",\n                        |lastInsertList:" + (j37Var4 != null ? Long.valueOf(j37Var4.getA()) : null) + ":" + (j37Var4 != null ? Long.valueOf(j37Var4.getC()) : null) + "\n                        |");
            case 4:
                hrb hrbVar = (hrb) obj2;
                l5c l5cVar = ((z7c) ((o80) obj).b.getValue()).b;
                l5cVar.getClass();
                List listK = l5cVar.k(PmsKey.f31chatvideoautoplayparallelcount);
                int[] iArrC0 = listK.isEmpty() ? age.c : ue3.c0(listK);
                if (iArrC0.length < 3) {
                    iArrC0 = age.c;
                }
                int iOrdinal = hrbVar.a.ordinal();
                if (iOrdinal == 0) {
                    i = iArrC0[0];
                } else if (iOrdinal == 1) {
                    i = iArrC0[1];
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = iArrC0[2];
                }
                return Integer.valueOf(i);
            case 5:
                em6 em6Var = (em6) obj2;
                n2 n2Var = (n2) obj;
                ViewGroup viewGroup = (ViewGroup) n2Var.b;
                View view = (View) em6Var.invoke((viewGroup != null ? viewGroup : null).getContext());
                n2Var.c0(view);
                return view;
            case 6:
                return new e0f((y6d) obj2, (z6d) obj);
            case 7:
                k01 k01Var = (k01) obj2;
                li liVar = (li) obj;
                rve rveVar = k01Var.f0;
                if (rveVar != null) {
                    k01Var.c.execute(new cj(k01Var, liVar, rveVar, 9));
                }
                return qqgVar;
            case 8:
                return new l2e(((k01) obj2).N0.j, (y8g) obj);
            case 9:
                ((i81) obj2).b.c((a81) obj);
                return qqgVar;
            case 10:
                Context context = (Context) obj2;
                TextView textView = new TextView(context);
                textView.setLayoutParams(new kt3(-2, -2));
                dpg.r.b(textView, t75.b);
                textView.setTextColor(a93.s0.B(textView).c.getText().g);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setText(m0b.A0);
                Drawable drawableB = r34.b(context, i0b.C);
                ArrayList arrayList2 = b6g.a;
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setVisibility(8);
                int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
                textView.setPadding(iD, iD, iD, iD);
                f8j.d(textView, 300L, new j6(i3, (i91) obj));
                return textView;
            case 11:
                Bundle bundle = (Bundle) obj;
                CallIncomingScreen callIncomingScreen = (CallIncomingScreen) obj2;
                v1a v1aVar = CallIncomingScreen.s0;
                long j = bundle.getLong("call_incoming_chat_id");
                String string3 = bundle.getString("call_incoming_name", "");
                String string4 = bundle.getString("call_incoming_avatar");
                boolean z = bundle.getBoolean("call_incoming_video");
                e51 e51Var = e51.a;
                return new mb1(z, j, string3, string4, (s41) e51Var.getAccessor().c(22), callIncomingScreen.a, e51Var.a(), (f7b) gm1.a.getAccessor().c(HttpStatus.SC_GONE), new mr1(callIncomingScreen.getContext()), (v21) e51Var.getAccessor().c(19), callIncomingScreen.b, fm1.b(), fm1.d());
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new kd1((md1) obj2, (k18) obj);
            case 13:
                Bundle bundle2 = (Bundle) obj;
                CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = (CallJoinLinkPreviewWidget) obj2;
                yy7[] yy7VarArr2 = CallJoinLinkPreviewWidget.A0;
                String string5 = bundle2.getString("call_join_link");
                if (string5 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                bsb bsbVar = callJoinLinkPreviewWidget.b;
                boolean z2 = bundle2.getBoolean("is_video_call", false);
                s2i s2iVar = callJoinLinkPreviewWidget.a;
                k18 k18Var = x4e.a;
                y4e y4eVar = y4e.a;
                enb enbVar = new enb(y4eVar.getAccessor().d(110), y4eVar.getAccessor().d(46), z, 15);
                k18 k18Var2 = fm1.a;
                gm1 gm1Var = gm1.a;
                return new he1(string5, enbVar, s2iVar, bsbVar, z2, gm1Var.getAccessor().d(79), fm1.e(), fm1.c(), gm1Var.getAccessor().d(123), gm1Var.getAccessor().d(150));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                Bundle bundle3 = (Bundle) obj;
                CallLinkInfoScreen callLinkInfoScreen = (CallLinkInfoScreen) obj2;
                k18 k18Var3 = callLinkInfoScreen.a;
                CallLinkInfoScreen.A0.getClass();
                if (bundle3 == null || (string = bundle3.getString("link_param", "")) == null) {
                    string = "";
                }
                if (bundle3 != null && bundle3.containsKey("id_param")) {
                    lValueOf = Long.valueOf(bundle3.getLong("id_param"));
                }
                if (lValueOf == null) {
                    mf1Var = new lf1(string);
                } else {
                    mf1Var = new mf1(lValueOf.longValue(), string, (bundle3 == null || (string2 = bundle3.getString("title_param", "")) == null) ? "" : string2, bundle3 != null ? bundle3.getBoolean("is_link_call") : false);
                }
                py0 py0Var = new py0(callLinkInfoScreen.getContext(), 5);
                u91 u91Var = u91.a;
                return new pf1(mf1Var, py0Var, new zw1(u91Var.getAccessor().d(186), k18Var3, u91Var.getAccessor().d(79)), new sw1(u91Var.getAccessor().d(49), k18Var3), (kj1) callLinkInfoScreen.X.getValue(), u91Var.getAccessor().d(109), u91Var.getAccessor().d(48));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                pf1 pf1Var = (pf1) obj2;
                CharSequence charSequence = (CharSequence) obj;
                ci5 ci5Var = pf1Var.v0;
                if (((cf1) pf1Var.t0.a.getValue()).h) {
                    xfh.r(ci5Var, new uc1(charSequence.toString()));
                } else {
                    ca1 ca1Var = ca1.c;
                    String string6 = charSequence.toString();
                    ca1Var.getClass();
                    xc0.l(":call-join-preview?link=".concat(string6), ci5Var);
                }
                return qqgVar;
            case 16:
                yy7[] yy7VarArr3 = CallMoreBottomSheet.C0;
                lg1 lg1VarValueOf = lg1.valueOf(((Bundle) obj).getString("open_type", "UNDEFINE"));
                wo1 wo1Var = (wo1) ((CallMoreBottomSheet) obj2).w0.getValue();
                k18 k18Var4 = fm1.a;
                gm1 gm1Var2 = gm1.a;
                return new tg1(lg1VarValueOf, wo1Var, fm1.b(), gm1Var2.getAccessor().d(460), fm1.a(), fm1.d(), gm1Var2.getAccessor().d(46), gm1Var2.getAccessor().d(508), fm1.c());
            case LangUtils.HASH_SEED /* 17 */:
                mh1 mh1Var = (mh1) obj2;
                zi1 zi1Var = (zi1) obj;
                h08 h08Var = mh1Var.E0;
                if (h08Var != null) {
                    View view2 = mh1Var.a;
                    mh1Var.g();
                    CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) h08Var.b;
                    yy7[] yy7VarArr4 = CallOpponentsListWidget.H0;
                    ci1 ci1VarE0 = callOpponentsListWidget.E0();
                    k51 k51VarB = ci1VarE0.c.b(zi1Var, null);
                    if (k51VarB != null) {
                        ((yx1) ci1VarE0.u0.getValue()).a(zi1Var.a, ((hw1) ((tv1) ci1VarE0.t0.getValue())).l().c, k51VarB.c);
                        k51Var = k51VarB;
                    }
                    if (k51Var != null) {
                        Point point = new Point(0, 0);
                        int[] iArr = new int[2];
                        view2.getLocationOnScreen(iArr);
                        int iQ = u45.q(18, vw4.d().getDisplayMetrics().density, (f6j.b(callOpponentsListWidget.getContext()) - iArr[0]) - (view2.getWidth() / 2));
                        int i4 = iArr[1];
                        point.x = iQ;
                        point.y = i4;
                        h6j.a(1).j().x(k51Var.a).f().q(iQ, i4).o(k51Var.b).build().u(callOpponentsListWidget);
                    }
                }
                return qqgVar;
            case 18:
                vq1.v((vq1) obj2, (bn8) obj);
                return qqgVar;
            case 19:
                return ur1.v((Context) obj2, (ur1) obj);
            case 20:
                owe oweVar = new owe((Context) obj2);
                nwe nweVar = oweVar.b;
                nweVar.d(false);
                oweVar.onThemeChanged(a93.s0.B((ju1) obj).c);
                mwe mweVar = nweVar.u0;
                yy7[] yy7VarArr5 = nwe.A0;
                mweVar.O(nweVar, yy7VarArr5[3], lwe.b);
                nweVar.v0.O(nweVar, yy7VarArr5[4], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                oweVar.d = -kti.d(70 * vw4.d().getDisplayMetrics().density);
                nweVar.c(kwe.b);
                oweVar.setAlpha(76);
                return oweVar;
            case 21:
                return new nv1((ur3) obj2, (sac) obj);
            case 22:
                ((ur3) obj2).e((tr3) ((bwf) obj).getValue());
                return qqgVar;
            case 23:
                return ((ve2) obj2).m0((ArrayList) obj);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                g60 g60Var = (g60) obj2;
                return new yj2(g60Var.a, g60Var.b, g60Var.c, (k18) obj, (Set) g60Var.d);
            case 25:
                ew5 ew5Var = new ew5((Context) obj2);
                ((il2) obj).I0.addView(ew5Var, new FrameLayout.LayoutParams(-1, -1));
                return ew5Var;
            case 26:
                Bundle bundle4 = (Bundle) obj;
                ChatMediaListWidget chatMediaListWidget = (ChatMediaListWidget) obj2;
                yy7[] yy7VarArr6 = ChatMediaListWidget.t0;
                long j2 = bundle4.getLong("chat_id");
                dn2 dn2VarA0 = chatMediaListWidget.A0();
                lcc lccVar = (lcc) fdc.a.getAccessor().c(608);
                long j3 = bundle4.getLong("chat_id");
                w5 w5Var = lccVar.a;
                return new jo2(j2, dn2VarA0, (kj1) chatMediaListWidget.o.getValue(), new hl2(j3, (tw0) w5Var.c(49), (lzf) w5Var.c(8)));
            case 27:
                ?? r6 = (rm2) obj;
                VideoInfoTextView videoInfoTextView = new VideoInfoTextView((Context) obj2, null, 6);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 8388693;
                float f = 4;
                layoutParams.setMarginEnd(kti.d(vw4.d().getDisplayMetrics().density * f));
                layoutParams.bottomMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
                if (videoInfoTextView.getParent() == null) {
                    r6.addView(videoInfoTextView, layoutParams);
                }
                return videoInfoTextView;
            case 28:
                jo2 jo2Var = (jo2) obj2;
                return svi.d(jo2Var.a, ((q2b) jo2Var.A()).b(), i84.b, new vn2(jo2Var, (yb9) obj, null));
            default:
                return new uj2((nh9) obj2, ((z7c) obj).e);
        }
    }

    public /* synthetic */ m3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
