package com.airbnb.lottie.animation.content;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import androidx.collection.C20204c0;
import com.airbnb.lottie.B;
import com.airbnb.lottie.C27291k;
import com.airbnb.lottie.H;
import com.airbnb.lottie.animation.keyframe.a;
import com.airbnb.lottie.model.content.GradientType;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GradientFillContent.java */
/* loaded from: classes10.dex */
public class h implements e, a.b, k {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final String f59209a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f59210b;

    /* renamed from: c, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.b f59211c;

    /* renamed from: d, reason: collision with root package name */
    public final C20204c0<LinearGradient> f59212d = new C20204c0<>();

    /* renamed from: e, reason: collision with root package name */
    public final C20204c0<RadialGradient> f59213e = new C20204c0<>();

    /* renamed from: f, reason: collision with root package name */
    public final Path f59214f;

    /* renamed from: g, reason: collision with root package name */
    public final com.airbnb.lottie.animation.a f59215g;

    /* renamed from: h, reason: collision with root package name */
    public final RectF f59216h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f59217i;

    /* renamed from: j, reason: collision with root package name */
    public final GradientType f59218j;

    /* renamed from: k, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.e f59219k;

    /* renamed from: l, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.f f59220l;

    /* renamed from: m, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.k f59221m;

    /* renamed from: n, reason: collision with root package name */
    public final com.airbnb.lottie.animation.keyframe.k f59222n;

    /* renamed from: o, reason: collision with root package name */
    @P
    public com.airbnb.lottie.animation.keyframe.q f59223o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public com.airbnb.lottie.animation.keyframe.q f59224p;

    /* renamed from: q, reason: collision with root package name */
    public final B f59225q;

    /* renamed from: r, reason: collision with root package name */
    public final int f59226r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public com.airbnb.lottie.animation.keyframe.a<Float, Float> f59227s;

    /* renamed from: t, reason: collision with root package name */
    public float f59228t;

