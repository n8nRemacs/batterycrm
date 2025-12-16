package androidx.compose.material3;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AppBar.kt */
@InterfaceC21537e7
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/material3/m1;", "", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC21714m1 {

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/m1$a;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.m1$a */
    public static final class a {

        /* compiled from: AppBar.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/material3/m1;", "it", "", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/material3/m1;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.m1$a$a, reason: collision with other inner class name */
        public static final class C1648a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, InterfaceC21714m1, List<? extends Float>> {

            /* renamed from: l, reason: collision with root package name */
            public static final C1648a f36817l = new C1648a();

            public C1648a() {
                super(2);
            }

            @Override // Y41.p
            public final List<? extends Float> invoke(androidx.compose.runtime.saveable.x xVar, InterfaceC21714m1 interfaceC21714m1) {
                InterfaceC21714m1 interfaceC21714m12 = interfaceC21714m1;
                return C42745f0.U(Float.valueOf(interfaceC21714m12.b()), Float.valueOf(interfaceC21714m12.d()), Float.valueOf(interfaceC21714m12.e()));
            }
        }

        /* compiled from: AppBar.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Landroidx/compose/material3/m1;", "invoke", "(Ljava/util/List;)Landroidx/compose/material3/m1;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.material3.m1$a$b */
        public static final class b extends kotlin.jvm.internal.N implements Y41.l<List<? extends Float>, InterfaceC21714m1> {

            /* renamed from: l, reason: collision with root package name */
            public static final b f36818l = new b();

            public b() {
                super(1);
            }

            @Override // Y41.l
            public final InterfaceC21714m1 invoke(List<? extends Float> list) {
                List<? extends Float> list2 = list;
                float fFloatValue = list2.get(0).floatValue();
                float fFloatValue2 = list2.get(1).floatValue();
                float fFloatValue3 = list2.get(2).floatValue();
                float f12 = E0.f34647a;
                return new C21737n1(fFloatValue, fFloatValue2, fFloatValue3);
            }
        }

        static {
            new a();
            androidx.compose.runtime.saveable.b.a(b.f36818l, C1648a.f36817l);
        }
    }

    float a();

    float b();

    void c(float f12);

    float d();

    float e();
}
