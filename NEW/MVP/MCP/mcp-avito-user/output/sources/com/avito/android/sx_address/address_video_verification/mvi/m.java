package com.avito.android.sx_address.address_video_verification.mvi;

import BA0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.sx_address.address_video_verification.domain.SendButton;
import com.avito.android.sx_address.address_video_verification.mvi.entity.SxAddressVideoVerificationState;
import com.avito.android.sx_address.address_video_verification.mvi.entity.SxAddressVideoVerificationViewState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: SxAddressVideoVerificationReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "LBA0/b;", "Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationState;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements u<BA0.b, SxAddressVideoVerificationState> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final SxAddressVideoVerificationState a(BA0.b bVar, SxAddressVideoVerificationState sxAddressVideoVerificationState) {
        BA0.b bVar2 = bVar;
        SxAddressVideoVerificationState sxAddressVideoVerificationState2 = sxAddressVideoVerificationState;
        if (bVar2.equals(b.g.f1219a)) {
            return SxAddressVideoVerificationState.a(sxAddressVideoVerificationState2, SxAddressVideoVerificationViewState.Loading.f292703b, null, 0L, 6);
        }
        if (bVar2 instanceof b.e) {
            return SxAddressVideoVerificationState.a(sxAddressVideoVerificationState2, new SxAddressVideoVerificationViewState.NetworkError(((b.e) bVar2).f1217a), null, 0L, 6);
        }
        if (bVar2 instanceof b.k) {
            NA0.a aVar = ((b.k) bVar2).f1223a;
            AttributedText content = aVar.getInfo().getContent();
            NA0.c action = aVar.getInfo().getAction();
            return SxAddressVideoVerificationState.a(sxAddressVideoVerificationState2, new SxAddressVideoVerificationViewState.Content(content, null, new SendButton(action.getTitle(), action.getUrl()), null, 10, null), null, aVar.getInfo().getSizeLimit(), 2);
        }
        boolean z12 = bVar2 instanceof b.j;
        SxAddressVideoVerificationViewState content2 = sxAddressVideoVerificationState2.f292696b;
        if (z12) {
            SxAddressVideoVerificationViewState.Content content3 = (SxAddressVideoVerificationViewState.Content) (!(content2 instanceof SxAddressVideoVerificationViewState.Content) ? null : content2);
            if (content3 != null) {
                content2 = new SxAddressVideoVerificationViewState.Content(content3.f292699b, ((b.j) bVar2).f1222a, content3.f292701d, null);
            }
            return SxAddressVideoVerificationState.a(sxAddressVideoVerificationState2, content2, ((b.j) bVar2).f1222a, 0L, 4);
        }
        if (bVar2 instanceof b.h) {
            SxAddressVideoVerificationViewState.Content content4 = (SxAddressVideoVerificationViewState.Content) (!(content2 instanceof SxAddressVideoVerificationViewState.Content) ? null : content2);
            if (content4 != null) {
                content2 = new SxAddressVideoVerificationViewState.Content(content4.f292699b, null, content4.f292701d, ((b.h) bVar2).f1220a);
            }
            return SxAddressVideoVerificationState.a(sxAddressVideoVerificationState2, content2, null, 0L, 4);
        }
        if (!(bVar2 instanceof b.C0043b)) {
            if (bVar2.equals(b.a.f1213a) ? true : bVar2 instanceof b.c ? true : bVar2.equals(b.d.f1216a) ? true : bVar2 instanceof b.i ? true : bVar2 instanceof b.f) {
                return sxAddressVideoVerificationState2;
            }
            throw new NoWhenBranchMatchedException();
        }
        SxAddressVideoVerificationViewState.Content content5 = (SxAddressVideoVerificationViewState.Content) (!(content2 instanceof SxAddressVideoVerificationViewState.Content) ? null : content2);
        if (content5 != null) {
            content2 = new SxAddressVideoVerificationViewState.Content(content5.f292699b, null, content5.f292701d, null);
        }
        return SxAddressVideoVerificationState.a(sxAddressVideoVerificationState2, content2, null, 0L, 4);
    }
}
