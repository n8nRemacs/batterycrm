package com.avito.android.iac_dialer_ui.pub.call_screen.toasts;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.toast_bar.I;
import com.akita.compose.component.toast_bar.InterfaceC27357f;
import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: IacUICallToast.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/toasts/e;", "Lcom/akita/compose/component/toast_bar/f;", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements InterfaceC27357f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f167346a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final J f167347b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ToastBarDuration f167348c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ToastBarPosition f167349d;

    public e(@k String str, @k J j12) {
        this.f167346a = str;
        this.f167347b = j12;
        G0 g02 = G0.f406611a;
        this.f167348c = ToastBarDuration.f63232d;
        this.f167349d = ToastBarPosition.f63235b;
    }

    @Override // com.akita.compose.component.toast_bar.InterfaceC27357f
    @l
    /* renamed from: b */
    public final String getF63289d() {
        return null;
    }

    @Override // com.akita.compose.component.toast_bar.InterfaceC27357f
    @k
    /* renamed from: getDuration, reason: from getter */
    public final ToastBarDuration getF167348c() {
        return this.f167348c;
    }

    @Override // com.akita.compose.component.toast_bar.InterfaceC27357f
    @k
    /* renamed from: getMessage, reason: from getter */
    public final String getF167346a() {
        return this.f167346a;
    }

    @Override // com.akita.compose.component.toast_bar.InterfaceC27357f
    @k
    /* renamed from: getPosition, reason: from getter */
    public final ToastBarPosition getF167349d() {
        return this.f167349d;
    }

    @Override // com.akita.compose.component.toast_bar.InterfaceC27357f
    @k
    /* renamed from: getStyle, reason: from getter */
    public final J getF167347b() {
        return this.f167347b;
    }

    @Override // com.akita.compose.component.toast_bar.InterfaceC27357f
    public final void c() {
    }

    @Override // com.akita.compose.component.toast_bar.InterfaceC27357f
    public final void dismiss() {
    }

    @Override // com.akita.compose.component.toast_bar.InterfaceC27357f
    public final void a(@k I i12) {
    }
}
