package com.avito.android.gig_apply.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.gig_apply.ui.GigSlotOpenParams;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlinx.coroutines.B0;
import kotlinx.coroutines.flow.C0;
import kotlinx.coroutines.flow.C43210w;
import pH.k;

/* compiled from: GigSlotByTimeThresholdInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/domain/e;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f159670a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final GigSlotOpenParams f159671b;

    /* renamed from: c, reason: collision with root package name */
    public long f159672c = 15;

    /* renamed from: d, reason: collision with root package name */
    public boolean f159673d;

    @Inject
    public e(@k h hVar, @k GigSlotOpenParams gigSlotOpenParams) {
        this.f159670a = hVar;
        this.f159671b = gigSlotOpenParams;
    }

    @B0
    public final C0 a(long j12, ActionWaitingFor actionWaitingFor) {
        if (actionWaitingFor == ActionWaitingFor.f159659c) {
            this.f159672c = j12;
        } else {
            this.f159673d = true;
        }
        return com.avito.android.bxcontent.mvi.entity.f.r(C42745f0.U(new C43210w(k.g.f428403a), this.f159670a.b(this.f159671b.f159882b)));
    }
}
