package com.avito.android.util;

import android.content.SharedPreferences;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SharedPreferences.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.util.SharedPreferencesKt$putStringSafely$2", f = "SharedPreferences.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.util.n5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35856n5 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f318933q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f318934r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f318935s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35856n5(SharedPreferences sharedPreferences, String str, String str2, Continuation<? super C35856n5> continuation) {
        super(2, continuation);
        this.f318933q = sharedPreferences;
        this.f318934r = str;
        this.f318935s = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C35856n5(this.f318933q, this.f318934r, this.f318935s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C35856n5) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        SharedPreferences.Editor editorEdit = this.f318933q.edit();
        editorEdit.putString(this.f318934r, this.f318935s);
        editorEdit.apply();
        return kotlin.G0.f406611a;
    }
}
