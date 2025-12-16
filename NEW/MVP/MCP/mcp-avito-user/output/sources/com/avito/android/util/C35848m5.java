package com.avito.android.util;

import android.content.SharedPreferences;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SharedPreferences.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.util.SharedPreferencesKt$getStringSafely$2", f = "SharedPreferences.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.util.m5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35848m5 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super String>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f318926q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f318927r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35848m5(SharedPreferences sharedPreferences, String str, Continuation<? super C35848m5> continuation) {
        super(2, continuation);
        this.f318926q = sharedPreferences;
        this.f318927r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C35848m5(this.f318926q, this.f318927r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super String> continuation) {
        return ((C35848m5) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f318926q.getString(this.f318927r, null);
    }
}
