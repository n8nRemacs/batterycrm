package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C42892d;

/* compiled from: KTypeImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/lang/reflect/Type;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class U extends kotlin.jvm.internal.N implements Y41.a<List<? extends Type>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T f407067l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(T t12) {
        super(0);
        this.f407067l = t12;
    }

    @Override // Y41.a
    public final List<? extends Type> invoke() {
        return C42892d.c(this.f407067l.g());
    }
}
