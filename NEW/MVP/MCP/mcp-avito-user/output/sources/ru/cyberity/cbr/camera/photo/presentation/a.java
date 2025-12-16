package ru.cyberity.cbr.camera.photo.presentation;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import androidx.transition.Q;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.verification.verification_input_inn.o;
import e11.ViewOnClickListenerC39879j1;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;
import ru.cyberity.cbr.camera.photo.presentation.b;
import ru.cyberity.cbr.core.common.ExtensionsKt;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.listener.CBRCountryPicker;
import ru.cyberity.cbr.core.data.listener.CBRDefaultCountryPickerKt;
import ru.cyberity.cbr.core.data.listener.CBRIconHandler;
import ru.cyberity.cbr.core.data.model.r;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRMetricElement;
import ru.cyberity.cbr.core.widget.CBRCountrySelectorView;
import ru.cyberity.cbr.core.widget.CBRSelectorItemView;
import ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.CBRPickerDialog;
import ru.cyberity.internal.R;

/* compiled from: CBRDocumentSelectorFragment.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 E2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ'\u0010\b\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\b\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\b\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u0005R\u001d\u0010(\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010+\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b\b\u0010*R\u001d\u0010-\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b,\u0010'R\u001d\u0010/\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010%\u001a\u0004\b.\u0010'R\u001d\u00103\u001a\u0004\u0018\u0001008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b1\u00102R\u001d\u00105\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b4\u0010'R\u001b\u00109\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b\u000e\u00108R\u001b\u0010<\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u0002068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bC\u00108¨\u0006F"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/a;", "Lru/cyberity/cbr/core/presentation/BaseFragment;", "Lru/cyberity/cbr/camera/photo/presentation/b$e;", "Lru/cyberity/cbr/camera/photo/presentation/b;", "<init>", "()V", VoiceInfo.STATE, "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/camera/photo/presentation/b$e;)V", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "item", "(Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;)V", "country", "b", "Lru/cyberity/cbr/camera/photo/presentation/b$f;", "viewText", "", "Lru/cyberity/cbr/camera/photo/presentation/b$b;", "documents", "(Lru/cyberity/cbr/camera/photo/presentation/b$f;Ljava/util/List;)V", "", "getLayoutId", "()I", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "(Lru/cyberity/cbr/camera/photo/presentation/b$e;Landroid/os/Bundle;)V", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", "onDestroyView", "Landroid/widget/TextView;", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "c", "()Landroid/widget/TextView;", "tvCountryTitle", "Lru/cyberity/cbr/core/widget/CBRCountrySelectorView;", "()Lru/cyberity/cbr/core/widget/CBRCountrySelectorView;", "cbrCountrySelector", "e", "tvDocumentsTitle", "d", "tvDocumentsEmpty", "Landroid/view/ViewGroup;", "g", "()Landroid/view/ViewGroup;", "vgDocuments", "f", "tvFooter", "", "Lkotlin/C;", "()Ljava/lang/String;", "documentType", "h", "()Lru/cyberity/cbr/camera/photo/presentation/b;", "viewModel", "", "i", "Z", "isPickerShowing", "j", "Ljava/util/List;", "getIdDocSetType", "idDocSetType", "k", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends BaseFragment<b.e, ru.cyberity.cbr.camera.photo.presentation.b> {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f432074l;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvCountryTitle = i0.a(this, R.id.cbr_country_title);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView cbrCountrySelector = i0.a(this, R.id.cbr_country_selector);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvDocumentsTitle = i0.a(this, R.id.cbr_documents_title);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvDocumentsEmpty = i0.a(this, R.id.cbr_documents_empty);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView vgDocuments = i0.a(this, R.id.cbr_list);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvFooter = i0.a(this, R.id.cbr_footer);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C documentType = C42727D.c(new b());

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(ru.cyberity.cbr.camera.photo.presentation.b.class), new f(new e(this)), new g());

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isPickerShowing;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @l
    private List<b.C12420b> documents;

    /* compiled from: CBRDocumentSelectorFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007¨\u0006\u000e"}, d2 = {"Lru/cyberity/cbr/camera/photo/presentation/a$a;", "", "", "documentType", "Lru/cyberity/cbr/camera/photo/presentation/a;", "a", "COUNTRY_SELECTOR_REQUEST_KEY", "Ljava/lang/String;", "COUNTRY_SELECTOR_RESULT_KEY", "RESULT_SELECTED_COUNTRY", "RESULT_SELECTED_ID_DOC_TYPE", "TAG", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.camera.photo.presentation.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final a a(@k String documentType) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("extra_document_type", documentType);
            aVar.setArguments(bundle);
            return aVar;
        }

        private Companion() {
        }
    }

    /* compiled from: CBRDocumentSelectorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements Y41.a<String> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            String string;
            Bundle arguments = a.this.getArguments();
            return (arguments == null || (string = arguments.getString("extra_document_type")) == null) ? "" : string;
        }
    }

    /* compiled from: CBRDocumentSelectorFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"ru/cyberity/cbr/camera/photo/presentation/a$c", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CBRCountryPickerCallBack;", "Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;", "item", "Lkotlin/G0;", "onItemSelected", "(Lru/cyberity/cbr/core/data/listener/CBRCountryPicker$CountryItem;)V", "onDismiss", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements CBRCountryPicker.CBRCountryPickerCallBack {
        public c() {
        }

        @Override // ru.cyberity.cbr.core.data.listener.CBRCountryPicker.CBRCountryPickerCallBack
        public void onDismiss() {
            a.this.getViewModel().h();
        }

        @Override // ru.cyberity.cbr.core.data.listener.CBRCountryPicker.CBRCountryPickerCallBack
        public void onItemSelected(@k CBRCountryPicker.CountryItem item) {
            a.this.a(item);
        }
    }

    /* compiled from: CBRDocumentSelectorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.l<String, G0> {
        public d() {
            super(1);
        }

        public final void a(@k String str) {
            a.this.getViewModel().onLinkClicked(str);
        }

        @Override // Y41.l
        public /* bridge */ /* synthetic */ G0 invoke(String str) {
            a(str);
            return G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/a0"}, k = 3, mv = {1, 7, 1})
    public static final class e extends N implements Y41.a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f432088a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f432088a = fragment;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f432088a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "a", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a f432089a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f432089a = aVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.f432089a.invoke()).getF42820b();
        }
    }

    /* compiled from: CBRDocumentSelectorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "a", "()Landroidx/lifecycle/P0$c;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends N implements Y41.a<P0.c> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0.c invoke() {
            a aVar = a.this;
            return new ru.cyberity.cbr.camera.photo.presentation.c(aVar, aVar.b(), a.this.getServiceLocator(), a.this.getArguments());
        }
    }

    static {
        h0 h0Var = new h0(a.class, "tvCountryTitle", "getTvCountryTitle()Landroid/widget/TextView;", 0);
        n0 n0Var = m0.f406844a;
        f432074l = new n[]{n0Var.i(h0Var), C0.k(a.class, "cbrCountrySelector", "getCbrCountrySelector()Lru/cyberity/cbr/core/widget/CBRCountrySelectorView;", 0, n0Var), C0.k(a.class, "tvDocumentsTitle", "getTvDocumentsTitle()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "tvDocumentsEmpty", "getTvDocumentsEmpty()Landroid/widget/TextView;", 0, n0Var), C0.k(a.class, "vgDocuments", "getVgDocuments()Landroid/view/ViewGroup;", 0, n0Var), C0.k(a.class, "tvFooter", "getTvFooter()Landroid/widget/TextView;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    private final TextView c() {
        return (TextView) this.tvCountryTitle.a(this, f432074l[0]);
    }

    private final TextView d() {
        return (TextView) this.tvDocumentsEmpty.a(this, f432074l[3]);
    }

    private final TextView e() {
        return (TextView) this.tvDocumentsTitle.a(this, f432074l[2]);
    }

    private final TextView f() {
        return (TextView) this.tvFooter.a(this, f432074l[5]);
    }

    private final ViewGroup g() {
        return (ViewGroup) this.vgDocuments.a(this, f432074l[4]);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getIdDocSetType() {
        return b();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_fragment_document_selector;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.cbr.camera.photo.presentation.b getViewModel() {
        return (ru.cyberity.cbr.camera.photo.presentation.b) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        b.d dVar;
        r rVarD;
        super.handleEvent(event);
        if (!(event instanceof b.d) || (rVarD = (dVar = (b.d) event).getIdentityType()) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("result_selected_country", dVar.getCountryKey());
        bundle.putString("result_selected_id_doc_type", rVarD.getValue());
        G0 g02 = G0.f406611a;
        BaseFragment.finishWithResult$default(this, 0, bundle, 1, null);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.documents = null;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle savedInstanceState) {
        String metricStyle;
        super.onViewCreated(view, savedInstanceState);
        CBRCountrySelectorView cBRCountrySelectorViewA = a();
        if (cBRCountrySelectorViewA != null) {
            Context contextRequireContext = requireContext();
            ThemeHelper themeHelper = ThemeHelper.INSTANCE;
            Drawable drawableResolveIcon = themeHelper.resolveIcon(contextRequireContext, CBRIconHandler.CBRCommonIcons.MORE.getImageName());
            if (drawableResolveIcon == null) {
                drawableResolveIcon = themeHelper.resolveIcon(contextRequireContext, CBRIconHandler.CBRCommonIcons.DISCLOSURE.getImageName());
            }
            cBRCountrySelectorViewA.setIconEnd(drawableResolveIcon);
        }
        CBRCountrySelectorView cBRCountrySelectorViewA2 = a();
        if (cBRCountrySelectorViewA2 != null) {
            cBRCountrySelectorViewA2.setOnClickListener(new ViewOnClickListenerC39879j1(this, 19));
        }
        requireActivity().getSupportFragmentManager().p0("country_selector_request_key", this, new com.my.target.ads.a(this, 22));
        ThemeHelper themeHelper2 = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper2.getCustomTheme();
        if (customTheme == null || (metricStyle = themeHelper2.getMetricStyle(customTheme, CBRMetricElement.SECTION_HEADER_ALIGNMENT)) == null) {
            return;
        }
        TextView textViewC = c();
        if (textViewC != null) {
            themeHelper2.applyThemeGravity(textViewC, metricStyle);
        }
        TextView textViewE = e();
        if (textViewE != null) {
            themeHelper2.applyThemeGravity(textViewE, metricStyle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b() {
        return (String) this.documentType.getValue();
    }

    private final CBRCountrySelectorView a() {
        return (CBRCountrySelectorView) this.cbrCountrySelector.a(this, f432074l[1]);
    }

    private final void b(CBRCountryPicker.CountryItem country) {
        CBRCountrySelectorView cBRCountrySelectorViewA = a();
        if (cBRCountrySelectorViewA != null) {
            cBRCountrySelectorViewA.setIconStart(country != null ? CBRDefaultCountryPickerKt.getFlagDrawable(country, requireContext()) : null);
        }
        CBRCountrySelectorView cBRCountrySelectorViewA2 = a();
        if (cBRCountrySelectorViewA2 == null) {
            return;
        }
        cBRCountrySelectorViewA2.setTitle(country != null ? country.getName() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, View view) {
        aVar.getViewModel().i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, String str, Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("country_selector_result_key");
        CBRPickerDialog.Item item = parcelable instanceof CBRPickerDialog.Item ? (CBRPickerDialog.Item) parcelable : null;
        if (item != null) {
            aVar.a(new CBRCountryPicker.CountryItem(item.getId(), item.getTitle()));
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(@k b.e state, @l Bundle savedInstanceState) {
        b(state.getSelectedCountry());
        a(state.getViewText(), state.getDocuments().d());
        a(state);
        TextView textViewC = c();
        if (textViewC != null) {
            b.f fVarN = state.getViewText();
            textViewC.setText(fVarN != null ? fVarN.getCountryTitleText() : null);
        }
        CBRCountrySelectorView cBRCountrySelectorViewA = a();
        if (cBRCountrySelectorViewA != null) {
            b.f fVarN2 = state.getViewText();
            cBRCountrySelectorViewA.setPlaceholder(fVarN2 != null ? fVarN2.getCountryPlaceholder() : null);
        }
        TextView textViewF = f();
        if (textViewF != null) {
            b.f fVarN3 = state.getViewText();
            s.a(textViewF, fVarN3 != null ? fVarN3.getFooterText() : null);
        }
        TextView textViewF2 = f();
        if (textViewF2 != null) {
            ExtensionsKt.handleUrlClicks(textViewF2, new d());
            textViewF2.setMovementMethod(new LinkMovementMethod());
        }
    }

    private final void a(b.e state) {
        List<CBRCountryPicker.CountryItem> listJ = state.j();
        if (listJ == null) {
            return;
        }
        if (state.getDialogIsVisible() && !this.isPickerShowing) {
            this.isPickerShowing = true;
            ru.cyberity.cbr.core.common.n0.f432787a.getCountryPicker().pickCountry(requireContext(), listJ, new c(), "country_selector_request_key", "country_selector_result_key");
        } else {
            this.isPickerShowing = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(CBRCountryPicker.CountryItem item) {
        getViewModel().a(item);
        b(item);
    }

    private final void a(b.f viewText, List<b.C12420b> documents) {
        CharSequence title;
        TextView textViewD;
        if (L.f(this.documents, documents)) {
            return;
        }
        this.documents = documents;
        TextView textViewD2 = d();
        if (textViewD2 != null) {
            textViewD2.setVisibility(8);
        }
        if (!documents.isEmpty()) {
            TextView textViewE = e();
            if (textViewE != null) {
                s.a(textViewE, viewText != null ? viewText.getDocumentTitleText() : null);
            }
            ViewGroup viewGroupG = g();
            if (viewGroupG != null) {
                Q.a(viewGroupG, null);
            }
            ViewGroup viewGroupG2 = g();
            if (viewGroupG2 != null) {
                viewGroupG2.removeAllViews();
            }
            for (b.C12420b c12420b : documents) {
                CBRSelectorItemView cBRSelectorItemView = new CBRSelectorItemView(requireContext(), null, 0, 0, 14, null);
                cBRSelectorItemView.setTag(c12420b);
                cBRSelectorItemView.setTitle(c12420b.getTitle());
                cBRSelectorItemView.setIconStart(ru.cyberity.cbr.core.common.n0.f432787a.getIconHandler().onResolveIcon(requireContext(), "IdentityType/" + c12420b.getDocument().getIconValue()));
                Context contextRequireContext = requireContext();
                ThemeHelper themeHelper = ThemeHelper.INSTANCE;
                Drawable drawableResolveIcon = themeHelper.resolveIcon(contextRequireContext, CBRIconHandler.CBRCommonIcons.MORE.getImageName());
                if (drawableResolveIcon == null) {
                    drawableResolveIcon = themeHelper.resolveIcon(contextRequireContext, CBRIconHandler.CBRCommonIcons.DISCLOSURE.getImageName());
                }
                cBRSelectorItemView.setIconEnd(drawableResolveIcon);
                cBRSelectorItemView.setOnClickListener(new o(26, this, c12420b));
                ViewGroup viewGroupG3 = g();
                if (viewGroupG3 != null) {
                    viewGroupG3.addView(cBRSelectorItemView);
                }
            }
            ViewGroup viewGroupG4 = g();
            if (viewGroupG4 == null) {
                return;
            }
            viewGroupG4.setVisibility(0);
            return;
        }
        ViewGroup viewGroupG5 = g();
        if (viewGroupG5 != null) {
            viewGroupG5.removeAllViews();
        }
        s.a(e(), g());
        CBRCountrySelectorView cBRCountrySelectorViewA = a();
        if (cBRCountrySelectorViewA == null || (title = cBRCountrySelectorViewA.getTitle()) == null || title.length() <= 0 || (textViewD = d()) == null) {
            return;
        }
        s.a(textViewD, viewText != null ? viewText.getInfoText() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, b.C12420b c12420b, View view) {
        aVar.getViewModel().a(c12420b.getDocument());
    }
}
