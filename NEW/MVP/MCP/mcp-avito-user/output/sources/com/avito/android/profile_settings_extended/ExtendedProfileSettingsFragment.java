package com.avito.android.profile_settings_extended;

import Ac0.InterfaceC13011d;
import Cd.C13243a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import cU.s;
import cU0.C27106d;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.ExtendedProfileSettingsScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.AuthSource;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.edit_basic_info.EditBasicInfoFragment;
import com.avito.android.edit_basic_info.EditBasicInfoResult;
import com.avito.android.edit_text_field.EditTextFieldFragment;
import com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c;
import com.avito.android.extended_profile_ui_components.ActionsBottomMenuData;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.D0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.ownership.Owners;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_management_core.images.entity.UploadImageState;
import com.avito.android.profile_settings_extended.ExtendedProfileSettingsFragment;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2Item;
import com.avito.android.profile_settings_extended.adapter.gallery.image.GalleryImageItem;
import com.avito.android.profile_settings_extended.adapter.link_edit.LinkEditItem;
import com.avito.android.profile_settings_extended.di.b;
import com.avito.android.profile_settings_extended.entity.SettingsActionButton;
import com.avito.android.profile_settings_extended.mvi.entity.a;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.search.EntryPoint;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.shortcut_navigation_bar.m0;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.beduin.v2.render.android_view.BeduinView;
import java.util.List;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.flow.n2;
import wc0.C49597b;
import wc0.C49600e;
import wc0.C49602g;
import wc0.C49605j;
import wc0.C49607l;
import yc0.g;
import yc0.k;
import yc0.m;
import z1.AbstractC50339a;

