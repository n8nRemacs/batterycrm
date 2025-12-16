package defpackage;

import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class tlf implements jua, h97, g5a, rl3, nva {
    public static void d(HttpURLConnection httpURLConnection) throws UnknownHostException {
        try {
            httpURLConnection.connect();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        } catch (SecurityException e3) {
            Throwable cause = e3.getCause();
            if (cause == null) {
                throw e3;
            }
            String name = cause.getClass().getName();
            if (!name.equals("libcore.io.GaiException") && !name.equals("android.system.GaiException")) {
                throw e3;
            }
            throw new UnknownHostException();
        }
    }

    @Override // defpackage.jua
    /* renamed from: a */
    public i9e mo0a() {
        return new ge0(-9223372036854775807L);
    }

    @Override // defpackage.jua
    public void b(long j) {
    }

    @Override // defpackage.jua
    public long c(ip5 ip5Var) {
        return -1L;
    }

    @Override // defpackage.h97
    public ba7 h(gge ggeVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL((String) ggeVar.c).openConnection();
        Iterator it = ((zs) ggeVar.d).iterator();
        while (true) {
            f2 f2Var = (f2) it;
            if (!f2Var.hasNext()) {
                break;
            }
            u97 u97Var = (u97) f2Var.next();
            httpURLConnection.setRequestProperty(u97Var.a, u97Var.b);
        }
        pea peaVar = (pea) ggeVar.o;
        try {
            httpURLConnection.setRequestMethod((String) ggeVar.b);
            if (peaVar != null) {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setChunkedStreamingMode(0);
            }
            d(httpURLConnection);
            if (peaVar != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                try {
                    int i = peaVar.a;
                    tl tlVar = (tl) peaVar.d;
                    rl rlVar = (rl) ((kob) peaVar.b).b;
                    hm hmVar = (hm) peaVar.c;
                    if (hmVar.shouldGzip()) {
                        e97 e97Var = new e97(bufferedOutputStream);
                        rlVar.g(e97Var, hmVar, tlVar, i);
                        e97Var.finish();
                        e97Var.l();
                    } else {
                        rlVar.g(bufferedOutputStream, hmVar, tlVar, i);
                    }
                    bufferedOutputStream.close();
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                for (String str : httpURLConnection.getHeaderFields().keySet()) {
                    if (str != null) {
                        arrayList.add(new u97(str, httpURLConnection.getHeaderField(str)));
                    }
                }
                return new ba7(responseCode, new zs(1, (u97[]) arrayList.toArray(new u97[0])), new pk6(2, httpURLConnection), 1);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new IOException(e);
            }
        } catch (IOException e2) {
            httpURLConnection.disconnect();
            throw e2;
        }
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        return new v1a(0);
    }

    @Override // defpackage.nva
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override // defpackage.g5a
    public Object p(tm9 tm9Var) {
        long jL = 0;
        try {
            jL = efi.l(tm9Var, 0L);
        } catch (Throwable th) {
            wqi.p("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = vfe.a.iterator();
            while (it.hasNext()) {
                ((qwa) it.next()).getClass();
                qwa.a(th);
            }
            int iV = az1.v(ctd.a);
            if (iV != 0) {
                if (iV != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
        }
        return Long.valueOf(jL);
    }
}
