package com.airbnb.lottie.animation.content;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* loaded from: classes10.dex */
public class l implements n, j {

    /* renamed from: a, reason: collision with root package name */
    public final Path f59240a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f59241b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f59242c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f59243d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final MergePaths f59244e;

    /* compiled from: MergePathsContent.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59245a;

        static {
            int[] iArr = new int[MergePaths.MergePathsMode.values().length];
            f59245a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59245a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59245a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59245a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59245a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(MergePaths mergePaths) {
        mergePaths.getClass();
        this.f59244e = mergePaths;
    }

    @TargetApi(19)
    public final void a(Path.Op op2) {
        Matrix matrixE;
        Matrix matrixE2;
        Path path = this.f59241b;
        path.reset();
        Path path2 = this.f59240a;
        path2.reset();
        ArrayList arrayList = this.f59243d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            n nVar = (n) arrayList.get(size);
            if (nVar instanceof d) {
                d dVar = (d) nVar;
                ArrayList arrayList2 = (ArrayList) dVar.f();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((n) arrayList2.get(size2)).getPath();
                    com.airbnb.lottie.animation.keyframe.p pVar = dVar.f59188l;
                    if (pVar != null) {
                        matrixE2 = pVar.e();
                    } else {
                        matrixE2 = dVar.f59180d;
                        matrixE2.reset();
                    }
                    path3.transform(matrixE2);
                    path.addPath(path3);
                }
            } else {
                path.addPath(nVar.getPath());
            }
        }
        int i12 = 0;
        n nVar2 = (n) arrayList.get(0);
        if (nVar2 instanceof d) {
            d dVar2 = (d) nVar2;
            List<n> listF = dVar2.f();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listF;
                if (i12 >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((n) arrayList3.get(i12)).getPath();
                com.airbnb.lottie.animation.keyframe.p pVar2 = dVar2.f59188l;
                if (pVar2 != null) {
                    matrixE = pVar2.e();
                } else {
                    matrixE = dVar2.f59180d;
                    matrixE.reset();
                }
                path4.transform(matrixE);
                path2.addPath(path4);
                i12++;
            }
        } else {
            path2.set(nVar2.getPath());
        }
        this.f59242c.op(path2, path, op2);
    }

    @Override // com.airbnb.lottie.animation.content.c
    public final void c(List<c> list, List<c> list2) {
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f59243d;
            if (i12 >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i12)).c(list, list2);
            i12++;
        }
    }

    @Override // com.airbnb.lottie.animation.content.j
    public final void f(ListIterator<c> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            c cVarPrevious = listIterator.previous();
            if (cVarPrevious instanceof n) {
                this.f59243d.add((n) cVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.n
    public final Path getPath() {
        Path path = this.f59242c;
        path.reset();
        MergePaths mergePaths = this.f59244e;
        if (mergePaths.f59672b) {
            return path;
        }
        int iOrdinal = mergePaths.f59671a.ordinal();
        if (iOrdinal == 0) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.f59243d;
                if (i12 >= arrayList.size()) {
                    break;
                }
                path.addPath(((n) arrayList.get(i12)).getPath());
                i12++;
            }
        } else if (iOrdinal == 1) {
            a(Path.Op.UNION);
        } else if (iOrdinal == 2) {
            a(Path.Op.REVERSE_DIFFERENCE);
        } else if (iOrdinal == 3) {
            a(Path.Op.INTERSECT);
        } else if (iOrdinal == 4) {
            a(Path.Op.XOR);
        }
        return path;
    }
}
