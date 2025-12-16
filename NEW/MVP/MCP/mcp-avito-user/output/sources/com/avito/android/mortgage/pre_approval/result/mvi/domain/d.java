package com.avito.android.mortgage.pre_approval.result.mvi.domain;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.di.B;
import g00.InterfaceC40507d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: GetScoreInteractor.kt */
@B
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/mvi/domain/d;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<IZ.a> f202113a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f202114b;

    @Inject
    public d(@k h31.e<IZ.a> eVar, @k f fVar) {
        this.f202113a = eVar;
        this.f202114b = fVar;
    }

    @k
    public final InterfaceC43160i a(@l MZ.l lVar, @k InterfaceC40507d.b bVar) {
        return C43175k.G(new c(lVar, this, bVar, null));
    }
}
