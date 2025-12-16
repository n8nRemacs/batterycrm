package com.avito.android.publish.details.computer_vision;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishState;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.remote.model.ParamKeyValue;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameterKt;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.disposables.d;
import io.reactivex.rxjava3.internal.operators.completable.r;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l41.g;

/* compiled from: ComputerVisionDetailsHelper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/computer_vision/b;", "Lcom/avito/android/publish/details/computer_vision/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.publish.details.computer_vision.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C0 f233584a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f233585b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.computer_vision.a f233586c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.details.a f233587d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC33535v f233588e;

    /* compiled from: ComputerVisionDetailsHelper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f233589b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar) {
            this.f233589b = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            this.f233589b.invoke();
        }
    }

    /* compiled from: ComputerVisionDetailsHelper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.computer_vision.b$b, reason: collision with other inner class name */
    public static final class C7086b extends N implements l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f233590l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7086b(Y41.a<G0> aVar) {
            super(1);
            this.f233590l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            this.f233590l.invoke();
            V2.f318762a.a("PublishDetailsPresenter", "Failed to observe suggest by photo", th2);
            return G0.f406611a;
        }
    }

    /* compiled from: ComputerVisionDetailsHelper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/ParamKeyValue;", "suggestedParams", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<List<? extends ParamKeyValue>, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f233592m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.a<G0> aVar) {
            super(1);
            this.f233592m = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r9v5, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(List<? extends ParamKeyValue> list) {
            b bVar = b.this;
            CategoryParameters categoryParametersC0 = bVar.f233587d.C0();
            C0 c02 = bVar.f233584a;
            PublishState publishState = c02.f231861Y;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!publishState.e().contains(((ParamKeyValue) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ParamKeyValue paramKeyValue = (ParamKeyValue) it.next();
                ParameterSlot parameterSlotFindParameter = categoryParametersC0 != null ? categoryParametersC0.findParameter(paramKeyValue.getId()) : null;
                CharParameter charParameter = parameterSlotFindParameter instanceof CharParameter ? (CharParameter) parameterSlotFindParameter : null;
                if (charParameter != null) {
                    EditableParameterKt.applyPureValue(charParameter, paramKeyValue.getValue());
                    bVar.f233588e.O(c02.f231861Y.getNavigation(), charParameter.getId(), charParameter.getTitle(), paramKeyValue.getValue());
                }
            }
            this.f233592m.invoke();
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k C0 c02, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.computer_vision.a aVar, @k com.avito.android.details.a aVar2, @k InterfaceC33535v interfaceC33535v) {
        this.f233584a = c02;
        this.f233585b = interfaceC35745a5;
        this.f233586c = aVar;
        this.f233587d = aVar2;
        this.f233588e = interfaceC33535v;
    }

    @Override // com.avito.android.publish.details.computer_vision.a
    @k
    public final d a(@k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        com.avito.android.computer_vision.a aVar3 = this.f233586c;
        return !aVar3.d() ? new r(new com.avito.android.large_transaction.c(1, aVar2)).u() : A1.e(aVar3.f().s(this.f233585b.e()).j(new a(aVar)), new C7086b(aVar2), new c(aVar2));
    }

    @Override // com.avito.android.publish.details.computer_vision.a
    public final void b() {
        ParametersTree parametersTreeWa = this.f233587d.wa();
        PhotoParameter photoParameter = parametersTreeWa != null ? (PhotoParameter) parametersTreeWa.getFirstParameterOfType(PhotoParameter.class) : null;
        com.avito.android.computer_vision.a aVar = this.f233586c;
        if (photoParameter == null) {
            aVar.h(false);
        } else if (!photoParameter.getShouldUploadPhotoForCV()) {
            aVar.h(false);
        } else {
            aVar.g(photoParameter.getSuggestByPhotoMaxImages());
            aVar.h(true);
        }
    }

    @Override // com.avito.android.publish.details.computer_vision.a
    public final void c() {
        this.f233586c.reset();
    }
}
