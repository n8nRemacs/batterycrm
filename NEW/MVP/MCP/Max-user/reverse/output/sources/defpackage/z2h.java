package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class z2h extends AppCompatTextView {
    public final y2h A0;
    public String u0;
    public boolean v0;
    public final m1h w0;
    public long x0;
    public ghb y0;
    public final rdf z0;

    public z2h(Context context) {
        super(context, null, 0);
        this.w0 = new m1h(1, this);
        this.x0 = 1000L;
        setTextSize(TypedValue.applyDimension(2, 4, Resources.getSystem().getDisplayMetrics()));
        setTextColor(-1);
        setBackgroundColor(Color.parseColor("#88000000"));
        int iApplyDimension = (int) TypedValue.applyDimension(1, 16, Resources.getSystem().getDisplayMetrics());
        setPadding(iApplyDimension, iApplyDimension, iApplyDimension, iApplyDimension);
        setFixedText("NO PLAYER");
        this.z0 = new rdf(1, this);
        this.A0 = new y2h(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFixedText(String str) {
        this.v0 = true;
        setText(str);
    }

    public final String getExtraLogInfo() {
        return this.u0;
    }

    public final ghb getPlayer() {
        return this.y0;
    }

    public final long getUpdatePeriodMillis() {
        return this.x0;
    }

    public final void j() {
        long j = this.x0;
        if (j <= 0 || this.v0) {
            return;
        }
        postDelayed(this.w0, j);
    }

    public final void k(ghb ghbVar) {
        if (this.v0) {
            this.v0 = false;
            removeCallbacks(this.w0);
            j();
        }
        l(ghbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0237 A[PHI: r29 r31 r32
  0x0237: PHI (r29v9 java.lang.String) = (r29v7 java.lang.String), (r29v7 java.lang.String), (r29v7 java.lang.String), (r29v10 java.lang.String) binds: [B:97:0x01de, B:118:0x0230, B:94:0x01cd, B:25:0x00f2] A[DONT_GENERATE, DONT_INLINE]
  0x0237: PHI (r31v11 java.lang.String) = (r31v4 java.lang.String), (r31v4 java.lang.String), (r31v7 java.lang.String), (r31v12 java.lang.String) binds: [B:97:0x01de, B:118:0x0230, B:94:0x01cd, B:25:0x00f2] A[DONT_GENERATE, DONT_INLINE]
  0x0237: PHI (r32v14 java.lang.String) = (r32v5 java.lang.String), (r32v5 java.lang.String), (r32v9 java.lang.String), (r32v15 java.lang.String) binds: [B:97:0x01de, B:118:0x0230, B:94:0x01cd, B:25:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.ghb r38) {
        /*
            Method dump skipped, instructions count: 1434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z2h.l(ghb):void");
    }

    public final void setExtraLogInfo(String str) {
        this.u0 = str;
    }

    public final void setPlayer(ghb ghbVar) {
        ghb ghbVar2 = this.y0;
        if (fni.a(ghbVar, ghbVar2)) {
            return;
        }
        this.y0 = ghbVar;
        y2h y2hVar = this.A0;
        if (ghbVar2 != null) {
            oh6 oh6Var = ((rl0) ghbVar2).i;
            oh6Var.b.remove(y2hVar);
            oh6Var.b.size();
            y2hVar.toString();
        }
        rdf rdfVar = this.z0;
        if (ghbVar2 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = ((rl0) ghbVar2).j;
            copyOnWriteArrayList.remove(rdfVar);
            copyOnWriteArrayList.size();
            rdfVar.toString();
        }
        if (ghbVar == null) {
            setFixedText("NO PLAYER");
            removeCallbacks(this.w0);
            return;
        }
        rl0 rl0Var = (rl0) ghbVar;
        rl0Var.a(y2hVar);
        CopyOnWriteArrayList copyOnWriteArrayList2 = rl0Var.j;
        copyOnWriteArrayList2.add(rdfVar);
        copyOnWriteArrayList2.size();
        rdfVar.toString();
        k(ghbVar);
        j();
    }

    public final void setUpdatePeriodMillis(long j) {
        if (j != this.x0) {
            removeCallbacks(this.w0);
            if (j < 500) {
                j = j > 0 ? 500L : 0L;
            }
            this.x0 = j;
            j();
        }
    }
}
