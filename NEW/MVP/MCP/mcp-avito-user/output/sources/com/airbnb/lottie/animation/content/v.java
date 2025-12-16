package com.airbnb.lottie.animation.content;

import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TrimPathContent.java */
/* loaded from: classes10.dex */
public class v implements c, a.b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f59301a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f59302b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ShapeTrimPath.Type f59303c;

    /* renamed from: d, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.d f59304d;

    /* renamed from: e, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.d f59305e;

    /* renamed from: f, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.d f59306f;

    public v(com.airbnb.lottie.model.layer.b bVar, ShapeTrimPath shapeTrimPath) {
        shapeTrimPath.getClass();
        this.f59301a = shapeTrimPath.f59711e;
        this.f59303c = shapeTrimPath.f59707a;
        com.airbnb.lottie.animation.keyframe.d dVarC = shapeTrimPath.f59708b.c();
        this.f59304d = dVarC;
        com.airbnb.lottie.animation.keyframe.d dVarC2 = shapeTrimPath.f59709c.c();
        this.f59305e = dVarC2;
        com.airbnb.lottie.animation.keyframe.d dVarC3 = shapeTrimPath.f59710d.c();
        this.f59306f = dVarC3;
        bVar.f(dVarC);
        bVar.f(dVarC2);
        bVar.f(dVarC3);
        dVarC.a(this);
        dVarC2.a(this);
        dVarC3.a(this);
    }

    public final void a(a.b bVar) {
        this.f59302b.add(bVar);
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public final void g() {
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f59302b;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((a.b) arrayList.get(i12)).g();
            i12++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final void c(List<c> list, List<c> list2) {
    }
}
