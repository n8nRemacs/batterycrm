package com.avito.android.str_cancellation_settings.domain;

import My0.C14544a;
import My0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.str_cancellation_settings.analytics.FromPageLabel;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrCancellationSettingsAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_cancellation_settings/domain/b;", "Lcom/avito/android/str_cancellation_settings/domain/a;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f288330a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.a f288331b;

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.analytics.provider.a aVar) {
        this.f288330a = interfaceC28373a;
        this.f288331b = aVar;
    }

    @Override // com.avito.android.str_cancellation_settings.domain.a
    public final void a(@Y61.k String str, @Y61.k String str2) {
        this.f288330a.c(new My0.c(str, this.f288331b.a(), new b.a(str2)));
    }

    @Override // com.avito.android.str_cancellation_settings.domain.a
    public final void b(@Y61.k String str) {
        this.f288330a.c(new C14544a(str, this.f288331b.a()));
    }

    @Override // com.avito.android.str_cancellation_settings.domain.a
    public final void c(@Y61.k String str, @Y61.l FromPageLabel fromPageLabel) {
        this.f288330a.c(new My0.d(str, this.f288331b.a(), fromPageLabel));
    }

    @Override // com.avito.android.str_cancellation_settings.domain.a
    public final void d(@Y61.k String str, boolean z12) {
        this.f288330a.c(new My0.c(str, this.f288331b.a(), z12 ? b.c.C0713b.f11139c : b.c.a.f11138c));
    }

    @Override // com.avito.android.str_cancellation_settings.domain.a
    public final void e(@Y61.k String str, boolean z12) {
        this.f288330a.c(new My0.c(str, this.f288331b.a(), z12 ? b.d.C0714b.f11142c : b.d.a.f11141c));
    }

    @Override // com.avito.android.str_cancellation_settings.domain.a
    public final void f(@Y61.k String str) {
        this.f288330a.c(new My0.c(str, this.f288331b.a(), b.C0712b.f11136b));
    }
}
