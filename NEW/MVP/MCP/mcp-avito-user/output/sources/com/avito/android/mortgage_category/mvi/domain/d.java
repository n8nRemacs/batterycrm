package com.avito.android.mortgage_category.mvi.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SetArchivedUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_category/mvi/domain/d;", "", "_avito_mortgage-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<K10.a> f204942a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f204943b;

    @Inject
    public d(@k R0 r02, @k h31.e eVar) {
        this.f204942a = eVar;
        this.f204943b = r02;
    }

    @k
    public final InterfaceC43160i a(@k String str) {
        return C43175k.I(this.f204943b.a(), C43175k.G(new c(this, str, null)));
    }
}
