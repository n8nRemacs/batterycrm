package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.InterfaceC43387f;

/* compiled from: SerialDescriptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface SerialDescriptor {

    /* compiled from: SerialDescriptor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    boolean b();

    int c();

    @InterfaceC43387f
    @Y61.k
    String d(int i12);

    @InterfaceC43387f
    @Y61.k
    List<Annotation> e(int i12);

    @Y61.k
    String f();

    @InterfaceC43387f
    int g(@Y61.k String str);

    @Y61.k
    List<Annotation> getAnnotations();

    @Y61.k
    o getKind();

    @InterfaceC43387f
    @Y61.k
    SerialDescriptor h(int i12);

    @InterfaceC43387f
    boolean i(int i12);

    boolean isInline();
}
