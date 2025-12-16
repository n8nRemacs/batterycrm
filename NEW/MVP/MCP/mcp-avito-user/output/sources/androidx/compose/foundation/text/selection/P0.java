package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C20991s0;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.selection.C21045x;
import kotlin.Metadata;

/* compiled from: SelectionManager.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/unit/u;", "magnifierSize", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P0 {

    /* compiled from: SelectionManager.android.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/contextmenu/p;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/contextmenu/p;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.foundation.contextmenu.p, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.contextmenu.s f31861l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ L0 f31862m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.foundation.contextmenu.s sVar, L0 l02) {
            super(1);
            this.f31861l = sVar;
            this.f31862m = l02;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.foundation.contextmenu.p pVar) {
            androidx.compose.foundation.contextmenu.p pVar2 = pVar;
            TextContextMenuItems textContextMenuItems = TextContextMenuItems.f30550d;
            L0 l02 = this.f31862m;
            C21045x c21045xE = l02.e();
            boolean z12 = false;
            if (c21045xE != null) {
                C21045x.a aVar = c21045xE.f32156a;
                C21045x.a aVar2 = c21045xE.f32157b;
                if (!kotlin.jvm.internal.L.f(aVar, aVar2)) {
                    z12 = true;
                    if (aVar.f32161c != aVar2.f32161c) {
                        l02.h();
                        throw null;
                    }
                }
            }
            androidx.compose.foundation.contextmenu.s sVar = this.f31861l;
            if (z12) {
                androidx.compose.foundation.contextmenu.p.b(pVar2, new C20991s0(textContextMenuItems), new N0(sVar, l02));
            }
            kotlin.G0 g02 = kotlin.G0.f406611a;
            TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.f30552f;
            l02.h();
            throw null;
        }
    }

    @Y61.k
    public static final Y41.l a(@Y61.k androidx.compose.foundation.contextmenu.s sVar, @Y61.k L0 l02) {
        return new a(sVar, l02);
    }
}
