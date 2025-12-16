package com.avito.android.extended_profile_selection_create.select;

import RA.a;
import android.content.Context;
import android.content.Intent;
import com.avito.android.extended_profile_selection_create.select.L;
import i.AbstractC41201a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSelectionCreateRouter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/j;", "Li/a;", "Lcom/avito/android/extended_profile_selection_create/select/L$a;", "Lkotlin/G0;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile_selection_create.select.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30508j extends AbstractC41201a<L.a, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C30509k f152282b;

    public C30508j(C30509k c30509k) {
        this.f152282b = c30509k;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, L.a aVar) {
        L.a aVar2 = aVar;
        return this.f152282b.f152284b.b(aVar2.f152032a, (512 & 2) != 0 ? null : null, (512 & 4) != 0 ? null : null, (512 & 8) != 0 ? false : false, aVar2.f152034c, (512 & 32) != 0 ? null : null, (512 & 64) != 0 ? null : null, (512 & 128) != 0 ? null : null, aVar2.f152033b);
    }

    @Override // i.AbstractC41201a
    public final G0 parseResult(int i12, Intent intent) {
        if (i12 == -1 && intent != null) {
            new IE.a();
            this.f152282b.f152283a.invoke(new a.h(IE.a.a(intent)));
        }
        return G0.f406611a;
    }
}
