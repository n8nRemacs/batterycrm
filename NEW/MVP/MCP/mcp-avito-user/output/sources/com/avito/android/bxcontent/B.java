package com.avito.android.bxcontent;

import android.location.Location;
import bY.InterfaceC25585b;
import com.avito.android.bxcontent.BxContentFragment;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "location", "Lkotlin/G0;", "<anonymous>", "(Landroid/location/Location;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.BxContentFragment$findLocation$1", f = "BxContentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class B extends SuspendLambda implements Y41.p<Location, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f108855q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f108856r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f108857s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f108858t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(BxContentFragment bxContentFragment, boolean z12, boolean z13, Continuation<? super B> continuation) {
        super(2, continuation);
        this.f108856r = bxContentFragment;
        this.f108857s = z12;
        this.f108858t = z13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        B b12 = new B(this.f108856r, this.f108857s, this.f108858t, continuation);
        b12.f108855q = obj;
        return b12;
    }

    @Override // Y41.p
    public final Object invoke(Location location, Continuation<? super kotlin.G0> continuation) {
        return ((B) create(location, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Location location = (Location) this.f108855q;
        BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
        this.f108856r.Z5().accept(new InterfaceC25585b.m(location, this.f108857s, this.f108858t));
        return kotlin.G0.f406611a;
    }
}
