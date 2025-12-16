package com.avito.android.calltracking;

import com.avito.android.calltracking.remote.model.CalltrackingAllocationResponse;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CalltrackingBottomSheetViewPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/calltracking/remote/model/CalltrackingAllocationResponse;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.calltracking.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29280h extends kotlin.jvm.internal.N implements Y41.l<P2<? super CalltrackingAllocationResponse>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C29277e f113715l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29280h(C29277e c29277e) {
        super(1);
        this.f113715l = c29277e;
    }

    @Override // Y41.l
    public final G0 invoke(P2<? super CalltrackingAllocationResponse> p22) {
        P2<? super CalltrackingAllocationResponse> p23 = p22;
        boolean z12 = p23 instanceof P2.c;
        C29277e c29277e = this.f113715l;
        if (z12) {
            c29277e.e0(true);
        } else if (p23 instanceof P2.b) {
            c29277e.e0(false);
        } else if (p23 instanceof P2.a) {
            String strK = com.avito.android.error.z.k(((P2.a) p23).f318719a);
            c29277e.e0(false);
            com.avito.android.component.toast.b.b(c29277e.f113709b, strK, 0, null, 0, null, 0, null, null, null, 131070);
        }
        return G0.f406611a;
    }
}
