package com.avito.android.publish.screen.step.wizard.mvi;

import Pe0.InterfaceC14778b;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: WizardBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/step/wizard/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "LPe0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements com.avito.android.arch.mvi.b<InterfaceC14778b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.screen.step.wizard.data.a f242542a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f242543b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Q1 f242544c;

    @Inject
    public g(@Y61.k com.avito.android.publish.screen.step.wizard.data.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k Q1 q12) {
        this.f242542a = aVar;
        this.f242543b = aVar2;
        this.f242544c = q12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC14778b> a() {
        return C43175k.N(this.f242542a.load(), new f(y.a(this.f242543b.d9()), this));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
