package com.avito.android.async_phone.impl_module.phone_request_link.confirmation_dialog_fragment;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.l;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.async_phone.impl_module.phone_request_link.confirmation_dialog_fragment.a;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.L4;
import com.avito.android.util.S3;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneRequestConfirmationDialogFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/async_phone/impl_module/phone_request_link/confirmation_dialog_fragment/PhoneRequestConfirmationDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_async-phone_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PhoneRequestConfirmationDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: j0, reason: collision with root package name */
    @k
    public static final a f92153j0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public L4 f92154h0;

    /* renamed from: i0, reason: collision with root package name */
    @k
    public final InterfaceC42726C f92155i0;

    /* compiled from: PhoneRequestConfirmationDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/async_phone/impl_module/phone_request_link/confirmation_dialog_fragment/PhoneRequestConfirmationDialogFragment$a;", "", "<init>", "()V", "", "KEY_RESULT_CONFIRMATION", "Ljava/lang/String;", "PARAMS_DEEPLINK", "_avito_async-phone_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PhoneRequestConfirmationDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/PhoneLink$Call;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<PhoneLink.Call> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final PhoneLink.Call invoke() {
            Bundle bundleRequireArguments = PhoneRequestConfirmationDialogFragment.this.requireArguments();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("params_deeplink", PhoneLink.Call.class) : bundleRequireArguments.getParcelable("params_deeplink");
            if (parcelable != null) {
                return (PhoneLink.Call) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public PhoneRequestConfirmationDialogFragment() {
        super(0, 1, null);
        this.f92155i0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        new a.b();
        new a.c();
        this.f92154h0 = S3.a();
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        l.a title = new l.a(requireContext()).setTitle(R.string.async_phone_phone);
        L4 l42 = this.f92154h0;
        if (l42 == null) {
            l42 = null;
        }
        return title.setMessage(l42.a(((PhoneLink.Call) this.f92155i0.getValue()).f133574c)).setPositiveButton(R.string.async_phone_call, new c(this, 0)).setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 8)).create();
    }
}
