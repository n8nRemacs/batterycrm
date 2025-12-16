package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.publish.screen.step.params.domain.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class CallableC34075b implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f241166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C34076c f241167c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametersTree f241168d;

    public /* synthetic */ CallableC34075b(C34076c c34076c, ParametersTree parametersTree, int i12) {
        this.f241166b = i12;
        this.f241167c = c34076c;
        this.f241168d = parametersTree;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f241166b) {
            case 0:
                return this.f241167c.Ha(this.f241168d, new PublishDetailsFlowTracker.FlowContext[0]);
            default:
                PublishDetailsFlowTracker.FlowContext[] flowContextArr = {PublishDetailsFlowTracker.FlowContext.f233448n};
                return this.f241167c.Ha(this.f241168d, flowContextArr);
        }
    }
}
