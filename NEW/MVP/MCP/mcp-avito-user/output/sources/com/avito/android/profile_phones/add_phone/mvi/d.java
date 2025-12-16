package com.avito.android.profile_phones.add_phone.mvi;

import Y41.p;
import com.avito.android.profile_phones.add_phone.mvi.entity.AddPhoneInternalAction;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AddPhoneActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_phones.add_phone.mvi.AddPhoneActor$validatePhoneAndRequestConfirmCode$1", f = "AddPhoneActor.kt", i = {0, 1, 2, 3, 4}, l = {67, 72, 78, 80, UpdateStatusCode.DialogButton.CONFIRM, 106}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes16.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super AddPhoneInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f226890q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f226891r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f226892s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f226893t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f226892s = eVar;
        this.f226893t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f226892s, this.f226893t, continuation);
        dVar.f226891r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AddPhoneInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:8:0x0021, B:13:0x002d, B:44:0x00b7, B:58:0x0122, B:16:0x0036, B:40:0x00a3, B:19:0x003e, B:32:0x0087, B:33:0x0089, B:35:0x008d, B:37:0x0097, B:41:0x00a7, B:45:0x00ba, B:47:0x00be, B:49:0x00d5, B:50:0x00db, B:51:0x00e5, B:53:0x00e9, B:55:0x0104, B:57:0x0108, B:61:0x012e, B:62:0x0133, B:26:0x0062, B:28:0x006c, B:29:0x0076), top: B:74:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:8:0x0021, B:13:0x002d, B:44:0x00b7, B:58:0x0122, B:16:0x0036, B:40:0x00a3, B:19:0x003e, B:32:0x0087, B:33:0x0089, B:35:0x008d, B:37:0x0097, B:41:0x00a7, B:45:0x00ba, B:47:0x00be, B:49:0x00d5, B:50:0x00db, B:51:0x00e5, B:53:0x00e9, B:55:0x0104, B:57:0x0108, B:61:0x012e, B:62:0x0133, B:26:0x0062, B:28:0x006c, B:29:0x0076), top: B:74:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:8:0x0021, B:13:0x002d, B:44:0x00b7, B:58:0x0122, B:16:0x0036, B:40:0x00a3, B:19:0x003e, B:32:0x0087, B:33:0x0089, B:35:0x008d, B:37:0x0097, B:41:0x00a7, B:45:0x00ba, B:47:0x00be, B:49:0x00d5, B:50:0x00db, B:51:0x00e5, B:53:0x00e9, B:55:0x0104, B:57:0x0108, B:61:0x012e, B:62:0x0133, B:26:0x0062, B:28:0x006c, B:29:0x0076), top: B:74:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:8:0x0021, B:13:0x002d, B:44:0x00b7, B:58:0x0122, B:16:0x0036, B:40:0x00a3, B:19:0x003e, B:32:0x0087, B:33:0x0089, B:35:0x008d, B:37:0x0097, B:41:0x00a7, B:45:0x00ba, B:47:0x00be, B:49:0x00d5, B:50:0x00db, B:51:0x00e5, B:53:0x00e9, B:55:0x0104, B:57:0x0108, B:61:0x012e, B:62:0x0133, B:26:0x0062, B:28:0x006c, B:29:0x0076), top: B:74:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.j] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.add_phone.mvi.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
