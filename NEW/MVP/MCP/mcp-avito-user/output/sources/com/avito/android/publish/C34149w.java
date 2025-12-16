package com.avito.android.publish;

import androidx.view.P0;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.validation.InterfaceC35998b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FeesParamsInteractor.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/w;", "Landroidx/lifecycle/P0$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.w, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C34149w implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.H0 f245781a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f245782b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CategoryParametersConverter f245783c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35998b f245784d;

    @Inject
    public C34149w(@Y61.k com.avito.android.remote.H0 h02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k CategoryParametersConverter categoryParametersConverter, @Y61.k InterfaceC35998b interfaceC35998b) {
        this.f245781a = h02;
        this.f245782b = interfaceC35745a5;
        this.f245783c = categoryParametersConverter;
        this.f245784d = interfaceC35998b;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends androidx.view.M0> T create(@Y61.k Class<T> cls) {
        if (cls.isAssignableFrom(C33880m.class)) {
            return new C33880m(this.f245781a, this.f245782b, this.f245783c, this.f245784d);
        }
        throw new IllegalArgumentException(cls.toString());
    }
}
