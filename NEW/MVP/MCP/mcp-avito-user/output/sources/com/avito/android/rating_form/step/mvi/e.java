package com.avito.android.rating_form.step.mvi;

import com.avito.android.rating_form.FieldIdentifier;
import com.avito.android.rating_form.step.mvi.entity.RatingFormStepInternalAction;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingFormStepActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/step/mvi/entity/RatingFormStepInternalAction$Empty;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.rating_form.step.mvi.RatingFormStepActor$handleChangeText$1", f = "RatingFormStepActor.kt", i = {}, l = {442, 451, 454}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormStepInternalAction.Empty>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f249561q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f249562r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f249563s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ FieldIdentifier f249564t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f249565u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f249566v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, FieldIdentifier fieldIdentifier, String str, LinkedHashMap linkedHashMap, Continuation continuation) {
        super(2, continuation);
        this.f249563s = jVar;
        this.f249564t = fieldIdentifier;
        this.f249565u = str;
        this.f249566v = linkedHashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        LinkedHashMap linkedHashMap = this.f249566v;
        e eVar = new e(this.f249563s, this.f249564t, this.f249565u, linkedHashMap, continuation);
        eVar.f249562r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super RatingFormStepInternalAction.Empty> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0112 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.step.mvi.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
