package com.my.target;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import e11.C39880k;
import e11.C39884l0;
import e11.C39913v0;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class g1 extends N0 {
    /* JADX WARN: Removed duplicated region for block: B:100:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x037c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0355  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r32, int r33, int r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.g1.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0172  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.g1.onMeasure(int, int):void");
    }

    @Override // com.my.target.N0, com.my.target.I0
    public void setBanner(@j.N C39884l0 c39884l0) {
        String str;
        com.my.target.common.models.b bVar;
        Bitmap bitmapA;
        super.setBanner(c39884l0);
        C39913v0<com.my.target.common.models.e> c39913v0 = c39884l0.f394673N;
        if (c39913v0 == null) {
            return;
        }
        this.f364492f.setVisibility(0);
        C39880k c39880k = this.f364488b;
        c39880k.setVisibility(0);
        c39880k.setOnClickListener(this);
        if (c39913v0.f394862P) {
            c39880k.a(this.f364509w, false);
            str = "sound_off";
        } else {
            c39880k.a(this.f364508v, false);
            str = "sound_on";
        }
        c39880k.setContentDescription(str);
        this.f364494h.setImageBitmap(this.f364510x);
        FrameLayout frameLayout = this.f364484K;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(this);
        }
        this.f364500n.setOnClickListener(this);
        com.my.target.common.models.e eVar = (com.my.target.common.models.e) c39913v0.f394856J;
        com.my.target.common.models.b bVar2 = c39913v0.f394858L;
        if (eVar != null) {
            this.f364485L = eVar.f394305b;
            this.f364486M = eVar.f394306c;
        }
        if ((this.f364485L <= 0 || this.f364486M <= 0) && bVar2 != null) {
            this.f364485L = bVar2.f394305b;
            this.f364486M = bVar2.f394306c;
        }
        if ((this.f364485L <= 0 || this.f364486M <= 0) && (bVar = c39884l0.f394716o) != null) {
            int i12 = bVar.f394305b;
            this.f364485L = i12;
            int i13 = bVar.f394306c;
            this.f364486M = i13;
            if ((i12 <= 0 || i13 <= 0) && (bitmapA = bVar.a()) != null) {
                this.f364485L = bitmapA.getWidth();
                this.f364486M = bitmapA.getHeight();
            }
        }
    }
}
