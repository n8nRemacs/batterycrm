package com.avito.android.publish.input_imei.di;

import android.os.Parcelable;
import com.avito.android.publish.C0;
import com.avito.android.publish.PublishState;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.util.NotFoundException;
import io.reactivex.rxjava3.internal.operators.maybe.I;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;

/* compiled from: InputImeiPublishViewModelWrapperModule.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/input_imei/di/j;", "Lcom/avito/android/publish/input_imei/di/m;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0 f236338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f236339b;

    public j(C0 c02, int i12) {
        this.f236338a = c02;
        this.f236339b = i12;
    }

    @Override // com.avito.android.publish.input_imei.di.m
    public final void D0() {
        this.f236338a.ye();
    }

    @Override // com.avito.android.publish.input_imei.di.m
    @Y61.k
    public final Navigation U() {
        return this.f236338a.f231861Y.getNavigation();
    }

    @Override // com.avito.android.publish.input_imei.di.m
    public final void a(@Y61.l String str) throws NotFoundException {
        PublishState.StepState imei;
        PublishState publishState = this.f236338a.f231861Y;
        Map<Integer, PublishState.StepState> mapK = publishState.k();
        int i12 = this.f236339b;
        Parcelable parcelable = (PublishState.StepState) mapK.get(Integer.valueOf(i12));
        if (!(parcelable instanceof PublishState.StepState.Imei)) {
            n0 n0Var = m0.f406844a;
            kotlin.reflect.d dVarB = n0Var.b(PublishState.StepState.Imei.class);
            if (dVarB.equals(n0Var.b(PublishState.StepState.Wizard.class))) {
                imei = new PublishState.StepState.Wizard(null, null, null, 7, null);
            } else if (dVarB.equals(n0Var.b(PublishState.StepState.CategoriesSuggestions.class))) {
                imei = new PublishState.StepState.CategoriesSuggestions(null, null, null, null, 15, null);
            } else if (dVarB.equals(n0Var.b(PublishState.StepState.Vin.class))) {
                imei = new PublishState.StepState.Vin(null, 1, null);
            } else {
                if (!dVarB.equals(n0Var.b(PublishState.StepState.Imei.class))) {
                    throw new NotFoundException(n0Var.b(PublishState.StepState.Imei.class).toString(), (Throwable) null, 2, (C42822w) null);
                }
                imei = new PublishState.StepState.Imei(null, 1, null);
            }
            publishState.k().put(Integer.valueOf(i12), imei);
            parcelable = (PublishState.StepState.Imei) imei;
        }
        ((PublishState.StepState.Imei) parcelable).g(str);
    }

    @Override // com.avito.android.publish.input_imei.di.m
    @Y61.k
    public final ParametersTree b(int i12) {
        return this.f236338a.pe(i12);
    }

    @Override // com.avito.android.publish.input_imei.di.m
    @Y61.k
    public final I c(int i12) {
        return this.f236338a.Pe(i12);
    }

    @Override // com.avito.android.publish.input_imei.di.m
    public final boolean d() {
        C0 c02 = this.f236338a;
        boolean z12 = c02.f231883u0;
        c02.f231883u0 = false;
        return z12;
    }

    @Override // com.avito.android.publish.input_imei.di.m
    public final void e() {
        this.f236338a.xe(null);
    }

    @Override // com.avito.android.publish.input_imei.di.m
    @Y61.l
    public final String f() {
        return this.f236338a.ne();
    }

    @Override // com.avito.android.publish.input_imei.di.m
    @Y61.l
    public final String g() throws NotFoundException {
        PublishState.StepState imei;
        PublishState publishState = this.f236338a.f231861Y;
        Map<Integer, PublishState.StepState> mapK = publishState.k();
        int i12 = this.f236339b;
        Parcelable parcelable = (PublishState.StepState) mapK.get(Integer.valueOf(i12));
        if (!(parcelable instanceof PublishState.StepState.Imei)) {
            n0 n0Var = m0.f406844a;
            kotlin.reflect.d dVarB = n0Var.b(PublishState.StepState.Imei.class);
            if (dVarB.equals(n0Var.b(PublishState.StepState.Wizard.class))) {
                imei = new PublishState.StepState.Wizard(null, null, null, 7, null);
            } else if (dVarB.equals(n0Var.b(PublishState.StepState.CategoriesSuggestions.class))) {
                imei = new PublishState.StepState.CategoriesSuggestions(null, null, null, null, 15, null);
            } else if (dVarB.equals(n0Var.b(PublishState.StepState.Vin.class))) {
                imei = new PublishState.StepState.Vin(null, 1, null);
            } else {
                if (!dVarB.equals(n0Var.b(PublishState.StepState.Imei.class))) {
                    throw new NotFoundException(n0Var.b(PublishState.StepState.Imei.class).toString(), (Throwable) null, 2, (C42822w) null);
                }
                imei = new PublishState.StepState.Imei(null, 1, null);
            }
            publishState.k().put(Integer.valueOf(i12), imei);
            parcelable = (PublishState.StepState.Imei) imei;
        }
        return ((PublishState.StepState.Imei) parcelable).getRecognizedImei();
    }

    @Override // com.avito.android.publish.input_imei.di.m
    @Y61.l
    public final Boolean h() {
        return this.f236338a.qe();
    }
}
