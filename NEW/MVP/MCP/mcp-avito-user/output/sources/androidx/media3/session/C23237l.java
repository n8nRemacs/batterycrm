package androidx.media3.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.view.KeyEvent;
import androidx.media3.session.H0;

/* compiled from: DefaultActionFactory.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.session.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23237l implements H0.a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractServiceC23212c1 f52568a;

    /* renamed from: b, reason: collision with root package name */
    public int f52569b = 0;

    /* compiled from: DefaultActionFactory.java */
    @j.X
    /* renamed from: androidx.media3.session.l$a */
    public static final class a {
    }

    public C23237l(AbstractServiceC23212c1 abstractServiceC23212c1) {
        this.f52568a = abstractServiceC23212c1;
    }

    public final PendingIntent a(O0 o02, long j12) {
        int i12 = (j12 == 8 || j12 == 9) ? 87 : (j12 == 6 || j12 == 7) ? 88 : j12 == 3 ? 86 : j12 == 12 ? 90 : j12 == 11 ? 89 : j12 == 1 ? 85 : 0;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setData(o02.a().f52288b);
        AbstractServiceC23212c1 abstractServiceC23212c1 = this.f52568a;
        intent.setComponent(new ComponentName(abstractServiceC23212c1, abstractServiceC23212c1.getClass()));
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i12));
        int i13 = androidx.media3.common.util.M.f47887a;
        if (i13 < 26 || j12 != 1 || o02.b().getPlayWhenReady()) {
            return PendingIntent.getService(abstractServiceC23212c1, i12, intent, i13 >= 23 ? 67108864 : 0);
        }
        return PendingIntent.getForegroundService(abstractServiceC23212c1, i12, intent, 67108864);
    }
}
