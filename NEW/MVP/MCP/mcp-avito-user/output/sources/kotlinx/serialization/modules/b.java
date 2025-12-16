package kotlinx.serialization.modules;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.KSerializer;

/* compiled from: PolymorphicModuleBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/modules/b;", "", "Base", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b<Base> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.d<Base> f413154a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final KSerializer<Base> f413155b;

    @X
    public b() {
        throw null;
    }

    public b(kotlin.reflect.d dVar, KSerializer kSerializer, int i12, C42822w c42822w) {
        kSerializer = (i12 & 2) != 0 ? null : kSerializer;
        this.f413154a = dVar;
        this.f413155b = kSerializer;
        new ArrayList();
    }
}
