package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.serialization.KSerializer;

/* compiled from: SerializersModuleCollector.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "T", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class k extends N implements Y41.l<List<? extends KSerializer<?>>, KSerializer<?>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ KSerializer<Object> f413166l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(KSerializer<Object> kSerializer) {
        super(1);
        this.f413166l = kSerializer;
    }

    @Override // Y41.l
    public final KSerializer<?> invoke(List<? extends KSerializer<?>> list) {
        return this.f413166l;
    }
}
