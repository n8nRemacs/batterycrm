package com.avito.android.messenger.channels.mvi.header_feature;

import FY.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.conversation.mvi.send.InterfaceC32208e;
import com.avito.android.util.R0;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: ChannelsHeaderActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/header_feature/g;", "Lcom/avito/android/arch/mvi/a;", "LFY/a;", "LFY/b;", "LFY/d;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.header_feature.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31755g implements com.avito.android.arch.mvi.a<FY.a, FY.b, FY.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f187543a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32208e f187544b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f187545c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.channels.filter.j f187546d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f187547e = new AtomicBoolean(true);

    @Inject
    public C31755g(@Y61.k InterfaceC47842z interfaceC47842z, @Y61.k InterfaceC32208e interfaceC32208e, @Y61.k R0 r02, @Y61.k com.avito.android.messenger.channels.filter.j jVar) {
        this.f187543a = interfaceC47842z;
        this.f187544b = interfaceC32208e;
        this.f187545c = r02;
        this.f187546d = jVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.I(this.f187545c.a(), C43175k.N(new C31749a(this.f187546d.d()), C43175k.C(new C31752d(this, aVar, null), com.avito.android.arch.mvi.utils.h.a(C43175k.G(new C31750b(c43197r1, null, this)), C31751c.f187517l))));
    }

    @Override // com.avito.android.arch.mvi.a
    public final /* bridge */ /* synthetic */ InterfaceC43160i<FY.b> b(FY.a aVar, FY.d dVar) {
        return c(aVar);
    }

    @Y61.k
    public final InterfaceC43160i c(@Y61.k FY.a aVar) {
        if (aVar instanceof a.c) {
            return C43175k.G(new C31753e(this, null));
        }
        if (aVar instanceof a.C0291a) {
            return C43175k.G(new C31754f(this, null));
        }
        if (!(aVar instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        this.f187546d.e(((a.b) aVar).f4754a);
        return C43175k.w();
    }
}
