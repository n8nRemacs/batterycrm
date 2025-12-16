package androidx.compose.ui.viewinterop;

import Y61.l;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.I;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.saveable.r;
import androidx.compose.ui.node.J0;
import androidx.compose.ui.platform.AbstractC22450a;
import androidx.compose.ui.platform.C2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidView.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR(\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010RB\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019RB\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019RB\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u0014\u0010%\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/viewinterop/k;", "Landroid/view/View;", "T", "Landroidx/compose/ui/viewinterop/a;", "Landroidx/compose/ui/platform/C2;", "Landroidx/compose/ui/input/nestedscroll/b;", "C", "Landroidx/compose/ui/input/nestedscroll/b;", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/b;", "dispatcher", "Landroidx/compose/runtime/saveable/r$a;", "value", "E", "Landroidx/compose/runtime/saveable/r$a;", "setSavableRegistryEntry", "(Landroidx/compose/runtime/saveable/r$a;)V", "savableRegistryEntry", "Lkotlin/Function1;", "Lkotlin/G0;", "F", "LY41/l;", "getUpdateBlock", "()LY41/l;", "setUpdateBlock", "(LY41/l;)V", "updateBlock", "G", "getResetBlock", "setResetBlock", "resetBlock", "H", "getReleaseBlock", "setReleaseBlock", "releaseBlock", "getViewRoot", "()Landroid/view/View;", "viewRoot", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k<T extends View> extends androidx.compose.ui.viewinterop.a implements C2 {

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final T f42993B;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final androidx.compose.ui.input.nestedscroll.b dispatcher;

    /* renamed from: D, reason: collision with root package name */
    @l
    public final r f42995D;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    @l
    public r.a savableRegistryEntry;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Y41.l<? super T, G0> updateBlock;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Y41.l<? super T, G0> resetBlock;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public Y41.l<? super T, G0> releaseBlock;

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k<T> f43000l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k<T> kVar) {
            super(0);
            this.f43000l = kVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            k<T> kVar = this.f43000l;
            kVar.getReleaseBlock().invoke(kVar.f42993B);
            k.g(kVar);
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k<T> f43001l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k<T> kVar) {
            super(0);
            this.f43001l = kVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            k<T> kVar = this.f43001l;
            kVar.getResetBlock().invoke(kVar.f42993B);
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k<T> f43002l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k<T> kVar) {
            super(0);
            this.f43002l = kVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            k<T> kVar = this.f43002l;
            kVar.getUpdateBlock().invoke(kVar.f42993B);
            return G0.f406611a;
        }
    }

    public k() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public k(Context context, I i12, View view, androidx.compose.ui.input.nestedscroll.b bVar, r rVar, int i13, J0 j02, int i14, C42822w c42822w) {
        I i15 = (i14 & 2) != 0 ? null : i12;
        androidx.compose.ui.input.nestedscroll.b bVar2 = (i14 & 8) != 0 ? new androidx.compose.ui.input.nestedscroll.b() : bVar;
        super(context, i15, i13, bVar2, view, j02);
        this.f42993B = view;
        this.dispatcher = bVar2;
        this.f42995D = rVar;
        setClipChildren(false);
        String strValueOf = String.valueOf(i13);
        Object objF = rVar != null ? rVar.f(strValueOf) : null;
        SparseArray sparseArray = objF instanceof SparseArray ? (SparseArray) objF : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (rVar != null) {
            setSavableRegistryEntry(rVar.d(strValueOf, new j(this)));
        }
        Y41.l<View, G0> lVar = d.f42956a;
        this.updateBlock = lVar;
        this.resetBlock = lVar;
        this.releaseBlock = lVar;
    }

    public static final void g(k kVar) {
        kVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(r.a aVar) {
        r.a aVar2 = this.savableRegistryEntry;
        if (aVar2 != null) {
            aVar2.a();
        }
        this.savableRegistryEntry = aVar;
    }

    @Y61.k
    public final androidx.compose.ui.input.nestedscroll.b getDispatcher() {
        return this.dispatcher;
    }

    @Y61.k
    public final Y41.l<T, G0> getReleaseBlock() {
        return this.releaseBlock;
    }

    @Y61.k
    public final Y41.l<T, G0> getResetBlock() {
        return this.resetBlock;
    }

    @l
    public /* bridge */ /* synthetic */ AbstractC22450a getSubCompositionView() {
        return null;
    }

    @Y61.k
    public final Y41.l<T, G0> getUpdateBlock() {
        return this.updateBlock;
    }

    public final void setReleaseBlock(@Y61.k Y41.l<? super T, G0> lVar) {
        this.releaseBlock = lVar;
        setRelease(new a(this));
    }

    public final void setResetBlock(@Y61.k Y41.l<? super T, G0> lVar) {
        this.resetBlock = lVar;
        setReset(new b(this));
    }

    public final void setUpdateBlock(@Y61.k Y41.l<? super T, G0> lVar) {
        this.updateBlock = lVar;
        setUpdate(new c(this));
    }

    public /* synthetic */ k(Context context, Y41.l lVar, I i12, r rVar, int i13, J0 j02, int i14, C42822w c42822w) {
        this(context, lVar, (i14 & 4) != 0 ? null : i12, rVar, i13, j02);
    }

    public k(@Y61.k Context context, @Y61.k Y41.l<? super Context, ? extends T> lVar, @l I i12, @l r rVar, int i13, @Y61.k J0 j02) {
        this(context, i12, lVar.invoke(context), null, rVar, i13, j02, 8, null);
    }

    @Y61.k
    public View getViewRoot() {
        return this;
    }
}
