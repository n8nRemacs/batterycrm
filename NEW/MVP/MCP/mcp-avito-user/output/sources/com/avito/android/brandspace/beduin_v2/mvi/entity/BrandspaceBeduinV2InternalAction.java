package com.avito.android.brandspace.beduin_v2.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BrandspaceBeduinV2InternalAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/brandspace/beduin_v2/mvi/entity/BrandspaceBeduinV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "HandleBeduinJsonScenario", "UpdateBeduinState", "Lcom/avito/android/brandspace/beduin_v2/mvi/entity/BrandspaceBeduinV2InternalAction$HandleBeduinJsonScenario;", "Lcom/avito/android/brandspace/beduin_v2/mvi/entity/BrandspaceBeduinV2InternalAction$UpdateBeduinState;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BrandspaceBeduinV2InternalAction extends n {

    /* compiled from: BrandspaceBeduinV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/brandspace/beduin_v2/mvi/entity/BrandspaceBeduinV2InternalAction$HandleBeduinJsonScenario;", "Lcom/avito/android/brandspace/beduin_v2/mvi/entity/BrandspaceBeduinV2InternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleBeduinJsonScenario implements BrandspaceBeduinV2InternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f107577b;

        public HandleBeduinJsonScenario(@k String str) {
            this.f107577b = str;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF220626e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF303160d() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleBeduinJsonScenario) && L.f(this.f107577b, ((HandleBeduinJsonScenario) obj).f107577b);
        }

        public final int hashCode() {
            return this.f107577b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("HandleBeduinJsonScenario(scenario="), this.f107577b, ')');
        }
    }

    /* compiled from: BrandspaceBeduinV2InternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brandspace/beduin_v2/mvi/entity/BrandspaceBeduinV2InternalAction$UpdateBeduinState;", "Lcom/avito/android/brandspace/beduin_v2/mvi/entity/BrandspaceBeduinV2InternalAction;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateBeduinState implements BrandspaceBeduinV2InternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractC40048c f107578b;

        public UpdateBeduinState(@k AbstractC40048c abstractC40048c) {
            this.f107578b = abstractC40048c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateBeduinState) && L.f(this.f107578b, ((UpdateBeduinState) obj).f107578b);
        }

        public final int hashCode() {
            return this.f107578b.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateBeduinState(beduinState=" + this.f107578b + ')';
        }
    }
}
