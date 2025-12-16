package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import one.me.android.media.service.OneMeMediaSessionService;

/* loaded from: classes.dex */
public final /* synthetic */ class c29 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ c29(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.o = obj3;
        this.X = obj4;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i;
        co4 co4Var;
        em5 em5Var;
        o79 o79Var;
        ha8 ha8VarE;
        pz1 pz1Var;
        co4 co4Var2;
        o79 o79Var2;
        da9 da9Var;
        em5 em5Var2;
        switch (this.a) {
            case 0:
                f29 f29Var = (f29) this.c;
                w69 w69Var = (w69) this.d;
                wg7 wg7Var = (wg7) this.o;
                pz1 pz1Var2 = (pz1) this.X;
                b29 b29Var = f29Var.Z;
                bj bjVar = f29Var.b;
                co4 co4Var3 = (co4) b29Var;
                Context context = co4Var3.a;
                int i2 = Build.VERSION.SDK_INT;
                NotificationManager notificationManager = co4Var3.c;
                if (notificationManager.getNotificationChannel("default_channel_id") == null) {
                    NotificationChannel notificationChannel = new NotificationChannel("default_channel_id", context.getString(co4Var3.b), 2);
                    if (i2 <= 27) {
                        notificationChannel.setShowBadge(false);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                u4j.a(4, "initialCapacity");
                Object[] objArrCopyOf = new Object[4];
                int i3 = 0;
                for (int i4 = 0; i4 < wg7Var.size(); i4++) {
                    bg3 bg3Var = (bg3) wg7Var.get(i4);
                    aie aieVar = bg3Var.a;
                    if (aieVar != null && aieVar.a == 0 && bg3Var.i) {
                        bg3 bg3Var2 = (bg3) wg7Var.get(i4);
                        bg3Var2.getClass();
                        int i5 = i3 + 1;
                        int iH = mg7.h(objArrCopyOf.length, i5);
                        if (iH > objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iH);
                        }
                        objArrCopyOf[i3] = bg3Var2;
                        i3 = i5;
                    }
                }
                u3c u3cVarA = w69Var.a();
                o79 o79Var3 = w69Var.a;
                nla nlaVar = new nla(context, "default_channel_id");
                da9 da9Var2 = new da9(w69Var);
                em5 em5Var3 = (em5) u3cVarA;
                em5Var3.A1();
                o3c o3cVar = em5Var3.Y0;
                zjd zjdVarH = wg7.h(i3, objArrCopyOf);
                boolean zH0 = zxg.h0(u3cVarA, o79Var3.p);
                zjd zjdVarE = bg3.e(zjdVarH, true, true);
                boolean zA = bg3.a(2, zjdVarE);
                boolean zA2 = bg3.a(3, zjdVarE);
                tg7 tg7Var = new tg7(4);
                if (zA) {
                    z = zH0;
                    tg7Var.a(((bg3) zjdVarE.get(0)).b(rg7.b(2)));
                    i = 1;
                } else {
                    z = zH0;
                    if (o3cVar.a.a(7, 6)) {
                        ag3 ag3Var = new ag3(57413);
                        ag3Var.c(6);
                        ag3Var.f = context.getString(y3d.media3_controls_seek_to_previous_description);
                        tg7Var.a(ag3Var.a());
                    }
                    i = 0;
                }
                if (o3cVar.a(1)) {
                    if (z) {
                        ag3 ag3Var2 = new ag3(57399);
                        ag3Var2.c(1);
                        ag3Var2.f = context.getString(y3d.media3_controls_play_description);
                        tg7Var.a(ag3Var2.a());
                    } else {
                        ag3 ag3Var3 = new ag3(57396);
                        ag3Var3.c(1);
                        ag3Var3.f = context.getString(y3d.media3_controls_pause_description);
                        tg7Var.a(ag3Var3.a());
                    }
                }
                if (zA2) {
                    tg7Var.a(((bg3) zjdVarE.get(i)).b(rg7.b(3)));
                    i++;
                } else if (o3cVar.a.a(9, 8)) {
                    ag3 ag3Var4 = new ag3(57412);
                    ag3Var4.c(8);
                    ag3Var4.f = context.getString(y3d.media3_controls_seek_to_next_description);
                    tg7Var.a(ag3Var4.a());
                }
                while (i < zjdVarE.d) {
                    tg7Var.a(((bg3) zjdVarE.get(i)).b(rg7.b(6)));
                    i++;
                }
                zjd zjdVarI = tg7Var.i();
                int[] iArrCopyOf = new int[3];
                int[] iArr = new int[3];
                Arrays.fill(iArrCopyOf, -1);
                Arrays.fill(iArr, -1);
                int i6 = 0;
                boolean z2 = false;
                while (i6 < zjdVarI.d) {
                    bg3 bg3Var3 = (bg3) zjdVarI.get(i6);
                    aie aieVar2 = bg3Var3.a;
                    zjd zjdVar = zjdVarI;
                    int i7 = bg3Var3.b;
                    int[] iArr2 = iArr;
                    CharSequence charSequence = bg3Var3.f;
                    int i8 = i6;
                    int i9 = bg3Var3.d;
                    f29 f29Var2 = f29Var;
                    rg7 rg7Var = bg3Var3.h;
                    if (aieVar2 != null) {
                        OneMeMediaSessionService oneMeMediaSessionService = (OneMeMediaSessionService) bjVar.c;
                        pz1Var = pz1Var2;
                        hsi.b(aieVar2.a == 0);
                        IconCompat iconCompatC = IconCompat.c(oneMeMediaSessionService, i9);
                        co4Var2 = co4Var3;
                        String str = aieVar2.b;
                        Bundle bundle = aieVar2.c;
                        em5Var2 = em5Var3;
                        da9Var = da9Var2;
                        Intent intent = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
                        intent.setData(o79Var3.b);
                        o79Var2 = o79Var3;
                        intent.setComponent(new ComponentName(oneMeMediaSessionService, oneMeMediaSessionService.getClass()));
                        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", str);
                        intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", bundle);
                        int i10 = bjVar.b + 1;
                        bjVar.b = i10;
                        nlaVar.b.add(new zka(iconCompatC, charSequence, PendingIntent.getService(oneMeMediaSessionService, i10, intent, 201326592)));
                    } else {
                        pz1Var = pz1Var2;
                        co4Var2 = co4Var3;
                        o79Var2 = o79Var3;
                        da9Var = da9Var2;
                        em5Var2 = em5Var3;
                        hsi.g(i7 != -1);
                        IconCompat iconCompatC2 = IconCompat.c(context, i9);
                        long j = i7;
                        OneMeMediaSessionService oneMeMediaSessionService2 = (OneMeMediaSessionService) bjVar.c;
                        int i11 = (j == 8 || j == 9) ? 87 : (j == 6 || j == 7) ? 88 : j == 3 ? 86 : j == 12 ? 90 : j == 11 ? 89 : j == 1 ? 85 : 0;
                        Intent intentG = bjVar.g(w69Var, i11);
                        nlaVar.b.add(new zka(iconCompatC2, charSequence, (j != 1 || ((em5) w69Var.a()).i()) ? PendingIntent.getService(oneMeMediaSessionService2, i11, intentG, 67108864) : PendingIntent.getForegroundService(oneMeMediaSessionService2, i11, intentG, 67108864)));
                    }
                    int i12 = bg3Var3.g.getInt("androidx.media3.session.command.COMPACT_VIEW_INDEX", -1);
                    if (i12 >= 0 && i12 < 3) {
                        iArrCopyOf[i12] = i8;
                        z2 = true;
                    } else if (rg7Var.a(0) == 2) {
                        iArr2[0] = i8;
                    } else if (rg7Var.a(0) == 1) {
                        iArr2[1] = i8;
                    } else if (rg7Var.a(0) == 3) {
                        iArr2[2] = i8;
                    }
                    i6 = i8 + 1;
                    zjdVarI = zjdVar;
                    iArr = iArr2;
                    f29Var = f29Var2;
                    pz1Var2 = pz1Var;
                    co4Var3 = co4Var2;
                    em5Var3 = em5Var2;
                    da9Var2 = da9Var;
                    o79Var3 = o79Var2;
                }
                f29 f29Var3 = f29Var;
                pz1 pz1Var3 = pz1Var2;
                co4 co4Var4 = co4Var3;
                o79 o79Var4 = o79Var3;
                da9 da9Var3 = da9Var2;
                em5 em5Var4 = em5Var3;
                int[] iArr3 = iArr;
                if (!z2) {
                    int i13 = 0;
                    int i14 = 0;
                    for (int i15 = 3; i14 < i15; i15 = 3) {
                        int i16 = iArr3[i14];
                        if (i16 != -1) {
                            iArrCopyOf[i13] = i16;
                            i13++;
                        }
                        i14++;
                    }
                }
                int i17 = 0;
                while (true) {
                    if (i17 < 3) {
                        if (iArrCopyOf[i17] == -1) {
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i17);
                        } else {
                            i17++;
                        }
                    }
                }
                da9Var3.f = iArrCopyOf;
                i3 i3Var = (i3) u3cVarA;
                if (i3Var.S(18)) {
                    em5Var4.A1();
                    em5Var = em5Var4;
                    w19 w19Var = em5Var.Z0;
                    nlaVar.e = nla.c(w19Var.a);
                    nlaVar.d(w19Var.b);
                    o79Var = o79Var4;
                    h79 h79Var = o79Var.m;
                    h79Var.getClass();
                    byte[] bArr = w19Var.k;
                    if (bArr != null) {
                        ha8VarE = h79Var.q(bArr);
                    } else {
                        Uri uri = w19Var.m;
                        ha8VarE = uri != null ? h79Var.e(uri) : null;
                    }
                    co4Var = co4Var4;
                    if (ha8VarE != null) {
                        vd vdVar = co4Var.d;
                        if (vdVar != null) {
                            vdVar.b = true;
                        }
                        if (ha8VarE.isDone()) {
                            try {
                                nlaVar.g((Bitmap) a6a.a(ha8VarE));
                            } catch (CancellationException | ExecutionException e) {
                                a8i.l("NotificationProvider", "Failed to load bitmap: " + e.getMessage());
                            }
                        } else {
                            vd vdVar2 = new vd(nlaVar, 3, pz1Var3);
                            co4Var.d = vdVar2;
                            Handler handler = o79Var.l;
                            Objects.requireNonNull(handler);
                            ha8VarE.d(new yn6(ha8VarE, 0, vdVar2), new fv1(1, handler));
                        }
                    }
                } else {
                    co4Var = co4Var4;
                    em5Var = em5Var4;
                    o79Var = o79Var4;
                }
                long jCurrentTimeMillis = (!i3Var.z0() || em5Var.f() || i3Var.w0() || em5Var.Y0().a != 1.0f) ? -9223372036854775807L : System.currentTimeMillis() - em5Var.p();
                boolean z3 = jCurrentTimeMillis != -9223372036854775807L;
                if (!z3) {
                    jCurrentTimeMillis = 0;
                }
                nlaVar.F.when = jCurrentTimeMillis;
                nlaVar.l = z3;
                nlaVar.m = z3;
                if (Build.VERSION.SDK_INT >= 31) {
                    nlaVar.D = 1;
                }
                nlaVar.g = o79Var.u;
                nlaVar.F.deleteIntent = PendingIntent.getService((OneMeMediaSessionService) bjVar.c, 86, bjVar.g(w69Var, 86).putExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", true), 67108864);
                nlaVar.f(8, true);
                nlaVar.F.icon = co4Var.e;
                nlaVar.i(da9Var3);
                nlaVar.y = 1;
                nlaVar.f(2, false);
                nlaVar.r = "media3_group_key";
                f29Var3.o.execute(new ul5(f29Var3, w69Var, new ao6(nlaVar.a()), this.b));
                return;
            case 1:
                j89 j89Var = (j89) this.c;
                ya7 ya7Var = (ya7) this.d;
                b89 b89Var = (b89) this.o;
                ds3 ds3Var = (ds3) this.X;
                boolean z4 = this.b;
                j89Var.e.remove(ya7Var);
                try {
                    try {
                        OneMeMediaSessionService oneMeMediaSessionService3 = (OneMeMediaSessionService) j89Var.c.get();
                        if (oneMeMediaSessionService3 != null) {
                            int i18 = ds3Var.a;
                            int i19 = ds3Var.b;
                            u69 u69Var = new u69(b89Var, i18, i19, z4, new v89(ya7Var, i19), ds3Var.e);
                            w69 w69VarG = oneMeMediaSessionService3.g(u69Var);
                            if (w69VarG != null) {
                                oneMeMediaSessionService3.a(w69VarG);
                                w69VarG.a.g.i(ya7Var, u69Var);
                                return;
                            }
                        }
                    } catch (Exception e2) {
                        a8i.m("MSessionService", "Failed to add a session to session service", e2);
                    }
                    return;
                } finally {
                    v9j.b(ya7Var);
                }
            default:
                u0g u0gVar = (u0g) this.c;
                sm smVar = (sm) this.d;
                te8 te8Var = (te8) this.o;
                j1g j1gVar = (j1g) this.X;
                k18 k18Var = u0gVar.v0;
                try {
                    smVar.c = (tm) u0gVar.y0.getValue();
                    n2 n2VarQ = smVar.q();
                    if (n2VarQ != null) {
                        long jC = u0gVar.c(smVar.q());
                        if (this.b) {
                            zhe zheVar = (zhe) ((w0g) k18Var.getValue()).X.get();
                            if (zheVar != null) {
                                zheVar.k(n2VarQ, true, jC, te8Var);
                            }
                        } else {
                            zhe zheVar2 = (zhe) ((w0g) k18Var.getValue()).X.get();
                            if (zheVar2 != null) {
                                zheVar2.k(n2VarQ, false, jC, te8Var);
                            }
                        }
                    } else {
                        String strConcat = "getRequest is null ".concat(smVar.getClass().getName());
                        pzf pzfVar = new pzf("app.exception", strConcat, null);
                        u0gVar.f(smVar, pzfVar);
                        j1gVar.b().a(new p0g(j1gVar, pzfVar, 0));
                        wqi.o(u0g.z0, null, strConcat, Arrays.copyOf(new Object[0], 0));
                    }
                    return;
                } catch (Exception e3) {
                    pzf pzfVar2 = new pzf("app.exception", e3.getMessage(), null);
                    u0gVar.f(smVar, pzfVar2);
                    j1gVar.b().a(new p0g(j1gVar, pzfVar2, 1));
                    ((y3b) u0gVar.Z).a(e3);
                    return;
                }
        }
    }

    public /* synthetic */ c29(u0g u0gVar, sm smVar, boolean z, te8 te8Var, j1g j1gVar) {
        this.a = 2;
        this.c = u0gVar;
        this.d = smVar;
        this.b = z;
        this.o = te8Var;
        this.X = j1gVar;
    }
}
