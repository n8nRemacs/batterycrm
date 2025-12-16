package com.avito.android.settings.mvi;

import Nv0.InterfaceC14616a;
import Nv0.InterfaceC14617b;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SettingsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LNv0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.settings.mvi.SettingsActor$handleReplaceMainStartSpaceSelected$1", f = "SettingsActor.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 5, 5}, l = {173, 174, 176, 183, 184, 188, 190}, m = "invokeSuspend", n = {"$this$flow", "replaceMainToggle", "$this$flow", "replaceMainToggle", "$this$flow", "replaceMainToggle", "$this$flow", "result", "$this$flow", "replaceMainToggle"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC14617b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f280895q;

    /* renamed from: r, reason: collision with root package name */
    public int f280896r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f280897s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f280898t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Nv0.d f280899u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14616a.e f280900v;

    /* compiled from: SettingsActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.settings.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C8362a {
        static {
            int[] iArr = new int[BottomNavigationSpace.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BottomNavigationSpace bottomNavigationSpace = BottomNavigationSpace.f107065b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Nv0.d dVar2, InterfaceC14616a.e eVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f280898t = dVar;
        this.f280899u = dVar2;
        this.f280900v = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f280898t, this.f280899u, this.f280900v, continuation);
        aVar.f280897s = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14617b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.settings.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
