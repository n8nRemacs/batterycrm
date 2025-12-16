package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Y;

/* compiled from: AnnotationDescriptorImpl.java */
/* loaded from: classes8.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Y f407513a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> f407514b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f407515c;

    public d(@Y61.k Y y12, @Y61.k Map map, @Y61.k b0 b0Var) {
        if (y12 == null) {
            c(0);
            throw null;
        }
        if (map == null) {
            c(1);
            throw null;
        }
        if (b0Var == null) {
            c(2);
            throw null;
        }
        this.f407513a = y12;
        this.f407514b = map;
        this.f407515c = b0Var;
    }

    public static /* synthetic */ void c(int i12) {
        String str = (i12 == 3 || i12 == 4 || i12 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 3 || i12 == 4 || i12 == 5) ? 2 : 3];
        if (i12 == 1) {
            objArr[0] = "valueArguments";
        } else if (i12 == 2) {
            objArr[0] = SearchParamsConverterKt.SOURCE;
        } else if (i12 == 3 || i12 == 4 || i12 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i12 == 3) {
            objArr[1] = "getType";
        } else if (i12 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i12 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i12 != 3 && i12 != 4 && i12 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i12 != 3 && i12 != 4 && i12 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> b() {
        Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> map = this.f407514b;
        if (map != null) {
            return map;
        }
        c(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.name.c d() {
        InterfaceC42851d interfaceC42851dD = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.d(this);
        if (interfaceC42851dD == null) {
            return null;
        }
        if (kotlin.reflect.jvm.internal.impl.types.error.h.e(interfaceC42851dD)) {
            interfaceC42851dD = null;
        }
        if (interfaceC42851dD != null) {
            return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.c(interfaceC42851dD);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public final b0 e() {
        b0 b0Var = this.f407515c;
        if (b0Var != null) {
            return b0Var;
        }
        c(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public final O getType() {
        Y y12 = this.f407513a;
        if (y12 != null) {
            return y12;
        }
        c(3);
        throw null;
    }

    public final String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.b.f409469b.y(this, null);
    }
}
