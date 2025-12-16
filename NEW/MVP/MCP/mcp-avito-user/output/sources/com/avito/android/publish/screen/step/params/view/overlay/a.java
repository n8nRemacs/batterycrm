package com.avito.android.publish.screen.step.params.view.overlay;

import HV.a;
import Y61.k;
import Y61.l;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.printable_text.b;
import com.avito.android.publish.details.InterfaceC33778p;
import java.util.Collections;
import kotlin.G;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kr.C43490a;

/* compiled from: PublishDetailsErrorOverlayPanel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/screen/step/params/view/overlay/a;", "Lcom/avito/android/publish/details/p;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements InterfaceC33778p {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f241652a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f241653b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ContextThemeWrapper f241654c;

    /* renamed from: d, reason: collision with root package name */
    public final int f241655d;

    /* compiled from: PublishDetailsErrorOverlayPanel.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.screen.step.params.view.overlay.a$a, reason: collision with other inner class name */
    public static final class C7234a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f241656l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.h<i> f241657m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7234a(Y41.a<G0> aVar, l0.h<i> hVar) {
            super(0);
            this.f241656l = (N) aVar;
            this.f241657m = hVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            ?? r02 = this.f241656l;
            if (r02 != 0) {
                r02.invoke();
            }
            i iVar = this.f241657m.f406842b;
            if (iVar != null) {
                iVar.f();
            }
            return G0.f406611a;
        }
    }

    public a(@k View view, @k View view2) {
        this.f241652a = view;
        this.f241653b = view2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(view.getContext(), R.style.Theme_DesignSystem_Re23);
        this.f241654c = contextThemeWrapper;
        this.f241655d = contextThemeWrapper.getResources().getDimensionPixelOffset(R.dimen.publish_error_overlay_toast_offset);
    }

    @Override // com.avito.android.publish.details.InterfaceC33778p
    public final int getHeight() {
        throw new G(null, 1, null);
    }

    @Override // com.avito.android.publish.details.InterfaceC33778p
    public final void i(@k ToastBarState toastBarState) {
        a.C0407a c0407a = HV.a.f7100w;
        ContextThemeWrapper contextThemeWrapper = this.f241654c;
        c0407a.getClass();
        C43490a.a(contextThemeWrapper, toastBarState, a.C0407a.b(R.style.PublishErrorToastBar, contextThemeWrapper), 24);
    }

    @Override // com.avito.android.publish.details.InterfaceC33778p
    public final void j3(@k String str) {
        a.C0407a c0407a = HV.a.f7100w;
        ContextThemeWrapper contextThemeWrapper = this.f241654c;
        c0407a.getClass();
        HV.a aVarA = HV.a.a(a.C0407a.b(R.style.PublishDefaultToastBar, contextThemeWrapper), 0, 0, this.f241655d, 0, 3932159);
        IV.a.d(this.f241653b, new ToastBarState(b.f(str), null, ToastBarPosition.f181044b, null, null, null, null, 0, false, false, null, null, 4090, null), aVarA);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [T, com.avito.android.lib.design.toast_bar.k] */
    @Override // com.avito.android.publish.details.InterfaceC33778p
    public final void l(@k PrintableText printableText, @l PrintableText printableText2, @l Y41.a<G0> aVar) {
        a.C0407a c0407a = HV.a.f7100w;
        ContextThemeWrapper contextThemeWrapper = this.f241654c;
        c0407a.getClass();
        HV.a aVarB = a.C0407a.b(R.style.PublishErrorToastBar, contextThemeWrapper);
        l0.h hVar = new l0.h();
        String strK0 = printableText2 != null ? printableText2.k0(contextThemeWrapper) : null;
        if (strK0 == null) {
            strK0 = "";
        }
        hVar.f406842b = IV.a.d(this.f241652a, new ToastBarState(printableText, null, ToastBarPosition.f181046d, null, Collections.singletonList(IV.a.b(aVarB, strK0, contextThemeWrapper, new C7234a(aVar, hVar))), null, null, 0, false, false, null, null, 4074, null), aVarB);
    }
}
