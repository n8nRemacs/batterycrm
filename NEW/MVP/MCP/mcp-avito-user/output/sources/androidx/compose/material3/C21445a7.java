package androidx.compose.material3;

import androidx.compose.animation.core.InterfaceC20307p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppBar.kt */
@InterfaceC21537e7
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/a7;", "Landroidx/compose/material3/l1;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.a7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21445a7 implements InterfaceC21691l1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC21714m1 f36018a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final InterfaceC20307p<Float> f36019b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.animation.core.H<Float> f36020c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Boolean> f36021d;

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.a7$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f36022l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public C21445a7() {
        throw null;
    }

    public C21445a7(InterfaceC21714m1 interfaceC21714m1, InterfaceC20307p interfaceC20307p, androidx.compose.animation.core.H h12, Y41.a aVar, int i12, C42822w c42822w) {
        aVar = (i12 & 8) != 0 ? a.f36022l : aVar;
        this.f36018a = interfaceC21714m1;
        this.f36019b = interfaceC20307p;
        this.f36020c = h12;
        this.f36021d = aVar;
    }

    @Override // androidx.compose.material3.InterfaceC21691l1
    @Y61.l
    public final InterfaceC20307p<Float> a() {
        return this.f36019b;
    }

    @Override // androidx.compose.material3.InterfaceC21691l1
    @Y61.l
    public final androidx.compose.animation.core.H<Float> b() {
        return this.f36020c;
    }

    @Override // androidx.compose.material3.InterfaceC21691l1
    @Y61.k
    /* renamed from: getState, reason: from getter */
    public final InterfaceC21714m1 getF36018a() {
        return this.f36018a;
    }
}
