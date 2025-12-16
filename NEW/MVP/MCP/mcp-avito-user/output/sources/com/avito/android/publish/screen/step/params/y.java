package com.avito.android.publish.screen.step.params;

import Ie0.InterfaceC14065a;
import Xd0.InterfaceC16992a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.FragmentManager;
import androidx.view.InterfaceC22983P;
import androidx.view.result.ActivityResult;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.blueprints.publish.date_interval.c;
import com.avito.android.c2c_trx.deepLinks.AddAutoToC2CTrxLink;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.AuctionAddLink;
import com.avito.android.deep_linking.links.CollectPublishParamsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.VerificationStartLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.lib.design.modal.a;
import com.avito.android.photo_list_view_group_selection.PhotoItemGroupSelectionParams;
import com.avito.android.photo_list_view_group_selection.PhotoItemGroupSelectionResult;
import com.avito.android.photo_permission.PhotoPermission;
import com.avito.android.photo_permission.PhotoPermissionDialogData;
import com.avito.android.photo_permission.PhotoPermissionResult;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishActivity;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.InterfaceC33764k0;
import com.avito.android.publish.details.InterfaceC33777o1;
import com.avito.android.publish.iac_devices.IacDevice;
import com.avito.android.publish.screen.step.params.PublishDetailsFragment;
import com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.SleepingPlacesBedTypesDialog;
import com.avito.android.publish.view.i;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.item_info.Confetti;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.select.Arguments;
import com.avito.android.select.auto_early_access_select.AutoEarlyAccessSelectParams;
import com.avito.android.util.C35974x2;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.K2;
import com.avito.android.video_picker.VideoUploadLimits;
import hx.InterfaceC41184a;
import i.b;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import vf0.C49325f;

