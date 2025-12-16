package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.google.android.material.shape.t;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ShapePath.java */
/* loaded from: classes6.dex */
class s extends t.i {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f357123c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f357124d;

    public s(ArrayList arrayList, Matrix matrix) {
        this.f357123c = arrayList;
        this.f357124d = matrix;
    }

    @Override // com.google.android.material.shape.t.i
    public final void a(Matrix matrix, yY0.b bVar, int i12, Canvas canvas) {
        Iterator it = this.f357123c.iterator();
        while (it.hasNext()) {
            ((t.i) it.next()).a(this.f357124d, bVar, i12, canvas);
        }
    }
}
