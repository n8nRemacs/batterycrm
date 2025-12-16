package com.avito.android.publish.details;

import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: PublishDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", "it", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d2<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K1 f233599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametersTree f233600c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f233601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f233602e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PublishDetailsFlowTracker.FlowContext[] f233603f;

    public d2(K1 k12, ParametersTree parametersTree, boolean z12, boolean z13, PublishDetailsFlowTracker.FlowContext[] flowContextArr) {
        this.f233599b = k12;
        this.f233600c = parametersTree;
        this.f233601d = z12;
        this.f233602e = z13;
        this.f233603f = flowContextArr;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.b;
        K1 k12 = this.f233599b;
        if (z12) {
            k12.te(this.f233600c, this.f233601d, this.f233602e, this.f233603f);
        } else if (p22 instanceof P2.a) {
            K1.ke(k12, ((P2.a) p22).f318719a);
        } else {
            p22.equals(P2.c.f318721a);
        }
    }
}
