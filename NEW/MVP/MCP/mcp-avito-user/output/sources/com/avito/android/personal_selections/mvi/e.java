package com.avito.android.personal_selections.mvi;

import Y41.p;
import com.avito.android.personal_selections.mvi.entity.PersonalSelectionsItemState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import l70.InterfaceC43570a;

/* compiled from: PersonalSelectionsItemActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Ll70/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.personal_selections.mvi.PersonalSelectionsItemActor$process$4", f = "PersonalSelectionsItemActor.kt", i = {}, l = {51, 51, 54, 54}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements p<InterfaceC43172j<? super l70.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f215811q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f215812r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43570a f215813s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ PersonalSelectionsItemState f215814t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f f215815u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC43570a interfaceC43570a, PersonalSelectionsItemState personalSelectionsItemState, f fVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f215813s = interfaceC43570a;
        this.f215814t = personalSelectionsItemState;
        this.f215815u = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f215813s, this.f215814t, this.f215815u, continuation);
        eVar.f215812r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super l70.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f215811q
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L33
            if (r1 == r6) goto L2b
            if (r1 == r5) goto L26
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            goto L26
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            java.lang.Object r1 = r10.f215812r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L74
        L26:
            kotlin.C42729a0.b(r11)
            goto La2
        L2b:
            java.lang.Object r1 = r10.f215812r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r11)
            goto L56
        L33:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f215812r
            r1 = r11
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            l70.a r11 = r10.f215813s
            boolean r7 = r11 instanceof l70.InterfaceC43570a.b
            com.avito.android.personal_selections.mvi.entity.PersonalSelectionsItemState r8 = r10.f215814t
            com.avito.android.personal_selections.mvi.f r9 = r10.f215815u
            if (r7 == 0) goto L63
            com.avito.android.personal_selections.view.PersonalSelectionsItem r11 = r8.f215818b
            if (r11 != 0) goto La2
            com.avito.android.personal_selections.domain.b r11 = r9.f215819a
            r10.f215812r = r1
            r10.f215811q = r6
            kotlinx.coroutines.flow.i r11 = r11.a()
            if (r11 != r0) goto L56
            return r0
        L56:
            kotlinx.coroutines.flow.i r11 = (kotlinx.coroutines.flow.InterfaceC43160i) r11
            r10.f215812r = r2
            r10.f215811q = r5
            java.lang.Object r11 = kotlinx.coroutines.flow.C43175k.u(r10, r11, r1)
            if (r11 != r0) goto La2
            return r0
        L63:
            boolean r5 = r11 instanceof l70.InterfaceC43570a.c
            if (r5 == 0) goto L81
            com.avito.android.personal_selections.domain.b r11 = r9.f215819a
            r10.f215812r = r1
            r10.f215811q = r4
            kotlinx.coroutines.flow.i r11 = r11.a()
            if (r11 != r0) goto L74
            return r0
        L74:
            kotlinx.coroutines.flow.i r11 = (kotlinx.coroutines.flow.InterfaceC43160i) r11
            r10.f215812r = r2
            r10.f215811q = r3
            java.lang.Object r11 = kotlinx.coroutines.flow.C43175k.u(r10, r11, r1)
            if (r11 != r0) goto La2
            return r0
        L81:
            boolean r11 = r11 instanceof l70.InterfaceC43570a.C11775a
            if (r11 == 0) goto La2
            com.avito.android.personal_selections.view.PersonalSelectionsItem r11 = r8.f215818b
            if (r11 == 0) goto La2
            com.avito.android.analytics.a r0 = r9.f215822d
            j70.a r1 = new j70.a
            com.avito.android.personal_selections.mvi.a r3 = r9.f215823e
            r3.getClass()
            long r3 = r11.f215841f
            r1.<init>(r3)
            r0.c(r1)
            com.avito.android.deeplink_handler.handler.composite.a r0 = r9.f215821c
            com.avito.android.deep_linking.links.DeepLink r11 = r11.f215840e
            r1 = 6
            com.avito.android.deeplink_handler.handler.b.a.a(r0, r11, r2, r2, r1)
        La2:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.personal_selections.mvi.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
