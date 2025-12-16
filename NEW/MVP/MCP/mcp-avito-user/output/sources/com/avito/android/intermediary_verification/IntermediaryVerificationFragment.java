package com.avito.android.intermediary_verification;

import Y41.l;
import Y61.k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.intermediary_verification.presentation.mvi.entity.IntermediaryVerificationAction;
import com.avito.android.ui.fragments.BaseFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IntermediaryVerificationFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/intermediary_verification/IntermediaryVerificationFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntermediaryVerificationFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @k
    public static final a f173084n0 = new a(null);

    /* compiled from: IntermediaryVerificationFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/intermediary_verification/IntermediaryVerificationFragment$a;", "", "<init>", "()V", "", "KEY_VERIFICATION_DATA", "Ljava/lang/String;", "_avito_intermediary-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: IntermediaryVerificationFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationAction;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/intermediary_verification/presentation/mvi/entity/IntermediaryVerificationAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<IntermediaryVerificationAction, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f173085l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(IntermediaryVerificationAction intermediaryVerificationAction) {
            return G0.f406611a;
        }
    }

    public IntermediaryVerificationFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.intermediary_verification_fragment, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(@Y61.k android.view.View r11, @Y61.l android.os.Bundle r12) {
        /*
            r10 = this;
            super.onViewCreated(r11, r12)
            android.os.Bundle r12 = r10.getArguments()
            java.lang.String r0 = "key.intermediary_verification_data"
            r1 = 0
            if (r12 == 0) goto L13
            android.os.Parcelable r12 = r12.getParcelable(r0)
            com.avito.android.intermediary_verification.data.model.IntermediaryVerificationData r12 = (com.avito.android.intermediary_verification.data.model.IntermediaryVerificationData) r12
            goto L14
        L13:
            r12 = r1
        L14:
            if (r12 == 0) goto L36
            com.avito.android.intermediary_verification.presentation.c r2 = new com.avito.android.intermediary_verification.presentation.c
            androidx.fragment.app.m r3 = r10.l1()
            boolean r4 = r3 instanceof com.avito.android.intermediary_verification.IntermediaryVerificationActivity
            if (r4 == 0) goto L23
            com.avito.android.intermediary_verification.IntermediaryVerificationActivity r3 = (com.avito.android.intermediary_verification.IntermediaryVerificationActivity) r3
            goto L24
        L23:
            r3 = r1
        L24:
            if (r3 == 0) goto L2e
            Y41.l<? super com.avito.android.intermediary_verification.presentation.mvi.entity.IntermediaryVerificationAction, kotlin.G0> r3 = r3.f173077p
            if (r3 == 0) goto L2b
            goto L2c
        L2b:
            r3 = r1
        L2c:
            if (r3 != 0) goto L30
        L2e:
            com.avito.android.intermediary_verification.IntermediaryVerificationFragment$b r3 = com.avito.android.intermediary_verification.IntermediaryVerificationFragment.b.f173085l
        L30:
            r2.<init>(r11, r3)
            r2.a(r12)
        L36:
            android.os.Bundle r11 = r10.getArguments()
            if (r11 == 0) goto L43
            android.os.Parcelable r11 = r11.getParcelable(r0)
            r1 = r11
            com.avito.android.intermediary_verification.data.model.IntermediaryVerificationData r1 = (com.avito.android.intermediary_verification.data.model.IntermediaryVerificationData) r1
        L43:
            if (r1 == 0) goto L65
            java.lang.String r11 = r1.f173097i
            if (r11 == 0) goto L65
            com.avito.android.deeplink_handler.view.a$i r0 = r10.f5()
            com.avito.android.printable_text.PrintableText r1 = com.avito.android.printable_text.b.f(r11)
            com.avito.android.component.toast.f$c$a r11 = com.avito.android.component.toast.f.c.f125255c
            r11.getClass()
            com.avito.android.component.toast.f$c r4 = com.avito.android.component.toast.f.c.a.b()
            r7 = 0
            r8 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r9 = 2030(0x7ee, float:2.845E-42)
            com.avito.android.deeplink_handler.view.a.i.C4057a.d(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.intermediary_verification.IntermediaryVerificationFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
