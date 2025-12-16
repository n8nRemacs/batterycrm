package defpackage;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Process;
import android.view.Surface;
import androidx.camera.core.ImageCaptureException;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.RLottieDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class d8c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d8c(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        char c;
        ae4 ae4Var;
        ae4 ae4Var2;
        char c2 = 3;
        boolean z = false;
        int i = 0;
        z = false;
        switch (this.a) {
            case 0:
                try {
                    ((f8c) this.b).g((n8a) this.c);
                    return;
                } catch (Throwable th) {
                    wqi.e("f8c", "updatePresence failure!", th);
                    return;
                }
            case 1:
                r8c r8cVar = (r8c) this.b;
                n22 n22Var = (n22) this.c;
                dsf dsfVar = r8cVar.t;
                jei.b();
                if (n22Var == r8cVar.c()) {
                    dsfVar.e();
                    return;
                }
                return;
            case 2:
                ((q8c) this.b).b((msf) this.c);
                return;
            case 3:
                ((a9c) ((mc5) this.b).b).B0.b((msf) this.c);
                return;
            case 4:
                pc4 pc4Var = (pc4) this.b;
                Runnable runnable = (Runnable) this.c;
                try {
                    pc4Var.getClass();
                    Process.setThreadPriority(10);
                } catch (Throwable unused) {
                }
                runnable.run();
                return;
            case 5:
                iac iacVar = (iac) this.b;
                jf7 jf7Var = (jf7) this.c;
                knd kndVar = iacVar.f;
                jei.b();
                if (kndVar.g) {
                    jf7Var.close();
                    return;
                }
                z5j.f("onImageCaptured() must be called before onFinalResult()", kndVar.c.b.isDone());
                kndVar.a();
                yb0 yb0Var = kndVar.a;
                yb0Var.b.execute(new aee(yb0Var, 23, jf7Var));
                return;
            case 6:
                iac iacVar2 = (iac) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                knd kndVar2 = iacVar2.f;
                jei.b();
                if (kndVar2.g) {
                    return;
                }
                yb0 yb0Var2 = kndVar2.a;
                yb0Var2.b.execute(new azf(yb0Var2, bitmap));
                return;
            case 7:
                iac iacVar3 = (iac) this.b;
                ImageCaptureException imageCaptureException = (ImageCaptureException) this.c;
                knd kndVar3 = iacVar3.f;
                jei.b();
                if (kndVar3.g) {
                    return;
                }
                z5j.f("onImageCaptured() must be called before onFinalResult()", kndVar3.c.b.isDone());
                kndVar3.a();
                jei.b();
                yb0 yb0Var3 = kndVar3.a;
                yb0Var3.b.execute(new aee(yb0Var3, 22, imageCaptureException));
                return;
            case 8:
                ((jac) this.b).a((v4i) this.c, false);
                return;
            case 9:
                foc focVar = (foc) this.b;
                h9e h9eVar = (h9e) this.c;
                focVar.H0 = focVar.A0 == null ? h9eVar : new w16(-9223372036854775807L);
                focVar.I0 = h9eVar.f();
                if (focVar.O0 == -1 && h9eVar.f() == -9223372036854775807L) {
                    z = true;
                }
                focVar.J0 = z;
                focVar.K0 = z ? 7 : 1;
                focVar.Y.q(focVar.I0, h9eVar.c(), focVar.J0);
                if (focVar.E0) {
                    return;
                }
                focVar.m();
                return;
            case 10:
                ((goc) this.b).A((i9e) this.c);
                return;
            case 11:
                RLottieDrawable rLottieDrawable = (RLottieDrawable) this.b;
                Throwable th2 = (Throwable) this.c;
                Gson gson = RLottieDrawable.gson;
                Iterator it = new ArrayList(rLottieDrawable.D1).iterator();
                while (it.hasNext()) {
                    ((RLottieDrawable.DrawableLoadListener) it.next()).onError(th2);
                }
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                new esa(vqa.i((ArrayList) this.c), new bdd((ddd) this.b, z ? 1 : 0)).a();
                return;
            case 13:
                ((RecordManagerImpl) this.b).applyRecordStarted((wk1) this.c);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((Executor) this.b).execute((Runnable) this.c);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((gb0) this.b).t0.accept((ach) this.c);
                return;
            case 16:
                lhd lhdVar = (lhd) this.b;
                hf5 hf5Var = (hf5) this.c;
                rde rdeVar = lhdVar.f;
                Object[] objArr = {new r0c(), new ulb(2)};
                ArrayList arrayList = new ArrayList(2);
                for (int i2 = 0; i2 < 2; i2++) {
                    Object obj = objArr[i2];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                }
                rdeVar.i(Collections.unmodifiableList(arrayList), hf5Var);
                return;
            case LangUtils.HASH_SEED /* 17 */:
                xo8 xo8Var = (xo8) this.b;
                Object obj2 = ((uid) this.c).a;
                ((em5) xo8Var.b).s1(obj2 == null ? null : (Surface) obj2);
                return;
            case 18:
                ((f8j) this.b).c((Typeface) this.c);
                return;
            case 19:
                ek8 ek8Var = (ek8) this.b;
                te8 te8Var = (te8) this.c;
                int iG = ek8Var.g();
                while (i < iG) {
                    long jD = ek8Var.d(i);
                    b8c b8cVar = (b8c) ek8Var.h(i);
                    if (jD > 0) {
                        m14 m14VarR = te8Var.r();
                        int i3 = b8cVar.b;
                        int i4 = b8cVar.a;
                        lrd lrdVar = m14VarR.a;
                        lrdVar.b();
                        bi biVar = m14VarR.d;
                        vk6 vk6VarA = biVar.a();
                        vk6VarA.k(1, i3);
                        vk6VarA.k(2, i4);
                        c = 3;
                        vk6VarA.k(3, jD);
                        try {
                            lrdVar.c();
                            try {
                                vk6VarA.w();
                                lrdVar.q();
                                lrdVar.k();
                            } catch (Throwable th3) {
                                lrdVar.k();
                                throw th3;
                            }
                        } finally {
                            biVar.r(vk6VarA);
                        }
                    } else {
                        c = c2;
                    }
                    i++;
                    c2 = c;
                }
                return;
            case 20:
                Map map = (Map) this.b;
                bsd bsdVar = (bsd) this.c;
                for (Map.Entry entry : map.entrySet()) {
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    im9 im9Var = (im9) entry.getValue();
                    lq9 lq9VarD = bsdVar.d();
                    int i5 = im9Var.a;
                    int i6 = im9Var.b;
                    lrd lrdVar2 = lq9VarD.a;
                    lrdVar2.b();
                    hq9 hq9Var = lq9VarD.p;
                    vk6 vk6VarA2 = hq9Var.a();
                    vk6VarA2.k(1, i5);
                    vk6VarA2.k(2, i6);
                    vk6VarA2.k(3, jLongValue);
                    try {
                        lrdVar2.c();
                        try {
                            vk6VarA2.w();
                            lrdVar2.q();
                            lrdVar2.k();
                        } catch (Throwable th4) {
                            lrdVar2.k();
                            throw th4;
                        }
                    } finally {
                        hq9Var.r(vk6VarA2);
                    }
                }
                return;
            case 21:
                List<ytb> list = (List) this.b;
                csd csdVar = (csd) this.c;
                for (ytb ytbVar : list) {
                    sub subVarC = csdVar.c();
                    ztb ztbVarB = csd.b(csdVar, ytbVar);
                    lrd lrdVar3 = subVarC.a;
                    lrdVar3.b();
                    lrdVar3.c();
                    try {
                        subVarC.b.B(ztbVarB);
                        lrdVar3.q();
                    } finally {
                        lrdVar3.k();
                    }
                }
                return;
            case 22:
                Map map2 = (Map) this.b;
                csd csdVar2 = (csd) this.c;
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str = (String) entry2.getKey();
                    long jLongValue2 = ((Number) entry2.getValue()).longValue();
                    sub subVarC2 = csdVar2.c();
                    lrd lrdVar4 = subVarC2.a;
                    lrdVar4.b();
                    hq9 hq9Var2 = subVarC2.d;
                    vk6 vk6VarA3 = hq9Var2.a();
                    vk6VarA3.k(1, jLongValue2);
                    vk6VarA3.k(2, 1);
                    if (str == null) {
                        vk6VarA3.S(3);
                    } else {
                        vk6VarA3.f(3, str);
                    }
                    try {
                        lrdVar4.c();
                        try {
                            vk6VarA3.w();
                            lrdVar4.q();
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    } finally {
                        hq9Var2.r(vk6VarA3);
                    }
                }
                return;
            case 23:
                jud judVar = (jud) this.b;
                hud hudVar = (hud) this.c;
                if (judVar.j.get()) {
                    return;
                }
                long j = judVar.k + 1;
                judVar.k = j;
                judVar.l.put(j, new e85(j, hudVar, judVar.o));
                u5i u5iVar = judVar.n;
                gud gudVar = hudVar.b;
                u5iVar.getClass();
                ((Handler) u5iVar.c).post(new mp5(u5iVar, gudVar, 0));
                judVar.f.post(new iud(judVar, j, 0));
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                jud judVar2 = (jud) this.b;
                ae4 ae4Var3 = (ae4) this.c;
                p8i p8iVar = judVar2.d;
                r8i r8iVar = judVar2.c;
                AtomicReference atomicReference = judVar2.b;
                AtomicBoolean atomicBoolean = judVar2.j;
                if (atomicBoolean.get() || (ae4Var = (ae4) atomicReference.get()) == ae4Var3) {
                    return;
                }
                atomicReference.set(ae4Var3);
                if (ae4Var != null) {
                    if (r8iVar == null) {
                        throw new IllegalArgumentException("Illegal 'listener' value: null");
                    }
                    ae4Var.c.remove(r8iVar);
                    ae4Var.c(p8iVar);
                }
                judVar2.a();
                ae4Var3.a(p8iVar);
                if (r8iVar == null) {
                    throw new IllegalArgumentException("Illegal 'listener' value: null");
                }
                ae4Var3.c.add(r8iVar);
                boolean zB = ae4Var3.b();
                ae4 ae4Var4 = (ae4) atomicReference.get();
                if (atomicBoolean.get() || ae4Var4 != ae4Var3) {
                    return;
                }
                if (zB) {
                    judVar2.b();
                    return;
                } else {
                    judVar2.a();
                    return;
                }
            case 25:
                j35 j35Var = (j35) this.b;
                ae4 ae4Var5 = (ae4) this.c;
                p8i p8iVar2 = (p8i) j35Var.t0;
                AtomicReference atomicReference2 = (AtomicReference) j35Var.s0;
                if (((AtomicBoolean) j35Var.Z).get() || (ae4Var2 = (ae4) atomicReference2.get()) == ae4Var5) {
                    return;
                }
                atomicReference2.set(ae4Var5);
                if (ae4Var2 != null) {
                    ae4Var2.c(p8iVar2);
                }
                if (ae4Var5 != null) {
                    ae4Var5.a(p8iVar2);
                    return;
                }
                return;
            case 26:
                j35 j35Var2 = (j35) this.b;
                Throwable th6 = (Throwable) this.c;
                Iterator it2 = ((CopyOnWriteArrayList) j35Var2.b).iterator();
                while (it2.hasNext()) {
                    try {
                        ((pud) it2.next()).c(th6);
                    } catch (Throwable th7) {
                        ((y6d) j35Var2.d).reportException("RtcNotificationReceiver", "rtc.notification.handle.notificationerror", th7);
                    }
                }
                return;
            case 27:
                j35 j35Var3 = (j35) this.b;
                oud oudVar = (oud) this.c;
                Iterator it3 = ((CopyOnWriteArrayList) j35Var3.b).iterator();
                while (it3.hasNext()) {
                    try {
                        ((pud) it3.next()).b(oudVar);
                    } catch (Throwable th8) {
                        ((y6d) j35Var3.d).reportException("RtcNotificationReceiver", "rtc.notification.handle.notificationreceived", th8);
                    }
                }
                return;
            case 28:
                ((x6i) this.b).u((Runnable) this.c);
                return;
            default:
                q2e q2eVar = (q2e) this.b;
                ae4 ae4Var6 = (ae4) this.c;
                q2eVar.X.d(ae4Var6);
                if (!q2eVar.Y || ae4Var6 == null) {
                    return;
                }
                q2eVar.X.e();
                return;
        }
    }
}
