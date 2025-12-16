package defpackage;

import android.content.Context;
import android.provider.Settings;
import android.view.OrientationEventListener;

/* loaded from: classes2.dex */
public final class ojb extends OrientationEventListener {
    public static final /* synthetic */ int d = 0;
    public final Context a;
    public final t9f b;
    public int c;

    public ojb(Context context, t9f t9fVar) {
        super(context, 3);
        this.a = context;
        this.b = t9fVar;
    }

    public final boolean a() {
        return !(Settings.System.getInt(this.a.getContentResolver(), "accelerometer_rotation", 0) == 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onOrientationChanged(int r11) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ojb.onOrientationChanged(int):void");
    }
}
