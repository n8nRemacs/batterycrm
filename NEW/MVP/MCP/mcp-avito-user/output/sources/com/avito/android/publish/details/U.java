package com.avito.android.publish.details;

import com.avito.android.blueprints.input.C28876a;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import kotlin.Metadata;

/* compiled from: ItemPresentersDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isSuccess", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class U extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E f233165l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C28876a f233166m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(E e12, C28876a c28876a) {
        super(1);
        this.f233165l = e12;
        this.f233166m = c28876a;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [Y41.a, kotlin.jvm.internal.H] */
    @Override // Y41.l
    public final kotlin.G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C28876a c28876a = this.f233166m;
        E e12 = this.f233165l;
        if (zBooleanValue) {
            e12.y(c28876a);
        } else {
            c28876a.f105937g.invoke();
            e12.f232643j.B9(new PublishDetailsFlowTracker.FlowContext[0]);
        }
        return kotlin.G0.f406611a;
    }
}
