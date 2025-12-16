package com.avito.android.extended_profile_serp.di;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.home.InterfaceC30768c;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSerpModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/di/j;", "Lcom/avito/android/home/c;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile_serp.di.j, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30540j implements InterfaceC30768c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Resources f152855a;

    public C30540j(Resources resources) {
        this.f152855a = resources;
    }

    @Override // com.avito.android.home.InterfaceC30768c
    public final int a() {
        return this.f152855a.getInteger(R.integer.profile_adverts_columns);
    }
}
