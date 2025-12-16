package com.avito.android.gig_tutorials.gigtutorials.mvi;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.gig_tutorials.gigtutorials.GigTutorialsOpenParams;
import com.avito.android.gig_tutorials.gigtutorials.mvi.entity.GigTutorialsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GigTutorialsBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_tutorials/gigtutorials/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction;", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements com.avito.android.arch.mvi.b<GigTutorialsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_tutorials.gigtutorials.domain.a f161141a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GigTutorialsOpenParams f161142b;

    @Inject
    public c(@Y61.k com.avito.android.gig_tutorials.gigtutorials.domain.a aVar, @Y61.k GigTutorialsOpenParams gigTutorialsOpenParams) {
        this.f161141a = aVar;
        this.f161142b = gigTutorialsOpenParams;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<GigTutorialsInternalAction> a() {
        return this.f161141a.a(this.f161142b.f161113b);
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
