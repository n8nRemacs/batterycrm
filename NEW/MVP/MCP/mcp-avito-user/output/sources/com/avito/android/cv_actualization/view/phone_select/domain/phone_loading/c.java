package com.avito.android.cv_actualization.view.phone_select.domain.phone_loading;

import Y61.k;
import com.avito.android.cv_actualization.view.phone_select.di.i;
import com.avito.android.remote.InterfaceC34401z0;
import h31.e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: JsxCvActualizationPhoneSelectInitialLoadPhonesInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/domain/phone_loading/c;", "", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC34401z0> f131340a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f131341b;

    @Inject
    public c(@k e<InterfaceC34401z0> eVar, @i boolean z12) {
        this.f131340a = eVar;
        this.f131341b = z12;
    }

    @k
    public final C43152f0 a() {
        return new C43152f0(C43175k.G(new a(this, null)), new b(3, null));
    }
}
