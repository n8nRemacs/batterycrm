package com.avito.android.progress_info_toast_bar.interactor;

import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import id0.InterfaceC41386a;
import io.reactivex.rxjava3.internal.operators.observable.C;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.rx3.K;

/* compiled from: VacancyProgressInfoInteractorImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/interactor/d;", "Lcom/avito/android/progress_info_toast_bar/interactor/b;", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC41386a> f231533a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f231534b;

    @Inject
    public d(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f231533a = eVar;
        this.f231534b = r02;
    }

    @Override // com.avito.android.progress_info_toast_bar.interactor.b
    @Y61.k
    public final C a(@Y61.l Long l12, @Y61.l Long l13, @Y61.l String str) {
        return K.a(this.f231534b.a(), new c(this, l12, str, l13, null));
    }
}
