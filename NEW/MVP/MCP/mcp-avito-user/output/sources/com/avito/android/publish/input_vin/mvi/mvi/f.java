package com.avito.android.publish.input_vin.mvi.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.publish.C0;
import com.avito.android.publish.di.W;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.R0;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import lD.C43617a;
import ne0.InterfaceC44385b;

/* compiled from: InputVinMviBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/input_vin/mvi/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lne0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements com.avito.android.arch.mvi.b<InterfaceC44385b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C0 f236662a;

    /* renamed from: b, reason: collision with root package name */
    public final int f236663b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f236664c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f236665d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C43617a f236666e;

    @Inject
    public f(@Y61.k C0 c02, @W int i12, @Y61.k R0 r02, boolean z12, @Y61.k C43617a c43617a) {
        this.f236662a = c02;
        this.f236663b = i12;
        this.f236664c = r02;
        this.f236665d = z12;
        this.f236666e = c43617a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC44385b> a() {
        return C43175k.N(new c(new C43152f0(C43175k.I(this.f236664c.a(), y.a(this.f236662a.Pe(this.f236663b).q())), new d(3, null))), C43175k.G(new e(this, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }

    public final ParameterSlot c(String str) {
        List<ParameterSlot> parameters;
        CategoryParameters categoryParameters = this.f236662a.f231873k0;
        Object obj = null;
        if (categoryParameters == null || (parameters = categoryParameters.getParameters()) == null) {
            return null;
        }
        Iterator<T> it = parameters.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (L.f(((ParameterSlot) next).getId(), str)) {
                obj = next;
                break;
            }
        }
        return (ParameterSlot) obj;
    }
}
