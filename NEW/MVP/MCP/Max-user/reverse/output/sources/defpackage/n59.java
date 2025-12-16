package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n59 extends phd {
    public final Drawable X;
    public final Drawable Y;
    public final Drawable Z;
    public final ArrayList d = new ArrayList();
    public final LayoutInflater o;
    public final Drawable s0;
    public final /* synthetic */ o59 t0;

    public n59(o59 o59Var) {
        this.t0 = o59Var;
        this.o = LayoutInflater.from(o59Var.Z);
        Context context = o59Var.Z;
        this.X = r69.d(context, avc.mediaRouteDefaultIconDrawable);
        this.Y = r69.d(context, avc.mediaRouteTvIconDrawable);
        this.Z = r69.d(context, avc.mediaRouteSpeakerIconDrawable);
        this.s0 = r69.d(context, avc.mediaRouteSpeakerGroupIconDrawable);
        C();
    }

    public final void C() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        o59 o59Var = this.t0;
        arrayList.add(new l59(o59Var.Z.getString(j4d.mr_chooser_title)));
        Iterator it = o59Var.t0.iterator();
        while (it.hasNext()) {
            arrayList.add(new l59((k69) it.next()));
        }
        m();
    }

    @Override // defpackage.phd
    public final int j() {
        return this.d.size();
    }

    @Override // defpackage.phd
    public final int l(int i) {
        return ((l59) this.d.get(i)).b;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    @Override // defpackage.phd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(defpackage.mid r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.l(r10)
            java.util.ArrayList r1 = r8.d
            java.lang.Object r10 = r1.get(r10)
            l59 r10 = (defpackage.l59) r10
            r1 = 1
            if (r0 == r1) goto L86
            java.lang.String r2 = "RecyclerAdapter"
            r3 = 2
            if (r0 == r3) goto L1a
            java.lang.String r9 = "Cannot bind item to ViewHolder because of wrong view type"
            android.util.Log.w(r2, r9)
            return
        L1a:
            m59 r9 = (defpackage.m59) r9
            java.lang.Object r10 = r10.a
            k69 r10 = (defpackage.k69) r10
            android.view.View r0 = r9.E0
            r4 = 0
            r0.setVisibility(r4)
            android.widget.ProgressBar r4 = r9.G0
            r5 = 4
            r4.setVisibility(r5)
            iu1 r4 = new iu1
            r4.<init>(r9, r10)
            r0.setOnClickListener(r4)
            android.widget.TextView r0 = r9.H0
            java.lang.String r4 = r10.d
            r0.setText(r4)
            android.widget.ImageView r0 = r9.F0
            n59 r9 = r9.I0
            android.net.Uri r4 = r10.f
            if (r4 == 0) goto L69
            o59 r5 = r9.t0     // Catch: java.io.IOException -> L57
            android.content.Context r5 = r5.Z     // Catch: java.io.IOException -> L57
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.io.IOException -> L57
            java.io.InputStream r5 = r5.openInputStream(r4)     // Catch: java.io.IOException -> L57
            r6 = 0
            android.graphics.drawable.Drawable r2 = android.graphics.drawable.Drawable.createFromStream(r5, r6)     // Catch: java.io.IOException -> L57
            if (r2 == 0) goto L69
            goto L82
        L57:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to load "
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            android.util.Log.w(r2, r4, r5)
        L69:
            int r2 = r10.m
            if (r2 == r1) goto L7f
            if (r2 == r3) goto L7c
            boolean r10 = r10.e()
            if (r10 == 0) goto L79
            android.graphics.drawable.Drawable r9 = r9.s0
        L77:
            r2 = r9
            goto L82
        L79:
            android.graphics.drawable.Drawable r9 = r9.X
            goto L77
        L7c:
            android.graphics.drawable.Drawable r9 = r9.Z
            goto L77
        L7f:
            android.graphics.drawable.Drawable r9 = r9.Y
            goto L77
        L82:
            r0.setImageDrawable(r2)
            return
        L86:
            k59 r9 = (defpackage.k59) r9
            java.lang.Object r10 = r10.a
            java.lang.String r10 = r10.toString()
            android.widget.TextView r9 = r9.E0
            r9.setText(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n59.r(mid, int):void");
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = this.o;
        if (i != 1) {
            if (i == 2) {
                return new m59(this, layoutInflater.inflate(h1d.mr_picker_route_item, viewGroup, false));
            }
            Log.w("RecyclerAdapter", "Cannot create ViewHolder because of wrong view type");
            return null;
        }
        View viewInflate = layoutInflater.inflate(h1d.mr_picker_header_item, viewGroup, false);
        k59 k59Var = new k59(viewInflate);
        k59Var.E0 = (TextView) viewInflate.findViewById(pxc.mr_picker_header_name);
        return k59Var;
    }
}
