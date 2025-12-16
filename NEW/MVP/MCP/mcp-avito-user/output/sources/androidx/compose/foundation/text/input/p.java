package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.input.u;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.saveable.x;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.ui.text.v0;
import androidx.compose.ui.text.w0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: TextFieldState.kt */
@F3
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000b\fB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/text/input/p;", "", "", "initialText", "Landroidx/compose/ui/text/v0;", "initialSelection", "Landroidx/compose/foundation/text/input/u;", "initialTextUndoManager", "<init>", "(Ljava/lang/String;JLandroidx/compose/foundation/text/input/u;Lkotlin/jvm/internal/w;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/w;)V", "a", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f31518a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public i f31519b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31520c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31521d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final w f31522e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<a> f31523f;

    /* compiled from: TextFieldState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/p$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@Y61.k l lVar, @Y61.k l lVar2, boolean z12);
    }

    /* compiled from: TextFieldState.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/p$b;", "Landroidx/compose/runtime/saveable/u;", "Landroidx/compose/foundation/text/input/p;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements androidx.compose.runtime.saveable.u<p, Object> {
        static {
            new b();
        }

        @Override // androidx.compose.runtime.saveable.u
        public final Object a(x xVar, p pVar) {
            p pVar2 = pVar;
            String string = pVar2.b().f31511c.toString();
            long j12 = pVar2.b().f31512d;
            v0.a aVar = v0.f42734b;
            Integer numValueOf = Integer.valueOf((int) (j12 >> 32));
            Integer numValueOf2 = Integer.valueOf((int) (pVar2.b().f31512d & 4294967295L));
            u.a.C1624a.f31531a.getClass();
            return C42745f0.U(string, numValueOf, numValueOf2, u.a.C1624a.b(xVar, pVar2.f31518a));
        }
    }

    /* compiled from: TextFieldState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[TextFieldEditUndoBehavior.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f31477b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = TextFieldEditUndoBehavior.f31477b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public p(String str, long j12, u uVar, C42822w c42822w) {
        this.f31518a = uVar;
        this.f31519b = new i(new l(str, w0.b(str.length(), j12), null, null, null, 28, null), null, null, null, 14, null);
        this.f31520c = C22126m3.g(Boolean.FALSE);
        this.f31521d = C22126m3.g(new l(str, j12, null, null, null, 28, null));
        this.f31522e = new w(this);
        this.f31523f = new androidx.compose.runtime.collection.e<>(new a[16], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.foundation.text.input.p r34, androidx.compose.foundation.text.input.c r35, boolean r36, androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior r37) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.p.a(androidx.compose.foundation.text.input.p, androidx.compose.foundation.text.input.c, boolean, androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior):void");
    }

    @Y61.k
    public final l b() {
        return (l) ((C22082i3) this.f31521d).getF42167b();
    }

    public final void c(l lVar, l lVar2, boolean z12) {
        ((C22082i3) this.f31521d).setValue(lVar2);
        ((C22082i3) this.f31520c).setValue(false);
        androidx.compose.runtime.collection.e<a> eVar = this.f31523f;
        a[] aVarArr = eVar.f38260b;
        int i12 = eVar.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            aVarArr[i13].a(lVar, lVar2, (!z12 || C43066x.t(lVar.f31511c, lVar2) || lVar.f31513e == null) ? false : true);
        }
    }

    @Y61.k
    public final String toString() {
        AbstractC22167l.f38720e.getClass();
        AbstractC22167l abstractC22167lA = AbstractC22167l.a.a();
        Y41.l<Object, G0> lVarE = abstractC22167lA != null ? abstractC22167lA.e() : null;
        AbstractC22167l abstractC22167lB = AbstractC22167l.a.b(abstractC22167lA);
        try {
            return "TextFieldState(selection=" + ((Object) v0.i(b().f31512d)) + ", text=\"" + ((Object) b().f31511c) + "\")";
        } finally {
            AbstractC22167l.a.e(abstractC22167lA, abstractC22167lB, lVarE);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(String str, long j12, int i12, C42822w c42822w) {
        str = (i12 & 1) != 0 ? "" : str;
        if ((i12 & 2) != 0) {
            int length = str.length();
            j12 = w0.a(length, length);
        }
        this(str, j12, null);
    }

    public p(String str, long j12, C42822w c42822w) {
        this(str, j12, new u(null, null, 3, null), (C42822w) null);
    }
}
