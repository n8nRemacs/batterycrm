package kotlin.reflect.jvm.internal.impl.util;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.AbstractC42736b;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.types.l0;

/* compiled from: ArrayMap.kt */
@s0
/* loaded from: classes8.dex */
public final class d<T> extends c<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public Object[] f410273b;

    /* renamed from: c, reason: collision with root package name */
    public int f410274c;

    /* compiled from: ArrayMap.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ArrayMap.kt */
    public static final class b extends AbstractC42736b<T> {

        /* renamed from: d, reason: collision with root package name */
        public int f410275d = -1;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d<T> f410276e;

        public b(d<T> dVar) {
            this.f410276e = dVar;
        }

        @Override // kotlin.collections.AbstractC42736b
        public final void a() {
            int i12;
            Object[] objArr;
            do {
                i12 = this.f410275d + 1;
                this.f410275d = i12;
                objArr = this.f410276e.f410273b;
                if (i12 >= objArr.length) {
                    break;
                }
            } while (objArr[i12] == null);
            if (i12 >= objArr.length) {
                this.f406664b = 2;
            } else {
                this.f406665c = (T) objArr[i12];
                this.f406664b = 1;
            }
        }
    }

    static {
        new a(null);
    }

    public d() {
        super(null);
        this.f410273b = new Object[20];
        this.f410274c = 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public final void a(int i12, @Y61.k l0 l0Var) {
        Object[] objArr = this.f410273b;
        if (objArr.length <= i12) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i12);
            this.f410273b = Arrays.copyOf(this.f410273b, length);
        }
        Object[] objArr2 = this.f410273b;
        if (objArr2[i12] == null) {
            this.f410274c++;
        }
        objArr2[i12] = l0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    @Y61.l
    public final T get(int i12) {
        return (T) C42756l.F(i12, this.f410273b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public final int getSize() {
        return this.f410274c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    @Y61.k
    public final Iterator<T> iterator() {
        return new b(this);
    }
}
