package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", "it", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class G<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C34076c f241135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametersTree f241136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f241137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f241138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ PublishDetailsFlowTracker.FlowContext[] f241139f;

    public G(C34076c c34076c, ParametersTree parametersTree, boolean z12, boolean z13, PublishDetailsFlowTracker.FlowContext[] flowContextArr) {
        this.f241135b = c34076c;
        this.f241136c = parametersTree;
        this.f241137d = z12;
        this.f241138e = z13;
        this.f241139f = flowContextArr;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.b;
        C34076c c34076c = this.f241135b;
        if (z12) {
            c34076c.w(this.f241136c, this.f241137d, this.f241138e, this.f241139f);
        } else if (p22 instanceof P2.a) {
            C34076c.n(c34076c, ((P2.a) p22).f318719a);
        } else {
            p22.equals(P2.c.f318721a);
        }
    }
}