    public h(B b12, C27291k c27291k, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.e eVar) {
        Path path = new Path();
        this.f59214f = path;
        this.f59215g = new com.airbnb.lottie.animation.a(1);
        this.f59216h = new RectF();
        this.f59217i = new ArrayList();
        this.f59228t = 0.0f;
        this.f59211c = bVar;
        this.f59209a = eVar.f59732g;
        this.f59210b = eVar.f59733h;
        this.f59225q = b12;
        this.f59218j = eVar.f59726a;
        path.setFillType(eVar.f59727b);
        this.f59226r = (int) (c27291k.b() / 32.0f);
        com.airbnb.lottie.animation.keyframe.a<com.airbnb.lottie.model.content.d, com.airbnb.lottie.model.content.d> aVarC = eVar.f59728c.c();
        this.f59219k = (com.airbnb.lottie.animation.keyframe.e) aVarC;
        aVarC.a(this);
        bVar.f(aVarC);
        com.airbnb.lottie.animation.keyframe.a<Integer, Integer> aVarC2 = eVar.f59729d.c();
        this.f59220l = (com.airbnb.lottie.animation.keyframe.f) aVarC2;
        aVarC2.a(this);
        bVar.f(aVarC2);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarC3 = eVar.f59730e.c();
        this.f59221m = (com.airbnb.lottie.animation.keyframe.k) aVarC3;
        aVarC3.a(this);
        bVar.f(aVarC3);
        com.airbnb.lottie.animation.keyframe.a<PointF, PointF> aVarC4 = eVar.f59731f.c();
        this.f59222n = (com.airbnb.lottie.animation.keyframe.k) aVarC4;
        aVarC4.a(this);
        bVar.f(aVarC4);
        if (bVar.m() != null) {
            com.airbnb.lottie.animation.keyframe.d dVarC = bVar.m().f59718a.c();
            this.f59227s = dVarC;
            dVarC.a(this);
            bVar.f(this.f59227s);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // O2.e
    public final void a(ColorFilter colorFilter, @P com.airbnb.lottie.value.j jVar) {
        PointF pointF = H.f59082a;
        if (colorFilter == 4) {
            this.f59220l.k(jVar);
            return;
        }
        ColorFilter colorFilter2 = H.f59076F;
        com.airbnb.lottie.model.layer.b bVar = this.f59211c;
        if (colorFilter == colorFilter2) {
            com.airbnb.lottie.animation.keyframe.q qVar = this.f59223o;
            if (qVar != null) {
                bVar.p(qVar);
            }
            com.airbnb.lottie.animation.keyframe.q qVar2 = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f59223o = qVar2;
            qVar2.a(this);
            bVar.f(this.f59223o);
            return;
        }
        if (colorFilter == H.f59077G) {
            com.airbnb.lottie.animation.keyframe.q qVar3 = this.f59224p;
            if (qVar3 != null) {
                bVar.p(qVar3);
            }
            this.f59212d.a();
            this.f59213e.a();
            com.airbnb.lottie.animation.keyframe.q qVar4 = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f59224p = qVar4;
            qVar4.a(this);
            bVar.f(this.f59224p);
            return;
        }
        if (colorFilter == H.f59086e) {
            com.airbnb.lottie.animation.keyframe.a<Float, Float> aVar = this.f59227s;
            if (aVar != null) {
                aVar.k(jVar);
                return;
            }
            com.airbnb.lottie.animation.keyframe.q qVar5 = new com.airbnb.lottie.animation.keyframe.q(jVar, null);
            this.f59227s = qVar5;
            qVar5.a(this);
            bVar.f(this.f59227s);
        }
    }

    @Override // O2.e
    public final void b(O2.d dVar, int i12, ArrayList arrayList, O2.d dVar2) {
        com.airbnb.lottie.utils.j.g(dVar, i12, arrayList, dVar2, this);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final void c(List<c> list, List<c> list2) {
        for (int i12 = 0; i12 < list2.size(); i12++) {
            c cVar = list2.get(i12);
            if (cVar instanceof n) {
                this.f59217i.add((n) cVar);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v21 ??, still in use, count: 1, list:
          (r5v21 ?? I:java.lang.Object) from 0x00a8: INVOKE (r6v20 ?? I:androidx.collection.c0), (r14v1 ?? I:long), (r5v21 ?? I:java.lang.Object) VIRTUAL call: androidx.collection.c0.l(long, java.lang.Object):void A[MD:(long, E):void (m)] (LINE:169)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @Override // com.airbnb.lottie.animation.content.e
    public final void d(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v21 ??, still in use, count: 1, list:
          (r5v21 ?? I:java.lang.Object) from 0x00a8: INVOKE (r6v20 ?? I:androidx.collection.c0), (r14v1 ?? I:long), (r5v21 ?? I:java.lang.Object) VIRTUAL call: androidx.collection.c0.l(long, java.lang.Object):void A[MD:(long, E):void (m)] (LINE:169)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */

    @Override // com.airbnb.lottie.animation.content.e
    public final void e(RectF rectF, Matrix matrix, boolean z12) {
        Path path = this.f59214f;
        path.reset();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f59217i;
            if (i12 >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((n) arrayList.get(i12)).getPath(), matrix);
                i12++;
            }
        }
    }

    public final int[] f(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.q qVar = this.f59224p;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.f();
            int i12 = 0;
            if (iArr.length == numArr.length) {
                while (i12 < iArr.length) {
                    iArr[i12] = numArr[i12].intValue();
                    i12++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i12 < numArr.length) {
                    iArr[i12] = numArr[i12].intValue();
                    i12++;
                }
            }
        }
        return iArr;
    }

    @Override // com.airbnb.lottie.animation.keyframe.a.b
    public final void g() {
        this.f59225q.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final String getName() {
        return this.f59209a;
    }

    public final int j() {
        float f12 = this.f59221m.f59310d;
        float f13 = this.f59226r;
        int iRound = Math.round(f12 * f13);
        int iRound2 = Math.round(this.f59222n.f59310d * f13);
        int iRound3 = Math.round(this.f59219k.f59310d * f13);
        int i12 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i12 = i12 * 31 * iRound2;
        }
        return iRound3 != 0 ? i12 * 31 * iRound3 : i12;
    }
}
