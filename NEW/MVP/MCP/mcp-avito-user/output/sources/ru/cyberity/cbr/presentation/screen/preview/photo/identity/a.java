package ru.cyberity.cbr.presentation.screen.preview.photo.identity;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.g;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.presentation.screen.preview.photo.identity.b;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRPreviewIdentityDocumentFragment.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u00028TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/identity/a;", "Lru/cyberity/cbr/presentation/screen/preview/photo/a;", "Lru/cyberity/cbr/presentation/screen/preview/photo/identity/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/G0;", "onCreate", "(Landroid/os/Bundle;)V", "", "success", "Landroid/os/Parcelable;", "payload", "a", "(ZLandroid/os/Parcelable;)V", "Lru/cyberity/cbr/core/common/a0;", "finishReason", "onFinishCalled", "(Lru/cyberity/cbr/core/common/a0;)Z", "m", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", "", "t", "Ljava/lang/String;", "idDocType", "u", "Lkotlin/C;", "o", "()Lru/cyberity/cbr/presentation/screen/preview/photo/identity/b;", "viewModel", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "v", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a extends ru.cyberity.cbr.presentation.screen.preview.photo.a<ru.cyberity.cbr.presentation.screen.preview.photo.identity.b> {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @l
    private String idDocType;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(ru.cyberity.cbr.presentation.screen.preview.photo.identity.b.class), new c(new b(this)), new d());

    /* compiled from: CBRPreviewIdentityDocumentFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/photo/identity/a$a;", "", "Lru/cyberity/cbr/core/data/model/Document;", "document", "Landroidx/fragment/app/Fragment;", "a", "", "ARGS_DOCUMENT", "Ljava/lang/String;", "REQUEST_KEY_PICK_DOCUMENT", "TAG", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.preview.photo.identity.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final Fragment a(@k Document document) {
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARGS_DOCUMENT", document);
            aVar.setArguments(bundle);
            return aVar;
        }

        private Companion() {
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/a0"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements Y41.a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f435284a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f435284a = fragment;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f435284a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "a", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<S0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a f435285a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f435285a = aVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.f435285a.invoke()).getF42820b();
        }
    }

    /* compiled from: CBRPreviewIdentityDocumentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "a", "()Landroidx/lifecycle/P0$c;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<P0.c> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0.c invoke() {
            Bundle arguments = a.this.getArguments();
            Document document = arguments != null ? (Document) arguments.getParcelable("ARGS_DOCUMENT") : null;
            a aVar = a.this;
            return new ru.cyberity.cbr.presentation.screen.preview.photo.identity.c(document, aVar, aVar.getServiceLocator(), a.this.getArguments());
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getIdDocSetType() {
        DocumentType type;
        String strC;
        Bundle arguments = getArguments();
        Document document = arguments != null ? (Document) arguments.getParcelable("ARGS_DOCUMENT") : null;
        Document document2 = document != null ? document : null;
        return (document2 == null || (type = document2.getType()) == null || (strC = type.getValue()) == null) ? "TYPE_UNKNOWN" : strC;
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.photo.a, ru.cyberity.cbr.presentation.screen.preview.a, ru.cyberity.cbr.core.presentation.BaseFragment
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        if (!(event instanceof b.a)) {
            super.handleEvent(event);
            return;
        }
        g appListener = getAppListener();
        if (appListener != null) {
            appListener.a("pick_document", ((b.a) event).getDocumentType());
        }
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.photo.a
    public void m() {
        getViewModel().E();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.cbr.presentation.screen.preview.photo.identity.b getViewModel() {
        return (ru.cyberity.cbr.presentation.screen.preview.photo.identity.b) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(@l Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().getSupportFragmentManager().p0("pick_document", this, new com.my.target.ads.a(this, 26));
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.photo.a, ru.cyberity.cbr.core.presentation.BaseFragment
    public boolean onFinishCalled(@k a0 finishReason) {
        super.onFinishCalled(finishReason);
        if (!getViewModel().D()) {
            return true;
        }
        getViewModel().F();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, String str, Bundle bundle) {
        if (!BaseFragment.INSTANCE.isSuccessResult(bundle)) {
            BaseFragment.finish$default(aVar, null, null, null, 7, null);
            return;
        }
        String string = bundle.getString("result_selected_country");
        String string2 = bundle.getString("result_selected_id_doc_type");
        Logger.d$default(ru.cyberity.log.a.f436064a, ru.cyberity.log.c.a(aVar), "Document selected: " + string + ' ' + string2, null, 4, null);
        if (string == null || string2 == null) {
            BaseFragment.finish$default(aVar, null, null, null, 7, null);
        } else {
            aVar.idDocType = string2;
            aVar.getViewModel().a(string, string2);
        }
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.photo.a, ru.cyberity.cbr.presentation.screen.a
    public void a(boolean success, @l Parcelable payload) {
        if (!success && !getViewModel().D()) {
            ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
            Logger.v$default(aVar, ru.cyberity.log.c.a(this), "On instructions showed, is not success and viewModel.hasPhoto()==false", null, 4, null);
            if (!getViewModel().p() && !getViewModel().B()) {
                Logger.v$default(aVar, ru.cyberity.log.c.a(this), "On instructions showed, restart step", null, 4, null);
                getViewModel().G();
                return;
            } else {
                Logger.v$default(aVar, ru.cyberity.log.c.a(this), "On instructions showed, finish", null, 4, null);
                BaseFragment.finish$default(this, null, null, null, 7, null);
                return;
            }
        }
        super.a(success, payload);
    }
}
