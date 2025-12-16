package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import androidx.work.WorkRequest;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.richvector.internal.element.ClipPathElement;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class hk1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hk1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v143, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        yeb yebVar;
        os3 os3Var;
        JSONArray jSONArrayOptJSONArray;
        int i = 7;
        switch (this.a) {
            case 0:
                CallRateBottomSheet callRateBottomSheet = (CallRateBottomSheet) this.b;
                hs hsVar = callRateBottomSheet.C0;
                yy7[] yy7VarArr = CallRateBottomSheet.M0;
                yy7 yy7Var = yy7VarArr[0];
                String str = (String) hsVar.a(callRateBottomSheet);
                hs hsVar2 = callRateBottomSheet.D0;
                yy7 yy7Var2 = yy7VarArr[1];
                boolean zBooleanValue = ((Boolean) hsVar2.a(callRateBottomSheet)).booleanValue();
                hs hsVar3 = callRateBottomSheet.E0;
                yy7 yy7Var3 = yy7VarArr[2];
                boolean zBooleanValue2 = ((Boolean) hsVar3.a(callRateBottomSheet)).booleanValue();
                hs hsVar4 = callRateBottomSheet.F0;
                yy7 yy7Var4 = yy7VarArr[3];
                return new tk1(str, zBooleanValue, zBooleanValue2, (List) hsVar4.a(callRateBottomSheet));
            case 1:
                return new xr1((wo1) ((CallTopPanelWidget) this.b).a.getValue());
            case 2:
                return new o3(26, (qt1) this.b);
            case 3:
                r1e r1eVar = (r1e) ((z21) this.b).b;
                return Integer.valueOf((r1eVar.f || r1eVar.e) ? 4 : 6);
            case 4:
                CallWaitingRoomEventsWidget callWaitingRoomEventsWidget = (CallWaitingRoomEventsWidget) this.b;
                yy7[] yy7VarArr2 = CallWaitingRoomEventsWidget.u0;
                return new rjh(callWaitingRoomEventsWidget.getContext());
            case 5:
                CameraxCameraApiView cameraxCameraApiView = (CameraxCameraApiView) this.b;
                int i2 = CameraxCameraApiView.u0;
                x38 x38VarA = zpi.a(cameraxCameraApiView.d.a);
                int i3 = s65.d;
                return new xk6(x38VarA, v9j.h(10, y65.SECONDS), new gf1(i), new gf1(i));
            case 6:
                y6c[] y6cVarArr = ((m72) this.b).a;
                ArrayList arrayList = new ArrayList(y6cVarArr.length);
                for (y6c y6cVar : y6cVarArr) {
                    arrayList.add(String.valueOf(y6cVar.b()));
                }
                return new c1f("chained:".concat(ue3.N(ue3.W(arrayList), null, null, null, null, 63)));
            case 7:
                ChangeOwnerScreen changeOwnerScreen = (ChangeOwnerScreen) this.b;
                yy7[] yy7VarArr3 = ChangeOwnerScreen.t0;
                long jY0 = changeOwnerScreen.y0();
                fdc fdcVar = fdc.a;
                return new k92(jY0, fdcVar.b(), fdcVar.d(), fdcVar.a(), fdcVar.e());
            case 8:
                return xi2.v((xi2) this.b);
            case 9:
                ChatMediaDownloadBottomSheet chatMediaDownloadBottomSheet = (ChatMediaDownloadBottomSheet) this.b;
                yy7[] yy7VarArr4 = ChatMediaDownloadBottomSheet.I0;
                r00 r00Var = new r00();
                r00Var.c = kti.d(52 * vw4.d().getDisplayMetrics().density);
                r00Var.b = true;
                r00Var.invalidateSelf();
                yeb yebVarC0 = chatMediaDownloadBottomSheet.C0();
                if (yebVarC0 == null) {
                    yebVarC0 = a93.s0.x(chatMediaDownloadBottomSheet.getContext()).k();
                }
                r00Var.b(yebVarC0.getIcon().f);
                r00Var.e = true;
                r00Var.invalidateSelf();
                return r00Var;
            case 10:
                jl2 jl2Var = (jl2) this.b;
                int i4 = yud.W;
                int i5 = a93.s0.y(jl2Var).getIcon().h;
                Drawable drawableMutate = r34.b(jl2Var.getContext(), i4).mutate();
                cei.k(drawableMutate, i5);
                return drawableMutate;
            case 11:
                jo2 jo2Var = (jo2) this.b;
                int iOrdinal = jo2Var.c.ordinal();
                if (iOrdinal == 0) {
                    s00 s00Var = s00.UNKNOWN;
                    return gke.h("PHOTO", "VIDEO");
                }
                if (iOrdinal == 1) {
                    s00 s00Var2 = s00.UNKNOWN;
                    return Collections.singleton("FILE");
                }
                if (iOrdinal == 2) {
                    s00 s00Var3 = s00.UNKNOWN;
                    return Collections.singleton("SHARE");
                }
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (jo2Var.z0.x()) {
                    s00 s00Var4 = s00.UNKNOWN;
                    return gke.h("AUDIO", "VIDEO_MSG");
                }
                s00 s00Var5 = s00.UNKNOWN;
                return Collections.singleton("AUDIO");
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return Boolean.valueOf(((es2) this.b) == es2.DEFAULT);
            case 13:
                return Integer.valueOf(a93.s0.y((du2) this.b).getText().j);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                gu5 gu5Var = (gu5) ((zx2) this.b).z();
                Boolean bool = (Boolean) gu5Var.r.D(gu5Var, gu5.S[7]);
                bool.booleanValue();
                return bool;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                py2 py2Var = (py2) this.b;
                int i6 = s65.d;
                l5c l5cVar = (l5c) py2Var.b;
                l5cVar.getClass();
                int iM = (int) l5cVar.m(PmsKey.f142subscriptiontimeoutseconds, 60);
                long jH = v9j.h(iM != 0 ? iM : 60, y65.SECONDS);
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, "py2", a9h.e("#", py2Var.a, " timeout = ", s65.n(jH)), null);
                    }
                }
                return new s65(jH);
            case 16:
                return ClipPathElement.path_delegate$lambda$0((ClipPathElement) this.b);
            case LangUtils.HASH_SEED /* 17 */:
                sf3 sf3Var = (sf3) this.b;
                return to8.d(new imb(p1g.a, Integer.valueOf(sf3Var.a)), new imb(p1g.b, Integer.valueOf(sf3Var.b)), new imb(p1g.c, Integer.valueOf(sf3Var.c)), new imb(p1g.d, Integer.valueOf(sf3Var.e)), new imb(p1g.o, Integer.valueOf(sf3Var.f)), new imb(p1g.X, Integer.valueOf(sf3Var.h)), new imb(p1g.Y, Integer.valueOf(sf3Var.j)), new imb(p1g.Z, Integer.valueOf(sf3Var.k)), new imb(p1g.s0, Integer.valueOf(sf3Var.l)), new imb(p1g.t0, Integer.valueOf(sf3Var.m)), new imb(p1g.u0, Integer.valueOf(sf3Var.n)), new imb(p1g.v0, Integer.valueOf(sf3Var.o)), new imb(p1g.w0, Integer.valueOf(sf3Var.p)), new imb(p1g.x0, Integer.valueOf(sf3Var.q)), new imb(p1g.y0, Integer.valueOf(sf3Var.r)), new imb(p1g.z0, Integer.valueOf(sf3Var.s)), new imb(p1g.A0, Integer.valueOf(sf3Var.t)), new imb(p1g.B0, Integer.valueOf(sf3Var.u)), new imb(p1g.C0, Integer.valueOf(sf3Var.v)), new imb(p1g.D0, Integer.valueOf(sf3Var.w)), new imb(p1g.E0, Integer.valueOf(sf3Var.x)), new imb(p1g.F0, Integer.valueOf(sf3Var.y)), new imb(p1g.G0, Integer.valueOf(sf3Var.z)), new imb(p1g.H0, Integer.valueOf(sf3Var.A)), new imb(p1g.I0, Integer.valueOf(sf3Var.B)), new imb(p1g.J0, Integer.valueOf(sf3Var.C)), new imb(p1g.K0, Integer.valueOf(sf3Var.D)), new imb(p1g.L0, Integer.valueOf(sf3Var.E)), new imb(p1g.M0, Integer.valueOf(sf3Var.F)), new imb(p1g.N0, Integer.valueOf(sf3Var.G)), new imb(p1g.O0, Integer.valueOf(sf3Var.H)), new imb(p1g.P0, Integer.valueOf(sf3Var.I)), new imb(p1g.Q0, Integer.valueOf(sf3Var.J)), new imb(p1g.R0, Integer.valueOf(sf3Var.K)), new imb(p1g.S0, sf3Var.L), new imb(p1g.T0, sf3Var.M), new imb(p1g.U0, sf3Var.N), new imb(p1g.V0, sf3Var.O), new imb(p1g.W0, sf3Var.P), new imb(p1g.X0, Integer.valueOf(sf3Var.Q)), new imb(p1g.Y0, Integer.valueOf(sf3Var.R)), new imb(p1g.Z0, Integer.valueOf(sf3Var.S)));
            case 18:
                gu5 gu5Var2 = (gu5) ((rt5) ((gk3) this.b).Z.getValue());
                gu5Var2.getClass();
                return Boolean.valueOf(gu5Var2.j(PmsKey.f136serversidecomplainsenabled, false));
            case 19:
                ConfirmAddOpponentToCallBottomSheet confirmAddOpponentToCallBottomSheet = (ConfirmAddOpponentToCallBottomSheet) this.b;
                int i7 = ConfirmAddOpponentToCallBottomSheet.E0;
                return kk4.j(confirmAddOpponentToCallBottomSheet.getContext());
            case 20:
                ConfirmationBottomSheet confirmationBottomSheet = (ConfirmationBottomSheet) this.b;
                yy7[] yy7VarArr5 = ConfirmationBottomSheet.L0;
                String string = confirmationBottomSheet.getArgs().getString("theme_key");
                if (string == null || (yebVar = (yeb) ((afb) a93.s0.x(confirmationBottomSheet.getContext()).c).c.get(string)) == null) {
                    return null;
                }
                return yebVar;
            case 21:
                fr3 fr3Var = (fr3) this.b;
                String str2 = fr3Var.h;
                String str3 = fr3Var.f;
                String str4 = fr3Var.c;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
                printWriter.write("GET ");
                printWriter.write(str2);
                printWriter.write(" HTTP/1.1\n");
                printWriter.write("Host: ");
                printWriter.write(str3);
                printWriter.write("\n");
                printWriter.write("Content-Type: application/x-binary; charset=x-user-defined\n");
                printWriter.write("Content-Disposition: attachment; fileName=\"" + str4 + "\"\n");
                printWriter.write("Content-Length: 0\n");
                printWriter.write("X-Uploading-Mode: parallel\n");
                printWriter.write("Connection: keep-alive\n");
                printWriter.write("\n");
                printWriter.flush();
                return byteArrayOutputStream.toByteArray();
            case 22:
                return Integer.valueOf(Integer.parseInt(((nr3) this.b).b));
            case 23:
                qs3 qs3Var = (qs3) this.b;
                bwf bwfVar = (bwf) qs3Var.X;
                l5c l5cVar2 = (l5c) ((age) qs3Var.b);
                l5cVar2.getClass();
                JSONObject jSONObjectD = l5cVar2.d(PmsKey.f35conntimeouts);
                if (jSONObjectD == null) {
                    return (Map) bwfVar.getValue();
                }
                EnumMap enumMap = new EnumMap((Map) bwfVar.getValue());
                Iterator<String> itKeys = jSONObjectD.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Integer numH = cnf.h(next);
                    if (numH != null && (os3Var = (os3) ue3.J(numH.intValue(), os3.Z)) != null && (jSONArrayOptJSONArray = jSONObjectD.optJSONArray(next)) != null && jSONArrayOptJSONArray.length() != 0) {
                        int length = jSONArrayOptJSONArray.length();
                        long[] jArr = new long[length];
                        for (int i8 = 0; i8 < length; i8++) {
                            jArr[i8] = jSONArrayOptJSONArray.optLong(i8, WorkRequest.MIN_BACKOFF_MILLIS);
                        }
                        enumMap.put((EnumMap) os3Var, (os3) jArr);
                    }
                }
                return enumMap;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return d7j.a((z74) ((iy3) this.b).n.getValue());
            case 25:
                return Integer.valueOf(a93.s0.y((l04) this.b).getText().j);
            case 26:
                ContactsPickerScreen contactsPickerScreen = (ContactsPickerScreen) this.b;
                yy7[] yy7VarArr6 = ContactsPickerScreen.v0;
                int i9 = xz7.a;
                if (xz7.b(xz7.c)) {
                    api.c(contactsPickerScreen);
                }
                return qqg.a;
            case 27:
                l24 l24Var = (l24) this.b;
                qv3 qv3Var = l24Var.a;
                ku3 ku3VarI = qv3Var.i(qv3Var.g.a.s(), false);
                return ku3VarI == null ? l24Var.a(((Number) l24Var.b.getValue()).longValue()) : ku3VarI;
            case 28:
                q24 q24Var = (q24) this.b;
                tcf tcfVarA = ucf.a(null);
                gw0.w(new g56(gw0.k(tcfVarA, 200L), new zr0(2, q24Var, q24.class, "startSearch", "startSearch(Ljava/lang/String;)V", 4, 17), 1), q24Var.a);
                return tcfVarA;
            default:
                g34 g34Var = (g34) this.b;
                float[] fArr = new float[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    fArr[i10] = g34Var.t0;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                shapeDrawable.getPaint().setStrokeWidth(vw4.d().getDisplayMetrics().density * 0.5f);
                shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
                return shapeDrawable;
        }
    }
}
