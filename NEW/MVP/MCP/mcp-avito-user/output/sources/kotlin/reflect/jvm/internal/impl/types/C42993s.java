package kotlin.reflect.jvm.internal.impl.types;

import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;

/* compiled from: ClassTypeConstructorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42993s extends AbstractC42961b implements q0 {

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.A f410242c;

    /* renamed from: d, reason: collision with root package name */
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.g0> f410243d;

    /* renamed from: e, reason: collision with root package name */
    public final Collection<O> f410244e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42993s(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.impl.A a12, @Y61.k List list, @Y61.k Collection collection, @Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar) {
        super(pVar);
        if (list == null) {
            n(1);
            throw null;
        }
        if (collection == null) {
            n(2);
            throw null;
        }
        if (pVar == null) {
            n(3);
            throw null;
        }
        this.f410242c = a12;
        this.f410243d = Collections.unmodifiableList(new ArrayList(list));
        this.f410244e = Collections.unmodifiableCollection(collection);
    }

    public static /* synthetic */ void n(int i12) {
        String str = (i12 == 4 || i12 == 5 || i12 == 6 || i12 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 4 || i12 == 5 || i12 == 6 || i12 == 7) ? 2 : 3];
        switch (i12) {
            case 1:
                objArr[0] = AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS;
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i12 == 4) {
            objArr[1] = "getParameters";
        } else if (i12 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i12 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i12 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i12 != 4 && i12 != 5 && i12 != 6 && i12 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i12 != 4 && i12 != 5 && i12 != 6 && i12 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    public final boolean c() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42983j
    @Y61.k
    public final Collection<O> e() {
        Collection<O> collection = this.f410244e;
        if (collection != null) {
            return collection;
        }
        n(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.k
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.g0> getParameters() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.g0> list = this.f410243d;
        if (list != null) {
            return list;
        }
        n(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42983j
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.e0 i() {
        e0.a aVar = e0.a.f407541a;
        if (aVar != null) {
            return aVar;
        }
        n(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42961b, kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.k
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final InterfaceC42851d b() {
        kotlin.reflect.jvm.internal.impl.descriptors.impl.A a12 = this.f410242c;
        if (a12 != null) {
            return a12;
        }
        n(5);
        throw null;
    }

    public final String toString() {
        String str = kotlin.reflect.jvm.internal.impl.resolve.j.g(this.f410242c).f409248a;
        if (str != null) {
            return str;
        }
        kotlin.reflect.jvm.internal.impl.name.d.a(4);
        throw null;
    }
}
