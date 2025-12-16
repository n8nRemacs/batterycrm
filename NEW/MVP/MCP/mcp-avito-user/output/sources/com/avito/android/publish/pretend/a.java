package com.avito.android.publish.pretend;

import Y41.l;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.util.AbstractC35806h3;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: PretendFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/h3;", "Lcom/avito/android/remote/model/PretendResult;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/h3;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class a extends N implements l<AbstractC35806h3<? super PretendResult>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PretendFragment f238351l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PretendFragment pretendFragment) {
        super(1);
        this.f238351l = pretendFragment;
    }

    @Override // Y41.l
    public final G0 invoke(AbstractC35806h3<? super PretendResult> abstractC35806h3) {
        AbstractC35806h3<? super PretendResult> abstractC35806h32 = abstractC35806h3;
        boolean z12 = abstractC35806h32 instanceof AbstractC35806h3.c;
        PretendFragment pretendFragment = this.f238351l;
        if (z12) {
            com.avito.android.progress_overlay.l lVar = pretendFragment.f238350i0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.k(null);
        } else if (abstractC35806h32 instanceof AbstractC35806h3.a) {
            com.avito.android.progress_overlay.l lVar2 = pretendFragment.f238350i0;
            (lVar2 != null ? lVar2 : null).a(((AbstractC35806h3.a) abstractC35806h32).f318890a.getF244063c());
        } else if (!(abstractC35806h32 instanceof AbstractC35806h3.b) && !(abstractC35806h32 instanceof AbstractC35806h3.d) && !L.f(abstractC35806h32, AbstractC35806h3.e.f318894a)) {
            L.f(abstractC35806h32, AbstractC35806h3.f.f318895a);
        }
        return G0.f406611a;
    }
}
