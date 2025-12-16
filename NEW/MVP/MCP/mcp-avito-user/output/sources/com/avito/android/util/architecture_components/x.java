package com.avito.android.util.architecture_components;

import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.publish.details.C33796v0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LiveDatas.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class x extends N implements Y41.l<Object, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f318821l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C33796v0 f318822m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(InterfaceC22983P interfaceC22983P, C33796v0 c33796v0) {
        super(1);
        this.f318821l = interfaceC22983P;
        this.f318822m = c33796v0;
    }

    @Override // Y41.l
    public final G0 invoke(Object obj) {
        InterfaceC22983P interfaceC22983P = this.f318821l;
        boolean zA2 = interfaceC22983P.getLifecycle().getF46705d().a(Lifecycle.State.f46683f);
        C33796v0 c33796v0 = this.f318822m;
        if (zA2) {
            c33796v0.onChanged(obj);
        } else {
            interfaceC22983P.getLifecycle().a(new w(c33796v0, obj, interfaceC22983P));
        }
        return G0.f406611a;
    }
}
