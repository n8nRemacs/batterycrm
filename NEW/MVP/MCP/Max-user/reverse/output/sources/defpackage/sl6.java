package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import one.me.android.join.JoinChatWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.externcalls.sdk.api.request.GetOkIdByExternalId;
import ru.ok.android.externcalls.sdk.audio.KeywordSpotterManagerImpl;
import ru.ok.messages.media.crop.FrgTamCropImage;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class sl6 implements gu3, ox7, vva, yc7, o7c, km7, dcb, NativeDoubleArrayConsumer.Consumer, uu1, usa, m7c, nk8, ax8, uy8, frf, y89, fu3, w89, tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sl6(int i, mie mieVar) {
        this.a = 19;
        this.b = mieVar;
    }

    @Override // defpackage.vva
    public void a(Object obj) {
        ((d92) this.b).invoke(obj);
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        int i = this.a;
        int i2 = 0;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                FrgTamCropImage frgTamCropImage = (FrgTamCropImage) obj2;
                d6 d6VarU0 = frgTamCropImage.u0();
                if (d6VarU0 != null) {
                    d6VarU0.setResult(0);
                    efi.r(d6VarU0, d6VarU0.getString(mvd.D), 0);
                    frgTamCropImage.s0();
                    break;
                }
                break;
            case 11:
                ((nm0) obj2).f((List) obj);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                wqi.g("zd8", (Throwable) obj, "loadThumbnail: %d, thumbnailUri validate error", Long.valueOf(((zd8) obj2).o.b));
                break;
            case 16:
                hp8 hp8Var = ((xn8) obj2).b;
                hp8Var.b((xo0) obj);
                hp8Var.d();
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                a5c a5cVar = (a5c) obj;
                a5cVar.m0();
                a5cVar.a.s1((Surface) obj2);
                break;
            default:
                x10 x10Var = (x10) obj;
                long j = ((qi9) obj2).c.a.j();
                for (int i3 = 0; i3 < x10Var.b(); i3++) {
                    to8.t(x10Var, x10Var.d(i3).r, new t00(j, i2));
                }
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        bz1 bz1Var;
        switch (this.a) {
            case 28:
                um9 um9Var = (um9) this.b;
                an9 an9Var = (an9) obj;
                wm9 wm9Var = new wm9();
                cl9 cl9Var = um9Var.a;
                u10 u10Var = null;
                if (cl9Var == null) {
                    bz1Var = null;
                } else {
                    bz1Var = new bz1();
                    bz1Var.b = cl9Var.b;
                    bz1Var.a = cl9Var.a;
                    bz1Var.c = cl9Var.c;
                }
                wm9Var.a = bz1Var;
                wm9Var.c = um9Var.c;
                wm9Var.b = um9Var.b;
                wm9Var.d = um9Var.d;
                p2h p2hVar = um9Var.e;
                if (p2hVar != null) {
                    u10Var = new u10();
                    u10Var.b = p2hVar.c;
                    u10Var.a = p2hVar.b;
                    u10Var.c = p2hVar.a;
                    u10Var.d = p2hVar.d;
                }
                wm9Var.e = u10Var;
                an9Var.getClass();
                return new kk3(2, new ci(an9Var, 20, wm9Var));
            default:
                cl9 cl9Var2 = (cl9) this.b;
                an9 an9Var2 = (an9) obj;
                long j = cl9Var2.a;
                long j2 = cl9Var2.b;
                String str = cl9Var2.c;
                an9Var2.getClass();
                return new kk3(2, new ym9(an9Var2, j, j2, str));
        }
    }

    @Override // defpackage.ax8
    public int b(Object obj) {
        try {
            return ((ow8) obj).c((gf6) this.b) ? 1 : 0;
        } catch (MediaCodecUtil$DecoderQueryException unused) {
            return -1;
        }
    }

    @Override // defpackage.uy8
    public void c(ly8 ly8Var) throws RemoteException {
        switch (this.a) {
            case 18:
                wie wieVar = (wie) this.b;
                if (ly8Var.isConnected() && ly8Var.j.isEmpty()) {
                    wie wieVar2 = ly8Var.o.c;
                    if (wieVar2.c < wieVar.c && rei.a(wieVar, wieVar2)) {
                        ly8Var.o = ly8Var.o.g(wieVar);
                        break;
                    }
                }
                break;
            case 19:
                px8 px8Var = ly8Var.a;
                mie mieVar = (mie) this.b;
                if (ly8Var.isConnected()) {
                    px8Var.getClass();
                    hsi.g(Looper.myLooper() == px8Var.o.getLooper());
                    px8Var.d.u(mieVar);
                    break;
                }
                break;
            case 20:
                Bundle bundle = (Bundle) this.b;
                if (ly8Var.isConnected()) {
                    zjd zjdVar = ly8Var.s;
                    zjd zjdVar2 = ly8Var.t;
                    ly8Var.D = bundle;
                    zjd zjdVarX = ly8.X(ly8Var.r, ly8Var.q, ly8Var.u, ly8Var.x, bundle);
                    ly8Var.s = zjdVarX;
                    ly8Var.t = ly8.W(zjdVarX, ly8Var.q, ly8Var.D, ly8Var.u, ly8Var.x);
                    boolean zEquals = ly8Var.s.equals(zjdVar);
                    ly8Var.t.equals(zjdVar2);
                    px8 px8Var2 = ly8Var.a;
                    px8Var2.getClass();
                    hsi.g(Looper.myLooper() == px8Var2.o.getLooper());
                    nx8 nx8Var = px8Var2.d;
                    nx8Var.getClass();
                    if (!zEquals) {
                        nx8Var.z();
                        break;
                    }
                }
                break;
            default:
                js3 js3Var = (js3) this.b;
                tje tjeVar = ly8Var.e;
                px8 px8Var3 = ly8Var.a;
                if (ly8Var.y != null) {
                    a8i.g("MCImplBase", "Cannot be notified about the connection result many times. Probably a bug or malicious app.");
                    px8Var3.w();
                    break;
                } else {
                    eb7 eb7Var = js3Var.c;
                    wg7 wg7Var = js3Var.n;
                    Bundle bundle2 = js3Var.i;
                    ly8Var.y = eb7Var;
                    ly8Var.p = js3Var.d;
                    ly8Var.u = js3Var.e;
                    o3c o3cVar = js3Var.f;
                    ly8Var.v = o3cVar;
                    o3c o3cVar2 = js3Var.g;
                    ly8Var.w = o3cVar2;
                    o3c o3cVarM = ly8.m(o3cVar, o3cVar2);
                    ly8Var.x = o3cVarM;
                    wg7 wg7Var2 = js3Var.k;
                    ly8Var.q = wg7Var2;
                    wg7 wg7Var3 = js3Var.l;
                    ly8Var.r = wg7Var3;
                    zjd zjdVarX2 = ly8.X(wg7Var3, wg7Var2, ly8Var.u, o3cVarM, bundle2);
                    ly8Var.s = zjdVarX2;
                    ly8Var.t = ly8.W(zjdVarX2, ly8Var.q, bundle2, ly8Var.u, ly8Var.x);
                    lk6 lk6Var = new lk6(4);
                    for (int i = 0; i < wg7Var.size(); i++) {
                        bg3 bg3Var = (bg3) wg7Var.get(i);
                        aie aieVar = bg3Var.a;
                        if (aieVar != null && aieVar.a == 0) {
                            lk6Var.T(aieVar.b, bg3Var);
                        }
                    }
                    lk6Var.u();
                    ly8Var.o = js3Var.j;
                    MediaSession.Token tokenG = js3Var.m;
                    if (tokenG == null) {
                        tokenG = tjeVar.a.g();
                    }
                    if (tokenG != null) {
                        ly8Var.z = new MediaController(ly8Var.d, tokenG);
                    }
                    try {
                        js3Var.c.asBinder().linkToDeath(ly8Var.g, 0);
                        ly8Var.l = new tje(tjeVar.a.getUid(), js3Var.a, js3Var.b, tjeVar.a.getPackageName(), js3Var.c, js3Var.h, tokenG);
                        ly8Var.D = bundle2;
                        px8Var3.r();
                        break;
                    } catch (RemoteException unused) {
                        px8Var3.w();
                    }
                }
                break;
        }
    }

    @Override // org.webrtc.NativeDoubleArrayConsumer.Consumer
    public void consume(Double[] dArr) {
        KeywordSpotterManagerImpl.consumer$lambda$2((KeywordSpotterManagerImpl) this.b, dArr);
    }

    @Override // defpackage.usa
    public void e(ira iraVar) throws IllegalArgumentException {
        Bitmap scaledFrameAtTime;
        hd8 hd8Var = (hd8) this.b;
        f2h f2hVar = hd8Var.e;
        if (f2hVar == null) {
            if (iraVar.e()) {
                return;
            }
            iraVar.onError(new IllegalStateException("Video content can't be null"));
            return;
        }
        hd8Var.h.setDataSource(f2hVar.a().getPath());
        try {
            hd8Var.j = Long.parseLong(hd8Var.h.extractMetadata(9));
        } catch (Exception e) {
            wqi.e("hd8", "Can'e extract duration", e);
            hd8Var.j = ((ml0) hd8Var.e).a;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i2 < hd8Var.i && !iraVar.e()) {
            long j = (hd8Var.j / hd8Var.i) * i2 * 1000;
            if (Build.VERSION.SDK_INT >= 27) {
                scaledFrameAtTime = hd8Var.h.getScaledFrameAtTime(j, 2, hd8Var.c, hd8Var.d);
            } else {
                Bitmap frameAtTime = hd8Var.h.getFrameAtTime(j, 2);
                if (frameAtTime == null) {
                    scaledFrameAtTime = null;
                } else {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(hd8Var.c, hd8Var.d, frameAtTime.getConfig());
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    float fMax = Math.max(hd8Var.c / frameAtTime.getWidth(), hd8Var.d / frameAtTime.getHeight());
                    int width = (int) (frameAtTime.getWidth() * fMax);
                    int height = (int) (frameAtTime.getHeight() * fMax);
                    canvas.drawBitmap(frameAtTime, new Rect(i, i, frameAtTime.getWidth(), frameAtTime.getHeight()), new Rect((hd8Var.c - width) / 2, (hd8Var.d - height) / 2, width, height), (Paint) null);
                    frameAtTime.recycle();
                    scaledFrameAtTime = bitmapCreateBitmap;
                }
            }
            if (!iraVar.e()) {
                arrayList.add(scaledFrameAtTime);
                iraVar.d(arrayList);
            }
            i2++;
            i = 0;
        }
    }

    @Override // defpackage.nk8
    public void f() {
        sk8 sk8Var = (sk8) this.b;
        ((OneMeDraweeView) sk8Var.a.b).setVisibility(8);
        if (sk8Var.c) {
            sk8Var.d = true;
        }
    }

    @Override // defpackage.frf
    public Object get() {
        v39 v39Var = (v39) this.b;
        HashMap map = v39Var.b;
        w39 w39Var = w39.d;
        xd8 xd8Var = (xd8) map.get(w39Var);
        if (xd8Var != null) {
            xd8Var.c();
            xd8Var.g = null;
        }
        HashMap map2 = v39Var.a;
        fl5 fl5Var = (fl5) map2.get(w39Var);
        if (fl5Var == null) {
            fl5 fl5Var2 = new fl5(v39Var.d, v39Var.e, v39Var.k, v39Var.i, v39Var.f.a);
            map2.put(w39Var, fl5Var2);
            fl5Var = fl5Var2;
        }
        xd8 xd8Var2 = new xd8(w39Var, fl5Var, v39Var, v39Var.d, 1.0f, false, true);
        map.put(w39Var, xd8Var2);
        return xd8Var2;
    }

    @Override // defpackage.w89
    public void h(a5c a5cVar, u69 u69Var) {
        ((fu3) this.b).accept(a5cVar);
    }

    @Override // defpackage.km7
    public boolean j(kce kceVar, int i, Bundle bundle) {
        c34 iv6Var;
        View view = (View) this.b;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((ukd) kceVar.b).b).requestPermission();
                InputContentInfo inputContentInfo = (InputContentInfo) ((ukd) kceVar.b).b;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        ukd ukdVar = (ukd) kceVar.b;
        ukd ukdVar2 = (ukd) kceVar.b;
        ClipData clipData = new ClipData(((InputContentInfo) ukdVar.b).getDescription(), new ClipData.Item(((InputContentInfo) ukdVar2.b).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            iv6Var = new iv6(clipData, 2);
        } else {
            d34 d34Var = new d34();
            d34Var.b = clipData;
            d34Var.c = 2;
            iv6Var = d34Var;
        }
        iv6Var.d(((InputContentInfo) ukdVar2.b).getLinkUri());
        iv6Var.setExtras(bundle);
        return hfh.j(view, iv6Var.build()) == null;
    }

    @Override // defpackage.yc7
    public void k(jke jkeVar) {
        ((yc7) this.b).k(jkeVar);
    }

    @Override // defpackage.dcb
    public void l(ecb ecbVar) {
        JoinChatWidget joinChatWidget = (JoinChatWidget) this.b;
        if (ecbVar == ecb.o) {
            try {
                joinChatWidget.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(z7.e(joinChatWidget.getContext(), mvd.Q0))));
            } catch (ActivityNotFoundException e) {
                wqi.e(JoinChatWidget.class.getName(), "error handleUrl faq for restricted user. Reason - " + e.getMessage(), e);
            }
        }
    }

    @Override // defpackage.uu1
    public String m(tu1 tu1Var) {
        xt4 xt4Var = (xt4) this.b;
        ayi.d().execute(new qz5(xt4Var, 20, tu1Var));
        return xt4Var + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    @Override // defpackage.y89
    public Object n(o79 o79Var, u69 u69Var, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 23:
                return o79Var.l(u69Var, (wg7) obj);
            default:
                w89 w89Var = (w89) obj;
                bg7 bg7Var = bg7.b;
                if (!o79Var.j()) {
                    w89Var.h(o79Var.t, u69Var);
                    z89.X(o79Var, u69Var, i, new yie(0));
                }
                return bg7.b;
        }
    }

    @Override // defpackage.ox7
    public Object parse(xx7 xx7Var) {
        return ((GetOkIdByExternalId.Response.Companion) this.b).parse(xx7Var);
    }

    @Override // defpackage.m7c
    public boolean test(Object obj) {
        return ((Locale) obj).getLanguage().equals(((Locale) this.b).getLanguage());
    }

    public /* synthetic */ sl6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ sl6(he7 he7Var, ArrayList arrayList) {
        this.a = 5;
        this.b = arrayList;
    }

    @Override // defpackage.o7c
    /* renamed from: apply */
    public boolean mo44apply(Object obj) {
        ArrayList arrayList = (ArrayList) this.b;
        String strB = ((ty0) obj).b();
        for (int i = 0; i < arrayList.size(); i++) {
            if (!TextUtils.isEmpty(strB) && strB.startsWith((String) arrayList.get(i))) {
                return false;
            }
        }
        return true;
    }
}
