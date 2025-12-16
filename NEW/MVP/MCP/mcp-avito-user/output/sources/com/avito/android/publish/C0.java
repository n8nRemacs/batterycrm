package com.avito.android.publish;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import com.avito.android.Q1;
import com.avito.android.analytics.screens.tracker.ScreenTransfer;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.publish.PublishSession;
import com.avito.android.publish.PublishState;
import com.avito.android.publish.Q0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.restriction.l;
import com.avito.android.publish.slots.contact_info.ContactsData;
import com.avito.android.remote.model.CategoryModel;
import com.avito.android.remote.model.DeepLinksDialogInfo;
import com.avito.android.remote.model.Draft;
import com.avito.android.remote.model.ImageUploadResult;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.SimpleParametersTree;
import com.avito.android.remote.model.category_parameters.ThemedStep;
import com.avito.android.remote.model.category_parameters.VideoUploadParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.GroupSlotActiveIdProvider;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import com.avito.android.remote.model.category_parameters.slot.delivery_addresses.AddressInfo;
import com.avito.android.remote.model.category_parameters.slot.delivery_addresses.DeliveryAddressesSlot;
import com.avito.android.remote.model.category_parameters.slot.delivery_addresses.DeliveryAddressesSlotConfig;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.NotFoundException;
import com.avito.android.util.O2;
import hz.InterfaceC41196a;
import io.reactivex.rxjava3.internal.operators.maybe.C41917k;
import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import jz.InterfaceC42451b;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import yc.C50213a;

