package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.H0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSettingsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$changeUniversalWidgetSectionsOrder$1", f = "ExtendedProfileSettingsActor.kt", i = {0, 0, 0, 0}, l = {900, 901}, m = "invokeSuspend", n = {"$this$flow", "group", "currentIndex", "targetIndex"}, s = {"L$0", "L$1", "I$0", "I$1"})
/* renamed from: com.avito.android.profile_settings_extended.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33481b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public H0 f230518q;

    /* renamed from: r, reason: collision with root package name */
    public int f230519r;

    /* renamed from: s, reason: collision with root package name */
    public int f230520s;

    /* renamed from: t, reason: collision with root package name */
    public int f230521t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f230522u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> f230523v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f230524w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f230525x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C33480a f230526y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f230527z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33481b(Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> aVar, String str, boolean z12, C33480a c33480a, String str2, Continuation<? super C33481b> continuation) {
        super(2, continuation);
        this.f230523v = aVar;
        this.f230524w = str;
        this.f230525x = z12;
        this.f230526y = c33480a;
        this.f230527z = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33481b c33481b = new C33481b(this.f230523v, this.f230524w, this.f230525x, this.f230526y, this.f230527z, continuation);
        c33481b.f230522u = obj;
        return c33481b;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33481b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.C33481b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
