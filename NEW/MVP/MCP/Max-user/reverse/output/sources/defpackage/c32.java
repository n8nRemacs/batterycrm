package defpackage;

import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.net.URL;
import java.util.Date;

/* loaded from: classes.dex */
public final class c32 {
    public final /* synthetic */ int a;
    public int b;
    public long c;
    public Object d;

    public int a() {
        return Integer.max(0, ((int) ((((Date) this.d).getTime() + (this.b * 1000)) - new Date().getTime())) / 1000);
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "Ticket, creation date = " + ((Date) this.d) + ", ticket lifetime = " + this.b + (a() > 0 ? wy1.e(a(), " (still valid for ", " seconds)") : " (not valid anymore)");
            case 4:
                int i = this.b;
                long j = this.c;
                Long l = (Long) this.d;
                StringBuilder sbM = u45.m(i, j, "itemIndex: ", ", position: ");
                sbM.append(" real: ");
                sbM.append(l);
                return sbM.toString();
            default:
                return super.toString();
        }
    }

    public c32(int i, long j, Long l) {
        this.a = 4;
        this.b = i;
        this.c = j;
        this.d = l;
    }

    public c32(long j, Exception exc) {
        this.a = 0;
        this.c = SystemClock.elapsedRealtime() - j;
        if (exc instanceof CameraValidator$CameraIdListIncorrectException) {
            this.b = 2;
            this.d = exc;
            return;
        }
        if (exc instanceof InitializationException) {
            Throwable cause = exc.getCause();
            exc = cause != null ? cause : exc;
            this.d = exc;
            if (exc instanceof CameraUnavailableException) {
                this.b = 2;
                return;
            } else if (exc instanceof IllegalArgumentException) {
                this.b = 1;
                return;
            } else {
                this.b = 0;
                return;
            }
        }
        this.b = 0;
        this.d = exc;
    }

    public c32(int i, URL url, long j) {
        this.a = 1;
        this.b = i;
        this.d = url;
        this.c = j;
    }

    public c32(int i, long j) {
        this.a = 2;
        this.b = i;
        this.c = j;
    }
}
