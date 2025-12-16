package defpackage;

import android.graphics.Paint;
import android.os.Looper;
import android.text.TextPaint;
import java.util.Collections;
import java.util.WeakHashMap;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.folders.list.FoldersListScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class nq5 implements cm6 {
    public final /* synthetic */ int a;

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new m8g(256, (byte[]) r8g.a.getValue(), 256);
            case 1:
                return new m8g(256, (byte[]) r8g.b.getValue(), 256);
            case 2:
                return new c2f(false);
            case 3:
                return new c2f(true);
            case 4:
                yy7[] yy7VarArr = mw5.f;
                return nv6.a;
            case 5:
                return new Paint(1);
            case 6:
                return new u74(vw4.d().getDisplayMetrics().density * 12.0f);
            case 7:
                return new WeakHashMap(1);
            case 8:
                return Collections.singleton(uog.d);
            case 9:
                yy7[] yy7VarArr2 = FoldersListScreen.Y;
                return f1e.SETTINGS_FOLDERS;
            case 10:
                yy7[] yy7VarArr3 = FoldersListScreen.Y;
                return new oc6();
            case 11:
                yy7[] yy7VarArr4 = ForwardPickerScreen.I0;
                return f1e.CHAT_FORWARD;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                yy7[] yy7VarArr5 = ForwardPickerScreen.I0;
                return qqg.a;
            case 13:
                yy7[] yy7VarArr6 = ForwardPickerScreen.I0;
                return new t09(null, 15);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return Looper.getMainLooper().getThread();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new yid("width=\"(\\d+)", 0);
            case 16:
                return new yid("height=\"(\\d+)", 0);
            case LangUtils.HASH_SEED /* 17 */:
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                return paint;
            case 18:
                return new TextPaint();
            case 19:
                return new yid("\\b(?:[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}|[0-9a-fA-F:]+:[0-9a-fA-F:]+)\\b");
            case 20:
                return jei.a(j77.a);
            case 21:
                return jei.a(j77.q);
            case 22:
                return jei.a(j77.s);
            case 23:
                return jei.a(j77.u);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return jei.a(j77.w);
            case 25:
                return jei.a(j77.c);
            case 26:
                return jei.a(j77.e);
            case 27:
                return jei.a(j77.g);
            case 28:
                return jei.a(j77.i);
            default:
                return jei.a(j77.k);
        }
    }
}
