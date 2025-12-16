package com.airbnb.lottie.animation.content;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: CompoundTrimPathContent.java */
/* loaded from: classes10.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f59176a = new ArrayList();

    public final void a(Path path) {
        ArrayList arrayList = this.f59176a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v vVar = (v) arrayList.get(size);
            Matrix matrix = com.airbnb.lottie.utils.k.f60123a;
            if (vVar != null && !vVar.f59301a) {
                com.airbnb.lottie.utils.k.a(path, vVar.f59304d.m() / 100.0f, vVar.f59305e.m() / 100.0f, vVar.f59306f.m() / 360.0f);
            }
        }
    }
}
