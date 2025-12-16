package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.view.VelocityTracker;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.lang.annotation.Annotation;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.SSLContext;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.startconversation.StartConversationScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class nte implements cm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ nte(int i) {
        this.a = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() throws NoSuchAlgorithmException, KeyManagementException {
        int i = 12;
        switch (this.a) {
            case 0:
                return new tp5();
            case 1:
                return new tp5();
            case 2:
                yy7[] yy7VarArr = ShareDataPickerScreen.I0;
                return new t09(null, 15);
            case 3:
                yy7[] yy7VarArr2 = ShareDataPickerScreen.I0;
                return f1e.CHAT_FORWARD;
            case 4:
                return coi.e;
            case 5:
                return new ConcurrentHashMap();
            case 6:
                Paint paint = new Paint(2);
                paint.setAntiAlias(true);
                return paint;
            case 7:
                return new yid("^(http[s]?://www\\.|http[s]?://|www\\.)");
            case 8:
                return new AccelerateDecelerateInterpolator();
            case 9:
                return new w6f(new s6f(1, Integer.valueOf(r2d.call_finished)), new s6f(2, Integer.valueOf(lvd.a)), new s6f(3, Integer.valueOf(r2d.call_ringing)), new s6f(5, Integer.valueOf(r2d.call_connecting)), new s6f(6, Integer.valueOf(r2d.call_connected)), new s6f(4, Integer.valueOf(r2d.call_busy)), true);
            case 10:
                SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                sSLContext.init(null, null, null);
                return sSLContext;
            case 11:
                yy7[] yy7VarArr3 = StartConversationScreen.H0;
                return f1e.CREATE_CHAT;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                yy7[] yy7VarArr4 = StartConversationScreen.H0;
                return paf.a.a();
            case 13:
                yy7[] yy7VarArr5 = StartConversationScreen.H0;
                return new mx3(new bwf(new nte(i)));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                yy7[] yy7VarArr6 = StartConversationScreen.H0;
                paf pafVar = paf.a;
                return new nbf(pafVar.getAccessor().d(8), pafVar.getAccessor().d(12), pafVar.getAccessor().d(99), (ay3) pafVar.getAccessor().c(556), pafVar.getAccessor().d(352), pafVar.getAccessor().d(109), pafVar.getAccessor().d(123), pafVar.getAccessor().d(108), pafVar.getAccessor().d(46), pafVar.getAccessor().d(48), pafVar.a(), pafVar.getAccessor().d(84));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                yy7[] yy7VarArr7 = StartConversationScreen.H0;
                return new zh0(bi0.a.getAccessor().d(549), true, null, 46);
            case 16:
                return qmb.g;
            case LangUtils.HASH_SEED /* 17 */:
                return new c2f(false);
            case 18:
                return new c2f(true);
            case 19:
                yy7[] yy7VarArr8 = StickersSettingsScreen.X;
                return f1e.SETTINGS_STICKERS;
            case 20:
                yy7[] yy7VarArr9 = StickersSettingsScreen.X;
                oif oifVar = oif.a;
                Context context = (Context) oifVar.getAccessor().c(12);
                lzf lzfVar = (lzf) oifVar.getAccessor().c(8);
                bwf bwfVarD = oifVar.getAccessor().d(231);
                oifVar.getAccessor().getClass();
                return new bjf(context, lzfVar, bwfVarD, oifVar.getAccessor().d(240), oifVar.getAccessor().d(241));
            case 21:
                return new jmf();
            case 22:
                nn8 nn8Var = new nn8();
                if (Build.VERSION.SDK_INT >= 28) {
                    Class clsL = i7c.l();
                    llc llcVar = new llc(19);
                    e4f e4fVar = new e4f();
                    llcVar.invoke(e4fVar);
                    nn8Var.put(clsL, new imf(e4fVar.a));
                    Class clsX = i7c.x();
                    llc llcVar2 = new llc(20);
                    e4f e4fVar2 = new e4f();
                    llcVar2.invoke(e4fVar2);
                    nn8Var.put(clsX, new imf(e4fVar2.a));
                    Class clsY = i7c.y();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Collections.singletonList("com.google.android.gms"));
                    nn8Var.put(clsY, new imf(arrayList));
                }
                return nn8Var.b();
            case 23:
                nn8 nn8Var2 = new nn8();
                if (Build.VERSION.SDK_INT >= 28) {
                    Class clsZ = i7c.z();
                    llc llcVar3 = new llc(21);
                    e4f e4fVar3 = new e4f();
                    llcVar3.invoke(e4fVar3);
                    nn8Var2.put(clsZ, new imf(e4fVar3.a));
                }
                return nn8Var2.b();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return qg9.a("one.me.webapp.domain.jsbridge.SuccessResponse.Status", epf.values(), new String[]{"updated", "removed", "cleared", "opened", "authorized"}, new Annotation[][]{null, null, null, null, null});
            case 25:
                return VelocityTracker.obtain();
            case 26:
                int i2 = gvf.o;
                return qqg.a;
            case 27:
                return new pt5();
            case 28:
                q1g[] q1gVarArr = {zf4.e0, bq4.e0, mha.e0, tx6.e0, fa9.e0};
                HashSet hashSet = new HashSet(to8.i(5));
                ys.B(q1gVarArr, hashSet);
                return hashSet;
            default:
                yy7[] yy7VarArr10 = ThreadsStateViewerScreen.o;
                return new a8g((g4b) b8g.a.getAccessor().c(56));
        }
    }
}
