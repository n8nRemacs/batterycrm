package defpackage;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Looper;
import android.text.BoringLayout;
import android.util.DisplayMetrics;
import androidx.work.WorkRequest;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.EnumMap;
import java.util.concurrent.TimeUnit;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class ps3 implements cm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ ps3(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, k18] */
    @Override // defpackage.cm6
    public final Object invoke() {
        Object ipdVar;
        int i = this.a;
        qqg qqgVar = qqg.a;
        switch (i) {
            case 0:
                imb imbVar = new imb(os3.b, new long[]{60000, 80000});
                imb imbVar2 = new imb(os3.d, new long[]{60000, 80000});
                imb imbVar3 = new imb(os3.o, new long[]{BuildConfig.SILENCE_TIME_TO_UPLOAD, 20000, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, 40000, 50000, 60000, 80000});
                os3 os3Var = os3.c;
                long[] jArr = io5.a;
                imb[] imbVarArr = {imbVar, imbVar2, imbVar3, new imb(os3Var, jArr), new imb(os3.X, jArr)};
                EnumMap enumMap = new EnumMap(os3.class);
                for (int i2 = 0; i2 < 5; i2++) {
                    imb imbVar4 = imbVarArr[i2];
                    enumMap.put((EnumMap) imbVar4.a, (Enum) imbVar4.b);
                }
                return enumMap;
            case 1:
                yec yecVar = yec.a;
                return new t73(yecVar.getAccessor().d(42), yecVar.getAccessor().d(9));
            case 2:
                return (pfc) yec.a.getAccessor().c(HttpStatus.SC_NOT_IMPLEMENTED);
            case 3:
                return new au6(yec.a.getAccessor().d(42));
            case 4:
                yy7[] yy7VarArr = ContactListWidget.O0;
                k18 k18Var = x4e.a;
                return new mx3(y4e.a.getAccessor().d(47));
            case 5:
                return new ShapeDrawable(new OvalShape());
            case 6:
                return new idc();
            case 7:
                return new mcc();
            case 8:
                return Boolean.FALSE;
            case 9:
                yy7[] yy7VarArr2 = i44.d;
                return qqgVar;
            case 10:
                return new n5g(l7b.o);
            case 11:
                return new n5g(l7b.p);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                return paint;
            case 13:
                BoringLayout.Metrics metrics = new BoringLayout.Metrics();
                if4.L0.getFontMetricsInt(metrics);
                return metrics;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                try {
                    Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                    declaredField.setAccessible(true);
                    return (ThreadLocal) declaredField.get(null);
                } catch (Throwable unused) {
                    return null;
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new uv4();
            case 16:
                int i3 = yv4.o;
                return qqgVar;
            case LangUtils.HASH_SEED /* 17 */:
                yy7[] yy7VarArr3 = DialogNotificationsSettingsScreen.X;
                return new fw4();
            case 18:
                return Resources.getSystem();
            case 19:
                return Float.valueOf(DisplayMetrics.DENSITY_DEVICE_STABLE / 160);
            case 20:
                return Float.valueOf(Math.min(vw4.d().getDisplayMetrics().density, ((Number) vw4.b.getValue()).floatValue()));
            case 21:
                return id5.a;
            case 22:
                return kve.a(1, 1, 2);
            case 23:
                return Long.valueOf(TimeUnit.SECONDS.toSeconds(1L));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new u85();
            case 25:
                return new d95();
            case 26:
                try {
                    ipdVar = MessageDigest.getInstance("SHA-256");
                } catch (Throwable th) {
                    ipdVar = new ipd(th);
                }
                return (MessageDigest) (ipdVar instanceof ipd ? null : ipdVar);
            case 27:
                yy7[] yy7VarArr4 = EnterPinCodeScreen.o;
                return new sg5();
            case 28:
                int i4 = ExternalCallbackWidget.F0;
                return new qo5();
            default:
                int i5 = ExternalCallbackWidget.F0;
                oj7 oj7Var = new oj7();
                int iD = kti.d(44 * vw4.d().getDisplayMetrics().density);
                oj7Var.setBounds(0, 0, iD, iD);
                return oj7Var;
        }
    }
}
