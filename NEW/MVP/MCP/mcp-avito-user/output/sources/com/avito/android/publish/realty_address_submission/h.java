package com.avito.android.publish.realty_address_submission;

import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import com.avito.android.Q1;
import com.avito.android.details.b;
import com.avito.android.messenger.conversation.mvi.file_upload.C32102w0;
import com.avito.android.publish.C0;
import com.avito.android.publish.details.C33771m1;
import com.avito.android.publish.details.K1;
import com.avito.android.publish.details.S0;
import com.avito.android.remote.H0;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.CategoryIds;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.PublishMethodWithAllSelectedValueParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.submission.RealtyAddressSubmissionInfo;
import com.avito.android.remote.model.submission.RealtyAddressSubmissionResult;
import com.avito.android.remote.model.submission.RealtyAddressSubmissionResultKt;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.internal.operators.single.U;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: RealtyAddressSubmissionViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/realty_address_submission/h;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/details/b$b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends M0 implements b.InterfaceC4110b {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final H0 f239052E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final C0 f239053J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final S0 f239054K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C33771m1 f239055L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final Q1 f239056M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f239057N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f239058O = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final D<K1.AbstractC33668b> f239059P = new D<>();

    /* compiled from: RealtyAddressSubmissionViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResult;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/submission/RealtyAddressSubmissionResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            RealtyAddressSubmissionResult realtyAddressSubmissionResult = (RealtyAddressSubmissionResult) obj;
            boolean z12 = realtyAddressSubmissionResult instanceof RealtyAddressSubmissionResult.Ok;
            h hVar = h.this;
            if (z12) {
                RealtyAddressSubmissionInfo realtyAddressSubmissionInfo = RealtyAddressSubmissionResultKt.toRealtyAddressSubmissionInfo((RealtyAddressSubmissionResult.Ok) realtyAddressSubmissionResult);
                if (realtyAddressSubmissionInfo != null) {
                    hVar.f239059P.setValue(new K1.AbstractC33668b.a(realtyAddressSubmissionInfo));
                    return;
                }
                return;
            }
            if (realtyAddressSubmissionResult instanceof RealtyAddressSubmissionResult.Error) {
                ApiError.Failure failure = new ApiError.Failure(((RealtyAddressSubmissionResult.Error) realtyAddressSubmissionResult).getErrorMessage());
                hVar.getClass();
                hVar.f239059P.setValue(new K1.AbstractC33668b.j(failure.getF244063c()));
                return;
            }
            if (realtyAddressSubmissionResult instanceof RealtyAddressSubmissionResult.NetworkError) {
                hVar.f239059P.setValue(new K1.AbstractC33668b.j(new ApiError.NetworkIOError(hVar.f239055L.f234836c).getF244063c()));
            }
        }
    }

    public h(@Y61.k H0 h02, @Y61.k C0 c02, @Y61.k S0 s02, @Y61.k C33771m1 c33771m1, @Y61.k Q1 q12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f239052E = h02;
        this.f239053J = c02;
        this.f239054K = s02;
        this.f239055L = c33771m1;
        this.f239056M = q12;
        this.f239057N = interfaceC35745a5;
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void I9(@Y61.k String str) {
        CategoryParameters categoryParametersC0;
        C0 c02 = this.f239053J;
        String strValueOf = String.valueOf(c02.f231861Y.getNavigation().getCategoryId());
        Q1 q12 = this.f239056M;
        q12.getClass();
        n<Object> nVar = Q1.f67448x0[0];
        if (!((Boolean) q12.f67476b.a().invoke()).booleanValue() || !CategoryIds.RE.INSTANCE.allIds().contains(strValueOf) || c02.Be() || (categoryParametersC0 = this.f239054K.C0()) == null) {
            return;
        }
        com.google.gson.k kVar = new com.google.gson.k();
        for (ParameterSlot parameterSlot : categoryParametersC0) {
            if (parameterSlot instanceof SelectParameter.Flat) {
                SelectParameter.Flat flat = (SelectParameter.Flat) parameterSlot;
                if (flat.getValue() != null) {
                    kVar.y(parameterSlot.getId(), flat.getValue());
                }
            }
        }
        U u12 = this.f239052E.U(str, strValueOf, kVar.toString()).S().r(i.f239061b).u(new C32102w0(12));
        InterfaceC35745a5 interfaceC35745a5 = this.f239057N;
        this.f239058O.b(u12.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new a(), io.reactivex.rxjava3.internal.functions.a.f401996f));
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void Nc() {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void n9() {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void vd() {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void C5(@Y61.k AddressParameter addressParameter) {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void N7(@Y61.k PublishMethodWithAllSelectedValueParameter publishMethodWithAllSelectedValueParameter) {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void h5(@l String str) {
    }

    @Override // com.avito.android.details.b.InterfaceC4110b
    public final void c3(@l ParameterSlot parameterSlot, @l String str) {
    }
}