/* compiled from: PublishViewModel.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/C0;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/publish/z;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public class C0 extends androidx.view.M0 implements InterfaceC34155z {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.draft_onboarding.a f231845E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f231846J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final C50213a f231847K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final Q1 f231848L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41196a f231849M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final Map<SlotType, GroupSlotActiveIdProvider> f231850N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.restriction.e f231851O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f231852P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f231853Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f231854R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f231855S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f231856T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public Integer f231857U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public ParametersTree[] f231858V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<Q0> f231859W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<EditableParameter<?>> f231860X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public PublishState f231861Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.l
    public String f231862Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f231863a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f231864b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.l
    public String f231865c0;

    /* renamed from: d0, reason: collision with root package name */
    public String f231866d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.l
    public ItemBrief f231867e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.l
    public String f231868f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.l
    public DeepLink f231869g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f231870h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f231871i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f231872j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.l
    public CategoryParameters f231873k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.l
    public volatile ContactsData f231874l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f231875m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public Integer f231876n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.l
    public Map<String, ? extends Object> f231877o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.l
    public String f231878p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.l
    public Boolean f231879q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<DeepLinksDialogInfo> f231880r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Integer> f231881s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f231882t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f231883u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f231884v0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PublishViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/C0$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f231885b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f231886c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a[] f231887d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f231888e;

        static {
            a aVar = new a("FORWARD", 0);
            f231885b = aVar;
            a aVar2 = new a("BACKSTACK", 1);
            f231886c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            f231887d = aVarArr;
            f231888e = kotlin.enums.c.a(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f231887d.clone();
        }
    }

    /* compiled from: PublishViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f231889a;

        static {
            int[] iArr = new int[PublishSession.StepType.values().length];
            try {
                iArr[PublishSession.StepType.f232003e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PublishSession.StepType.f232004f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PublishSession.StepType.f232005g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PublishSession.StepType.f232006h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PublishSession.StepType.f232014p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PublishSession.StepType.f232007i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PublishSession.StepType.f232008j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PublishSession.StepType.f232009k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PublishSession.StepType.f232010l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PublishSession.StepType.f232011m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PublishSession.StepType.f232012n.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PublishSession.StepType.f232013o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PublishSession.StepType.f232015q.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PublishSession.StepType.f232016r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PublishSession.StepType.f232017s.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[PublishSession.StepType.f232018t.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[PublishSession.StepType.f232019u.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[PublishSession.StepType.f232020v.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[PublishSession.StepType.f232021w.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[PublishSession.StepType.f232022x.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            f231889a = iArr;
        }
    }

    /* compiled from: PublishViewModel.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            List<ParameterSlot> parameters;
            CategoryParameters categoryParameters = C0.this.f231873k0;
            boolean z12 = false;
            if (categoryParameters != null && (parameters = categoryParameters.getParameters()) != null) {
                List<ParameterSlot> list = parameters;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((ParameterSlot) it.next()) instanceof VideoUploadParameter) {
                            z12 = true;
                            break;
                        }
                    }
                }
            }
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: PublishViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String id2;
            ParameterSlot parameterSlotFindParameterHolder;
            EditableParameter editableParameter = (EditableParameter) obj;
            C0 c02 = C0.this;
            Set<String> setE = c02.f231861Y.e();
            CategoryParameters categoryParameters = c02.f231873k0;
            if (categoryParameters == null || (parameterSlotFindParameterHolder = categoryParameters.findParameterHolder(editableParameter.getId())) == null || (id2 = parameterSlotFindParameterHolder.getId()) == null) {
                id2 = editableParameter.getId();
            }
            setE.add(id2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0(@Y61.k com.avito.android.publish.draft_onboarding.a aVar, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k C50213a c50213a, @Y61.k Q1 q12, @Y61.k InterfaceC41196a interfaceC41196a, @Y61.k Map<SlotType, ? extends GroupSlotActiveIdProvider> map, @Y61.k com.avito.android.publish.restriction.e eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f231845E = aVar;
        this.f231846J = interfaceC33535v;
        this.f231847K = c50213a;
        this.f231848L = q12;
        this.f231849M = interfaceC41196a;
        this.f231850N = map;
        this.f231851O = eVar;
        this.f231852P = interfaceC35745a5;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f231853Q = cVar;
        this.f231854R = new io.reactivex.rxjava3.disposables.c();
        this.f231856T = true;
        this.f231858V = new ParametersTree[0];
        this.f231859W = new com.avito.android.util.architecture_components.D<>();
        com.jakewharton.rxrelay3.c<EditableParameter<?>> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f231860X = cVar2;
        this.f231861Y = new PublishState(null, null, 0, null, null, null, 63, null);
        this.f231880r0 = new com.avito.android.util.architecture_components.D<>();
        this.f231881s0 = new com.jakewharton.rxrelay3.c<>();
        C41981q0 c41981q0 = new C41981q0(cVar2);
        this.f231882t0 = c41981q0;
        this.f231884v0 = C42727D.c(new c());
        cVar.b(c41981q0.d0(new G0(this)).x0(interfaceC35745a5.c()).K(new H0(this)).j0(interfaceC35745a5.e()).v0(I0.f231913b, new J0(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public static void Ge(C0 c02, String str, Throwable th2, int i12) {
        if ((i12 & 2) != 0) {
            th2 = new RuntimeException(str);
        }
        c02.f231846J.r(str, th2, NonFatalErrorEvent.a.c.f147934a);
        c02.f231859W.postValue(Q0.z.f232069c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ke(C0 c02, com.avito.android.publish.restriction.l lVar, CategoryPublishStep.Restriction restriction) {
        ParametrizedEvent parametrizedEvent = null;
        Object[] objArr = 0;
        if (kotlin.jvm.internal.L.f(lVar, l.a.f239104a)) {
            c02.xe(null);
            return;
        }
        boolean z12 = lVar instanceof l.b;
        com.avito.android.util.architecture_components.D<Q0> d12 = c02.f231859W;
        if (z12) {
            if (restriction.getConfig().getShouldBlockOnError()) {
                d12.setValue(Q0.z.f232069c);
                return;
            } else {
                c02.xe(null);
                return;
            }
        }
        if (lVar instanceof l.c) {
            l.c cVar = (l.c) lVar;
            if (cVar.f239106a.getContent() == null) {
                c02.xe(null);
            } else {
                c02.ye();
                d12.setValue(new Q0.j(new DetailsSheetLink(cVar.f239106a.getContent(), parametrizedEvent, 2, objArr == true ? 1 : 0)));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    @android.annotation.SuppressLint({"HardcodeStringDetector"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ae() {
        /*
            r7 = this;
            com.avito.android.remote.model.category_parameters.CategoryParameters r0 = r7.f231873k0
            r1 = 0
            r2 = 10
            if (r0 == 0) goto L3a
            java.util.List r0 = r0.getParameters()
            if (r0 == 0) goto L3a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            int r3 = kotlin.collections.C42745f0.q(r0, r2)
            int r3 = kotlin.collections.P0.f(r3)
            r4 = 16
            if (r3 >= r4) goto L1c
            r3 = r4
        L1c:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L25:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r0.next()
            r5 = r3
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r5 = (com.avito.android.remote.model.category_parameters.base.ParameterSlot) r5
            java.lang.String r5 = r5.getId()
            r4.put(r5, r3)
            goto L25
        L3a:
            r4 = r1
        L3b:
            r0 = 0
            if (r4 != 0) goto L49
            com.avito.android.remote.model.category_parameters.ParametersTree[] r0 = new com.avito.android.remote.model.category_parameters.ParametersTree[r0]
            r7.f231858V = r0
            r0 = 6
            java.lang.String r2 = "Cannot init steps with null parameters"
            Ge(r7, r2, r1, r0)
            return
        L49:
            java.util.List r1 = r7.ue()
            if (r1 == 0) goto La4
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            int r2 = kotlin.collections.C42745f0.q(r1, r2)
            r3.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L5e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L9a
            java.lang.Object r2 = r1.next()
            com.avito.android.remote.model.category_parameters.CategoryPublishStep r2 = (com.avito.android.remote.model.category_parameters.CategoryPublishStep) r2
            java.util.List r2 = r2.getFields()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L79:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L91
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r4.get(r6)
            com.avito.android.remote.model.category_parameters.base.ParameterSlot r6 = (com.avito.android.remote.model.category_parameters.base.ParameterSlot) r6
            if (r6 == 0) goto L79
            r5.add(r6)
            goto L79
        L91:
            com.avito.android.remote.model.category_parameters.SimpleParametersTree r2 = new com.avito.android.remote.model.category_parameters.SimpleParametersTree
            r2.<init>(r5)
            r3.add(r2)
            goto L5e
        L9a:
            com.avito.android.remote.model.category_parameters.ParametersTree[] r1 = new com.avito.android.remote.model.category_parameters.ParametersTree[r0]
            java.lang.Object[] r1 = r3.toArray(r1)
            com.avito.android.remote.model.category_parameters.ParametersTree[] r1 = (com.avito.android.remote.model.category_parameters.ParametersTree[]) r1
            if (r1 != 0) goto La6
        La4:
            com.avito.android.remote.model.category_parameters.ParametersTree[] r1 = new com.avito.android.remote.model.category_parameters.ParametersTree[r0]
        La6:
            r7.f231858V = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.C0.Ae():void");
    }

    public final boolean Be() {
        return this.f231867e0 != null;
    }

    public final boolean Ce() {
        return (this.f231867e0 == null && this.f231862Z == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ee() {
        /*
            r4 = this;
            com.avito.android.deep_linking.links.DeepLink r0 = r4.f231869g0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
        L6:
            r0 = r2
            goto L18
        L8:
            boolean r3 = r0 instanceof com.avito.android.deep_linking.links.MyAdvertLink.ActivateV2
            if (r3 == 0) goto Le
            r0 = r1
            goto L18
        Le:
            boolean r3 = r0 instanceof com.avito.android.deep_linking.links.ConditionChainLink
            if (r3 == 0) goto L6
            com.avito.android.deep_linking.links.ConditionChainLink r0 = (com.avito.android.deep_linking.links.ConditionChainLink) r0
            com.avito.android.deep_linking.links.DeepLink r0 = r0.f133112b
            boolean r0 = r0 instanceof com.avito.android.deep_linking.links.MyAdvertLink.ActivateV2
        L18:
            if (r0 == 0) goto L1f
            boolean r0 = r4.f231855S
            if (r0 != 0) goto L1f
            r2 = r1
        L1f:
            r4.f231855S = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.C0.Ee():boolean");
    }

    public final void Fe(CategoryParameters categoryParameters) {
        io.reactivex.rxjava3.disposables.c cVar = this.f231854R;
        cVar.e();
        cVar.b(categoryParameters.getValueChanges().t0(this.f231860X));
        cVar.b(categoryParameters.getValueChanges().t0(new d()));
    }

    public final void He(CategoryParameters categoryParameters, CategoryParameters categoryParameters2) {
        PhotoParameter photoParameter;
        PhotoParameter.ImageUploadListWrapper value;
        List<ImageUploadResult> onlyUploaded;
        PhotoParameter.ImageUploadListWrapper value2;
        List<ImageUploadResult> onlyUploaded2;
        if (categoryParameters == null || (photoParameter = (PhotoParameter) categoryParameters.getFirstParameterOfType(PhotoParameter.class)) == null || (value = photoParameter.getValue()) == null || (onlyUploaded = value.getOnlyUploaded()) == null) {
            return;
        }
        int size = onlyUploaded.size();
        PhotoParameter photoParameter2 = (PhotoParameter) categoryParameters2.getFirstParameterOfType(PhotoParameter.class);
        int size2 = (photoParameter2 == null || (value2 = photoParameter2.getValue()) == null || (onlyUploaded2 = value2.getOnlyUploaded()) == null) ? 0 : onlyUploaded2.size();
        if (size == 0 || size2 != 0) {
            return;
        }
        List<ImageUploadResult> list = onlyUploaded;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ImageUploadResult) it.next()).getUploadId());
        }
        this.f231846J.L(arrayList);
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void Ie(String str) {
        CategoryPublishStep categoryPublishStep;
        Object next;
        List<CategoryPublishStep> listUe = ue();
        if (listUe == null) {
            return;
        }
        if (str != null) {
            List<CategoryPublishStep> listUe2 = ue();
            if (listUe2 != null) {
                Iterator<T> it = listUe2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (kotlin.jvm.internal.L.f(((CategoryPublishStep) next).getId(), str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                categoryPublishStep = (CategoryPublishStep) next;
            } else {
                categoryPublishStep = null;
            }
            if (categoryPublishStep != null) {
                for (CategoryPublishStep categoryPublishStep2 : listUe) {
                    if (!categoryPublishStep2.getSkipOnBackwards() || kotlin.jvm.internal.L.f(categoryPublishStep2.getId(), str)) {
                        a aVar = kotlin.jvm.internal.L.f(categoryPublishStep2.getId(), str) ? a.f231885b : a.f231886c;
                        Me(categoryPublishStep2);
                        try {
                            this.f231859W.setValue(Qe(categoryPublishStep2, this.f231861Y.getStepIndex(), aVar, null));
                        } catch (IllegalArgumentException e12) {
                            Ge(this, "Routing action during backstack restoration", e12, 4);
                            return;
                        }
                    }
                    if (kotlin.jvm.internal.L.f(categoryPublishStep2.getId(), str)) {
                        return;
                    }
                }
                return;
            }
        }
        PublishState publishState = this.f231861Y;
        publishState.q(publishState.getRootNavigation());
        xe(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Je(@Y61.k CategoryParameters categoryParameters, @Y61.k PublishState publishState) throws NotFoundException {
        String draftId;
        int iNextIndex;
        PublishState.StepState imei;
        PublishState.StepState categoriesSuggestions;
        PublishState.StepState imei2;
        PublishState.StepState categoriesSuggestions2;
        List<CategoryPublishStep> steps;
        List<CategoryPublishStep> steps2;
        this.f231856T = false;
        this.f231863a0 = false;
        this.f231864b0 = false;
        Draft draft = categoryParameters.getDraft();
        if (draft == null || (draftId = draft.getDraftId()) == null) {
            draftId = this.f231865c0;
        }
        this.f231865c0 = draftId;
        this.f231861Y = publishState;
        Ke(categoryParameters);
        CategoryParameters categoryParameters2 = this.f231873k0;
        if (categoryParameters2 == null || (steps2 = categoryParameters2.getSteps()) == null) {
            iNextIndex = -1;
        } else {
            ListIterator<CategoryPublishStep> listIterator = steps2.listIterator(steps2.size());
            while (listIterator.hasPrevious()) {
                CategoryPublishStep categoryPublishStepPrevious = listIterator.previous();
                if ((categoryPublishStepPrevious instanceof CategoryPublishStep.SuggestCategory) || (categoryPublishStepPrevious instanceof CategoryPublishStep.Wizard)) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            iNextIndex = -1;
        }
        int i12 = 1;
        if (iNextIndex != -1) {
            CategoryParameters categoryParameters3 = this.f231873k0;
            String str = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            CategoryPublishStep categoryPublishStep = (categoryParameters3 == null || (steps = categoryParameters3.getSteps()) == null) ? null : steps.get(iNextIndex);
            if (categoryPublishStep instanceof CategoryPublishStep.SuggestCategory) {
                PublishState publishState2 = this.f231861Y;
                if (!(publishState2.k().get(Integer.valueOf(iNextIndex)) instanceof PublishState.StepState.CategoriesSuggestions)) {
                    kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
                    kotlin.reflect.d dVarB = n0Var.b(PublishState.StepState.CategoriesSuggestions.class);
                    if (dVarB.equals(n0Var.b(PublishState.StepState.Wizard.class))) {
                        categoriesSuggestions2 = new PublishState.StepState.Wizard(null, null, null, 7, null);
                    } else if (dVarB.equals(n0Var.b(PublishState.StepState.CategoriesSuggestions.class))) {
                        categoriesSuggestions2 = new PublishState.StepState.CategoriesSuggestions(null, null, null, null, 15, null);
                    } else {
                        if (dVarB.equals(n0Var.b(PublishState.StepState.Vin.class))) {
                            imei2 = new PublishState.StepState.Vin(str, i12, objArr7 == true ? 1 : 0);
                        } else {
                            if (!dVarB.equals(n0Var.b(PublishState.StepState.Imei.class))) {
                                throw new NotFoundException(n0Var.b(PublishState.StepState.CategoriesSuggestions.class).toString(), (Throwable) null, 2, (C42822w) null);
                            }
                            imei2 = new PublishState.StepState.Imei(objArr6 == true ? 1 : 0, i12, objArr5 == true ? 1 : 0);
                        }
                        categoriesSuggestions2 = imei2;
                    }
                    publishState2.k().put(Integer.valueOf(iNextIndex), categoriesSuggestions2);
                }
            } else if (categoryPublishStep instanceof CategoryPublishStep.Wizard) {
                PublishState publishState3 = this.f231861Y;
                if (!(publishState3.k().get(Integer.valueOf(iNextIndex)) instanceof PublishState.StepState.Wizard)) {
                    kotlin.jvm.internal.n0 n0Var2 = kotlin.jvm.internal.m0.f406844a;
                    kotlin.reflect.d dVarB2 = n0Var2.b(PublishState.StepState.Wizard.class);
                    if (dVarB2.equals(n0Var2.b(PublishState.StepState.Wizard.class))) {
                        categoriesSuggestions = new PublishState.StepState.Wizard(null, null, null, 7, null);
                    } else if (dVarB2.equals(n0Var2.b(PublishState.StepState.CategoriesSuggestions.class))) {
                        categoriesSuggestions = new PublishState.StepState.CategoriesSuggestions(null, null, null, null, 15, null);
                    } else {
                        if (dVarB2.equals(n0Var2.b(PublishState.StepState.Vin.class))) {
                            imei = new PublishState.StepState.Vin(objArr4 == true ? 1 : 0, i12, objArr3 == true ? 1 : 0);
                        } else {
                            if (!dVarB2.equals(n0Var2.b(PublishState.StepState.Imei.class))) {
                                throw new NotFoundException(n0Var2.b(PublishState.StepState.Wizard.class).toString(), (Throwable) null, 2, (C42822w) null);
                            }
                            imei = new PublishState.StepState.Imei(objArr2 == true ? 1 : 0, i12, objArr == true ? 1 : 0);
                        }
                        categoriesSuggestions = imei;
                    }
                    publishState3.k().put(Integer.valueOf(iNextIndex), categoriesSuggestions);
                }
            } else {
                Ge(this, "Got unexpected step type by index", null, 6);
            }
        }
        this.f231861Y.n();
        Ie(se());
        this.f231856T = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ke(@Y61.k CategoryParameters categoryParameters) {
        CategoryPublishStep categoryPublishStep;
        Object next;
        String targetStepId;
        List<AddressInfo> deliveryAddresses;
        He(this.f231873k0, categoryParameters);
        this.f231873k0 = categoryParameters;
        Iterator<T> it = categoryParameters.getParameters().iterator();
        while (true) {
            categoryPublishStep = null;
            if (it.hasNext()) {
                next = it.next();
                if (next instanceof DeliveryAddressesSlot) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (!(next instanceof DeliveryAddressesSlot)) {
            next = null;
        }
        DeliveryAddressesSlot deliveryAddressesSlot = (DeliveryAddressesSlot) next;
        if (deliveryAddressesSlot != null && ((deliveryAddresses = ((DeliveryAddressesSlotConfig) deliveryAddressesSlot.getWidget().getConfig()).getDeliveryAddresses()) == null || deliveryAddresses.isEmpty())) {
            List<ParameterSlot> parameters = categoryParameters.getParameters();
            ArrayList arrayList = new ArrayList();
            for (Object obj : parameters) {
                if (!(((ParameterSlot) obj) instanceof DeliveryAddressesSlot)) {
                    arrayList.add(obj);
                }
            }
            Ke(CategoryParameters.cloneWithNewParameters$default(categoryParameters, arrayList, null, 2, null));
        }
        this.f231861Y.q(categoryParameters.getNavigation());
        Fe(categoryParameters);
        Ae();
        if (!this.f231875m0 || (targetStepId = categoryParameters.getTargetStepId()) == null) {
            return;
        }
        List<CategoryPublishStep> listUe = ue();
        if (listUe != null) {
            Iterator<T> it2 = listUe.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (kotlin.jvm.internal.L.f(((CategoryPublishStep) next2).getId(), targetStepId)) {
                    categoryPublishStep = next2;
                    break;
                }
            }
            categoryPublishStep = categoryPublishStep;
        }
        Me(categoryPublishStep);
    }

    public final void Le(@Y61.k CategoryParameters categoryParameters) {
        He(this.f231873k0, categoryParameters);
        this.f231873k0 = categoryParameters;
        Fe(categoryParameters);
        Ae();
    }

    public final void Me(@Y61.l CategoryPublishStep categoryPublishStep) {
        Ne(te(categoryPublishStep));
    }

    public final void Ne(int i12) {
        kotlin.G0 g02;
        List<CategoryPublishStep> steps;
        String str;
        boolean z12 = false;
        if (this.f231861Y.getStepIndex() != i12) {
            this.f231861Y.u(i12);
            if (i12 != -1) {
                CategoryParameters categoryParameters = this.f231873k0;
                if (categoryParameters == null || (steps = categoryParameters.getSteps()) == null || (str = (String) C42745f0.G(steps.get(i12).getFields())) == null) {
                    g02 = null;
                } else {
                    this.f231861Y.o(str);
                    g02 = kotlin.G0.f406611a;
                }
                if (g02 != null) {
                    z12 = this.f231856T;
                }
            }
        }
        if (z12) {
            this.f231881s0.accept(Integer.valueOf(i12));
        }
    }

    public final boolean Oe() {
        CategoryPublishStep.Params.Config config;
        List<CategoryPublishStep.Params.NavigationButton> conditionButtons;
        CategoryPublishStep.Params.Config config2;
        CategoryPublishStep categoryPublishStepOe = oe();
        CategoryPublishStep.Params params = categoryPublishStepOe instanceof CategoryPublishStep.Params ? (CategoryPublishStep.Params) categoryPublishStepOe : null;
        if (!((params == null || (config2 = params.getConfig()) == null) ? false : kotlin.jvm.internal.L.f(config2.getIsContinueButtonHidden(), Boolean.TRUE))) {
            return false;
        }
        CategoryPublishStep categoryPublishStepOe2 = oe();
        CategoryPublishStep.Params params2 = categoryPublishStepOe2 instanceof CategoryPublishStep.Params ? (CategoryPublishStep.Params) categoryPublishStepOe2 : null;
        if (!((params2 == null || (config = params2.getConfig()) == null || (conditionButtons = config.getConditionButtons()) == null || !O2.a(conditionButtons)) ? false : true)) {
            return false;
        }
        Theme themeVe = ve();
        return themeVe != null && Theme.INSTANCE.isAvitoRe23(themeVe);
    }

    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.maybe.I Pe(final int i12) {
        return new C41917k(new l41.s() { // from class: com.avito.android.publish.A0
            @Override // l41.s
            public final Object get() {
                C0 c02 = this.f231830b;
                if (!c02.Be()) {
                    if (i12 == c02.f231861Y.getStepIndex()) {
                        return io.reactivex.rxjava3.core.q.i(kotlin.G0.f406611a);
                    }
                }
                return C41928w.f403335b;
            }
        }).h(new K0(this));
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final Q0 Qe(CategoryPublishStep categoryPublishStep, int i12, a aVar, ScreenTransfer screenTransfer) throws NotFoundException {
        PublishState.StepState imei;
        PublishState.StepState imei2;
        int i13 = 1;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        switch (b.f231889a[N0.a(categoryPublishStep).ordinal()]) {
            case 1:
            case 2:
                return new Q0.s(i12, screenTransfer);
            case 3:
                return new Q0.x(i12);
            case 4:
                CategoryPublishStep.Wizard wizard = (CategoryPublishStep.Wizard) categoryPublishStep;
                PublishState publishState = this.f231861Y;
                PublishState.StepState stepState = publishState.k().get(Integer.valueOf(i12));
                boolean z22 = stepState instanceof PublishState.StepState.Wizard;
                Object obj = stepState;
                if (!z22) {
                    kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
                    kotlin.reflect.d dVarB = n0Var.b(PublishState.StepState.Wizard.class);
                    if (dVarB.equals(n0Var.b(PublishState.StepState.Wizard.class))) {
                        imei = new PublishState.StepState.Wizard(null, null, null, 7, null);
                    } else if (dVarB.equals(n0Var.b(PublishState.StepState.CategoriesSuggestions.class))) {
                        imei = new PublishState.StepState.CategoriesSuggestions(null, null, null, null, 15, null);
                    } else if (dVarB.equals(n0Var.b(PublishState.StepState.Vin.class))) {
                        imei = new PublishState.StepState.Vin(z15 ? 1 : 0, i13, z14 ? 1 : 0);
                    } else {
                        if (!dVarB.equals(n0Var.b(PublishState.StepState.Imei.class))) {
                            throw new NotFoundException(n0Var.b(PublishState.StepState.Wizard.class).toString(), (Throwable) null, 2, (C42822w) null);
                        }
                        imei = new PublishState.StepState.Imei(z13 ? 1 : 0, i13, z12 ? 1 : 0);
                    }
                    publishState.k().put(Integer.valueOf(i12), imei);
                    obj = (PublishState.StepState.Wizard) imei;
                }
                PublishState.StepState.a aVar2 = (PublishState.StepState.a) obj;
                Navigation navigationI = aVar == a.f231886c ? this.f231861Y.getRootNavigation() : this.f231861Y.getNavigation();
                Navigation navigationC = aVar2.getPreviousNavigation();
                if (navigationC != null) {
                    navigationI = navigationC;
                }
                aVar2.a(navigationI);
                CategoryPublishStep.Wizard.Config config = wizard.getConfig();
                return new Q0.y(i12, navigationI, config != null ? config.getLeaves() : null);
            case 5:
                PublishState publishState2 = this.f231861Y;
                PublishState.StepState stepState2 = publishState2.k().get(Integer.valueOf(i12));
                boolean z23 = stepState2 instanceof PublishState.StepState.CategoriesSuggestions;
                Object obj2 = stepState2;
                if (!z23) {
                    kotlin.jvm.internal.n0 n0Var2 = kotlin.jvm.internal.m0.f406844a;
                    kotlin.reflect.d dVarB2 = n0Var2.b(PublishState.StepState.CategoriesSuggestions.class);
                    if (dVarB2.equals(n0Var2.b(PublishState.StepState.Wizard.class))) {
                        imei2 = new PublishState.StepState.Wizard(null, null, null, 7, null);
                    } else if (dVarB2.equals(n0Var2.b(PublishState.StepState.CategoriesSuggestions.class))) {
                        imei2 = new PublishState.StepState.CategoriesSuggestions(null, null, null, null, 15, null);
                    } else if (dVarB2.equals(n0Var2.b(PublishState.StepState.Vin.class))) {
                        imei2 = new PublishState.StepState.Vin(z19 ? 1 : 0, i13, z18 ? 1 : 0);
                    } else {
                        if (!dVarB2.equals(n0Var2.b(PublishState.StepState.Imei.class))) {
                            throw new NotFoundException(n0Var2.b(PublishState.StepState.CategoriesSuggestions.class).toString(), (Throwable) null, 2, (C42822w) null);
                        }
                        imei2 = new PublishState.StepState.Imei(z17 ? 1 : 0, i13, z16 ? 1 : 0);
                    }
                    publishState2.k().put(Integer.valueOf(i12), imei2);
                    obj2 = (PublishState.StepState.CategoriesSuggestions) imei2;
                }
                PublishState.StepState.a aVar3 = (PublishState.StepState.a) obj2;
                Navigation navigationI2 = aVar == a.f231886c ? this.f231861Y.getRootNavigation() : this.f231861Y.getNavigation();
                Navigation navigationC2 = aVar3.getPreviousNavigation();
                if (navigationC2 != null) {
                    navigationI2 = navigationC2;
                }
                aVar3.a(navigationI2);
                return new Q0.r(i12);
            case 6:
                return new Q0.v(i12);
            case 7:
                return new Q0.u(i12);
            case 8:
                return new Q0.t(i12);
            case 9:
                return new Q0.w(i12, ((CategoryPublishStep.PriceList) categoryPublishStep).getConfig().getPriceListId());
            case 10:
                return new Q0.k(i12);
            case 11:
                return Q0.a.f232040c;
            case 12:
                return new Q0.s(i12, screenTransfer);
            case 13:
                return new Q0.l(i12);
            case 14:
                return new Q0.i(i12);
            case 15:
                return new Q0.g(i12, false);
            case 16:
                return new Q0.m(i12);
            case 17:
                return new Q0.e(i12);
            case 18:
                return new Q0.q(i12);
            case 19:
                return new Q0.n(i12);
            case 20:
                throw new IllegalArgumentException("Unknown combination of type '" + categoryPublishStep.getType() + "' and subtype '" + categoryPublishStep.getSubtype() + '\'');
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void Re(@Y61.k CategoryModel categoryModel) {
        PublishState publishState = this.f231861Y;
        publishState.t(publishState.getStepIndex(), categoryModel);
        this.f231861Y.q(categoryModel.getNavigation());
        this.f231846J.C0(this.f231861Y.getNavigation().getCategoryId());
        if (!Be()) {
            xe(null);
            return;
        }
        Me(null);
        this.f231859W.setValue(new Q0.g(this.f231861Y.getStepIndex(), true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Se(@Y61.k List<? extends CategoryPublishStep> list) {
        Object next;
        List<CategoryPublishStep> listUe = ue();
        List<CategoryPublishStep> list2 = listUe;
        if (list2 != null && !list2.isEmpty()) {
            Q1 q12 = this.f231848L;
            q12.getClass();
            kotlin.reflect.n<Object> nVar = Q1.f67448x0[44];
            if (((Boolean) q12.f67466R.a().invoke()).booleanValue()) {
                int iJ2 = this.f231861Y.getStepIndex() + 1;
                List listE0 = C42745f0.E0(list, iJ2);
                ArrayList arrayList = new ArrayList(C42745f0.q(listE0, 10));
                Iterator it = listE0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CategoryPublishStep) it.next()).getHash());
                }
                List<CategoryPublishStep> list3 = listUe;
                List listE02 = C42745f0.E0(list3, iJ2);
                ArrayList arrayList2 = new ArrayList(C42745f0.q(listE02, 10));
                Iterator it2 = listE02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((CategoryPublishStep) it2.next()).getHash());
                }
                if (!arrayList.equals(arrayList2)) {
                    String str = (String) C42745f0.K(this.f231861Y.getStepIndex(), arrayList);
                    Iterator it3 = C42745f0.S0(list3).iterator();
                    while (true) {
                        kotlin.collections.J0 j02 = (kotlin.collections.J0) it3;
                        if (!j02.f406646b.hasNext()) {
                            next = null;
                            break;
                        }
                        next = j02.next();
                        if (kotlin.jvm.internal.L.f(((CategoryPublishStep) ((kotlin.collections.H0) next).f406644b).getHash(), str)) {
                            break;
                        }
                    }
                    kotlin.collections.H0 h02 = (kotlin.collections.H0) next;
                    if (h02 == null) {
                        h02 = (kotlin.collections.H0) C42745f0.D(C42745f0.S0(list3));
                    }
                    int i12 = h02.f406643a;
                    CategoryPublishStep categoryPublishStep = (CategoryPublishStep) h02.f406644b;
                    switch (b.f231889a[N0.a(categoryPublishStep).ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 12:
                        case 19:
                        case 20:
                            break;
                        case 10:
                        case 11:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                            int i13 = i12 + 1;
                            if (i13 >= 0 && i13 <= C42745f0.J(listUe)) {
                                categoryPublishStep = listUe.get(i13);
                            }
                            categoryPublishStep = categoryPublishStep;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    this.f231859W.setValue(Q0.d.f232043c);
                    Ie(categoryPublishStep.getId());
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.avito.android.publish.InterfaceC34155z
    @Y61.k
    public final Navigation U() {
        return this.f231861Y.getNavigation();
    }

    public final boolean le() {
        Map<String, ? extends Object> map = this.f231877o0;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        String str = this.f231878p0;
        return !(str == null || str.length() == 0);
    }

    public final boolean me() {
        CategoryPublishStep.Params.Config config;
        CategoryPublishStep categoryPublishStepOe = oe();
        CategoryPublishStep.Params params = categoryPublishStepOe instanceof CategoryPublishStep.Params ? (CategoryPublishStep.Params) categoryPublishStepOe : null;
        if (params != null && (config = params.getConfig()) != null) {
            CategoryPublishStep.Params.FormStyle formStyle = config.getFormStyle();
            Boolean hasSpaceBefore = formStyle != null ? formStyle.getHasSpaceBefore() : null;
            if (hasSpaceBefore != null) {
                return hasSpaceBefore.booleanValue();
            }
        }
        return true;
    }

    @Y61.l
    public final String ne() {
        CategoryPublishStep categoryPublishStepOe = oe();
        if (categoryPublishStepOe != null) {
            return categoryPublishStepOe.toString();
        }
        return null;
    }

    public final CategoryPublishStep oe() {
        return re(Integer.valueOf(this.f231861Y.getStepIndex()));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f231853Q.e();
        this.f231854R.e();
        super.onCleared();
    }

    @Y61.k
    public final ParametersTree pe(int i12) {
        ParametersTree[] parametersTreeArr = this.f231858V;
        return (i12 < 0 || i12 > parametersTreeArr.length + (-1)) ? new SimpleParametersTree(C42784z0.f406748b) : parametersTreeArr[i12];
    }

    @Y61.l
    public final Boolean qe() {
        if (kotlin.jvm.internal.L.f(this.f231849M.a(), InterfaceC42451b.C11596b.f405967a)) {
            return Boolean.FALSE;
        }
        CategoryParameters categoryParameters = this.f231873k0;
        if (categoryParameters != null) {
            return Boolean.valueOf(categoryParameters.getShouldSaveDraft());
        }
        return null;
    }

    @Y61.l
    public final CategoryPublishStep re(@Y61.l Integer num) {
        List<CategoryPublishStep> listUe;
        if (ue() == null || num == null || num.intValue() == -1 || (listUe = ue()) == null) {
            return null;
        }
        return (CategoryPublishStep) C42745f0.K(num.intValue(), listUe);
    }

    @Y61.l
    public final String se() {
        CategoryPublishStep categoryPublishStepRe = re(Integer.valueOf(this.f231861Y.getStepIndex()));
        if (categoryPublishStepRe != null) {
            return categoryPublishStepRe.getId();
        }
        return null;
    }

    public final int te(CategoryPublishStep categoryPublishStep) {
        if (categoryPublishStep != null) {
            List<CategoryPublishStep> listUe = ue();
            Integer numValueOf = listUe != null ? Integer.valueOf(listUe.indexOf(categoryPublishStep)) : null;
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return -1;
    }

    @Y61.l
    public final List<CategoryPublishStep> ue() {
        CategoryParameters categoryParameters = this.f231873k0;
        if (categoryParameters != null) {
            return categoryParameters.getSteps();
        }
        return null;
    }

    @Y61.l
    public final Theme ve() {
        Parcelable parcelableOe = oe();
        ThemedStep themedStep = parcelableOe instanceof ThemedStep ? (ThemedStep) parcelableOe : null;
        if (themedStep != null) {
            return themedStep.getTheme();
        }
        return null;
    }

    public final void we(@Y61.k SlotType slotType) {
        List listE0;
        CategoryParameters categoryParameters;
        List<ParameterSlot> parameters;
        Object next;
        String id2;
        int iNextIndex;
        PublishSession.StepType stepTypeA;
        List<CategoryPublishStep> listUe = ue();
        if (listUe == null || (listE0 = C42745f0.E0(listUe, this.f231861Y.getStepIndex())) == null || (categoryParameters = this.f231873k0) == null || (parameters = categoryParameters.getParameters()) == null) {
            return;
        }
        Iterator<T> it = parameters.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ParameterSlot parameterSlot = (ParameterSlot) next;
            if ((parameterSlot instanceof Slot) && ((Slot) parameterSlot).getSlotType() == slotType) {
                break;
            }
        }
        ParameterSlot parameterSlot2 = (ParameterSlot) next;
        if (parameterSlot2 == null || (id2 = parameterSlot2.getId()) == null) {
            return;
        }
        ListIterator listIterator = listE0.listIterator(listE0.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            } else if (((CategoryPublishStep) listIterator.previous()).getFields().contains(id2)) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex >= 0) {
            Ne(iNextIndex);
            CategoryPublishStep categoryPublishStepRe = re(Integer.valueOf(iNextIndex));
            this.f231859W.setValue(new Q0.b(iNextIndex, (categoryPublishStepRe == null || (stepTypeA = N0.a(categoryPublishStepRe)) == null) ? false : stepTypeA.f232027d));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    @android.annotation.SuppressLint({"HardcodeStringDetector"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void xe(@Y61.l com.avito.android.analytics.screens.tracker.ScreenTransfer r6) {
        /*
            r5 = this;
            java.util.List r0 = r5.ue()
            r1 = 6
            r2 = 0
            if (r0 == 0) goto L33
            com.avito.android.publish.PublishState r3 = r5.f231861Y
            int r3 = r3.getStepIndex()
            int r0 = r0.size()
            int r0 = r0 + (-1)
            if (r3 != r0) goto L33
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Trying to go next step from the last one {index: "
            r6.<init>(r0)
            com.avito.android.publish.PublishState r0 = r5.f231861Y
            int r0 = r0.getStepIndex()
            r6.append(r0)
            r0 = 125(0x7d, float:1.75E-43)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            Ge(r5, r6, r2, r1)
            goto L8a
        L33:
            java.util.List r0 = r5.ue()
            if (r0 == 0) goto L48
            java.util.Collection r0 = (java.util.Collection) r0
            com.avito.android.remote.model.category_parameters.CategoryPublishStep r3 = r5.oe()
            r4 = 0
            java.lang.Object r0 = com.avito.android.util.C35755b0.e(r0, r3, r4)
            com.avito.android.remote.model.category_parameters.CategoryPublishStep r0 = (com.avito.android.remote.model.category_parameters.CategoryPublishStep) r0
            if (r0 != 0) goto L6e
        L48:
            java.lang.Integer r0 = r5.f231857U
            if (r0 == 0) goto L60
            int r0 = r0.intValue()
            java.util.List r3 = r5.ue()
            if (r3 == 0) goto L5d
            java.lang.Object r0 = kotlin.collections.C42745f0.K(r0, r3)
            com.avito.android.remote.model.category_parameters.CategoryPublishStep r0 = (com.avito.android.remote.model.category_parameters.CategoryPublishStep) r0
            goto L5e
        L5d:
            r0 = r2
        L5e:
            if (r0 != 0) goto L6e
        L60:
            java.util.List r0 = r5.ue()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = kotlin.collections.C42745f0.G(r0)
            com.avito.android.remote.model.category_parameters.CategoryPublishStep r0 = (com.avito.android.remote.model.category_parameters.CategoryPublishStep) r0
            goto L6e
        L6d:
            r0 = r2
        L6e:
            if (r0 != 0) goto L76
            java.lang.String r6 = "Cannot go to the next step"
            Ge(r5, r6, r2, r1)
            return
        L76:
            r5.Me(r0)
            com.avito.android.publish.PublishState r1 = r5.f231861Y     // Catch: java.lang.IllegalArgumentException -> L8b
            int r1 = r1.getStepIndex()     // Catch: java.lang.IllegalArgumentException -> L8b
            com.avito.android.publish.C0$a r2 = com.avito.android.publish.C0.a.f231885b     // Catch: java.lang.IllegalArgumentException -> L8b
            com.avito.android.publish.Q0 r6 = r5.Qe(r0, r1, r2, r6)     // Catch: java.lang.IllegalArgumentException -> L8b
            com.avito.android.util.architecture_components.D<com.avito.android.publish.Q0> r0 = r5.f231859W
            r0.setValue(r6)
        L8a:
            return
        L8b:
            r6 = move-exception
            r0 = 4
            java.lang.String r1 = "Go to next step routing action"
            Ge(r5, r1, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.C0.xe(com.avito.android.analytics.screens.tracker.ScreenTransfer):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ye() {
        /*
            r7 = this;
            java.util.List r0 = r7.ue()
            com.avito.android.util.architecture_components.D<com.avito.android.publish.Q0> r1 = r7.f231859W
            if (r0 != 0) goto Le
            com.avito.android.publish.Q0$c r0 = com.avito.android.publish.Q0.c.f232042c
            r1.setValue(r0)
            return
        Le:
            com.avito.android.remote.model.category_parameters.CategoryPublishStep r2 = r7.oe()
        L12:
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r2 = com.avito.android.util.C35755b0.f(r2, r3)
            r3 = 1
            if (r2 == 0) goto L4b
            com.avito.android.publish.PublishState r4 = r7.f231861Y
            java.util.Map r4 = r4.k()
            r5 = r2
            com.avito.android.remote.model.category_parameters.CategoryPublishStep r5 = (com.avito.android.remote.model.category_parameters.CategoryPublishStep) r5
            int r6 = r7.te(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r4 = r4.get(r6)
            com.avito.android.publish.PublishState$StepState r4 = (com.avito.android.publish.PublishState.StepState) r4
            boolean r6 = r4 instanceof com.avito.android.publish.PublishState.StepState.a
            if (r6 == 0) goto L44
            com.avito.android.publish.PublishState$StepState$a r4 = (com.avito.android.publish.PublishState.StepState.a) r4
            com.avito.android.remote.model.Navigation r4 = r4.getPreviousNavigation()
            if (r4 == 0) goto L44
            com.avito.android.publish.PublishState r6 = r7.f231861Y
            r6.q(r4)
        L44:
            boolean r4 = r5.getSkipOnBackwards()
            if (r4 != r3) goto L4b
            goto L12
        L4b:
            java.lang.Integer r0 = r7.f231857U
            r4 = 0
            if (r0 == 0) goto L5e
            int r0 = r0.intValue()
            r5 = r2
            com.avito.android.remote.model.category_parameters.CategoryPublishStep r5 = (com.avito.android.remote.model.category_parameters.CategoryPublishStep) r5
            int r5 = r7.te(r5)
            if (r5 >= r0) goto L5e
            goto L5f
        L5e:
            r3 = r4
        L5f:
            if (r2 == 0) goto L8f
            if (r3 != 0) goto L8f
            com.avito.android.remote.model.category_parameters.CategoryPublishStep r2 = (com.avito.android.remote.model.category_parameters.CategoryPublishStep) r2
            r7.Me(r2)
            com.avito.android.publish.Q0$b r0 = new com.avito.android.publish.Q0$b
            com.avito.android.publish.PublishState r2 = r7.f231861Y
            int r2 = r2.getStepIndex()
            com.avito.android.publish.PublishState r3 = r7.f231861Y
            int r3 = r3.getStepIndex()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.avito.android.remote.model.category_parameters.CategoryPublishStep r3 = r7.re(r3)
            if (r3 == 0) goto L88
            com.avito.android.publish.PublishSession$StepType r3 = com.avito.android.publish.N0.a(r3)
            if (r3 == 0) goto L88
            boolean r4 = r3.f232027d
        L88:
            r0.<init>(r2, r4)
            r1.setValue(r0)
            goto L94
        L8f:
            com.avito.android.publish.Q0$c r0 = com.avito.android.publish.Q0.c.f232042c
            r1.setValue(r0)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.C0.ye():void");
    }

    public final boolean ze(@Y61.k Map<String, ? extends PretendErrorValue> map) {
        PublishSession.StepType stepTypeA;
        List<CategoryPublishStep> listUe = ue();
        if (listUe == null) {
            return false;
        }
        int iJ2 = this.f231861Y.getStepIndex();
        Integer numValueOf = Integer.valueOf(iJ2);
        Integer numValueOf2 = null;
        if (iJ2 == -1) {
            numValueOf = null;
        }
        kotlin.ranges.k it = kotlin.ranges.s.k(numValueOf != null ? numValueOf.intValue() : listUe.size() - 1, 0).iterator();
        while (it.f406910d) {
            int iA2 = it.a();
            if (this.f231858V[iA2].applyPretendResult(map)) {
                numValueOf2 = Integer.valueOf(iA2);
            }
        }
        if (numValueOf2 != null) {
            Me(re(Integer.valueOf(numValueOf2.intValue())));
            this.f231883u0 = true;
            int iJ3 = this.f231861Y.getStepIndex();
            CategoryPublishStep categoryPublishStepRe = re(Integer.valueOf(this.f231861Y.getStepIndex()));
            this.f231859W.setValue(new Q0.b(iJ3, (categoryPublishStepRe == null || (stepTypeA = N0.a(categoryPublishStepRe)) == null) ? false : stepTypeA.f232027d));
        }
        return numValueOf2 != null;
    }
}
