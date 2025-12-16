package androidx.view;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Transformations.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"X", "Y", "kotlin.jvm.PlatformType", "x", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class F0 extends N implements l<Object, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C23034e0<Object> f46666l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<Object, Object> f46667m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(C23034e0<Object> c23034e0, l<Object, Object> lVar) {
        super(1);
        this.f46666l = c23034e0;
        this.f46667m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(Object obj) {
        this.f46666l.setValue(this.f46667m.invoke(obj));
        return G0.f406611a;
    }
}