/* compiled from: PublishDetailsInternalRouter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/screen/step/params/y;", "Lcom/avito/android/publish/screen/step/params/v;", "Lcom/avito/android/publish/view/i$a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class y implements v, i.a {

    /* renamed from: A, reason: collision with root package name */
    @Inject
    public com.avito.android.photo_permission.b f241662A;

    /* renamed from: B, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.photo_permission.a f241663B;

    /* renamed from: C, reason: collision with root package name */
    @Inject
    public com.avito.android.video_picker.e f241664C;

    /* renamed from: D, reason: collision with root package name */
    @Inject
    public u3.l<SimpleTestGroupWithNone> f241665D;

    /* renamed from: E, reason: collision with root package name */
    @Inject
    public u3.l<SimpleTestGroupWithNone> f241666E;

    /* renamed from: F, reason: collision with root package name */
    @Inject
    public Q1 f241667F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public Dialog f241668G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final Object f241669H = C42727D.b(LazyThreadSafetyMode.f406616d, new A(this));

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<PhotoItemGroupSelectionParams> f241670I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f241671J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f241672K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Intent> f241673L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Intent> f241674M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Intent> f241675N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Intent> f241676O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Intent> f241677P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<Intent> f241678Q;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PublishDetailsFragment f241679b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33777o1 f241680c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f241681d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC14065a, G0> f241682e;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public com.avito.android.photo_list_view.s f241683f;

    /* renamed from: g, reason: collision with root package name */
    @Inject
    public InterfaceC33535v f241684g;

    /* renamed from: h, reason: collision with root package name */
    @Inject
    public C0 f241685h;

    /* renamed from: i, reason: collision with root package name */
    @Inject
    public InterfaceC30751h f241686i;

    /* renamed from: j, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f241687j;

    /* renamed from: k, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.details.computer_vision.a f241688k;

    /* renamed from: l, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.date_picker.b f241689l;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.deprecated_design.dialog.a f241690m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.details.auction.d f241691n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.photo_list_view_groups.h f241692o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public g80.d f241693p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public InterfaceC16992a f241694q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.details.buyout.a f241695r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.details.iac.e f241696s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public com.avito.android.phone_reverification_info.d f241697t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public com.avito.android.phone_confirmation.P f241698u;

    /* renamed from: v, reason: collision with root package name */
    @Inject
    public InterfaceC41184a f241699v;

    /* renamed from: w, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.video_upload.s f241700w;

    /* renamed from: x, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.file_uploader.t f241701x;

    /* renamed from: y, reason: collision with root package name */
    @Inject
    public com.avito.android.photo_list_view_group_selection.c f241702y;

    /* renamed from: z, reason: collision with root package name */
    @Inject
    public PhotoPickerIntentFactory f241703z;

    /* compiled from: PublishDetailsInternalRouter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.slots.address_from_profile.e f241705m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.publish.slots.address_from_profile.e eVar) {
            super(0);
            this.f241705m = eVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.avito.android.details.b bVar = y.this.f241679b.f135892n0;
            if (bVar == null) {
                bVar = null;
            }
            bVar.D4();
            this.f241705m.r();
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsInternalRouter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Dialog dialog = y.this.f241668G;
            if (dialog != null) {
                dialog.dismiss();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsInternalRouter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f241708m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.a<G0> aVar) {
            super(0);
            this.f241708m = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            Dialog dialog = y.this.f241668G;
            if (dialog != null) {
                dialog.dismiss();
            }
            this.f241708m.invoke();
            return G0.f406611a;
        }
    }

    /* compiled from: PublishDetailsInternalRouter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.p<a.b, DialogInterface, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f241709l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f241710m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f241711n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f241712o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f241713p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar, Y41.a aVar2, String str, String str2, String str3) {
            super(2);
            this.f241709l = str;
            this.f241710m = str2;
            this.f241711n = str3;
            this.f241712o = aVar;
            this.f241713p = aVar2;
        }

        @Override // Y41.p
        public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
            a.b bVar2 = bVar;
            DialogInterface dialogInterface2 = dialogInterface;
            bVar2.setTitle(this.f241709l);
            bVar2.setSubtitle(this.f241710m);
            bVar2.L3(this.f241711n, new B(this.f241712o, dialogInterface2));
            Y41.a<G0> aVar = this.f241713p;
            bVar2.P3(new C(aVar));
            bVar2.H3(new D(aVar, dialogInterface2));
            return G0.f406611a;
        }
    }

    public y(@Y61.k PublishDetailsFragment publishDetailsFragment, @Y61.k InterfaceC33777o1 interfaceC33777o1, @Y61.k String str, int i12, @Y61.k Y41.l lVar) {
        this.f241679b = publishDetailsFragment;
        this.f241680c = interfaceC33777o1;
        this.f241681d = str;
        this.f241682e = lVar;
        final int i13 = 2;
        this.f241670I = publishDetailsFragment.registerForActivityResult(new z(this), new androidx.view.result.a(this) { // from class: com.avito.android.publish.screen.step.params.x

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f241661c;

            {
                this.f241661c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                Bundle extras;
                Intent intent;
                Uri data;
                List<Uri> listA;
                Uri data2;
                switch (i13) {
                    case 0:
                        Intent intent2 = ((ActivityResult) obj).f21243c;
                        if (intent2 != null && (extras = intent2.getExtras()) != null) {
                            SelectParameter.Value value = (SelectParameter.Value) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) extras.getParcelable("extra_value", SelectParameter.Value.class) : extras.getParcelable("extra_value"));
                            if (value != null) {
                                ((PublishDetailsFragment.i) this.f241661c.f241682e).invoke(new InterfaceC14065a.b.d(value));
                                break;
                            }
                        }
                        break;
                    case 1:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.b.C0470a.f8231a);
                        break;
                    case 2:
                        PhotoItemGroupSelectionResult photoItemGroupSelectionResult = (PhotoItemGroupSelectionResult) obj;
                        if (photoItemGroupSelectionResult != null) {
                            y yVar = this.f241661c;
                            String str2 = photoItemGroupSelectionResult.f218381c;
                            boolean z12 = photoItemGroupSelectionResult.f218382d;
                            String str3 = photoItemGroupSelectionResult.f218380b;
                            if (z12) {
                                com.avito.android.photo_list_view_groups.h hVar = yVar.f241692o;
                                if (hVar == null) {
                                    hVar = null;
                                }
                                hVar.H9(str3, str2);
                            } else {
                                com.avito.android.photo_list_view_groups.h hVar2 = yVar.f241692o;
                                if (hVar2 == null) {
                                    hVar2 = null;
                                }
                                hVar2.Nd(str2, Collections.singleton(str3));
                            }
                            g80.d dVar = yVar.f241693p;
                            if (dVar == null) {
                                dVar = null;
                            }
                            dVar.c(z12 ? str3 : null, photoItemGroupSelectionResult.f218383e, photoItemGroupSelectionResult.f218384f);
                            break;
                        }
                        break;
                    case 3:
                        this.f241661c.a(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        y yVar2 = this.f241661c;
                        if (!zBooleanValue) {
                            yVar2.b();
                            break;
                        } else {
                            yVar2.t1();
                            break;
                        }
                    case 5:
                        com.avito.android.photo_list_view.s sVar = this.f241661c.f241683f;
                        if (sVar == null) {
                            sVar = null;
                        }
                        sVar.l(true);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        ArrayList arrayList = new ArrayList();
                        Intent intent3 = activityResult.f21243c;
                        if (intent3 != null && (listA = C35974x2.a(intent3)) != null) {
                            arrayList.addAll(listA);
                        }
                        if (arrayList.isEmpty() && (intent = activityResult.f21243c) != null && (data = intent.getData()) != null) {
                            arrayList.add(data);
                        }
                        com.avito.android.publish.file_uploader.t tVar = this.f241661c.f241701x;
                        if (tVar == null) {
                            tVar = null;
                        }
                        tVar.oe(arrayList);
                        break;
                    case 7:
                        Intent intent4 = ((ActivityResult) obj).f21243c;
                        if (intent4 != null && (data2 = intent4.getData()) != null) {
                            y yVar3 = this.f241661c;
                            com.avito.android.publish.video_upload.s sVar2 = yVar3.f241700w;
                            if (sVar2 == null) {
                                sVar2 = null;
                            }
                            C0 c02 = yVar3.f241685h;
                            sVar2.me((c02 != null ? c02 : null).Be(), data2);
                            break;
                        }
                        break;
                    default:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.d.l.f8312a);
                        break;
                }
            }
        });
        final int i14 = 3;
        this.f241671J = publishDetailsFragment.registerForActivityResult(new b.l(), new androidx.view.result.a(this) { // from class: com.avito.android.publish.screen.step.params.x

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f241661c;

            {
                this.f241661c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                Bundle extras;
                Intent intent;
                Uri data;
                List<Uri> listA;
                Uri data2;
                switch (i14) {
                    case 0:
                        Intent intent2 = ((ActivityResult) obj).f21243c;
                        if (intent2 != null && (extras = intent2.getExtras()) != null) {
                            SelectParameter.Value value = (SelectParameter.Value) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) extras.getParcelable("extra_value", SelectParameter.Value.class) : extras.getParcelable("extra_value"));
                            if (value != null) {
                                ((PublishDetailsFragment.i) this.f241661c.f241682e).invoke(new InterfaceC14065a.b.d(value));
                                break;
                            }
                        }
                        break;
                    case 1:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.b.C0470a.f8231a);
                        break;
                    case 2:
                        PhotoItemGroupSelectionResult photoItemGroupSelectionResult = (PhotoItemGroupSelectionResult) obj;
                        if (photoItemGroupSelectionResult != null) {
                            y yVar = this.f241661c;
                            String str2 = photoItemGroupSelectionResult.f218381c;
                            boolean z12 = photoItemGroupSelectionResult.f218382d;
                            String str3 = photoItemGroupSelectionResult.f218380b;
                            if (z12) {
                                com.avito.android.photo_list_view_groups.h hVar = yVar.f241692o;
                                if (hVar == null) {
                                    hVar = null;
                                }
                                hVar.H9(str3, str2);
                            } else {
                                com.avito.android.photo_list_view_groups.h hVar2 = yVar.f241692o;
                                if (hVar2 == null) {
                                    hVar2 = null;
                                }
                                hVar2.Nd(str2, Collections.singleton(str3));
                            }
                            g80.d dVar = yVar.f241693p;
                            if (dVar == null) {
                                dVar = null;
                            }
                            dVar.c(z12 ? str3 : null, photoItemGroupSelectionResult.f218383e, photoItemGroupSelectionResult.f218384f);
                            break;
                        }
                        break;
                    case 3:
                        this.f241661c.a(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        y yVar2 = this.f241661c;
                        if (!zBooleanValue) {
                            yVar2.b();
                            break;
                        } else {
                            yVar2.t1();
                            break;
                        }
                    case 5:
                        com.avito.android.photo_list_view.s sVar = this.f241661c.f241683f;
                        if (sVar == null) {
                            sVar = null;
                        }
                        sVar.l(true);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        ArrayList arrayList = new ArrayList();
                        Intent intent3 = activityResult.f21243c;
                        if (intent3 != null && (listA = C35974x2.a(intent3)) != null) {
                            arrayList.addAll(listA);
                        }
                        if (arrayList.isEmpty() && (intent = activityResult.f21243c) != null && (data = intent.getData()) != null) {
                            arrayList.add(data);
                        }
                        com.avito.android.publish.file_uploader.t tVar = this.f241661c.f241701x;
                        if (tVar == null) {
                            tVar = null;
                        }
                        tVar.oe(arrayList);
                        break;
                    case 7:
                        Intent intent4 = ((ActivityResult) obj).f21243c;
                        if (intent4 != null && (data2 = intent4.getData()) != null) {
                            y yVar3 = this.f241661c;
                            com.avito.android.publish.video_upload.s sVar2 = yVar3.f241700w;
                            if (sVar2 == null) {
                                sVar2 = null;
                            }
                            C0 c02 = yVar3.f241685h;
                            sVar2.me((c02 != null ? c02 : null).Be(), data2);
                            break;
                        }
                        break;
                    default:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.d.l.f8312a);
                        break;
                }
            }
        });
        final int i15 = 4;
        this.f241672K = publishDetailsFragment.registerForActivityResult(new b.l(), new androidx.view.result.a(this) { // from class: com.avito.android.publish.screen.step.params.x

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f241661c;

            {
                this.f241661c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                Bundle extras;
                Intent intent;
                Uri data;
                List<Uri> listA;
                Uri data2;
                switch (i15) {
                    case 0:
                        Intent intent2 = ((ActivityResult) obj).f21243c;
                        if (intent2 != null && (extras = intent2.getExtras()) != null) {
                            SelectParameter.Value value = (SelectParameter.Value) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) extras.getParcelable("extra_value", SelectParameter.Value.class) : extras.getParcelable("extra_value"));
                            if (value != null) {
                                ((PublishDetailsFragment.i) this.f241661c.f241682e).invoke(new InterfaceC14065a.b.d(value));
                                break;
                            }
                        }
                        break;
                    case 1:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.b.C0470a.f8231a);
                        break;
                    case 2:
                        PhotoItemGroupSelectionResult photoItemGroupSelectionResult = (PhotoItemGroupSelectionResult) obj;
                        if (photoItemGroupSelectionResult != null) {
                            y yVar = this.f241661c;
                            String str2 = photoItemGroupSelectionResult.f218381c;
                            boolean z12 = photoItemGroupSelectionResult.f218382d;
                            String str3 = photoItemGroupSelectionResult.f218380b;
                            if (z12) {
                                com.avito.android.photo_list_view_groups.h hVar = yVar.f241692o;
                                if (hVar == null) {
                                    hVar = null;
                                }
                                hVar.H9(str3, str2);
                            } else {
                                com.avito.android.photo_list_view_groups.h hVar2 = yVar.f241692o;
                                if (hVar2 == null) {
                                    hVar2 = null;
                                }
                                hVar2.Nd(str2, Collections.singleton(str3));
                            }
                            g80.d dVar = yVar.f241693p;
                            if (dVar == null) {
                                dVar = null;
                            }
                            dVar.c(z12 ? str3 : null, photoItemGroupSelectionResult.f218383e, photoItemGroupSelectionResult.f218384f);
                            break;
                        }
                        break;
                    case 3:
                        this.f241661c.a(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        y yVar2 = this.f241661c;
                        if (!zBooleanValue) {
                            yVar2.b();
                            break;
                        } else {
                            yVar2.t1();
                            break;
                        }
                    case 5:
                        com.avito.android.photo_list_view.s sVar = this.f241661c.f241683f;
                        if (sVar == null) {
                            sVar = null;
                        }
                        sVar.l(true);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        ArrayList arrayList = new ArrayList();
                        Intent intent3 = activityResult.f21243c;
                        if (intent3 != null && (listA = C35974x2.a(intent3)) != null) {
                            arrayList.addAll(listA);
                        }
                        if (arrayList.isEmpty() && (intent = activityResult.f21243c) != null && (data = intent.getData()) != null) {
                            arrayList.add(data);
                        }
                        com.avito.android.publish.file_uploader.t tVar = this.f241661c.f241701x;
                        if (tVar == null) {
                            tVar = null;
                        }
                        tVar.oe(arrayList);
                        break;
                    case 7:
                        Intent intent4 = ((ActivityResult) obj).f21243c;
                        if (intent4 != null && (data2 = intent4.getData()) != null) {
                            y yVar3 = this.f241661c;
                            com.avito.android.publish.video_upload.s sVar2 = yVar3.f241700w;
                            if (sVar2 == null) {
                                sVar2 = null;
                            }
                            C0 c02 = yVar3.f241685h;
                            sVar2.me((c02 != null ? c02 : null).Be(), data2);
                            break;
                        }
                        break;
                    default:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.d.l.f8312a);
                        break;
                }
            }
        });
        final int i16 = 5;
        this.f241673L = publishDetailsFragment.registerForActivityResult(new b.m(), new androidx.view.result.a(this) { // from class: com.avito.android.publish.screen.step.params.x

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f241661c;

            {
                this.f241661c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                Bundle extras;
                Intent intent;
                Uri data;
                List<Uri> listA;
                Uri data2;
                switch (i16) {
                    case 0:
                        Intent intent2 = ((ActivityResult) obj).f21243c;
                        if (intent2 != null && (extras = intent2.getExtras()) != null) {
                            SelectParameter.Value value = (SelectParameter.Value) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) extras.getParcelable("extra_value", SelectParameter.Value.class) : extras.getParcelable("extra_value"));
                            if (value != null) {
                                ((PublishDetailsFragment.i) this.f241661c.f241682e).invoke(new InterfaceC14065a.b.d(value));
                                break;
                            }
                        }
                        break;
                    case 1:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.b.C0470a.f8231a);
                        break;
                    case 2:
                        PhotoItemGroupSelectionResult photoItemGroupSelectionResult = (PhotoItemGroupSelectionResult) obj;
                        if (photoItemGroupSelectionResult != null) {
                            y yVar = this.f241661c;
                            String str2 = photoItemGroupSelectionResult.f218381c;
                            boolean z12 = photoItemGroupSelectionResult.f218382d;
                            String str3 = photoItemGroupSelectionResult.f218380b;
                            if (z12) {
                                com.avito.android.photo_list_view_groups.h hVar = yVar.f241692o;
                                if (hVar == null) {
                                    hVar = null;
                                }
                                hVar.H9(str3, str2);
                            } else {
                                com.avito.android.photo_list_view_groups.h hVar2 = yVar.f241692o;
                                if (hVar2 == null) {
                                    hVar2 = null;
                                }
                                hVar2.Nd(str2, Collections.singleton(str3));
                            }
                            g80.d dVar = yVar.f241693p;
                            if (dVar == null) {
                                dVar = null;
                            }
                            dVar.c(z12 ? str3 : null, photoItemGroupSelectionResult.f218383e, photoItemGroupSelectionResult.f218384f);
                            break;
                        }
                        break;
                    case 3:
                        this.f241661c.a(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        y yVar2 = this.f241661c;
                        if (!zBooleanValue) {
                            yVar2.b();
                            break;
                        } else {
                            yVar2.t1();
                            break;
                        }
                    case 5:
                        com.avito.android.photo_list_view.s sVar = this.f241661c.f241683f;
                        if (sVar == null) {
                            sVar = null;
                        }
                        sVar.l(true);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        ArrayList arrayList = new ArrayList();
                        Intent intent3 = activityResult.f21243c;
                        if (intent3 != null && (listA = C35974x2.a(intent3)) != null) {
                            arrayList.addAll(listA);
                        }
                        if (arrayList.isEmpty() && (intent = activityResult.f21243c) != null && (data = intent.getData()) != null) {
                            arrayList.add(data);
                        }
                        com.avito.android.publish.file_uploader.t tVar = this.f241661c.f241701x;
                        if (tVar == null) {
                            tVar = null;
                        }
                        tVar.oe(arrayList);
                        break;
                    case 7:
                        Intent intent4 = ((ActivityResult) obj).f21243c;
                        if (intent4 != null && (data2 = intent4.getData()) != null) {
                            y yVar3 = this.f241661c;
                            com.avito.android.publish.video_upload.s sVar2 = yVar3.f241700w;
                            if (sVar2 == null) {
                                sVar2 = null;
                            }
                            C0 c02 = yVar3.f241685h;
                            sVar2.me((c02 != null ? c02 : null).Be(), data2);
                            break;
                        }
                        break;
                    default:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.d.l.f8312a);
                        break;
                }
            }
        });
        final int i17 = 0;
        this.f241674M = publishDetailsFragment.registerForActivityResult(new b.m(), new androidx.view.result.a(this) { // from class: com.avito.android.publish.screen.step.params.x

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f241661c;

            {
                this.f241661c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                Bundle extras;
                Intent intent;
                Uri data;
                List<Uri> listA;
                Uri data2;
                switch (i17) {
                    case 0:
                        Intent intent2 = ((ActivityResult) obj).f21243c;
                        if (intent2 != null && (extras = intent2.getExtras()) != null) {
                            SelectParameter.Value value = (SelectParameter.Value) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) extras.getParcelable("extra_value", SelectParameter.Value.class) : extras.getParcelable("extra_value"));
                            if (value != null) {
                                ((PublishDetailsFragment.i) this.f241661c.f241682e).invoke(new InterfaceC14065a.b.d(value));
                                break;
                            }
                        }
                        break;
                    case 1:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.b.C0470a.f8231a);
                        break;
                    case 2:
                        PhotoItemGroupSelectionResult photoItemGroupSelectionResult = (PhotoItemGroupSelectionResult) obj;
                        if (photoItemGroupSelectionResult != null) {
                            y yVar = this.f241661c;
                            String str2 = photoItemGroupSelectionResult.f218381c;
                            boolean z12 = photoItemGroupSelectionResult.f218382d;
                            String str3 = photoItemGroupSelectionResult.f218380b;
                            if (z12) {
                                com.avito.android.photo_list_view_groups.h hVar = yVar.f241692o;
                                if (hVar == null) {
                                    hVar = null;
                                }
                                hVar.H9(str3, str2);
                            } else {
                                com.avito.android.photo_list_view_groups.h hVar2 = yVar.f241692o;
                                if (hVar2 == null) {
                                    hVar2 = null;
                                }
                                hVar2.Nd(str2, Collections.singleton(str3));
                            }
                            g80.d dVar = yVar.f241693p;
                            if (dVar == null) {
                                dVar = null;
                            }
                            dVar.c(z12 ? str3 : null, photoItemGroupSelectionResult.f218383e, photoItemGroupSelectionResult.f218384f);
                            break;
                        }
                        break;
                    case 3:
                        this.f241661c.a(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        y yVar2 = this.f241661c;
                        if (!zBooleanValue) {
                            yVar2.b();
                            break;
                        } else {
                            yVar2.t1();
                            break;
                        }
                    case 5:
                        com.avito.android.photo_list_view.s sVar = this.f241661c.f241683f;
                        if (sVar == null) {
                            sVar = null;
                        }
                        sVar.l(true);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        ArrayList arrayList = new ArrayList();
                        Intent intent3 = activityResult.f21243c;
                        if (intent3 != null && (listA = C35974x2.a(intent3)) != null) {
                            arrayList.addAll(listA);
                        }
                        if (arrayList.isEmpty() && (intent = activityResult.f21243c) != null && (data = intent.getData()) != null) {
                            arrayList.add(data);
                        }
                        com.avito.android.publish.file_uploader.t tVar = this.f241661c.f241701x;
                        if (tVar == null) {
                            tVar = null;
                        }
                        tVar.oe(arrayList);
                        break;
                    case 7:
                        Intent intent4 = ((ActivityResult) obj).f21243c;
                        if (intent4 != null && (data2 = intent4.getData()) != null) {
                            y yVar3 = this.f241661c;
                            com.avito.android.publish.video_upload.s sVar2 = yVar3.f241700w;
                            if (sVar2 == null) {
                                sVar2 = null;
                            }
                            C0 c02 = yVar3.f241685h;
                            sVar2.me((c02 != null ? c02 : null).Be(), data2);
                            break;
                        }
                        break;
                    default:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.d.l.f8312a);
                        break;
                }
            }
        });
        final int i18 = 6;
        this.f241675N = publishDetailsFragment.registerForActivityResult(new b.m(), new androidx.view.result.a(this) { // from class: com.avito.android.publish.screen.step.params.x

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f241661c;

            {
                this.f241661c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                Bundle extras;
                Intent intent;
                Uri data;
                List<Uri> listA;
                Uri data2;
                switch (i18) {
                    case 0:
                        Intent intent2 = ((ActivityResult) obj).f21243c;
                        if (intent2 != null && (extras = intent2.getExtras()) != null) {
                            SelectParameter.Value value = (SelectParameter.Value) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) extras.getParcelable("extra_value", SelectParameter.Value.class) : extras.getParcelable("extra_value"));
                            if (value != null) {
                                ((PublishDetailsFragment.i) this.f241661c.f241682e).invoke(new InterfaceC14065a.b.d(value));
                                break;
                            }
                        }
                        break;
                    case 1:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.b.C0470a.f8231a);
                        break;
                    case 2:
                        PhotoItemGroupSelectionResult photoItemGroupSelectionResult = (PhotoItemGroupSelectionResult) obj;
                        if (photoItemGroupSelectionResult != null) {
                            y yVar = this.f241661c;
                            String str2 = photoItemGroupSelectionResult.f218381c;
                            boolean z12 = photoItemGroupSelectionResult.f218382d;
                            String str3 = photoItemGroupSelectionResult.f218380b;
                            if (z12) {
                                com.avito.android.photo_list_view_groups.h hVar = yVar.f241692o;
                                if (hVar == null) {
                                    hVar = null;
                                }
                                hVar.H9(str3, str2);
                            } else {
                                com.avito.android.photo_list_view_groups.h hVar2 = yVar.f241692o;
                                if (hVar2 == null) {
                                    hVar2 = null;
                                }
                                hVar2.Nd(str2, Collections.singleton(str3));
                            }
                            g80.d dVar = yVar.f241693p;
                            if (dVar == null) {
                                dVar = null;
                            }
                            dVar.c(z12 ? str3 : null, photoItemGroupSelectionResult.f218383e, photoItemGroupSelectionResult.f218384f);
                            break;
                        }
                        break;
                    case 3:
                        this.f241661c.a(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        y yVar2 = this.f241661c;
                        if (!zBooleanValue) {
                            yVar2.b();
                            break;
                        } else {
                            yVar2.t1();
                            break;
                        }
                    case 5:
                        com.avito.android.photo_list_view.s sVar = this.f241661c.f241683f;
                        if (sVar == null) {
                            sVar = null;
                        }
                        sVar.l(true);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        ArrayList arrayList = new ArrayList();
                        Intent intent3 = activityResult.f21243c;
                        if (intent3 != null && (listA = C35974x2.a(intent3)) != null) {
                            arrayList.addAll(listA);
                        }
                        if (arrayList.isEmpty() && (intent = activityResult.f21243c) != null && (data = intent.getData()) != null) {
                            arrayList.add(data);
                        }
                        com.avito.android.publish.file_uploader.t tVar = this.f241661c.f241701x;
                        if (tVar == null) {
                            tVar = null;
                        }
                        tVar.oe(arrayList);
                        break;
                    case 7:
                        Intent intent4 = ((ActivityResult) obj).f21243c;
                        if (intent4 != null && (data2 = intent4.getData()) != null) {
                            y yVar3 = this.f241661c;
                            com.avito.android.publish.video_upload.s sVar2 = yVar3.f241700w;
                            if (sVar2 == null) {
                                sVar2 = null;
                            }
                            C0 c02 = yVar3.f241685h;
                            sVar2.me((c02 != null ? c02 : null).Be(), data2);
                            break;
                        }
                        break;
                    default:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.d.l.f8312a);
                        break;
                }
            }
        });
        final int i19 = 7;
        this.f241676O = publishDetailsFragment.registerForActivityResult(new b.m(), new androidx.view.result.a(this) { // from class: com.avito.android.publish.screen.step.params.x

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f241661c;

            {
                this.f241661c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                Bundle extras;
                Intent intent;
                Uri data;
                List<Uri> listA;
                Uri data2;
                switch (i19) {
                    case 0:
                        Intent intent2 = ((ActivityResult) obj).f21243c;
                        if (intent2 != null && (extras = intent2.getExtras()) != null) {
                            SelectParameter.Value value = (SelectParameter.Value) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) extras.getParcelable("extra_value", SelectParameter.Value.class) : extras.getParcelable("extra_value"));
                            if (value != null) {
                                ((PublishDetailsFragment.i) this.f241661c.f241682e).invoke(new InterfaceC14065a.b.d(value));
                                break;
                            }
                        }
                        break;
                    case 1:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.b.C0470a.f8231a);
                        break;
                    case 2:
                        PhotoItemGroupSelectionResult photoItemGroupSelectionResult = (PhotoItemGroupSelectionResult) obj;
                        if (photoItemGroupSelectionResult != null) {
                            y yVar = this.f241661c;
                            String str2 = photoItemGroupSelectionResult.f218381c;
                            boolean z12 = photoItemGroupSelectionResult.f218382d;
                            String str3 = photoItemGroupSelectionResult.f218380b;
                            if (z12) {
                                com.avito.android.photo_list_view_groups.h hVar = yVar.f241692o;
                                if (hVar == null) {
                                    hVar = null;
                                }
                                hVar.H9(str3, str2);
                            } else {
                                com.avito.android.photo_list_view_groups.h hVar2 = yVar.f241692o;
                                if (hVar2 == null) {
                                    hVar2 = null;
                                }
                                hVar2.Nd(str2, Collections.singleton(str3));
                            }
                            g80.d dVar = yVar.f241693p;
                            if (dVar == null) {
                                dVar = null;
                            }
                            dVar.c(z12 ? str3 : null, photoItemGroupSelectionResult.f218383e, photoItemGroupSelectionResult.f218384f);
                            break;
                        }
                        break;
                    case 3:
                        this.f241661c.a(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        y yVar2 = this.f241661c;
                        if (!zBooleanValue) {
                            yVar2.b();
                            break;
                        } else {
                            yVar2.t1();
                            break;
                        }
                    case 5:
                        com.avito.android.photo_list_view.s sVar = this.f241661c.f241683f;
                        if (sVar == null) {
                            sVar = null;
                        }
                        sVar.l(true);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        ArrayList arrayList = new ArrayList();
                        Intent intent3 = activityResult.f21243c;
                        if (intent3 != null && (listA = C35974x2.a(intent3)) != null) {
                            arrayList.addAll(listA);
                        }
                        if (arrayList.isEmpty() && (intent = activityResult.f21243c) != null && (data = intent.getData()) != null) {
                            arrayList.add(data);
                        }
                        com.avito.android.publish.file_uploader.t tVar = this.f241661c.f241701x;
                        if (tVar == null) {
                            tVar = null;
                        }
                        tVar.oe(arrayList);
                        break;
                    case 7:
                        Intent intent4 = ((ActivityResult) obj).f21243c;
                        if (intent4 != null && (data2 = intent4.getData()) != null) {
                            y yVar3 = this.f241661c;
                            com.avito.android.publish.video_upload.s sVar2 = yVar3.f241700w;
                            if (sVar2 == null) {
                                sVar2 = null;
                            }
                            C0 c02 = yVar3.f241685h;
                            sVar2.me((c02 != null ? c02 : null).Be(), data2);
                            break;
                        }
                        break;
                    default:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.d.l.f8312a);
                        break;
                }
            }
        });
        final int i22 = 8;
        this.f241677P = publishDetailsFragment.registerForActivityResult(new b.m(), new androidx.view.result.a(this) { // from class: com.avito.android.publish.screen.step.params.x

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f241661c;

            {
                this.f241661c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                Bundle extras;
                Intent intent;
                Uri data;
                List<Uri> listA;
                Uri data2;
                switch (i22) {
                    case 0:
                        Intent intent2 = ((ActivityResult) obj).f21243c;
                        if (intent2 != null && (extras = intent2.getExtras()) != null) {
                            SelectParameter.Value value = (SelectParameter.Value) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) extras.getParcelable("extra_value", SelectParameter.Value.class) : extras.getParcelable("extra_value"));
                            if (value != null) {
                                ((PublishDetailsFragment.i) this.f241661c.f241682e).invoke(new InterfaceC14065a.b.d(value));
                                break;
                            }
                        }
                        break;
                    case 1:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.b.C0470a.f8231a);
                        break;
                    case 2:
                        PhotoItemGroupSelectionResult photoItemGroupSelectionResult = (PhotoItemGroupSelectionResult) obj;
                        if (photoItemGroupSelectionResult != null) {
                            y yVar = this.f241661c;
                            String str2 = photoItemGroupSelectionResult.f218381c;
                            boolean z12 = photoItemGroupSelectionResult.f218382d;
                            String str3 = photoItemGroupSelectionResult.f218380b;
                            if (z12) {
                                com.avito.android.photo_list_view_groups.h hVar = yVar.f241692o;
                                if (hVar == null) {
                                    hVar = null;
                                }
                                hVar.H9(str3, str2);
                            } else {
                                com.avito.android.photo_list_view_groups.h hVar2 = yVar.f241692o;
                                if (hVar2 == null) {
                                    hVar2 = null;
                                }
                                hVar2.Nd(str2, Collections.singleton(str3));
                            }
                            g80.d dVar = yVar.f241693p;
                            if (dVar == null) {
                                dVar = null;
                            }
                            dVar.c(z12 ? str3 : null, photoItemGroupSelectionResult.f218383e, photoItemGroupSelectionResult.f218384f);
                            break;
                        }
                        break;
                    case 3:
                        this.f241661c.a(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        y yVar2 = this.f241661c;
                        if (!zBooleanValue) {
                            yVar2.b();
                            break;
                        } else {
                            yVar2.t1();
                            break;
                        }
                    case 5:
                        com.avito.android.photo_list_view.s sVar = this.f241661c.f241683f;
                        if (sVar == null) {
                            sVar = null;
                        }
                        sVar.l(true);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        ArrayList arrayList = new ArrayList();
                        Intent intent3 = activityResult.f21243c;
                        if (intent3 != null && (listA = C35974x2.a(intent3)) != null) {
                            arrayList.addAll(listA);
                        }
                        if (arrayList.isEmpty() && (intent = activityResult.f21243c) != null && (data = intent.getData()) != null) {
                            arrayList.add(data);
                        }
                        com.avito.android.publish.file_uploader.t tVar = this.f241661c.f241701x;
                        if (tVar == null) {
                            tVar = null;
                        }
                        tVar.oe(arrayList);
                        break;
                    case 7:
                        Intent intent4 = ((ActivityResult) obj).f21243c;
                        if (intent4 != null && (data2 = intent4.getData()) != null) {
                            y yVar3 = this.f241661c;
                            com.avito.android.publish.video_upload.s sVar2 = yVar3.f241700w;
                            if (sVar2 == null) {
                                sVar2 = null;
                            }
                            C0 c02 = yVar3.f241685h;
                            sVar2.me((c02 != null ? c02 : null).Be(), data2);
                            break;
                        }
                        break;
                    default:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.d.l.f8312a);
                        break;
                }
            }
        });
        final int i23 = 1;
        this.f241678Q = publishDetailsFragment.registerForActivityResult(new b.m(), new androidx.view.result.a(this) { // from class: com.avito.android.publish.screen.step.params.x

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y f241661c;

            {
                this.f241661c = this;
            }

            @Override // androidx.view.result.a
            public final void a(Object obj) {
                Bundle extras;
                Intent intent;
                Uri data;
                List<Uri> listA;
                Uri data2;
                switch (i23) {
                    case 0:
                        Intent intent2 = ((ActivityResult) obj).f21243c;
                        if (intent2 != null && (extras = intent2.getExtras()) != null) {
                            SelectParameter.Value value = (SelectParameter.Value) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) extras.getParcelable("extra_value", SelectParameter.Value.class) : extras.getParcelable("extra_value"));
                            if (value != null) {
                                ((PublishDetailsFragment.i) this.f241661c.f241682e).invoke(new InterfaceC14065a.b.d(value));
                                break;
                            }
                        }
                        break;
                    case 1:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.b.C0470a.f8231a);
                        break;
                    case 2:
                        PhotoItemGroupSelectionResult photoItemGroupSelectionResult = (PhotoItemGroupSelectionResult) obj;
                        if (photoItemGroupSelectionResult != null) {
                            y yVar = this.f241661c;
                            String str2 = photoItemGroupSelectionResult.f218381c;
                            boolean z12 = photoItemGroupSelectionResult.f218382d;
                            String str3 = photoItemGroupSelectionResult.f218380b;
                            if (z12) {
                                com.avito.android.photo_list_view_groups.h hVar = yVar.f241692o;
                                if (hVar == null) {
                                    hVar = null;
                                }
                                hVar.H9(str3, str2);
                            } else {
                                com.avito.android.photo_list_view_groups.h hVar2 = yVar.f241692o;
                                if (hVar2 == null) {
                                    hVar2 = null;
                                }
                                hVar2.Nd(str2, Collections.singleton(str3));
                            }
                            g80.d dVar = yVar.f241693p;
                            if (dVar == null) {
                                dVar = null;
                            }
                            dVar.c(z12 ? str3 : null, photoItemGroupSelectionResult.f218383e, photoItemGroupSelectionResult.f218384f);
                            break;
                        }
                        break;
                    case 3:
                        this.f241661c.a(((Boolean) obj).booleanValue());
                        break;
                    case 4:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        y yVar2 = this.f241661c;
                        if (!zBooleanValue) {
                            yVar2.b();
                            break;
                        } else {
                            yVar2.t1();
                            break;
                        }
                    case 5:
                        com.avito.android.photo_list_view.s sVar = this.f241661c.f241683f;
                        if (sVar == null) {
                            sVar = null;
                        }
                        sVar.l(true);
                        break;
                    case 6:
                        ActivityResult activityResult = (ActivityResult) obj;
                        ArrayList arrayList = new ArrayList();
                        Intent intent3 = activityResult.f21243c;
                        if (intent3 != null && (listA = C35974x2.a(intent3)) != null) {
                            arrayList.addAll(listA);
                        }
                        if (arrayList.isEmpty() && (intent = activityResult.f21243c) != null && (data = intent.getData()) != null) {
                            arrayList.add(data);
                        }
                        com.avito.android.publish.file_uploader.t tVar = this.f241661c.f241701x;
                        if (tVar == null) {
                            tVar = null;
                        }
                        tVar.oe(arrayList);
                        break;
                    case 7:
                        Intent intent4 = ((ActivityResult) obj).f21243c;
                        if (intent4 != null && (data2 = intent4.getData()) != null) {
                            y yVar3 = this.f241661c;
                            com.avito.android.publish.video_upload.s sVar2 = yVar3.f241700w;
                            if (sVar2 == null) {
                                sVar2 = null;
                            }
                            C0 c02 = yVar3.f241685h;
                            sVar2.me((c02 != null ? c02 : null).Be(), data2);
                            break;
                        }
                        break;
                    default:
                        this.f241661c.f241682e.invoke(InterfaceC14065a.d.l.f8312a);
                        break;
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.photo_list_view.x
    public final void A2(int i12, @Y61.l String str, @Y61.l String str2) {
        PhotoPickerIntentFactory.PhotoPickerMode modeAdd = str == null ? new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null) : new PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit(false, false, false, 7, null);
        u3.l<SimpleTestGroupWithNone> lVar = this.f241665D;
        if (lVar == null) {
            lVar = null;
        }
        boolean zB2 = lVar.f439745a.f439749b.b();
        if (!zB2) {
            com.avito.android.publish.photo_permission.a aVar = this.f241663B;
            if (aVar == null) {
                aVar = null;
            }
            aVar.a();
        }
        if (!modeAdd.equals(new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null)) || !zB2) {
            d(str, modeAdd, str2);
            return;
        }
        PhotoPermissionDialogData.f218697c.getClass();
        PhotoPermissionDialogData photoPermissionDialogDataA = PhotoPermissionDialogData.a.a();
        ?? r112 = this.f241669H;
        LinkedHashSet linkedHashSetB = ((com.avito.android.photo_permission.a) r112.getValue()).b(photoPermissionDialogDataA);
        if (linkedHashSetB.isEmpty()) {
            d(null, new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null), null);
            return;
        }
        if (linkedHashSetB.size() != 1 || !linkedHashSetB.contains(PhotoPermission.Camera.f218689b)) {
            ((com.avito.android.photo_permission.a) r112.getValue()).a(photoPermissionDialogDataA);
            return;
        }
        com.avito.android.publish.photo_permission.a aVar2 = this.f241663B;
        if (aVar2 == null) {
            aVar2 = null;
        }
        if (aVar2.b()) {
            ((com.avito.android.photo_permission.a) r112.getValue()).a(photoPermissionDialogDataA);
        } else {
            d(null, new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null), null);
        }
    }

    @Override // com.avito.android.publish.details.D.a
    public final void C(@Y61.k Y41.l<? super InterfaceC33764k0.a, InterfaceC33764k0.a> lVar) {
        ((PublishDetailsFragment.i) this.f241682e).invoke(new InterfaceC14065a.d.m(lVar));
    }

    @Override // com.avito.android.publish.details.D.a
    public final void C2(@Y61.l String str, @Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.k com.avito.android.category_parameters.h hVar) {
        Context contextRequireContext = this.f241679b.requireContext();
        Theme.Companion companion = Theme.INSTANCE;
        C0 c02 = this.f241685h;
        if (c02 == null) {
            c02 = null;
        }
        com.avito.android.lib.util.g.a(new com.avito.android.parameters_sheet.d(contextRequireContext, R.style.RedesignPublishParametersListDialog, str, list, hVar, companion.isAvitoRe23(c02.ve())));
    }

    @Override // com.avito.android.publish.details.D.a
    public final void D0() {
        C0 c02 = this.f241685h;
        if (c02 == null) {
            c02 = null;
        }
        c02.ye();
    }

    @Override // com.avito.android.publish.details.auction.d.a
    public final void E0() {
        ((PublishActivity) this.f241679b.requireActivity()).d2(null);
    }

    @Override // com.avito.android.publish.photo_picker.c
    public final void E2(@Y61.k String str) {
        d(str, new PhotoPickerIntentFactory.PhotoPickerMode.ModeEdit(false, false, false, 7, null), null);
    }

    @Override // com.avito.android.publish.details.D.a
    public final void F3(@Y61.k c.a aVar, @Y61.k ParameterElement.C29377e c29377e, @Y61.k Y41.l<? super Long, G0> lVar) {
        com.avito.android.publish.date_picker.b bVar = this.f241689l;
        if (bVar == null) {
            bVar = null;
        }
        bVar.d(this.f241679b.requireContext(), aVar, c29377e, lVar);
    }

    @Override // com.avito.android.publish.iac_for_pro.d
    public final void G2(@Y61.k Y41.a<G0> aVar) {
        com.avito.android.lib.util.g.a(new com.avito.android.publish.iac_for_pro.b(this.f241679b.requireContext(), aVar));
    }

    @Override // com.avito.android.publish.photo_picker.c
    public final void I2(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.k List list, boolean z12) {
        this.f241670I.b(new PhotoItemGroupSelectionParams(str, str2, str3, list, z12));
    }

    @Override // com.avito.android.publish.view.a.b
    public final void K2(@Y61.k DeepLink deepLink, @Y61.l Bundle bundle) {
        if (deepLink instanceof AuctionAddLink) {
            com.avito.android.publish.details.auction.d dVar = this.f241691n;
            (dVar != null ? dVar : null).M7((AuctionAddLink) deepLink);
            return;
        }
        if (deepLink instanceof AddAutoToC2CTrxLink) {
            com.avito.android.publish.details.auction.d dVar2 = this.f241691n;
            (dVar2 != null ? dVar2 : null).m7((AddAutoToC2CTrxLink) deepLink);
            return;
        }
        if (deepLink instanceof CollectPublishParamsLink) {
            com.avito.android.publish.details.buyout.a aVar = this.f241695r;
            (aVar != null ? aVar : null).B6((CollectPublishParamsLink) deepLink);
        } else if (deepLink instanceof VerificationStartLink) {
            InterfaceC16992a interfaceC16992a = this.f241694q;
            (interfaceC16992a != null ? interfaceC16992a : null).a((VerificationStartLink) deepLink);
        } else {
            com.avito.android.deeplink_handler.handler.composite.a aVar2 = this.f241687j;
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
        C0 c02 = this.f241685h;
        Double dValueOf = null;
        if (c02 == null) {
            c02 = null;
        }
        CategoryParameters categoryParameters = c02.f231873k0;
        AddressParameter addressParameter = categoryParameters != null ? (AddressParameter) categoryParameters.getFirstParameterOfType(AddressParameter.class) : null;
        InterfaceC41184a interfaceC41184a = this.f241699v;
        if (interfaceC41184a == null) {
            interfaceC41184a = null;
        }
        Double dValueOf2 = (addressParameter == null || (value2 = addressParameter.getValue()) == null) ? null : Double.valueOf(value2.getLat());
        if (addressParameter != null && (value = addressParameter.getValue()) != null) {
            dValueOf = Double.valueOf(value.getLng());
        }
        this.f241674M.b(InterfaceC41184a.C11358a.a(interfaceC41184a, dValueOf2, dValueOf, 12));
    }

    @Override // com.avito.android.publish.view.i.a
    public final void M2() {
        K2.e(this.f241679b);
        this.f241680c.F();
    }

    @Override // com.avito.android.publish.details.D.a
    public final void M3(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3) {
        com.avito.android.lib.design.modal.a aVarC = a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, this.f241679b.requireContext(), new d(aVar2, aVar3, str, str2, str3));
        this.f241668G = aVarC;
        com.avito.android.lib.util.g.a(aVarC);
        G0 g02 = G0.f406611a;
        aVar.invoke();
    }

    @Override // com.avito.android.details.j.b
    public final void O2(@Y61.k AutoEarlyAccessSelectParams autoEarlyAccessSelectParams) {
        this.f241679b.O2(autoEarlyAccessSelectParams);
    }

    @Override // com.avito.android.publish.view.i.a
    public final void Q2(@Y61.k ObjectsParameter objectsParameter) {
        this.f241679b.Q2(objectsParameter);
    }

    @Override // com.avito.android.publish.file_uploader.r
    public final void Q3(@Y61.k String[] strArr, boolean z12) {
        Intent intent = new Intent();
        intent.setType("*/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z12);
        this.f241675N.b(Intent.createChooser(intent, ""));
    }

    @Override // com.avito.android.details.j.b
    public final void R1(@Y61.k Arguments arguments) {
        this.f241679b.R1(arguments);
    }

    @Override // com.avito.android.publish.details.D.a
    public final void T0(@Y61.k ParameterElement.C29377e c29377e, @Y61.k Y41.l<? super Long, G0> lVar) {
        com.avito.android.publish.date_picker.b bVar = this.f241689l;
        if (bVar == null) {
            bVar = null;
        }
        bVar.c(this.f241679b.requireContext(), c29377e, lVar);
    }

    @Override // com.avito.android.publish.slots.check_verification.b
    public final void T4() {
        this.f241682e.invoke(InterfaceC14065a.d.l.f8312a);
    }

    @Override // com.avito.android.publish.details.D.a
    public final void W4(@Y61.k String str) {
        String strSubstring = new URL(str).getPath().substring(1);
        InterfaceC30751h interfaceC30751h = this.f241686i;
        if (interfaceC30751h == null) {
            interfaceC30751h = null;
        }
        this.f241679b.startActivity(interfaceC30751h.a(strSubstring));
    }

    @Override // com.avito.android.publish.details.D.a
    public final void Y3() {
        throw new kotlin.G(null, 1, null);
    }

    @Override // com.avito.android.publish.details.D.a
    public final void Z0(@Y61.k c.a aVar, @Y61.k ParameterElement.C29377e c29377e, @Y61.k Y41.l<? super Long, G0> lVar) {
        com.avito.android.publish.date_picker.b bVar = this.f241689l;
        if (bVar == null) {
            bVar = null;
        }
        bVar.e(this.f241679b.requireContext(), aVar, c29377e, lVar);
    }

    public final void a(boolean z12) {
        Intent intent = new Intent();
        intent.setType("video/*");
        intent.setAction("android.intent.action.PICK");
        Intent intentCreateChooser = Intent.createChooser(intent, "");
        if (z12) {
            Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
            intent2.putExtra("android.intent.extra.durationLimit", 180);
            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent2});
        }
        this.f241676O.b(intentCreateChooser);
    }

    public final void b() {
        com.avito.android.video_picker.e eVar = this.f241664C;
        if (eVar == null) {
            eVar = null;
        }
        this.f241679b.startActivity(eVar.a());
    }

    @Override // com.avito.android.publish.details.D.a
    public final void c(@Y61.k Y41.l lVar, @Y61.k String str, @Y61.k String str2) {
        throw new kotlin.G(null, 1, null);
    }

    public final void d(String str, PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode, String str2) {
        InterfaceC33535v interfaceC33535v = this.f241684g;
        if (interfaceC33535v == null) {
            interfaceC33535v = null;
        }
        interfaceC33535v.s0(str2);
        com.avito.android.publish.details.computer_vision.a aVar = this.f241688k;
        if (aVar == null) {
            aVar = null;
        }
        aVar.b();
        PhotoPickerIntentFactory photoPickerIntentFactory = this.f241703z;
        PhotoPickerIntentFactory photoPickerIntentFactory2 = photoPickerIntentFactory != null ? photoPickerIntentFactory : null;
        Context contextRequireContext = this.f241679b.requireContext();
        com.avito.android.photo_list_view.s sVar = this.f241683f;
        if (sVar == null) {
            sVar = null;
        }
        int f218336k = sVar.getF218336k();
        u3.l<SimpleTestGroupWithNone> lVar = this.f241666E;
        this.f241673L.b(PhotoPickerIntentFactory.a.a(photoPickerIntentFactory2, contextRequireContext, this.f241681d, "publish", 0, f218336k, str, null, photoPickerMode, (lVar != null ? lVar : null).f439745a.f439749b.b(), 72));
    }

    public final void e(@Y61.k CategoryPublishStep.Params.Confirmation confirmation, @Y61.k Y41.a<G0> aVar) {
        com.avito.android.publish.confirmation_dialog.c.a(this.f241679b, confirmation, aVar);
    }

    @Override // com.avito.android.publish.view.m.a
    public final void g4(@Y61.k AddressParameter addressParameter, boolean z12) {
        this.f241679b.g4(addressParameter, z12);
    }

    @Override // com.avito.android.publish.iac_devices.c
    public final void h1() {
        com.avito.android.lib.util.g.a(new com.avito.android.publish.iac_devices.b(this.f241679b.requireContext()));
    }

    @Override // com.avito.android.publish.details.D.a
    public final void h2(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k Y41.a<G0> aVar) {
        com.avito.android.lib.deprecated_design.dialog.a aVar2 = this.f241690m;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f241668G = aVar2.b(str, str2, str4, new b(), str3, new c(aVar));
    }

    @Override // com.avito.android.publish.view.i.a
    public final void h4(@Y61.k ObjectsParameter objectsParameter, @Y61.l Integer num) {
        this.f241679b.h4(objectsParameter, num);
    }

    @Override // com.avito.android.publish.details.D.a
    public final void k4(@Y61.l com.avito.android.publish.slots.card_select.item.k kVar) {
        this.f241682e.invoke(new InterfaceC14065a.d.C0475d(kVar));
    }

    @Override // com.avito.android.publish.video_upload.j
    public final void m1() {
        C0 c02 = this.f241685h;
        if (c02 == null) {
            c02 = null;
        }
        c02.we(SlotType.DELIVERY_TOGGLES);
    }

    @Override // com.avito.android.publish.view.i.a
    public final void m2(@Y61.k DistrictParameter districtParameter) {
        this.f241679b.m2(districtParameter);
    }

    @Override // com.avito.android.publish.slots.sleeping_places.c
    public final void m4(@Y61.k C49325f c49325f) {
        PublishDetailsFragment publishDetailsFragment = this.f241679b;
        FragmentManager childFragmentManager = publishDetailsFragment.getChildFragmentManager();
        InterfaceC22983P viewLifecycleOwner = publishDetailsFragment.getViewLifecycleOwner();
        final Y41.l<Integer, G0> lVar = c49325f.f440928e;
        childFragmentManager.p0("selected_bed_type_bed_result", viewLifecycleOwner, new androidx.fragment.app.C() { // from class: com.avito.android.publish.screen.step.params.w
            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle, String str) {
                lVar.invoke(Integer.valueOf(bundle.getInt("selected_bed_type_bed_id_key")));
            }
        });
        SleepingPlacesBedTypesDialog.a aVar = SleepingPlacesBedTypesDialog.f244929m0;
        Q1 q12 = this.f241667F;
        if (q12 == null) {
            q12 = null;
        }
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[83];
        boolean zBooleanValue = ((Boolean) q12.f67507q0.a().invoke()).booleanValue();
        aVar.getClass();
        SleepingPlacesBedTypesDialog.a.a(c49325f.f440927d, c49325f.f440925b, c49325f.f440926c, c49325f.f440924a, zBooleanValue).show(publishDetailsFragment.getChildFragmentManager(), "SleepingPlacesBedTypesBottomSheetDialog");
    }

    @Override // com.avito.android.publish.details.D.a
    public final void o(@Y61.k String str) {
        this.f241680c.o(str);
    }

    @Override // com.avito.android.photo_permission.a.InterfaceC6567a
    public final void o3(@Y61.k PhotoPermissionResult photoPermissionResult) {
        if (photoPermissionResult instanceof PhotoPermissionResult.Allow) {
            d(null, new PhotoPickerIntentFactory.PhotoPickerMode.ModeAdd(null, 1, null), null);
        } else {
            boolean z12 = photoPermissionResult instanceof PhotoPermissionResult.Disallow;
        }
    }

    @Override // com.avito.android.publish.view.i.a
    public final void p2(@Y61.k MetroParameter metroParameter, @Y61.l Integer num, @Y61.l String str) {
        this.f241679b.p2(metroParameter, num, str);
    }

    @Override // com.avito.android.publish.details.D.a
    public final void q1() {
        throw new kotlin.G(null, 1, null);
    }

    @Override // com.avito.android.publish.slots.delivery_addresses.h
    public final void r(@Y61.k com.avito.android.publish.slots.delivery_addresses.c cVar, @Y61.k com.avito.android.publish.slots.delivery_addresses.item.c cVar2) {
        com.avito.android.publish.slots.delivery_addresses.g gVar = new com.avito.android.publish.slots.delivery_addresses.g(this.f241679b.requireContext(), cVar2);
        cVar.a(gVar);
        com.avito.android.lib.util.g.a(gVar);
    }

    @Override // com.avito.android.publish.details.D.a
    public final void r2(@Y61.k Confetti confetti) {
        throw new kotlin.G(null, 1, null);
    }

    @Override // com.avito.android.publish.details.D.a
    public final void r4(int i12) {
        PublishDetailsFragment publishDetailsFragment = this.f241679b;
        PublishIntentFactory publishIntentFactory = publishDetailsFragment.f245622t0;
        if (publishIntentFactory == null) {
            publishIntentFactory = null;
        }
        publishDetailsFragment.startActivity(publishIntentFactory.f(i12));
    }

    @Override // com.avito.android.publish.iac_devices.c
    public final void t(@Y61.k List<IacDevice> list, boolean z12, @Y61.k Y41.l<? super List<IacDevice>, G0> lVar) {
        u3.l<SimpleTestGroupWithNone> lVar2 = this.f241666E;
        if (lVar2 == null) {
            lVar2 = null;
        }
        boolean zB2 = lVar2.f439745a.f439749b.b();
        PublishDetailsFragment publishDetailsFragment = this.f241679b;
        if (zB2) {
            com.avito.android.lib.util.g.a(new com.avito.android.publish.iac_devices.j(publishDetailsFragment.requireContext(), z12, list, lVar));
        } else {
            com.avito.android.lib.util.g.a(new com.avito.android.publish.iac_devices.h(publishDetailsFragment.requireContext(), z12, list, lVar));
        }
    }

    @Override // com.avito.android.publish.video_upload.j
    public final void t1() {
        if (androidx.core.content.d.checkSelfPermission(this.f241679b.requireContext(), "android.permission.CAMERA") == -1) {
            this.f241672K.b("android.permission.CAMERA");
            return;
        }
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        intent.putExtra("android.intent.extra.durationLimit", 180);
        this.f241676O.b(intent);
    }

    @Override // com.avito.android.details.j.b
    public final void t3(@Y61.k com.avito.android.blueprints.selector_card_group_bottom_sheet.k kVar) {
        this.f241679b.t3(kVar);
    }

    @Override // com.avito.android.publish.details.D.a
    public final void u2(@Y61.k String str) {
        PublishDetailsFragment publishDetailsFragment = this.f241679b;
        InterfaceC35845m2 interfaceC35845m2 = publishDetailsFragment.f245626x0;
        if (interfaceC35845m2 == null) {
            interfaceC35845m2 = null;
        }
        publishDetailsFragment.startActivity(interfaceC35845m2.t(Uri.parse(str)));
    }

    @Override // com.avito.android.publish.video_upload.j
    public final void v2(@Y61.k ParameterElement.J j12) {
        VideoUploadLimits videoUploadLimits = new VideoUploadLimits(j12.f117343j, j12.f117344k, j12.f117345l);
        com.avito.android.video_picker.e eVar = this.f241664C;
        if (eVar == null) {
            eVar = null;
        }
        this.f241676O.b(eVar.b(videoUploadLimits));
    }

    @Override // com.avito.android.publish.slots.address_from_profile.f
    public final void w3(@Y61.k AddressParameter.SellerAddresses.DeleteAddressSheet deleteAddressSheet) {
        com.avito.android.publish.slots.address_from_profile.e eVar = new com.avito.android.publish.slots.address_from_profile.e(this.f241679b.requireContext());
        eVar.V(deleteAddressSheet, new a(eVar));
        com.avito.android.lib.util.g.a(eVar);
    }
}
