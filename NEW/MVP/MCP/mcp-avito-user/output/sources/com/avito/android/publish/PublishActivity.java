package com.avito.android.publish;

import Cd0.C13257d0;
import Id0.InterfaceC14061a;
import Id0.InterfaceC14062b;
import Id0.d;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.InterfaceC23487e;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.publish.FromPage;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DraftPublicationLink;
import com.avito.android.deep_linking.links.MyAdvertDetailsLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.iac_util_deeplinks.public_module.IgnoreInDialogRouterLink;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.paid_services.PaidServicesLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.C33850e0;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.publish.Q0;
import com.avito.android.publish.W0;
import com.avito.android.publish.analytics.C33536w;
import com.avito.android.publish.analytics.InterfaceC33515a;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.category_edit.CategoryEditSheet;
import com.avito.android.publish.details.InterfaceC33777o1;
import com.avito.android.publish.details.PublishDetailsFragment;
import com.avito.android.publish.di.C33810a;
import com.avito.android.publish.di.C33824o;
import com.avito.android.publish.di.InterfaceC33815f;
import com.avito.android.publish.di.InterfaceC33816g;
import com.avito.android.publish.infomodel_request.InfomodelRequestFragment;
import com.avito.android.publish.scanner.ScannerFragment;
import com.avito.android.publish.scanner.ScannerParams;
import com.avito.android.publish.scanner_v2.ScannerOpenParams;
import com.avito.android.publish.scanner_v2.vinscanner.VinScannerFragment;
import com.avito.android.publish.screen.step.params.PublishDetailsFragment;
import com.avito.android.publish.screen.step.request.steps.StepsRequestFragment;
import com.avito.android.publish.slots.contact_info.ContactsData;
import com.avito.android.publish.vinsuggest.VinSuggestFragment;
import com.avito.android.publish.vinsuggest.VinSuggestOpenParams;
import com.avito.android.remote.model.CategoryModel;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.WizardParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverterKt;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.VinSuggest;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.SlotWidget;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.InlineFillParametersStepConfig;
import com.avito.android.remote.model.publish.PublishInitialToast;
import com.avito.android.util.K2;
import com.avito.android.util.Kundle;
import com.avito.android.util.NotFoundException;
import eH0.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import me0.InterfaceC44074c;
import nI0.InterfaceC44261b;
import oW.InterfaceC44697a;
import yc.C50213a;

