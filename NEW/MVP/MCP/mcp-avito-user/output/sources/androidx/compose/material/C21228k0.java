package androidx.compose.material;

import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;

/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/unit/u;", "layoutSize", "Landroidx/compose/ui/unit/b;", "<anonymous parameter 1>", "Lkotlin/Q;", "Landroidx/compose/material/e3;", "Landroidx/compose/material/BackdropValue;", "invoke-GpV2Q24", "(JJ)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.material.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21228k0 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.unit.u, C22712b, kotlin.Q<? extends InterfaceC21153e3<BackdropValue>, ? extends BackdropValue>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f33726l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ L0 f33727m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.e f33728n;

    /* compiled from: BackdropScaffold.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.k0$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BackdropValue.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BackdropValue backdropValue = BackdropValue.f32405b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21228k0(float f12, L0 l02, l0.e eVar) {
        super(2);
        this.f33726l = f12;
        this.f33727m = l02;
        this.f33728n = eVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    @Override // Y41.p
    public final kotlin.Q<? extends InterfaceC21153e3<BackdropValue>, ? extends BackdropValue> invoke(androidx.compose.ui.unit.u uVar, C22712b c22712b) {
        BackdropValue backdropValue;
        long j12 = uVar.f42872a;
        long j13 = c22712b.f42843a;
        u.a aVar = androidx.compose.ui.unit.u.f42871b;
        float f12 = (int) (4294967295L & j12);
        float f13 = this.f33726l;
        InterfaceC21153e3 interfaceC21153e3A = C21385w.a(new C21241l0(f12, f13, f12 - f13, this.f33728n));
        int iOrdinal = ((BackdropValue) this.f33727m.f32846b.f34354h.getF42167b()).ordinal();
        if (iOrdinal == 0) {
            backdropValue = BackdropValue.f32405b;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            backdropValue = BackdropValue.f32406c;
            if (!((C21339s5) interfaceC21153e3A).f34181a.containsKey(backdropValue)) {
                backdropValue = BackdropValue.f32405b;
            }
        }
        return new kotlin.Q<>(interfaceC21153e3A, backdropValue);
    }
}
