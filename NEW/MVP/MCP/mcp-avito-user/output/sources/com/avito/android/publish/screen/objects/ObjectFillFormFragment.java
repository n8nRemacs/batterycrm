package com.avito.android.publish.screen.objects;

import Ee0.C13479a;
import Ge0.InterfaceC13872a;
import Ge0.d;
import Zd.InterfaceC19542a;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.ObjectFillFormScreen;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.AuthSource;
import com.avito.android.blueprints.publish.date_interval.c;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.details.SelectItemBaseFragment;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.modal.a;
import com.avito.android.lib.design.shadow_layout.ShadowFrameLayout;
import com.avito.android.publish.objects.InterfaceC33971t;
import com.avito.android.publish.objects.N0;
import com.avito.android.publish.objects.ObjectFillFormScreenParams;
import com.avito.android.publish.objects.result.ObjectsFragmentResultImpl;
import com.avito.android.publish.screen.objects.di.C33986a;
import com.avito.android.publish.screen.objects.di.InterfaceC34012c;
import com.avito.android.publish.screen.objects.di.InterfaceC34013d;
import com.avito.android.publish.screen.objects.p;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.suggest_institutes_bottom_sheet.SuggestInstituteArguments;
import com.avito.android.util.H2;
import com.avito.android.util.K2;
import java.util.Locale;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ObjectFillFormFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/screen/objects/ObjectFillFormFragment;", "Lcom/avito/android/details/SelectItemBaseFragment;", "LId0/c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ObjectFillFormFragment extends SelectItemBaseFragment implements Id0.c, InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public u3.l<SimpleTestGroupWithNone> f239519A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f239520B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f239521C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f239522D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f239523E0;

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.screen.objects.view.m f239524F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.screen.objects.e f239525G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.publish.screen.objects.view.b f239526H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.l
    public H2 f239527I0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public p.b f239528s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final O0 f239529t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f239530u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f239531v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.publish.screen.objects.view.actions.a f239532w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f239533x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public RecyclerView.Adapter<?> f239534y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public Q1 f239535z0;

    /* compiled from: ObjectFillFormFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "keyboardShown", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Boolean, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            ObjectFillFormFragment objectFillFormFragment = ObjectFillFormFragment.this;
            com.avito.android.publish.screen.objects.view.actions.a aVar = objectFillFormFragment.f239532w0;
            if (aVar == null) {
                aVar = null;
            }
            aVar.i(zBooleanValue);
            com.avito.android.publish.screen.objects.view.m mVar = objectFillFormFragment.f239524F0;
            if (mVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            N0 n02 = mVar.f240370m;
            if (n02 != null) {
                n02.f237523b = zBooleanValue;
                ShadowFrameLayout shadowFrameLayout = n02.f237525d;
                if (shadowFrameLayout != null) {
                    n02.a(shadowFrameLayout, zBooleanValue, n02.f237524c);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(ObjectFillFormFragment.this.requireArguments().getBoolean("isEdit"));
        }
    }

    /* compiled from: ObjectFillFormFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Boolean> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(ObjectFillFormFragment.this.requireArguments().getBoolean("isPriceList"));
        }
    }

    /* compiled from: ObjectFillFormFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC13872a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13872a interfaceC13872a) {
            ((p) this.receiver).accept(interfaceC13872a);
            return G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<Ge0.d, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(Ge0.d dVar) {
            Q q12;
            Ge0.d dVar2 = dVar;
            ObjectFillFormFragment objectFillFormFragment = (ObjectFillFormFragment) this.receiver;
            objectFillFormFragment.getClass();
            if (dVar2 instanceof d.b) {
                com.avito.android.publish.screen.objects.e eVar = (com.avito.android.publish.screen.objects.e) objectFillFormFragment.s5();
                K2.e(eVar.f240143b);
                InterfaceC33971t interfaceC33971t = eVar.f240152k;
                if (interfaceC33971t == null) {
                    interfaceC33971t = null;
                }
                interfaceC33971t.i0();
            } else if (dVar2 instanceof d.e) {
                ((com.avito.android.publish.screen.objects.e) objectFillFormFragment.s5()).K2(((d.e) dVar2).f6670a, null);
            } else if (dVar2 instanceof d.k) {
                com.avito.android.publish.screen.objects.d dVarS5 = objectFillFormFragment.s5();
                C13479a c13479a = ((d.k) dVar2).f6674a;
                com.avito.android.publish.screen.objects.e eVar2 = (com.avito.android.publish.screen.objects.e) dVarS5;
                CategoryPublishStep.Params.Confirmation confirmation = c13479a.f4128b;
                if (confirmation != null) {
                    com.avito.android.publish.confirmation_dialog.c.a(eVar2.f240143b, confirmation, new com.avito.android.publish.screen.objects.f(eVar2, c13479a));
                }
            } else if (dVar2 instanceof d.C0362d) {
                com.avito.android.publish.screen.objects.e eVar3 = (com.avito.android.publish.screen.objects.e) objectFillFormFragment.s5();
                InterfaceC19542a interfaceC19542a = eVar3.f240148g;
                if (interfaceC19542a == null) {
                    interfaceC19542a = null;
                }
                eVar3.f240159r.b(interfaceC19542a.a(AuthSource.f92694c));
            } else if (dVar2 instanceof d.n) {
                com.avito.android.publish.screen.objects.e eVar4 = (com.avito.android.publish.screen.objects.e) objectFillFormFragment.s5();
                Context context = eVar4.f240145d;
                String string = context.getString(R.string.delete);
                String string2 = context.getString(R.string.dismiss);
                u3.l<SimpleTestGroupWithNone> lVar = eVar4.f240157p;
                if (lVar == null) {
                    lVar = null;
                }
                if (lVar.f439745a.f439749b.b()) {
                    q12 = new Q(context.getString(R.string.object_fill_form_remove_item_title), context.getString(R.string.object_fill_form_remove_item_subtitle));
                } else {
                    h31.e<ObjectsParameter> eVar5 = eVar4.f240156o;
                    if (eVar5 == null) {
                        eVar5 = null;
                    }
                    String title = eVar5.get().getTitle();
                    Locale locale = eVar4.f240155n;
                    if (locale == null) {
                        locale = null;
                    }
                    q12 = new Q(null, string + ' ' + title.toLowerCase(locale) + '?');
                }
                String str = (String) q12.f406619b;
                String str2 = (String) q12.f406620c;
                com.avito.android.publish.screen.objects.i iVar = new com.avito.android.publish.screen.objects.i(eVar4);
                u3.l<SimpleTestGroupWithNone> lVar2 = eVar4.f240157p;
                if (lVar2 == null) {
                    lVar2 = null;
                }
                if (lVar2.f439745a.f439749b.b()) {
                    androidx.appcompat.view.d dVar3 = new androidx.appcompat.view.d(eVar4.f240145d, R.style.Theme_DesignSystem_Re23);
                    a.C5284a c5284a = com.avito.android.lib.design.modal.a.f179704d;
                    com.avito.android.publish.screen.objects.n nVar = new com.avito.android.publish.screen.objects.n(str, str2, string, string2, iVar);
                    c5284a.getClass();
                    com.avito.android.lib.util.g.a(a.C5284a.a(dVar3, 0, R.style.PublishObjectModelStyle, nVar));
                } else {
                    com.avito.android.lib.deprecated_design.dialog.a aVar = eVar4.f240151j;
                    eVar4.f240158q = (aVar != null ? aVar : null).b(str, str2, string2, new com.avito.android.publish.screen.objects.j(eVar4), string, new com.avito.android.publish.screen.objects.k(eVar4, iVar));
                }
            } else if (dVar2 instanceof d.r) {
                ((com.avito.android.publish.screen.objects.e) objectFillFormFragment.s5()).R1(((d.r) dVar2).f6683a);
            } else if (dVar2 instanceof d.q) {
                d.q qVar = (d.q) dVar2;
                ((com.avito.android.publish.screen.objects.e) objectFillFormFragment.s5()).g4(qVar.f6681a, qVar.f6682b);
            } else if (dVar2 instanceof d.i) {
                ((com.avito.android.publish.screen.objects.e) objectFillFormFragment.s5()).O2(((d.i) dVar2).f6673a);
            } else if (dVar2 instanceof d.s) {
                ((com.avito.android.publish.screen.objects.e) objectFillFormFragment.s5()).t3(((d.s) dVar2).f6684a);
            } else if (dVar2 instanceof d.c) {
                com.avito.android.publish.screen.objects.d dVarS52 = objectFillFormFragment.s5();
                String str3 = ((d.c) dVar2).f6668a;
                com.avito.android.publish.screen.objects.e eVar6 = (com.avito.android.publish.screen.objects.e) dVarS52;
                K2.e(eVar6.f240143b);
                com.avito.android.publish.objects.result.a aVar2 = eVar6.f240150i;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.a(ObjectsFragmentResultImpl.ObjectsRequestKey.f238086c, str3);
                InterfaceC33971t interfaceC33971t2 = eVar6.f240152k;
                (interfaceC33971t2 != null ? interfaceC33971t2 : null).i0();
            } else if (dVar2 instanceof d.u) {
                com.avito.android.publish.screen.objects.d dVarS53 = objectFillFormFragment.s5();
                SuggestInstituteArguments suggestInstituteArguments = ((d.u) dVar2).f6685a;
                com.avito.android.publish.screen.objects.e eVar7 = (com.avito.android.publish.screen.objects.e) dVarS53;
                com.avito.android.suggest_institutes_bottom_sheet.a aVar3 = eVar7.f240146e;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                aVar3.a(suggestInstituteArguments).show(eVar7.f240143b.getParentFragmentManager(), (String) null);
            } else if (dVar2 instanceof d.l) {
                com.avito.android.publish.screen.objects.d dVarS54 = objectFillFormFragment.s5();
                d.l lVar3 = (d.l) dVar2;
                ParameterElement.C29377e c29377e = lVar3.f6676b;
                com.avito.android.publish.screen.objects.e eVar8 = (com.avito.android.publish.screen.objects.e) dVarS54;
                c.a aVar4 = lVar3.f6675a;
                com.avito.android.publish.screen.objects.g gVar = new com.avito.android.publish.screen.objects.g(aVar4, c29377e, eVar8);
                com.avito.android.publish.date_picker.b bVar = eVar8.f240153l;
                if (bVar == null) {
                    bVar = null;
                }
                bVar.d(eVar8.f240145d, aVar4, c29377e, gVar);
            } else if (dVar2 instanceof d.m) {
                com.avito.android.publish.screen.objects.d dVarS55 = objectFillFormFragment.s5();
                d.m mVar = (d.m) dVar2;
                ParameterElement.C29377e c29377e2 = mVar.f6678b;
                com.avito.android.publish.screen.objects.e eVar9 = (com.avito.android.publish.screen.objects.e) dVarS55;
                c.a aVar5 = mVar.f6677a;
                com.avito.android.publish.screen.objects.h hVar = new com.avito.android.publish.screen.objects.h(aVar5, c29377e2, eVar9);
                com.avito.android.publish.date_picker.b bVar2 = eVar9.f240153l;
                if (bVar2 == null) {
                    bVar2 = null;
                }
                bVar2.e(eVar9.f240145d, aVar5, c29377e2, hVar);
            } else {
                com.avito.android.publish.screen.objects.view.m mVar2 = objectFillFormFragment.f239524F0;
                if (mVar2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                mVar2.e(dVar2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<Ge0.f, G0> {
        @Override // Y41.l
        public final G0 invoke(Ge0.f fVar) {
            ((com.avito.android.publish.screen.objects.view.g) this.receiver).c(fVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/publish/objects/ObjectFillFormScreenParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends N implements Y41.a<ObjectFillFormScreenParams> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final ObjectFillFormScreenParams invoke() {
            Bundle arguments = ObjectFillFormFragment.this.getArguments();
            Parcelable parcelable = arguments == null ? null : Build.VERSION.SDK_INT >= 33 ? (Parcelable) arguments.getParcelable("object_fill_form_screen_params_key", ObjectFillFormScreenParams.class) : arguments.getParcelable("object_fill_form_screen_params_key");
            if (parcelable != null) {
                return (ObjectFillFormScreenParams) parcelable;
            }
            throw new IllegalArgumentException("object_fill_form_screen_params_key - param must be not null");
        }
    }

    /* compiled from: ObjectFillFormFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends H implements Y41.l<InterfaceC13872a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13872a interfaceC13872a) {
            ((p) this.receiver).accept(interfaceC13872a);
            return G0.f406611a;
        }
    }

    /* compiled from: ObjectFillFormFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class i extends H implements Y41.l<InterfaceC13872a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13872a interfaceC13872a) {
            ((p) this.receiver).accept(interfaceC13872a);
            return G0.f406611a;
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f239541m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.l lVar) {
            super(0);
            this.f239541m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(ObjectFillFormFragment.this, this.f239541m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ObjectFillFormFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f239543l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f239543l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f239543l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f239544l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f239544l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f239544l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f239545l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f239545l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f239545l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ObjectFillFormFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/publish/screen/objects/p;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/publish/screen/objects/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.l<C23060r0, p> {
        public o() {
            super(1);
        }

        @Override // Y41.l
        public final p invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            p.b bVar = ObjectFillFormFragment.this.f239528s0;
            if (bVar == null) {
                bVar = null;
            }
            return bVar.a(c23060r02);
        }
    }

    public ObjectFillFormFragment() {
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f239529t0 = new O0(m0.f406844a.b(p.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
        this.f239521C0 = C42727D.c(new g());
        this.f239522D0 = C42727D.c(new b());
        this.f239523E0 = C42727D.c(new c());
    }

    @Override // Id0.c
    public final int K1() {
        Q1 q12 = this.f239535z0;
        if (q12 == null) {
            q12 = null;
        }
        return q12.B().invoke().booleanValue() ? R.layout.publish_details_actions_re23 : R.layout.publish_details_actions;
    }

    @Override // Id0.c
    public final void g2() {
        H2 h22 = this.f239527I0;
        if (h22 != null) {
            h22.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        u3.l<SimpleTestGroupWithNone> lVar = this.f239519A0;
        if (lVar == null) {
            lVar = null;
        }
        return layoutInflater.inflate(lVar.f439745a.f439749b.b() ? R.layout.publish_details_object_re23 : R.layout.publish_details, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f239526H0 = null;
        this.f239525G0 = null;
    }

    @Override // com.avito.android.details.SelectItemBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.publish.screen.objects.view.b bVar = this.f239526H0;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        bVar.f240286h.e();
        com.avito.android.publish.screen.objects.view.m mVar = this.f239524F0;
        if (mVar != null) {
            com.avito.android.publish.screen.objects.view.l lVar = mVar.f240369l;
            if (lVar != null) {
                lVar.f240349b.e0();
                lVar.f240348a.removeOnLayoutChangeListener(lVar.f240357j);
            }
            mVar.f240369l = null;
            N0 n02 = mVar.f240370m;
            if (n02 != null) {
                n02.b();
            }
            mVar.f240370m = null;
        }
        this.f239524F0 = null;
    }

    @Override // com.avito.android.details.SelectItemBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f239520B0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
        ViewGroup viewGroup = (ViewGroup) view;
        RecyclerView.Adapter<?> adapter = this.f239534y0;
        RecyclerView.Adapter<?> adapter2 = adapter != null ? adapter : null;
        com.avito.android.recycler.data_aware.c cVar = this.f239533x0;
        com.avito.android.recycler.data_aware.c cVar2 = cVar != null ? cVar : null;
        O0 o02 = this.f239529t0;
        d dVar = new d(1, (p) o02.getValue(), p.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        InterfaceC28373a interfaceC28373a = this.f239530u0;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        Q1 q12 = this.f239535z0;
        Q1 q13 = q12 != null ? q12 : null;
        u3.l<SimpleTestGroupWithNone> lVar = this.f239519A0;
        this.f239524F0 = new com.avito.android.publish.screen.objects.view.m(viewGroup, adapter2, cVar2, dVar, interfaceC28373a2, q13, lVar != null ? lVar : null, ((Boolean) this.f239522D0.getValue()).booleanValue(), false, false, 0L, null, 3840, null);
        com.avito.android.publish.screen.objects.view.b bVar = this.f239526H0;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Set<TV0.d<?, ?>> set = this.f239531v0;
        if (set == null) {
            set = null;
        }
        bVar.d(set);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f239520B0;
        ScreenPerformanceTracker screenPerformanceTracker3 = screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null;
        p pVar = (p) o02.getValue();
        e eVar = new e(1, this, ObjectFillFormFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormOneTimeEvent;)V", 0);
        com.avito.android.publish.screen.objects.view.m mVar = this.f239524F0;
        if (mVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker3, pVar, eVar, new f(1, mVar, com.avito.android.publish.screen.objects.view.g.class, "render", "render(Lcom/avito/android/publish/screen/objects/mvi/entity/ObjectFillFormState;)V", 0));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(ObjectFillFormScreen.f90436d, s.c(this), null, 4, null);
        InterfaceC34012c.b bVarA = C33986a.a();
        Resources resources = getResources();
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        InterfaceC42726C interfaceC42726C = this.f239523E0;
        InterfaceC34012c interfaceC34012cA = bVarA.a(resources, activityC22955mRequireActivity, this, ((Boolean) interfaceC42726C.getValue()).booleanValue(), c28478k, (ObjectFillFormScreenParams) this.f239521C0.getValue(), (InterfaceC34013d) C29972i.a(C29972i.b(this), InterfaceC34013d.class), cv.c.b(this));
        interfaceC34012cA.a(this);
        O0 o02 = this.f239529t0;
        com.avito.android.publish.screen.objects.e eVar = new com.avito.android.publish.screen.objects.e(this, new h(1, (p) o02.getValue(), p.class, "accept", "accept(Ljava/lang/Object;)V", 0));
        interfaceC34012cA.b(eVar);
        this.f239525G0 = eVar;
        com.avito.android.publish.screen.objects.view.b bVar = new com.avito.android.publish.screen.objects.view.b(new i(1, (p) o02.getValue(), p.class, "accept", "accept(Ljava/lang/Object;)V", 0), ((Boolean) interfaceC42726C.getValue()).booleanValue());
        interfaceC34012cA.c(bVar);
        this.f239526H0 = bVar;
        ScreenPerformanceTracker screenPerformanceTracker = this.f239520B0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.publish.screen.objects.d s5() {
        com.avito.android.publish.screen.objects.e eVar = this.f239525G0;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // Id0.c
    public final void t2(@Y61.k View view) {
        com.avito.android.publish.screen.objects.view.m mVar = this.f239524F0;
        if (mVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        com.avito.android.publish.screen.objects.view.actions.a aVar = this.f239532w0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.publish.screen.objects.view.actions.a aVar2 = aVar;
        mVar.f240369l = new com.avito.android.publish.screen.objects.view.l(mVar, mVar.f240358a, view, aVar2, mVar.f240360c, mVar.f240363f, mVar.f240362e);
        mVar.f240370m = new N0(mVar.f240358a);
        this.f239527I0 = K2.a(requireActivity(), new a());
    }
}
