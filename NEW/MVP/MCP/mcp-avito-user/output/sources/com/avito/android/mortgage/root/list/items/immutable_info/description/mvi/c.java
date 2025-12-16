package com.avito.android.mortgage.root.list.items.immutable_info.description.mvi;

import Y61.l;
import androidx.compose.runtime.internal.P;
import b10.InterfaceC25386a;
import com.avito.android.mortgage.root.list.items.immutable_info.description.model.ImmutableInfoDescriptionArguments;
import com.avito.android.mortgage.root.list.items.immutable_info.description.mvi.entity.ImmutableInfoDescriptionInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ImmutableInfoDescriptionBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/immutable_info/description/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/mortgage/root/list/items/immutable_info/description/mvi/entity/ImmutableInfoDescriptionInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.arch.mvi.b<ImmutableInfoDescriptionInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ImmutableInfoDescriptionArguments f202611a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25386a f202612b;

    @Inject
    public c(@Y61.k ImmutableInfoDescriptionArguments immutableInfoDescriptionArguments, @Y61.k InterfaceC25386a interfaceC25386a) {
        this.f202611a = immutableInfoDescriptionArguments;
        this.f202612b = interfaceC25386a;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ImmutableInfoDescriptionInternalAction> a() {
        ImmutableInfoDescriptionArguments immutableInfoDescriptionArguments = this.f202611a;
        this.f202612b.b(immutableInfoDescriptionArguments.f202607c, immutableInfoDescriptionArguments.f202608d);
        return C43175k.w();
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
