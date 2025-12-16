package com.avito.android.safety.tfa_enable_confirm.code_check.interactor;

import To.InterfaceC15383a;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import io0.InterfaceC42082a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Y1;

/* compiled from: TfaEnableCodeCheckCodeConfirmInteractor.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/tfa_enable_confirm/code_check/interactor/i;", "Lcom/avito/android/safety/tfa_enable_confirm/code_check/interactor/f;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i extends f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f258169a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f258170b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42082a f258171c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y1<InterfaceC15383a> f258172d;

    @Inject
    public i(@Y61.k a aVar, @Y61.k com.avito.android.util.text.a aVar2, @Y61.k InterfaceC42082a interfaceC42082a, @com.avito.android.code_check_public.g @Y61.k Y1<InterfaceC15383a> y12) {
        this.f258169a = aVar;
        this.f258170b = aVar2;
        this.f258171c = interfaceC42082a;
        this.f258172d = y12;
    }

    @Override // com.avito.android.code_check_public.screen.c.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC15383a> a(@Y61.k String str, @Y61.l String str2) {
        return C43175k.G(new h(this, str, null, null));
    }
}
