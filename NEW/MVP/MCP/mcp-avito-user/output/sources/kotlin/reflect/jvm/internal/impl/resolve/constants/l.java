package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.G0;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: constantValues.kt */
/* loaded from: classes8.dex */
public abstract class l extends g<G0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f409591b = new a(null);

    /* compiled from: constantValues.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: constantValues.kt */
    public static final class b extends l {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f409592c;

        public b(@Y61.k String str) {
            this.f409592c = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
        public final O a(E e12) {
            return kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410169u, this.f409592c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
        @Y61.k
        public final String toString() {
            return this.f409592c;
        }
    }

    public l() {
        super(G0.f406611a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    public final G0 b() {
        throw new UnsupportedOperationException();
    }
}
