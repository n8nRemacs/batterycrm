package WO0;

import VO0.b;
import Y61.k;
import androidx.recyclerview.widget.C23424o;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentHistoryAdapter.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_wallet-page_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f17920a = new a();

    /* compiled from: PaymentHistoryAdapter.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"WO0/c$a", "Landroidx/recyclerview/widget/o$f;", "LVO0/b;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C23424o.f<VO0.b> {
        @Override // androidx.recyclerview.widget.C23424o.f
        public final boolean a(VO0.b bVar, VO0.b bVar2) {
            return bVar.equals(bVar2);
        }

        @Override // androidx.recyclerview.widget.C23424o.f
        public final boolean b(VO0.b bVar, VO0.b bVar2) {
            VO0.b bVar3 = bVar;
            VO0.b bVar4 = bVar2;
            return ((bVar3 instanceof b.C1178b) && (bVar4 instanceof b.C1178b)) ? L.f(((b.C1178b) bVar3).f17110a, ((b.C1178b) bVar4).f17110a) : ((bVar3 instanceof b.d) && (bVar4 instanceof b.d)) ? L.f(((b.d) bVar3).f17112a, ((b.d) bVar4).f17112a) : ((bVar3 instanceof b.c) && (bVar4 instanceof b.c)) || ((bVar3 instanceof b.a) && (bVar4 instanceof b.a));
        }
    }
}
