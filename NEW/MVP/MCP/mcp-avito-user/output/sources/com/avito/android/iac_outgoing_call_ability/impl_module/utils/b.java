package com.avito.android.iac_outgoing_call_ability.impl_module.utils;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: NotificationToastObserver.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_outgoing_call_ability/impl_module/utils/b;", "Lcom/avito/android/iac_outgoing_call_ability/impl_module/utils/a;", "LZL/a;", "<init>", "()V", "_avito_iac-outgoing-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@ContributesBinding.b
/* loaded from: classes14.dex */
public final class b implements a, ZL.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e2 f168670a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d2<String> f168671b;

    @Inject
    public b() {
        e2 e2VarA = f2.a(0, 1, BufferOverflow.f410778c);
        this.f168670a = e2VarA;
        this.f168671b = C43175k.a(e2VarA);
    }

    @Override // ZL.a
    @k
    public final d2<String> a() {
        return this.f168671b;
    }

    @Override // com.avito.android.iac_outgoing_call_ability.impl_module.utils.a
    public final void b(@k String str) {
        this.f168670a.K5(str);
    }
}
