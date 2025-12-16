package com.avito.android.ab_groups;

import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AbExperimentsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_groups/m;", "Lcom/avito/android/ab_groups/l;", "_avito_ab-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f67667a;

    @Inject
    public m(@Y61.k Context context) {
        this.f67667a = context;
    }

    @Override // com.avito.android.ab_groups.l
    @Y61.k
    public final Intent a() {
        Intent intent = new Intent(this.f67667a, (Class<?>) AbExperimentsActivity.class);
        intent.setFlags(603979776);
        return intent;
    }
}
