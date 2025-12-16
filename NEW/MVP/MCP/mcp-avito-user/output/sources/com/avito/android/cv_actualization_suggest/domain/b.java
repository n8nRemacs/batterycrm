package com.avito.android.cv_actualization_suggest.domain;

import Y61.k;
import com.avito.android.cv_actualization_suggest.domain.a;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: JsxActualizationSuggestInteractorFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization_suggest/domain/b;", "Lcom/avito/android/cv_actualization_suggest/domain/a$a;", "_avito_job_cv-actualization-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a.InterfaceC3933a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.cv_actualization_suggest.data.a f131572a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f131573b;

    @Inject
    public b(@k com.avito.android.cv_actualization_suggest.data.a aVar, @k R0 r02) {
        this.f131572a = aVar;
        this.f131573b = r02;
    }

    @Override // com.avito.android.cv_actualization_suggest.domain.a.InterfaceC3933a
    @k
    public final e create() {
        return new e(this.f131572a, this.f131573b);
    }
}
