package androidx.compose.material3;

import androidx.compose.animation.core.InterfaceC20307p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/c7;", "Landroidx/compose/material3/El;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.c7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21491c7 implements El {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Fl f36129a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final InterfaceC20307p<Float> f36130b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.animation.core.H<Float> f36131c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Boolean> f36132d;

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.c7$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f36133l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public C21491c7() {
        throw null;
    }

    public C21491c7(Fl fl2, InterfaceC20307p interfaceC20307p, androidx.compose.animation.core.H h12, Y41.a aVar, int i12, C42822w c42822w) {
        aVar = (i12 & 8) != 0 ? a.f36133l : aVar;
        this.f36129a = fl2;
        this.f36130b = interfaceC20307p;
        this.f36131c = h12;
        this.f36132d = aVar;
    }

    @Override // androidx.compose.material3.El
    @Y61.l
    public final InterfaceC20307p<Float> a() {
        return this.f36130b;
    }

    @Override // androidx.compose.material3.El
    @Y61.l
    public final androidx.compose.animation.core.H<Float> b() {
        return this.f36131c;
    }

    @Override // androidx.compose.material3.El
    @Y61.k
    /* renamed from: getState, reason: from getter */
    public final Fl getF37419a() {
        return this.f36129a;
    }
}
