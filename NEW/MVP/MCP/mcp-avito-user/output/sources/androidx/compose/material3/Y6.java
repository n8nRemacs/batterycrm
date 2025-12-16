package androidx.compose.material3;

import androidx.compose.animation.core.InterfaceC20307p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/Y6;", "Landroidx/compose/material3/El;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class Y6 implements El {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Fl f35887a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final InterfaceC20307p<Float> f35888b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.animation.core.H<Float> f35889c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Boolean> f35890d;

    /* compiled from: AppBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f35891l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public Y6() {
        throw null;
    }

    public Y6(Fl fl2, InterfaceC20307p interfaceC20307p, androidx.compose.animation.core.H h12, Y41.a aVar, int i12, C42822w c42822w) {
        aVar = (i12 & 8) != 0 ? a.f35891l : aVar;
        this.f35887a = fl2;
        this.f35888b = interfaceC20307p;
        this.f35889c = h12;
        this.f35890d = aVar;
    }

    @Override // androidx.compose.material3.El
    @Y61.l
    public final InterfaceC20307p<Float> a() {
        return this.f35888b;
    }

    @Override // androidx.compose.material3.El
    @Y61.l
    public final androidx.compose.animation.core.H<Float> b() {
        return this.f35889c;
    }

    @Override // androidx.compose.material3.El
    @Y61.k
    /* renamed from: getState, reason: from getter */
    public final Fl getF36129a() {
        return this.f35887a;
    }
}
