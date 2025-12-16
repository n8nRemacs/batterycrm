package com.avito.android.shift_list.ui;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ShiftListIntentFactory.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shift_list/ui/c;", "Lcom/avito/android/shift_list/ui/b;", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f281096a;

    @Inject
    public c(@k Context context) {
        this.f281096a = context;
    }

    @Override // com.avito.android.shift_list.ui.b
    @k
    public final Intent a() {
        ShiftListActivity.f281080s.getClass();
        return new Intent(this.f281096a, (Class<?>) ShiftListActivity.class);
    }
}
