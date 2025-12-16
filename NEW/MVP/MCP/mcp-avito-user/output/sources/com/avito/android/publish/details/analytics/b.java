package com.avito.android.publish.details.analytics;

import Pd0.j;
import Pd0.v;
import Qd0.C14884a;
import Qd0.C14885b;
import Qd0.e;
import Qd0.f;
import Qd0.g;
import Qd0.h;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FlowTrackerFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/analytics/b;", "Lcom/avito/android/publish/details/analytics/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.publish.details.analytics.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final v f233461a;

    /* compiled from: FlowTrackerFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PublishDetailsFlowTracker.FlowContext.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PublishDetailsFlowTracker.FlowContext flowContext = PublishDetailsFlowTracker.FlowContext.f233436b;
                iArr[13] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PublishDetailsFlowTracker.FlowContext flowContext2 = PublishDetailsFlowTracker.FlowContext.f233436b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PublishDetailsFlowTracker.FlowContext flowContext3 = PublishDetailsFlowTracker.FlowContext.f233436b;
                iArr[7] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PublishDetailsFlowTracker.FlowContext flowContext4 = PublishDetailsFlowTracker.FlowContext.f233436b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PublishDetailsFlowTracker.FlowContext flowContext5 = PublishDetailsFlowTracker.FlowContext.f233436b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                PublishDetailsFlowTracker.FlowContext flowContext6 = PublishDetailsFlowTracker.FlowContext.f233436b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                PublishDetailsFlowTracker.FlowContext flowContext7 = PublishDetailsFlowTracker.FlowContext.f233436b;
                iArr[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @Inject
    public b(@k v vVar) {
        this.f233461a = vVar;
    }

    @Override // com.avito.android.publish.details.analytics.a
    @l
    public final j a(@k PublishDetailsFlowTracker.FlowContext flowContext) {
        int iOrdinal = flowContext.ordinal();
        v vVar = this.f233461a;
        if (iOrdinal == 1) {
            return new e(vVar);
        }
        if (iOrdinal == 13) {
            return new h(vVar);
        }
        switch (iOrdinal) {
            case 3:
                return new C14884a(vVar);
            case 4:
                return new Qd0.c(vVar);
            case 5:
                return new Qd0.d(vVar);
            case 6:
                return new f(vVar);
            case 7:
                return new C14885b(vVar);
            case 8:
                return new g(vVar);
            default:
                return null;
        }
    }
}
