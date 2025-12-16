package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.folders.edit.FolderEditScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.main.MainScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class o91 extends hn6 implements cm6 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o91(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() throws IOException {
        ku3 ku3VarN;
        int i = this.a;
        ak9 ak9Var = ak9.a;
        bk9 bk9Var = bk9.a;
        int i2 = 2;
        int i3 = 0;
        qqg qqgVar = qqg.a;
        switch (i) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.receiver;
                vc6 vc6Var = new vc6(recyclerView, i2);
                if (!recyclerView.Z()) {
                    vc6Var.invoke();
                    break;
                } else {
                    recyclerView.post(new n1h(recyclerView, 11, vc6Var));
                    break;
                }
            case 1:
                ((mb1) this.receiver).v();
                break;
            case 2:
                CallIncomingScreen.y0((CallIncomingScreen) this.receiver);
                break;
            case 3:
                CallIncomingScreen callIncomingScreen = (CallIncomingScreen) this.receiver;
                v1a v1aVar = CallIncomingScreen.s0;
                callIncomingScreen.A0().u0 = false;
                tv1 tv1Var = callIncomingScreen.a;
                if (!callIncomingScreen.b.c((s2i) callIncomingScreen.Y.getValue())) {
                    callIncomingScreen.A0().t(false);
                    break;
                } else {
                    yx1 yx1Var = (yx1) callIncomingScreen.X.getValue();
                    hw1 hw1Var = (hw1) tv1Var;
                    String str = hw1Var.l().c;
                    boolean z = hw1Var.l().i;
                    yx1Var.getClass();
                    yx1.d(yx1Var, "REQUEST_PERMISSION_MIC", str, "BEFORE_JOIN", null, null, null, z, 120);
                    break;
                }
            case 4:
                ((mb1) this.receiver).v();
                break;
            case 5:
                CallIncomingScreen.y0((CallIncomingScreen) this.receiver);
                break;
            case 6:
                ((dq1) this.receiver).h.h(eq1.b);
                break;
            case 7:
                dq1 dq1Var = (dq1) this.receiver;
                if (!dq1Var.j && !vmf.F(dqi.u(((hw1) ((tv1) dq1Var.d.getValue())).l().d))) {
                    dq1Var.j = true;
                    f84 f84Var = dq1Var.k;
                    if (f84Var != null) {
                        svi.d(f84Var, bia.a.plus(((q2b) ((lzf) dq1Var.c.getValue())).a()), i84.c, new bq1(dq1Var, null));
                    }
                    dq1Var.h.h(jc3.b);
                    break;
                }
                break;
            case 8:
                hc2 hc2Var = (hc2) this.receiver;
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ChatsListSearchScreen chatsListSearchScreen = (ChatsListSearchScreen) this.receiver;
                yy7[] yy7VarArr = ChatsListSearchScreen.I0;
                int iOrdinal = ((y23) chatsListSearchScreen.z0().I0.a.getValue()).a.ordinal();
                if (iOrdinal != 3 && iOrdinal != 4) {
                    break;
                } else {
                    break;
                }
            case 13:
                ((s14) this.receiver).W();
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((s14) this.receiver).W();
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                break;
            case 16:
                ca6 ca6VarZ0 = ((FolderEditScreen) ((x86) this.receiver)).z0();
                ca6VarZ0.F0.O(ca6VarZ0, ca6.H0[0], svi.d(ca6VarZ0.a, ((q2b) ca6VarZ0.d).a(), i84.b, new s96(ca6VarZ0, null)));
                break;
            case LangUtils.HASH_SEED /* 17 */:
                break;
            case 18:
                MainScreen mainScreen = (MainScreen) this.receiver;
                rha rhaVar = MainScreen.Y;
                zya zyaVar = (zya) mainScreen.C0().o.a.getValue();
                ytd ytdVarA0 = mainScreen.A0();
                if (ytdVarA0 != null) {
                    c54 c54VarG = ytdVarA0.g(zyaVar.d);
                    bda bdaVar = c54VarG instanceof bda ? (bda) c54VarG : null;
                    if (bdaVar != null) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 19:
                MainScreen mainScreen2 = (MainScreen) this.receiver;
                rha rhaVar2 = MainScreen.Y;
                hbd hbdVar = mainScreen2.C0().o;
                ytd ytdVarA02 = mainScreen2.A0();
                if (ytdVarA02 != null) {
                    c54 c54VarG2 = ytdVarA02.g(((zya) hbdVar.a.getValue()).d);
                    ada adaVar = c54VarG2 instanceof ada ? (ada) c54VarG2 : null;
                    if (adaVar != null) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 20:
                MediaKeyboardWidget mediaKeyboardWidget = (MediaKeyboardWidget) this.receiver;
                ObjectAnimator objectAnimator = mediaKeyboardWidget.z0;
                if ((objectAnimator == null || !objectAnimator.isRunning()) && mediaKeyboardWidget.z0().getTranslationY() != 0.0f) {
                    ObjectAnimator objectAnimator2 = mediaKeyboardWidget.z0;
                    if (objectAnimator2 != null) {
                        objectAnimator2.cancel();
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(mediaKeyboardWidget.z0(), (Property<View, Float>) View.TRANSLATION_Y, mediaKeyboardWidget.z0().getTranslationY(), 0.0f);
                    objectAnimatorOfFloat.setDuration(200L);
                    objectAnimatorOfFloat.start();
                    mediaKeyboardWidget.z0 = objectAnimatorOfFloat;
                    break;
                }
                break;
            case 21:
                MediaKeyboardWidget mediaKeyboardWidget2 = (MediaKeyboardWidget) this.receiver;
                ObjectAnimator objectAnimator3 = mediaKeyboardWidget2.z0;
                if ((objectAnimator3 == null || !objectAnimator3.isRunning()) && mediaKeyboardWidget2.z0().getTranslationY() != mediaKeyboardWidget2.z0().getHeight()) {
                    ObjectAnimator objectAnimator4 = mediaKeyboardWidget2.z0;
                    if (objectAnimator4 != null) {
                        objectAnimator4.cancel();
                    }
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(mediaKeyboardWidget2.z0(), (Property<View, Float>) View.TRANSLATION_Y, mediaKeyboardWidget2.z0().getTranslationY(), mediaKeyboardWidget2.z0().getHeight());
                    objectAnimatorOfFloat2.setDuration(200L);
                    objectAnimatorOfFloat2.start();
                    mediaKeyboardWidget2.z0 = objectAnimatorOfFloat2;
                    break;
                }
                break;
            case 22:
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) this.receiver;
                messageWriteWidget.X.f.j = messageWriteWidget.C0().getText();
                messageWriteWidget.I0().F0.m(null, new zca());
                break;
            case 23:
                MessageWriteWidget messageWriteWidget2 = (MessageWriteWidget) this.receiver;
                if (!dqi.r(messageWriteWidget2.A0) || (!fni.a(messageWriteWidget2.C0().getSendActionState(), bk9Var) && !fni.a(messageWriteWidget2.C0().getSendActionState(), ak9Var))) {
                    CharSequence text = messageWriteWidget2.C0().getText();
                    if ((text != null && text.length() != 0) || messageWriteWidget2.C0().getEmojiExpandableState() == wj9.a) {
                        messageWriteWidget2.M0(messageWriteWidget2.C0().getText());
                        break;
                    } else {
                        no9.C(messageWriteWidget2.I0(), 3);
                        break;
                    }
                } else {
                    xfh.r(messageWriteWidget2.I0().y0, new un9(messageWriteWidget2.C0().getText()));
                    messageWriteWidget2.C0().setText(null);
                    break;
                }
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                MessageWriteWidget messageWriteWidget3 = (MessageWriteWidget) this.receiver;
                yy7[] yy7VarArr2 = MessageWriteWidget.L0;
                CharSequence text2 = messageWriteWidget3.C0().getText();
                if ((text2 != null && !vmf.F(text2)) || messageWriteWidget3.I0().w()) {
                    if (!dqi.r(messageWriteWidget3.A0) || (!fni.a(messageWriteWidget3.C0().getSendActionState(), bk9Var) && !fni.a(messageWriteWidget3.C0().getSendActionState(), ak9Var))) {
                        messageWriteWidget3.I0().E(text2, true);
                        messageWriteWidget3.C0().setText(null);
                        break;
                    } else {
                        xfh.r(messageWriteWidget3.I0().y0, new un9(messageWriteWidget3.C0().getText()));
                        messageWriteWidget3.C0().setText(null);
                        break;
                    }
                }
                break;
            case 25:
                pb2 pb2Var = (pb2) ((no9) this.receiver).b.getValue();
                if (pb2Var != null && (ku3VarN = pb2Var.n()) != null) {
                    long jP = ku3VarN.p();
                    long j = pb2Var.a;
                    kn9 kn9Var = kn9.c;
                    Long lValueOf = Long.valueOf(j);
                    ii4 ii4VarP0 = kn9Var.p0();
                    hi4 hi4Var = new hi4();
                    hi4Var.a = ":webapp:root";
                    hi4Var.c(Long.valueOf(jP), "bot_id");
                    hi4Var.c("start_button", "entry_point");
                    hi4Var.c(lValueOf, "source_id");
                    ii4VarP0.c(hi4Var.a(), null);
                    break;
                }
                break;
            case 26:
                ((jva) this.receiver).f();
                break;
            case 27:
                ((jva) this.receiver).f();
                break;
            case 28:
                ((uxa) this.receiver).f();
                break;
            default:
                ((uxa) this.receiver).g();
                break;
        }
        return qqgVar;
    }
}
