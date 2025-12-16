package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.C22341t;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import androidx.compose.ui.input.pointer.PointerEventPass;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Collection;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;

/* compiled from: DragGestureDetector.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0, 0, 0, 0, 0}, l = {1048}, m = "drag-VnAYq1g", n = {"$this$drag_u2dVnAYq1g", "onDrag", "orientation", "motionConsumed", "$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
/* loaded from: classes.dex */
final class F0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f27237q;

    /* renamed from: r, reason: collision with root package name */
    public Y41.l f27238r;

    /* renamed from: s, reason: collision with root package name */
    public Orientation f27239s;

    /* renamed from: t, reason: collision with root package name */
    public Y41.l f27240t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC22325c f27241u;

    /* renamed from: v, reason: collision with root package name */
    public l0.g f27242v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f27243w;

    /* renamed from: x, reason: collision with root package name */
    public int f27244x;

    public F0() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C22340s c22340s;
        InterfaceC22325c interfaceC22325c;
        Object obj2;
        Object obj3;
        Object objN1 = obj;
        this.f27243w = objN1;
        int i12 = this.f27244x | BeduinInputModel.MIN_TEXT_VERSION;
        this.f27244x = i12;
        float f12 = C20495q0.f27918a;
        this.f27244x = i12 - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.f27244x;
        if (i13 == 0) {
            C42729a0.b(obj);
            throw null;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l0.g gVar = this.f27242v;
        InterfaceC22325c interfaceC22325c2 = this.f27241u;
        Y41.l lVar = this.f27240t;
        Orientation orientation = this.f27239s;
        Y41.l lVar2 = this.f27238r;
        InterfaceC22325c interfaceC22325c3 = this.f27237q;
        C42729a0.b(obj);
        do {
            C22340s c22340s2 = (C22340s) objN1;
            ?? r112 = c22340s2.f40278a;
            int size = ((Collection) r112).size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    c22340s = c22340s2;
                    interfaceC22325c = interfaceC22325c2;
                    obj2 = null;
                    break;
                }
                obj2 = r112.get(i14);
                interfaceC22325c = interfaceC22325c2;
                c22340s = c22340s2;
                if (androidx.compose.ui.input.pointer.B.a(((androidx.compose.ui.input.pointer.C) obj2).f40116a, gVar.f406841b)) {
                    break;
                }
                i14++;
                interfaceC22325c2 = interfaceC22325c;
                c22340s2 = c22340s;
            }
            androidx.compose.ui.input.pointer.C c12 = (androidx.compose.ui.input.pointer.C) obj2;
            if (c12 == null) {
                c12 = null;
            } else {
                if (C22341t.c(c12)) {
                    ?? r12 = c22340s.f40278a;
                    int size2 = ((Collection) r12).size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size2) {
                            obj3 = null;
                            break;
                        }
                        Object obj4 = r12.get(i15);
                        if (((androidx.compose.ui.input.pointer.C) obj4).f40119d) {
                            obj3 = obj4;
                            break;
                        }
                        i15++;
                    }
                    androidx.compose.ui.input.pointer.C c13 = (androidx.compose.ui.input.pointer.C) obj3;
                    if (c13 != null) {
                        gVar.f406841b = c13.f40116a;
                        interfaceC22325c2 = interfaceC22325c;
                    }
                } else {
                    long jF2 = C22341t.f(c12, true);
                    if ((orientation == null ? l0.g.e(jF2) : orientation == Orientation.f27425b ? Float.intBitsToFloat((int) (jF2 & 4294967295L)) : Float.intBitsToFloat((int) (jF2 >> 32))) == 0.0f) {
                        interfaceC22325c2 = interfaceC22325c;
                    }
                }
                this.f27237q = interfaceC22325c3;
                this.f27238r = lVar2;
                this.f27239s = orientation;
                this.f27240t = lVar;
                this.f27241u = interfaceC22325c2;
                this.f27242v = gVar;
                this.f27244x = 1;
                objN1 = interfaceC22325c2.N1(PointerEventPass.f40174c, this);
            }
            if (c12 == null || ((Boolean) lVar.invoke(c12)).booleanValue()) {
                return null;
            }
            if (C22341t.c(c12)) {
                return c12;
            }
            lVar2.invoke(c12);
            l0.g gVar2 = new l0.g();
            gVar2.f406841b = c12.f40116a;
            gVar = gVar2;
            interfaceC22325c2 = interfaceC22325c3;
            this.f27237q = interfaceC22325c3;
            this.f27238r = lVar2;
            this.f27239s = orientation;
            this.f27240t = lVar;
            this.f27241u = interfaceC22325c2;
            this.f27242v = gVar;
            this.f27244x = 1;
            objN1 = interfaceC22325c2.N1(PointerEventPass.f40174c, this);
        } while (objN1 != coroutine_suspended);
        return coroutine_suspended;
    }
}
