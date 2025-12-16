package com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls;

import com.avito.android.iac_avcalls.public_module.models.AvCallsCameraPosition;
import com.avito.android.iac_avcalls.public_module.models.AvCallsConnectionQuality;
import com.avito.android.iac_avcalls.public_module.models.AvCallsEvent;
import com.avito.avcalls.android.call.models.CallMetaInfo;
import com.avito.avcalls.android.connection_quality.ConnectionQualityStatus;
import com.avito.avcalls.android.video.CameraPosition;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: AvCallsObserverEventStreamImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/u;", "Lcom/avito/android/iac_avcalls/impl_module/platform_v1/avcalls/t;", "<init>", "()V", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes13.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<AvCallsEvent> f164575a = com.jakewharton.rxrelay3.e.O0(16).M0();

    @Inject
    public u() {
    }

    @Override // com.avito.avcalls.android.a.g
    public final void a(@Y61.k String str, @Y61.k xQ0.b bVar) {
        this.f164575a.accept(new AvCallsEvent.StatsReportDelivered(str, DJ.c.a(bVar)));
    }

    @Override // com.avito.avcalls.android.a.g
    public final void b(@Y61.l CameraPosition cameraPosition) {
        AvCallsCameraPosition avCallsCameraPosition;
        com.jakewharton.rxrelay3.d<AvCallsEvent> dVar = this.f164575a;
        if (cameraPosition != null) {
            int iOrdinal = cameraPosition.ordinal();
            if (iOrdinal == 0) {
                avCallsCameraPosition = AvCallsCameraPosition.f164614b;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                avCallsCameraPosition = AvCallsCameraPosition.f164615c;
            }
        } else {
            avCallsCameraPosition = null;
        }
        dVar.accept(new AvCallsEvent.CameraPositionChanged(avCallsCameraPosition));
    }

    @Override // com.avito.avcalls.android.a.g
    public final void c(@Y61.k xQ0.b bVar) {
        this.f164575a.accept(new AvCallsEvent.CallStateChanged(DJ.c.a(bVar)));
    }

    @Override // com.avito.avcalls.android.a.g
    public final void d(@Y61.k xQ0.b bVar) {
        this.f164575a.accept(new AvCallsEvent.CallTerminated(DJ.c.a(bVar)));
    }

    @Override // com.avito.avcalls.android.a.g
    public final void e(@Y61.k ConnectionQualityStatus connectionQualityStatus) {
        AvCallsConnectionQuality avCallsConnectionQuality;
        com.jakewharton.rxrelay3.d<AvCallsEvent> dVar = this.f164575a;
        int iOrdinal = connectionQualityStatus.ordinal();
        if (iOrdinal == 0) {
            avCallsConnectionQuality = AvCallsConnectionQuality.NO_DATA;
        } else if (iOrdinal == 1) {
            avCallsConnectionQuality = AvCallsConnectionQuality.f164618OK;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            avCallsConnectionQuality = AvCallsConnectionQuality.UNSTABLE;
        }
        dVar.accept(new AvCallsEvent.ConnectionQualityChanged(avCallsConnectionQuality));
    }

    @Override // com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls.t
    @Y61.k
    public final io.reactivex.rxjava3.core.z<AvCallsEvent> f() {
        return this.f164575a;
    }

    @Override // com.avito.avcalls.android.a.g
    public final void g(@Y61.k xQ0.b bVar, @Y61.k String str, @Y61.k String str2, @Y61.k CallMetaInfo callMetaInfo) {
        this.f164575a.accept(new AvCallsEvent.NewIncomingCallReceived(DJ.c.a(bVar), str, str2, DJ.b.a(callMetaInfo)));
    }
}
