package androidx.compose.foundation.text;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BasicText.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/t1;", "Landroidx/compose/ui/layout/i0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21053t1 implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Boolean> f32177a;

    /* compiled from: BasicText.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.t1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<InterfaceC22363h0> f32178l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C21053t1 f32179m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends InterfaceC22363h0> list, C21053t1 c21053t1) {
            super(1);
            this.f32178l = list;
            this.f32179m = c21053t1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            long j12;
            K0.a aVar2 = aVar;
            C21053t1 c21053t1 = this.f32179m;
            ArrayList arrayListF = L.f(c21053t1.f32177a, this.f32178l);
            if (arrayListF != null) {
                int size = arrayListF.size();
                for (int i12 = 0; i12 < size; i12++) {
                    kotlin.Q q12 = (kotlin.Q) arrayListF.get(i12);
                    androidx.compose.ui.layout.K0 k02 = (androidx.compose.ui.layout.K0) q12.f406619b;
                    Y41.a aVar3 = (Y41.a) q12.f406620c;
                    if (aVar3 != null) {
                        j12 = ((androidx.compose.ui.unit.q) aVar3.invoke()).f42864a;
                    } else {
                        androidx.compose.ui.unit.q.f42862b.getClass();
                        j12 = 0;
                    }
                    K0.a.g(aVar2, k02, j12);
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    public C21053t1(@Y61.k Y41.a<Boolean> aVar) {
        this.f32177a = aVar;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        return interfaceC22369k0.L0(C22712b.j(j12), C22712b.i(j12), kotlin.collections.P0.c(), new a(list, this));
    }
}
