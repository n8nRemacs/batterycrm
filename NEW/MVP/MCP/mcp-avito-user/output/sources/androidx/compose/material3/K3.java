package androidx.compose.material3;

import androidx.compose.foundation.layout.InterfaceC20572g2;
import androidx.compose.runtime.internal.C22096n;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K3 {

    /* compiled from: TimePicker.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/g2;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/g2;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20572g2, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f34985l = new a();

        public a() {
            super(3);
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(InterfaceC20572g2 interfaceC20572g2, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 17) == 16 && a13.c()) {
                a13.f();
            } else {
                int i12 = Ng.f35206b;
                C21914uj.b(Og.a(a13, R.string.m3c_time_picker_am), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, a13, 0, 0, 131070);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TimePicker.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/g2;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/g2;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20572g2, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f34986l = new b();

        public b() {
            super(3);
        }

        @Override // Y41.q
        public final kotlin.G0 invoke(InterfaceC20572g2 interfaceC20572g2, androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 17) == 16 && a13.c()) {
                a13.f();
            } else {
                int i12 = Ng.f35206b;
                C21914uj.b(Og.a(a13, R.string.m3c_time_picker_pm), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, a13, 0, 0, 131070);
            }
            return kotlin.G0.f406611a;
        }
    }

    static {
        new K3();
        new C22096n(1425358052, a.f34985l, false);
        new C22096n(-1179219109, b.f34986l, false);
    }
}
