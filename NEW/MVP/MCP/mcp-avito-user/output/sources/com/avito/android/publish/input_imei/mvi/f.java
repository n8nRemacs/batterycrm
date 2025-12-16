package com.avito.android.publish.input_imei.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.di.W;
import com.avito.android.publish.input_imei.mvi.entity.InputImeiInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import le0.C43742c;
import le0.InterfaceC43740a;

/* compiled from: InputImeiActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/input_imei/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "Lle0/a;", "Lcom/avito/android/publish/input_imei/mvi/entity/InputImeiInternalAction;", "Lle0/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements com.avito.android.arch.mvi.a<InterfaceC43740a, InputImeiInternalAction, C43742c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.input_imei.di.m f236391a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.items.e f236392b;

    /* renamed from: c, reason: collision with root package name */
    public final int f236393c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f236394d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.input_imei.h f236395e;

    @Inject
    public f(@Y61.k com.avito.android.publish.input_imei.di.m mVar, @Y61.k com.avito.android.publish.items.e eVar, @W int i12, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k com.avito.android.publish.input_imei.h hVar) {
        this.f236391a = mVar;
        this.f236392b = eVar;
        this.f236393c = i12;
        this.f236394d = interfaceC33535v;
        this.f236395e = hVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InputImeiInternalAction> b(InterfaceC43740a interfaceC43740a, C43742c c43742c) {
        InterfaceC43740a interfaceC43740a2 = interfaceC43740a;
        C43742c c43742c2 = c43742c;
        if (interfaceC43740a2 instanceof InterfaceC43740a.C11791a) {
            return C43175k.G(new a(this, null));
        }
        if (interfaceC43740a2 instanceof InterfaceC43740a.c) {
            return C43175k.G(new b(this, c43742c2, interfaceC43740a2, null));
        }
        if (interfaceC43740a2 instanceof InterfaceC43740a.d) {
            return new C43210w(InputImeiInternalAction.SaveAndExit.f236387b);
        }
        if (interfaceC43740a2 instanceof InterfaceC43740a.b) {
            return C43175k.G(new c(this, null));
        }
        if (interfaceC43740a2 instanceof InterfaceC43740a.e) {
            return C43175k.G(new d(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
