package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.InterfaceC43386e;
import kotlinx.serialization.InterfaceC43387f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.internal.e0;
import kotlinx.serialization.x;

/* compiled from: SerializersModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/modules/f;", "", "<init>", "()V", "Lkotlinx/serialization/modules/d;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class f {
    public /* synthetic */ f(C42822w c42822w) {
        this();
    }

    @InterfaceC43387f
    public abstract void a(@Y61.k e0 e0Var);

    @InterfaceC43387f
    @Y61.l
    public abstract <T> KSerializer<T> b(@Y61.k kotlin.reflect.d<T> dVar, @Y61.k List<? extends KSerializer<?>> list);

    @InterfaceC43387f
    @Y61.l
    public abstract InterfaceC43386e c(@Y61.l String str, @Y61.k kotlin.reflect.d dVar);

    @InterfaceC43387f
    @Y61.l
    public abstract <T> x<T> d(@Y61.k kotlin.reflect.d<? super T> dVar, @Y61.k T t12);

    public f() {
    }
}
