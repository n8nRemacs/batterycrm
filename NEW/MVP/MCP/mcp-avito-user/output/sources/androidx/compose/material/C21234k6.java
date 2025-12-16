package androidx.compose.material;

import androidx.compose.animation.core.InterfaceC20307p;
import androidx.compose.runtime.C22040c3;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;

/* compiled from: ModalBottomSheet.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/k6;", "", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.material.k6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21234k6 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20307p<Float> f33737a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f33738b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C21398x<ModalBottomSheetValue> f33739c;

    /* compiled from: ModalBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/ModalBottomSheetValue;", "invoke", "(Landroidx/compose/material/ModalBottomSheetValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.k6$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<ModalBottomSheetValue, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f33740l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(ModalBottomSheetValue modalBottomSheetValue) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: ModalBottomSheet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/k6$b;", "", "<init>", "()V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.k6$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: ModalBottomSheet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.k6$c */
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[ModalBottomSheetValue.values().length];
            try {
                ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.f32953b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: ModalBottomSheet.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.k6$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Float, Float> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.unit.d f33741l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.compose.ui.unit.d dVar) {
            super(1);
            this.f33741l = dVar;
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            f12.floatValue();
            return Float.valueOf(this.f33741l.M0(C21221j6.f33719a));
        }
    }

    /* compiled from: ModalBottomSheet.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.k6$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<Float> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.unit.d f33742l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.compose.ui.unit.d dVar) {
            super(0);
            this.f33742l = dVar;
        }

        @Override // Y41.a
        public final Float invoke() {
            return Float.valueOf(this.f33742l.M0(C21221j6.f33720b));
        }
    }

    static {
        new b(null);
    }

    public C21234k6(@Y61.k ModalBottomSheetValue modalBottomSheetValue, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k Y41.l<? super ModalBottomSheetValue, Boolean> lVar, @Y61.k InterfaceC20307p<Float> interfaceC20307p, boolean z12) {
        this.f33737a = interfaceC20307p;
        this.f33738b = z12;
        this.f33739c = new C21398x<>(modalBottomSheetValue, new d(dVar), new e(dVar), interfaceC20307p, lVar);
        if (z12 && modalBottomSheetValue == ModalBottomSheetValue.f32955d) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }

    public static Object a(C21234k6 c21234k6, ModalBottomSheetValue modalBottomSheetValue, SuspendLambda suspendLambda) {
        Object objD = C21385w.d(c21234k6.f33739c, modalBottomSheetValue, ((C22040c3) c21234k6.f33739c.f34358l).f(), suspendLambda);
        return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : kotlin.G0.f406611a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C21234k6(ModalBottomSheetValue modalBottomSheetValue, androidx.compose.ui.unit.d dVar, Y41.l lVar, InterfaceC20307p interfaceC20307p, boolean z12, int i12, C42822w c42822w) {
        Y41.l lVar2 = (i12 & 4) != 0 ? a.f33740l : lVar;
        if ((i12 & 8) != 0) {
            N5.f32981a.getClass();
            interfaceC20307p = N5.f32982b;
        }
        this(modalBottomSheetValue, dVar, lVar2, interfaceC20307p, (i12 & 16) != 0 ? false : z12);
    }
}
