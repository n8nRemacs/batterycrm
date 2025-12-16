package com.avito.android.publish.screen.objects.domain.usecase;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.objects.P0;
import com.avito.android.publish.screen.objects.di.InterfaceC34011b;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import yc.C50213a;

/* compiled from: ObjectValidateUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/objects/domain/usecase/m;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.objects.domain.repository.i f240121a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.objects.domain.repository.a f240122b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.objects.domain.repository.e f240123c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final P0 f240124d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f240125e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f240126f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C50213a f240127g;

    @Inject
    public m(@Y61.k com.avito.android.publish.screen.objects.domain.repository.i iVar, @Y61.k com.avito.android.publish.screen.objects.domain.repository.a aVar, @Y61.k com.avito.android.publish.screen.objects.domain.repository.e eVar, @Y61.k P0 p02, @InterfaceC34011b boolean z12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C50213a c50213a) {
        this.f240121a = iVar;
        this.f240122b = aVar;
        this.f240123c = eVar;
        this.f240124d = p02;
        this.f240125e = z12;
        this.f240126f = interfaceC28373a;
        this.f240127g = c50213a;
    }

    @Y61.k
    public final C43152f0 a(@Y61.k AtomicBoolean atomicBoolean) {
        return new C43152f0(C43175k.G(new i(this, atomicBoolean, null)), new j(this, null));
    }
}
