package com.vk.push.core.utils;

import androidx.datastore.preferences.core.f;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DataStoreExtensions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/datastore/preferences/core/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Landroidx/datastore/preferences/core/a;)V"}, k = 3, mv = {1, 7, 0})
@DebugMetadata(c = "com.vk.push.core.utils.DataStoreExtensionsKt$setValue$2", f = "DataStoreExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class i extends SuspendLambda implements Y41.p<androidx.datastore.preferences.core.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f367179q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f367180r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f.a<Object> f367181s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Object obj, f.a<Object> aVar, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f367180r = obj;
        this.f367181s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        i iVar = new i(this.f367180r, this.f367181s, continuation);
        iVar.f367179q = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(androidx.datastore.preferences.core.a aVar, Continuation<? super G0> continuation) {
        return ((i) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        androidx.datastore.preferences.core.a aVar = (androidx.datastore.preferences.core.a) this.f367179q;
        Object obj2 = this.f367180r;
        f.a<?> aVar2 = this.f367181s;
        if (obj2 != null) {
            aVar.d(aVar2, obj2);
        } else {
            aVar.c();
            aVar.f45556a.remove(aVar2);
        }
        return G0.f406611a;
    }
}
