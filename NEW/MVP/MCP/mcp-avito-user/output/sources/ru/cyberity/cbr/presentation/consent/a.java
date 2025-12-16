package ru.cyberity.cbr.presentation.consent;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;
import ru.cyberity.cbr.core.common.ExtensionsKt;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.common.v;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.data.listener.CBRDefaultCountryPickerKt;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.widget.CBRCardRadioButton;
import ru.cyberity.cbr.presentation.consent.b;
import ru.cyberity.internal.R;

/* compiled from: CBRAgreementSelectorFragment.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 @2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001c\u0010\u0005R\u001b\u0010 \u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010&\u001a\u00020!8\u0014X\u0094D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010+\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001a\u0010*R\u001d\u00100\u001a\u0004\u0018\u00010,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010/R\u001d\u00102\u001a\u0004\u0018\u00010,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b1\u0010/R\u001d\u00103\u001a\u0004\u0018\u00010,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b\"\u0010/R\u001d\u00106\u001a\u0004\u0018\u0001048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b-\u00105R\u001d\u0010:\u001a\u0004\u0018\u0001078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010)\u001a\u0004\b(\u00109R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lru/cyberity/cbr/presentation/consent/a;", "Lru/cyberity/cbr/core/presentation/BaseFragment;", "Lru/cyberity/cbr/presentation/consent/b$d;", "Lru/cyberity/cbr/presentation/consent/b;", "<init>", "()V", "", "getLayoutId", "()I", "Lru/cyberity/cbr/core/common/a0;", "finishReason", "", "onFinishCalled", "(Lru/cyberity/cbr/core/common/a0;)Z", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "Lkotlin/G0;", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", VoiceInfo.STATE, "a", "(Lru/cyberity/cbr/presentation/consent/b$d;Landroid/os/Bundle;)V", "onDestroyView", "Lkotlin/C;", "g", "()Lru/cyberity/cbr/presentation/consent/b;", "viewModel", "", "b", "Ljava/lang/String;", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Landroid/widget/Button;", "c", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "()Landroid/widget/Button;", "button", "Landroid/widget/TextView;", "d", "f", "()Landroid/widget/TextView;", "title", "e", "subtitle", "footer", "Landroid/widget/RadioGroup;", "()Landroid/widget/RadioGroup;", "radioGroup", "Landroid/widget/ImageView;", "h", "()Landroid/widget/ImageView;", "image", "", "Lru/cyberity/cbr/presentation/consent/b$b;", "i", "Ljava/util/List;", "countries", "j", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends BaseFragment<b.d, ru.cyberity.cbr.presentation.consent.b> {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f434612k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(ru.cyberity.cbr.presentation.consent.b.class), new e(new d(this)), new f());

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final String idDocSetType = "TYPE_UNKNOWN";

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView button = i0.a(this, R.id.cbr_primary_button);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView title = i0.a(this, R.id.cbr_title);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView subtitle = i0.a(this, R.id.cbr_subtitle);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView footer = i0.a(this, R.id.cbr_footer);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView radioGroup = i0.a(this, R.id.cbr_radiogroup);

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView image = i0.a(this, R.id.cbr_icon);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @l
    private List<b.C12502b> countries;

    /* compiled from: CBRAgreementSelectorFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lru/cyberity/cbr/presentation/consent/a$a;", "", "Lru/cyberity/cbr/presentation/consent/a;", "a", "", "REQUEST_KEY_CONSENT", "Ljava/lang/String;", "TAG", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.consent.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final a a() {
            return new a();
        }

        private Companion() {
        }
    }

    /* compiled from: CBRAgreementSelectorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements Y41.l<String, G0> {
        public b() {
            super(1);
        }

        public final void a(@k String str) {
            a.this.getViewModel().a(str);
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(String str) {
            a(str);
            return G0.f406611a;
        }
    }

    /* compiled from: CBRAgreementSelectorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "a", "()V"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r8 = this;
                ru.cyberity.cbr.presentation.consent.a r0 = ru.cyberity.cbr.presentation.consent.a.this
                ru.cyberity.cbr.presentation.consent.b r0 = r0.getViewModel()
                ru.cyberity.cbr.presentation.consent.b$b r0 = r0.a()
                if (r0 == 0) goto L22
                ru.cyberity.cbr.core.data.listener.CBRCountryPicker$CountryItem r0 = r0.getCountry()
                if (r0 == 0) goto L22
                java.lang.String r0 = r0.getCode()
                if (r0 == 0) goto L22
                int r1 = r0.length()
                if (r1 <= 0) goto L1f
                goto L20
            L1f:
                r0 = 0
            L20:
                if (r0 != 0) goto L24
            L22:
                java.lang.String r0 = "Other"
            L24:
                ru.cyberity.cbr.presentation.consent.a r1 = ru.cyberity.cbr.presentation.consent.a.this
                ru.cyberity.cbr.presentation.consent.b r1 = r1.getViewModel()
                ru.cyberity.cbr.core.data.model.b r1 = r1.b()
                if (r1 == 0) goto L36
                java.lang.String r1 = r1.getTitleKey()
                if (r1 != 0) goto L38
            L36:
                java.lang.String r1 = ""
            L38:
                ru.cyberity.cbr.presentation.consent.a r2 = ru.cyberity.cbr.presentation.consent.a.this
                ru.cyberity.cbr.core.analytics.c r2 = r2.getAnalyticsDelegate()
                ru.cyberity.cbr.presentation.consent.a r3 = ru.cyberity.cbr.presentation.consent.a.this
                ru.cyberity.cbr.core.analytics.Screen r3 = r3.getScreen()
                ru.cyberity.cbr.presentation.consent.a r4 = ru.cyberity.cbr.presentation.consent.a.this
                java.lang.String r4 = r4.getIdDocSetType()
                ru.cyberity.cbr.core.analytics.Control r5 = ru.cyberity.cbr.core.analytics.Control.AcceptButton
                kotlin.Q r6 = new kotlin.Q
                java.lang.String r7 = "agreementCountry"
                r6.<init>(r7, r0)
                kotlin.Q r0 = new kotlin.Q
                java.lang.String r7 = "agreementTitleKey"
                r0.<init>(r7, r1)
                kotlin.Q[] r0 = new kotlin.Q[]{r6, r0}
                java.util.Map r0 = kotlin.collections.P0.g(r0)
                r2.b(r3, r4, r5, r0)
                ru.cyberity.cbr.presentation.consent.a r0 = ru.cyberity.cbr.presentation.consent.a.this
                ru.cyberity.cbr.presentation.consent.b r0 = r0.getViewModel()
                r0.e()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.presentation.consent.a.c.a():void");
        }

        @Override // Y41.a
        public /* bridge */ /* synthetic */ G0 invoke() {
            a();
            return G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/a0"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f434624a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f434624a = fragment;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f434624a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "a", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class e extends N implements Y41.a<S0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a f434625a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f434625a = aVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.f434625a.invoke()).getF42820b();
        }
    }

    /* compiled from: CBRAgreementSelectorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "a", "()Landroidx/lifecycle/P0$c;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends N implements Y41.a<P0.c> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0.c invoke() {
            a aVar = a.this;
            return new ru.cyberity.cbr.presentation.consent.c(aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        h0 h0Var = new h0(a.class, "button", "getButton()Landroid/widget/Button;", 0);
        n0 n0Var = m0.f406844a;
        f434612k = new n[]{n0Var.i(h0Var), C0.k(a.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "footer", "getFooter()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "radioGroup", "getRadioGroup()Landroid/widget/RadioGroup;", 0, n0Var), C0.k(a.class, "image", "getImage()Landroid/widget/ImageView;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    private final TextView b() {
        return (TextView) this.footer.a(this, f434612k[3]);
    }

    private final ImageView c() {
        return (ImageView) this.image.a(this, f434612k[5]);
    }

    private final RadioGroup d() {
        return (RadioGroup) this.radioGroup.a(this, f434612k[4]);
    }

    private final TextView e() {
        return (TextView) this.subtitle.a(this, f434612k[2]);
    }

    private final TextView f() {
        return (TextView) this.title.a(this, f434612k[1]);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.cbr.presentation.consent.b getViewModel() {
        return (ru.cyberity.cbr.presentation.consent.b) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getIdDocSetType() {
        return this.idDocSetType;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_fragment_agreement_selector;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        if (event instanceof b.c) {
            BaseFragment.navigateTo$default(this, ru.cyberity.cbr.presentation.dialogs.bottomsheet.a.INSTANCE.a(((b.c) event).getText()).forResult("REQUEST_KEY_CONSENT"), null, 2, null);
        } else {
            super.handleEvent(event);
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.countries = null;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public boolean onFinishCalled(@k a0 finishReason) {
        if (!(finishReason instanceof a0.c)) {
            return super.onFinishCalled(finishReason);
        }
        BaseFragment.finish$default(this, new a0.d(null, 1, null), null, null, 6, null);
        return false;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button buttonA = a();
        if (buttonA != null) {
            v.a(buttonA, new c());
        }
        ImageView imageViewC = c();
        if (imageViewC != null) {
            imageViewC.setImageDrawable(ru.cyberity.cbr.core.common.n0.f432787a.getIconHandler().onResolveIcon(requireContext(), CBRIconHandler.CBRCommonIcons.PICTURE_AGREEMENT.getImageName()));
        }
    }

    private final Button a() {
        return (Button) this.button.a(this, f434612k[0]);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(@k b.d state, @l Bundle savedInstanceState) {
        Drawable flagDrawable;
        Button buttonA = a();
        if (buttonA != null) {
            buttonA.setText(state.getAcceptText());
        }
        TextView textViewB = b();
        if (textViewB != null) {
            textViewB.setText(state.getFooterText());
        }
        TextView textViewF = f();
        if (textViewF != null) {
            textViewF.setText(state.getTitleText());
        }
        TextView textViewE = e();
        if (textViewE != null) {
            s.a(textViewE, state.getSubtitleText());
        }
        TextView textViewB2 = b();
        if (textViewB2 != null) {
            ExtensionsKt.handleUrlClicks(textViewB2, new b());
        }
        Button buttonA2 = a();
        if (buttonA2 != null) {
            buttonA2.setEnabled(state.getSelectedAgreementId() != null);
        }
        TextView textViewB3 = b();
        if (textViewB3 != null) {
            textViewB3.setVisibility(state.getSelectedAgreementId() == null ? 4 : 0);
        }
        if (L.f(this.countries, state.h())) {
            return;
        }
        if (state.h().size() > 1) {
            RadioGroup radioGroupD = d();
            if (radioGroupD != null) {
                radioGroupD.removeAllViews();
            }
            int i12 = 0;
            for (Object obj : state.h()) {
                int i13 = i12 + 1;
                if (i12 >= 0) {
                    b.C12502b c12502b = (b.C12502b) obj;
                    CBRCountryPicker.CountryItem countryItemC = c12502b.getCountry();
                    CBRCardRadioButton cBRCardRadioButton = new CBRCardRadioButton(requireContext(), null, 0, 0, 14, null);
                    cBRCardRadioButton.setText(countryItemC.getName());
                    cBRCardRadioButton.setTag(Integer.valueOf(c12502b.getId()));
                    if (countryItemC.getCode().length() == 0) {
                        flagDrawable = ru.cyberity.cbr.core.common.n0.f432787a.getIconHandler().onResolveIcon(requireContext(), CBRIconHandler.CBRCommonIcons.COUNTRY_OTHER.getImageName());
                    } else {
                        flagDrawable = CBRDefaultCountryPickerKt.getFlagDrawable(countryItemC, requireContext());
                    }
                    cBRCardRadioButton.setStartDrawable(flagDrawable);
                    cBRCardRadioButton.setOnCheckedChangeListener(new com.avito.android.lib.deprecated_design.radio_button.c(9, this, c12502b));
                    RadioGroup radioGroupD2 = d();
                    if (radioGroupD2 != null) {
                        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
                        layoutParams.setMargins(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.cbr_margin_small_tiny));
                        G0 g02 = G0.f406611a;
                        radioGroupD2.addView(cBRCardRadioButton, layoutParams);
                    }
                    i12 = i13;
                } else {
                    C42745f0.H0();
                    throw null;
                }
            }
            RadioGroup radioGroupD3 = d();
            if (radioGroupD3 != null) {
                int childCount = radioGroupD3.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = radioGroupD3.getChildAt(i14);
                    CBRCardRadioButton cBRCardRadioButton2 = childAt instanceof CBRCardRadioButton ? (CBRCardRadioButton) childAt : null;
                    if (cBRCardRadioButton2 != null) {
                        cBRCardRadioButton2.setChecked(L.f(cBRCardRadioButton2.getTag(), state.getSelectedAgreementId()));
                    }
                }
            }
            RadioGroup radioGroupD4 = d();
            if (radioGroupD4 != null) {
                radioGroupD4.setVisibility(0);
            }
        } else {
            RadioGroup radioGroupD5 = d();
            if (radioGroupD5 != null) {
                radioGroupD5.setVisibility(8);
            }
        }
        this.countries = state.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, b.C12502b c12502b, CompoundButton compoundButton, boolean z12) {
        if (z12) {
            aVar.getViewModel().a(c12502b.getId());
        }
    }
}
