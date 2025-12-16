package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.C20495q0;
import androidx.compose.ui.input.pointer.C22341t;
import androidx.compose.ui.input.pointer.InterfaceC22325c;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: SelectionGestures.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/c;", "Landroidx/compose/foundation/text/selection/l;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/c;)Landroidx/compose/foundation/text/selection/l;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", i = {0}, l = {283}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull"}, s = {"L$0"})
/* renamed from: androidx.compose.foundation.text.selection.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21015h0 extends RestrictedSuspendLambda implements Y41.p<InterfaceC22325c, Continuation<? super EnumC21022l>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f32026q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f32027r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f32028s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l0.g f32029t;

    /* compiled from: SelectionGestures.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "change", "Ll0/g;", "slop", "Lkotlin/G0;", "invoke-Uv8p0NA", "(Landroidx/compose/ui/input/pointer/C;J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.selection.h0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.input.pointer.C, l0.g, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.g f32030l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.g gVar) {
            super(2);
            this.f32030l = gVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.ui.input.pointer.C c12, l0.g gVar) {
            long j12 = gVar.f413387a;
            c12.a();
            this.f32030l.f406841b = j12;
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21015h0(long j12, l0.g gVar, Continuation<? super C21015h0> continuation) {
        super(2, continuation);
        this.f32028s = j12;
        this.f32029t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C21015h0 c21015h0 = new C21015h0(this.f32028s, this.f32029t, continuation);
        c21015h0.f32027r = obj;
        return c21015h0;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC22325c interfaceC22325c, Continuation<? super EnumC21022l> continuation) {
        return ((C21015h0) create(interfaceC22325c, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC22325c interfaceC22325c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f32026q;
        l0.g gVar = this.f32029t;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC22325c interfaceC22325c2 = (InterfaceC22325c) this.f32027r;
            a aVar = new a(gVar);
            this.f32027r = interfaceC22325c2;
            this.f32026q = 1;
            Object objE = C20495q0.e(interfaceC22325c2, this.f32028s, aVar, this);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC22325c = interfaceC22325c2;
            obj = objE;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC22325c = (InterfaceC22325c) this.f32027r;
            C42729a0.b(obj);
        }
        if (((androidx.compose.ui.input.pointer.C) obj) != null && (gVar.f406841b & 9223372034707292159L) != 9205357640488583168L) {
            return EnumC21022l.f32065c;
        }
        androidx.compose.ui.input.pointer.C c12 = (androidx.compose.ui.input.pointer.C) C42745f0.E(interfaceC22325c.C0().f40278a);
        if (!C22341t.c(c12)) {
            return EnumC21022l.f32067e;
        }
        c12.a();
        return EnumC21022l.f32064b;
    }
}
