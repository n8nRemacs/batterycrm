package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlinx.serialization.InterfaceC43389h;
import kotlinx.serialization.KSerializer;

/* compiled from: PluginHelperInterfaces.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/N;", "T", "Lkotlinx/serialization/KSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC43389h
/* loaded from: classes8.dex */
public interface N<T> extends KSerializer<T> {

    /* compiled from: PluginHelperInterfaces.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    KSerializer<?>[] childSerializers();

    @Y61.k
    KSerializer<?>[] typeParametersSerializers();
}
