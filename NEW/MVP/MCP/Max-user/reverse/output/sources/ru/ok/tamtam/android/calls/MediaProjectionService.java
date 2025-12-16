package ru.ok.tamtam.android.calls;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.bwf;
import defpackage.cm6;
import defpackage.i49;
import defpackage.jq;
import defpackage.k49;
import defpackage.lv4;
import defpackage.mvd;
import defpackage.nla;
import defpackage.wqi;
import defpackage.x7b;
import kotlin.Metadata;
import ru.ok.tamtam.android.calls.MediaProjectionService;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ok/tamtam/android/calls/MediaProjectionService;", "Landroid/app/Service;", "<init>", "()V", "k49", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaProjectionService extends Service {
    public static final /* synthetic */ int o = 0;
    public final bwf a;
    public final bwf b;
    public final k49 c = new k49();
    public final String d = MediaProjectionService.class.getName();

    public MediaProjectionService() {
        final int i = 0;
        this.a = new bwf(new cm6(this) { // from class: j49
            public final /* synthetic */ MediaProjectionService b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                MediaProjectionService mediaProjectionService = this.b;
                switch (i2) {
                    case 0:
                        int i3 = MediaProjectionService.o;
                        return (lv4) me9.b(mediaProjectionService).getAccessor().c(35);
                    default:
                        int i4 = MediaProjectionService.o;
                        return me9.b(mediaProjectionService).f();
                }
            }
        });
        final int i2 = 1;
        this.b = new bwf(new cm6(this) { // from class: j49
            public final /* synthetic */ MediaProjectionService b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                MediaProjectionService mediaProjectionService = this.b;
                switch (i22) {
                    case 0:
                        int i3 = MediaProjectionService.o;
                        return (lv4) me9.b(mediaProjectionService).getAccessor().c(35);
                    default:
                        int i4 = MediaProjectionService.o;
                        return me9.b(mediaProjectionService).f();
                }
            }
        });
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, k18] */
    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        String str = this.d;
        wqi.c(str, "onCreate", new Object[0]);
        ((lv4) this.a.getValue()).f(str);
        i49 i49Var = (i49) ((jq) this.b.getValue()).q.getValue();
        nla nlaVarH = ((x7b) i49Var.b.getValue()).h(i49Var.a, true, true);
        nlaVarH.f = nla.c(i49Var.c.a.getString(mvd.F1));
        startForeground(12, nlaVarH.a());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        String str = this.d;
        wqi.c(str, "onDestroy", new Object[0]);
        ((lv4) this.a.getValue()).g(str);
    }
}
