package com.avito.android.calltracking;

import com.avito.android.calltracking.remote.model.Call;
import com.avito.android.calltracking.remote.model.CalltrackingResponse;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: CalltrackingPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/calltracking/remote/model/CalltrackingResponse;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class B extends kotlin.jvm.internal.N implements Y41.l<P2<? super CalltrackingResponse>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D f113546l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K f113547m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(D d12, K k12) {
        super(1);
        this.f113546l = d12;
        this.f113547m = k12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(P2<? super CalltrackingResponse> p22) {
        P2<? super CalltrackingResponse> p23 = p22;
        D d12 = this.f113546l;
        d12.getClass();
        boolean z12 = p23 instanceof P2.c;
        K k12 = this.f113547m;
        com.avito.android.progress_overlay.l lVar = k12.f113582c;
        if (z12) {
            lVar.k(null);
        } else if (p23 instanceof P2.b) {
            List<Call> listF = ((CalltrackingResponse) ((P2.b) p23).f318720a).f();
            ArrayList arrayList = new ArrayList(C42745f0.q(listF, 10));
            Iterator<T> it = listF.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.avito.android.calltracking.item.e((Call) it.next(), null, 2, null));
            }
            d12.f113567b.c(new UV0.c(arrayList));
            k12.f113581b.notifyDataSetChanged();
            lVar.j();
        } else if (p23 instanceof P2.a) {
            lVar.a(com.avito.android.error.z.k(((P2.a) p23).f318719a));
        }
        return G0.f406611a;
    }
}
