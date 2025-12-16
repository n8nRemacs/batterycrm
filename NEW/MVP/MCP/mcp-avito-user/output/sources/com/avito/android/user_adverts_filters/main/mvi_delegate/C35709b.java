package com.avito.android.user_adverts_filters.main.mvi_delegate;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import qJ0.InterfaceC47308d;

/* compiled from: FiltersDelegateActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_adverts_filters.main.mvi_delegate.FiltersDelegateActor", f = "FiltersDelegateActor.kt", i = {0, 0, 1, 1, 2, 2}, l = {93, 94, 95}, m = "applyBackChange", n = {"this", "previousState", "this", "previousState", "this", "previousState"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* renamed from: com.avito.android.user_adverts_filters.main.mvi_delegate.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C35709b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C35708a f316103q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC47308d.a f316104r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f316105s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f316106t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C35708a f316107u;

    /* renamed from: v, reason: collision with root package name */
    public int f316108v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35709b(C35708a c35708a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f316107u = c35708a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f316106t = obj;
        this.f316108v |= BeduinInputModel.MIN_TEXT_VERSION;
        return C35708a.c(this.f316107u, null, this);
    }
}
