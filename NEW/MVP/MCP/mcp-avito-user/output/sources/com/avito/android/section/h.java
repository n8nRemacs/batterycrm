package com.avito.android.section;

import com.avito.android.remote.model.section.SectionTypeElement;
import com.avito.android.section.SectionItemConverter;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: SectionItemConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/section/SectionElementData;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/section/SectionElementData;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.section.SectionItemConverterImpl$convertSectionAsync$1", f = "SectionItemConverter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class h extends SuspendLambda implements Y41.p<T, Continuation<? super SectionElementData<?>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f f264674q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ SectionTypeElement f264675r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SectionItemConverter.Params f264676s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SectionTypeElement f264677t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, SectionTypeElement sectionTypeElement, SectionItemConverter.Params params, SectionTypeElement sectionTypeElement2, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f264674q = fVar;
        this.f264675r = sectionTypeElement;
        this.f264676s = params;
        this.f264677t = sectionTypeElement2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f264674q, this.f264675r, this.f264676s, this.f264677t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super SectionElementData<?>> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        int i12 = f.f264654k;
        return this.f264674q.f(this.f264675r, this.f264676s, this.f264677t);
    }
}
