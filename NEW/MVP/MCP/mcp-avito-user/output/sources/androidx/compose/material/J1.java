package androidx.compose.material;

import androidx.compose.animation.core.InterfaceC20307p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BottomSheetScaffold.kt */
@androidx.compose.runtime.F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/J1;", "", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C21398x<BottomSheetValue> f32790a;

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/BottomSheetValue;", "invoke", "(Landroidx/compose/material/BottomSheetValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<BottomSheetValue, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f32791l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(BottomSheetValue bottomSheetValue) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/J1$b;", "", "<init>", "()V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Float, Float> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.unit.d f32792l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.compose.ui.unit.d dVar) {
            super(1);
            this.f32792l = dVar;
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            f12.floatValue();
            return Float.valueOf(this.f32792l.M0(H1.f32704b));
        }
    }

    /* compiled from: BottomSheetScaffold.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Float> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.unit.d f32793l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.compose.ui.unit.d dVar) {
            super(0);
            this.f32793l = dVar;
        }

        @Override // Y41.a
        public final Float invoke() {
            return Float.valueOf(this.f32793l.M0(H1.f32705c));
        }
    }

    static {
        new b(null);
    }

    public J1(@Y61.k BottomSheetValue bottomSheetValue, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k InterfaceC20307p<Float> interfaceC20307p, @Y61.k Y41.l<? super BottomSheetValue, Boolean> lVar) {
        this.f32790a = new C21398x<>(bottomSheetValue, new c(dVar), new d(dVar), interfaceC20307p, lVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public J1(BottomSheetValue bottomSheetValue, androidx.compose.ui.unit.d dVar, InterfaceC20307p interfaceC20307p, Y41.l lVar, int i12, C42822w c42822w) {
        if ((i12 & 4) != 0) {
            C21255m1.f33803a.getClass();
            interfaceC20307p = C21255m1.f33804b;
        }
        this(bottomSheetValue, dVar, interfaceC20307p, (i12 & 8) != 0 ? a.f32791l : lVar);
    }
}
