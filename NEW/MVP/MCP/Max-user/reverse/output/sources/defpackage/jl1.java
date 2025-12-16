package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import java.util.concurrent.CopyOnWriteArraySet;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class jl1 implements cm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ jl1(int i) {
        this.a = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = 8;
        switch (this.a) {
            case 0:
                rha rhaVar = CallScreen.N0;
                return new bsb(e51.a.getAccessor().d(10));
            case 1:
                rha rhaVar2 = CallScreen.N0;
                return new pq1();
            case 2:
                rha rhaVar3 = CallScreen.N0;
                return new i1c();
            case 3:
                rha rhaVar4 = CallScreen.N0;
                return vye.a;
            case 4:
                rha rhaVar5 = CallScreen.N0;
                return f1e.CALL;
            case 5:
                return new pq1();
            case 6:
                return new x4h(e51.a.getAccessor().d(15));
            case 7:
                return new pr1();
            case 8:
                zo1 zo1Var = CallServiceImpl.u0;
                return (x65) e51.a.getAccessor().c(17);
            case 9:
                float f = vw4.d().getDisplayMetrics().density * 40.0f;
                return new float[]{f, f, f, f, f, f, f, f};
            case 10:
                return new m1c();
            case 11:
                int i2 = ur1.R0;
                return -231920335;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-869546428);
                shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
                shapeDrawable.getPaint().setStrokeWidth(vw4.d().getDisplayMetrics().density * 4.0f);
                shapeDrawable.getPaint().setAntiAlias(true);
                return new InsetDrawable((Drawable) shapeDrawable, kti.d(2 * vw4.d().getDisplayMetrics().density));
            case 13:
                float f2 = vw4.d().getDisplayMetrics().density * 20.0f;
                return new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return (fob) e51.a.getAccessor().c(20);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                yy7[] yy7VarArr = CallWaitingRoomEventsWidget.u0;
                return new eu1(fm1.b(), fm1.a(), fm1.e());
            case 16:
                return new zu1();
            case LangUtils.HASH_SEED /* 17 */:
                return kve.a(1, 1, 2);
            case 18:
                return new CopyOnWriteArraySet();
            case 19:
                return new CopyOnWriteArraySet();
            case 20:
                return ve3.j(":call-opponents-list", ":call-admin-settings", ":call-admin-waiting-room", ":call-active", ":call-user", ":call-chat", ":call-join-link");
            case 21:
                return Integer.valueOf(fxc.ic_call_16);
            case 22:
                return Integer.valueOf(fxc.ic_video_16);
            case 23:
                return Class.forName("android.view.RecordingCanvas");
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new o82();
            case 25:
                yy7[] yy7VarArr2 = ChangeOwnerScreen.t0;
                return f1e.CHAT_INFO_CHANGE_OWNER;
            case 26:
                yy7[] yy7VarArr3 = ChangeOwnerScreen.t0;
                return new td9(new gf1(i), (g9) null, 6);
            case 27:
                return new pq3(i1b.R, new n5g(k1b.n), 2, 56);
            case 28:
                yy7[] yy7VarArr4 = ChatAdminsScreen.u0;
                return f1e.CHAT_INFO_ADMINISTRATORS;
            default:
                yy7[] yy7VarArr5 = ChatAdminsScreen.u0;
                return Long.valueOf(((w4e) ((pb3) ((bwf) fdc.a.c()).getValue())).s());
        }
    }
}
