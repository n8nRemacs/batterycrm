package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.C21045x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectionLayout.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/selection/d1;", "Landroidx/compose/foundation/text/selection/l0;", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21005d1 implements InterfaceC21023l0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31945a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31946b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31947c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final C21045x f31948d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C21043w f31949e;

    /* compiled from: SelectionLayout.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/text/selection/d1$a;", "", "<init>", "()V", "", "DEFAULT_SELECTABLE_ID", "J", "", "DEFAULT_SLOT", "I", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.d1$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public C21005d1(boolean z12, int i12, int i13, @Y61.l C21045x c21045x, @Y61.k C21043w c21043w) {
        this.f31945a = z12;
        this.f31946b = i12;
        this.f31947c = i13;
        this.f31948d = c21045x;
        this.f31949e = c21043w;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    /* renamed from: a, reason: from getter */
    public final boolean getF31945a() {
        return this.f31945a;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C21043w getF31949e() {
        return this.f31949e;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    @Y61.k
    public final CrossStatus c() {
        int i12 = this.f31946b;
        int i13 = this.f31947c;
        return i12 < i13 ? CrossStatus.f31830c : i12 > i13 ? CrossStatus.f31829b : this.f31949e.b();
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    @Y61.k
    public final C21043w d() {
        return this.f31949e;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    /* renamed from: e, reason: from getter */
    public final int getF31947c() {
        return this.f31947c;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    @Y61.k
    public final androidx.collection.H0 f(@Y61.k C21045x c21045x) {
        boolean z12 = c21045x.f32158c;
        C21045x.a aVar = c21045x.f32157b;
        C21045x.a aVar2 = c21045x.f32156a;
        if ((!z12 && aVar2.f32160b > aVar.f32160b) || (z12 && aVar2.f32160b <= aVar.f32160b)) {
            c21045x = C21045x.a(c21045x, null, null, !z12, 3);
        }
        long j12 = this.f31949e.f32149a;
        androidx.collection.H0 h02 = androidx.collection.Z.f25658a;
        androidx.collection.H0 h03 = new androidx.collection.H0(0, 1, null);
        h03.h(j12, c21045x);
        return h03;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    @Y61.l
    /* renamed from: g, reason: from getter */
    public final C21045x getF31948d() {
        return this.f31948d;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    public final int getSize() {
        return 1;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    public final boolean h(@Y61.l InterfaceC21023l0 interfaceC21023l0) {
        if (this.f31948d != null && interfaceC21023l0 != null && (interfaceC21023l0 instanceof C21005d1)) {
            if (this.f31946b == interfaceC21023l0.getF31946b()) {
                if (this.f31947c == interfaceC21023l0.getF31947c()) {
                    if (this.f31945a == interfaceC21023l0.getF31945a()) {
                        C21043w c21043w = this.f31949e;
                        c21043w.getClass();
                        C21043w c21043w2 = ((C21005d1) interfaceC21023l0).f31949e;
                        if (c21043w.f32149a == c21043w2.f32149a && c21043w.f32151c == c21043w2.f32151c && c21043w.f32152d == c21043w2.f32152d) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    @Y61.k
    public final C21043w i() {
        return this.f31949e;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    @Y61.k
    public final C21043w j() {
        return this.f31949e;
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    /* renamed from: k, reason: from getter */
    public final int getF31946b() {
        return this.f31946b;
    }

    @Y61.k
    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.f31945a + ", crossed=" + c() + ", info=\n\t" + this.f31949e + ')';
    }

    @Override // androidx.compose.foundation.text.selection.InterfaceC21023l0
    public final void l(@Y61.k Y41.l<? super C21043w, kotlin.G0> lVar) {
    }
}
