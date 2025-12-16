package com.avito.android.mortgage_invite.common.domain;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import e20.InterfaceC39928a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;

/* compiled from: UpdateContactInfoUseCase.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/common/domain/f;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC39928a f205518a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f205519b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f205520c;

    @Inject
    public f(@k InterfaceC39928a interfaceC39928a, @k R0 r02, @k a aVar) {
        this.f205518a = interfaceC39928a;
        this.f205519b = r02;
        this.f205520c = aVar;
    }

    @l
    public final Object a(@k Y10.a aVar, @k String str, @k SuspendLambda suspendLambda) {
        return C43259k.g(this.f205519b.a(), new e(aVar, this, str, null), suspendLambda);
    }
}
