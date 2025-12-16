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
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", i = {0, 0}, l = {1048}, m = "awaitVerticalDragOrCancellation-rnUCldI", n = {"$this$awaitDragOrUp_u2djO51t88$iv", "pointer$iv"}, s = {"L$0", "L$1"})
/* renamed from: androidx.compose.foundation.gestures.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20471k0 extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC22325c f27803q;

    /* renamed from: r, reason: collision with root package name */
    public l0.g f27804r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f27805s;

    /* renamed from: t, reason: collision with root package name */
    public int f27806t;

    public C20471k0() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object obj2;
        Object obj3;
        this.f27805s = obj;
        int i12 = this.f27806t | BeduinInputModel.MIN_TEXT_VERSION;
        this.f27806t = i12;
        float f12 = C20495q0.f27918a;
        this.f27806t = i12 - BeduinInputModel.MIN_TEXT_VERSION;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = this.f27806t;
        if (i13 == 0) {
            C42729a0.b(obj);
            throw null;
        }
        if (i13 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l0.g gVar = this.f27804r;
        InterfaceC22325c interfaceC22325c = this.f27803q;
        C42729a0.b(obj);
        do {
            C22340s c22340s = (C22340s) obj;
            ?? r52 = c22340s.f40278a;
            int size = ((Collection) r52).size();
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = r52.get(i15);
                if (androidx.compose.ui.input.pointer.B.a(((androidx.compose.ui.input.pointer.C) obj2).f40116a, gVar.f406841b)) {
                    break;
                }
                i15++;
            }
            androidx.compose.ui.input.pointer.C c12 = (androidx.compose.ui.input.pointer.C) obj2;
            if (c12 == null) {
                c12 = null;
            } else if (C22341t.c(c12)) {
                ?? r15 = c22340s.f40278a;
                int size2 = ((Collection) r15).size();
                while (true) {
                    if (i14 >= size2) {
                        obj3 = null;
                        break;
                    }
                    obj3 = r15.get(i14);
                    if (((androidx.compose.ui.input.pointer.C) obj3).f40119d) {
                        break;
                    }
                    i14++;
                }
                androidx.compose.ui.input.pointer.C c13 = (androidx.compose.ui.input.pointer.C) obj3;
                if (c13 != null) {
                    gVar.f406841b = c13.f40116a;
                    this.f27803q = interfaceC22325c;
                    this.f27804r = gVar;
                    this.f27806t = 1;
                    obj = interfaceC22325c.N1(PointerEventPass.f40174c, this);
                }
            } else {
                if (Float.intBitsToFloat((int) (C22341t.f(c12, true) & 4294967295L)) != 0.0f) {
                }
                this.f27803q = interfaceC22325c;
                this.f27804r = gVar;
                this.f27806t = 1;
                obj = interfaceC22325c.N1(PointerEventPass.f40174c, this);
            }
            if (c12 == null || c12.b()) {
                return null;
            }
            return c12;
        } while (obj != coroutine_suspended);
        return coroutine_suspended;
    }
}
