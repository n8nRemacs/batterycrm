package Xd0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.VerificationStartLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.user_verification.UserVerificationSlot;
import com.avito.android.remote.model.category_parameters.slot.user_verification.UserVerificationSlotConfig;
import com.avito.android.remote.model.category_parameters.slot.user_verification.UserVerificationStatus;
import com.avito.android.remote.model.category_parameters.slot.verification.VerificationSlot;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StartVerificationDelegate.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXd0/b;", "LXd0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xd0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C16993b implements InterfaceC16992a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f18987a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.details.a f18988b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f18989c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18990d;

    @Inject
    public C16993b(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.details.a aVar2, @k d dVar) {
        this.f18987a = aVar;
        this.f18988b = aVar2;
        this.f18989c = dVar;
    }

    @Override // Xd0.InterfaceC16992a
    public final void a(@k VerificationStartLink verificationStartLink) {
        this.f18990d = true;
        b.a.a(this.f18987a, verificationStartLink, null, null, 6);
    }

    @Override // Xd0.InterfaceC16992a
    public final boolean b() {
        UserVerificationSlot userVerificationSlot;
        SlotWidget<UserVerificationSlotConfig> widget;
        UserVerificationSlotConfig userVerificationSlotConfig;
        UserVerificationStatus status;
        ParametersTree parametersTreeWa = this.f18988b.wa();
        if (parametersTreeWa == null || (userVerificationSlot = (UserVerificationSlot) parametersTreeWa.getFirstParameterOfType(UserVerificationSlot.class)) == null || (widget = userVerificationSlot.getWidget()) == null || (userVerificationSlotConfig = (UserVerificationSlotConfig) widget.getConfig()) == null || (status = userVerificationSlotConfig.getStatus()) == null) {
            return false;
        }
        return status.cannotProceed();
    }

    @Override // Xd0.InterfaceC16992a
    public final void onResume() {
        VerificationSlot verificationSlot;
        String id2;
        UserVerificationSlot userVerificationSlot;
        String id3;
        if (this.f18990d) {
            this.f18990d = false;
            com.avito.android.details.a aVar = this.f18988b;
            ParametersTree parametersTreeWa = aVar.wa();
            d dVar = this.f18989c;
            if (parametersTreeWa != null && (userVerificationSlot = (UserVerificationSlot) parametersTreeWa.getFirstParameterOfType(UserVerificationSlot.class)) != null && (id3 = userVerificationSlot.getId()) != null) {
                dVar.l(id3);
            }
            ParametersTree parametersTreeWa2 = aVar.wa();
            if (parametersTreeWa2 == null || (verificationSlot = (VerificationSlot) parametersTreeWa2.getFirstParameterOfType(VerificationSlot.class)) == null || (id2 = verificationSlot.getId()) == null) {
                return;
            }
            dVar.l(id2);
        }
    }
}
