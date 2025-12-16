package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.android.OneMeApplication;
import one.me.android.root.RootController;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class da1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ da1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cm6
    public final Object invoke() {
        f10 f10Var;
        String str;
        String[] strArr;
        int i = 2;
        int i2 = 3;
        int i3 = 0;
        Object[] objArr = 0;
        int i4 = 1;
        Field field = null;
        switch (this.a) {
            case 0:
                ia1 ia1Var = (ia1) this.b;
                List list = (List) this.c;
                mw4 mw4Var = (mw4) this.d;
                ia1Var.w0 = list;
                mw4Var.a(new iv6(i, ia1Var));
                return qqg.a;
            case 1:
                ks1 ks1Var = (ks1) this.b;
                zi1 zi1Var = (zi1) this.c;
                String str2 = (String) this.d;
                v11 v11Var = (v11) ks1Var.a();
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    v11Var.getClass();
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, "CallAdminSettingsController", "Removing user " + zi1Var + " from call", null);
                    }
                }
                Conversation conversationA = v11Var.d().a();
                if (conversationA != null) {
                    conversationA.removeParticipant(knb.c(zi1Var), false);
                }
                jve jveVar = ks1Var.f;
                cn1 cn1Var = en1.b;
                jveVar.h(new cn1(new p5g(m0b.c1, ys.D(new Object[]{str2})), Integer.valueOf(i0b.q0)));
                return qqg.a;
            case 2:
                String str3 = (String) this.b;
                Rect rect = (Rect) this.c;
                l5c l5cVar = (l5c) ((sz2) this.d).d;
                l5cVar.getClass();
                return ave.a(str3, rect, (int) l5cVar.m(PmsKey.f97minimagesidesize, 64));
            case 3:
                File file = (File) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                sz2 sz2Var = (sz2) this.d;
                String absolutePath = file.getAbsolutePath();
                int iR = ((l5c) sz2Var.d).r();
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                ave.c(absolutePath, bitmap, iR);
                return qqg.a;
            case 4:
                return ((l24) this.b).a.s((List) this.c, (yv3) this.d);
            case 5:
                n15 n15Var = (n15) this.b;
                k18 k18Var = (k18) this.c;
                k18 k18Var2 = (k18) this.d;
                m2g m2gVar = n15Var.a;
                long j = m2gVar.c;
                long j2 = m2gVar.f;
                long j3 = m2gVar.e;
                long j4 = m2gVar.d;
                if (j > 0) {
                    if (!m2gVar.n) {
                        return ((iz5) ((qx5) k18Var.getValue())).r(j);
                    }
                    iz5 iz5Var = (iz5) ((qx5) k18Var.getValue());
                    iz5Var.getClass();
                    return new File(iz5.g(iz5.b(iz5Var.c), "videoCache"), a9h.d(j, "video_", ".mp4"));
                }
                if (j4 > 0) {
                    return ((iz5) ((qx5) k18Var.getValue())).d(j4);
                }
                if (j3 > 0) {
                    iz5 iz5Var2 = (iz5) ((qx5) k18Var.getValue());
                    iz5Var2.getClass();
                    return new File(iz5.g(iz5.b(iz5Var2.c), "gifCache"), vb9.e(j3, "gif_"));
                }
                if (j2 > 0) {
                    return new File(((iz5) ((qx5) k18Var.getValue())).n(), vb9.e(j2, "sticker_"));
                }
                if (m2gVar.j <= 0) {
                    return null;
                }
                si9 si9VarM = ((qi9) k18Var2.getValue()).m(m2gVar.a);
                if (si9VarM != null) {
                    jdc jdcVar = si9VarM.x0;
                    if (jdcVar == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    w10 w10VarR = jdcVar.r(s10.t0);
                    if (w10VarR != null && (f10Var = w10VarR.j) != null && (str = w10VarR.s) != null && str.length() != 0) {
                        File file2 = new File(str);
                        if (file2.exists() && file2.length() == f10Var.b && file2.lastModified() == w10VarR.w) {
                            field = file2;
                        }
                    }
                }
                return field == null ? ((iz5) ((qx5) k18Var.getValue())).h(m2gVar.k) : field;
            case 6:
                oh6 oh6Var = (oh6) this.b;
                vgb vgbVar = (vgb) this.c;
                j60 j60Var = (j60) this.d;
                Iterator it = oh6Var.b.iterator();
                while (it.hasNext()) {
                    ((dhb) it.next()).o(vgbVar, j60Var);
                }
                return qqg.a;
            case 7:
                vw6 vw6Var = (vw6) this.b;
                k18 k18Var3 = (k18) this.c;
                k18 k18Var4 = (k18) this.d;
                String str4 = vw6Var.b;
                if (!vw6Var.a()) {
                    return null;
                }
                wqi.c(str4, "Start creating FirebaseApp", new Object[0]);
                long jNanoTime = System.nanoTime();
                l5c l5cVar2 = (l5c) ((age) k18Var3.getValue());
                l5cVar2.getClass();
                if (l5cVar2.j(PmsKey.f51fbexecreplace, true)) {
                    l5c l5cVar3 = (l5c) ((age) k18Var3.getValue());
                    l5cVar3.getClass();
                    Set stringSet = l5cVar3.g.getStringSet(PmsKey.f50fbexecmodifiersnames.name(), null);
                    if (stringSet == null || (strArr = (String[]) stringSet.toArray(new String[0])) == null) {
                        strArr = age.b;
                    }
                    wqi.c("ReplaceExecutorRegistrarLogic", "start", new Object[0]);
                    int length = strArr.length;
                    while (true) {
                        if (i3 < length) {
                            try {
                                Field declaredField = Field.class.getDeclaredField(strArr[i3]);
                                declaredField.setAccessible(true);
                                field = declaredField;
                            } catch (Throwable unused) {
                                i3++;
                            }
                        }
                    }
                    if (field != null) {
                        Field fieldA = c8j.a(field, "BG_EXECUTOR");
                        if (fieldA != null) {
                            c8j.b(fieldA, new zad(k18Var4, i4));
                            wqi.c("ReplaceExecutorRegistrarLogic", "BG_EXECUTOR replaced", new Object[0]);
                        }
                        Field fieldA2 = c8j.a(field, "LITE_EXECUTOR");
                        if (fieldA2 != null) {
                            c8j.b(fieldA2, new zad(k18Var4, i));
                            wqi.c("ReplaceExecutorRegistrarLogic", "LITE_EXECUTOR replaced", new Object[0]);
                        }
                        Field fieldA3 = c8j.a(field, "BLOCKING_EXECUTOR");
                        if (fieldA3 != null) {
                            c8j.b(fieldA3, new zad(k18Var4, i2));
                            wqi.c("ReplaceExecutorRegistrarLogic", "BLOCKING_EXECUTOR replaced", new Object[0]);
                        }
                        Field fieldA4 = c8j.a(field, "SCHEDULER");
                        if (fieldA4 != null) {
                            c8j.b(fieldA4, new zad(k18Var4, 4));
                            wqi.c("ReplaceExecutorRegistrarLogic", "SCHEDULER replaced", new Object[0]);
                        }
                        wqi.c("ReplaceExecutorRegistrarLogic", "finish", new Object[0]);
                    }
                }
                h06 h06VarE = h06.e(vw6Var.a);
                int i5 = s65.d;
                wqi.c(str4, "End creating FirebaseApp. Takes ".concat(s65.n(v9j.i(System.nanoTime() - jNanoTime, y65.NANOSECONDS))), new Object[0]);
                return h06VarE;
            case 8:
                String str5 = (String) this.b;
                Rect rect2 = (Rect) this.c;
                l5c l5cVar4 = (l5c) ((age) ((vea) this.d).d.getValue());
                l5cVar4.getClass();
                return ave.a(str5, rect2, (int) l5cVar4.m(PmsKey.f97minimagesidesize, 64));
            case 9:
                File file3 = (File) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                vea veaVar = (vea) this.d;
                String absolutePath2 = file3.getAbsolutePath();
                int iR2 = ((l5c) ((age) veaVar.d.getValue())).r();
                Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.JPEG;
                ave.c(absolutePath2, bitmap2, iR2);
                return qqg.a;
            case 10:
                OneMeApplication oneMeApplication = (OneMeApplication) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                rwa rwaVar = OneMeApplication.s0;
                nwa nwaVar = new nwa(11);
                y4e y4eVar = y4e.a;
                boolean zB = y4eVar.b().b();
                lg8 lg8Var2 = lg8.d;
                if (zB && !atomicBoolean.get()) {
                    long jNanoTime2 = System.nanoTime();
                    mk4 mk4Var = (mk4) bi0.a.getAccessor().c(551);
                    t64 t64Var = new t64(atomicReference, i2);
                    mk4Var.getClass();
                    b73 b73Var = new b73("all.chat.folder", t64Var);
                    y4eVar.d().b();
                    hi0 hi0Var = (hi0) t1b.a.getAccessor().c(554);
                    hi0Var.getClass();
                    long jNanoTime3 = System.nanoTime();
                    hi0Var.e = !((qsb) hi0Var.a.getValue()).c(qsb.f);
                    boolean zD = ((qsb) hi0Var.a.getValue()).d();
                    hi0Var.g = !zD;
                    if (hi0Var.e || !zD) {
                        svi.g(bd5.a, new ci0(hi0Var, b73Var, null));
                    }
                    l6b l6bVar2 = wqi.a;
                    if (l6bVar2 != null && l6bVar2.b(lg8Var2)) {
                        int i6 = s65.d;
                        l6bVar2.c(lg8Var2, "BannersInitialDataStorage", "load time ".concat(s65.n(v9j.i(System.nanoTime() - jNanoTime3, y65.NANOSECONDS))), null);
                    }
                    l6b l6bVar3 = wqi.a;
                    if (l6bVar3 != null && l6bVar3.b(lg8Var2)) {
                        int i7 = s65.d;
                        l6bVar3.c(lg8Var2, "InitialDataStorage", "bannersInitialDataStorage.load by ".concat(s65.n(v9j.i(System.nanoTime() - jNanoTime2, y65.NANOSECONDS))), null);
                    }
                }
                if (((Boolean) atomicReference.get()).booleanValue() || !zB) {
                    wqi.c(oneMeApplication.Y, "LegacyChats: async load", new Object[0]);
                    ((q2b) y4e.a.j()).b().mo13dispatch(bia.a, new awa(i4, nwaVar));
                } else {
                    wqi.c(oneMeApplication.Y, "LegacyChats: sync load", new Object[0]);
                    nwaVar.invoke();
                }
                return qqg.a;
            case 11:
                k18 k18Var5 = (k18) this.b;
                k18 k18Var6 = (k18) this.c;
                x79 x79Var = (x79) this.d;
                return new y0b(k18Var5, k18Var6, x79Var.d, (c47) x79Var.b);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                o2b o2bVar = (o2b) this.b;
                si9 si9Var = (si9) this.c;
                pb2 pb2Var = (pb2) this.d;
                c7c c7cVar = (c7c) o2bVar.j.getValue();
                d7c d7cVar = (d7c) c7cVar.c.computeIfAbsent(Long.valueOf(si9Var.a), new ni(24, new uv1(c7cVar, si9Var, pb2Var, 8)));
                d7cVar.i(pb2Var);
                return d7cVar;
            case 13:
                return new m0a((k18) this.b, (k18) this.c, (k18) this.d);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                final vad vadVar = (vad) this.b;
                final k18 k18Var7 = (k18) this.c;
                final k18 k18Var8 = (k18) this.d;
                return new iu3() { // from class: mad
                    @Override // defpackage.iu3
                    public final void accept(Object obj) {
                        vad vadVar2 = vadVar;
                        svi.e(vadVar2.a, ((kl4) k18Var7.getValue()).a, null, new rad(k18Var8, vadVar2, (long[]) obj, null), 2);
                    }
                };
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                d6 d6Var = (d6) this.b;
                RootController rootController = (RootController) this.c;
                cm6 cm6Var = (cm6) this.d;
                if (((ksd) d6Var).getT0()) {
                    j8j.a(rootController, d6Var.getIntent());
                    cm6Var.invoke();
                }
                j8j.d(d6Var, d6Var.getIntent());
                return qqg.a;
            case 16:
                ((ge3) this.b).V0.invoke(new up9((n2f) this.c, ((MessageModel) this.d).a, null));
                return qqg.a;
            case LangUtils.HASH_SEED /* 17 */:
                ((ge3) this.b).V0.invoke(new up9((n2f) this.c, ((MessageModel) this.d).a, null));
                return qqg.a;
            case 18:
                cqf cqfVar = (cqf) this.b;
                v0b v0bVar = (v0b) this.c;
                ((SuggestionsWidget) cqfVar).P0().J0.setValue(new zpf(v0bVar.getAnchorButton(), (fqf) this.d));
                return qqg.a;
            case 19:
                return ((u6b) ((ytf) this.b).a.f.getValue()).b(((ttg) this.c).a.a, ((q34) this.d).c);
            case 20:
                msf msfVar = (msf) this.b;
                a8h a8hVar = (a8h) this.c;
                u75 u75Var = (u75) this.d;
                Size size = msfVar.b;
                boolean z = msfVar.e.n().h() == 0;
                String str6 = a8hVar.a;
                l6b l6bVar4 = wqi.a;
                if (l6bVar4 != null) {
                    lg8 lg8Var3 = lg8.d;
                    if (l6bVar4.b(lg8Var3)) {
                        l6bVar4.c(lg8Var3, str6, "onInputSurface, surface_request_resolution=" + size + ", dr=" + u75Var + ", isFrontCamera=" + z, null);
                    }
                }
                r8h r8hVar = a8hVar.t0;
                if (r8hVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ho6.d((AtomicBoolean) r8hVar.c, true);
                ho6.c((Thread) r8hVar.e);
                SurfaceTexture surfaceTexture = new SurfaceTexture(r8hVar.b);
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                Surface surface = new Surface(surfaceTexture);
                a8hVar.v0++;
                msfVar.c(a8hVar.o, new ssb(a8hVar, u75Var, objArr == true ? 1 : 0, 15));
                msfVar.b(surface, a8hVar.o, new z7h(a8hVar, msfVar, surfaceTexture, surface));
                surfaceTexture.setOnFrameAvailableListener(new w7h(a8hVar, z), a8hVar.d);
                return qqg.a;
            default:
                VideoMessageWidget videoMessageWidget = (VideoMessageWidget) this.b;
                svi.e(videoMessageWidget.getViewLifecycleScope(), null, null, new dah(videoMessageWidget, (sid) this.c, (l5h) this.d, null), 3);
                return qqg.a;
        }
    }
}
