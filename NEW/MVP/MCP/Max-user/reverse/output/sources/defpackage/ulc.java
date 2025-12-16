package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.Objects;
import one.me.sdk.tasks.TaskMonitor$TaskMonitorWorker;

/* loaded from: classes2.dex */
public class ulc implements dcb, tq0, rk3, gu3, kof, tm6, d9h, v5, ecj {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ulc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static d2f m(ulc ulcVar, Context context, int i) {
        cff cffVar = (cff) ulcVar.b;
        return i == uab.j ? new tk8(context, cffVar, 2) : i == uab.i ? new tk8(context, cffVar, 0) : new tk8(context, cffVar, 1);
    }

    public static String w(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return u45.k(str, " : ", str2);
    }

    @Override // defpackage.tq0
    public void a() {
        n().discardDisplayList();
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        e94 e94Var;
        switch (this.a) {
            case 3:
                wqi.e(((wge) this.b).o, "onSuccess", (Throwable) obj);
                break;
            default:
                ((Number) obj).longValue();
                f94 f94Var = (f94) ((v6d) this.b).d;
                e94 e94VarE = ((rl) f94Var.b).e();
                if (e94VarE != null && (e94Var = (e94) ((rl) f94Var.b).c) != null) {
                    f94Var.c = ((i5i) f94Var.a).k(e94VarE, e94Var);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 8:
                wqi.e("x2g", "work " + ((TaskMonitor$TaskMonitorWorker) obj2).getId() + " on error", (Throwable) obj);
                return Boolean.FALSE;
            default:
                return ((g5i) obj2).h();
        }
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void b() {
        ((l42) this.b).resumeWith(qqg.a);
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void c(py4 py4Var) {
        ((l42) this.b).e(new iqb(22, py4Var));
    }

    @Override // defpackage.ecj
    public lk6 d() {
        ra3 ra3Var = new ra3();
        t6j t6jVar = zei.c() ? t6j.TYPE_THICK : t6j.TYPE_THIN;
        u6j u6jVar = (u6j) this.b;
        ra3Var.c = t6jVar;
        awd awdVar = new awd();
        awdVar.b = u6jVar;
        ra3Var.e = new i7j(awdVar);
        return new lk6(ra3Var, 0);
    }

    @Override // defpackage.tq0
    public void e(int i) {
        n().setAlpha(i / 255.0f);
    }

    @Override // defpackage.kof
    public boolean f(hf6 hf6Var) {
        String str = hf6Var.n;
        return ((jbe) this.b).f(hf6Var) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
    }

    @Override // defpackage.tq0
    public void g(Canvas canvas, Bitmap bitmap) {
        canvas.drawRenderNode(n());
    }

    @Override // defpackage.v5
    public boolean h(View view) {
        zva zvaVar = (zva) this.b;
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = (ViewPager2) zvaVar.o;
        if (viewPager2.E0) {
            viewPager2.f(currentItem, true);
        }
        return true;
    }

    @Override // defpackage.kof
    public jof i(hf6 hf6Var) {
        jbe jbeVar = (jbe) this.b;
        String str = hf6Var.n;
        int i = hf6Var.K;
        if (str != null) {
            switch (str) {
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new p62(str, i);
                case "application/cea-708":
                    return new w62(i, hf6Var.q);
            }
        }
        if (!jbeVar.f(hf6Var)) {
            throw new IllegalArgumentException(wy1.h("Attempted to create decoder for unsupported MIME type: ", str));
        }
        tof tofVarX = jbeVar.x(hf6Var);
        tofVarX.getClass().getSimpleName().concat("Decoder");
        return new it4(tofVarX);
    }

    @Override // defpackage.tq0
    public void j(Bitmap bitmap, float f) {
        n().setPosition(0, 0, bitmap.getWidth(), bitmap.getHeight());
        n().beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        n().endRecording();
        RenderNode renderNodeN = n();
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        renderNodeN.setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.MIRROR));
    }

    public bwe k() {
        bwe bweVar = (bwe) this.b;
        int[] iArr = bweVar.b;
        int i = bweVar.e;
        iArr[0] = i;
        iArr[1] = i;
        iArr[2] = bweVar.d;
        iArr[3] = i;
        iArr[4] = i;
        float[] fArr = bweVar.a;
        fArr[0] = 0.0f;
        fArr[1] = 0.25f;
        fArr[2] = 0.5f;
        fArr[3] = 0.75f;
        fArr[4] = 1.0f;
        return bweVar;
    }

    @Override // defpackage.dcb
    public void l(ecb ecbVar) {
        ((emc) ((lmc) this.b)).b.invoke(ecbVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public RenderNode n() {
        return hld.f(this.b.getValue());
    }

    public void o() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // defpackage.rk3, defpackage.bs8
    public void onError(Throwable th) {
        ((l42) this.b).resumeWith(new ipd(th));
    }

    public void p(float f) {
        int iMin = (int) (Math.min(1.0f, Math.max(0.0f, f)) * 255.0f);
        bwe bweVar = (bwe) this.b;
        bweVar.e = (iMin << 24) | (bweVar.e & 16777215);
    }

    public void q(int i) {
        bwe bweVar = (bwe) this.b;
        bweVar.e = (i & 16777215) | (bweVar.e & (-16777216));
    }

    public void r(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(vb9.e(j, "Given a negative duration: ").toString());
        }
        ((bwe) this.b).n = j;
    }

    public void s(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(ho7.f(i, "Given invalid width: ").toString());
        }
        ((bwe) this.b).f = i;
    }

    public void t(boolean z) {
        try {
            zgi zgiVar = (zgi) this.b;
            Parcel parcelT = zgiVar.T();
            int i = mgi.a;
            parcelT.writeInt(z ? 1 : 0);
            zgiVar.V(parcelT, 1);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void u() {
        View viewFindViewById;
        View view = (View) this.b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new qg(viewFindViewById, 4));
    }

    public void v(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", w((String) this.b, str, objArr));
        }
    }

    public ulc(String str) {
        this.a = 16;
        this.b = wy1.g("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
    }

    public ulc(int i) {
        this.a = i;
        switch (i) {
            case 4:
                bwe bweVar = new bwe();
                this.b = bweVar;
                bweVar.k = PorterDuff.Mode.SRC_IN;
                break;
            case 7:
                this.b = new jbe(18);
                break;
            default:
                this.b = ipi.b(2, new efd(2));
                break;
        }
    }
}
