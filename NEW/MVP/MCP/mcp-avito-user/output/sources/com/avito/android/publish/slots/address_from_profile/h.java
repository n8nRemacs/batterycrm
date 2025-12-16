package com.avito.android.publish.slots.address_from_profile;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: ReloadListEventWrapper.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/h;", "Lcom/avito/android/publish/slots/address_from_profile/g;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e2 f242837a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d2<G0> f242838b;

    @Inject
    public h() {
        e2 e2VarA = f2.a(0, 1, BufferOverflow.f410778c);
        this.f242837a = e2VarA;
        this.f242838b = C43175k.a(e2VarA);
    }

    @Override // com.avito.android.publish.slots.address_from_profile.g
    @Y61.k
    public final d2<G0> a() {
        return this.f242838b;
    }

    @Override // com.avito.android.publish.slots.address_from_profile.g
    public final void b(@Y61.k G0 g02) {
        this.f242837a.K5(g02);
    }
}
