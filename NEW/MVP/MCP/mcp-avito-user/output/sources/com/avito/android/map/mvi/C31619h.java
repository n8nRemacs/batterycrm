package com.avito.android.map.mvi;

import com.avito.android.map.mvi.entity.MapInternalAction;
import com.avito.android.map_core.view.draw_button.DrawingState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MapActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.map.mvi.MapActor$process$15", f = "MapActor.kt", i = {0, 0}, l = {471, 473}, m = "invokeSuspend", n = {"$this$flow", "internalAction"}, s = {"L$0", "L$1"})
/* renamed from: com.avito.android.map.mvi.h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31619h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MapInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public MapInternalAction f185257q;

    /* renamed from: r, reason: collision with root package name */
    public int f185258r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f185259s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.map.mvi.entity.a f185260t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C31612a f185261u;

    /* compiled from: MapActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map.mvi.h$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DrawingState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DrawingState drawingState = DrawingState.f185715b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DrawingState drawingState2 = DrawingState.f185715b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DrawingState drawingState3 = DrawingState.f185715b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31619h(C31612a c31612a, com.avito.android.map.mvi.entity.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f185260t = aVar;
        this.f185261u = c31612a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31619h c31619h = new C31619h(this.f185261u, this.f185260t, continuation);
        c31619h.f185259s = obj;
        return c31619h;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C31619h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x014b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r54) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.map.mvi.C31619h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
