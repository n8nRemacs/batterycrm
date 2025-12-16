package com.avito.android.mortgage_invite.client_search.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import e20.InterfaceC39928a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ClientSearchLoadPageUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/domain/b;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC39928a f205378a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final V10.a f205379b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f205380c;

    @Inject
    public b(@k InterfaceC39928a interfaceC39928a, @k V10.a aVar, @k R0 r02) {
        this.f205378a = interfaceC39928a;
        this.f205379b = aVar;
        this.f205380c = r02;
    }

    @k
    public final InterfaceC43160i a(int i12, @k String str) {
        return C43175k.I(this.f205380c.a(), C43175k.G(new a(this, str, i12, null)));
    }
}
