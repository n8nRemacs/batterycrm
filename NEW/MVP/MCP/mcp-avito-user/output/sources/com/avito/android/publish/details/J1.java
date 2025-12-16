package com.avito.android.publish.details;

import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class J1 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f232955b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K1 f232956c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametersTree f232957d;

    public /* synthetic */ J1(K1 k12, ParametersTree parametersTree, int i12) {
        this.f232955b = i12;
        this.f232956c = k12;
        this.f232957d = parametersTree;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f232955b) {
            case 0:
                return this.f232956c.Ha(this.f232957d, new PublishDetailsFlowTracker.FlowContext[0]);
            default:
                PublishDetailsFlowTracker.FlowContext[] flowContextArr = {PublishDetailsFlowTracker.FlowContext.f233448n};
                return this.f232956c.Ha(this.f232957d, flowContextArr);
        }
    }
}
