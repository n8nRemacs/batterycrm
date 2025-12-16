package com.avito.android.publish.details;

import Oi0.InterfaceC14698b;
import Xd0.InterfaceC16992a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23038g0;
import androidx.view.InterfaceC22983P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.EditParametersScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.PublishParametersScreen;
import com.avito.android.analytics.screens.tracker.ScreenTransfer;
import com.avito.android.blueprints.publish.date_interval.c;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.c2c_trx.deepLinks.AddAutoToC2CTrxLink;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.AuctionAddLink;
import com.avito.android.deep_linking.links.CollectPublishParamsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.VerificationStartLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.photo_list_view.s;
import com.avito.android.photo_list_view_group_selection.PhotoItemGroupSelectionParams;
import com.avito.android.photo_list_view_group_selection.PhotoItemGroupSelectionResult;
import com.avito.android.photo_permission.PhotoPermission;
import com.avito.android.photo_permission.PhotoPermissionDialogData;
import com.avito.android.photo_permission.PhotoPermissionResult;
import com.avito.android.photo_permission.a;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.publish.C33864h0;
import com.avito.android.publish.PublishActivity;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.analytics.events.AddressChoiceType;
import com.avito.android.publish.details.D;
import com.avito.android.publish.details.E;
import com.avito.android.publish.details.InterfaceC33764k0;
import com.avito.android.publish.details.K1;
import com.avito.android.publish.details.PublishDetailsFragment;
import com.avito.android.publish.details.Q0;
import com.avito.android.publish.details.auction.d;
import com.avito.android.publish.details.di.C33697f;
import com.avito.android.publish.details.di.C33735p;
import com.avito.android.publish.details.di.InterfaceC33739u;
import com.avito.android.publish.details.di.InterfaceC33742x;
import com.avito.android.publish.details.seller_protection.SellerProtectionBottomSheet;
import com.avito.android.publish.details.seller_protection.SellerProtectionDialogResult;
import com.avito.android.publish.iac_devices.IacDevice;
import com.avito.android.publish.objects.di.C33921d;
import com.avito.android.publish.slots.item_info.c;
import com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog;
import com.avito.android.publish.view.ItemDetailsBaseFragment;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.item_info.Confetti;
import com.avito.android.remote.model.category_parameters.slot.residential_complex.ResidentialComplexSlot;
import com.avito.android.remote.model.category_parameters.slot.residential_complex.ResidentialComplexSlotConfig;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.sx_address.SxAddressAddResult;
import com.avito.android.util.C35974x2;
import com.avito.android.util.D6;
import com.avito.android.util.H2;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.K2;
import com.avito.android.util.NotFoundException;
import com.avito.android.util.architecture_components.C35747a;
import com.avito.android.validation.InterfaceC36014j;
import com.avito.android.video_picker.VideoUploadLimits;
import fv.C40482a;
import gj.o;
import hx.InterfaceC41184a;
import i.AbstractC41201a;
import i.b;
import iN0.InterfaceC41321b;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kr.C43490a;
import l41.InterfaceC43543a;
import vf0.C49325f;
import yc.C50213a;

