package com.avito.android.advert.item.ownership_discrepancy.mvi.entity;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OwnershipDiscrepancyInternalAction.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/ownership_discrepancy/mvi/entity/OwnershipDiscrepancyInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "FollowLink", "Lcom/avito/android/advert/item/ownership_discrepancy/mvi/entity/OwnershipDiscrepancyInternalAction$FollowLink;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface OwnershipDiscrepancyInternalAction extends n {

    /* compiled from: OwnershipDiscrepancyInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_discrepancy/mvi/entity/OwnershipDiscrepancyInternalAction$FollowLink;", "Lcom/avito/android/advert/item/ownership_discrepancy/mvi/entity/OwnershipDiscrepancyInternalAction;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FollowLink implements OwnershipDiscrepancyInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Uri f78117b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AutotekaTeaserResult f78118c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f78119d;

        public FollowLink(@l Uri uri, @l AutotekaTeaserResult autotekaTeaserResult, @l String str) {
            this.f78117b = uri;
            this.f78118c = autotekaTeaserResult;
            this.f78119d = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FollowLink)) {
                return false;
            }
            FollowLink followLink = (FollowLink) obj;
            return L.f(this.f78117b, followLink.f78117b) && L.f(this.f78118c, followLink.f78118c) && L.f(this.f78119d, followLink.f78119d);
        }

        public final int hashCode() {
            Uri uri = this.f78117b;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            AutotekaTeaserResult autotekaTeaserResult = this.f78118c;
            int iHashCode2 = (iHashCode + (autotekaTeaserResult == null ? 0 : autotekaTeaserResult.hashCode())) * 31;
            String str = this.f78119d;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FollowLink(uri=");
            sb2.append(this.f78117b);
            sb2.append(", teaserAutoteka=");
            sb2.append(this.f78118c);
            sb2.append(", searchContext=");
            return C22026a.c(sb2, this.f78119d, ')');
        }
    }
}
