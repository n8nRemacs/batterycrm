package com.avito.android.extended_profile_serp;

import android.content.Context;
import android.content.Intent;
import bB.InterfaceC25487a;
import com.avito.android.extended_profile_serp.f0;
import i.AbstractC41201a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSerpRouter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_serp/y;", "Li/a;", "Lcom/avito/android/extended_profile_serp/f0$a;", "Lkotlin/G0;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile_serp.y, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30561y extends AbstractC41201a<f0.a, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C30562z f153122b;

    public C30561y(C30562z c30562z) {
        this.f153122b = c30562z;
    }

    @Override // i.AbstractC41201a
    public final Intent createIntent(Context context, f0.a aVar) {
        f0.a aVar2 = aVar;
        return this.f153122b.f153124b.b(aVar2.f152885a, (512 & 2) != 0 ? null : null, (512 & 4) != 0 ? null : null, (512 & 8) != 0 ? false : false, aVar2.f152887c, (512 & 32) != 0 ? null : null, (512 & 64) != 0 ? null : null, (512 & 128) != 0 ? null : null, aVar2.f152886b);
    }

    @Override // i.AbstractC41201a
    public final G0 parseResult(int i12, Intent intent) {
        if (i12 == -1 && intent != null) {
            new IE.a();
            this.f153122b.f153123a.invoke(new InterfaceC25487a.i(IE.a.a(intent)));
        }
        return G0.f406611a;
    }
}
