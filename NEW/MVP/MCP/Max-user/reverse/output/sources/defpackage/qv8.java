package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class qv8 extends MediaBrowserService {
    public final /* synthetic */ ds4 a;
    public final /* synthetic */ rv8 b;
    public final /* synthetic */ rv8 c;

    public qv8(rv8 rv8Var, Context context) {
        this.c = rv8Var;
        this.b = rv8Var;
        this.a = rv8Var;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundle2;
        ukd ukdVar;
        ukd ukdVar2;
        h79.w(bundle);
        ds4 ds4Var = this.a;
        k89 k89Var = (k89) ds4Var.d;
        Bundle bundle3 = bundle == null ? null : new Bundle(bundle);
        int i2 = -1;
        if (bundle3 == null || bundle3.getInt("extra_client_version", 0) == 0) {
            bundle2 = null;
        } else {
            bundle3.remove("extra_client_version");
            ds4Var.c = new Messenger(k89Var.Y);
            Bundle bundleE = ho7.e(2, "extra_service_version");
            bundleE.putBinder("extra_messenger", ((Messenger) ds4Var.c).getBinder());
            g79 g79Var = k89Var.Z;
            if (g79Var != null) {
                db7 db7VarA = g79Var.a();
                bundleE.putBinder("extra_session_binder", db7VarA == null ? null : db7VarA.asBinder());
            } else {
                ((ArrayList) ds4Var.a).add(bundleE);
            }
            i2 = bundle3.getInt("extra_calling_pid", -1);
            bundle3.remove("extra_calling_pid");
            bundle2 = bundleE;
        }
        pv8 pv8Var = new pv8(k89Var, str, i2, i, null);
        k89Var.X = pv8Var;
        rv8 rv8Var = k89Var.a;
        rv8Var.getClass();
        b89 b89VarM = rv8Var.m();
        if (bundle3 == null) {
            bundle3 = Bundle.EMPTY;
        }
        boolean zB = k89Var.s0.b(b89VarM);
        hh7 hh7Var = i28.a;
        Math.max(0, bundle3.getInt("androidx.media.utils.MediaBrowserCompat.extras.CUSTOM_BROWSER_ACTION_LIMIT", 0));
        u69 u69Var = new u69(b89VarM, 0, 0, zB, null, bundle3);
        AtomicReference atomicReference = new AtomicReference();
        yn3 yn3Var = new yn3();
        zxg.a0(k89Var.t0.l, new u02(k89Var, atomicReference, u69Var, yn3Var, 10));
        try {
            yn3Var.a();
            s69 s69Var = (s69) atomicReference.get();
            s69Var.getClass();
            k89Var.u0.a(b89VarM, u69Var, s69Var.a, s69Var.b);
            ukdVar = rei.a;
        } catch (InterruptedException e) {
            a8i.h("MSSLegacyStub", "Couldn't get a result from onConnect", e);
            ukdVar = null;
        }
        k89Var.X = null;
        if (ukdVar == null) {
            ukdVar2 = null;
        } else {
            if (((Messenger) ds4Var.c) != null) {
                k89Var.d.add(pv8Var);
            }
            Bundle bundle4 = (Bundle) ukdVar.b;
            if (bundle2 == null) {
                bundle2 = bundle4;
            } else if (bundle4 != null) {
                bundle2.putAll(bundle4);
            }
            ukdVar2 = new ukd(23, bundle2);
        }
        if (ukdVar2 == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot("androidx.media3.session.MediaLibraryService", (Bundle) ukdVar2.b);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        kce kceVar = new kce(25, result);
        k89 k89Var = (k89) this.a.d;
        k89Var.X = k89Var.c;
        kceVar.N(null);
        k89Var.X = null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        kce kceVar = new kce(25, result);
        k89 k89Var = this.b.e;
        k89Var.X = k89Var.c;
        kceVar.N(null);
        k89Var.X = null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        h79.w(bundle);
        k89 k89Var = this.c.f;
        pv8 pv8Var = k89Var.c;
        kce kceVar = new kce(25, result);
        k89Var.X = pv8Var;
        kceVar.N(null);
        k89Var.X = null;
        k89Var.X = null;
    }
}
