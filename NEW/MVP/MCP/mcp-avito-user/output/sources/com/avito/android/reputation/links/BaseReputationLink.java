package com.avito.android.reputation.links;

import K51.d;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReputationLink.kt */
@d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/reputation/links/BaseReputationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/reputation/links/BenefitLink;", "Lcom/avito/android/reputation/links/CriteriaDetailsLink;", "Lcom/avito/android/reputation/links/CriteriaLink;", "Lcom/avito/android/reputation/links/GrayStateCriteriaLink;", "Lcom/avito/android/reputation/links/GrayStateLink;", "Lcom/avito/android/reputation/links/ReputationLink;", "Lcom/avito/android/reputation/links/RestrictionLink;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BaseReputationLink extends DeepLink {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f254753b;

    public BaseReputationLink(String str, C42822w c42822w) {
        this.f254753b = str;
    }

    @l
    /* renamed from: f, reason: from getter */
    public String getF254753b() {
        return this.f254753b;
    }
}
