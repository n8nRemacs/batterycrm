package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import androidx.appcompat.app.r;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeData.java */
/* loaded from: classes10.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f59758a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f59759b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f59760c;

    public j(PointF pointF, boolean z12, List<O2.a> list) {
        this.f59759b = pointF;
        this.f59760c = z12;
        this.f59758a = new ArrayList(list);
    }

    public final void a(float f12, float f13) {
        if (this.f59759b == null) {
            this.f59759b = new PointF();
        }
        this.f59759b.set(f12, f13);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.f59758a.size());
        sb2.append("closed=");
        return r.x(sb2, this.f59760c, '}');
    }

    public j() {
        this.f59758a = new ArrayList();
    }
}
