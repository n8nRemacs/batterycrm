package androidx.compose.material3;

import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.unit.h;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;

/* compiled from: SheetDefaults.kt */
@InterfaceC21537e7
@androidx.compose.runtime.F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/Me;", "", "c", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Me {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final c f35132e = new c(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f35133a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f35134b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C21916v<SheetValue> f35135c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.unit.d f35136d;

    /* compiled from: SheetDefaults.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/SheetValue;", "invoke", "(Landroidx/compose/material3/SheetValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<SheetValue, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f35137l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(SheetValue sheetValue) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: SheetDefaults.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/SheetValue;", "invoke", "(Landroidx/compose/material3/SheetValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<SheetValue, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f35138l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(SheetValue sheetValue) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: SheetDefaults.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/Me$c;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: SheetDefaults.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Float, Float> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            f12.floatValue();
            androidx.compose.ui.unit.d dVar = Me.this.f35136d;
            if (dVar == null) {
                throw new IllegalArgumentException("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
            }
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            return Float.valueOf(dVar.M0(56));
        }
    }

    /* compiled from: SheetDefaults.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<Float> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Float invoke() {
            androidx.compose.ui.unit.d dVar = Me.this.f35136d;
            if (dVar == null) {
                throw new IllegalArgumentException("SheetState did not have a density attached. Are you using SheetState with BottomSheetScaffold or ModalBottomSheet component?");
            }
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            return Float.valueOf(dVar.M0(125));
        }
    }

    @InterfaceC42830m
    public Me(boolean z12, @Y61.k SheetValue sheetValue, @Y61.k Y41.l<? super SheetValue, Boolean> lVar, boolean z13) {
        this.f35133a = z12;
        this.f35134b = z13;
        if (z12 && sheetValue == SheetValue.f35419d) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z13 && sheetValue == SheetValue.f35417b) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        C21758o.f36922a.getClass();
        this.f35135c = new C21916v<>(sheetValue, new d(), new e(), C21758o.f36923b, lVar);
    }

    public static Object a(Me me2, SheetValue sheetValue, SuspendLambda suspendLambda) {
        Object objC = C21894u.c(me2.f35135c, sheetValue, ((C22040c3) me2.f35135c.f37500l).f(), suspendLambda);
        return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : kotlin.G0.f406611a;
    }

    @Y61.k
    public final SheetValue b() {
        return (SheetValue) ((C22082i3) this.f35135c.f37495g).getF42167b();
    }

    @Y61.l
    public final Object c(@Y61.k SuspendLambda suspendLambda) {
        if (this.f35134b) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        Object objA = a(this, SheetValue.f35417b, suspendLambda);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.G0.f406611a;
    }

    public final boolean d() {
        return ((C22082i3) this.f35135c.f37495g).getF42167b() != SheetValue.f35417b;
    }

    @Y61.l
    public final Object e(@Y61.k SuspendLambda suspendLambda) {
        if (this.f35133a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object objA = a(this, SheetValue.f35419d, suspendLambda);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.G0.f406611a;
    }

    public /* synthetic */ Me(boolean z12, SheetValue sheetValue, Y41.l lVar, boolean z13, int i12, C42822w c42822w) {
        this(z12, (i12 & 2) != 0 ? SheetValue.f35417b : sheetValue, (i12 & 4) != 0 ? a.f35137l : lVar, (i12 & 8) != 0 ? false : z13);
    }

    public /* synthetic */ Me(boolean z12, androidx.compose.ui.unit.d dVar, SheetValue sheetValue, Y41.l lVar, boolean z13, int i12, C42822w c42822w) {
        this(z12, dVar, (i12 & 4) != 0 ? SheetValue.f35417b : sheetValue, (i12 & 8) != 0 ? b.f35138l : lVar, (i12 & 16) != 0 ? false : z13);
    }

    @InterfaceC21537e7
    public Me(boolean z12, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k SheetValue sheetValue, @Y61.k Y41.l<? super SheetValue, Boolean> lVar, boolean z13) {
        this(z12, sheetValue, lVar, z13);
        this.f35136d = dVar;
    }
}
