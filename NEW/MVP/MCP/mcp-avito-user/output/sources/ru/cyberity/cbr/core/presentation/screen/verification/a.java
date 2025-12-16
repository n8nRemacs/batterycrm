package ru.cyberity.cbr.core.presentation.screen.verification;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.verification.verification_input_inn.o;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.analytics.Control;
import ru.cyberity.cbr.core.analytics.Screen;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.screen.verification.CBRVerificationStepViewModel;
import ru.cyberity.cbr.core.widget.CBRFlaggedInputLayout;
import ru.cyberity.cbr.core.widget.CBRStepState;
import ru.cyberity.cbr.core.widget.CBRStepStateKt;
import ru.cyberity.cbr.core.widget.CBRTextInputEditText;
import ru.cyberity.cbr.core.widget.PhoneKit;
import ru.cyberity.cbr.core.widget.autocompletePhone.PhoneKitProviderKt;
import ru.cyberity.cbr.core.widget.autocompletePhone.ValidationListener;
import ru.cyberity.cbr.core.widget.pincode.CBRPinView;
import ru.cyberity.internal.R;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRVerificationStepFragment.kt */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u0016\u0010\u001dJ!\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020!H\u0002¢\u0006\u0004\b\u0016\u0010\"J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020#H\u0002¢\u0006\u0004\b\u0016\u0010$J\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\u0005J\u000f\u0010%\u001a\u00020\u000bH\u0002¢\u0006\u0004\b%\u0010\u0005J\u000f\u0010&\u001a\u00020\u000bH\u0002¢\u0006\u0004\b&\u0010\u0005J\u000f\u0010'\u001a\u00020\u000bH\u0002¢\u0006\u0004\b'\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0005J!\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010 R\u001d\u0010,\u001a\u0004\u0018\u00010(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010.\u001a\u0004\u0018\u00010(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b-\u0010+R\u001d\u00102\u001a\u0004\u0018\u00010/8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b0\u00101R\u001d\u00106\u001a\u0004\u0018\u0001038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b4\u00105R\u001d\u0010:\u001a\u0004\u0018\u0001078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b8\u00109R\u001d\u0010?\u001a\u0004\u0018\u00010;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b=\u0010>R\u001d\u0010C\u001a\u0004\u0018\u00010@8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\bA\u0010BR\u001d\u0010E\u001a\u0004\u0018\u00010(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010)\u001a\u0004\bD\u0010+R\u001d\u0010I\u001a\u0004\u0018\u00010F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010)\u001a\u0004\bG\u0010HR\u001d\u0010L\u001a\u0004\u0018\u00010(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010)\u001a\u0004\bK\u0010+R\u001d\u0010O\u001a\u0004\u0018\u00010M8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bA\u0010)\u001a\u0004\b<\u0010NR\u001d\u0010P\u001a\u0004\u0018\u00010(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\bJ\u0010+R\u0018\u0010S\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010RR\u001b\u0010W\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\bD\u0010T\u001a\u0004\bU\u0010VR\u0018\u0010Z\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010YR\u0014\u0010^\u001a\u00020[8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020_8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010e¨\u0006g"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/verification/a;", "Lru/cyberity/cbr/core/presentation/BaseFragment;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e;", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel;", "<init>", "()V", "", "getLayoutId", "()I", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "Lkotlin/G0;", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", "Lru/cyberity/cbr/core/common/a0;", "finishReason", "", "onFinishCalled", "(Lru/cyberity/cbr/core/common/a0;)Z", VoiceInfo.STATE, "Landroid/os/Bundle;", "savedInstanceState", "a", "(Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e;Landroid/os/Bundle;)V", "onDestroyView", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$d;", "(Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$d;)V", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$e;", "b", "(Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$e;Landroid/os/Bundle;)V", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$c;", "(Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$c;)V", "Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$b;", "(Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel$e$b;)V", "e", "d", "c", "Landroid/widget/TextView;", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "q", "()Landroid/widget/TextView;", "tvTitle", "p", "tvSubtitle", "Lcom/google/android/material/textfield/TextInputLayout;", "l", "()Lcom/google/android/material/textfield/TextInputLayout;", "tlEmail", "Lcom/google/android/material/textfield/TextInputEditText;", "g", "()Lcom/google/android/material/textfield/TextInputEditText;", "etEmailId", "Lru/cyberity/cbr/core/widget/CBRFlaggedInputLayout;", "m", "()Lru/cyberity/cbr/core/widget/CBRFlaggedInputLayout;", "tlPhone", "Lru/cyberity/cbr/core/widget/CBRTextInputEditText;", "f", "h", "()Lru/cyberity/cbr/core/widget/CBRTextInputEditText;", "etPhone", "Lru/cyberity/cbr/core/widget/pincode/CBRPinView;", "k", "()Lru/cyberity/cbr/core/widget/pincode/CBRPinView;", "pinCode", "n", "tvResendCode", "Landroid/widget/ImageView;", "i", "()Landroid/widget/ImageView;", "ivIcon", "j", "o", "tvStatus", "Landroid/widget/Button;", "()Landroid/widget/Button;", "btnPrimary", "otpErrorText", "Landroid/text/TextWatcher;", "Landroid/text/TextWatcher;", "emailTextWatcher", "Lkotlin/C;", "s", "()Lru/cyberity/cbr/core/presentation/screen/verification/CBRVerificationStepViewModel;", "viewModel", "Lru/cyberity/cbr/core/widget/PhoneKit;", "Lru/cyberity/cbr/core/widget/PhoneKit;", "phoneNumberKit", "Lru/cyberity/cbr/core/analytics/Screen;", "getScreen", "()Lru/cyberity/cbr/core/analytics/Screen;", "screen", "", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Lru/cyberity/cbr/core/presentation/screen/verification/ValidationIdentifierType;", "r", "()Lru/cyberity/cbr/core/presentation/screen/verification/ValidationIdentifierType;", "type", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends BaseFragment<CBRVerificationStepViewModel.e, CBRVerificationStepViewModel> {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f434172q;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @l
    private TextWatcher emailTextWatcher;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    @l
    private PhoneKit phoneNumberKit;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvTitle = i0.a(this, R.id.cbr_title);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvSubtitle = i0.a(this, R.id.cbr_subtitle);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tlEmail = i0.a(this, R.id.cbr_email);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView etEmailId = i0.a(this, R.id.cbr_email_id);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tlPhone = i0.a(this, R.id.cbr_phone);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView etPhone = i0.a(this, R.id.cbr_phone_id);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView pinCode = i0.a(this, R.id.cbr_pin_code);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvResendCode = i0.a(this, R.id.cbr_resend_verification_code);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView ivIcon = i0.a(this, R.id.cbr_status_icon);

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvStatus = i0.a(this, R.id.cbr_status_comment);

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView btnPrimary = i0.a(this, R.id.cbr_primary_button);

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView otpErrorText = i0.a(this, R.id.cbr_otp_error);

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(CBRVerificationStepViewModel.class), new h(new g(this)), new i());

    /* compiled from: CBRVerificationStepFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/verification/a$a;", "", "Lru/cyberity/cbr/core/presentation/screen/verification/ValidationIdentifierType;", "type", "Lru/cyberity/cbr/core/presentation/screen/verification/a;", "a", "", "DEFAULT_CODE_LENGTH", "I", "", "EXTRA_TYPE", "Ljava/lang/String;", "RESULT_CODE_CANCELLED", "RESULT_CODE_INVALID_CODE", "RESULT_CODE_RESEND_CODE", "RESULT_CODE_SEND_CODE", "RESULT_CODE_VERIFIED", "TAG", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.presentation.screen.verification.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final a a(@k ValidationIdentifierType type) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putSerializable("ValidationIdentifier", type);
            aVar.setArguments(bundle);
            return aVar;
        }

        private Companion() {
        }
    }

    /* compiled from: CBRVerificationStepFragment.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f434188a;

        static {
            int[] iArr = new int[ValidationIdentifierType.values().length];
            iArr[ValidationIdentifierType.EMAIL.ordinal()] = 1;
            iArr[ValidationIdentifierType.PHONE.ordinal()] = 2;
            iArr[ValidationIdentifierType.UNKNOWN.ordinal()] = 3;
            f434188a = iArr;
        }
    }

    /* compiled from: CBRVerificationStepFragment.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"ru/cyberity/cbr/core/presentation/screen/verification/a$d", "Lru/cyberity/cbr/core/widget/autocompletePhone/ValidationListener;", "", "isValid", "isBlank", "Lkotlin/G0;", "onValidate", "(ZZ)V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class d implements ValidationListener {
        public d() {
        }

        @Override // ru.cyberity.cbr.core.widget.autocompletePhone.ValidationListener
        public void onValidate(boolean isValid, boolean isBlank) {
            Button buttonF = a.this.f();
            if (buttonF != null) {
                buttonF.setEnabled(isValid);
            }
            CBRFlaggedInputLayout cBRFlaggedInputLayoutM = a.this.m();
            if (cBRFlaggedInputLayoutM == null) {
                return;
            }
            cBRFlaggedInputLayoutM.setError(null);
        }
    }

    /* compiled from: CBRVerificationStepFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"ru/cyberity/cbr/core/presentation/screen/verification/a$f", "Lru/cyberity/cbr/core/widget/pincode/CBRPinView$OnTextCompleteListener;", "", "enteredText", "", "onTextComplete", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class f implements CBRPinView.OnTextCompleteListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CBRVerificationStepViewModel.e.c f434194b;

        public f(CBRVerificationStepViewModel.e.c cVar) {
            this.f434194b = cVar;
        }

        @Override // ru.cyberity.cbr.core.widget.pincode.CBRPinView.OnTextCompleteListener
        public boolean onTextComplete(@k String enteredText) {
            a.this.getViewModel().a(this.f434194b.getId(), enteredText);
            CBRPinView cBRPinViewK = a.this.k();
            if (cBRPinViewK == null) {
                return true;
            }
            s.b(cBRPinViewK);
            return true;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/a0"}, k = 3, mv = {1, 7, 1})
    public static final class g extends N implements Y41.a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f434195a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f434195a = fragment;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f434195a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "a", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a f434196a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f434196a = aVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.f434196a.invoke()).getF42820b();
        }
    }

    /* compiled from: CBRVerificationStepFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "a", "()Landroidx/lifecycle/P0$c;"}, k = 3, mv = {1, 7, 1})
    public static final class i extends N implements Y41.a<P0.c> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0.c invoke() {
            a aVar = a.this;
            return new CBRVerificationStepViewModel.a(aVar, aVar.r(), a.this.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        h0 h0Var = new h0(a.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0);
        n0 n0Var = m0.f406844a;
        f434172q = new n[]{n0Var.i(h0Var), C0.k(a.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "tlEmail", "getTlEmail()Lcom/google/android/material/textfield/TextInputLayout;", 0, n0Var), C0.k(a.class, "etEmailId", "getEtEmailId()Lcom/google/android/material/textfield/TextInputEditText;", 0, n0Var), C0.k(a.class, "tlPhone", "getTlPhone()Lru/cyberity/cbr/core/widget/CBRFlaggedInputLayout;", 0, n0Var), C0.k(a.class, "etPhone", "getEtPhone()Lru/cyberity/cbr/core/widget/CBRTextInputEditText;", 0, n0Var), C0.k(a.class, "pinCode", "getPinCode()Lru/cyberity/cbr/core/widget/pincode/CBRPinView;", 0, n0Var), C0.k(a.class, "tvResendCode", "getTvResendCode()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "ivIcon", "getIvIcon()Landroid/widget/ImageView;", 0, n0Var), C0.k(a.class, "tvStatus", "getTvStatus()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "btnPrimary", "getBtnPrimary()Landroid/widget/Button;", 0, n0Var), C0.k(a.class, "otpErrorText", "getOtpErrorText()Landroid/widget/TextView;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(a aVar, View view) {
        Button buttonF = aVar.f();
        if (buttonF != null) {
            buttonF.setEnabled(false);
        }
        CBRVerificationStepViewModel viewModel = aVar.getViewModel();
        CBRTextInputEditText cBRTextInputEditTextH = aVar.h();
        viewModel.a(String.valueOf(cBRTextInputEditTextH != null ? cBRTextInputEditTextH.getRawText() : null));
        CBRTextInputEditText cBRTextInputEditTextH2 = aVar.h();
        if (cBRTextInputEditTextH2 != null) {
            s.b(cBRTextInputEditTextH2);
        }
        aVar.e();
    }

    private final void d() {
        BaseFragment.setResult$default(this, 3, null, 2, null);
    }

    private final void e() {
        BaseFragment.setResult$default(this, 2, null, 2, null);
    }

    private final CBRTextInputEditText h() {
        return (CBRTextInputEditText) this.etPhone.a(this, f434172q[5]);
    }

    private final ImageView i() {
        return (ImageView) this.ivIcon.a(this, f434172q[8]);
    }

    private final TextView j() {
        return (TextView) this.otpErrorText.a(this, f434172q[11]);
    }

    private final TextView n() {
        return (TextView) this.tvResendCode.a(this, f434172q[7]);
    }

    private final TextView o() {
        return (TextView) this.tvStatus.a(this, f434172q[9]);
    }

    private final TextView p() {
        return (TextView) this.tvSubtitle.a(this, f434172q[1]);
    }

    private final TextView q() {
        return (TextView) this.tvTitle.a(this, f434172q[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ValidationIdentifierType r() {
        Bundle arguments = getArguments();
        Object obj = arguments != null ? arguments.get("ValidationIdentifier") : null;
        ValidationIdentifierType validationIdentifierType = obj instanceof ValidationIdentifierType ? (ValidationIdentifierType) obj : null;
        return validationIdentifierType == null ? ValidationIdentifierType.UNKNOWN : validationIdentifierType;
    }

    @l
    public final Button f() {
        return (Button) this.btnPrimary.a(this, f434172q[10]);
    }

    @l
    public final TextInputEditText g() {
        return (TextInputEditText) this.etEmailId.a(this, f434172q[3]);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getIdDocSetType() {
        int i12 = b.f434188a[r().ordinal()];
        if (i12 == 1) {
            return "EMAIL_VERIFICATION";
        }
        if (i12 == 2) {
            return "PHONE_VERIFICATION";
        }
        if (i12 == 3) {
            return "TYPE_UNKNOWN";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_fragment_verification_step;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Screen getScreen() {
        return Screen.ConfirmationContactScreen;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        if (!(event instanceof CBRVerificationStepViewModel.d.b)) {
            if (event instanceof CBRVerificationStepViewModel.d.a) {
                b();
                return;
            } else {
                super.handleEvent(event);
                return;
            }
        }
        CBRPinView cBRPinViewK = k();
        if (cBRPinViewK != null) {
            cBRPinViewK.setText((CharSequence) null);
        }
        CBRPinView cBRPinViewK2 = k();
        if (cBRPinViewK2 != null) {
            s.c(cBRPinViewK2);
        }
        CBRPinView cBRPinViewK3 = k();
        if (cBRPinViewK3 != null) {
            cBRPinViewK3.addTextChangedListener(new c(cBRPinViewK3, this));
        }
    }

    @l
    public final CBRPinView k() {
        return (CBRPinView) this.pinCode.a(this, f434172q[6]);
    }

    @l
    public final TextInputLayout l() {
        return (TextInputLayout) this.tlEmail.a(this, f434172q[2]);
    }

    @l
    public final CBRFlaggedInputLayout m() {
        return (CBRFlaggedInputLayout) this.tlPhone.a(this, f434172q[4]);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        PhoneKit phoneKit = this.phoneNumberKit;
        if (phoneKit != null) {
            phoneKit.detach(getContext());
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public boolean onFinishCalled(@k a0 finishReason) {
        if (finishReason.equals(a0.c.f432638a)) {
            CBRPinView cBRPinViewK = k();
            if (cBRPinViewK != null && cBRPinViewK.getVisibility() == 0) {
                getViewModel().h();
                return false;
            }
            a();
        }
        return super.onFinishCalled(finishReason);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@k Bundle outState) {
        super.onSaveInstanceState(outState);
        PhoneKit phoneKit = this.phoneNumberKit;
        if (phoneKit != null) {
            phoneKit.saveInstanceState(outState);
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public CBRVerificationStepViewModel getViewModel() {
        return (CBRVerificationStepViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a aVar, View view) {
        Button buttonF = aVar.f();
        if (buttonF != null) {
            buttonF.setEnabled(false);
        }
        CBRVerificationStepViewModel viewModel = aVar.getViewModel();
        TextInputEditText textInputEditTextG = aVar.g();
        viewModel.a(String.valueOf(textInputEditTextG != null ? textInputEditTextG.getText() : null));
        TextInputEditText textInputEditTextG2 = aVar.g();
        if (textInputEditTextG2 != null) {
            s.b(textInputEditTextG2);
        }
        aVar.e();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(@k CBRVerificationStepViewModel.e state, @l Bundle savedInstanceState) {
        if (state instanceof CBRVerificationStepViewModel.e.d) {
            a((CBRVerificationStepViewModel.e.d) state);
            return;
        }
        if (state instanceof CBRVerificationStepViewModel.e.C12488e) {
            b((CBRVerificationStepViewModel.e.C12488e) state, savedInstanceState);
        } else if (state instanceof CBRVerificationStepViewModel.e.c) {
            a((CBRVerificationStepViewModel.e.c) state);
        } else if (state instanceof CBRVerificationStepViewModel.e.b) {
            a((CBRVerificationStepViewModel.e.b) state);
        }
    }

    private final void c() {
        BaseFragment.setResult$default(this, 4, null, 2, null);
    }

    private final void b(CBRVerificationStepViewModel.e.C12488e state, Bundle savedInstanceState) {
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "showValidatePhoneForm " + state, null, 4, null);
        int i12 = 0;
        int i13 = 1;
        s.c(q(), p(), m(), h(), f());
        s.a(l(), g(), k(), j(), n(), i(), o());
        TextView textViewQ = q();
        if (textViewQ != null) {
            CharSequence charSequenceC = state.getTitle();
            textViewQ.setText(charSequenceC != null ? s.a(charSequenceC, requireContext()) : null);
        }
        TextView textViewP = p();
        if (textViewP != null) {
            CharSequence charSequenceB = state.getSubtitle();
            textViewP.setText(charSequenceB != null ? s.a(charSequenceB, requireContext()) : null);
        }
        TextInputLayout textInputLayoutL = l();
        if (textInputLayoutL != null) {
            textInputLayoutL.setVisibility(8);
        }
        CBRFlaggedInputLayout cBRFlaggedInputLayoutM = m();
        if (cBRFlaggedInputLayoutM != null) {
            cBRFlaggedInputLayoutM.setError(state.getError());
        }
        CBRTextInputEditText cBRTextInputEditTextH = h();
        if (cBRTextInputEditTextH != null) {
            cBRTextInputEditTextH.setOnEditorActionListener(new ru.cyberity.cbr.core.presentation.screen.verification.d(this, i12));
        }
        Button buttonF = f();
        if (buttonF != null) {
            buttonF.setText(state.getPrimaryButton());
        }
        Button buttonF2 = f();
        if (buttonF2 != null) {
            buttonF2.setEnabled(true);
        }
        Button buttonF3 = f();
        if (buttonF3 != null) {
            buttonF3.setOnClickListener(new ru.cyberity.cbr.core.presentation.screen.verification.c(this, i13));
        }
        CBRTextInputEditText cBRTextInputEditTextH2 = h();
        if (cBRTextInputEditTextH2 != null) {
            s.c(cBRTextInputEditTextH2);
        }
        a(state, savedInstanceState);
    }

    private final void a(CBRVerificationStepViewModel.e.d state) {
        e eVar;
        TextInputEditText textInputEditTextG;
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "showValidateEmailForm " + state, null, 4, null);
        int i12 = 1;
        int i13 = 2;
        s.c(q(), p(), l(), g(), f());
        s.a(m(), h(), k(), j(), n(), i(), o());
        TextView textViewQ = q();
        if (textViewQ != null) {
            CharSequence charSequenceC = state.getTitle();
            textViewQ.setText(charSequenceC != null ? s.a(charSequenceC, requireContext()) : null);
        }
        TextView textViewP = p();
        if (textViewP != null) {
            CharSequence charSequenceB = state.getSubtitle();
            textViewP.setText(charSequenceB != null ? s.a(charSequenceB, requireContext()) : null);
        }
        TextInputLayout textInputLayoutL = l();
        if (textInputLayoutL != null) {
            textInputLayoutL.setError(state.getError());
        }
        if (state.getInitialValue() != null && (!C43066x.K(r2))) {
            TextInputEditText textInputEditTextG2 = g();
            if (textInputEditTextG2 != null) {
                textInputEditTextG2.setText(state.getInitialValue());
            }
            TextInputEditText textInputEditTextG3 = g();
            if (textInputEditTextG3 != null) {
                textInputEditTextG3.setSelection(state.getInitialValue().length());
            }
        }
        TextInputEditText textInputEditTextG4 = g();
        if (textInputEditTextG4 != null) {
            textInputEditTextG4.setHint(state.getHint());
        }
        TextInputEditText textInputEditTextG5 = g();
        if (textInputEditTextG5 != null) {
            textInputEditTextG5.setOnEditorActionListener(new ru.cyberity.cbr.core.presentation.screen.verification.d(this, i12));
        }
        TextWatcher textWatcher = this.emailTextWatcher;
        if (textWatcher != null && (textInputEditTextG = g()) != null) {
            textInputEditTextG.removeTextChangedListener(textWatcher);
        }
        TextInputEditText textInputEditTextG6 = g();
        if (textInputEditTextG6 != null) {
            eVar = new e();
            textInputEditTextG6.addTextChangedListener(eVar);
        } else {
            eVar = null;
        }
        this.emailTextWatcher = eVar;
        TextInputEditText textInputEditTextG7 = g();
        if (textInputEditTextG7 != null) {
            s.c(textInputEditTextG7);
        }
        Button buttonF = f();
        if (buttonF != null) {
            buttonF.setText(state.getPrimaryButton());
        }
        Button buttonF2 = f();
        if (buttonF2 != null) {
            TextInputEditText textInputEditTextG8 = g();
            Editable text = textInputEditTextG8 != null ? textInputEditTextG8.getText() : null;
            buttonF2.setEnabled(true ^ (text == null || C43066x.K(text)));
        }
        Button buttonF3 = f();
        if (buttonF3 != null) {
            buttonF3.setOnClickListener(new ru.cyberity.cbr.core.presentation.screen.verification.c(this, i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(a aVar, TextView textView, int i12, KeyEvent keyEvent) {
        if (i12 != 6) {
            return false;
        }
        PhoneKit phoneKit = aVar.phoneNumberKit;
        if (phoneKit != null && phoneKit.isValid()) {
            Button buttonF = aVar.f();
            if (buttonF != null) {
                buttonF.setEnabled(false);
            }
            CBRVerificationStepViewModel viewModel = aVar.getViewModel();
            CBRTextInputEditText cBRTextInputEditTextH = aVar.h();
            viewModel.a(String.valueOf(cBRTextInputEditTextH != null ? cBRTextInputEditTextH.getRawText() : null));
            aVar.e();
        }
        s.b(textView);
        return true;
    }

    private final void b() {
        int i12 = 1;
        C42822w c42822w = null;
        if (isForResult()) {
            BaseFragment.setResult$default(this, 1, null, 2, null);
        } else {
            BaseFragment.finish$default(this, new a0.b(false, i12, c42822w), null, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(a aVar, TextView textView, int i12, KeyEvent keyEvent) {
        if (i12 != 6) {
            return false;
        }
        Button buttonF = aVar.f();
        if (buttonF != null) {
            buttonF.setEnabled(false);
        }
        CBRVerificationStepViewModel viewModel = aVar.getViewModel();
        TextInputEditText textInputEditTextG = aVar.g();
        viewModel.a(String.valueOf(textInputEditTextG != null ? textInputEditTextG.getText() : null));
        s.b(textView);
        aVar.e();
        return true;
    }

    private final void a(CBRVerificationStepViewModel.e.c state) {
        CBRPinView cBRPinViewK;
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "showVerifyCode " + state, null, 4, null);
        CBRPinView cBRPinViewK2 = k();
        if ((cBRPinViewK2 == null || cBRPinViewK2.getVisibility() != 0) && (cBRPinViewK = k()) != null) {
            s.c(cBRPinViewK);
        }
        s.c(q(), p(), k(), j(), n());
        s.a(l(), g(), m(), h(), i(), o(), f());
        TextView textViewQ = q();
        if (textViewQ != null) {
            CharSequence charSequenceC = state.getTitle();
            textViewQ.setText(charSequenceC != null ? s.a(charSequenceC, requireContext()) : null);
        }
        TextView textViewP = p();
        if (textViewP != null) {
            CharSequence charSequenceB = state.getSubtitle();
            textViewP.setText(charSequenceB != null ? s.a(charSequenceB, requireContext()) : null);
        }
        CBRPinView cBRPinViewK3 = k();
        if (cBRPinViewK3 != null) {
            Integer numQ = state.getVerificationCodeLength();
            cBRPinViewK3.setItemCount(numQ != null ? numQ.intValue() : 6);
        }
        CBRPinView cBRPinViewK4 = k();
        if (cBRPinViewK4 != null) {
            cBRPinViewK4.setOnTextCompleteListener(new f(state));
        }
        TextView textViewJ = j();
        if (textViewJ != null) {
            textViewJ.setText(state.getError());
        }
        CBRPinView cBRPinViewK5 = k();
        if (cBRPinViewK5 != null) {
            cBRPinViewK5.setError(state.getError() != null);
        }
        if (state.getError() != null) {
            c();
        }
        if (state.getTimer() != null) {
            TextView textViewN = n();
            if (textViewN != null) {
                textViewN.setEnabled(false);
            }
            TextView textViewN2 = n();
            if (textViewN2 != null) {
                textViewN2.setText(state.getTimer());
            }
            TextView textViewN3 = n();
            if (textViewN3 != null) {
                textViewN3.setOnClickListener(null);
            }
        } else if (state.getResendButton() != null) {
            TextView textViewN4 = n();
            if (textViewN4 != null) {
                textViewN4.setEnabled(true);
            }
            TextView textViewN5 = n();
            if (textViewN5 != null) {
                textViewN5.setText(state.getResendButton());
            }
            TextView textViewN6 = n();
            if (textViewN6 != null) {
                textViewN6.setOnClickListener(new o(27, this, state));
            }
        }
        CBRPinView cBRPinViewK6 = k();
        if (cBRPinViewK6 != null) {
            cBRPinViewK6.requestFocus();
        }
    }

    /* compiled from: Extensions.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011¸\u0006\u0000"}, d2 = {"ru/cyberity/cbr/core/common/ExtensionsKt$doOnceOnTextChanged$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lkotlin/G0;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f434189a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f434190b;

        public c(TextView textView, a aVar) {
            this.f434189a = textView;
            this.f434190b = aVar;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@l CharSequence text, int start, int before, int count) {
            this.f434190b.getViewModel().a();
            this.f434189a.removeTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@l Editable s5) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@l CharSequence text, int start, int count, int after) {
        }
    }

    /* compiled from: TextView.kt */
    @s0
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0012¸\u0006\u0011"}, d2 = {"androidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "Lkotlin/G0;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "text", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "androidx/core/widget/u", "core-ktx_release"}, k = 1, mv = {1, 7, 1})
    public static final class e implements TextWatcher {
        public e() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(@l CharSequence text, int start, int before, int count) {
            if (text != null && (!C43066x.K(text))) {
                a.this.getViewModel().a();
            }
            Button buttonF = a.this.f();
            if (buttonF == null) {
                return;
            }
            TextInputEditText textInputEditTextG = a.this.g();
            Editable text2 = textInputEditTextG != null ? textInputEditTextG.getText() : null;
            buttonF.setEnabled(true ^ (text2 == null || C43066x.K(text2)));
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@l Editable s5) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(@l CharSequence text, int start, int count, int after) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, CBRVerificationStepViewModel.e.c cVar, View view) {
        ru.cyberity.cbr.core.analytics.c.b(aVar.getAnalyticsDelegate(), Screen.ConfirmationCodeScreen, aVar.getIdDocSetType(), Control.RetryButton, null, 8, null);
        aVar.getViewModel().a(cVar.getIdentifier());
        aVar.d();
    }

    private final void a(CBRVerificationStepViewModel.e.b state) {
        Logger.v$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(this), "showStatus " + state, null, 4, null);
        int i12 = 0;
        s.c(i(), o());
        s.a(q(), p(), l(), g(), m(), h(), k(), j(), n(), f());
        if (state.getIsFailure()) {
            c();
        }
        ImageView imageViewI = i();
        if (imageViewI != null) {
            CBRStepStateKt.setStepState(imageViewI, state.getIsFailure() ? CBRStepState.REJECTED : CBRStepState.APPROVED);
        }
        ImageView imageViewI2 = i();
        if (imageViewI2 != null) {
            imageViewI2.setImageDrawable(ru.cyberity.cbr.core.common.n0.f432787a.getIconHandler().onResolveIcon(requireContext(), state.getIcon()));
        }
        TextView textViewO = o();
        if (textViewO != null) {
            textViewO.setText(state.getTitle());
        }
        if (state.getPrimaryButton() != null) {
            Button buttonF = f();
            if (buttonF != null) {
                buttonF.setVisibility(0);
            }
            Button buttonF2 = f();
            if (buttonF2 != null) {
                buttonF2.setText(state.getPrimaryButton());
            }
            Button buttonF3 = f();
            if (buttonF3 != null) {
                buttonF3.setVisibility(0);
            }
            Button buttonF4 = f();
            if (buttonF4 != null) {
                buttonF4.setEnabled(true);
            }
            Button buttonF5 = f();
            if (buttonF5 != null) {
                buttonF5.setOnClickListener(new ru.cyberity.cbr.core.presentation.screen.verification.c(this, i12));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, View view) {
        aVar.getViewModel().h();
    }

    private final void a() {
        BaseFragment.setResult$default(this, 5, null, 2, null);
    }

    private final void a(CBRVerificationStepViewModel.e.C12488e state, Bundle savedInstanceState) {
        Object next;
        if (this.phoneNumberKit != null) {
            return;
        }
        this.phoneNumberKit = PhoneKitProviderKt.getPhoneKit(m(), state.getCountryResultData().g(), state.getCountryResultData().k(), new d(), state.getInitialValue());
        CBRFlaggedInputLayout cBRFlaggedInputLayoutM = m();
        if (cBRFlaggedInputLayoutM != null) {
            CBRCountryPicker.CountryItem.Companion companion = CBRCountryPicker.CountryItem.INSTANCE;
            Map<String, String> mapH = state.getCountryResultData().h();
            if (mapH == null) {
                mapH = kotlin.collections.P0.c();
            }
            List<CBRCountryPicker.CountryItem> listFromMap = companion.fromMap(mapH);
            Iterator<T> it = listFromMap.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (L.f(((CBRCountryPicker.CountryItem) next).getCode(), state.getCountryResultData().getCurrentCountryKey())) {
                        break;
                    }
                }
            }
            CBRCountryPicker.CountryItem countryItem = (CBRCountryPicker.CountryItem) next;
            PhoneKit phoneKit = this.phoneNumberKit;
            if (phoneKit != null) {
                phoneKit.attachToInput(cBRFlaggedInputLayoutM, listFromMap, countryItem, savedInstanceState);
            }
        }
    }
}
