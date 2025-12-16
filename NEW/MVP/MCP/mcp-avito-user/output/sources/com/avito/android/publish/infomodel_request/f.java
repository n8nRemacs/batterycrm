package com.avito.android.publish.infomodel_request;

import Zd0.InterfaceC19543a;
import Zd0.InterfaceC19545c;
import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.publish.FromPage;
import com.avito.android.analytics.screens.tracker.Z;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishParametersInteractor;
import com.avito.android.publish.PublishSession;
import com.avito.android.publish.PublishState;
import com.avito.android.publish.Q0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.InterfaceC33685d0;
import com.avito.android.publish.infomodel_request.a;
import com.avito.android.remote.model.Draft;
import com.avito.android.remote.model.DraftField;
import com.avito.android.remote.model.DraftState;
import com.avito.android.remote.model.ImageUploadResult;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.WizardParameter;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.MultiGeoParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.util.AbstractC35806h3;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.NotFoundException;
import com.avito.android.util.V2;
import com.google.gson.Gson;
import io.reactivex.rxjava3.core.I;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import yc.C50213a;

/* compiled from: InfomodelRequestViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/infomodel_request/f;", "Landroidx/lifecycle/M0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final PublishParametersInteractor f236149E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33685d0 f236150J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final Gson f236151K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f236152L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final C50213a f236153M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19545c f236154N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f236155O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19543a f236156P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final Z f236157Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final C0 f236158R;

    /* renamed from: U, reason: collision with root package name */
    public boolean f236161U;

    /* renamed from: W, reason: collision with root package name */
    public boolean f236163W;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f236159S = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: T, reason: collision with root package name */
    public boolean f236160T = true;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final C23038g0<AbstractC35806h3<?>> f236162V = new C23038g0<>();

    /* compiled from: InfomodelRequestViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f236164a;

        static {
            int[] iArr = new int[PublishSession.StepType.values().length];
            try {
                iArr[PublishSession.StepType.f232007i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PublishSession.StepType.f232008j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f236164a = iArr;
        }
    }

    /* compiled from: InfomodelRequestViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/h3;", "Lcom/avito/android/publish/infomodel_request/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/h3;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) throws NotFoundException {
            PhotoParameter photoParameter;
            ArrayList arrayList;
            List<ImageUploadResult> onlyUploaded;
            List<ImageUploadResult> onlyUploaded2;
            List<ImageUploadResult> onlyUploaded3;
            PublishState publishState;
            AbstractC35806h3<?> abstractC35806h3 = (AbstractC35806h3) obj;
            f.this.f236162V.setValue(abstractC35806h3);
            if (!(abstractC35806h3 instanceof AbstractC35806h3.d)) {
                if (abstractC35806h3 instanceof AbstractC35806h3.b) {
                    V2.f318762a.d("InfomodelRequest", "loadInfomodelData failed: " + ((AbstractC35806h3.b) abstractC35806h3).f318891a);
                    return;
                }
                if ((abstractC35806h3 instanceof AbstractC35806h3.a) || abstractC35806h3.equals(AbstractC35806h3.c.f318892a) || abstractC35806h3.equals(AbstractC35806h3.e.f318894a)) {
                    return;
                }
                abstractC35806h3.equals(AbstractC35806h3.f.f318895a);
                return;
            }
            f fVar = f.this;
            com.avito.android.publish.infomodel_request.a aVar = (com.avito.android.publish.infomodel_request.a) ((AbstractC35806h3.d) abstractC35806h3).f318893a;
            fVar.getClass();
            if (aVar instanceof a.b) {
                C0 c02 = fVar.f236158R;
                DeepLink deepLink = ((a.b) aVar).f236093a;
                c02.getClass();
                c02.f231859W.setValue(new Q0.j(deepLink));
            } else if (aVar instanceof a.C7112a) {
                fVar.f236157Q.f();
                a.C7112a c7112a = (a.C7112a) aVar;
                fVar.f236155O.K(c7112a.f236091a.getNavigation());
                Draft draft = c7112a.f236091a.getDraft();
                Navigation navigation2 = c7112a.f236091a.getNavigation();
                if (draft != null) {
                    C50213a c50213a = fVar.f236153M;
                    String publishSessionId = draft.getPublishSessionId();
                    c50213a.f443211c = publishSessionId;
                    c50213a.f443210b = publishSessionId;
                    if (fVar.f236161U) {
                        fVar.f236156P.a(navigation2, draft.getDraftId());
                    }
                }
                C0 c03 = fVar.f236158R;
                if ((c03.f231865c0 != null || c03.Be() || c03.le()) && fVar.f236160T && (photoParameter = (PhotoParameter) c7112a.f236091a.getFirstParameterOfType(PhotoParameter.class)) != null) {
                    PhotoParameter.ImageUploadListWrapper value = photoParameter.getValue();
                    Integer numValueOf = null;
                    if (value == null || (onlyUploaded3 = value.getOnlyUploaded()) == null) {
                        arrayList = null;
                    } else {
                        List<ImageUploadResult> list = onlyUploaded3;
                        arrayList = new ArrayList(C42745f0.q(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ImageUploadResult) it.next()).getUploadId());
                        }
                    }
                    fVar.f236155O.l(arrayList);
                    InterfaceC33685d0 interfaceC33685d0 = fVar.f236150J;
                    interfaceC33685d0.a();
                    PhotoParameter.ImageUploadListWrapper value2 = photoParameter.getValue();
                    if (value2 != null && (onlyUploaded2 = value2.getOnlyUploaded()) != null) {
                        int i12 = 0;
                        for (T t12 : onlyUploaded2) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                C42745f0.H0();
                                throw null;
                            }
                            ImageUploadResult imageUploadResult = (ImageUploadResult) t12;
                            interfaceC33685d0.b(i12, imageUploadResult.getImage(), imageUploadResult.getUploadId());
                            i12 = i13;
                        }
                    }
                    PhotoParameter.ImageUploadListWrapper value3 = photoParameter.getValue();
                    if (value3 != null && (onlyUploaded = value3.getOnlyUploaded()) != null) {
                        numValueOf = Integer.valueOf(onlyUploaded.size());
                    }
                    fVar.f236158R.f231876n0 = numValueOf;
                }
                MultiGeoParameter multiGeoParameter = (MultiGeoParameter) c7112a.f236091a.getFirstParameterOfType(MultiGeoParameter.class);
                if (multiGeoParameter != null && L.f(multiGeoParameter.getId(), "165430")) {
                    fVar.f236155O.E0();
                }
                C0 c04 = fVar.f236158R;
                if ((c04.f231863a0 || c04.f231864b0) && (publishState = c7112a.f236092b) != null) {
                    c04.Je(c7112a.f236091a, publishState);
                } else {
                    c04.Ke(c7112a.f236091a);
                    c04.xe(fVar.f236157Q.d());
                }
                c04.f231875m0 = false;
            }
            fVar.f236163W = true;
        }
    }

    /* compiled from: InfomodelRequestViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C0.Ge(f.this.f236158R, "Failed to load infomodel data", (Throwable) obj, 4);
        }
    }

    public f(@Y61.k InterfaceC19543a interfaceC19543a, @Y61.k InterfaceC19545c interfaceC19545c, @Y61.k Z z12, @Y61.k PublishParametersInteractor publishParametersInteractor, @Y61.k C0 c02, @Y61.k InterfaceC33535v interfaceC33535v, @Y61.k InterfaceC33685d0 interfaceC33685d0, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k Gson gson, @Y61.k C50213a c50213a) {
        this.f236149E = publishParametersInteractor;
        this.f236150J = interfaceC33685d0;
        this.f236151K = gson;
        this.f236152L = interfaceC35745a5;
        this.f236153M = c50213a;
        this.f236154N = interfaceC19545c;
        this.f236155O = interfaceC33535v;
        this.f236156P = interfaceC19543a;
        this.f236157Q = z12;
        this.f236158R = c02;
    }

    public static String ke(CategoryPublishStep categoryPublishStep, Draft draft, String str) {
        List<DraftField> fields;
        Object next;
        Object obj = null;
        if (draft == null) {
            Iterator<T> it = categoryPublishStep.getFields().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                if (L.f((String) next2, str)) {
                    obj = next2;
                    break;
                }
            }
            return (String) obj;
        }
        DraftState state = draft.getState();
        if (state == null || (fields = state.getFields()) == null) {
            return null;
        }
        Iterator<T> it2 = fields.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (L.f(((DraftField) next).getId(), str)) {
                break;
            }
        }
        DraftField draftField = (DraftField) next;
        if (draftField != null) {
            return draftField.getValue();
        }
        return null;
    }

    public static void me(CategoryPublishStep categoryPublishStep, PublishState publishState, int i12, Navigation navigation2, Navigation navigation3, Navigation navigation4, Navigation navigation5) {
        if (categoryPublishStep instanceof CategoryPublishStep.Wizard) {
            publishState.k().put(Integer.valueOf(i12), new PublishState.StepState.Wizard(navigation2, navigation4, navigation3));
        } else if (categoryPublishStep instanceof CategoryPublishStep.SuggestCategory) {
            Map<Integer, PublishState.StepState> mapK = publishState.k();
            Integer numValueOf = Integer.valueOf(i12);
            String title = navigation5.getTitle();
            if (title == null) {
                title = "";
            }
            mapK.put(numValueOf, new PublishState.StepState.CategoriesSuggestions(navigation2, new WizardParameter(navigation5, title, navigation5.getDescription(), null, null, false, null, 120, null), null, null, 12, null));
        }
    }

    @SuppressLint({"HardcodeStringDetector"})
    public final void le() {
        I iQ2;
        I iN2;
        this.f236157Q.c();
        io.reactivex.rxjava3.disposables.c cVar = this.f236159S;
        ItemBrief itemBrief = this.f236158R.f231867e0;
        String id2 = itemBrief != null ? itemBrief.getId() : null;
        if (id2 == null) {
            C0 c02 = this.f236158R;
            this.f236153M.f443212d = FromPage.f90272b;
            this.f236153M.f443213e = null;
            iN2 = (this.f236160T ? this.f236149E.g(c02.f231861Y.getNavigation(), c02.f231865c0, c02.f231877o0, c02.f231878p0, c02.f231879q0, c02.f231868f0) : this.f236149E.e(c02.f231861Y.getNavigation(), c02.f231873k0, c02.f231875m0, c02.f231868f0)).z(this.f236152L.a());
        } else {
            if (this.f236158R.f231861Y.getNavigation().isEmpty()) {
                C50213a c50213a = this.f236153M;
                String strA = this.f236154N.a();
                c50213a.f443211c = strA;
                c50213a.f443210b = strA;
                this.f236153M.f443212d = FromPage.f90273c;
                this.f236153M.f443213e = id2;
                iQ2 = this.f236149E.h(id2).z(this.f236152L.a()).s(this.f236152L.e()).k(new m(this)).r(n.f236174b);
            } else {
                iQ2 = I.q(this.f236158R.f231861Y.getNavigation());
            }
            iN2 = iQ2.s(this.f236152L.a()).n(new l(this, id2));
        }
        cVar.b(iN2.F().d0(new h(this)).d0(i.f236168b).g(AbstractC35806h3.class).I(j.f236169b).m0(k.f236170b).r0(AbstractC35806h3.c.f318892a).j0(this.f236152L.e()).v0(new b(), new c(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f236159S.e();
        super.onCleared();
    }
}
