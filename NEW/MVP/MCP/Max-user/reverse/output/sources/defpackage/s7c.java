package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.soloader.NoBaseApkException;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import one.me.devmenu.DevMenuFeatureTogglesPageScreen;
import one.me.messages.list.ui.MessagesListWidget;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s7c implements mhd, pkf, cbb, be7, lva, yt, il8, ab3, rn6, ou1 {
    public static final s7c c = new s7c("", null);
    public Object a;
    public Object b;

    public /* synthetic */ s7c(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public void A(fe6 fe6Var) {
        Handler handler = (Handler) this.b;
        nud nudVar = (nud) this.a;
        int i = fe6Var.b;
        if (i != 0) {
            handler.post(new xk0(nudVar, i, 1));
        } else {
            handler.post(new yn6(nudVar, 5, fe6Var.a));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x022b, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01fc A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TryCatch #2 {IOException -> 0x008c, XmlPullParserException -> 0x008f, blocks: (B:19:0x005e, B:114:0x022b, B:26:0x0070, B:27:0x007e, B:51:0x00bb, B:29:0x0082, B:36:0x0092, B:39:0x009c, B:42:0x00a6, B:52:0x00c9, B:53:0x00d1, B:90:0x0146, B:91:0x014d, B:92:0x0165, B:94:0x0168, B:95:0x0173, B:96:0x018b, B:98:0x018e, B:99:0x0199, B:100:0x01b1, B:102:0x01b4, B:103:0x01be, B:104:0x01d6, B:106:0x01d9, B:107:0x01e3, B:108:0x01fb, B:109:0x01fc, B:110:0x0209, B:111:0x0216, B:112:0x021f, B:55:0x00d6, B:58:0x00e1, B:61:0x00ec, B:64:0x00f5, B:67:0x0100, B:70:0x010a, B:73:0x0114, B:76:0x011e, B:79:0x0128, B:82:0x0132, B:113:0x0228), top: B:122:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0209 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TryCatch #2 {IOException -> 0x008c, XmlPullParserException -> 0x008f, blocks: (B:19:0x005e, B:114:0x022b, B:26:0x0070, B:27:0x007e, B:51:0x00bb, B:29:0x0082, B:36:0x0092, B:39:0x009c, B:42:0x00a6, B:52:0x00c9, B:53:0x00d1, B:90:0x0146, B:91:0x014d, B:92:0x0165, B:94:0x0168, B:95:0x0173, B:96:0x018b, B:98:0x018e, B:99:0x0199, B:100:0x01b1, B:102:0x01b4, B:103:0x01be, B:104:0x01d6, B:106:0x01d9, B:107:0x01e3, B:108:0x01fb, B:109:0x01fc, B:110:0x0209, B:111:0x0216, B:112:0x021f, B:55:0x00d6, B:58:0x00e1, B:61:0x00ec, B:64:0x00f5, B:67:0x0100, B:70:0x010a, B:73:0x0114, B:76:0x011e, B:79:0x0128, B:82:0x0132, B:113:0x0228), top: B:122:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0216 A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TryCatch #2 {IOException -> 0x008c, XmlPullParserException -> 0x008f, blocks: (B:19:0x005e, B:114:0x022b, B:26:0x0070, B:27:0x007e, B:51:0x00bb, B:29:0x0082, B:36:0x0092, B:39:0x009c, B:42:0x00a6, B:52:0x00c9, B:53:0x00d1, B:90:0x0146, B:91:0x014d, B:92:0x0165, B:94:0x0168, B:95:0x0173, B:96:0x018b, B:98:0x018e, B:99:0x0199, B:100:0x01b1, B:102:0x01b4, B:103:0x01be, B:104:0x01d6, B:106:0x01d9, B:107:0x01e3, B:108:0x01fb, B:109:0x01fc, B:110:0x0209, B:111:0x0216, B:112:0x021f, B:55:0x00d6, B:58:0x00e1, B:61:0x00ec, B:64:0x00f5, B:67:0x0100, B:70:0x010a, B:73:0x0114, B:76:0x011e, B:79:0x0128, B:82:0x0132, B:113:0x0228), top: B:122:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021f A[Catch: IOException -> 0x008c, XmlPullParserException -> 0x008f, TryCatch #2 {IOException -> 0x008c, XmlPullParserException -> 0x008f, blocks: (B:19:0x005e, B:114:0x022b, B:26:0x0070, B:27:0x007e, B:51:0x00bb, B:29:0x0082, B:36:0x0092, B:39:0x009c, B:42:0x00a6, B:52:0x00c9, B:53:0x00d1, B:90:0x0146, B:91:0x014d, B:92:0x0165, B:94:0x0168, B:95:0x0173, B:96:0x018b, B:98:0x018e, B:99:0x0199, B:100:0x01b1, B:102:0x01b4, B:103:0x01be, B:104:0x01d6, B:106:0x01d9, B:107:0x01e3, B:108:0x01fb, B:109:0x01fc, B:110:0x0209, B:111:0x0216, B:112:0x021f, B:55:0x00d6, B:58:0x00e1, B:61:0x00ec, B:64:0x00f5, B:67:0x0100, B:70:0x010a, B:73:0x0114, B:76:0x011e, B:79:0x0128, B:82:0x0132, B:113:0x0228), top: B:122:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x022b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s7c.B(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void C(boolean z) {
        kc5 kc5Var = (kc5) ((ab5) this.b).a.c;
        if (kc5Var.X != z) {
            if (kc5Var.c != null) {
                ta5 ta5VarA = ta5.a();
                ic5 ic5Var = kc5Var.c;
                ta5VarA.getClass();
                z5j.e(ic5Var, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = ta5VarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    ta5VarA.b.remove(ic5Var);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            kc5Var.X = z;
            if (z) {
                kc5.a(kc5Var.a, ta5.a().b());
            }
        }
    }

    public ty D() throws IOException {
        File file = (File) this.b;
        File file2 = (File) this.a;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                String strValueOf = String.valueOf(file2);
                String strValueOf2 = String.valueOf(file);
                StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 37);
                sb.append("Couldn't rename file ");
                sb.append(strValueOf);
                sb.append(" to backup file ");
                sb.append(strValueOf2);
                Log.w("AtomicFile", sb.toString());
            }
        }
        try {
            return new ty(file2, 0);
        } catch (FileNotFoundException e) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                String strValueOf3 = String.valueOf(file2);
                StringBuilder sb2 = new StringBuilder(strValueOf3.length() + 16);
                sb2.append("Couldn't create ");
                sb2.append(strValueOf3);
                throw new IOException(sb2.toString(), e);
            }
            try {
                return new ty(file2, 0);
            } catch (FileNotFoundException e2) {
                String strValueOf4 = String.valueOf(file2);
                StringBuilder sb3 = new StringBuilder(strValueOf4.length() + 16);
                sb3.append("Couldn't create ");
                sb3.append(strValueOf4);
                throw new IOException(sb3.toString(), e2);
            }
        }
    }

    public void E(int i) {
        tcf tcfVar = (tcf) this.a;
        in9 in9Var = (in9) tcfVar.getValue();
        if (i == 4) {
            if ((in9Var != null ? in9Var.a : 0) != 2) {
                return;
            }
        }
        if (i == 0) {
            i = (in9Var != null ? in9Var.a : 0) == 2 ? 3 : 2;
        }
        tcfVar.m(null, new in9(i));
    }

    @Override // defpackage.cbb
    public void J(CharSequence charSequence) {
        tcf tcfVar = ((DevMenuFeatureTogglesPageScreen) this.a).Z;
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        tcfVar.m(null, string);
    }

    @Override // defpackage.rn6, defpackage.v2f
    public void a(Object obj) {
        ((Surface) this.a).release();
        ((SurfaceTexture) this.b).release();
    }

    @Override // defpackage.cbb
    public void a0() {
        ((DevMenuFeatureTogglesPageScreen) this.a).Z.m(null, "");
    }

    @Override // defpackage.be7
    public void b() {
        AtomicLong atomicLong = (AtomicLong) ((usd) this.b).b;
        for (long j = atomicLong.get(); !atomicLong.compareAndSet(j, ((((int) (j >>> 32)) + 1) << 32) | (4294967295L & (((int) (j & 4294967295L)) + 1))); j = atomicLong.get()) {
        }
    }

    public s74 d() {
        return new s74(this);
    }

    @Override // defpackage.be7
    public void f() {
        AtomicLong atomicLong = (AtomicLong) ((usd) this.b).b;
        for (long j = atomicLong.get(); !atomicLong.compareAndSet(j, ((((int) (j >>> 32)) - 1) << 32) | (4294967295L & ((int) (j & 4294967295L)))); j = atomicLong.get()) {
        }
    }

    public boolean g(int i) {
        return ((a26) this.a).a.get(i);
    }

    @Override // defpackage.yt
    public au h(g95 g95Var, Looper looper, zt ztVar, ym3 ym3Var) {
        return new nd7((Context) this.a, g95Var, ztVar, (gp0) this.b, ym3Var.a);
    }

    @Override // defpackage.ou1
    public void i(mbd mbdVar, ood oodVar) {
        ((l42) this.a).resumeWith(oodVar);
    }

    @Override // defpackage.ou1
    public void j(mbd mbdVar, IOException iOException) {
        IOException iOException2 = (IOException) this.b;
        l42 l42Var = (l42) this.a;
        if (l42Var.isCancelled()) {
            return;
        }
        if (iOException2 != null) {
            iOException2.initCause(iOException);
        }
        if (iOException2 != null) {
            iOException = iOException2;
        }
        l42Var.resumeWith(new ipd(iOException));
    }

    @Override // defpackage.ab3
    public boolean k(ClickableSpan clickableSpan, int i, int i2, String str, i88 i88Var, MotionEvent motionEvent) {
        List listJ;
        sh9 sh9Var = (sh9) this.a;
        long j = ((bi9) this.b).J0;
        MessagesListWidget messagesListWidget = ((kv9) sh9Var).a;
        yy7[] yy7VarArr = MessagesListWidget.b1;
        vu9 vu9VarK0 = messagesListWidget.K0();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (vu9VarK0.D().g()) {
            vu9VarK0.D().h(j);
            return true;
        }
        if (i88Var != i88.a && i88Var != i88.X) {
            vu9VarK0.M(j);
            return true;
        }
        int i3 = 3;
        int i4 = ooi.b(str) ? 3 : ooi.c(str) ? 2 : 1;
        f7f f7fVarB = vu9VarK0.B();
        if (f7fVarB != null) {
            ci9 ci9Var = (ci9) vu9VarK0.i1.getValue();
            int iV = az1.v(i4);
            if (iV == 0) {
                i3 = 1;
            } else if (iV != 1) {
                if (iV != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 2;
            }
            ci9Var.a(j, i3, f7fVarB, 1);
        }
        Bundle bundleB = gwi.b(new imb("messages:context_menu:message_id", Long.valueOf(j)), new imb("messages:context_menu:link_url", str));
        ci5 ci5Var = vu9VarK0.I1;
        r5g r5gVar = new r5g(str);
        int iV2 = az1.v(i4);
        if (iV2 == 0) {
            listJ = ve3.j(new b44(i88Var == i88.o ? evd.i : evd.g, new n5g(fvd.p), Integer.valueOf(yud.C0), (Integer) null, 20), new b44(evd.b, new n5g(fvd.l), Integer.valueOf(yud.u), (Integer) null, 20));
        } else if (iV2 == 1) {
            listJ = ve3.j(new b44(evd.g, new n5g(fvd.r), Integer.valueOf(yud.e0), (Integer) null, 20), new b44(evd.b, new n5g(fvd.n), Integer.valueOf(yud.u), (Integer) null, 20));
        } else {
            if (iV2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            listJ = ve3.j(new b44(evd.g, new n5g(fvd.q), Integer.valueOf(yud.C0), (Integer) null, 20), new b44(evd.b, new n5g(fvd.m), Integer.valueOf(yud.u), (Integer) null, 20));
        }
        xfh.r(ci5Var, new uxe(rawX, rawY, r5gVar, bundleB, listJ));
        return true;
    }

    @Override // defpackage.be7
    public void l() {
        AtomicLong atomicLong = (AtomicLong) ((usd) this.b).b;
        for (long j = atomicLong.get(); !atomicLong.compareAndSet(j, (((int) (j >>> 32)) << 32) | (4294967295L & (((int) (j & 4294967295L)) + 1))); j = atomicLong.get()) {
        }
    }

    @Override // defpackage.pkf
    public Object n(int i) {
        if (i >= 0) {
            return (CharSequence) ((wu9) this.a).invoke(Integer.valueOf(i));
        }
        return null;
    }

    @Override // defpackage.cbb
    public void o() {
        cpi.c((fbb) this.b);
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
    }

    @Override // defpackage.lva
    public void p(Task task) {
        lwd lwdVar = (lwd) this.b;
        String str = ((vw6) this.a).b;
        if (!task.h()) {
            wqi.e(str, "Fetching FCM registration token failed", task.e());
            lwdVar.resumeWith(null);
            return;
        }
        Object objF = task.f();
        if (objF == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        wqi.c(str, "FCM token fetched", new Object[0]);
        lwdVar.resumeWith((String) objF);
    }

    @Override // defpackage.mhd
    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, h6f[] h6fVarArr) {
        String str = ((Context) this.a).getApplicationInfo().sourceDir;
        if (!new File(str).exists()) {
            StringBuilder sbN = az1.n("Base apk does not exist: ", str, ". ");
            ((bj) this.b).r(sbN);
            throw new NoBaseApkException(sbN.toString(), unsatisfiedLinkError);
        }
        Log.w("soloader.recovery.CheckBaseApkExists", "Base apk exists: " + str);
        return false;
    }

    @Override // defpackage.pkf
    public jkf r(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.addView(new TextView(viewGroup.getContext()));
        return new kf4(frameLayout, (t75) this.b);
    }

    @Override // defpackage.be7
    public void s() {
        AtomicLong atomicLong = (AtomicLong) ((usd) this.b).b;
        for (long j = atomicLong.get(); !atomicLong.compareAndSet(j, ((((int) (j >>> 32)) + 1) << 32) | (4294967295L & (((int) (j & 4294967295L)) + 1))); j = atomicLong.get()) {
        }
    }

    @Override // defpackage.pkf
    public void t(jkf jkfVar, int i) {
        ((kf4) jkfVar).d.setText((CharSequence) n(i));
    }

    public KeyListener u(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((ab5) this.b).a.getClass();
        if (keyListener instanceof mb5) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new mb5(keyListener);
    }

    public Long v(String str) {
        lrd lrdVar = (lrd) this.a;
        dsd dsdVarC = dsd.c(1, "SELECT long_value FROM Preference where `key`=?");
        dsdVarC.f(1, str);
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            Long lValueOf = null;
            if (cursorN.moveToFirst() && !cursorN.isNull(0)) {
                lValueOf = Long.valueOf(cursorN.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    @Override // defpackage.be7
    public void w() {
        AtomicLong atomicLong = (AtomicLong) ((usd) this.b).b;
        for (long j = atomicLong.get(); !atomicLong.compareAndSet(j, ((((int) (j >>> 32)) + 1) << 32) | (4294967295L & (((int) (j & 4294967295L)) + 1))); j = atomicLong.get()) {
        }
    }

    public void x(JSONObject jSONObject) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("feedback");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    arrayList.add(v1a.F(jSONObject2));
                }
            }
            ((ju5) this.b).onFeedback(new a91(kk4.y(jSONObject), arrayList));
        } catch (JSONException e) {
            ((y6d) this.a).logException("FeedbackNotificationHandler", "Can't parse feedback", e);
        }
    }

    public void y(r7c r7cVar) {
        lrd lrdVar = (lrd) this.a;
        lrdVar.b();
        lrdVar.c();
        try {
            ((ai) this.b).B(r7cVar);
            lrdVar.q();
        } finally {
            lrdVar.k();
        }
    }

    public void z(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.a).getContext().obtainStyledAttributes(attributeSet, o6d.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(o6d.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(o6d.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            C(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public s7c(int i) {
        switch (i) {
            case 13:
                this.a = new LinkedHashMap();
                break;
            case LangUtils.HASH_SEED /* 17 */:
                tcf tcfVarA = ucf.a(null);
                this.a = tcfVarA;
                this.b = new hbd(tcfVarA);
                break;
            default:
                this.a = new AtomicReference(Float.valueOf(0.0f));
                this.b = new AtomicBoolean(false);
                break;
        }
    }

    public s7c(EditText editText) {
        this.a = editText;
        this.b = new ab5(editText, false);
    }

    public s7c(Context context, Object obj, LinkedHashSet linkedHashSet) {
        t22 t22VarA;
        wha whaVar = new wha(15);
        this.a = new HashMap();
        this.b = whaVar;
        if (obj instanceof t22) {
            t22VarA = (t22) obj;
        } else {
            t22VarA = t22.a(context, cn8.b());
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ((HashMap) this.a).put(str, new trf(context, str, t22VarA, (wha) this.b));
        }
    }
}
