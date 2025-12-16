package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.state.ToggleableState;
import com.akita.compose.theme.re23.preview.AbstractC27462u0;
import kotlin.Metadata;
import kotlin.collections.AbstractC42734a;

/* compiled from: TogglePreview.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class R3 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC27462u0.b<ToggleableState> f65493l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f65494m;

    /* compiled from: TogglePreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<ToggleableState> f65495a = kotlin.enums.c.a(ToggleableState.values());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R3(AbstractC27462u0.b bVar, InterfaceC22204y1 interfaceC22204y1) {
        super(0);
        this.f65493l = bVar;
        this.f65494m = interfaceC22204y1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.a
    public final kotlin.G0 invoke() {
        kotlinx.coroutines.flow.Z1<T> z12 = this.f65493l.f65855c;
        kotlin.enums.a<ToggleableState> aVar = a.f65495a;
        z12.setValue(aVar.get((((ToggleableState) this.f65494m.getF42167b()).ordinal() + 1) % ((AbstractC42734a) aVar).getF406660f()));
        return kotlin.G0.f406611a;
    }
}
