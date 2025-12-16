package com.my.tracker.core.o;

import android.app.Application;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.my.tracker.core.Tracer;

/* loaded from: classes.dex */
public final class m {
    private final Application a;
    private l b;

    public static final class a {
        static final int a = a() ? 1 : 0;

        /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
        
            r0 = java.util.Locale.US;
            r3 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/" + android.os.Process.myPid() + "/mounts")));
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
        
            r0 = new java.lang.String[]{"/sbin/.magisk/", "/sbin/.core/mirror", "/sbin/.core/img", "/sbin/.core/db-0/magisk.db"};
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
        
            r4 = r3.readLine();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
        
            if (r4 == null) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
        
            r5 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00da, code lost:
        
            if (r5 >= 4) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
        
            if (r4.contains(r0[r5]) == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
        
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
        
            r5 = r5 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
        
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00f1, code lost:
        
            r5 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f3, code lost:
        
            r5 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00f6, code lost:
        
            if (r5 != null) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00f8, code lost:
        
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00fb, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00fc, code lost:
        
            if (r5 != null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00fe, code lost:
        
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static boolean a() throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 258
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.core.o.m.a.a():boolean");
        }
    }

    public m(Application application) {
        this.a = application;
    }

    private static Point a(Application application) {
        Display display;
        try {
            DisplayManager displayManager = (DisplayManager) application.getSystemService("display");
            if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            return point;
        } catch (Throwable th) {
            Tracer.d("DeviceParamsDataProvider: collecting screen size exception: ", th);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:63|(2:92|64)|65|88|72|73|(3:104|76|77)|(3:100|80|81)|84|85) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:37|90|38|86|39|(2:110|40)|41|108|52|53|98|56|57|60|96|61|(15:63|92|64|65|88|72|73|104|76|77|100|80|81|84|85)(12:70|88|72|73|104|76|77|100|80|81|84|85)) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00de, code lost:
    
        com.my.tracker.core.Tracer.d("DeviceParamsDataProvider: collecting timezone exception: ", r0);
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ea, code lost:
    
        com.my.tracker.core.Tracer.d("DeviceParamsDataProvider: collecting isRooted exception: ", r0);
        r22 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0121, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0122, code lost:
    
        com.my.tracker.core.Tracer.d("DeviceParamsDataProvider: collecting lang exception: ", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #4 {all -> 0x00a7, blocks: (B:35:0x0083, B:37:0x008f), top: B:94:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fb A[Catch: all -> 0x0108, TRY_LEAVE, TryCatch #5 {all -> 0x0108, blocks: (B:61:0x00f3, B:63:0x00fb), top: B:96:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.my.tracker.core.o.l a() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.core.o.m.a():com.my.tracker.core.o.l");
    }
}
