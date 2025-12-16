package Hm0;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.reputation.links.BaseReputationLink;
import com.avito.android.reputation.links.BenefitLink;
import com.avito.android.reputation.links.CriteriaDetailsLink;
import com.avito.android.reputation.links.CriteriaLink;
import com.avito.android.reputation.links.GrayStateCriteriaLink;
import com.avito.android.reputation.links.GrayStateLink;
import com.avito.android.reputation.links.ReputationLink;
import com.avito.android.reputation.links.RestrictionLink;
import com.avito.android.reputation.ui.ReputationActivity;
import com.avito.android.reputation.ui.ReputationArgs;
import com.avito.android.reputation.ui.Screen;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ReputationIntentFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHm0/c;", "LHm0/b;", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Hm0.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14009c implements InterfaceC14008b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f7692a;

    @Inject
    public C14009c(@k Context context) {
        this.f7692a = context;
    }

    @Override // Hm0.InterfaceC14008b
    @k
    public final Intent a(@k BaseReputationLink baseReputationLink) {
        Screen screen;
        LinkedHashMap linkedHashMap;
        Intent intent = new Intent(this.f7692a, (Class<?>) ReputationActivity.class);
        boolean z12 = baseReputationLink instanceof ReputationLink;
        if (z12) {
            screen = Screen.f254792c;
        } else if (baseReputationLink instanceof CriteriaLink) {
            screen = Screen.f254793d;
        } else if (baseReputationLink instanceof CriteriaDetailsLink) {
            screen = Screen.f254794e;
        } else if (baseReputationLink instanceof BenefitLink) {
            screen = Screen.f254795f;
        } else if (baseReputationLink instanceof RestrictionLink) {
            screen = Screen.f254796g;
        } else if (baseReputationLink instanceof GrayStateLink) {
            screen = Screen.f254797h;
        } else {
            if (!(baseReputationLink instanceof GrayStateCriteriaLink)) {
                throw new NoWhenBranchMatchedException();
            }
            screen = Screen.f254798i;
        }
        if (baseReputationLink instanceof CriteriaDetailsLink) {
            linkedHashMap = P0.j(new Q("id", ((CriteriaDetailsLink) baseReputationLink).f254757d));
        } else if (baseReputationLink instanceof BenefitLink) {
            linkedHashMap = P0.j(new Q("id", ((BenefitLink) baseReputationLink).f254755d));
        } else if (baseReputationLink instanceof RestrictionLink) {
            linkedHashMap = P0.j(new Q("id", ((RestrictionLink) baseReputationLink).f254763d));
        } else {
            if (!(z12 ? true : baseReputationLink instanceof CriteriaLink ? true : baseReputationLink instanceof GrayStateLink ? true : baseReputationLink instanceof GrayStateCriteriaLink)) {
                throw new NoWhenBranchMatchedException();
            }
            linkedHashMap = new LinkedHashMap();
        }
        linkedHashMap.put(SearchParamsConverterKt.SOURCE, baseReputationLink.getF254762c());
        intent.putExtra("args", new ReputationArgs(linkedHashMap, screen.f254801b));
        return intent;
    }
}
