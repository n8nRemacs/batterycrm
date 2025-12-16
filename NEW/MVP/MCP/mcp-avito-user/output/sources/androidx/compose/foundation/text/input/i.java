package androidx.compose.foundation.text.input;

import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.H;
import androidx.compose.foundation.text.input.internal.C0;
import androidx.compose.foundation.text.input.internal.C20907o;
import androidx.compose.foundation.text.input.internal.C20954z0;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.w0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TextFieldBuffer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/i;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i implements Appendable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f30755b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final C20954z0 f30756c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C0 f30757d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public C20907o f30758e;

    /* renamed from: f, reason: collision with root package name */
    public long f30759f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public v0 f30760g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public androidx.compose.runtime.collection.e<C22602e.C1684e<C22602e.a>> f30761h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Q<s, v0> f30762i;

    /* compiled from: TextFieldBuffer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/i$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    public i(l lVar, C20907o c20907o, l lVar2, C20954z0 c20954z0, int i12, C42822w c42822w) {
        androidx.compose.runtime.collection.e<C22602e.C1684e<C22602e.a>> eVar = null;
        c20907o = (i12 & 2) != 0 ? null : c20907o;
        lVar2 = (i12 & 4) != 0 ? lVar : lVar2;
        c20954z0 = (i12 & 8) != 0 ? null : c20954z0;
        this.f30755b = lVar2;
        this.f30756c = c20954z0;
        C0 c02 = new C0();
        c02.f30788b = lVar;
        c02.f30790d = -1;
        c02.f30791e = -1;
        this.f30757d = c02;
        this.f30758e = c20907o != null ? new C20907o(c20907o) : null;
        this.f30759f = lVar.f31512d;
        this.f30760g = lVar.f31513e;
        List<C22602e.C1684e<C22602e.a>> list = lVar.f31510b;
        List<C22602e.C1684e<C22602e.a>> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            int size = list.size();
            j jVar = new j(lVar);
            C22602e.C1684e[] c1684eArr = new C22602e.C1684e[size];
            for (int i13 = 0; i13 < size; i13++) {
                c1684eArr[i13] = jVar.invoke(Integer.valueOf(i13));
            }
            eVar = new androidx.compose.runtime.collection.e<>(c1684eArr, size);
        }
        this.f30761h = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.compose.foundation.text.input.l h(androidx.compose.foundation.text.input.i r9, long r10, androidx.compose.ui.text.v0 r12, int r13) {
        /*
            r0 = r13 & 1
            if (r0 == 0) goto L6
            long r10 = r9.f30759f
        L6:
            r2 = r10
            r10 = r13 & 2
            if (r10 == 0) goto Ld
            androidx.compose.ui.text.v0 r12 = r9.f30760g
        Ld:
            r4 = r12
            androidx.compose.runtime.collection.e<androidx.compose.ui.text.e$e<androidx.compose.ui.text.e$a>> r10 = r9.f30761h
            r11 = 0
            if (r10 == 0) goto L1f
            java.util.List r10 = r10.f()
            boolean r12 = r10.isEmpty()
            if (r12 != 0) goto L1f
            r6 = r10
            goto L20
        L1f:
            r6 = r11
        L20:
            androidx.compose.foundation.text.input.l r10 = new androidx.compose.foundation.text.input.l
            androidx.compose.foundation.text.input.internal.C0 r9 = r9.f30757d
            java.lang.String r1 = r9.toString()
            r5 = 0
            r7 = 8
            r8 = 0
            r0 = r10
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.i.h(androidx.compose.foundation.text.input.i, long, androidx.compose.ui.text.v0, int):androidx.compose.foundation.text.input.l");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final C20907o a() {
        C20907o c20907o = this.f30758e;
        if (c20907o != null) {
            return c20907o;
        }
        C20907o c20907o2 = new C20907o(null, 1, 0 == true ? 1 : 0);
        this.f30758e = c20907o2;
        return c20907o2;
    }

    @Override // java.lang.Appendable
    @Y61.k
    public final Appendable append(char c12) {
        C0 c02 = this.f30757d;
        b(c02.length(), c02.length(), 1);
        int length = c02.length();
        int length2 = c02.length();
        String strValueOf = String.valueOf(c12);
        c02.a(length, length2, strValueOf, 0, strValueOf.length());
        return this;
    }

    public final void b(int i12, int i13, int i14) {
        a().e(i12, i13, i14);
        C20954z0 c20954z0 = this.f30756c;
        if (c20954z0 != null) {
            c20954z0.c(i12, i13, i14);
        }
        this.f30759f = k.a(i12, i13, this.f30759f, i14);
    }

    public final void c(int i12, int i13, @Y61.k CharSequence charSequence) {
        d(i12, i13, charSequence, 0, charSequence.length());
    }

    public final void d(int i12, int i13, @Y61.k CharSequence charSequence, int i14, int i15) {
        if (!(i12 <= i13)) {
            androidx.compose.foundation.internal.e.a("Expected start=" + i12 + " <= end=" + i13);
        }
        if (!(i14 <= i15)) {
            androidx.compose.foundation.internal.e.a("Expected textStart=" + i14 + " <= textEnd=" + i15);
        }
        b(i12, i13, i15 - i14);
        this.f30757d.a(i12, i13, charSequence, i14, i15);
        f(null);
        this.f30762i = null;
    }

    public final void e(@Y61.l ArrayList arrayList, int i12, int i13) {
        C0 c02 = this.f30757d;
        if (i12 < 0 || i12 > c02.length()) {
            StringBuilder sbJ = G.j(i12, "start (", ") offset is outside of text region ");
            sbJ.append(c02.length());
            throw new IndexOutOfBoundsException(sbJ.toString());
        }
        if (i13 < 0 || i13 > c02.length()) {
            StringBuilder sbJ2 = G.j(i13, "end (", ") offset is outside of text region ");
            sbJ2.append(c02.length());
            throw new IndexOutOfBoundsException(sbJ2.toString());
        }
        if (i12 >= i13) {
            throw new IllegalArgumentException(H.j(i12, i13, "Do not set reversed or empty range: ", " > "));
        }
        f(v0.a(w0.a(i12, i13)));
        androidx.compose.runtime.collection.e<C22602e.C1684e<C22602e.a>> eVar = this.f30761h;
        if (eVar != null) {
            eVar.g();
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (this.f30761h == null) {
            this.f30761h = new androidx.compose.runtime.collection.e<>(new C22602e.C1684e[16], 0);
        }
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            C22602e.C1684e c1684e = (C22602e.C1684e) arrayList.get(i14);
            androidx.compose.runtime.collection.e<C22602e.C1684e<C22602e.a>> eVar2 = this.f30761h;
            if (eVar2 != null) {
                eVar2.b(C22602e.C1684e.a(c1684e, null, c1684e.f42139b + i12, c1684e.f42140c + i12, 9));
            }
        }
    }

    public final void f(v0 v0Var) {
        if (v0Var != null && !v0.d(v0Var.f42736a)) {
            this.f30760g = v0Var;
            return;
        }
        this.f30760g = null;
        androidx.compose.runtime.collection.e<C22602e.C1684e<C22602e.a>> eVar = this.f30761h;
        if (eVar != null) {
            eVar.g();
        }
    }

    public final void g(long j12) {
        long jA2 = w0.a(0, this.f30757d.length());
        if (!v0.b(jA2, j12)) {
            androidx.compose.foundation.internal.e.a("Expected " + ((Object) v0.i(j12)) + " to be in " + ((Object) v0.i(jA2)));
        }
        this.f30759f = j12;
        this.f30762i = null;
    }

    @Y61.k
    public final String toString() {
        return this.f30757d.toString();
    }

    @Override // java.lang.Appendable
    @Y61.k
    public final Appendable append(@Y61.l CharSequence charSequence) {
        if (charSequence != null) {
            C0 c02 = this.f30757d;
            b(c02.length(), c02.length(), charSequence.length());
            c02.a(c02.length(), c02.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    @Override // java.lang.Appendable
    @Y61.k
    public final Appendable append(@Y61.l CharSequence charSequence, int i12, int i13) {
        if (charSequence != null) {
            C0 c02 = this.f30757d;
            b(c02.length(), c02.length(), i13 - i12);
            int length = c02.length();
            int length2 = c02.length();
            CharSequence charSequenceSubSequence = charSequence.subSequence(i12, i13);
            c02.a(length, length2, charSequenceSubSequence, 0, charSequenceSubSequence.length());
        }
        return this;
    }
}
