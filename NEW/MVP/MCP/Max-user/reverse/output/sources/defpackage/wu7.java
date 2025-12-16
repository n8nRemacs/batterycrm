package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.android.join.JoinChatWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet;
import one.me.mediapicker.MediaPickerScreen;
import one.me.members.list.MembersListWidget;
import one.me.messages.settings.MessagesSettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class wu7 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wu7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i;
        joc jocVar;
        Display.HdrCapabilities hdrCapabilities;
        int[] supportedHdrTypes;
        int i2 = 3;
        int i3 = 1;
        switch (this.a) {
            case 0:
                JoinChatWidget joinChatWidget = (JoinChatWidget) this.b;
                yy7[] yy7VarArr = JoinChatWidget.B0;
                if (joinChatWidget.getActivity() instanceof ksd) {
                    joinChatWidget.getRouter().C();
                } else {
                    Activity activity = joinChatWidget.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
                return qqg.a;
            case 1:
                KeyboardEmojiWidget keyboardEmojiWidget = (KeyboardEmojiWidget) this.b;
                int iIntValue = ((Integer) obj).intValue();
                yy7[] yy7VarArr2 = KeyboardEmojiWidget.Z;
                keyboardEmojiWidget.y0().E0();
                uc5 uc5Var = (uc5) keyboardEmojiWidget.a.getValue();
                uc5Var.getClass();
                uc5Var.u(iIntValue, new p8(uc5Var, iIntValue, i2));
                return qqg.a;
            case 2:
                KeyboardStickersWidget keyboardStickersWidget = (KeyboardStickersWidget) this.b;
                long jLongValue = ((Long) obj).longValue();
                yy7[] yy7VarArr3 = KeyboardStickersWidget.s0;
                keyboardStickersWidget.y0().E0();
                ikf ikfVarA0 = keyboardStickersWidget.A0();
                ikfVarA0.getClass();
                ikfVarA0.w(jLongValue, new k03(ikfVarA0, jLongValue, i2));
                return qqg.a;
            case 3:
                LinkInterceptorWidget linkInterceptorWidget = (LinkInterceptorWidget) this.b;
                int i4 = LinkInterceptorWidget.d;
                if (linkInterceptorWidget.getActivity() instanceof ksd) {
                    linkInterceptorWidget.getRouter().C();
                } else {
                    Activity activity2 = linkInterceptorWidget.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
                return qqg.a;
            case 4:
                h88 h88Var = (h88) this.b;
                if (obj instanceof d88) {
                    ((d88) obj).a = h88Var.a;
                } else {
                    h88Var.d(obj);
                }
                return qqg.a;
            case 5:
                ((ylc) this.b).invoke((CharSequence) obj);
                return qqg.a;
            case 6:
                List list = (List) ((bj7) ((sd8) this.b).c).z0.get(((vo6) obj).a);
                return list == null ? hd5.a : list;
            case 7:
                try {
                    return (CharSequence) ((tm6) this.b).apply(obj);
                } catch (Throwable unused) {
                    return "";
                }
            case 8:
                si8 si8Var = (si8) this.b;
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    si8Var.a();
                }
                return qqg.a;
            case 9:
                ((xi8) this.b).e.set(false);
                return qqg.a;
            case 10:
                LogsViewerScreen logsViewerScreen = (LogsViewerScreen) this.b;
                yy7[] yy7VarArr4 = LogsViewerScreen.X;
                jva onBackPressedDispatcher = logsViewerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return qqg.a;
            case 11:
                return Boolean.valueOf(!((dp8) this.b).e.d(((MenuItem) obj).getItemId()));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                MediaKeyboardWidget mediaKeyboardWidget = (MediaKeyboardWidget) this.b;
                yy7[] yy7VarArr5 = MediaKeyboardWidget.B0;
                ((t09) mediaKeyboardWidget.c.getValue()).X.m(null, new zca());
                return qqg.a;
            case 13:
                MediaPickerScreen mediaPickerScreen = (MediaPickerScreen) this.b;
                yy7[] yy7VarArr6 = MediaPickerScreen.B0;
                mediaPickerScreen.getRouter().C();
                return qqg.a;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return Boolean.valueOf(((xc9) ((zc9) this.b)).a.contains(Long.valueOf(((lc9) obj).a)));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                MembersListWidget membersListWidget = (MembersListWidget) this.b;
                int iIntValue2 = ((Integer) obj).intValue() - membersListWidget.t0.j();
                fb6 fb6Var = membersListWidget.s0;
                if (fb6Var.j() - 1 < iIntValue2 || iIntValue2 < 0) {
                    return null;
                }
                return (lc9) ((t98) fb6Var.C(iIntValue2));
            case 16:
                return ((hf9) this.b).B((ar2) obj);
            case LangUtils.HASH_SEED /* 17 */:
                vu9 vu9Var = (vu9) this.b;
                long jLongValue2 = ((Long) obj).longValue();
                String str = vu9Var.C0;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, vb9.e(jLongValue2, "Load around from scroll logic, time: "), null);
                    }
                }
                vu9Var.d.n(jLongValue2);
                return qqg.a;
            case 18:
                MessagesSettingsScreen messagesSettingsScreen = (MessagesSettingsScreen) this.b;
                yy7[] yy7VarArr7 = MessagesSettingsScreen.X;
                messagesSettingsScreen.getRouter().C();
                return qqg.a;
            case 19:
                hl7 hl7Var = (hl7) obj;
                zoc zocVar = (zoc) ((c0a) this.b).g.getValue();
                zocVar.getClass();
                return zocVar.a(hl7Var.d, hl7Var.q);
            case 20:
                k0a k0aVar = (k0a) this.b;
                Throwable th = (Throwable) obj;
                String name = k0a.class.getName();
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null) {
                    lg8 lg8Var2 = lg8.o;
                    if (l6bVar2.b(lg8Var2)) {
                        l6bVar2.c(lg8Var2, name, k0aVar + ": cancel startObserve(), reason=" + th, null);
                    }
                }
                return qqg.a;
            case 21:
                Collection collection = (Collection) this.b;
                Long l = (Long) obj;
                l.longValue();
                return Boolean.valueOf(collection.contains(l));
            case 22:
                return Boolean.valueOf(((hr9) this.b).e(((Long) obj).longValue()) == null);
            case 23:
                NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = (NeuroAvatarPickerBottomSheet) this.b;
                zea zeaVar = (zea) obj;
                yy7[] yy7VarArr8 = NeuroAvatarPickerBottomSheet.N0;
                oga ogaVarP0 = neuroAvatarPickerBottomSheet.P0();
                ogaVarP0.getClass();
                if (zeaVar != null && (i = zeaVar.c) != ogaVarP0.Y) {
                    ogaVarP0.Y = i;
                    ogaVarP0.v0.h(new ffa(i, null));
                }
                return qqg.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                List list2 = ((dpa) this.b).b;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    if (it.hasNext()) {
                        throw ctd.h(it);
                    }
                }
                return Boolean.FALSE;
            case 25:
                vza vzaVar = (vza) this.b;
                int iIntValue3 = ((Integer) obj).intValue();
                tza tzaVar = vzaVar.a;
                if (tzaVar != null) {
                    tzaVar.e(iIntValue3);
                }
                return qqg.a;
            case 26:
                ((j8b) this.b).v0.setText(String.valueOf((CharSequence) obj));
                return Boolean.TRUE;
            case 27:
                kdb kdbVar = (kdb) this.b;
                int iIntValue4 = ((Integer) obj).intValue();
                idb idbVar = kdbVar.u0;
                if (idbVar != null) {
                    xt4 xt4Var = (xt4) idbVar;
                    dz6 dz6Var = (dz6) xt4Var.b;
                    qqd qqdVar = dz6Var.F0;
                    kdb kdbVar2 = (kdb) xt4Var.c;
                    qqdVar.d = m26.a((((iIntValue4 + 0.5f) * kdbVar2.getAvatarSize()) + kdbVar2.getTop()) - (kdbVar2.getAvatarOffset() * iIntValue4), (kdbVar2.getMeasuredHeight() / 2.0f) + kdbVar2.getTop());
                    qqdVar.a();
                    qqdVar.invalidateSelf();
                    dz6Var.F0.start();
                }
                return qqg.a;
            case 28:
                return Boolean.valueOf(((View) obj).getId() != ((bgb) this.b).getId());
            default:
                vgb vgbVar = (vgb) this.b;
                uch uchVar = (uch) obj;
                Context context = vgbVar.A;
                String str2 = vgbVar.C;
                iv6 iv6Var = vgbVar.O;
                pl0 pl0Var = vgbVar.P;
                ub4 ub4Var = new ub4(new nj0(context, str2), iv6Var, pl0Var);
                tha thaVar = new tha(18);
                qha qhaVar = vgbVar.B;
                bd4 bd4Var = new bd4();
                dh6 dh6Var = vgbVar.n;
                switch (az1.v(uchVar.a)) {
                    case 0:
                        jocVar = new joc(ub4Var);
                        break;
                    case 1:
                        HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(ub4Var);
                        sa9 sa9Var = new sa9();
                        sa9Var.a = pl0Var;
                        sa9Var.b = dh6Var;
                        sa9Var.c = Collections.singleton(new wha(14));
                        hlsMediaSource$Factory.e = sa9Var;
                        jocVar = hlsMediaSource$Factory;
                        break;
                    case 2:
                        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                        if (defaultDisplay != null && (hdrCapabilities = defaultDisplay.getHdrCapabilities()) != null && (supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes()) != null) {
                            ArrayList arrayList = new ArrayList(supportedHdrTypes.length);
                            int length = supportedHdrTypes.length;
                            for (int i5 = 0; i5 < length; i5++) {
                                int i6 = supportedHdrTypes[i5];
                                arrayList.add(i6 != 2 ? i6 != 3 ? null : b17.b : b17.a);
                            }
                            ue3.h0(ue3.E(arrayList));
                        }
                        bd4Var.Z = pl0Var;
                        DashMediaSource$Factory dashMediaSource$Factory = new DashMediaSource$Factory(new xpb(ub4Var, 4, qhaVar), ub4Var);
                        dashMediaSource$Factory.h = bd4Var;
                        dashMediaSource$Factory.e = thaVar;
                        jocVar = dashMediaSource$Factory;
                        break;
                    case 3:
                        jocVar = new joc(new vv5(i3));
                        break;
                    case 4:
                        throw new ClassCastException();
                    case 5:
                        jocVar = new joc(new bl4(context));
                        break;
                    case 6:
                        throw new IllegalArgumentException("FrameVideoSource is not supported in OneVideoExoPlayer");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                jocVar.d(false);
                return jocVar.a(k09.c(uchVar.b));
        }
    }
}
