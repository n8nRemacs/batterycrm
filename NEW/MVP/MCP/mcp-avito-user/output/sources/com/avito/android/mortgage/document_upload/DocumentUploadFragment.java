package com.avito.android.mortgage.document_upload;

import Cd.C13243a;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.content.FileProvider;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.MortgageDocumentUploadScreen;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.modal.a;
import com.avito.android.mortgage.document_upload.DocumentUploadFragment;
import com.avito.android.mortgage.document_upload.model.DocumentUploadArguments;
import com.avito.android.permissions.C33032b;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import f00.InterfaceC40194a;
import i.b;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: DocumentUploadFragment.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_upload/DocumentUploadFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Lf00/c;", VoiceInfo.STATE, "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DocumentUploadFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public static final a f199027B0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f199028A0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public h0 f199029n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f199030o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f199031p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f199032q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f199033r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f199034s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public C33032b f199035t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.permissions.G f199036u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f199037v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final d f199038w0;

    /* renamed from: x0, reason: collision with root package name */
    public Uri f199039x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Uri> f199040y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String[]> f199041z0;

    /* compiled from: DocumentUploadFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/document_upload/DocumentUploadFragment$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: DocumentUploadFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.document_upload.DocumentUploadFragment$a$a, reason: collision with other inner class name */
        public static final class C5871a extends kotlin.jvm.internal.N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ DocumentUploadArguments f199042l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5871a(DocumentUploadArguments documentUploadArguments) {
                super(1);
                this.f199042l = documentUploadArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("documents_upload_screen_args", this.f199042l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static DocumentUploadFragment a(@Y61.k DocumentUploadArguments documentUploadArguments) {
            DocumentUploadFragment documentUploadFragment = new DocumentUploadFragment();
            C35966w1.a(documentUploadFragment, -1, new C5871a(documentUploadArguments));
            return documentUploadFragment;
        }

        public a() {
        }
    }

    /* compiled from: DocumentUploadFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/mortgage/document_upload/model/DocumentUploadArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<DocumentUploadArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final DocumentUploadArguments invoke() {
            Bundle bundleRequireArguments = DocumentUploadFragment.this.requireArguments();
            return (DocumentUploadArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("documents_upload_screen_args", DocumentUploadArguments.class) : bundleRequireArguments.getParcelable("documents_upload_screen_args"));
        }
    }

    /* compiled from: DocumentUploadFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = DocumentUploadFragment.this.f199031p0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: DocumentUploadFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/document_upload/DocumentUploadFragment$d", "Landroidx/activity/x;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends androidx.view.x {
        public d() {
            super(true);
        }

        @Override // androidx.view.x
        public final void c() {
            a aVar = DocumentUploadFragment.f199027B0;
            DocumentUploadFragment documentUploadFragment = DocumentUploadFragment.this;
            documentUploadFragment.r5().accept(new InterfaceC40194a.d(documentUploadFragment.getParentFragmentManager().L() > 1));
        }
    }

    /* compiled from: DocumentUploadFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        public e() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                a aVar = DocumentUploadFragment.f199027B0;
                DocumentUploadFragment documentUploadFragment = DocumentUploadFragment.this;
                com.avito.android.analytics.screens.compose.q.b((com.avito.android.analytics.screens.compose.a) documentUploadFragment.f199032q0.getValue(), androidx.compose.runtime.internal.r.c(312037240, new C32628s(documentUploadFragment, C22126m3.b(documentUploadFragment.r5().getState(), a13)), a13), a13, 48);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f199047l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f199047l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f199047l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return DocumentUploadFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f199049l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f199049l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f199049l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f199050l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f199050l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f199050l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f199051l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f199051l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f199051l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: DocumentUploadFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mortgage/document_upload/g0;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/mortgage/document_upload/g0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<g0> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final g0 invoke() {
            h0 h0Var = DocumentUploadFragment.this.f199029n0;
            if (h0Var == null) {
                h0Var = null;
            }
            return (g0) h0Var.get();
        }
    }

    public DocumentUploadFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f199030o0 = new O0(m0.f406844a.b(g0.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f199032q0 = C42727D.c(new c());
        this.f199037v0 = C42727D.c(new b());
        this.f199038w0 = new d();
        this.f199039x0 = Uri.EMPTY;
        final int i12 = 0;
        this.f199040y0 = registerForActivityResult(new b.o(), new androidx.view.result.a(this) { // from class: com.avito.android.mortgage.document_upload.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DocumentUploadFragment f199150c;

            {
                this.f199150c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) throws IOException {
                DocumentUploadFragment documentUploadFragment = this.f199150c;
                switch (i12) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        DocumentUploadFragment.a aVar = DocumentUploadFragment.f199027B0;
                        if (!zBooleanValue) {
                            documentUploadFragment.r5().accept(InterfaceC40194a.g.f395529a);
                            break;
                        } else {
                            documentUploadFragment.r5().accept(new InterfaceC40194a.C11119a(Collections.singletonList(documentUploadFragment.f199039x0)));
                            break;
                        }
                    case 1:
                        List list = (List) obj;
                        DocumentUploadFragment.a aVar2 = DocumentUploadFragment.f199027B0;
                        List list2 = list;
                        if (list2 != null && !list2.isEmpty()) {
                            documentUploadFragment.r5().accept(new InterfaceC40194a.C11119a(list));
                            break;
                        } else {
                            documentUploadFragment.r5().accept(InterfaceC40194a.g.f395529a);
                            break;
                        }
                        break;
                    default:
                        DocumentUploadFragment.a aVar3 = DocumentUploadFragment.f199027B0;
                        if (!((Boolean) obj).booleanValue()) {
                            Context context = documentUploadFragment.getContext();
                            if (context != null) {
                                L5.a(context, R.string.mortgage_camera_permission_required, 0);
                            }
                            C33032b c33032b = documentUploadFragment.f199035t0;
                            if (c33032b == null) {
                                c33032b = null;
                            }
                            if (!c33032b.f215111a.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                com.avito.android.permissions.G g12 = documentUploadFragment.f199036u0;
                                (g12 != null ? g12 : null).p(true);
                                break;
                            }
                        } else {
                            documentUploadFragment.s5();
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        this.f199041z0 = registerForActivityResult(new b.g(), new androidx.view.result.a(this) { // from class: com.avito.android.mortgage.document_upload.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DocumentUploadFragment f199150c;

            {
                this.f199150c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) throws IOException {
                DocumentUploadFragment documentUploadFragment = this.f199150c;
                switch (i13) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        DocumentUploadFragment.a aVar = DocumentUploadFragment.f199027B0;
                        if (!zBooleanValue) {
                            documentUploadFragment.r5().accept(InterfaceC40194a.g.f395529a);
                            break;
                        } else {
                            documentUploadFragment.r5().accept(new InterfaceC40194a.C11119a(Collections.singletonList(documentUploadFragment.f199039x0)));
                            break;
                        }
                    case 1:
                        List list = (List) obj;
                        DocumentUploadFragment.a aVar2 = DocumentUploadFragment.f199027B0;
                        List list2 = list;
                        if (list2 != null && !list2.isEmpty()) {
                            documentUploadFragment.r5().accept(new InterfaceC40194a.C11119a(list));
                            break;
                        } else {
                            documentUploadFragment.r5().accept(InterfaceC40194a.g.f395529a);
                            break;
                        }
                        break;
                    default:
                        DocumentUploadFragment.a aVar3 = DocumentUploadFragment.f199027B0;
                        if (!((Boolean) obj).booleanValue()) {
                            Context context = documentUploadFragment.getContext();
                            if (context != null) {
                                L5.a(context, R.string.mortgage_camera_permission_required, 0);
                            }
                            C33032b c33032b = documentUploadFragment.f199035t0;
                            if (c33032b == null) {
                                c33032b = null;
                            }
                            if (!c33032b.f215111a.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                com.avito.android.permissions.G g12 = documentUploadFragment.f199036u0;
                                (g12 != null ? g12 : null).p(true);
                                break;
                            }
                        } else {
                            documentUploadFragment.s5();
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 2;
        this.f199028A0 = registerForActivityResult(new b.l(), new androidx.view.result.a(this) { // from class: com.avito.android.mortgage.document_upload.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ DocumentUploadFragment f199150c;

            {
                this.f199150c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) throws IOException {
                DocumentUploadFragment documentUploadFragment = this.f199150c;
                switch (i14) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        DocumentUploadFragment.a aVar = DocumentUploadFragment.f199027B0;
                        if (!zBooleanValue) {
                            documentUploadFragment.r5().accept(InterfaceC40194a.g.f395529a);
                            break;
                        } else {
                            documentUploadFragment.r5().accept(new InterfaceC40194a.C11119a(Collections.singletonList(documentUploadFragment.f199039x0)));
                            break;
                        }
                    case 1:
                        List list = (List) obj;
                        DocumentUploadFragment.a aVar2 = DocumentUploadFragment.f199027B0;
                        List list2 = list;
                        if (list2 != null && !list2.isEmpty()) {
                            documentUploadFragment.r5().accept(new InterfaceC40194a.C11119a(list));
                            break;
                        } else {
                            documentUploadFragment.r5().accept(InterfaceC40194a.g.f395529a);
                            break;
                        }
                        break;
                    default:
                        DocumentUploadFragment.a aVar3 = DocumentUploadFragment.f199027B0;
                        if (!((Boolean) obj).booleanValue()) {
                            Context context = documentUploadFragment.getContext();
                            if (context != null) {
                                L5.a(context, R.string.mortgage_camera_permission_required, 0);
                            }
                            C33032b c33032b = documentUploadFragment.f199035t0;
                            if (c33032b == null) {
                                c33032b = null;
                            }
                            if (!c33032b.f215111a.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                                com.avito.android.permissions.G g12 = documentUploadFragment.f199036u0;
                                (g12 != null ? g12 : null).p(true);
                                break;
                            }
                        } else {
                            documentUploadFragment.s5();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public static final void q5(DocumentUploadFragment documentUploadFragment, DocumentUploadArguments documentUploadArguments, boolean z12) {
        if (!z12) {
            documentUploadFragment.getParentFragmentManager().Y();
        }
        androidx.fragment.app.H hE2 = documentUploadFragment.getParentFragmentManager().e();
        f199027B0.getClass();
        hE2.n(R.id.container, a.a(documentUploadArguments), null);
        hE2.c(null);
        hE2.e();
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f199031p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setContent(new C22096n(367606296, new e(), true));
        return composeView;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        androidx.view.y f21241d;
        super.onViewCreated(view, bundle);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null && (f21241d = activityC22955mL1.getF21241d()) != null) {
            f21241d.a(getViewLifecycleOwner(), this.f199038w0);
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f199031p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        com.avito.android.mortgage.document_upload.di.a.a().a((com.avito.android.mortgage.di.o) C29972i.a(C29972i.b(this), com.avito.android.mortgage.di.o.class), (com.avito.android.mortgage.document_upload.di.c) C29972i.a(C29972i.b(this), Object.class), cv.c.b(this), new C28478k(MortgageDocumentUploadScreen.f90422d, com.avito.android.analytics.screens.s.c(this), null, 4, null), (DocumentUploadArguments) this.f199037v0.getValue(), this).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f199031p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final g0 r5() {
        return (g0) this.f199030o0.getValue();
    }

    public final void s5() throws IOException {
        C33032b c33032b = this.f199035t0;
        if (c33032b == null) {
            c33032b = null;
        }
        if (c33032b.f215112b.b("android.permission.CAMERA")) {
            File fileCreateTempFile = File.createTempFile("document_", ".jpg", requireContext().getExternalFilesDir(Environment.DIRECTORY_PICTURES));
            Uri uriForFile = FileProvider.getUriForFile(requireContext(), requireContext().getPackageName() + ".provider", fileCreateTempFile);
            this.f199039x0 = uriForFile;
            this.f199040y0.b(uriForFile);
            return;
        }
        com.avito.android.permissions.G g12 = this.f199036u0;
        if (g12 == null) {
            g12 = null;
        }
        g12.n();
        com.avito.android.permissions.G g13 = this.f199036u0;
        if (g13 == null) {
            g13 = null;
        }
        boolean zO2 = g13.o();
        C33032b c33032b2 = this.f199035t0;
        com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, requireContext(), new C32632w(!(c33032b2 != null ? c33032b2 : null).f215111a.shouldShowRequestPermissionRationale("android.permission.CAMERA") && zO2, this)));
    }
}