/* compiled from: ExtendedProfileSettingsFragment.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_settings_extended/ExtendedProfileSettingsFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "LFV0/c;", "<init>", "()V", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ExtendedProfileSettingsFragment extends TabBaseFragment implements InterfaceC28477j.b, FV0.c {

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public static final a f228997J0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f228998A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile_settings.u f228999B0;

    /* renamed from: C0, reason: collision with root package name */
    public ScreenPerformanceTracker f229000C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final ZS.b f229001D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.l
    public B f229002E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public Parcelable f229003F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final b f229004G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f229005H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f229006I0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public O f229007t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f229008u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public io.reactivex.rxjava3.core.z<com.avito.android.promoblock.a> f229009v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC13011d f229010w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f229011x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public h31.e<com.avito.android.profile_settings_extended.adapter.gallery.image.j> f229012y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f229013z0;

    /* compiled from: ExtendedProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_settings_extended/ExtendedProfileSettingsFragment$a;", "", "<init>", "()V", "", "KEY_BEDUIN_V2_COLUMN_STATE", "Ljava/lang/String;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ExtendedProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.profile_settings_extended.ExtendedProfileSettingsFragment$a$a, reason: collision with other inner class name */
        public static final class C6967a extends kotlin.jvm.internal.N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f229014l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6967a(String str) {
                super(1);
                this.f229014l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("widgets_to_scroll", this.f229014l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ExtendedProfileSettingsFragment a(@Y61.l String str) {
            ExtendedProfileSettingsFragment extendedProfileSettingsFragment = new ExtendedProfileSettingsFragment();
            C35966w1.a(extendedProfileSettingsFragment, -1, new C6967a(str));
            return extendedProfileSettingsFragment;
        }

        public a() {
        }
    }

    /* compiled from: ExtendedProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/profile_settings_extended/ExtendedProfileSettingsFragment$b", "Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/f;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.f {
        public b() {
        }

        @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.f
        public final void a() {
            a aVar = ExtendedProfileSettingsFragment.f228997J0;
            ExtendedProfileSettingsFragment.this.D5().accept(yc0.i.f443259a);
        }

        @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.f
        public final void b() {
            a aVar = ExtendedProfileSettingsFragment.f228997J0;
            ExtendedProfileSettingsFragment.this.D5().accept(yc0.j.f443260a);
        }
    }

    /* compiled from: ExtendedProfileSettingsFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/di/c;", "invoke", "()Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/di/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c invoke() {
            ExtendedProfileSettingsFragment extendedProfileSettingsFragment = ExtendedProfileSettingsFragment.this;
            c.a aVarJf = ((c.b) C29972i.a(C29972i.b(extendedProfileSettingsFragment), c.b.class)).Jf();
            C33504q c33504q = new C33504q(extendedProfileSettingsFragment);
            Rb0.e eVar = new Rb0.e();
            r rVar = new r(extendedProfileSettingsFragment);
            ScreenPerformanceTracker screenPerformanceTracker = extendedProfileSettingsFragment.f229000C0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            return aVarJf.a(c33504q, extendedProfileSettingsFragment.f229004G0, eVar, rVar, screenPerformanceTracker);
        }
    }

    /* compiled from: ExtendedProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.ExtendedProfileSettingsFragment$onCreate$6", f = "ExtendedProfileSettingsFragment.kt", i = {}, l = {197}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f229017q;

        /* compiled from: ExtendedProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "event", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSettingsFragment f229019b;

            public a(ExtendedProfileSettingsFragment extendedProfileSettingsFragment) {
                this.f229019b = extendedProfileSettingsFragment;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            public final Object emit(@Y61.k Object obj, @Y61.k Continuation<? super G0> continuation) {
                com.avito.android.component.toast.f fVarA;
                BeduinView beduinView;
                a aVar = ExtendedProfileSettingsFragment.f228997J0;
                ExtendedProfileSettingsFragment extendedProfileSettingsFragment = this.f229019b;
                if (obj instanceof yc0.m) {
                    yc0.m mVar = (yc0.m) obj;
                    if (mVar instanceof m.d) {
                        InterfaceC13011d interfaceC13011d = extendedProfileSettingsFragment.f229010w0;
                        InterfaceC13011d interfaceC13011d2 = interfaceC13011d != null ? interfaceC13011d : null;
                        ((m.d) mVar).getClass();
                        AuthSource authSource = AuthSource.f92694c;
                        interfaceC13011d2.d();
                    } else if (mVar instanceof m.o) {
                        Fragment parentFragment = extendedProfileSettingsFragment.getParentFragment();
                        com.avito.android.edit_text_field.v vVar = parentFragment instanceof com.avito.android.edit_text_field.v ? (com.avito.android.edit_text_field.v) parentFragment : null;
                        com.avito.android.edit_text_field.p pVarS0 = vVar != null ? vVar.S0() : null;
                        if (pVarS0 != null) {
                            pVarS0.c(((m.o) mVar).f443290a);
                        }
                    } else if (mVar instanceof m.C50223c) {
                        Fragment parentFragment2 = extendedProfileSettingsFragment.getParentFragment();
                        com.avito.android.edit_address.y yVar = parentFragment2 instanceof com.avito.android.edit_address.y ? (com.avito.android.edit_address.y) parentFragment2 : null;
                        com.avito.android.edit_address.u uVarC4 = yVar != null ? yVar.C4() : null;
                        if (uVarC4 != null) {
                            m.C50223c c50223c = (m.C50223c) mVar;
                            uVarC4.a(c50223c.f443271a, c50223c.f443272b);
                        }
                    } else if (mVar instanceof m.C50222b) {
                        InterfaceC13011d interfaceC13011d3 = extendedProfileSettingsFragment.f229010w0;
                        (interfaceC13011d3 != null ? interfaceC13011d3 : null).h(((m.C50222b) mVar).f443270a);
                    } else if (mVar instanceof m.j) {
                        InterfaceC13011d interfaceC13011d4 = extendedProfileSettingsFragment.f229010w0;
                        InterfaceC13011d interfaceC13011d5 = interfaceC13011d4 != null ? interfaceC13011d4 : null;
                        m.j jVar = (m.j) mVar;
                        jVar.getClass();
                        interfaceC13011d5.j(jVar.f443285c, jVar.f443283a, jVar.f443284b);
                    } else if (mVar instanceof m.f) {
                        InterfaceC13011d interfaceC13011d6 = extendedProfileSettingsFragment.f229010w0;
                        (interfaceC13011d6 != null ? interfaceC13011d6 : null).a(((m.f) mVar).f443274a);
                    } else if (mVar instanceof m.y) {
                        B b12 = extendedProfileSettingsFragment.f229002E0;
                        if (b12 != null) {
                            List<SettingsActionButton> list = ((m.y) mVar).f443310a.f229844e;
                            C49607l c49607l = b12.f228970m;
                            com.avito.android.lib.design.bottom_sheet.d dVar = c49607l.f441717d;
                            if (dVar == null || !dVar.isShowing()) {
                                com.avito.android.lib.design.bottom_sheet.d dVar2 = c49607l.f441717d;
                                if (dVar2 != null) {
                                    dVar2.dismiss();
                                }
                                com.avito.android.lib.design.bottom_sheet.d dVar3 = new com.avito.android.lib.design.bottom_sheet.d(c49607l.f441714a, 0, 2, null);
                                dVar3.setContentView(R.layout.ext_profile_settings_setting_actions_menu);
                                dVar3.S(C35835l0.g(dVar3.getContext()).y);
                                com.avito.android.lib.design.bottom_sheet.d.M(dVar3, null, false, true, 7);
                                c49607l.f441718e = (LinearLayout) dVar3.findViewById(R.id.actions_container);
                                dVar3.setOnDismissListener(new com.avito.android.publish.start_publish.C(c49607l, 11));
                                com.avito.android.lib.util.g.a(dVar3);
                                c49607l.f441717d = dVar3;
                                c49607l.a(list);
                            } else {
                                c49607l.a(list);
                            }
                        }
                    } else if (mVar instanceof m.k) {
                        InterfaceC13011d interfaceC13011d7 = extendedProfileSettingsFragment.f229010w0;
                        (interfaceC13011d7 != null ? interfaceC13011d7 : null).f(((m.k) mVar).f443286a);
                    } else if (mVar instanceof m.v) {
                        B b13 = extendedProfileSettingsFragment.f229002E0;
                        if (b13 != null) {
                            LinkEditItem linkEditItem = ((m.v) mVar).f443306a;
                            C49602g c49602g = b13.f228971n;
                            com.avito.android.lib.design.bottom_sheet.d dVar4 = c49602g.f441694d;
                            if (dVar4 == null || !dVar4.isShowing()) {
                                com.avito.android.lib.design.bottom_sheet.d dVar5 = c49602g.f441694d;
                                if (dVar5 != null) {
                                    dVar5.dismiss();
                                }
                                com.avito.android.lib.design.bottom_sheet.d dVar6 = new com.avito.android.lib.design.bottom_sheet.d(c49602g.f441691a, 0, 2, null);
                                dVar6.setContentView(R.layout.ext_profile_settings_link_edit_actions_menu);
                                dVar6.S(C35835l0.g(dVar6.getContext()).y);
                                com.avito.android.lib.design.bottom_sheet.d.M(dVar6, null, false, true, 7);
                                c49602g.f441695e = (LinearLayout) dVar6.findViewById(R.id.actions_container);
                                dVar6.setOnDismissListener(new com.avito.android.publish.start_publish.C(c49602g, 9));
                                com.avito.android.lib.util.g.a(dVar6);
                                c49602g.f441694d = dVar6;
                                c49602g.a(linkEditItem);
                            } else {
                                c49602g.a(linkEditItem);
                            }
                        }
                    } else if (mVar instanceof m.p) {
                        InterfaceC13011d interfaceC13011d8 = extendedProfileSettingsFragment.f229010w0;
                        m.p pVar = (m.p) mVar;
                        (interfaceC13011d8 != null ? interfaceC13011d8 : null).i(pVar.f443292b, pVar.f443291a);
                    } else if (mVar instanceof m.i) {
                        InterfaceC13011d interfaceC13011d9 = extendedProfileSettingsFragment.f229010w0;
                        m.i iVar = (m.i) mVar;
                        (interfaceC13011d9 != null ? interfaceC13011d9 : null).g(iVar.f443279b, iVar.f443280c, iVar.f443278a, iVar.f443281d, iVar.f443282e);
                    } else if (mVar instanceof m.h) {
                        InterfaceC13011d interfaceC13011d10 = extendedProfileSettingsFragment.f229010w0;
                        m.h hVar = (m.h) mVar;
                        (interfaceC13011d10 != null ? interfaceC13011d10 : null).e(hVar.f443277b, hVar.f443276a);
                    } else if (mVar instanceof m.u) {
                        B b14 = extendedProfileSettingsFragment.f229002E0;
                        if (b14 != null) {
                            m.u uVar = (m.u) mVar;
                            GalleryImageItem galleryImageItem = uVar.f443301a;
                            SwipeRefreshLayout swipeRefreshLayout = b14.f228967j;
                            swipeRefreshLayout.setEnabled(true);
                            View view = b14.f228977t;
                            View view2 = b14.f228958a;
                            if (view != null) {
                                ((FrameLayout) view2).removeView(view);
                                b14.f228977t = null;
                            }
                            swipeRefreshLayout.setEnabled(false);
                            com.avito.android.profile_settings_extended.adapter.gallery.image.j jVar2 = b14.f228964g.get();
                            Context context = view2.getContext();
                            jVar2.getClass();
                            View viewInflate = LayoutInflater.from(context).inflate(R.layout.ext_profile_settings_image_item, (ViewGroup) null);
                            com.avito.android.profile_settings_extended.adapter.gallery.image.h hVar2 = new com.avito.android.profile_settings_extended.adapter.gallery.image.h(viewInflate);
                            com.avito.android.profile_settings_extended.adapter.gallery.image.e eVar = jVar2.f229447a;
                            eVar.getClass();
                            GalleryImageItem.ScaleType scaleType = galleryImageItem.f229422e;
                            UploadImage uploadImage = galleryImageItem.f229421d;
                            com.avito.android.profile_settings_extended.adapter.gallery.image.e.k(hVar2, uploadImage, scaleType);
                            UploadImageState f226677c = uploadImage.getF226677c();
                            eVar.f229435c.getClass();
                            com.avito.android.profile_management_core.images.entity.d.a(hVar2, f226677c);
                            hVar2.xT(true);
                            D6.H(hVar2.f229439b.findViewById(R.id.placeholder_mode_fill));
                            b14.f228977t = viewInflate;
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(uVar.f443304d, uVar.f443305e);
                            layoutParams.setMargins(uVar.f443302b, uVar.f443303c, 0, 0);
                            viewInflate.setLayoutParams(layoutParams);
                            ((FrameLayout) view2).addView(viewInflate, 0);
                        }
                    } else if (mVar instanceof m.C50221a) {
                        B b15 = extendedProfileSettingsFragment.f229002E0;
                        if (b15 != null) {
                            b15.f228967j.setEnabled(true);
                            View view3 = b15.f228977t;
                            if (view3 != null) {
                                ((FrameLayout) b15.f228958a).removeView(view3);
                                b15.f228977t = null;
                            }
                        }
                    } else if (mVar instanceof m.q) {
                        B b16 = extendedProfileSettingsFragment.f229002E0;
                        if (b16 != null && (beduinView = b16.f228975r) != null) {
                            beduinView.post(new A(b16, 0));
                        }
                    } else if (mVar instanceof m.r) {
                        B b17 = extendedProfileSettingsFragment.f229002E0;
                        if (b17 != null) {
                            List<String> list2 = ((m.r) mVar).f443294a;
                            C33479m c33479m = new C33479m(extendedProfileSettingsFragment);
                            BeduinView beduinView2 = b17.f228975r;
                            if (beduinView2 != null) {
                                beduinView2.postDelayed(new E(b17, list2, c33479m), 200L);
                            }
                        }
                    } else if (mVar instanceof m.t) {
                        B b18 = extendedProfileSettingsFragment.f229002E0;
                        if (b18 != null) {
                            m.t tVar = (m.t) mVar;
                            com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, b18.f228958a.getContext(), new I(tVar.f443296a, tVar.f443297b, tVar.f443298c, tVar.f443299d, new C33501n(extendedProfileSettingsFragment, mVar))));
                        }
                    } else if (mVar instanceof m.s) {
                        B b19 = extendedProfileSettingsFragment.f229002E0;
                        if (b19 != null) {
                            com.avito.android.extended_profile_ui_components.p.c(com.avito.android.extended_profile_ui_components.p.f153373a, b19.f228958a, ((m.s) mVar).f443295a, b19.f228961d, null);
                        }
                    } else if (mVar instanceof m.z) {
                        B b22 = extendedProfileSettingsFragment.f229002E0;
                        if (b22 != null) {
                            m.z zVar = (m.z) mVar;
                            String str = zVar.f443311a;
                            boolean z12 = zVar.f443312b;
                            if (z12) {
                                f.c.f125255c.getClass();
                                fVarA = f.c.a.a(null, null);
                            } else {
                                fVarA = f.a.f125253a;
                            }
                            com.avito.android.component.toast.c.e(com.avito.android.component.toast.c.f125244a, b22.f228958a, com.avito.android.printable_text.b.f(str), null, null, null, fVarA, 0, z12 ? ToastBarPosition.f181046d : ToastBarPosition.f181047e, false, false, null, null, b22.f228961d, 4014);
                        }
                    } else if (mVar instanceof m.l) {
                        InterfaceC13011d interfaceC13011d11 = extendedProfileSettingsFragment.f229010w0;
                        (interfaceC13011d11 != null ? interfaceC13011d11 : null).b(((m.l) mVar).f443287a);
                    } else if (mVar instanceof m.C12912m) {
                        Fragment parentFragment3 = extendedProfileSettingsFragment.getParentFragment();
                        com.avito.android.select_field.i iVar2 = parentFragment3 instanceof com.avito.android.select_field.i ? (com.avito.android.select_field.i) parentFragment3 : null;
                        com.avito.android.select_field.e eVarG0 = iVar2 != null ? iVar2.G0() : null;
                        if (eVarG0 != null) {
                            eVarG0.b(((m.C12912m) mVar).f443288a);
                        }
                    } else if (mVar instanceof m.g) {
                        Fragment parentFragment4 = extendedProfileSettingsFragment.getParentFragment();
                        com.avito.android.edit_count_field.h hVar3 = parentFragment4 instanceof com.avito.android.edit_count_field.h ? (com.avito.android.edit_count_field.h) parentFragment4 : null;
                        com.avito.android.edit_count_field.d dVarC4 = hVar3 != null ? hVar3.c4() : null;
                        if (dVarC4 != null) {
                            dVarC4.a(((m.g) mVar).f443275a);
                        }
                    } else if (mVar instanceof m.w) {
                        extendedProfileSettingsFragment.D5().accept(new InterfaceC40047a.e(((m.w) mVar).f443307a, extendedProfileSettingsFragment.f229001D0));
                    } else if (mVar instanceof m.C) {
                        B b23 = extendedProfileSettingsFragment.f229002E0;
                        if (b23 != null) {
                            b23.a();
                        }
                    } else if (mVar instanceof m.n) {
                        m.n nVar = (m.n) mVar;
                        nVar.getClass();
                        InterfaceC35845m2 interfaceC35845m2 = extendedProfileSettingsFragment.f229013z0;
                        if (interfaceC35845m2 == null) {
                            interfaceC35845m2 = null;
                        }
                        extendedProfileSettingsFragment.startActivity(Intent.createChooser(interfaceC35845m2.f(null, nVar.f443289a), null));
                    } else if (mVar instanceof m.e) {
                        Fragment parentFragment5 = extendedProfileSettingsFragment.getParentFragment();
                        com.avito.android.edit_basic_info.l lVar = parentFragment5 instanceof com.avito.android.edit_basic_info.l ? (com.avito.android.edit_basic_info.l) parentFragment5 : null;
                        com.avito.android.edit_basic_info.h hVarI4 = lVar != null ? lVar.i4() : null;
                        if (hVarI4 != null) {
                            hVarI4.c(((m.e) mVar).f443273a);
                        }
                    } else if (mVar instanceof m.A) {
                        InterfaceC13011d interfaceC13011d12 = extendedProfileSettingsFragment.f229010w0;
                        (interfaceC13011d12 != null ? interfaceC13011d12 : null).k(((m.A) mVar).f443266a);
                    } else if (mVar instanceof m.B) {
                        InterfaceC13011d interfaceC13011d13 = extendedProfileSettingsFragment.f229010w0;
                        (interfaceC13011d13 != null ? interfaceC13011d13 : null).c(((m.B) mVar).f443267a);
                    } else if (mVar instanceof m.x) {
                        m.x xVar = (m.x) mVar;
                        View viewFindViewById = extendedProfileSettingsFragment.requireView().findViewById(xVar.f443308a);
                        if (viewFindViewById != null && viewFindViewById.getVisibility() == 0) {
                            m0 m0Var = m0.f283432a;
                            BasicInfoV2Item.Onboarding onboarding = xVar.f443309b;
                            m0.c(m0Var, viewFindViewById, new EntryPoint.Onboarding(null, onboarding.f229229d, onboarding.f229228c, onboarding.f229230e, null, null, null, 113, null), C33502o.f230774l, new C33503p(extendedProfileSettingsFragment, onboarding));
                        }
                    }
                } else {
                    boolean z13 = obj instanceof BeduinOneTimeEvent;
                }
                return G0.f406611a;
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ExtendedProfileSettingsFragment.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f229017q;
            if (i12 == 0) {
                C42729a0.b(obj);
                a aVar = ExtendedProfileSettingsFragment.f228997J0;
                ExtendedProfileSettingsFragment extendedProfileSettingsFragment = ExtendedProfileSettingsFragment.this;
                J jD5 = extendedProfileSettingsFragment.D5();
                a aVar2 = new a(extendedProfileSettingsFragment);
                this.f229017q = 1;
                if (jD5.f229055P.collect(aVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.ExtendedProfileSettingsFragment$onViewCreated$1$1", f = "ExtendedProfileSettingsFragment.kt", i = {}, l = {265}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f229020q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ B f229022s;

        /* compiled from: ExtendedProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile_settings_extended.ExtendedProfileSettingsFragment$onViewCreated$1$1$1", f = "ExtendedProfileSettingsFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f229023q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSettingsFragment f229024r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ B f229025s;

            /* compiled from: ExtendedProfileSettingsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.profile_settings_extended.ExtendedProfileSettingsFragment$onViewCreated$1$1$1$1", f = "ExtendedProfileSettingsFragment.kt", i = {}, l = {266}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.profile_settings_extended.ExtendedProfileSettingsFragment$e$a$a, reason: collision with other inner class name */
            public static final class C6968a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f229026q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ExtendedProfileSettingsFragment f229027r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ B f229028s;

                /* compiled from: ExtendedProfileSettingsFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyc0/l;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(Lyc0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.profile_settings_extended.ExtendedProfileSettingsFragment$e$a$a$a, reason: collision with other inner class name */
                public static final class C6969a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ B f229029b;

                    public C6969a(B b12) {
                        this.f229029b = b12;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) throws Resources.NotFoundException {
                        boolean z12;
                        boolean z13;
                        com.avito.android.lib.design.bottom_sheet.d dVar;
                        com.avito.android.lib.design.bottom_sheet.d dVar2;
                        com.avito.android.lib.design.bottom_sheet.d dVar3;
                        Spinner spinner;
                        AlignmentFrameLayout alignmentFrameLayout;
                        Spinner spinner2;
                        AlignmentFrameLayout alignmentFrameLayout2;
                        String string;
                        AttributedText attributedText;
                        BeduinView beduinView;
                        yc0.l lVar = (yc0.l) obj;
                        B b12 = this.f229029b;
                        ScreenPerformanceTracker screenPerformanceTracker = b12.f228961d;
                        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
                        com.avito.android.profile_settings_extended.mvi.entity.a aVar = lVar.f443264a;
                        Throwable th2 = aVar.f230662c;
                        SwipeRefreshLayout swipeRefreshLayout = b12.f228967j;
                        com.avito.android.extended_profile_ui_components.l lVar2 = b12.f228974q;
                        if (th2 != null) {
                            lVar2.c(th2, screenPerformanceTracker);
                            swipeRefreshLayout.setRefreshing(false);
                            J.a.f90383b.getClass();
                            ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, J.a.C2676a.c(th2), null, 5);
                        } else if (aVar.f230663d) {
                            lVar2.d();
                            swipeRefreshLayout.setRefreshing(false);
                        } else {
                            boolean z14 = b12.f228978u;
                            View view = b12.f228958a;
                            if (z14) {
                                z12 = true;
                                z13 = false;
                            } else {
                                s.a aVarFd = ((s.b) C29972i.a(C29972i.b(view.getContext()), s.b.class)).fd();
                                Context context = view.getContext();
                                com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c cVar = b12.f228963f;
                                cU.t tVarA = aVarFd.a(context, b12.f228961d, b12.f228962e, new cU.m(cVar), b12.f228965h);
                                com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.i iVarG = cVar.g();
                                b12.f228980w = iVarG;
                                if (iVarG != null) {
                                    z12 = true;
                                    iVarG.f151397j = new D(1, b12, B.class, "initBeduinRecyclerView", "initBeduinRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V", 0);
                                } else {
                                    z12 = true;
                                }
                                BeduinView beduinView2 = (BeduinView) tVarA.c().get();
                                b12.f228975r = beduinView2;
                                z13 = false;
                                b12.f228976s.addView(beduinView2, 0);
                                b12.f228978u = z12;
                            }
                            lVar2.a();
                            swipeRefreshLayout.setRefreshing(z13);
                            D6.H(b12.f228975r);
                            AbstractC40048c abstractC40048c = lVar.f443265b;
                            if ((abstractC40048c instanceof AbstractC40048c.a ? (AbstractC40048c.a) abstractC40048c : null) != null && (beduinView = b12.f228975r) != null) {
                                beduinView.b(((AbstractC40048c.a) abstractC40048c).getF395211c());
                            }
                            b12.a();
                            final C49600e c49600e = b12.f228968k;
                            a.c cVar2 = aVar.f230667h;
                            if (cVar2 != null) {
                                if (cVar2.f230679d) {
                                    string = view.getContext().getString(R.string.extended_profile_settings_released_status_title);
                                    attributedText = new AttributedText(view.getContext().getString(R.string.extended_profile_settings_released_status_description), C42784z0.f406748b, 0, 4, null);
                                } else {
                                    string = cVar2.f230677b;
                                    attributedText = cVar2.f230678c;
                                }
                                com.avito.android.lib.design.bottom_sheet.d dVar4 = c49600e.f441684d;
                                boolean z15 = cVar2.f230676a;
                                if (dVar4 == null || dVar4.isShowing() != z12) {
                                    com.avito.android.lib.design.bottom_sheet.d dVar5 = c49600e.f441684d;
                                    if (dVar5 != null) {
                                        dVar5.dismiss();
                                    }
                                    com.avito.android.lib.design.bottom_sheet.d dVar6 = new com.avito.android.lib.design.bottom_sheet.d(c49600e.f441681a, 0, 2, null);
                                    dVar6.setContentView(R.layout.ext_profile_settings_image_menu);
                                    dVar6.S(C35835l0.g(dVar6.getContext()).y);
                                    com.avito.android.lib.design.bottom_sheet.d.M(dVar6, null, false, z12, 7);
                                    c49600e.f441685e = (TextView) dVar6.findViewById(R.id.title);
                                    TextView textView = (TextView) dVar6.findViewById(R.id.description);
                                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                                    c49600e.f441686f = textView;
                                    final int i12 = 0;
                                    ((ListItem) dVar6.findViewById(R.id.view_list_item)).setOnClickListener(new View.OnClickListener() { // from class: wc0.d
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            switch (i12) {
                                                case 0:
                                                    c49600e.f441682b.invoke(g.e.f443256a);
                                                    break;
                                                default:
                                                    c49600e.f441682b.invoke(g.b.f443253a);
                                                    break;
                                            }
                                        }
                                    });
                                    ListItem listItem = (ListItem) dVar6.findViewById(R.id.delete_list_item);
                                    final int i13 = 1;
                                    listItem.setOnClickListener(new View.OnClickListener() { // from class: wc0.d
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            switch (i13) {
                                                case 0:
                                                    c49600e.f441682b.invoke(g.e.f443256a);
                                                    break;
                                                default:
                                                    c49600e.f441682b.invoke(g.b.f443253a);
                                                    break;
                                            }
                                        }
                                    });
                                    View viewFindViewById = listItem.findViewById(R.id.design_left_container);
                                    if (viewFindViewById == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout");
                                    }
                                    c49600e.f441688h = (AlignmentFrameLayout) viewFindViewById;
                                    View viewFindViewById2 = listItem.findViewById(R.id.design_item_left_icon);
                                    if (viewFindViewById2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                                    }
                                    c49600e.f441687g = (ImageView) viewFindViewById2;
                                    dVar6.setOnDismissListener(new com.avito.android.publish.start_publish.C(c49600e, 8));
                                    com.avito.android.lib.util.g.a(dVar6);
                                    c49600e.f441684d = dVar6;
                                    c49600e.a(attributedText, string, z15);
                                } else {
                                    c49600e.a(attributedText, string, z15);
                                }
                            } else {
                                com.avito.android.lib.design.bottom_sheet.d dVar7 = c49600e.f441684d;
                                if (dVar7 != null && dVar7.isShowing() == z12 && (dVar = c49600e.f441684d) != null) {
                                    dVar.dismiss();
                                }
                            }
                            C49605j c49605j = b12.f228972o;
                            a.d dVar8 = aVar.f230670k;
                            if (dVar8 != null) {
                                com.avito.android.lib.design.bottom_sheet.d dVar9 = c49605j.f441701c;
                                if (dVar9 == null || dVar9.isShowing() != z12) {
                                    com.avito.android.lib.design.bottom_sheet.d dVar10 = c49605j.f441701c;
                                    if (dVar10 != null) {
                                        dVar10.dismiss();
                                    }
                                    com.avito.android.lib.design.bottom_sheet.d dVar11 = new com.avito.android.lib.design.bottom_sheet.d(c49605j.f441699a, 0, 2, null);
                                    dVar11.setContentView(R.layout.ext_profile_settings_selection_menu);
                                    dVar11.S(C35835l0.g(dVar11.getContext()).y);
                                    com.avito.android.lib.design.bottom_sheet.d.M(dVar11, null, false, z12, 7);
                                    c49605j.f441702d = (TextView) dVar11.findViewById(R.id.selection_menu_title);
                                    c49605j.f441703e = (TextView) dVar11.findViewById(R.id.selection_menu_description);
                                    c49605j.f441704f = dVar11.findViewById(R.id.selection_menu_set_public_action);
                                    c49605j.f441705g = (TextView) dVar11.findViewById(R.id.selection_menu_set_public_title);
                                    c49605j.f441706h = dVar11.findViewById(R.id.selection_menu_set_public_progress);
                                    c49605j.f441707i = (ImageView) dVar11.findViewById(R.id.selection_menu_set_public_icon);
                                    c49605j.f441708j = dVar11.findViewById(R.id.selection_menu_edit_action);
                                    c49605j.f441709k = dVar11.findViewById(R.id.selection_menu_copy_action);
                                    c49605j.f441710l = dVar11.findViewById(R.id.selection_menu_show_action);
                                    c49605j.f441711m = dVar11.findViewById(R.id.selection_menu_remove_action);
                                    c49605j.f441712n = dVar11.findViewById(R.id.selection_menu_remove_progress);
                                    c49605j.f441713o = dVar11.findViewById(R.id.selection_menu_remove_icon);
                                    dVar11.setOnDismissListener(new com.avito.android.publish.start_publish.C(c49605j, 10));
                                    com.avito.android.lib.util.g.a(dVar11);
                                    c49605j.f441701c = dVar11;
                                    c49605j.a(dVar8);
                                } else {
                                    c49605j.a(dVar8);
                                }
                            } else {
                                com.avito.android.lib.design.bottom_sheet.d dVar12 = c49605j.f441701c;
                                if (dVar12 != null && dVar12.isShowing() == z12 && (dVar2 = c49605j.f441701c) != null) {
                                    dVar2.dismiss();
                                }
                            }
                            C49597b c49597b = b12.f228969l;
                            a.C7018a c7018a = aVar.f230669j;
                            if (c7018a != null) {
                                com.avito.android.lib.design.bottom_sheet.d dVar13 = c49597b.f441673c;
                                Context context2 = c49597b.f441671a;
                                if (dVar13 == null || dVar13.isShowing() != z12) {
                                    com.avito.android.lib.design.bottom_sheet.d dVar14 = c49597b.f441673c;
                                    if (dVar14 != null) {
                                        dVar14.dismiss();
                                    }
                                    com.avito.android.lib.design.bottom_sheet.d dVar15 = new com.avito.android.lib.design.bottom_sheet.d(context2, 0, 2, null);
                                    dVar15.setContentView(R.layout.ext_profile_settings_common_value_menu);
                                    dVar15.S(C35835l0.g(dVar15.getContext()).y);
                                    com.avito.android.lib.design.bottom_sheet.d.M(dVar15, null, false, z12, 7);
                                    c49597b.f441676f = (ListItem) dVar15.findViewById(R.id.edit_list_item);
                                    ListItem listItem2 = (ListItem) dVar15.findViewById(R.id.delete_list_item);
                                    View viewFindViewById3 = listItem2.findViewById(R.id.design_left_container);
                                    if (viewFindViewById3 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.layout.AlignmentFrameLayout");
                                    }
                                    c49597b.f441677g = (AlignmentFrameLayout) viewFindViewById3;
                                    View viewFindViewById4 = listItem2.findViewById(R.id.design_item_left_icon);
                                    if (viewFindViewById4 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                                    }
                                    c49597b.f441674d = (ImageView) viewFindViewById4;
                                    c49597b.f441675e = listItem2;
                                    dVar15.setOnDismissListener(new com.avito.android.publish.start_publish.C(c49597b, 7));
                                    com.avito.android.lib.util.g.a(dVar15);
                                    c49597b.f441673c = dVar15;
                                }
                                ListItem listItem3 = c49597b.f441676f;
                                if (listItem3 != null) {
                                    listItem3.setOnClickListener(new ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.c(5, c49597b, c7018a.f230674c));
                                }
                                ListItem listItem4 = c49597b.f441675e;
                                if (listItem4 != null) {
                                    listItem4.setOnClickListener(new ru.cyberity.cbr.core.widget.autocompletePhone.bottomsheet.c(6, c49597b, c7018a.f230675d));
                                }
                                boolean z16 = c7018a.f230673b;
                                Object obj2 = c49597b.f441678h;
                                if (z16) {
                                    D6.h(c49597b.f441675e);
                                    D6.h(c49597b.f441676f);
                                    D6.w(c49597b.f441674d);
                                    AlignmentFrameLayout alignmentFrameLayout3 = c49597b.f441677g;
                                    if (alignmentFrameLayout3 != null && (spinner2 = (Spinner) alignmentFrameLayout3.findViewWithTag(obj2)) != null && (alignmentFrameLayout2 = c49597b.f441677g) != null) {
                                        alignmentFrameLayout2.removeView(spinner2);
                                    }
                                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                                    layoutParams.gravity = 19;
                                    Spinner spinner3 = new Spinner(context2);
                                    spinner3.setLayoutParams(layoutParams);
                                    spinner3.setTag(obj2);
                                    spinner3.setAppearance(R.style.Design_Widget_Spinner_Dark_Medium);
                                    AlignmentFrameLayout alignmentFrameLayout4 = c49597b.f441677g;
                                    if (alignmentFrameLayout4 != null) {
                                        alignmentFrameLayout4.addView(spinner3);
                                    }
                                } else {
                                    D6.H(c49597b.f441674d);
                                    AlignmentFrameLayout alignmentFrameLayout5 = c49597b.f441677g;
                                    if (alignmentFrameLayout5 != null && (spinner = (Spinner) alignmentFrameLayout5.findViewWithTag(obj2)) != null && (alignmentFrameLayout = c49597b.f441677g) != null) {
                                        alignmentFrameLayout.removeView(spinner);
                                    }
                                    D6.k(c49597b.f441675e);
                                    D6.k(c49597b.f441676f);
                                }
                            } else {
                                com.avito.android.lib.design.bottom_sheet.d dVar16 = c49597b.f441673c;
                                if (dVar16 != null && dVar16.isShowing() == z12 && (dVar3 = c49597b.f441673c) != null) {
                                    dVar3.dismiss();
                                }
                            }
                            com.avito.android.extended_profile_ui_components.d dVar17 = b12.f228973p;
                            ActionsBottomMenuData<yc0.k> actionsBottomMenuData = aVar.f230671l;
                            if (actionsBottomMenuData != null) {
                                dVar17.c(actionsBottomMenuData);
                            } else {
                                dVar17.a();
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6968a(ExtendedProfileSettingsFragment extendedProfileSettingsFragment, B b12, Continuation<? super C6968a> continuation) {
                    super(2, continuation);
                    this.f229027r = extendedProfileSettingsFragment;
                    this.f229028s = b12;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6968a(this.f229027r, this.f229028s, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                    return ((C6968a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f229026q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = ExtendedProfileSettingsFragment.f228997J0;
                        n2<yc0.l> state = this.f229027r.D5().getState();
                        C6969a c6969a = new C6969a(this.f229028s);
                        this.f229026q = 1;
                        if (state.collect(c6969a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* compiled from: ExtendedProfileSettingsFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.profile_settings_extended.ExtendedProfileSettingsFragment$onViewCreated$1$1$1$2", f = "ExtendedProfileSettingsFragment.kt", i = {}, l = {268}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f229030q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ExtendedProfileSettingsFragment f229031r;

                /* compiled from: ExtendedProfileSettingsFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/promoblock/a;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/promoblock/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.profile_settings_extended.ExtendedProfileSettingsFragment$e$a$b$a, reason: collision with other inner class name */
                public static final class C6970a<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ExtendedProfileSettingsFragment f229032b;

                    public C6970a(ExtendedProfileSettingsFragment extendedProfileSettingsFragment) {
                        this.f229032b = extendedProfileSettingsFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        a aVar = ExtendedProfileSettingsFragment.f228997J0;
                        this.f229032b.D5().accept(new yc0.u((com.avito.android.promoblock.a) obj));
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(ExtendedProfileSettingsFragment extendedProfileSettingsFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f229031r = extendedProfileSettingsFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f229031r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f229030q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ExtendedProfileSettingsFragment extendedProfileSettingsFragment = this.f229031r;
                        io.reactivex.rxjava3.core.z<com.avito.android.promoblock.a> zVar = extendedProfileSettingsFragment.f229009v0;
                        if (zVar == null) {
                            zVar = null;
                        }
                        InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a(zVar);
                        C6970a c6970a = new C6970a(extendedProfileSettingsFragment);
                        this.f229030q = 1;
                        if (((AbstractC43168f) interfaceC43160iA).collect(c6970a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ExtendedProfileSettingsFragment extendedProfileSettingsFragment, B b12, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f229024r = extendedProfileSettingsFragment;
                this.f229025s = b12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f229024r, this.f229025s, continuation);
                aVar.f229023q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f229023q;
                B b12 = this.f229025s;
                ExtendedProfileSettingsFragment extendedProfileSettingsFragment = this.f229024r;
                C43259k.d(t12, null, null, new C6968a(extendedProfileSettingsFragment, b12, null), 3);
                C43259k.d(t12, null, null, new b(extendedProfileSettingsFragment, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(B b12, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f229022s = b12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ExtendedProfileSettingsFragment.this.new e(this.f229022s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f229020q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                B b12 = this.f229022s;
                ExtendedProfileSettingsFragment extendedProfileSettingsFragment = ExtendedProfileSettingsFragment.this;
                a aVar = new a(extendedProfileSettingsFragment, b12, null);
                this.f229020q = 1;
                if (C23056p0.b(extendedProfileSettingsFragment, state, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyc0/k;", "it", "Lkotlin/G0;", "invoke", "(Lyc0/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<yc0.k, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(yc0.k kVar) {
            a aVar = ExtendedProfileSettingsFragment.f228997J0;
            ExtendedProfileSettingsFragment.this.D5().accept(kVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f229034l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f229034l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f229034l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ExtendedProfileSettingsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f229036l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f229036l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f229036l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f229037l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f229037l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f229037l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f229038l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f229038l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f229038l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ExtendedProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/J;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/profile_settings_extended/J;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<J> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final J invoke() {
            O o12 = ExtendedProfileSettingsFragment.this.f229007t0;
            if (o12 == null) {
                o12 = null;
            }
            return (J) o12.get();
        }
    }

    public ExtendedProfileSettingsFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f229008u0 = new O0(kotlin.jvm.internal.m0.f406844a.b(J.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f229001D0 = new ZS.b(ExtendedProfileSettingsScreen.f90352d, Owners.f210540t, (String) null, 4, (C42822w) null);
        this.f229004G0 = new b();
        this.f229005H0 = C42727D.c(new c());
        this.f229006I0 = new NavigationState(false, null, 2, null);
    }

    public static void E5(ExtendedProfileSettingsFragment extendedProfileSettingsFragment, boolean z12, String str, int i12) {
        if ((i12 & 2) != 0) {
            str = null;
        }
        boolean z13 = (i12 & 4) == 0;
        if (!z12) {
            extendedProfileSettingsFragment.getClass();
            return;
        }
        if (z13) {
            com.avito.android.profile_settings.u uVar = extendedProfileSettingsFragment.f228999B0;
            (uVar != null ? uVar : null).a();
        }
        extendedProfileSettingsFragment.D5().accept(new k.b(false, str));
    }

    @Override // FV0.a
    @Y61.k
    public final FV0.f A1() {
        return FV0.g.f4722a;
    }

    public final J D5() {
        return (J) this.f229008u0.getValue();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        ScreenPerformanceTracker screenPerformanceTracker = this.f229000C0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        return new com.avito.android.extended_profile_ui_components.s(activityC22955mRequireActivity, null, screenPerformanceTracker);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        final int i12 = 0;
        getParentFragmentManager().p0("select_field_result_key", this, new androidx.fragment.app.C(this) { // from class: com.avito.android.profile_settings_extended.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSettingsFragment f230375c;

            {
                this.f230375c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                ExtendedProfileSettingsFragment extendedProfileSettingsFragment = this.f230375c;
                switch (i12) {
                    case 0:
                        ExtendedProfileSettingsFragment.a aVar = ExtendedProfileSettingsFragment.f228997J0;
                        EditTextFieldFragment.f146886n0.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("edit_text_field_result_has_changed"), null, 2);
                        break;
                    case 1:
                        ExtendedProfileSettingsFragment.a aVar2 = ExtendedProfileSettingsFragment.f228997J0;
                        EditTextFieldFragment.f146886n0.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("edit_text_field_result_has_changed"), null, 2);
                        break;
                    case 2:
                        ExtendedProfileSettingsFragment.a aVar3 = ExtendedProfileSettingsFragment.f228997J0;
                        EditTextFieldFragment.f146886n0.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("edit_text_field_result_has_changed"), null, 2);
                        break;
                    case 3:
                        ExtendedProfileSettingsFragment.a aVar4 = ExtendedProfileSettingsFragment.f228997J0;
                        com.avito.android.edit_address.v.f146007d.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("address_result_has_changed", false), null, 6);
                        break;
                    default:
                        ExtendedProfileSettingsFragment.a aVar5 = ExtendedProfileSettingsFragment.f228997J0;
                        EditBasicInfoFragment.f146014u0.getClass();
                        EditBasicInfoResult editBasicInfoResult = (EditBasicInfoResult) bundle2.getParcelable("edit_basic_info_result");
                        if (editBasicInfoResult != null) {
                            ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, editBasicInfoResult.f146031b, editBasicInfoResult.f146032c, 4);
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        getParentFragmentManager().p0("extended_edit_count_field_result_key", this, new androidx.fragment.app.C(this) { // from class: com.avito.android.profile_settings_extended.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSettingsFragment f230375c;

            {
                this.f230375c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                ExtendedProfileSettingsFragment extendedProfileSettingsFragment = this.f230375c;
                switch (i13) {
                    case 0:
                        ExtendedProfileSettingsFragment.a aVar = ExtendedProfileSettingsFragment.f228997J0;
                        EditTextFieldFragment.f146886n0.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("edit_text_field_result_has_changed"), null, 2);
                        break;
                    case 1:
                        ExtendedProfileSettingsFragment.a aVar2 = ExtendedProfileSettingsFragment.f228997J0;
                        EditTextFieldFragment.f146886n0.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("edit_text_field_result_has_changed"), null, 2);
                        break;
                    case 2:
                        ExtendedProfileSettingsFragment.a aVar3 = ExtendedProfileSettingsFragment.f228997J0;
                        EditTextFieldFragment.f146886n0.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("edit_text_field_result_has_changed"), null, 2);
                        break;
                    case 3:
                        ExtendedProfileSettingsFragment.a aVar4 = ExtendedProfileSettingsFragment.f228997J0;
                        com.avito.android.edit_address.v.f146007d.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("address_result_has_changed", false), null, 6);
                        break;
                    default:
                        ExtendedProfileSettingsFragment.a aVar5 = ExtendedProfileSettingsFragment.f228997J0;
                        EditBasicInfoFragment.f146014u0.getClass();
                        EditBasicInfoResult editBasicInfoResult = (EditBasicInfoResult) bundle2.getParcelable("edit_basic_info_result");
                        if (editBasicInfoResult != null) {
                            ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, editBasicInfoResult.f146031b, editBasicInfoResult.f146032c, 4);
                            break;
                        }
                        break;
                }
            }
        });
        final int i14 = 2;
        getParentFragmentManager().p0("extended_edit_text_field_result_key", this, new androidx.fragment.app.C(this) { // from class: com.avito.android.profile_settings_extended.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSettingsFragment f230375c;

            {
                this.f230375c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                ExtendedProfileSettingsFragment extendedProfileSettingsFragment = this.f230375c;
                switch (i14) {
                    case 0:
                        ExtendedProfileSettingsFragment.a aVar = ExtendedProfileSettingsFragment.f228997J0;
                        EditTextFieldFragment.f146886n0.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("edit_text_field_result_has_changed"), null, 2);
                        break;
                    case 1:
                        ExtendedProfileSettingsFragment.a aVar2 = ExtendedProfileSettingsFragment.f228997J0;
                        EditTextFieldFragment.f146886n0.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("edit_text_field_result_has_changed"), null, 2);
                        break;
                    case 2:
                        ExtendedProfileSettingsFragment.a aVar3 = ExtendedProfileSettingsFragment.f228997J0;
                        EditTextFieldFragment.f146886n0.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("edit_text_field_result_has_changed"), null, 2);
                        break;
                    case 3:
                        ExtendedProfileSettingsFragment.a aVar4 = ExtendedProfileSettingsFragment.f228997J0;
                        com.avito.android.edit_address.v.f146007d.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("address_result_has_changed", false), null, 6);
                        break;
                    default:
                        ExtendedProfileSettingsFragment.a aVar5 = ExtendedProfileSettingsFragment.f228997J0;
                        EditBasicInfoFragment.f146014u0.getClass();
                        EditBasicInfoResult editBasicInfoResult = (EditBasicInfoResult) bundle2.getParcelable("edit_basic_info_result");
                        if (editBasicInfoResult != null) {
                            ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, editBasicInfoResult.f146031b, editBasicInfoResult.f146032c, 4);
                            break;
                        }
                        break;
                }
            }
        });
        final int i15 = 3;
        getParentFragmentManager().p0("edit_address_result_result_key", this, new androidx.fragment.app.C(this) { // from class: com.avito.android.profile_settings_extended.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSettingsFragment f230375c;

            {
                this.f230375c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                ExtendedProfileSettingsFragment extendedProfileSettingsFragment = this.f230375c;
                switch (i15) {
                    case 0:
                        ExtendedProfileSettingsFragment.a aVar = ExtendedProfileSettingsFragment.f228997J0;
                        EditTextFieldFragment.f146886n0.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("edit_text_field_result_has_changed"), null, 2);
                        break;
                    case 1:
                        ExtendedProfileSettingsFragment.a aVar2 = ExtendedProfileSettingsFragment.f228997J0;
                        EditTextFieldFragment.f146886n0.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("edit_text_field_result_has_changed"), null, 2);
                        break;
                    case 2:
                        ExtendedProfileSettingsFragment.a aVar3 = ExtendedProfileSettingsFragment.f228997J0;
                        EditTextFieldFragment.f146886n0.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("edit_text_field_result_has_changed"), null, 2);
                        break;
                    case 3:
                        ExtendedProfileSettingsFragment.a aVar4 = ExtendedProfileSettingsFragment.f228997J0;
                        com.avito.android.edit_address.v.f146007d.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("address_result_has_changed", false), null, 6);
                        break;
                    default:
                        ExtendedProfileSettingsFragment.a aVar5 = ExtendedProfileSettingsFragment.f228997J0;
                        EditBasicInfoFragment.f146014u0.getClass();
                        EditBasicInfoResult editBasicInfoResult = (EditBasicInfoResult) bundle2.getParcelable("edit_basic_info_result");
                        if (editBasicInfoResult != null) {
                            ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, editBasicInfoResult.f146031b, editBasicInfoResult.f146032c, 4);
                            break;
                        }
                        break;
                }
            }
        });
        final int i16 = 4;
        getParentFragmentManager().p0("edit_basic_info_result_key", this, new androidx.fragment.app.C(this) { // from class: com.avito.android.profile_settings_extended.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileSettingsFragment f230375c;

            {
                this.f230375c = this;
            }

            @Override // androidx.fragment.app.C
            public final void k(Bundle bundle2, String str) {
                ExtendedProfileSettingsFragment extendedProfileSettingsFragment = this.f230375c;
                switch (i16) {
                    case 0:
                        ExtendedProfileSettingsFragment.a aVar = ExtendedProfileSettingsFragment.f228997J0;
                        EditTextFieldFragment.f146886n0.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("edit_text_field_result_has_changed"), null, 2);
                        break;
                    case 1:
                        ExtendedProfileSettingsFragment.a aVar2 = ExtendedProfileSettingsFragment.f228997J0;
                        EditTextFieldFragment.f146886n0.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("edit_text_field_result_has_changed"), null, 2);
                        break;
                    case 2:
                        ExtendedProfileSettingsFragment.a aVar3 = ExtendedProfileSettingsFragment.f228997J0;
                        EditTextFieldFragment.f146886n0.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("edit_text_field_result_has_changed"), null, 2);
                        break;
                    case 3:
                        ExtendedProfileSettingsFragment.a aVar4 = ExtendedProfileSettingsFragment.f228997J0;
                        com.avito.android.edit_address.v.f146007d.getClass();
                        ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, bundle2.getBoolean("address_result_has_changed", false), null, 6);
                        break;
                    default:
                        ExtendedProfileSettingsFragment.a aVar5 = ExtendedProfileSettingsFragment.f228997J0;
                        EditBasicInfoFragment.f146014u0.getClass();
                        EditBasicInfoResult editBasicInfoResult = (EditBasicInfoResult) bundle2.getParcelable("edit_basic_info_result");
                        if (editBasicInfoResult != null) {
                            ExtendedProfileSettingsFragment.E5(extendedProfileSettingsFragment, editBasicInfoResult.f146031b, editBasicInfoResult.f146032c, 4);
                            break;
                        }
                        break;
                }
            }
        });
        C43259k.d(C22981N.a(getLifecycle()), null, null, new d(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f229000C0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.ext_profile_settings_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        BeduinView beduinView;
        RecyclerView recyclerViewA;
        RecyclerView.m layoutManager;
        super.onDestroyView();
        B b12 = this.f229002E0;
        this.f229003F0 = (b12 == null || (beduinView = b12.f228975r) == null || (recyclerViewA = CA.b.a(beduinView)) == null || (layoutManager = recyclerViewA.getLayoutManager()) == null) ? null : layoutManager.Y0();
        this.f229002E0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        J jD5 = D5();
        if (jD5.f229051L) {
            return;
        }
        jD5.f229051L = true;
        jD5.accept(new k.b(false, null, 2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSaveInstanceState(@Y61.k android.os.Bundle r3) {
        /*
            r2 = this;
            super.onSaveInstanceState(r3)
            com.avito.android.profile_settings_extended.B r0 = r2.f229002E0
            if (r0 == 0) goto L1f
            com.avito.beduin.v2.render.android_view.BeduinView r0 = r0.f228975r
            if (r0 == 0) goto L1c
            androidx.recyclerview.widget.RecyclerView r0 = CA.b.a(r0)
            if (r0 == 0) goto L1c
            androidx.recyclerview.widget.RecyclerView$m r0 = r0.getLayoutManager()
            if (r0 == 0) goto L1c
            android.os.Parcelable r0 = r0.Y0()
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 != 0) goto L21
        L1f:
            android.os.Parcelable r0 = r2.f229003F0
        L21:
            java.lang.String r1 = "extended_profile_settings_beduin_v2_column_state"
            r3.putParcelable(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.ExtendedProfileSettingsFragment.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        J jD5 = D5();
        com.avito.konveyor.a aVar = this.f229011x0;
        com.avito.konveyor.a aVar2 = aVar != null ? aVar : null;
        ScreenPerformanceTracker screenPerformanceTracker = this.f229000C0;
        ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker == null ? null : screenPerformanceTracker;
        J jD52 = D5();
        h31.e<com.avito.android.profile_settings_extended.adapter.gallery.image.j> eVar = this.f229012y0;
        h31.e<com.avito.android.profile_settings_extended.adapter.gallery.image.j> eVar2 = eVar != null ? eVar : null;
        com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c cVar = (com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c) this.f229005H0.getValue();
        J jD53 = D5();
        com.avito.android.util.text.a aVar3 = this.f228998A0;
        B b12 = new B(view, jD5, aVar2, screenPerformanceTracker2, jD52.f229050K, cVar, eVar2, jD53.f229049J, aVar3 != null ? aVar3 : null);
        b12.f228979v = this.f229003F0;
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new e(b12, null), 3);
        this.f229002E0 = b12;
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f229000C0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        String string;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        InterfaceC28481c interfaceC28481cB = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b();
        ExtendedProfileSettingsScreen extendedProfileSettingsScreen = ExtendedProfileSettingsScreen.f90352d;
        this.f229000C0 = interfaceC28481cB.a(new C28478k(extendedProfileSettingsScreen, com.avito.android.analytics.screens.s.c(this), null, 4, null));
        cv.d dVarD = cv.c.d(this);
        if (bundle != null && this.f229003F0 == null) {
            this.f229003F0 = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("extended_profile_settings_beduin_v2_column_state", Parcelable.class) : bundle.getParcelable("extended_profile_settings_beduin_v2_column_state");
        }
        Bundle arguments = getArguments();
        List listF0 = (arguments == null || (string = arguments.getString("widgets_to_scroll")) == null) ? null : C43066x.f0(string, new String[]{","}, 0, 6);
        if (listF0 == null) {
            listF0 = C42784z0.f406748b;
        }
        List list = listF0;
        b.a aVarA = com.avito.android.profile_settings_extended.di.a.a();
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        Resources resources = getResources();
        com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
        FragmentManager childFragmentManager = getChildFragmentManager();
        H.a aVarEd = ((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed();
        ScreenPerformanceTracker screenPerformanceTracker = this.f229000C0;
        aVarA.a(activityC22955mRequireActivity, this, resources, extendedProfileSettingsScreen, list, new f(), this, rVarC, childFragmentManager, new C31138n0(aVarEd.a(screenPerformanceTracker == null ? null : screenPerformanceTracker, this.f229001D0, dVarD, new D0((com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c) this.f229005H0.getValue()), com.avito.android.lib.beduin_v2.feature.di.K.f176031b, (144 & 32) != 0 ? new C27106d() : null, (144 & 64) != 0 ? new com.avito.beduin.v2.engine.component.x() : null, new ZS.c(false))), (InterfaceC29970g) C29972i.a(C29972i.b(this), InterfaceC29970g.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f229000C0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f229000C0;
        if (screenPerformanceTracker3 == null) {
            screenPerformanceTracker3 = null;
        }
        screenPerformanceTracker3.c(this, g5());
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF227385E0() {
        return this.f229006I0;
    }

    @Override // FV0.d
    public final void close() {
    }

    @Override // FV0.c
    public final Fragment j1() {
        return this;
    }
}
