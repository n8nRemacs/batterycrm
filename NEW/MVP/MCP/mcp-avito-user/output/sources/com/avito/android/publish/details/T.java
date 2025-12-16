package com.avito.android.publish.details;

import com.avito.android.category_parameters.ParameterElement;
import kotlin.Metadata;

/* compiled from: ItemPresentersDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "timestamp", "Lkotlin/G0;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class T extends kotlin.jvm.internal.N implements Y41.l<Long, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f233160l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.C29377e f233161m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(E e12, ParameterElement.C29377e c29377e) {
        super(1);
        this.f233160l = e12;
        this.f233161m = c29377e;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Long l12) {
        long jLongValue = l12.longValue();
        E e12 = this.f233160l;
        e12.f232637d.U7(this.f233161m, Long.valueOf(jLongValue));
        e12.f232643j.l(null);
        return kotlin.G0.f406611a;
    }
}
