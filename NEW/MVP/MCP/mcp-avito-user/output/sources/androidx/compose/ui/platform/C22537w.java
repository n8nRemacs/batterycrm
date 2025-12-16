package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.unit.LayoutDirection;
import com.avito.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22537w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Comparator<androidx.compose.ui.semantics.u>[] f41629a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<androidx.compose.ui.semantics.u, androidx.compose.ui.semantics.u, Integer> f41630b;

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/semantics/u;", "a", "b", "", "invoke", "(Landroidx/compose/ui/semantics/u;Landroidx/compose/ui/semantics/u;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.w$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.semantics.u, androidx.compose.ui.semantics.u, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f41631l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final Integer invoke(androidx.compose.ui.semantics.u uVar, androidx.compose.ui.semantics.u uVar2) {
            androidx.compose.ui.semantics.l lVar = uVar.f41797d;
            androidx.compose.ui.semantics.y.f41820a.getClass();
            androidx.compose.ui.semantics.E<Float> e12 = androidx.compose.ui.semantics.y.f41838s;
            return Integer.valueOf(Float.compare(((Number) lVar.e(e12, C22529u.f41604l)).floatValue(), ((Number) uVar2.f41797d.e(e12, C22533v.f41624l)).floatValue()));
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.w$b */
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ToggleableState toggleableState = ToggleableState.f41896b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ToggleableState toggleableState2 = ToggleableState.f41896b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Comparisons.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0010\t\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "K", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.w$c */
    public static final class c<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator f41632b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ androidx.camera.core.impl.r0 f41633c;

        public c(Comparator comparator, androidx.camera.core.impl.r0 r0Var) {
            this.f41632b = comparator;
            this.f41633c = r0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            int iCompare = this.f41632b.compare(t12, t13);
            if (iCompare != 0) {
                return iCompare;
            }
            return this.f41633c.compare(((androidx.compose.ui.semantics.u) t12).f41796c, ((androidx.compose.ui.semantics.u) t13).f41796c);
        }
    }

    /* compiled from: Comparisons.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/f", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.w$d */
    public static final class d<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f41634b;

        public d(c cVar) {
            this.f41634b = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            int iCompare = this.f41634b.compare(t12, t13);
            return iCompare != 0 ? iCompare : kotlin.comparisons.a.b(Integer.valueOf(((androidx.compose.ui.semantics.u) t12).f41800g), Integer.valueOf(((androidx.compose.ui.semantics.u) t13).f41800g));
        }
    }

    static {
        Comparator<androidx.compose.ui.semantics.u>[] comparatorArr = new Comparator[2];
        int i12 = 0;
        while (i12 < 2) {
            Comparator comparator = i12 == 0 ? C22465d2.f41430b : E1.f41107b;
            LayoutNode.f40602T.getClass();
            comparatorArr[i12] = new d(new c(comparator, LayoutNode.f40606X));
            i12++;
        }
        f41629a = comparatorArr;
        f41630b = a.f41631l;
    }

    public static final boolean a(androidx.compose.ui.semantics.u uVar) {
        androidx.compose.ui.semantics.l lVarI = uVar.i();
        androidx.compose.ui.semantics.y.f41820a.getClass();
        return !lVarI.f41786b.c(androidx.compose.ui.semantics.y.f41829j);
    }

    public static final LayoutNode b(LayoutNode layoutNode, Y41.l<? super LayoutNode, Boolean> lVar) {
        for (LayoutNode layoutNodeK = layoutNode.K(); layoutNodeK != null; layoutNodeK = layoutNodeK.K()) {
            if (lVar.invoke(layoutNodeK).booleanValue()) {
                return layoutNodeK;
            }
        }
        return null;
    }

    public static final void c(androidx.compose.ui.semantics.u uVar, ArrayList arrayList, androidx.collection.A0 a02, androidx.collection.A0 a03, Resources resources) {
        boolean zG2 = g(uVar);
        androidx.compose.ui.semantics.y.f41820a.getClass();
        boolean zBooleanValue = ((Boolean) uVar.f41797d.e(androidx.compose.ui.semantics.y.f41833n, C22545y.f41640l)).booleanValue();
        int i12 = uVar.f41800g;
        if ((zBooleanValue || h(uVar, resources)) && a03.a(i12)) {
            arrayList.add(uVar);
        }
        if (zBooleanValue) {
            a02.h(i12, i(zG2, androidx.compose.ui.semantics.u.h(7, uVar), a03, resources));
            return;
        }
        List listH = androidx.compose.ui.semantics.u.h(7, uVar);
        int size = listH.size();
        for (int i13 = 0; i13 < size; i13++) {
            c((androidx.compose.ui.semantics.u) listH.get(i13), arrayList, a02, a03, resources);
        }
    }

    public static final boolean d(androidx.compose.ui.semantics.u uVar) {
        androidx.compose.ui.semantics.l lVar = uVar.f41797d;
        androidx.compose.ui.semantics.y yVar = androidx.compose.ui.semantics.y.f41820a;
        yVar.getClass();
        ToggleableState toggleableState = (ToggleableState) androidx.compose.ui.semantics.m.a(lVar, androidx.compose.ui.semantics.y.f41814I);
        yVar.getClass();
        androidx.compose.ui.semantics.E<androidx.compose.ui.semantics.i> e12 = androidx.compose.ui.semantics.y.f41843x;
        androidx.compose.ui.semantics.l lVar2 = uVar.f41797d;
        androidx.compose.ui.semantics.i iVar = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.m.a(lVar2, e12);
        boolean z12 = toggleableState != null;
        yVar.getClass();
        if (((Boolean) androidx.compose.ui.semantics.m.a(lVar2, androidx.compose.ui.semantics.y.f41813H)) == null) {
            return z12;
        }
        androidx.compose.ui.semantics.i.f41744b.getClass();
        return iVar != null ? androidx.compose.ui.semantics.i.b(iVar.f41753a, androidx.compose.ui.semantics.i.f41748f) : false ? z12 : true;
    }

    public static final String e(androidx.compose.ui.semantics.u uVar, Resources resources) throws Resources.NotFoundException {
        Collection collection;
        CharSequence charSequence;
        androidx.compose.ui.semantics.l lVar = uVar.f41797d;
        androidx.compose.ui.semantics.y.f41820a.getClass();
        Object objA = androidx.compose.ui.semantics.m.a(lVar, androidx.compose.ui.semantics.y.f41822c);
        androidx.compose.ui.semantics.E<ToggleableState> e12 = androidx.compose.ui.semantics.y.f41814I;
        androidx.compose.ui.semantics.l lVar2 = uVar.f41797d;
        ToggleableState toggleableState = (ToggleableState) androidx.compose.ui.semantics.m.a(lVar2, e12);
        androidx.compose.ui.semantics.i iVar = (androidx.compose.ui.semantics.i) androidx.compose.ui.semantics.m.a(lVar2, androidx.compose.ui.semantics.y.f41843x);
        if (toggleableState != null) {
            int iOrdinal = toggleableState.ordinal();
            if (iOrdinal == 0) {
                androidx.compose.ui.semantics.i.f41744b.getClass();
                if ((iVar == null ? false : androidx.compose.ui.semantics.i.b(iVar.f41753a, androidx.compose.ui.semantics.i.f41746d)) && objA == null) {
                    objA = resources.getString(R.string.state_on);
                }
            } else if (iOrdinal == 1) {
                androidx.compose.ui.semantics.i.f41744b.getClass();
                if ((iVar == null ? false : androidx.compose.ui.semantics.i.b(iVar.f41753a, androidx.compose.ui.semantics.i.f41746d)) && objA == null) {
                    objA = resources.getString(R.string.state_off);
                }
            } else if (iOrdinal == 2 && objA == null) {
                objA = resources.getString(R.string.indeterminate);
            }
        }
        Boolean bool = (Boolean) androidx.compose.ui.semantics.m.a(lVar2, androidx.compose.ui.semantics.y.f41813H);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            androidx.compose.ui.semantics.i.f41744b.getClass();
            if (!(iVar == null ? false : androidx.compose.ui.semantics.i.b(iVar.f41753a, androidx.compose.ui.semantics.i.f41748f)) && objA == null) {
                objA = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        androidx.compose.ui.semantics.h hVar = (androidx.compose.ui.semantics.h) androidx.compose.ui.semantics.m.a(lVar2, androidx.compose.ui.semantics.y.f41823d);
        if (hVar != null) {
            androidx.compose.ui.semantics.h.f41739d.getClass();
            if (hVar != androidx.compose.ui.semantics.h.f41740e) {
                if (objA == null) {
                    kotlin.ranges.f<Float> fVar = hVar.f41742b;
                    float fFloatValue = ((fVar.g().floatValue() - fVar.d().floatValue()) > 0.0f ? 1 : ((fVar.g().floatValue() - fVar.d().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (hVar.f41741a - fVar.d().floatValue()) / (fVar.g().floatValue() - fVar.d().floatValue());
                    if (fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    if (!(fFloatValue == 0.0f)) {
                        iG = (fFloatValue == 1.0f ? 1 : 0) != 0 ? 100 : kotlin.ranges.s.g(Math.round(fFloatValue * 100), 1, 99);
                    }
                    objA = resources.getString(R.string.template_percent, Integer.valueOf(iG));
                }
            } else if (objA == null) {
                objA = resources.getString(R.string.in_progress);
            }
        }
        androidx.compose.ui.semantics.E<C22602e> e13 = androidx.compose.ui.semantics.y.f41810E;
        if (lVar2.f41786b.c(e13)) {
            androidx.compose.ui.semantics.l lVarI = new androidx.compose.ui.semantics.u(uVar.f41794a, true, uVar.f41796c, lVar2).i();
            Collection collection2 = (Collection) androidx.compose.ui.semantics.m.a(lVarI, androidx.compose.ui.semantics.y.f41821b);
            objA = ((collection2 == null || collection2.isEmpty()) && ((collection = (Collection) androidx.compose.ui.semantics.m.a(lVarI, androidx.compose.ui.semantics.y.f41806A)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) androidx.compose.ui.semantics.m.a(lVarI, e13)) == null || charSequence.length() == 0)) ? resources.getString(R.string.state_empty) : null;
        }
        return (String) objA;
    }

    public static final C22602e f(androidx.compose.ui.semantics.u uVar) {
        androidx.compose.ui.semantics.l lVar = uVar.f41797d;
        androidx.compose.ui.semantics.y yVar = androidx.compose.ui.semantics.y.f41820a;
        yVar.getClass();
        C22602e c22602e = (C22602e) androidx.compose.ui.semantics.m.a(lVar, androidx.compose.ui.semantics.y.f41810E);
        yVar.getClass();
        List list = (List) androidx.compose.ui.semantics.m.a(uVar.f41797d, androidx.compose.ui.semantics.y.f41806A);
        return c22602e == null ? list != null ? (C22602e) C42745f0.G(list) : null : c22602e;
    }

    public static final boolean g(androidx.compose.ui.semantics.u uVar) {
        return uVar.f41796c.f40609C == LayoutDirection.f42839c;
    }

    public static final boolean h(androidx.compose.ui.semantics.u uVar, Resources resources) {
        androidx.compose.ui.semantics.l lVar = uVar.f41797d;
        androidx.compose.ui.semantics.y.f41820a.getClass();
        List list = (List) androidx.compose.ui.semantics.m.a(lVar, androidx.compose.ui.semantics.y.f41821b);
        boolean z12 = ((list != null ? (String) C42745f0.G(list) : null) == null && f(uVar) == null && e(uVar, resources) == null && !d(uVar)) ? false : true;
        if (!C22481h2.e(uVar)) {
            if (uVar.f41797d.f41788d) {
                return true;
            }
            if (uVar.m() && z12) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4 A[EDGE_INSN: B:49:0x00c4->B:28:0x00c4 BREAK  A[LOOP:2: B:17:0x005c->B:27:0x00c1]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da A[LOOP:1: B:8:0x0039->B:30:0x00da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de A[EDGE_INSN: B:47:0x00de->B:31:0x00de BREAK  A[LOOP:1: B:8:0x0039->B:30:0x00da], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList i(boolean r17, java.util.List r18, androidx.collection.A0 r19, android.content.res.Resources r20) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C22537w.i(boolean, java.util.List, androidx.collection.A0, android.content.res.Resources):java.util.ArrayList");
    }
}
