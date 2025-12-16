package com.avito.android.important_addresses.presentation;

import android.view.View;
import android.view.ViewGroup;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImportantAddressesItemHolderFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses/presentation/b;", "LJM/c;", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements JM.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f169618a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final m f169619b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final JM.d f169620c;

    @Inject
    public b(@Y61.k com.avito.android.util.text.a aVar, @Y61.k m mVar, @Y61.k JM.d dVar) {
        this.f169618a = aVar;
        this.f169619b = mVar;
        this.f169620c = dVar;
    }

    @Override // JM.c
    @Y61.k
    public final e a(@Y61.k ViewGroup viewGroup) {
        View viewB = C0.b(viewGroup, R.layout.important_addresses_container, viewGroup, false);
        JM.d dVar = this.f169620c;
        dVar.getClass();
        View viewFindViewById = viewB.findViewById(R.id.button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        dVar.f8926b = (com.avito.android.lib.design.button.Button) viewFindViewById;
        return new e(viewB, this.f169619b, this.f169618a);
    }
}
