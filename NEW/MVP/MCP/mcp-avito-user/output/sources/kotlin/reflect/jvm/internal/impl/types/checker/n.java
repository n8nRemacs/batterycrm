package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.types.J0;

/* compiled from: NewCapturedType.kt */
/* loaded from: classes8.dex */
final class n extends N implements Y41.a<List<? extends J0>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f410116l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ArrayList arrayList) {
        super(0);
        this.f410116l = arrayList;
    }

    @Override // Y41.a
    public final List<? extends J0> invoke() {
        return this.f410116l;
    }
}