/* compiled from: PublishDetailsFragment.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/publish/details/PublishDetailsFragment;", "Lcom/avito/android/publish/view/ItemDetailsBaseFragment;", "Lcom/avito/android/publish/details/D$a;", "Lcom/avito/android/publish/details/auction/d$a;", "Lcom/avito/android/select/p;", "Lcom/avito/android/publish/photo_picker/c;", "Lcom/avito/android/ui/fragments/c;", "LId0/c;", "Lcom/avito/android/analytics/screens/j$b;", "Lgj/i;", "Lcom/avito/android/photo_permission/a$a;", "LiN0/b;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PublishDetailsFragment extends ItemDetailsBaseFragment implements D.a, d.a, com.avito.android.select.p, com.avito.android.publish.photo_picker.c, com.avito.android.ui.fragments.c, Id0.c, InterfaceC28477j.b, gj.i, a.InterfaceC6567a, InterfaceC41321b {

    /* renamed from: Y2, reason: collision with root package name */
    @Y61.k
    public static final a f233085Y2 = new a(null);

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public K1 f233086C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f233087D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f233088E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public com.avito.android.photo_list_view.s f233089F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public PhotoPickerIntentFactory f233090G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public com.avito.android.phone_confirmation.P f233091H0;

    /* renamed from: H1, reason: collision with root package name */
    @Inject
    public InterfaceC36014j f233092H1;

    /* renamed from: H2, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f233093H2;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public com.avito.android.phone_reverification_info.d f233094I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public InterfaceC30751h f233095J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public InterfaceC41184a f233096K0;

    /* renamed from: L0, reason: collision with root package name */
    @Inject
    public com.avito.android.photo_list_view_group_selection.c f233097L0;

    /* renamed from: M0, reason: collision with root package name */
    @Inject
    public RecyclerView.Adapter<?> f233098M0;

    /* renamed from: N0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f233099N0;

    /* renamed from: O0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.analytics.E f233100O0;

    /* renamed from: P0, reason: collision with root package name */
    @Inject
    public InterfaceC33535v f233101P0;

    /* renamed from: P2, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<PhotoItemGroupSelectionParams> f233102P2;

    /* renamed from: Q0, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.deprecated_design.dialog.a f233103Q0;

    /* renamed from: Q2, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f233104Q2;

    /* renamed from: R0, reason: collision with root package name */
    @Inject
    public Pd0.v f233105R0;

    /* renamed from: R2, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f233106R2;

    /* renamed from: S0, reason: collision with root package name */
    @Inject
    public HtmlEditorViewModel f233107S0;

    /* renamed from: S2, reason: collision with root package name */
    public C33789t f233108S2;

    /* renamed from: T0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.details.computer_vision.a f233109T0;

    /* renamed from: T2, reason: collision with root package name */
    public r f233110T2;

    /* renamed from: U0, reason: collision with root package name */
    @Inject
    public InterfaceC33677a1 f233111U0;

    /* renamed from: U2, reason: collision with root package name */
    public C33745e f233112U2;

    /* renamed from: V0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.details.auction.d f233113V0;

    /* renamed from: V2, reason: collision with root package name */
    public C33781q f233114V2;

    /* renamed from: W0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.details.buyout.a f233115W0;

    /* renamed from: W2, reason: collision with root package name */
    public String f233116W2;

    /* renamed from: X0, reason: collision with root package name */
    @Inject
    public InterfaceC16992a f233117X0;

    /* renamed from: X1, reason: collision with root package name */
    @Y61.k
    public final Object f233118X1 = C42727D.b(LazyThreadSafetyMode.f406616d, new k());

    /* renamed from: X2, reason: collision with root package name */
    @Y61.l
    public InterfaceC33777o1 f233119X2;

    /* renamed from: Y0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.video_upload.s f233120Y0;

    /* renamed from: Z0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.file_uploader.t f233121Z0;

    /* renamed from: a1, reason: collision with root package name */
    @Inject
    public C33864h0 f233122a1;

    /* renamed from: b1, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f233123b1;

    /* renamed from: c1, reason: collision with root package name */
    @Inject
    public com.google.common.collect.H1 f233124c1;

    /* renamed from: d1, reason: collision with root package name */
    @Inject
    public D f233125d1;

    /* renamed from: e1, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.date_picker.b f233126e1;

    /* renamed from: f1, reason: collision with root package name */
    @Inject
    public InterfaceC33746e0 f233127f1;

    /* renamed from: g1, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.details.iac.e f233128g1;

    /* renamed from: h1, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.C0 f233129h1;

    /* renamed from: i1, reason: collision with root package name */
    @Inject
    public InterfaceC14698b f233130i1;

    /* renamed from: j1, reason: collision with root package name */
    @Inject
    public gj.n f233131j1;

    /* renamed from: k1, reason: collision with root package name */
    @Inject
    public com.avito.android.photo_permission.b f233132k1;

    /* renamed from: l1, reason: collision with root package name */
    @Inject
    public u3.l<SimpleTestGroupWithNone> f233133l1;

    /* renamed from: m1, reason: collision with root package name */
    @Inject
    public u3.l<SimpleTestGroupWithNone> f233134m1;

    /* renamed from: n1, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.photo_permission.a f233135n1;

    /* renamed from: o1, reason: collision with root package name */
    @Inject
    public com.avito.android.Q1 f233136o1;

    /* renamed from: p1, reason: collision with root package name */
    @Inject
    public com.avito.android.video_picker.e f233137p1;

    /* renamed from: q1, reason: collision with root package name */
    @Inject
    public com.avito.android.photo_list_view_groups.h f233138q1;

    /* renamed from: r1, reason: collision with root package name */
    @Inject
    public g80.d f233139r1;

    /* renamed from: s1, reason: collision with root package name */
    @Inject
    public C50213a f233140s1;

    /* renamed from: t1, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.slots.images_groups_recommendations.analytics.d f233141t1;

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/details/PublishDetailsFragment$a;", "", "<init>", "()V", "", "MAX_VIDEO_DURATION_SEC", "I", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @X41.n
        @Y61.k
        public static PublishDetailsFragment a(@Y61.k String str, boolean z12, @Y61.l ScreenTransfer screenTransfer, @Y61.l String str2) {
            PublishDetailsFragment publishDetailsFragment = new PublishDetailsFragment();
            Bundle bundle = new Bundle();
            bundle.putString("draft_id", str);
            bundle.putBoolean("key_is_editing", z12);
            bundle.putParcelable("SCREEN_TRANSFER_KEY", screenTransfer);
            bundle.putString("key_slot_with_step_config_id", str2);
            publishDetailsFragment.setArguments(bundle);
            return publishDetailsFragment;
        }

        public a() {
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "keyboardShown", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Boolean, kotlin.G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            InterfaceC33746e0 interfaceC33746e0 = PublishDetailsFragment.this.f233127f1;
            if (interfaceC33746e0 == null) {
                interfaceC33746e0 = null;
            }
            interfaceC33746e0.i(zBooleanValue);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/publish/details/k0$a;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/details/k0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<InterfaceC33764k0.a, kotlin.G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(InterfaceC33764k0.a aVar) {
            InterfaceC33764k0.a aVar2 = aVar;
            boolean z12 = aVar2.f234806c;
            PublishDetailsFragment publishDetailsFragment = PublishDetailsFragment.this;
            if (z12) {
                InterfaceC33746e0 interfaceC33746e0 = publishDetailsFragment.f233127f1;
                if (interfaceC33746e0 == null) {
                    interfaceC33746e0 = null;
                }
                interfaceC33746e0.d(aVar2.f234808e);
            } else {
                InterfaceC33746e0 interfaceC33746e02 = publishDetailsFragment.f233127f1;
                if (interfaceC33746e02 == null) {
                    interfaceC33746e02 = null;
                }
                interfaceC33746e02.e();
            }
            if (aVar2.f234805b) {
                C33745e c33745e = publishDetailsFragment.f233112U2;
                if (c33745e == null) {
                    c33745e = null;
                }
                c33745e.f();
            } else {
                C33745e c33745e2 = publishDetailsFragment.f233112U2;
                if (c33745e2 == null) {
                    c33745e2 = null;
                }
                c33745e2.o();
            }
            if (aVar2.f234807d) {
                C33745e c33745e3 = publishDetailsFragment.f233112U2;
                if (c33745e3 == null) {
                    c33745e3 = null;
                }
                c33745e3.m();
            } else {
                C33745e c33745e4 = publishDetailsFragment.f233112U2;
                if (c33745e4 == null) {
                    c33745e4 = null;
                }
                c33745e4.g();
            }
            String str = aVar2.f234804a;
            if (str != null) {
                C33745e c33745e5 = publishDetailsFragment.f233112U2;
                (c33745e5 != null ? c33745e5 : null).r(str);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends kotlin.jvm.internal.H implements Y41.l<SellerProtectionDialogResult, kotlin.G0> {
        @Override // Y41.l
        public final kotlin.G0 invoke(SellerProtectionDialogResult sellerProtectionDialogResult) {
            K1 k12 = (K1) this.receiver;
            Set<? extends com.avito.android.category_parameters.j<? extends Slot<?>>> set = k12.f232996s0;
            V1 v12 = new V1(0, k12, K1.class, "onMainButtonClicked", "onMainButtonClicked()V", 0);
            k12.f232984g0.b(sellerProtectionDialogResult, set, v12);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ K1.AbstractC33668b f233145m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(K1.AbstractC33668b abstractC33668b) {
            super(0);
            this.f233145m = abstractC33668b;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            K1 k12 = PublishDetailsFragment.this.f233086C0;
            if (k12 == null) {
                k12 = null;
            }
            K1.AbstractC33668b.C7076b c7076b = (K1.AbstractC33668b.C7076b) this.f233145m;
            k12.me(c7076b.f233018b, c7076b.f233019c, c7076b.f233020d, null);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f233146l = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke() {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final g f233147l = new g();

        public g() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke() {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final h f233148l = new h();

        public h() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke() {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.slots.address_from_profile.e f233150m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(com.avito.android.publish.slots.address_from_profile.e eVar) {
            super(0);
            this.f233150m = eVar;
        }

        @Override // Y41.a
        public final kotlin.G0 invoke() {
            com.avito.android.details.b bVar = PublishDetailsFragment.this.f135892n0;
            if (bVar == null) {
                bVar = null;
            }
            bVar.D4();
            this.f233150m.r();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0004"}, d2 = {"com/avito/android/publish/details/PublishDetailsFragment$j", "Li/a;", "Lcom/avito/android/photo_list_view_group_selection/PhotoItemGroupSelectionParams;", "Lcom/avito/android/photo_list_view_group_selection/PhotoItemGroupSelectionResult;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j extends AbstractC41201a<PhotoItemGroupSelectionParams, PhotoItemGroupSelectionResult> {
        public j() {
        }

        @Override // i.AbstractC41201a
        public final Intent createIntent(Context context, PhotoItemGroupSelectionParams photoItemGroupSelectionParams) {
            PhotoItemGroupSelectionParams photoItemGroupSelectionParams2 = photoItemGroupSelectionParams;
            com.avito.android.photo_list_view_group_selection.c cVar = PublishDetailsFragment.this.f233097L0;
            if (cVar == null) {
                cVar = null;
            }
            return cVar.a(photoItemGroupSelectionParams2);
        }

        @Override // i.AbstractC41201a
        public final PhotoItemGroupSelectionResult parseResult(int i12, Intent intent) {
            if (intent != null) {
                return (PhotoItemGroupSelectionResult) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("key_selection_result", PhotoItemGroupSelectionResult.class) : intent.getParcelableExtra("key_selection_result"));
            }
            return null;
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/photo_permission/a;", "invoke", "()Lcom/avito/android/photo_permission/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.photo_permission.a> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.photo_permission.a invoke() {
            PublishDetailsFragment publishDetailsFragment = PublishDetailsFragment.this;
            com.avito.android.photo_permission.b bVar = publishDetailsFragment.f233132k1;
            if (bVar == null) {
                bVar = null;
            }
            bVar.getClass();
            return new com.avito.android.photo_permission.d(publishDetailsFragment, publishDetailsFragment.getChildFragmentManager(), bVar.f218725a);
        }
    }

    /* compiled from: PublishDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/publish/details/PublishDetailsFragment$l", "Lcom/avito/android/photo_list_view/s$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l implements s.a {
        public l() {
        }

        @Override // com.avito.android.photo_list_view.s.a
        public final void P3(@Y61.k com.avito.android.photo_list_view.G g12) {
            PublishDetailsFragment publishDetailsFragment = PublishDetailsFragment.this;
            InterfaceC28373a interfaceC28373a = publishDetailsFragment.f233087D0;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            C50213a c50213a = publishDetailsFragment.f233140s1;
            interfaceC28373a.c(new Cd0.G0(c50213a != null ? c50213a : null));
        }
    }

    public PublishDetailsFragment() {
        final int i12 = 0;
        registerForActivityResult(new b.l(), new androidx.view.result.a(this) { // from class: com.avito.android.publish.details.w0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PublishDetailsFragment f235082c;

            {
                this.f235082c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                PublishDetailsFragment publishDetailsFragment = this.f235082c;
                switch (i12) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        PublishDetailsFragment.a aVar = PublishDetailsFragment.f233085Y2;
                        Intent intent = new Intent();
                        intent.setType("video/*");
                        intent.setAction("android.intent.action.PICK");
                        Intent intentCreateChooser = Intent.createChooser(intent, "");
                        if (zBooleanValue) {
                            Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                            intent2.putExtra("android.intent.extra.durationLimit", 180);
                            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent2});
                        }
                        PublishDetailsFragment publishDetailsFragment2 = this.f235082c;
                        com.avito.android.publish.view.result_handler.a aVar2 = publishDetailsFragment2.f245620B0;
                        (aVar2 != null ? aVar2 : null).c(publishDetailsFragment2.l1(), publishDetailsFragment2, intentCreateChooser, 8, false);
                        break;
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        PublishDetailsFragment.a aVar3 = PublishDetailsFragment.f233085Y2;
                        if (!zBooleanValue2) {
                            com.avito.android.video_picker.e eVar = publishDetailsFragment.f233137p1;
                            publishDetailsFragment.startActivity((eVar != null ? eVar : null).a());
                            break;
                        } else {
                            publishDetailsFragment.t1();
                            break;
                        }
                    default:
                        PhotoItemGroupSelectionResult photoItemGroupSelectionResult = (PhotoItemGroupSelectionResult) obj;
                        PublishDetailsFragment.a aVar4 = PublishDetailsFragment.f233085Y2;
                        if (photoItemGroupSelectionResult != null) {
                            String str = photoItemGroupSelectionResult.f218381c;
                            boolean z12 = photoItemGroupSelectionResult.f218382d;
                            String str2 = photoItemGroupSelectionResult.f218380b;
                            if (z12) {
                                com.avito.android.photo_list_view_groups.h hVar = publishDetailsFragment.f233138q1;
                                if (hVar == null) {
                                    hVar = null;
                                }
                                hVar.H9(str2, str);
                            } else {
                                com.avito.android.photo_list_view_groups.h hVar2 = publishDetailsFragment.f233138q1;
                                if (hVar2 == null) {
                                    hVar2 = null;
                                }
                                hVar2.Nd(str, Collections.singleton(str2));
                            }
                            g80.d dVar = publishDetailsFragment.f233139r1;
                            if (dVar == null) {
                                dVar = null;
                            }
                            dVar.c(z12 ? str2 : null, photoItemGroupSelectionResult.f218383e, photoItemGroupSelectionResult.f218384f);
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        this.f233093H2 = registerForActivityResult(new b.l(), new androidx.view.result.a(this) { // from class: com.avito.android.publish.details.w0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PublishDetailsFragment f235082c;

            {
                this.f235082c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                PublishDetailsFragment publishDetailsFragment = this.f235082c;
                switch (i13) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        PublishDetailsFragment.a aVar = PublishDetailsFragment.f233085Y2;
                        Intent intent = new Intent();
                        intent.setType("video/*");
                        intent.setAction("android.intent.action.PICK");
                        Intent intentCreateChooser = Intent.createChooser(intent, "");
                        if (zBooleanValue) {
                            Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                            intent2.putExtra("android.intent.extra.durationLimit", 180);
                            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent2});
                        }
                        PublishDetailsFragment publishDetailsFragment2 = this.f235082c;
                        com.avito.android.publish.view.result_handler.a aVar2 = publishDetailsFragment2.f245620B0;
                        (aVar2 != null ? aVar2 : null).c(publishDetailsFragment2.l1(), publishDetailsFragment2, intentCreateChooser, 8, false);
                        break;
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        PublishDetailsFragment.a aVar3 = PublishDetailsFragment.f233085Y2;
                        if (!zBooleanValue2) {
                            com.avito.android.video_picker.e eVar = publishDetailsFragment.f233137p1;
                            publishDetailsFragment.startActivity((eVar != null ? eVar : null).a());
                            break;
                        } else {
                            publishDetailsFragment.t1();
                            break;
                        }
                    default:
                        PhotoItemGroupSelectionResult photoItemGroupSelectionResult = (PhotoItemGroupSelectionResult) obj;
                        PublishDetailsFragment.a aVar4 = PublishDetailsFragment.f233085Y2;
                        if (photoItemGroupSelectionResult != null) {
                            String str = photoItemGroupSelectionResult.f218381c;
                            boolean z12 = photoItemGroupSelectionResult.f218382d;
                            String str2 = photoItemGroupSelectionResult.f218380b;
                            if (z12) {
                                com.avito.android.photo_list_view_groups.h hVar = publishDetailsFragment.f233138q1;
                                if (hVar == null) {
                                    hVar = null;
                                }
                                hVar.H9(str2, str);
                            } else {
                                com.avito.android.photo_list_view_groups.h hVar2 = publishDetailsFragment.f233138q1;
                                if (hVar2 == null) {
                                    hVar2 = null;
                                }
                                hVar2.Nd(str, Collections.singleton(str2));
                            }
                            g80.d dVar = publishDetailsFragment.f233139r1;
                            if (dVar == null) {
                                dVar = null;
                            }
                            dVar.c(z12 ? str2 : null, photoItemGroupSelectionResult.f218383e, photoItemGroupSelectionResult.f218384f);
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 2;
        this.f233102P2 = registerForActivityResult(new j(), new androidx.view.result.a(this) { // from class: com.avito.android.publish.details.w0

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ PublishDetailsFragment f235082c;

            {
                this.f235082c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                PublishDetailsFragment publishDetailsFragment = this.f235082c;
                switch (i14) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        PublishDetailsFragment.a aVar = PublishDetailsFragment.f233085Y2;
                        Intent intent = new Intent();
                        intent.setType("video/*");
                        intent.setAction("android.intent.action.PICK");
                        Intent intentCreateChooser = Intent.createChooser(intent, "");
                        if (zBooleanValue) {
                            Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                            intent2.putExtra("android.intent.extra.durationLimit", 180);
                            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent2});
                        }
                        PublishDetailsFragment publishDetailsFragment2 = this.f235082c;
                        com.avito.android.publish.view.result_handler.a aVar2 = publishDetailsFragment2.f245620B0;
                        (aVar2 != null ? aVar2 : null).c(publishDetailsFragment2.l1(), publishDetailsFragment2, intentCreateChooser, 8, false);
                        break;
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        PublishDetailsFragment.a aVar3 = PublishDetailsFragment.f233085Y2;
                        if (!zBooleanValue2) {
                            com.avito.android.video_picker.e eVar = publishDetailsFragment.f233137p1;
                            publishDetailsFragment.startActivity((eVar != null ? eVar : null).a());
                            break;
                        } else {
                            publishDetailsFragment.t1();
                            break;
                        }
                    default:
                        PhotoItemGroupSelectionResult photoItemGroupSelectionResult = (PhotoItemGroupSelectionResult) obj;
                        PublishDetailsFragment.a aVar4 = PublishDetailsFragment.f233085Y2;
                        if (photoItemGroupSelectionResult != null) {
                            String str = photoItemGroupSelectionResult.f218381c;
                            boolean z12 = photoItemGroupSelectionResult.f218382d;
                            String str2 = photoItemGroupSelectionResult.f218380b;
                            if (z12) {
                                com.avito.android.photo_list_view_groups.h hVar = publishDetailsFragment.f233138q1;
                                if (hVar == null) {
                                    hVar = null;
                                }
                                hVar.H9(str2, str);
                            } else {
                                com.avito.android.photo_list_view_groups.h hVar2 = publishDetailsFragment.f233138q1;
                                if (hVar2 == null) {
                                    hVar2 = null;
                                }
                                hVar2.Nd(str, Collections.singleton(str2));
                            }
                            g80.d dVar = publishDetailsFragment.f233139r1;
                            if (dVar == null) {
                                dVar = null;
                            }
                            dVar.c(z12 ? str2 : null, photoItemGroupSelectionResult.f218383e, photoItemGroupSelectionResult.f218384f);
                            break;
                        }
                        break;
                }
            }
        });
        this.f233104Q2 = new io.reactivex.rxjava3.disposables.c();
        this.f233106R2 = new io.reactivex.rxjava3.disposables.c();
    }

    public static final AddressParameter.Value t5(SxAddressAddResult.Success.PublishValue publishValue, PublishDetailsFragment publishDetailsFragment) {
        double lat = publishValue.getLat();
        double lng = publishValue.getLng();
        String text = publishValue.getText();
        String jwt = publishValue.getJwt();
        SxAddressAddResult.Success.AddressData data = publishValue.getData();
        AddressParameter.Value value = new AddressParameter.Value(lat, lng, text, jwt, data != null ? new AddressParameter.Value.PublishValueSellerAddressData(data.getHouse(), data.getId(), Boolean.valueOf(data.getIsDisabled()), data.getLocation(), data.getName()) : null);
        InterfaceC33535v interfaceC33535v = publishDetailsFragment.f233101P0;
        (interfaceC33535v != null ? interfaceC33535v : null).n0(AddressChoiceType.f232213e, value);
        return value;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.photo_list_view.x
    public final void A2(int i12, @Y61.l String str, @Y61.l String str2) {
        PhotoPickerIntentFactory.PhotoPickerMode modeAdd = str == null ? new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null) : new PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit(false, false, false, 7, null);
        u3.l<SimpleTestGroupWithNone> lVar = this.f233133l1;
        if (lVar == null) {
            lVar = null;
        }
        boolean zB2 = lVar.f439745a.f439749b.b();
        if (!zB2) {
            com.avito.android.publish.photo_permission.a aVar = this.f233135n1;
            if (aVar == null) {
                aVar = null;
            }
            aVar.a();
        }
        if (!modeAdd.equals(new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null)) || !zB2) {
            u5(str, modeAdd, str2);
            return;
        }
        PhotoPermissionDialogData.f218697c.getClass();
        PhotoPermissionDialogData photoPermissionDialogDataA = PhotoPermissionDialogData.a.a();
        ?? r112 = this.f233118X1;
        LinkedHashSet linkedHashSetB = ((com.avito.android.photo_permission.a) r112.getValue()).b(photoPermissionDialogDataA);
        if (linkedHashSetB.isEmpty()) {
            u5(null, new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null), null);
            return;
        }
        if (linkedHashSetB.size() != 1 || !linkedHashSetB.contains(PhotoPermission.Camera.f218689b)) {
            ((com.avito.android.photo_permission.a) r112.getValue()).a(photoPermissionDialogDataA);
            return;
        }
        com.avito.android.publish.photo_permission.a aVar2 = this.f233135n1;
        if (aVar2 == null) {
            aVar2 = null;
        }
        if (aVar2.b()) {
            ((com.avito.android.photo_permission.a) r112.getValue()).a(photoPermissionDialogDataA);
        } else {
            u5(null, new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null), null);
        }
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        return null;
    }

    @Override // com.avito.android.publish.details.D.a
    public final void C(@Y61.k Y41.l<? super InterfaceC33764k0.a, InterfaceC33764k0.a> lVar) {
        K1 k12 = this.f233086C0;
        if (k12 == null) {
            k12 = null;
        }
        k12.C(lVar);
    }

    @Override // com.avito.android.publish.details.D.a
    public final void C2(@Y61.l String str, @Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.k com.avito.android.category_parameters.h hVar) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        Theme.Companion companion = Theme.INSTANCE;
        com.avito.android.publish.C0 c02 = this.f233129h1;
        if (c02 == null) {
            c02 = null;
        }
        com.avito.android.lib.util.g.a(new com.avito.android.parameters_sheet.d(context, R.style.RedesignPublishParametersListDialog, str, list, hVar, companion.isAvitoRe23(c02.ve())));
    }

    @Override // com.avito.android.publish.details.D.a
    public final void D0() {
        com.avito.android.publish.C0 c02 = this.f233129h1;
        if (c02 == null) {
            c02 = null;
        }
        c02.ye();
    }

    @Override // com.avito.android.publish.details.auction.d.a
    public final void E0() {
        ((PublishActivity) requireActivity()).d2(null);
    }

    @Override // com.avito.android.publish.photo_picker.c
    public final void E2(@Y61.k String str) {
        u5(str, new PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit(false, false, false, 7, null), null);
    }

    @Override // com.avito.android.publish.details.D.a
    public final void F3(@Y61.k c.a aVar, @Y61.k ParameterElement.C29377e c29377e, @Y61.k Y41.l<? super Long, kotlin.G0> lVar) {
        com.avito.android.publish.date_picker.b bVar = this.f233126e1;
        if (bVar == null) {
            bVar = null;
        }
        bVar.d(requireContext(), aVar, c29377e, lVar);
    }

    @Override // com.avito.android.publish.iac_for_pro.d
    public final void G2(@Y61.k Y41.a<kotlin.G0> aVar) {
        com.avito.android.lib.util.g.a(new com.avito.android.publish.iac_for_pro.b(requireContext(), aVar));
    }

    @Override // com.avito.android.publish.photo_picker.c
    public final void I2(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.k List list, boolean z12) {
        this.f233102P2.b(new PhotoItemGroupSelectionParams(str, str2, str3, list, z12));
    }

    @Override // Id0.c
    public final int K1() {
        return R.layout.publish_details_actions;
    }

    @Override // com.avito.android.publish.view.a.b
    public final void K2(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle) {
        if (deepLink instanceof AuctionAddLink) {
            com.avito.android.publish.details.auction.d dVar = this.f233113V0;
            (dVar != null ? dVar : null).M7((AuctionAddLink) deepLink);
            return;
        }
        if (deepLink instanceof AddAutoToC2CTrxLink) {
            com.avito.android.publish.details.auction.d dVar2 = this.f233113V0;
            (dVar2 != null ? dVar2 : null).m7((AddAutoToC2CTrxLink) deepLink);
            return;
        }
        if (deepLink instanceof CollectPublishParamsLink) {
            com.avito.android.publish.details.buyout.a aVar = this.f233115W0;
            (aVar != null ? aVar : null).B6((CollectPublishParamsLink) deepLink);
        } else if (deepLink instanceof VerificationStartLink) {
            InterfaceC16992a interfaceC16992a = this.f233117X0;
            (interfaceC16992a != null ? interfaceC16992a : null).a((VerificationStartLink) deepLink);
        } else {
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f233088E0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            b.a.a(aVar2, deepLink, null, bundle, 2);
        }
    }

    @Override // com.avito.android.publish.view.i.a
    public final void L0() {
        AddressParameter.Value value;
        AddressParameter.Value value2;
        com.avito.android.publish.C0 c02 = this.f233129h1;
        Double dValueOf = null;
        if (c02 == null) {
            c02 = null;
        }
        CategoryParameters categoryParameters = c02.f231873k0;
        AddressParameter addressParameter = categoryParameters != null ? (AddressParameter) categoryParameters.getFirstParameterOfType(AddressParameter.class) : null;
        com.avito.android.publish.view.result_handler.a aVar = this.f245620B0;
        com.avito.android.publish.view.result_handler.a aVar2 = aVar != null ? aVar : null;
        ActivityC22955m activityC22955mL1 = l1();
        InterfaceC41184a interfaceC41184a = this.f233096K0;
        if (interfaceC41184a == null) {
            interfaceC41184a = null;
        }
        Double dValueOf2 = (addressParameter == null || (value2 = addressParameter.getValue()) == null) ? null : Double.valueOf(value2.getLat());
        if (addressParameter != null && (value = addressParameter.getValue()) != null) {
            dValueOf = Double.valueOf(value.getLng());
        }
        aVar2.c(activityC22955mL1, this, InterfaceC41184a.C11358a.a(interfaceC41184a, dValueOf2, dValueOf, 12), 6, false);
    }

    @Override // com.avito.android.publish.view.i.a
    public final void M2() {
        K2.e(this);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        arguments.getInt("step_index");
        InterfaceC33777o1 interfaceC33777o1 = this.f233119X2;
        if (interfaceC33777o1 != null) {
            interfaceC33777o1.F();
        }
    }

    @Override // com.avito.android.publish.details.D.a
    public final void M3(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.k Y41.a<kotlin.G0> aVar2, @Y61.k Y41.a<kotlin.G0> aVar3) {
        C33789t c33789t = this.f233108S2;
        if (c33789t == null) {
            c33789t = null;
        }
        c33789t.getClass();
        com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, c33789t.f234947g, new C33807z(aVar2, aVar3, str, str2, str3));
        c33789t.f234953m = aVarC;
        com.avito.android.lib.util.g.a(aVarC);
        kotlin.G0 g02 = kotlin.G0.f406611a;
        ((E.C3) aVar).invoke();
    }

    @Override // com.avito.android.publish.file_uploader.r
    public final void Q3(@Y61.k String[] strArr, boolean z12) {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z12);
        com.avito.android.publish.view.result_handler.a aVar = this.f245620B0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a(l1(), this, Intent.createChooser(intent, ""), 9);
    }

    @Override // com.avito.android.publish.details.D.a
    public final void T0(@Y61.k ParameterElement.C29377e c29377e, @Y61.k Y41.l<? super Long, kotlin.G0> lVar) {
        com.avito.android.publish.date_picker.b bVar = this.f233126e1;
        if (bVar == null) {
            bVar = null;
        }
        bVar.c(requireContext(), c29377e, lVar);
    }

    @Override // com.avito.android.publish.slots.check_verification.b
    public final void T4() {
        K1 k12 = this.f233086C0;
        if (k12 == null) {
            k12 = null;
        }
        k12.nb();
    }

    @Override // iN0.InterfaceC41321b
    public final void W(@Y61.k String str) {
        C43490a.a(requireContext(), new ToastBarState(com.avito.android.printable_text.b.f(str), null, null, null, null, null, null, 0, false, false, null, null, 4094, null), null, 28);
    }

    @Override // com.avito.android.publish.details.D.a
    public final void W4(@Y61.k String str) {
        String strSubstring = new URL(str).getPath().substring(1);
        InterfaceC30751h interfaceC30751h = this.f233095J0;
        if (interfaceC30751h == null) {
            interfaceC30751h = null;
        }
        startActivity(interfaceC30751h.a(strSubstring));
    }

    @Override // com.avito.android.publish.details.D.a
    public final void Y3() {
        C33789t c33789t = this.f233108S2;
        if (c33789t == null) {
            c33789t = null;
        }
        c33789t.j3(null);
    }

    @Override // com.avito.android.publish.details.D.a
    public final void Z0(@Y61.k c.a aVar, @Y61.k ParameterElement.C29377e c29377e, @Y61.k Y41.l<? super Long, kotlin.G0> lVar) {
        com.avito.android.publish.date_picker.b bVar = this.f233126e1;
        if (bVar == null) {
            bVar = null;
        }
        bVar.e(requireContext(), aVar, c29377e, lVar);
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return null;
    }

    @Override // com.avito.android.publish.details.D.a
    public final void c(@Y61.k Y41.l lVar, @Y61.k String str, @Y61.k String str2) {
        C33789t c33789t = this.f233108S2;
        if (c33789t == null) {
            c33789t = null;
        }
        c33789t.c(lVar, str2, str);
    }

    @Override // gj.i
    @Y61.k
    public final gj.o c1() {
        return new gj.o(new o.a(requireView(), ToastBarPosition.f181047e), new o.a(requireView(), ToastBarPosition.f181046d));
    }

    @Override // iN0.InterfaceC41321b
    public final void c2(@Y61.l Integer num) {
        InterfaceC33535v interfaceC33535v = this.f233101P0;
        if (interfaceC33535v == null) {
            interfaceC33535v = null;
        }
        com.avito.android.publish.C0 c02 = this.f233129h1;
        interfaceC33535v.g0(num, (c02 != null ? c02 : null).Be());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        C33864h0 c33864h0 = this.f233122a1;
        if (c33864h0 != null) {
            return c33864h0;
        }
        return null;
    }

    @Override // Id0.c
    public final void g2() {
        this.f233104Q2.e();
        InterfaceC33746e0 interfaceC33746e0 = this.f233127f1;
        if (interfaceC33746e0 == null) {
            interfaceC33746e0 = null;
        }
        interfaceC33746e0.e0();
    }

    @Override // com.avito.android.publish.iac_devices.c
    public final void h1() {
        com.avito.android.lib.util.g.a(new com.avito.android.publish.iac_devices.b(requireContext()));
    }

    @Override // com.avito.android.publish.details.D.a
    public final void h2(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k Y41.a<kotlin.G0> aVar) {
        C33789t c33789t = this.f233108S2;
        if (c33789t == null) {
            c33789t = null;
        }
        c33789t.r(str, str2, str3, str4, aVar);
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        K1 k12 = this.f233086C0;
        if (k12 == null) {
            k12 = null;
        }
        k12.k2(false);
        return true;
    }

    @Override // com.avito.android.publish.details.D.a
    public final void k4(@Y61.l com.avito.android.publish.slots.card_select.item.k kVar) {
        if (kVar != null) {
            K1 k12 = this.f233086C0;
            if (k12 == null) {
                k12 = null;
            }
            k12.D(kVar);
        }
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        return "main";
    }

    @Override // com.avito.android.publish.video_upload.j
    public final void m1() {
        com.avito.android.publish.C0 c02 = this.f233129h1;
        if (c02 == null) {
            c02 = null;
        }
        c02.we(SlotType.DELIVERY_TOGGLES);
    }

    @Override // com.avito.android.publish.slots.sleeping_places.c
    public final void m4(@Y61.k C49325f c49325f) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        final Y41.l<Integer, kotlin.G0> lVar = c49325f.f440928e;
        childFragmentManager.p0("selected_bed_type_bed_result", viewLifecycleOwner, new androidx.fragment.app.C() { // from class: com.avito.android.publish.details.t0
            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle, String str) {
                PublishDetailsFragment.a aVar = PublishDetailsFragment.f233085Y2;
                lVar.invoke(Integer.valueOf(bundle.getInt("selected_bed_type_bed_id_key")));
            }
        });
        SleepingPlacesBedTypesDialog.a aVar = SleepingPlacesBedTypesDialog.f244929m0;
        com.avito.android.Q1 q12 = this.f233136o1;
        if (q12 == null) {
            q12 = null;
        }
        q12.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.Q1.f67448x0[83];
        boolean zBooleanValue = ((Boolean) q12.f67507q0.a().invoke()).booleanValue();
        aVar.getClass();
        SleepingPlacesBedTypesDialog.a.a(c49325f.f440927d, c49325f.f440925b, c49325f.f440926c, c49325f.f440924a, zBooleanValue).show(getChildFragmentManager(), "SleepingPlacesBedTypesBottomSheetDialog");
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        Theme.Companion companion = Theme.INSTANCE;
        com.avito.android.publish.C0 c02 = this.f233129h1;
        if (c02 == null) {
            c02 = null;
        }
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(companion.isAvitoRe23(c02.ve()) ? R.style.RedesignPublishTheme : R.style.DefaultPublishTheme));
    }

    @Override // com.avito.android.publish.details.D.a
    public final void o(@Y61.k String str) {
        InterfaceC33777o1 interfaceC33777o1 = this.f233119X2;
        if (interfaceC33777o1 != null) {
            interfaceC33777o1.o(str);
        }
    }

    @Override // com.avito.android.photo_permission.a.InterfaceC6567a
    public final void o3(@Y61.k PhotoPermissionResult photoPermissionResult) {
        if (photoPermissionResult instanceof PhotoPermissionResult.Allow) {
            u5(null, new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null), null);
        } else {
            boolean z12 = photoPermissionResult instanceof PhotoPermissionResult.Disallow;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        this.f233119X2 = (InterfaceC33777o1) context;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.publish.details.auction.d dVar = this.f233113V0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.b3(this);
        InterfaceC33746e0 interfaceC33746e0 = this.f233127f1;
        if (interfaceC33746e0 == null) {
            interfaceC33746e0 = null;
        }
        com.avito.android.publish.details.auction.d dVar2 = this.f233113V0;
        if (dVar2 == null) {
            dVar2 = null;
        }
        interfaceC33746e0.f(dVar2);
        com.avito.android.publish.analytics.E e12 = this.f233100O0;
        if (e12 == null) {
            e12 = null;
        }
        e12.b();
        InterfaceC36014j interfaceC36014j = this.f233092H1;
        if (interfaceC36014j == null) {
            interfaceC36014j = null;
        }
        interfaceC36014j.e(requireContext());
        SellerProtectionBottomSheet.a aVar = SellerProtectionBottomSheet.f234925h0;
        K1 k12 = this.f233086C0;
        d dVar3 = new d(1, k12 != null ? k12 : null, K1.class, "onSellerProtectionDialogResult", "onSellerProtectionDialogResult(Lcom/avito/android/publish/details/seller_protection/SellerProtectionDialogResult;)V", 0);
        aVar.getClass();
        getChildFragmentManager().p0("seller_protection_request_key", this, new com.avito.android.publish.details.seller_protection.b(dVar3));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        Pd0.v vVar = this.f233105R0;
        if (vVar == null) {
            vVar = null;
        }
        vVar.e();
        return layoutInflater.inflate(R.layout.publish_details, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        com.avito.android.publish.details.auction.d dVar = this.f233113V0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.c0();
        com.avito.android.publish.analytics.E e12 = this.f233100O0;
        if (e12 == null) {
            e12 = null;
        }
        e12.a();
        com.avito.android.publish.details.iac.e eVar = this.f233128g1;
        if (eVar == null) {
            eVar = null;
        }
        eVar.dismiss();
        InterfaceC36014j interfaceC36014j = this.f233092H1;
        (interfaceC36014j != null ? interfaceC36014j : null).d();
        super.onDestroy();
    }

    @Override // com.avito.android.details.SelectItemBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        InterfaceC14698b interfaceC14698b = this.f233130i1;
        if (interfaceC14698b == null) {
            interfaceC14698b = null;
        }
        interfaceC14698b.destroy();
        com.avito.android.publish.details.computer_vision.a aVar = this.f233109T0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.c();
        com.google.common.collect.H1 h12 = this.f233124c1;
        Iterator<E> it = (h12 != null ? h12 : null).iterator();
        while (it.hasNext()) {
            ((w2) it.next()).e0();
        }
        this.f233106R2.e();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f233119X2 = null;
        super.onDetach();
    }

    @Override // com.avito.android.publish.view.ItemDetailsBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC16992a interfaceC16992a = this.f233117X0;
        if (interfaceC16992a == null) {
            interfaceC16992a = null;
        }
        interfaceC16992a.onResume();
        K1 k12 = this.f233086C0;
        K1 k13 = k12 != null ? k12 : null;
        com.avito.android.publish.C0 c02 = k13.f232960E;
        boolean z12 = c02.f231883u0;
        c02.f231883u0 = false;
        if (z12) {
            k13.e7();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        D d12 = this.f233125d1;
        if (d12 == null) {
            d12 = null;
        }
        d12.A(this);
    }

    @Override // com.avito.android.publish.view.ItemDetailsBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        D d12 = this.f233125d1;
        if (d12 == null) {
            d12 = null;
        }
        d12.c0();
        super.onStop();
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.publish.view.ItemDetailsBaseFragment, com.avito.android.details.SelectItemBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view;
        Provider provider = new Provider() { // from class: com.avito.android.publish.details.u0
            @Override // javax.inject.Provider
            public final Object get() {
                C33781q c33781q = this.f235037a.f233114V2;
                if (c33781q == null) {
                    return null;
                }
                return c33781q;
            }
        };
        K1 k12 = this.f233086C0;
        K1 k13 = k12 != null ? k12 : null;
        InterfaceC28373a interfaceC28373a = this.f233087D0;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        RecyclerView.Adapter<?> adapter = this.f233098M0;
        RecyclerView.Adapter<?> adapter2 = adapter != null ? adapter : null;
        com.avito.android.recycler.data_aware.c cVar = this.f233099N0;
        com.avito.android.recycler.data_aware.c cVar2 = cVar != null ? cVar : null;
        com.avito.android.lib.deprecated_design.dialog.a aVar = this.f233103Q0;
        com.avito.android.lib.deprecated_design.dialog.a aVar2 = aVar != null ? aVar : null;
        com.avito.android.publish.C0 c02 = this.f233129h1;
        if (c02 == null) {
            c02 = null;
        }
        Boolean boolQe = c02.qe();
        com.avito.android.publish.C0 c03 = this.f233129h1;
        if (c03 == null) {
            c03 = null;
        }
        boolean zMe = c03.me();
        com.avito.android.publish.slots.images_groups_recommendations.analytics.d dVar = this.f233141t1;
        this.f233108S2 = new C33789t(viewGroup, provider, k13, interfaceC28373a2, 150L, adapter2, cVar2, aVar2, boolQe, zMe, dVar != null ? dVar : null, null);
        this.f233110T2 = new r(view);
        D d12 = this.f233125d1;
        if (d12 == null) {
            d12 = null;
        }
        Set<TV0.d<?, ?>> set = this.f233123b1;
        if (set == null) {
            set = null;
        }
        d12.a(set);
        K1 k14 = this.f233086C0;
        if (k14 == null) {
            k14 = null;
        }
        com.avito.android.util.architecture_components.z.a(new C35747a(k14.f232997t0, k14.f232968Q.a(), k14.f232964M.getF234900d(), k14.f232969R.f239059P), getViewLifecycleOwner(), new C33796v0(this));
        K1 k15 = this.f233086C0;
        if (k15 == null) {
            k15 = null;
        }
        Set<TV0.d<?, ?>> set2 = this.f233123b1;
        if (set2 == null) {
            set2 = null;
        }
        k15.f232966O.i(set2);
        com.google.common.collect.H1<w2> h12 = this.f233124c1;
        if (h12 == null) {
            h12 = null;
        }
        for (w2 w2Var : h12) {
            C33789t c33789t = this.f233108S2;
            if (c33789t == null) {
                c33789t = null;
            }
            w2Var.p2(c33789t);
        }
        Pd0.v vVar = this.f233105R0;
        if (vVar == null) {
            vVar = null;
        }
        vVar.d();
        gj.n nVar = this.f233131j1;
        if (nVar == null) {
            nVar = null;
        }
        gj.k kVarA = gj.m.a(nVar, this);
        K1 k16 = this.f233086C0;
        if (k16 == null) {
            k16 = null;
        }
        ((com.avito.android.beduin.view.c) kVarA).l(k16.f232982e0);
        ((com.avito.android.photo_permission.a) this.f233118X1.getValue()).c(this);
        com.avito.android.deeplink_handler.handler.composite.a aVar3 = this.f233088E0;
        if (aVar3 == null) {
            aVar3 = null;
        }
        io.reactivex.rxjava3.internal.operators.observable.I0 i0J0 = aVar3.d9().N(C33805y0.f235090b).j0(io.reactivex.rxjava3.android.schedulers.b.b());
        C33808z0 c33808z0 = new C33808z0(this);
        l41.g<? super Throwable> gVar = A0.f232616b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = i0J0.v0(c33808z0, gVar, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar3 = this.f233106R2;
        cVar3.b(dVarV0);
        com.avito.android.deeplink_handler.handler.composite.a aVar4 = this.f233088E0;
        if (aVar4 == null) {
            aVar4 = null;
        }
        cVar3.b(aVar4.d9().N(G0.f232934b).j0(io.reactivex.rxjava3.android.schedulers.b.b()).v0(new H0(this), I0.f232947b, interfaceC43543a));
        com.avito.android.deeplink_handler.handler.composite.a aVar5 = this.f233088E0;
        if (aVar5 == null) {
            aVar5 = null;
        }
        C43175k.K(new C43197r1(new F0(this, null), new E0(new D0(C40482a.b(aVar5)))), C22981N.a(getLifecycle()));
        com.avito.android.deeplink_handler.handler.composite.a aVar6 = this.f233088E0;
        if (aVar6 == null) {
            aVar6 = null;
        }
        cVar3.b(aVar6.d9().N(J0.f232954b).t0(new K0(this)));
        com.avito.android.deeplink_handler.handler.composite.a aVar7 = this.f233088E0;
        if (aVar7 == null) {
            aVar7 = null;
        }
        cVar3.b(aVar7.d9().N(B0.f232623b).t0(new C0(this)));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) throws NotFoundException {
        ScreenTransfer screenTransfer;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("draft_id") : null;
        if (string == null) {
            throw new NotFoundException("draft_id", (Throwable) null, 2, (C42822w) null);
        }
        this.f233116W2 = string;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("key_slot_with_step_config_id") : null;
        Bundle arguments3 = getArguments();
        if (arguments3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i12 = arguments3.getInt("step_index");
        Bundle arguments4 = getArguments();
        boolean z12 = arguments4 != null ? arguments4.getBoolean("key_is_editing") : false;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        String str = this.f233116W2;
        if (str == null) {
            str = null;
        }
        C33921d c33921d = new C33921d(str, this, new l());
        C33735p c33735p = new C33735p(z12, com.avito.android.analytics.screens.s.c(this));
        InterfaceC33739u.a aVarA = C33697f.a();
        aVarA.g((InterfaceC33742x) C29972i.a(C29972i.b(this), InterfaceC33742x.class));
        aVarA.a(cv.c.b(this));
        aVarA.i(c33921d);
        aVarA.b(getResources());
        aVarA.h();
        aVarA.d(i12);
        aVarA.k(string2);
        aVarA.f(z12);
        aVarA.e(this);
        aVarA.j(c33735p);
        aVarA.build().a(this);
        Pd0.v vVar = this.f233105R0;
        if (vVar == null) {
            vVar = null;
        }
        vVar.a(fA2.b());
        Pd0.v vVar2 = this.f233105R0;
        if (vVar2 == null) {
            vVar2 = null;
        }
        vVar2.u(g5(), this);
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (screenTransfer = (ScreenTransfer) arguments5.getParcelable("SCREEN_TRANSFER_KEY")) == null) {
            return;
        }
        Pd0.v vVar3 = this.f233105R0;
        (vVar3 != null ? vVar3 : null).b(screenTransfer, z12 ? EditParametersScreen.f90347d : PublishParametersScreen.f90455d, com.avito.android.analytics.screens.s.c(this));
    }

    @Override // com.avito.android.publish.details.D.a
    public final void q1() {
        C33789t c33789t = this.f233108S2;
        if (c33789t == null) {
            c33789t = null;
        }
        c33789t.q1();
    }

    @Override // com.avito.android.publish.slots.delivery_addresses.h
    public final void r(@Y61.k com.avito.android.publish.slots.delivery_addresses.c cVar, @Y61.k com.avito.android.publish.slots.delivery_addresses.item.c cVar2) {
        com.avito.android.publish.slots.delivery_addresses.g gVar = new com.avito.android.publish.slots.delivery_addresses.g(requireContext(), cVar2);
        cVar.a(gVar);
        com.avito.android.lib.util.g.a(gVar);
    }

    @Override // com.avito.android.publish.details.D.a
    public final void r2(@Y61.k Confetti confetti) {
        C33789t c33789t = this.f233108S2;
        if (c33789t == null) {
            c33789t = null;
        }
        new com.avito.android.publish.slots.item_info.c(c33789t.f234941a).b(new c.a(confetti.getDelay(), confetti.getCount(), confetti.getRadius(), confetti.getDuration()));
    }

    @Override // com.avito.android.publish.details.D.a
    public final void r4(int i12) {
        PublishIntentFactory publishIntentFactory = this.f245622t0;
        if (publishIntentFactory == null) {
            publishIntentFactory = null;
        }
        startActivity(publishIntentFactory.f(i12));
    }

    @Override // com.avito.android.publish.view.ItemDetailsBaseFragment
    public final void s5(int i12, int i13, @Y61.l Intent intent) {
        Bundle extras;
        SelectParameter.Value value;
        Uri data;
        Uri data2;
        List<Uri> listA;
        if (i13 == -1) {
            Object obj = null;
            if (i12 == 2) {
                com.avito.android.photo_list_view.s sVar = this.f233089F0;
                (sVar != null ? sVar : null).l(true);
            }
            switch (i12) {
                case 5:
                    K1 k12 = this.f233086C0;
                    (k12 != null ? k12 : null).nb();
                    break;
                case 6:
                    if (intent != null && (extras = intent.getExtras()) != null && (value = (SelectParameter.Value) extras.getParcelable("extra_value")) != null) {
                        K1 k13 = this.f233086C0;
                        if (k13 == null) {
                            k13 = null;
                        }
                        Iterator<T> it = k13.f232996s0.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (((com.avito.android.category_parameters.j) next).g() instanceof ResidentialComplexSlot) {
                                    obj = next;
                                }
                            }
                        }
                        com.avito.android.category_parameters.j jVar = (com.avito.android.category_parameters.j) obj;
                        if (jVar != null) {
                            com.avito.android.publish.slots.r rVar = (com.avito.android.publish.slots.r) jVar;
                            rVar.j(value);
                            k13.V8(((ResidentialComplexSlotConfig) rVar.f244730b.getWidget().getConfig()).getDevelopment().getId());
                            break;
                        }
                    }
                    break;
                case 7:
                    K1 k14 = this.f233086C0;
                    K1 k15 = k14 != null ? k14 : null;
                    k15.f232997t0.setValue(new K1.AbstractC33668b.g(k15.f232974W.a()));
                    break;
                case 8:
                    if (intent != null && (data = intent.getData()) != null) {
                        com.avito.android.publish.video_upload.s sVar2 = this.f233120Y0;
                        if (sVar2 == null) {
                            sVar2 = null;
                        }
                        com.avito.android.publish.C0 c02 = this.f233129h1;
                        sVar2.me((c02 != null ? c02 : null).Be(), data);
                        break;
                    }
                    break;
                case 9:
                    ArrayList arrayList = new ArrayList();
                    if (intent != null && (listA = C35974x2.a(intent)) != null) {
                        arrayList.addAll(listA);
                    }
                    if (arrayList.isEmpty() && intent != null && (data2 = intent.getData()) != null) {
                        arrayList.add(data2);
                    }
                    com.avito.android.publish.file_uploader.t tVar = this.f233121Z0;
                    (tVar != null ? tVar : null).oe(arrayList);
                    break;
            }
        }
    }

    @Override // com.avito.android.publish.iac_devices.c
    public final void t(@Y61.k List<IacDevice> list, boolean z12, @Y61.k Y41.l<? super List<IacDevice>, kotlin.G0> lVar) {
        u3.l<SimpleTestGroupWithNone> lVar2 = this.f233134m1;
        if (lVar2 == null) {
            lVar2 = null;
        }
        if (lVar2.f439745a.f439749b.b()) {
            com.avito.android.lib.util.g.a(new com.avito.android.publish.iac_devices.j(requireContext(), z12, list, lVar));
        } else {
            com.avito.android.lib.util.g.a(new com.avito.android.publish.iac_devices.h(requireContext(), z12, list, lVar));
        }
    }

    @Override // gj.i
    public final void t0() {
        i0();
    }

    @Override // com.avito.android.publish.video_upload.j
    public final void t1() {
        if (androidx.core.content.d.checkSelfPermission(requireContext(), "android.permission.CAMERA") == -1) {
            this.f233093H2.b("android.permission.CAMERA");
            return;
        }
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        intent.putExtra("android.intent.extra.durationLimit", 180);
        com.avito.android.publish.view.result_handler.a aVar = this.f245620B0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.c(l1(), this, intent, 8, false);
    }

    @Override // Id0.c
    public final void t2(@Y61.k View view) {
        r rVar = this.f233110T2;
        if (rVar == null) {
            rVar = null;
        }
        K1 k12 = this.f233086C0;
        if (k12 == null) {
            k12 = null;
        }
        C33757i c33757i = new C33757i(view, rVar, k12);
        r rVar2 = this.f233110T2;
        if (rVar2 == null) {
            rVar2 = null;
        }
        K1 k13 = this.f233086C0;
        if (k13 == null) {
            k13 = null;
        }
        C33745e c33745e = new C33745e(c33757i, new C33775o(view, rVar2, k13));
        this.f233112U2 = c33745e;
        InterfaceC33746e0 interfaceC33746e0 = this.f233127f1;
        if (interfaceC33746e0 == null) {
            interfaceC33746e0 = null;
        }
        C33789t c33789t = this.f233108S2;
        if (c33789t == null) {
            c33789t = null;
        }
        interfaceC33746e0.a(c33789t, c33745e);
        H2 h2A = K2.a(requireActivity(), new b());
        io.reactivex.rxjava3.disposables.c cVar = this.f233104Q2;
        cVar.b(h2A);
        r rVar3 = this.f233110T2;
        if (rVar3 == null) {
            rVar3 = null;
        }
        C33766l c33766l = new C33766l(view, rVar3);
        cVar.b(c33766l.f234822c.t0(new L0(this)));
        cVar.b(c33766l.f234823d.t0(new M0(this)));
        HtmlEditorViewModel htmlEditorViewModel = this.f233107S0;
        if (htmlEditorViewModel == null) {
            htmlEditorViewModel = null;
        }
        htmlEditorViewModel.getF106309P().observe(getViewLifecycleOwner(), new Q0.a(new N0(c33766l)));
        HtmlEditorViewModel htmlEditorViewModel2 = this.f233107S0;
        if (htmlEditorViewModel2 == null) {
            htmlEditorViewModel2 = null;
        }
        htmlEditorViewModel2.getF106310Q().observe(getViewLifecycleOwner(), new Q0.a(new O0(c33766l)));
        HtmlEditorViewModel htmlEditorViewModel3 = this.f233107S0;
        if (htmlEditorViewModel3 == null) {
            htmlEditorViewModel3 = null;
        }
        htmlEditorViewModel3.getF106311R().observe(getViewLifecycleOwner(), new Q0.a(new P0(c33766l)));
        View viewRequireView = requireView();
        C33745e c33745e2 = this.f233112U2;
        if (c33745e2 == null) {
            c33745e2 = null;
        }
        this.f233114V2 = new C33781q(viewRequireView, c33745e2, c33766l);
        K1 k14 = this.f233086C0;
        if (k14 == null) {
            k14 = null;
        }
        C23038g0<InterfaceC33764k0.a> c23038g0 = k14.f232989l0.f234824b;
        if (c23038g0.hasObservers()) {
            com.avito.android.Q1 q12 = this.f233136o1;
            if (q12 == null) {
                q12 = null;
            }
            q12.getClass();
            kotlin.reflect.n<Object> nVar = com.avito.android.Q1.f67448x0[50];
            if (((Boolean) q12.f67472X.a().invoke()).booleanValue()) {
                c23038g0.removeObservers(getViewLifecycleOwner());
            }
        }
        c23038g0.observe(getViewLifecycleOwner(), new Q0.a(new c()));
        InterfaceC16992a interfaceC16992a = this.f233117X0;
        if (interfaceC16992a == null) {
            interfaceC16992a = null;
        }
        if (interfaceC16992a.b()) {
            com.avito.android.Q1 q13 = this.f233136o1;
            com.avito.android.Q1 q14 = q13 != null ? q13 : null;
            q14.getClass();
            kotlin.reflect.n<Object> nVar2 = com.avito.android.Q1.f67448x0[51];
            if (((Boolean) q14.f67473Y.a().invoke()).booleanValue()) {
                D6.w(view);
            }
        }
    }

    @Override // com.avito.android.publish.details.D.a
    public final void u2(@Y61.k String str) {
        InterfaceC35845m2 interfaceC35845m2 = this.f245626x0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        startActivity(interfaceC35845m2.t(Uri.parse(str)));
    }

    public final void u5(String str, PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode, String str2) {
        InterfaceC33535v interfaceC33535v = this.f233101P0;
        if (interfaceC33535v == null) {
            interfaceC33535v = null;
        }
        interfaceC33535v.s0(str2);
        com.avito.android.publish.details.computer_vision.a aVar = this.f233109T0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.b();
        PhotoPickerIntentFactory photoPickerIntentFactory = this.f233090G0;
        PhotoPickerIntentFactory photoPickerIntentFactory2 = photoPickerIntentFactory != null ? photoPickerIntentFactory : null;
        Context contextRequireContext = requireContext();
        String str3 = this.f233116W2;
        String str4 = str3 == null ? null : str3;
        com.avito.android.photo_list_view.s sVar = this.f233089F0;
        if (sVar == null) {
            sVar = null;
        }
        int f218336k = sVar.getF218336k();
        u3.l<SimpleTestGroupWithNone> lVar = this.f233134m1;
        if (lVar == null) {
            lVar = null;
        }
        Intent intentA = PhotoPickerIntentFactory.a.a(photoPickerIntentFactory2, contextRequireContext, str4, "publish", 0, f218336k, str, null, photoPickerMode, lVar.f439745a.f439749b.b(), 72);
        com.avito.android.publish.view.result_handler.a aVar2 = this.f245620B0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        aVar2.c(l1(), this, intentA, 2, false);
    }

    @Override // com.avito.android.publish.video_upload.j
    public final void v2(@Y61.k ParameterElement.J j12) {
        VideoUploadLimits videoUploadLimits = new VideoUploadLimits(j12.f117343j, j12.f117344k, j12.f117345l);
        com.avito.android.video_picker.e eVar = this.f233137p1;
        if (eVar == null) {
            eVar = null;
        }
        Intent intentB = eVar.b(videoUploadLimits);
        com.avito.android.publish.view.result_handler.a aVar = this.f245620B0;
        (aVar != null ? aVar : null).c(l1(), this, intentB, 8, false);
    }

    @Override // com.avito.android.publish.slots.address_from_profile.f
    public final void w3(@Y61.k AddressParameter.SellerAddresses.DeleteAddressSheet deleteAddressSheet) {
        com.avito.android.publish.slots.address_from_profile.e eVar = new com.avito.android.publish.slots.address_from_profile.e(requireContext());
        eVar.V(deleteAddressSheet, new i(eVar));
        com.avito.android.lib.util.g.a(eVar);
    }
}