/* compiled from: PublishActivity.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\b\u0012\u0004\u0012\u00020\r0\f2\u00020\u000e2\u00020\u000fB\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/publish/PublishActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/publish/screen/step/wizard/b;", "Lme0/c;", "Lcom/avito/android/publish/input_imei/j;", "Lcom/avito/android/publish/free_delivery/h;", "Lcom/avito/android/publish/scanner/o;", "Lcom/avito/android/publish/vinsuggest/h;", "Lcom/avito/android/publish/premoderation/r;", "Lcom/avito/android/publish/details/o1;", "Lcom/avito/android/publish/W0$b;", "Lcom/avito/android/dialog/A;", "Lcom/avito/android/K;", "Lcom/avito/android/publish/di/f;", "Lcom/avito/android/publish/j0;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PublishActivity extends com.avito.android.ui.activity.a implements com.avito.android.publish.screen.step.wizard.b, InterfaceC44074c, com.avito.android.publish.input_imei.j, com.avito.android.publish.free_delivery.h, com.avito.android.publish.scanner.o, com.avito.android.publish.vinsuggest.h, com.avito.android.publish.premoderation.r, InterfaceC33777o1, W0.b, com.avito.android.dialog.A, com.avito.android.K<InterfaceC33815f>, InterfaceC33875j0, InterfaceC28477j.b {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f231968H = 0;

    /* renamed from: A, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.view.result_handler.d f231969A;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC33815f f231971C;

    /* renamed from: E, reason: collision with root package name */
    public ViewGroup f231973E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public com.avito.android.progress_overlay.l f231974F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public View f231975G;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public PublishIntentFactory f231976m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public eH0.c f231977n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public InterfaceC44261b f231978o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f231979p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public W0 f231980q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public C33536w f231981r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public InterfaceC33515a f231982s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public Q1 f231983t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public C0 f231984u;

    /* renamed from: v, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.deprecated_design.dialog.a f231985v;

    /* renamed from: w, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f231986w;

    /* renamed from: x, reason: collision with root package name */
    @Inject
    public C50213a f231987x;

    /* renamed from: y, reason: collision with root package name */
    @Inject
    public InterfaceC33878l f231988y;

    /* renamed from: z, reason: collision with root package name */
    @Inject
    public T0 f231989z;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final Handler f231970B = new Handler();

    /* renamed from: D, reason: collision with root package name */
    public boolean f231972D = true;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a2(PublishActivity publishActivity, Fragment fragment) {
        if (!(fragment instanceof Id0.c)) {
            if ((fragment instanceof InterfaceC14061a) || !(fragment instanceof Id0.e)) {
                return;
            }
            ViewGroup viewGroup = publishActivity.f231973E;
            (viewGroup != null ? viewGroup : null).removeAllViews();
            return;
        }
        ViewGroup viewGroup2 = publishActivity.f231973E;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        viewGroup2.removeAllViews();
        LayoutInflater layoutInflater = publishActivity.getLayoutInflater();
        Id0.c cVar = (Id0.c) fragment;
        int iK1 = cVar.K1();
        ViewGroup viewGroup3 = publishActivity.f231973E;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        View viewInflate = layoutInflater.inflate(iK1, viewGroup3, false);
        ViewGroup viewGroup4 = publishActivity.f231973E;
        (viewGroup4 != null ? viewGroup4 : null).addView(viewInflate);
        cVar.t2(viewInflate);
    }

    public static void b2(Fragment fragment, int i12) {
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle(1);
        }
        arguments.putInt("step_index", i12);
        fragment.setArguments(arguments);
    }

    public static String h2(int i12) {
        return AK.c.g(i12, "tag_step_index_");
    }

    @Override // com.avito.android.publish.vinsuggest.h
    public final void C() {
        getSupportFragmentManager().Y();
    }

    @Override // com.avito.android.publish.details.InterfaceC33777o1
    public final void F() {
        CategoryEditSheet.a aVar = CategoryEditSheet.f232325n0;
        C0 c02 = this.f231984u;
        if (c02 == null) {
            c02 = null;
        }
        ItemBrief itemBrief = c02.f231867e0;
        String id2 = itemBrief != null ? itemBrief.getId() : null;
        C0 c03 = this.f231984u;
        if (c03 == null) {
            c03 = null;
        }
        Navigation navigation2 = c03.f231861Y.getNavigation();
        aVar.getClass();
        CategoryEditSheet.a.a(navigation2, id2).show(getSupportFragmentManager(), (String) null);
    }

    @Override // com.avito.android.publish.screen.step.wizard.b
    public final void J3(@Y61.k WizardParameter wizardParameter, boolean z12) {
        if (z12) {
            C0 c02 = this.f231984u;
            if (c02 == null) {
                c02 = null;
            }
            getSupportFragmentManager().b0(-1, 1, h2(c02.f231861Y.getStepIndex()));
        }
        C0 c03 = this.f231984u;
        (c03 != null ? c03 : null).Re(wizardParameter);
    }

    @Override // com.avito.android.publish.W0.b
    public final void L0(@Y61.k String str) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f231979p;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, new MyAdvertDetailsLink(str, null, true, 2, null), null, C22777e.b(new kotlin.Q("with_up_intent", Boolean.valueOf(getIntent().getBooleanExtra("with_up_intent", true)))), 2);
        setResult(-1);
        finish();
    }

    @Override // com.avito.android.publish.scanner.o
    public final void M0() {
        getSupportFragmentManager().Y();
    }

    @Override // me0.InterfaceC44074c
    public final void P(int i12, @Y61.k ScannerOpenParams scannerOpenParams) {
        if (getSupportFragmentManager().H("scan_tag") == null) {
            VinScannerFragment.f239432D0.getClass();
            VinScannerFragment vinScannerFragment = new VinScannerFragment();
            vinScannerFragment.f239434A0.setValue(vinScannerFragment, VinScannerFragment.f239433E0[0], scannerOpenParams);
            b2(vinScannerFragment, i12);
            f2(vinScannerFragment, "scan_tag");
        }
    }

    @Override // com.avito.android.publish.screen.step.wizard.b
    public final void Q0() {
        d2(null);
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @Override // com.avito.android.publish.premoderation.r
    public final void U0(@Y61.l CategoryModel categoryModel) throws NotFoundException {
        if (categoryModel == null) {
            return;
        }
        c2();
        C0 c02 = this.f231984u;
        if (c02 == null) {
            c02 = null;
        }
        c02.f231875m0 = true;
        c02.f231863a0 = true;
        c02.f231864b0 = c02.le();
        c02.f231861Y.m(categoryModel);
        Navigation rootNavigation = categoryModel.getRootNavigation();
        if (rootNavigation != null) {
            c02.f231861Y.r(rootNavigation);
        }
        c02.f231861Y.q(categoryModel.getNavigation());
        W0 w02 = this.f231980q;
        if (w02 == null) {
            w02 = null;
        }
        W0.a.a(w02, false, 3);
        C0 c03 = this.f231984u;
        C0 c04 = c03 != null ? c03 : null;
        c04.f231859W.setValue(new Q0.g(c04.f231861Y.getStepIndex(), false));
    }

    @Override // com.avito.android.publish.input_imei.j
    public final void Y0(int i12) {
        ScannerParams scannerParams = ScannerParams.f239140d;
        if (getSupportFragmentManager().H("scan_tag") == null) {
            ScannerFragment scannerFragment = new ScannerFragment();
            scannerFragment.f239120o0.setValue(scannerFragment, ScannerFragment.f239116D0[0], scannerParams);
            b2(scannerFragment, i12);
            f2(scannerFragment, "scan_tag");
            getSupportFragmentManager().E();
        }
    }

    @Override // com.avito.android.publish.screen.step.wizard.b
    public final void Z2() {
        C0 c02 = this.f231984u;
        if (c02 == null) {
            c02 = null;
        }
        if (!c02.Be()) {
            C0 c03 = this.f231984u;
            (c03 != null ? c03 : null).ye();
        } else if (getSupportFragmentManager().L() > 1) {
            getSupportFragmentManager().Y();
        } else {
            K2.c(this);
            finish();
        }
    }

    @Override // com.avito.android.publish.W0.b, com.avito.android.dialog.A
    public final void a(@Y61.k DeepLink deepLink) {
        Q1 q12;
        Bundle bundleB;
        if (deepLink instanceof PaidServicesLink) {
            C0 c02 = this.f231984u;
            if (c02 == null) {
                c02 = null;
            }
            String str = c02.f231862Z;
            if (str != null) {
                boolean booleanExtra = getIntent().getBooleanExtra("with_up_intent", true);
                eH0.c cVar = this.f231977n;
                eH0.c cVar2 = cVar != null ? cVar : null;
                C0 c03 = this.f231984u;
                if (c03 == null) {
                    c03 = null;
                }
                Intent intentA = c.a.a(cVar2, str, null, true, ((Boolean) c03.f231884v0.getValue()).booleanValue(), 6);
                if (booleanExtra) {
                    InterfaceC44261b interfaceC44261b = this.f231978o;
                    intentA.putExtra("up_intent", InterfaceC44261b.a.a(interfaceC44261b != null ? interfaceC44261b : null, null, null, null, null, 31));
                }
                bundleB = C22777e.b(new kotlin.Q("up_intent", intentA.setFlags(603979776)));
            } else {
                bundleB = null;
            }
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f231979p;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deepLink, null, bundleB, 2);
            finish();
            return;
        }
        if (deepLink instanceof DraftPublicationLink) {
            finish();
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f231979p;
            if (aVar2 == null) {
                aVar2 = null;
            }
            b.a.a(aVar2, deepLink, null, null, 6);
            return;
        }
        if (deepLink instanceof IgnoreInDialogRouterLink) {
            return;
        }
        if (deepLink instanceof MyAdvertDetailsLink) {
            com.avito.android.deeplink_handler.handler.composite.a aVar3 = this.f231979p;
            if (aVar3 == null) {
                aVar3 = null;
            }
            b.a.a(aVar3, deepLink, null, C22777e.b(new kotlin.Q("with_up_intent", Boolean.valueOf(getIntent().getBooleanExtra("with_up_intent", true)))), 2);
            Q1 q13 = this.f231983t;
            q12 = q13 != null ? q13 : null;
            q12.getClass();
            kotlin.reflect.n<Object> nVar = Q1.f67448x0[46];
            if (((Boolean) q12.f67468T.a().invoke()).booleanValue()) {
                setResult(-1);
            }
            finish();
            return;
        }
        if (deepLink instanceof DetailsSheetLink) {
            com.avito.android.deeplink_handler.handler.composite.a aVar4 = this.f231979p;
            if (aVar4 == null) {
                aVar4 = null;
            }
            b.a.a(aVar4, deepLink, null, null, 6);
            return;
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar5 = this.f231979p;
        if (aVar5 == null) {
            aVar5 = null;
        }
        b.a.a(aVar5, deepLink, null, null, 6);
        Q1 q14 = this.f231983t;
        q12 = q14 != null ? q14 : null;
        q12.getClass();
        kotlin.reflect.n<Object> nVar2 = Q1.f67448x0[46];
        if (((Boolean) q12.f67468T.a().invoke()).booleanValue()) {
            setResult(-1);
        }
        finish();
    }

    public final void c2() {
        getSupportFragmentManager().b0(-1, 1, null);
    }

    @Override // com.avito.android.publish.premoderation.r
    public final void d1() {
        C0 c02 = this.f231984u;
        if (c02 == null) {
            c02 = null;
        }
        c02.xe(null);
    }

    public final void d2(@Y61.l Intent intent) {
        setResult(-1, intent);
        e2();
        overridePendingTransition(0, R.anim.avito_screen_slide_out);
    }

    public final void e2() {
        ParameterSlot parameterSlot;
        List<ParameterSlot> parameters;
        Object next;
        C0 c02 = this.f231984u;
        if (c02 == null) {
            c02 = null;
        }
        if (!c02.Be()) {
            C50213a c50213a = this.f231987x;
            if (c50213a == null) {
                c50213a = null;
            }
            if (c50213a.f443210b.length() != 0) {
                C33536w c33536w = this.f231981r;
                if (c33536w == null) {
                    c33536w = null;
                }
                C0 c03 = this.f231984u;
                if (c03 == null) {
                    c03 = null;
                }
                String strNe = c03.ne();
                C0 c04 = this.f231984u;
                if (c04 == null) {
                    c04 = null;
                }
                CategoryParameters categoryParameters = c04.f231873k0;
                if (categoryParameters == null || (parameters = categoryParameters.getParameters()) == null) {
                    parameterSlot = null;
                } else {
                    Iterator<T> it = parameters.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (kotlin.jvm.internal.L.f(((ParameterSlot) next).getId(), "181941")) {
                                break;
                            }
                        }
                    }
                    parameterSlot = (ParameterSlot) next;
                }
                SelectParameter.Flat flat = parameterSlot instanceof SelectParameter.Flat ? (SelectParameter.Flat) parameterSlot : null;
                c33536w.f232281a.c(new C13257d0(strNe, flat != null ? flat.getValue() : null, c33536w.f232282b));
            }
        }
        Intent intent = (Intent) getIntent().getParcelableExtra("up_intent");
        if (intent != null) {
            startActivity(intent);
        }
        finish();
    }

    public final <T extends Fragment & Id0.e> void f2(T t12, String str) {
        androidx.fragment.app.H hE2 = getSupportFragmentManager().e();
        Fragment fragment = (Fragment) C42745f0.S(getSupportFragmentManager().P());
        if (t12 instanceof Id0.f) {
            hE2.o(R.anim.fade_in, R.anim.fade_out, R.anim.fade_in, R.anim.fade_out);
        } else if (fragment instanceof InterfaceC14062b) {
            hE2.o(R.anim.fade_in, R.anim.fade_out, R.anim.enter_from_left_publish, R.anim.exit_to_right_publish);
        } else {
            hE2.o(R.anim.enter_from_right_publish, R.anim.exit_to_left_publish, R.anim.enter_from_left_publish, R.anim.exit_to_right_publish);
        }
        hE2.n(t12 instanceof InterfaceC14061a ? R.id.full_screen_fragment_container : R.id.fragment_container, t12, str);
        hE2.c(str);
        hE2.f();
    }

    public final void g2(Fragment fragment, int i12) {
        b2(fragment, i12);
        f2(fragment, h2(i12));
    }

    @Override // me0.InterfaceC44074c, com.avito.android.publish.input_imei.j, com.avito.android.publish.free_delivery.h, com.avito.android.publish.InterfaceC33875j0
    public final void h() {
        d2(null);
    }

    @Override // com.avito.android.publish.details.InterfaceC33777o1
    public final void j0() {
        getSupportFragmentManager().Y();
    }

    @Override // me0.InterfaceC44074c
    public final void n0(@Y61.k VinSuggest vinSuggest, @Y61.k String str, int i12) {
        if (getSupportFragmentManager().H("vin_suggest_tag") == null) {
            VinSuggestFragment.b bVar = VinSuggestFragment.f245683s0;
            VinSuggestOpenParams vinSuggestOpenParams = new VinSuggestOpenParams(str, vinSuggest.getAutoVINbyRegNumId(), vinSuggest.getVehicleNumberId(), vinSuggest.getVinByRegNumUserBackstepId(), vinSuggest.getRegNumByPhotoRequest(), vinSuggest.getAutoRegNumByPhoto(), vinSuggest.getPhotosId());
            bVar.getClass();
            VinSuggestFragment vinSuggestFragment = new VinSuggestFragment();
            vinSuggestFragment.f245685n0.setValue(vinSuggestFragment, VinSuggestFragment.f245684t0[0], vinSuggestOpenParams);
            b2(vinSuggestFragment, i12);
            f2(vinSuggestFragment, "vin_suggest_tag");
        }
    }

    @Override // com.avito.android.publish.details.InterfaceC33777o1
    public final void o(@Y61.k String str) {
        ParameterSlot parameterSlot;
        String id2;
        Fragment fragmentA;
        String title;
        SlotWidget widget;
        List<ParameterSlot> parameters;
        Object next;
        C0 c02 = this.f231984u;
        if (c02 == null) {
            c02 = null;
        }
        CategoryParameters categoryParameters = c02.f231873k0;
        if (categoryParameters == null || (parameters = categoryParameters.getParameters()) == null) {
            parameterSlot = null;
        } else {
            Iterator<T> it = parameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (kotlin.jvm.internal.L.f(((ParameterSlot) next).getId(), str)) {
                        break;
                    }
                }
            }
            parameterSlot = (ParameterSlot) next;
        }
        Slot slot = parameterSlot instanceof Slot ? (Slot) parameterSlot : null;
        SlotConfig config = (slot == null || (widget = slot.getWidget()) == null) ? null : widget.getConfig();
        InlineFillParametersStepConfig inlineFillParametersStepConfig = config instanceof InlineFillParametersStepConfig ? (InlineFillParametersStepConfig) config : null;
        CategoryPublishStep.Params fillParametersStepConfig = inlineFillParametersStepConfig != null ? inlineFillParametersStepConfig.getFillParametersStepConfig() : null;
        String str2 = "";
        if (fillParametersStepConfig == null || (id2 = fillParametersStepConfig.getId()) == null) {
            id2 = "";
        }
        if (fillParametersStepConfig != null && (title = fillParametersStepConfig.getTitle()) != null) {
            str2 = title;
        }
        C33536w c33536w = this.f231981r;
        if (c33536w == null) {
            c33536w = null;
        }
        String strI = androidx.compose.foundation.H.i(':', id2, str2);
        T0 t02 = this.f231989z;
        if (t02 == null) {
            t02 = null;
        }
        InterfaceC33535v.a.a(c33536w, strI, t02.i(), 4);
        if (getSupportFragmentManager().H("details_step_for_fill_params_tag") == null) {
            Q1 q12 = this.f231983t;
            if (q12 == null) {
                q12 = null;
            }
            q12.getClass();
            kotlin.reflect.n<Object> nVar = Q1.f67448x0[72];
            if (((Boolean) q12.f67489h0.a().invoke()).booleanValue()) {
                PublishDetailsFragment.a aVar = PublishDetailsFragment.f240417j1;
                C0 c03 = this.f231984u;
                String str3 = (c03 != null ? c03 : null).f231866d0;
                if (str3 == null) {
                    str3 = null;
                }
                if (c03 == null) {
                    c03 = null;
                }
                boolean zBe = c03.Be();
                aVar.getClass();
                fragmentA = PublishDetailsFragment.a.a(str3, zBe, null, str);
            } else {
                PublishDetailsFragment.a aVar2 = com.avito.android.publish.details.PublishDetailsFragment.f233085Y2;
                C0 c04 = this.f231984u;
                String str4 = (c04 != null ? c04 : null).f231866d0;
                if (str4 == null) {
                    str4 = null;
                }
                if (c04 == null) {
                    c04 = null;
                }
                boolean zBe2 = c04.Be();
                aVar2.getClass();
                fragmentA = PublishDetailsFragment.a.a(str4, zBe2, null, str);
            }
            b2(fragmentA, -1);
            f2(fragmentA, "details_step_for_fill_params_tag");
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        kotlin.G0 g02;
        super.onActivityResult(i12, i13, intent);
        Q1 q12 = this.f231983t;
        if (q12 == null) {
            q12 = null;
        }
        if (q12.A().invoke().booleanValue()) {
            Fragment fragmentH = getSupportFragmentManager().H("scan_tag");
            if (fragmentH == null && (fragmentH = getSupportFragmentManager().H("details_step_for_fill_params_tag")) == null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                C0 c02 = this.f231984u;
                if (c02 == null) {
                    c02 = null;
                }
                fragmentH = supportFragmentManager.H(h2(c02.f231861Y.getStepIndex()));
            }
            if (fragmentH != null) {
                fragmentH.onActivityResult(i12, i13, intent);
                g02 = kotlin.G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                com.avito.android.publish.view.result_handler.d dVar = this.f231969A;
                (dVar != null ? dVar : null).b("PublishActivity", i12, i13, intent);
            }
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        InterfaceC23487e interfaceC23487eG = getSupportFragmentManager().G(R.id.full_screen_fragment_container);
        if (interfaceC23487eG == null) {
            interfaceC23487eG = getSupportFragmentManager().G(R.id.fragment_container);
        }
        if (((interfaceC23487eG instanceof InfomodelRequestFragment) || (interfaceC23487eG instanceof StepsRequestFragment)) && getSupportFragmentManager().L() == 1) {
            d2(null);
        } else {
            if (interfaceC23487eG != null && (interfaceC23487eG instanceof com.avito.android.ui.fragments.c) && ((com.avito.android.ui.fragments.c) interfaceC23487eG).i0()) {
                return;
            }
            super.onBackPressed();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    @SuppressLint({"HardcodeStringDetector"})
    public final void onCreate(@Y61.l Bundle bundle) {
        View view;
        PublishInitialToast publishInitialToast;
        InterfaceC33815f.a aVarA = C33810a.a();
        aVarA.d((InterfaceC33816g) C29972i.a(C29972i.b(this), InterfaceC33816g.class));
        aVarA.f((InterfaceC44697a) C29972i.a(C29972i.b(this), InterfaceC44697a.class));
        aVarA.a(cv.c.a(this));
        aVarA.b(getResources());
        aVarA.g(this);
        aVarA.e(getSupportFragmentManager());
        aVarA.i(this);
        aVarA.c(com.avito.android.analytics.screens.s.a(this));
        aVarA.h(new C33824o());
        InterfaceC33815f interfaceC33815fBuild = aVarA.build();
        this.f231971C = interfaceC33815fBuild;
        interfaceC33815fBuild.Fj(this);
        String stringExtra = getIntent().getStringExtra("key_item_id");
        String stringExtra2 = getIntent().getStringExtra("should_draft_id");
        if (bundle == null) {
            String stringExtra3 = getIntent().getStringExtra("key_focus_id");
            if (stringExtra3 != null) {
                T0 t02 = this.f231989z;
                if (t02 == null) {
                    t02 = null;
                }
                t02.d(stringExtra3);
                getIntent().removeExtra("key_focus_id");
            }
            boolean booleanExtra = getIntent().getBooleanExtra("key_force_error_checking", false);
            T0 t03 = this.f231989z;
            if (t03 == null) {
                t03 = null;
            }
            t03.h(booleanExtra);
            getIntent().removeExtra("key_force_error_checking");
            Bundle extras = getIntent().getExtras();
            if (extras != null && (publishInitialToast = (PublishInitialToast) extras.getParcelable("key_initial_toast")) != null) {
                T0 t04 = this.f231989z;
                if (t04 == null) {
                    t04 = null;
                }
                t04.f(publishInitialToast);
                getIntent().removeExtra("key_initial_toast");
            }
            String stringExtra4 = getIntent().getStringExtra("key_from_source");
            if (stringExtra4 != null) {
                T0 t05 = this.f231989z;
                if (t05 == null) {
                    t05 = null;
                }
                t05.e(stringExtra4);
                getIntent().removeExtra("key_from_source");
            }
        } else {
            T0 t06 = this.f231989z;
            if (t06 == null) {
                t06 = null;
            }
            t06.b(bundle);
        }
        if (stringExtra != null || stringExtra2 != null) {
            overridePendingTransition(R.anim.avito_screen_slide_in, R.anim.empty);
        }
        super.onCreate(bundle);
        setContentView(R.layout.publish_activity);
        this.f231975G = findViewById(R.id.toast_container);
        this.f231973E = (ViewGroup) findViewById(R.id.footer);
        ViewGroup viewGroup = (ViewGroup) K1();
        InterfaceC28373a interfaceC28373a = this.f231986w;
        this.f231974F = new com.avito.android.progress_overlay.l(viewGroup, R.id.fragment_container, interfaceC28373a != null ? interfaceC28373a : null, R.layout.publish_progress_overlay, 0, 16, null);
        com.avito.android.lib.util.i iVar = com.avito.android.lib.util.i.f181373a;
        iVar.getClass();
        if (com.avito.android.lib.util.i.f181377e) {
            View viewFindViewById = findViewById(android.R.id.content);
            com.avito.android.lib.util.i.j(iVar, viewFindViewById);
            com.avito.android.lib.util.i.f(iVar, viewFindViewById);
        } else if (Build.VERSION.SDK_INT >= 30) {
            androidx.core.view.F0.a(getWindow(), false);
            com.avito.android.lib.util.i.g(iVar, K1());
            d.a aVar = Id0.d.f8219b;
            ViewGroup viewGroup2 = this.f231973E;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            aVar.getClass();
            viewGroup2.setWindowInsetsAnimationCallback(new Id0.d(viewGroup2, null));
            View viewFindViewById2 = findViewById(R.id.fragment_container);
            viewFindViewById2.setWindowInsetsAnimationCallback(new Id0.d(viewFindViewById2, null));
        }
        C0 c02 = this.f231984u;
        if (c02 == null) {
            c02 = null;
        }
        Kundle kundleA = bundle != null ? com.avito.android.util.G.a(bundle, "key_publish_view_model_state") : null;
        c02.getClass();
        if (kundleA != null) {
            PublishState publishState = (PublishState) kundleA.d("key_state");
            if (publishState == null) {
                publishState = new PublishState(null, null, 0, null, null, null, 63, null);
            }
            c02.f231861Y = publishState;
            c02.f231862Z = kundleA.g("key_item_id");
            c02.f231865c0 = kundleA.g("key_draft_id");
            c02.f231863a0 = kundleA.f318647b.getBoolean("key_should_restore_draft", c02.f231863a0);
            c02.f231864b0 = kundleA.f318647b.getBoolean("key_open_from_external_deeplink", c02.f231864b0);
            c02.f231874l0 = (ContactsData) kundleA.d("key_contacts_data");
            c02.f231867e0 = (ItemBrief) kundleA.d("key_item_data");
            c02.f231869g0 = (DeepLink) kundleA.d("key_post_action");
            c02.f231866d0 = kundleA.g("key_local_draft_id");
            c02.f231876n0 = kundleA.b("key_photos_count_on_init");
            c02.f231868f0 = kundleA.g("key_scenario");
            C50213a c50213a = c02.f231847K;
            String strG = kundleA.g("key_session_id");
            c50213a.f443211c = strG;
            c50213a.f443210b = strG;
            C50213a c50213a2 = c02.f231847K;
            ItemBrief itemBrief = c02.f231867e0;
            c50213a2.f443213e = itemBrief != null ? itemBrief.getId() : null;
            c02.f231847K.f443212d = c02.f231867e0 != null ? FromPage.f90273c : FromPage.f90272b;
        }
        C0 c03 = this.f231984u;
        if (c03 == null) {
            c03 = null;
        }
        c03.f231859W.observe(this, new C33850e0.a(new Y(this, c03)));
        getSupportFragmentManager().e0(new W(this), false);
        getSupportFragmentManager().e0(new U(this), true);
        C0 c04 = this.f231984u;
        if (c04 == null) {
            c04 = null;
        }
        c04.f231880r0.observe(this, new V(this));
        W0 w02 = this.f231980q;
        if (w02 == null) {
            w02 = null;
        }
        w02.i();
        if (bundle == null) {
            boolean booleanExtra2 = getIntent().getBooleanExtra("should_restore_draft", false);
            C0 c05 = this.f231984u;
            if (c05 == null) {
                c05 = null;
            }
            c05.f231865c0 = stringExtra2;
            if (stringExtra2 == null) {
                stringExtra2 = UUID.randomUUID().toString();
            }
            c05.f231866d0 = stringExtra2;
            Navigation navigation2 = (Navigation) getIntent().getParcelableExtra("key_navigation");
            if (navigation2 == null) {
                if (!booleanExtra2 && stringExtra == null) {
                    C0 c06 = this.f231984u;
                    if (c06 == null) {
                        c06 = null;
                    }
                    C0.Ge(c06, "navigation was not passed to " + this + " in publish mode", null, 6);
                    return;
                }
                navigation2 = new Navigation(null, null, null, null, null, null, null, null, null, 511, null);
            }
            C0 c07 = this.f231984u;
            if (c07 == null) {
                c07 = null;
            }
            Integer num = getIntent().getBooleanExtra("key_start_from_subcategory", false) ? 2 : null;
            Map<String, ? extends Object> mapStringToMap = CategoryParametersConverterKt.stringToMap(getIntent().getStringExtra("key_params"));
            String stringExtra5 = getIntent().getStringExtra("key_target_step_type");
            Boolean boolValueOf = Boolean.valueOf(getIntent().getBooleanExtra("key_need_root_navigation", false));
            String stringExtra6 = getIntent().getStringExtra("key_scenario");
            c07.f231877o0 = mapStringToMap;
            c07.f231878p0 = stringExtra5;
            c07.f231879q0 = boolValueOf;
            c07.f231861Y.q(navigation2);
            c07.f231861Y.r(navigation2);
            c07.f231863a0 = booleanExtra2;
            c07.f231857U = num;
            c07.f231864b0 = c07.le();
            c07.f231868f0 = stringExtra6;
            C0 c08 = this.f231984u;
            if (c08 == null) {
                c08 = null;
            }
            if (stringExtra != null) {
                c08.f231867e0 = new ItemBrief(stringExtra, null, null, null, null, null, 62, null);
            }
            c08.f231869g0 = (DeepLink) getIntent().getParcelableExtra("key_action");
            Intent intent = getIntent();
            if (intent.hasExtra("key_advert_id")) {
                C0 c09 = this.f231984u;
                if (c09 == null) {
                    c09 = null;
                }
                c09.f231862Z = intent.getStringExtra("key_advert_id");
            }
            if (intent.hasExtra("key_session_id")) {
                C50213a c50213a3 = this.f231987x;
                if (c50213a3 == null) {
                    c50213a3 = null;
                }
                String stringExtra7 = intent.getStringExtra("key_session_id");
                c50213a3.f443211c = stringExtra7;
                c50213a3.f443210b = stringExtra7;
            }
            C0 c010 = this.f231984u;
            if (c010 == null) {
                c010 = null;
            }
            c010.f231859W.setValue(new Q0.g(c010.f231861Y.getStepIndex(), true));
            DeepLink deepLink = (DeepLink) getIntent().getParcelableExtra("key_startup_action");
            if (deepLink != null) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f231979p;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, deepLink, null, null, 6);
            }
            T0 t07 = this.f231989z;
            if (t07 == null) {
                t07 = null;
            }
            final PublishInitialToast publishInitialToastA = t07.a();
            if (publishInitialToastA != null && (view = this.f231975G) != null) {
                view.post(new Runnable() { // from class: com.avito.android.publish.S
                    @Override // java.lang.Runnable
                    public final void run() throws NumberFormatException {
                        com.avito.android.component.toast.f fVarB;
                        String title;
                        String eventId;
                        int i12 = PublishActivity.f231968H;
                        PublishInitialToast publishInitialToast2 = publishInitialToastA;
                        PublishInitialToast.ClickstreamEvent showEvent = publishInitialToast2.getShowEvent();
                        PublishActivity publishActivity = this;
                        List listSingletonList = null;
                        if (showEvent != null && (eventId = showEvent.getEventId()) != null) {
                            int i13 = Integer.parseInt(eventId);
                            C33536w c33536w = publishActivity.f231981r;
                            if (c33536w == null) {
                                c33536w = null;
                            }
                            c33536w.z0(i13);
                        }
                        PublishInitialToast.Button button = publishInitialToast2.getButton();
                        if (button != null && (title = button.getTitle()) != null) {
                            listSingletonList = Collections.singletonList(new c.a.C3719a(title, true, null, new C33545d0(publishInitialToast2, publishActivity), 4, null));
                        }
                        List list = listSingletonList;
                        View view2 = publishActivity.f231975G;
                        if (view2 != null) {
                            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                            PrintableText printableTextF = com.avito.android.printable_text.b.f(publishInitialToast2.getDescription());
                            ToastBarPosition toastBarPosition = ToastBarPosition.f181045c;
                            if (publishInitialToast2.getType() == PublishInitialToast.Type.DEFAULT) {
                                fVarB = f.a.f125253a;
                            } else {
                                f.c.f125255c.getClass();
                                fVarB = f.c.a.b();
                            }
                            com.avito.android.component.toast.c.b(cVar, view2, printableTextF, null, list, null, fVarB, 0, toastBarPosition, null, false, false, null, null, 4010);
                        }
                    }
                });
            }
        } else {
            C0 c011 = this.f231984u;
            if (c011 == null) {
                c011 = null;
            }
            if (c011.f231873k0 == null) {
                c2();
                W0 w03 = this.f231980q;
                if (w03 == null) {
                    w03 = null;
                }
                w03.f(new Z(this), new C33543c0(this));
            }
        }
        InterfaceC33515a interfaceC33515a = this.f231982s;
        if (interfaceC33515a == null) {
            interfaceC33515a = null;
        }
        C0 c012 = this.f231984u;
        if (c012 == null) {
            c012 = null;
        }
        interfaceC33515a.c(c012);
        InterfaceC33878l interfaceC33878l = this.f231988y;
        (interfaceC33878l != null ? interfaceC33878l : null).n6();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        InterfaceC33515a interfaceC33515a = this.f231982s;
        if (interfaceC33515a == null) {
            interfaceC33515a = null;
        }
        interfaceC33515a.a();
        W0 w02 = this.f231980q;
        (w02 != null ? w02 : null).c();
        super.onDestroy();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        super.onNewIntent(intent);
        DeepLink deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_publish_restart", DeepLink.class) : intent.getParcelableExtra("key_publish_restart"));
        if (deepLink != null) {
            setResult(-1);
            C0 c02 = this.f231984u;
            C0 c03 = c02 != null ? c02 : null;
            c03.getClass();
            c03.f231859W.setValue(new Q0.j(deepLink));
            return;
        }
        if (intent.getBooleanExtra("key_publish_update", false)) {
            C0 c04 = this.f231984u;
            if (c04 == null) {
                c04 = null;
            }
            String str = c04.f231865c0;
            if (str != null) {
                this.f231972D = false;
                finish();
                PublishIntentFactory publishIntentFactory = this.f231976m;
                if (publishIntentFactory == null) {
                    publishIntentFactory = null;
                }
                startActivity(PublishIntentFactory.a.b(publishIntentFactory, str, null, 4));
            }
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onPause() {
        Q1 q12 = this.f231983t;
        if (q12 == null) {
            q12 = null;
        }
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[43];
        if (((Boolean) q12.f67465Q.a().invoke()).booleanValue()) {
            W0 w02 = this.f231980q;
            (w02 != null ? w02 : null).a(isFinishing(), this.f231972D);
        }
        super.onPause();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!isChangingConfigurations()) {
            W0 w02 = this.f231980q;
            if (w02 == null) {
                w02 = null;
            }
            w02.e();
            C0 c02 = this.f231984u;
            if (c02 == null) {
                c02 = null;
            }
            c02.getClass();
            Kundle kundle = new Kundle();
            kundle.j(c02.f231861Y, "key_state");
            kundle.m("key_item_id", c02.f231862Z);
            kundle.m("key_draft_id", c02.f231865c0);
            kundle.h(Boolean.valueOf(c02.f231863a0), "key_should_restore_draft");
            kundle.h(Boolean.valueOf(c02.f231864b0), "key_open_from_external_deeplink");
            kundle.j(c02.f231874l0, "key_contacts_data");
            kundle.j(c02.f231867e0, "key_item_data");
            kundle.j(c02.f231869g0, "key_post_action");
            String str = c02.f231866d0;
            if (str == null) {
                str = null;
            }
            kundle.m("key_local_draft_id", str);
            kundle.i(c02.f231876n0, "key_photos_count_on_init");
            kundle.m("key_session_id", c02.f231847K.b());
            kundle.m("key_scenario", c02.f231868f0);
            com.avito.android.util.G.c(bundle, "key_publish_view_model_state", kundle);
        }
        T0 t02 = this.f231989z;
        (t02 != null ? t02 : null).g(bundle);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        Q1 q12 = this.f231983t;
        if (q12 == null) {
            q12 = null;
        }
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[43];
        if (!((Boolean) q12.f67465Q.a().invoke()).booleanValue()) {
            W0 w02 = this.f231980q;
            if (w02 == null) {
                w02 = null;
            }
            w02.a(isFinishing(), this.f231972D);
        }
        this.f231970B.removeCallbacksAndMessages(null);
        super.onStop();
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        InterfaceC33815f interfaceC33815f = this.f231971C;
        if (interfaceC33815f == null) {
            return null;
        }
        return interfaceC33815f;
    }

    @Override // com.avito.android.publish.InterfaceC33875j0
    public final void t(@Y61.l String str) {
        Intent intentPutExtra = new Intent().putExtra("status_message", str);
        C0 c02 = this.f231984u;
        if (c02 == null) {
            c02 = null;
        }
        ItemBrief itemBrief = c02.f231867e0;
        Intent intentPutExtra2 = intentPutExtra.putExtra("edited_advert_id", itemBrief != null ? itemBrief.getId() : null);
        C0 c03 = this.f231984u;
        d2(intentPutExtra2.putExtra("edited_advert_post_action", (c03 != null ? c03 : null).f231869g0));
    }
}
