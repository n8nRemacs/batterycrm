package kotlin.reflect.jvm.internal.impl.load.java;

import com.avito.android.remote.model.search.InlineFilterValue;
import g51.C40534a;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42887p;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42886o;

/* compiled from: JavaDescriptorVisibilities.java */
/* loaded from: classes8.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42900s f408408a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42900s f408409b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final AbstractC42900s f408410c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final HashMap f408411d;

    /* compiled from: JavaDescriptorVisibilities.java */
    public static class a extends AbstractC42887p {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s
        public final boolean c(@Y61.l r51.h hVar, @Y61.k InterfaceC42886o interfaceC42886o, @Y61.k InterfaceC42882k interfaceC42882k) {
            if (interfaceC42882k != null) {
                return u.c(interfaceC42886o, interfaceC42882k);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1", "isVisible"));
        }
    }

    /* compiled from: JavaDescriptorVisibilities.java */
    public static class b extends AbstractC42887p {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s
        public final boolean c(@Y61.l r51.h hVar, @Y61.k InterfaceC42886o interfaceC42886o, @Y61.k InterfaceC42882k interfaceC42882k) {
            if (interfaceC42882k != null) {
                return u.b(hVar, interfaceC42886o, interfaceC42882k);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2", "isVisible"));
        }
    }

    /* compiled from: JavaDescriptorVisibilities.java */
    public static class c extends AbstractC42887p {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s
        public final boolean c(@Y61.l r51.h hVar, @Y61.k InterfaceC42886o interfaceC42886o, @Y61.k InterfaceC42882k interfaceC42882k) {
            if (interfaceC42882k != null) {
                return u.b(hVar, interfaceC42886o, interfaceC42882k);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3", "isVisible"));
        }
    }

    static {
        a aVar = new a(C40534a.C11189a.f396282c);
        f408408a = aVar;
        b bVar = new b(C40534a.c.f396284c);
        f408409b = bVar;
        c cVar = new c(C40534a.b.f396283c);
        f408410c = cVar;
        HashMap map = new HashMap();
        f408411d = map;
        map.put(aVar.f407782a, aVar);
        map.put(bVar.f407782a, bVar);
        map.put(cVar.f407782a, cVar);
    }

    public static /* synthetic */ void a(int i12) {
        String str = (i12 == 5 || i12 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 5 || i12 == 6) ? 2 : 3];
        switch (i12) {
            case 1:
                objArr[0] = InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME;
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i12 == 5 || i12 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i12 == 2 || i12 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i12 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i12 != 5 && i12 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i12 != 5 && i12 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(r51.h hVar, InterfaceC42886o interfaceC42886o, InterfaceC42882k interfaceC42882k) {
        if (interfaceC42882k == null) {
            a(1);
            throw null;
        }
        int i12 = kotlin.reflect.jvm.internal.impl.resolve.j.f409625a;
        if (c(interfaceC42886o instanceof CallableMemberDescriptor ? kotlin.reflect.jvm.internal.impl.resolve.j.t((CallableMemberDescriptor) interfaceC42886o) : interfaceC42886o, interfaceC42882k)) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.r.f407787c.c(hVar, interfaceC42886o, interfaceC42882k);
    }

    public static boolean c(@Y61.k InterfaceC42886o interfaceC42886o, @Y61.k InterfaceC42882k interfaceC42882k) {
        if (interfaceC42886o == null) {
            a(2);
            throw null;
        }
        if (interfaceC42882k == null) {
            a(3);
            throw null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.K k12 = (kotlin.reflect.jvm.internal.impl.descriptors.K) kotlin.reflect.jvm.internal.impl.resolve.j.i(interfaceC42886o, kotlin.reflect.jvm.internal.impl.descriptors.K.class, false);
        kotlin.reflect.jvm.internal.impl.descriptors.K k13 = (kotlin.reflect.jvm.internal.impl.descriptors.K) kotlin.reflect.jvm.internal.impl.resolve.j.i(interfaceC42882k, kotlin.reflect.jvm.internal.impl.descriptors.K.class, false);
        return (k13 == null || k12 == null || !k12.d().equals(k13.d())) ? false : true;
    }
}
