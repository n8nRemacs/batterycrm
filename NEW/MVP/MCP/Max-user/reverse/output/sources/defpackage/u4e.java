package defpackage;

import android.net.Uri;
import android.os.Build;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import one.me.settings.media.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.ringtone.ui.SettingRingtoneScreen;
import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class u4e implements xld, m7c, lud, gu3, b9e, w2f, zua, tm6, fu3, uu1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u4e(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.zua
    public g4i I(View view, g4i g4iVar) {
        ms0 ms0Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 13:
                mdf mdfVar = (mdf) obj;
                if (mdfVar.g) {
                    return g4iVar;
                }
                mdfVar.e = g4iVar;
                WindowInsets windowInsetsG = g4iVar.g();
                if (windowInsetsG != null) {
                    if (Build.VERSION.SDK_INT < 31 || (ms0Var = mdfVar.b.d) == null || !ms0Var.c) {
                        windowInsetsG = null;
                    }
                    if (windowInsetsG != null) {
                        RoundedCorner roundedCorner = windowInsetsG.getRoundedCorner(3);
                        int radius = roundedCorner != null ? roundedCorner.getRadius() : 0;
                        RoundedCorner roundedCorner2 = windowInsetsG.getRoundedCorner(2);
                        iMax = Math.max(radius / 2, (roundedCorner2 != null ? roundedCorner2.getRadius() : 0) / 2);
                    }
                }
                mdfVar.f = iMax;
                mdfVar.c(g4iVar);
                return mdfVar.d(g4iVar);
            default:
                Toolbar toolbar = (Toolbar) ((qs3) obj).c;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) toolbar.getLayoutParams();
                e4i e4iVar = g4iVar.a;
                marginLayoutParams.topMargin = e4iVar.f(7).b;
                toolbar.setLayoutParams(marginLayoutParams);
                int i2 = e4iVar.f(7).c;
                WeakHashMap weakHashMap = hfh.a;
                if (toolbar.getPaddingEnd() != i2) {
                    toolbar.setPaddingRelative(toolbar.getPaddingStart(), toolbar.getPaddingTop(), i2, toolbar.getPaddingBottom());
                }
                yni.b(toolbar, e4iVar.f(7).a);
                return g4iVar;
        }
    }

    @Override // defpackage.lud
    public void a(gud gudVar, rud rudVar) {
        gfe gfeVar = (gfe) this.b;
        Integer num = ((rmd) rudVar).a;
        if (num != null) {
            t7c t7cVar = gfeVar.v;
            t7cVar.a.edit().putInt("estimatedPerformanceIndex", num.intValue()).apply();
        }
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        pze pzeVar;
        switch (this.a) {
            case 6:
                cf8 cf8Var = (cf8) this.b;
                x00 x00Var = (x00) obj;
                h10 h10Var = x00Var.v;
                if (h10Var == null) {
                    h10Var = h10.j;
                }
                g10 g10VarA = h10Var.a();
                g10VarA.a = cf8Var;
                x00Var.v = g10VarA.a();
                x00Var.i = p10.c;
                break;
            case 11:
                ((rve) this.b).b.reportException("SharedPeerConnectionFac", "Can't restart audio on start error", new IllegalStateException("Audio restart failed", (Throwable) obj));
                break;
            case 20:
                mof mofVar = (mof) this.b;
                kb4 kb4Var = (kb4) obj;
                lof lofVar = new lof(kb4Var.b, rha.o(kb4Var.a, kb4Var.c));
                mofVar.c.add(lofVar);
                long j = mofVar.t0;
                if (j == -9223372036854775807L || kb4Var.d >= j) {
                    mofVar.a(lofVar);
                    break;
                }
                break;
            case 21:
                ((tg7) this.b).a((kb4) obj);
                break;
            case 25:
                wqi.c("de6", "Tam emoji font loaded", new Object[0]);
                ((eaj) this.b).b((hz9) obj);
                break;
            case 26:
                wqi.e("e5g", "process: failed for text " + ((Object) ((CharSequence) this.b)), (Throwable) obj);
                break;
            default:
                i40 i40Var = (i40) this.b;
                d0f d0fVar = (d0f) obj;
                d0f d0fVar2 = (d0f) i40Var.h;
                if (d0fVar2 != null) {
                    if (!d0fVar2.equals(d0fVar) || i40Var.b) {
                        if (!((k01) ((zid) i40Var.d).a).F0) {
                            k01 k01Var = (k01) ((zid) i40Var.d).a;
                            if (k01Var.H) {
                                if ((k01Var.v || k01Var.u()) && (pzeVar = ((k01) ((hfd) i40Var.c).b).k) != null) {
                                    si1 si1Var = (si1) i40Var.f;
                                    pzeVar.d(new vze(d0fVar, si1Var != null && si1Var.w, si1Var != null && si1Var.x), false, null, (e01) i40Var.g);
                                    i40Var.h = d0fVar;
                                    i40Var.b = false;
                                    break;
                                }
                            }
                        } else {
                            i40Var.b = true;
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                jef jefVar = (jef) obj;
                tef tefVar = ((wef) this.b).b;
                tefVar.a.put(Long.valueOf(jefVar.a), jefVar);
                bwd.a(new v64(tefVar, 10, jefVar), new ycd(17), tefVar.h);
                return e2f.g(jefVar);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                xff xffVar = (xff) this.b;
                long j = xffVar.a;
                qff qffVar = new qff();
                qffVar.a = j;
                qffVar.b = xffVar.b;
                qffVar.c = xffVar.c;
                qffVar.d = xffVar.d;
                qffVar.e = xffVar.e;
                qffVar.f = xffVar.f;
                qffVar.g = xffVar.g;
                qffVar.h = (List) obj;
                qffVar.i = xffVar.i;
                return new sff(qffVar);
            default:
                long[] jArr = (long[]) this.b;
                jgf jgfVar = (jgf) obj;
                jgfVar.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT * FROM sticker_sets WHERE id IN (");
                int length = jArr == null ? 1 : jArr.length;
                lc4.a(sb, length);
                sb.append(")");
                dsd dsdVarC = dsd.c(length, sb.toString());
                if (jArr == null) {
                    dsdVarC.S(1);
                } else {
                    int i = 1;
                    for (long j2 : jArr) {
                        dsdVarC.k(i, j2);
                        i++;
                    }
                }
                return new yr8(new jad(jgfVar, 12, dsdVarC));
        }
    }

    @Override // defpackage.xld
    public void e(long j, umb umbVar) {
        uyi.a(j, umbVar, ((qae) this.b).c);
    }

    @Override // defpackage.b9e
    public int g(int i) {
        switch (this.a) {
            case 7:
                m8e m8eVar = (m8e) ((t98) ((SettingMediaScreen) this.b).o.C(i));
                int iF = m8eVar.f();
                if (m8eVar.g()) {
                    return iF;
                }
                return 0;
            case 8:
                u8e u8eVar = (u8e) ((t98) ((SettingRingtoneScreen) this.b).Y.C(i));
                int iF2 = u8eVar.f();
                if (u8eVar.g()) {
                    return iF2;
                }
                return 0;
            case 9:
                i8e i8eVar = (i8e) ((t98) ((SettingsPrivacyScreen) this.b).Y.C(i));
                int iF3 = i8eVar.f();
                if (i8eVar.g()) {
                    return iF3;
                }
                return 0;
            case 10:
                y8e y8eVar = (y8e) ((t98) ((SettingsStorageScreen) this.b).c.C(i));
                int iF4 = y8eVar.f();
                if (y8eVar.g()) {
                    return iF4;
                }
                return 0;
            default:
                h8e h8eVar = (h8e) ((t98) ((StickersSettingsScreen) this.b).o.C(i));
                if (h8eVar.f() != 0) {
                    return h8eVar.f();
                }
                return 0;
        }
    }

    @Override // defpackage.w2f
    public void i(i2f i2fVar) {
        ((em6) ((y87) this.b).d).invoke(new jcf(i2fVar));
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        switch (this.a) {
            case 22:
                csf csfVar = (csf) this.b;
                csfVar.p = tu1Var;
                return "SettableFuture hashCode: " + csfVar.hashCode();
            case 23:
                ((fsf) this.b).u0 = tu1Var;
                return "SurfaceOutputImpl close future complete";
            default:
                ((r6g) this.b).k.set(tu1Var);
                return "textureViewImpl_waitForNextFrame";
        }
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        boolean z;
        switch (this.a) {
            case 4:
                xs xsVar = (xs) this.b;
                fce fceVar = (fce) obj;
                if (xsVar.isEmpty()) {
                    z = false;
                } else {
                    Iterator<E> it = xsVar.iterator();
                    while (it.hasNext()) {
                        try {
                            if (goi.a((Uri) it.next(), fceVar.a.c())) {
                                z = true;
                            }
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    }
                    z = false;
                }
                if (z) {
                    return false;
                }
                pd8 pd8Var = fceVar.a;
                return ((pd8Var instanceof g00) || pd8Var.c.startsWith("content://")) ? false : true;
            default:
                return ((ytb) obj).o == ((ku3) this.b).q();
        }
    }

    public /* synthetic */ u4e(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj2;
    }
}
