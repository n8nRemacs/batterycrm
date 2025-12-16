package kotlin.reflect.jvm.internal.impl.load.java.components;

import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k51.r;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: SignaturePropagator.java */
/* loaded from: classes8.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f408036a = new a();

    /* compiled from: SignaturePropagator.java */
    public static class a implements l {
        public static /* synthetic */ void c(int i12) {
            Object[] objArr = new Object[3];
            switch (i12) {
                case 1:
                    objArr[0] = SearchParamsConverterKt.OWNER;
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i12 == 5 || i12 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.l
        public final void a(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar, @Y61.k List list) {
            if (list != null) {
                throw new UnsupportedOperationException("Should not be called");
            }
            c(6);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.l
        @Y61.k
        public final b b(@Y61.k r rVar, @Y61.k InterfaceC42851d interfaceC42851d, @Y61.k O o12, @Y61.k List list, @Y61.k ArrayList arrayList) {
            if (rVar == null) {
                c(0);
                throw null;
            }
            if (interfaceC42851d == null) {
                c(1);
                throw null;
            }
            if (list != null) {
                return new b(o12, list, arrayList, Collections.emptyList());
            }
            c(3);
            throw null;
        }
    }

    /* compiled from: SignaturePropagator.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final O f408037a;

        /* renamed from: b, reason: collision with root package name */
        public final List<k0> f408038b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f408039c;

        /* renamed from: d, reason: collision with root package name */
        public final List<String> f408040d;

        public b(@Y61.k O o12, @Y61.k List list, @Y61.k ArrayList arrayList, @Y61.k List list2) {
            if (list == null) {
                a(1);
                throw null;
            }
            if (list2 == null) {
                a(3);
                throw null;
            }
            this.f408037a = o12;
            this.f408038b = list;
            this.f408039c = arrayList;
            this.f408040d = list2;
        }

        public static /* synthetic */ void a(int i12) {
            String str = (i12 == 4 || i12 == 5 || i12 == 6 || i12 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i12 == 4 || i12 == 5 || i12 == 6 || i12 == 7) ? 2 : 3];
            switch (i12) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i12 == 4) {
                objArr[1] = "getReturnType";
            } else if (i12 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i12 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i12 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
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
    }

    void a(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVar, @Y61.k List list);

    @Y61.k
    b b(@Y61.k r rVar, @Y61.k InterfaceC42851d interfaceC42851d, @Y61.k O o12, @Y61.k List list, @Y61.k ArrayList arrayList);
}
