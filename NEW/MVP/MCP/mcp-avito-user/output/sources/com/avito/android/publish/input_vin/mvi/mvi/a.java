package com.avito.android.publish.input_vin.mvi.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.publish.C0;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.di.W;
import com.avito.android.publish.scanner_v2.PhotoDimension;
import com.avito.android.publish.scanner_v2.ScannerOpenParams;
import com.avito.android.publish.scanner_v2.analytics.ScannerFromPage;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.ManualVin;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.VinConfig;
import com.avito.android.remote.model.category_parameters.VinScanner;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ne0.C44387d;
import ne0.InterfaceC44384a;
import ne0.InterfaceC44385b;

/* compiled from: InputVinMviActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/input_vin/mvi/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lne0/a;", "Lne0/b;", "Lne0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC44384a, InterfaceC44385b, C44387d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.input_vin.mvi.mvi.handlers.a f236645a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C0 f236646b;

    /* renamed from: c, reason: collision with root package name */
    public final int f236647c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33535v f236648d;

    @Inject
    public a(@Y61.k com.avito.android.publish.input_vin.mvi.mvi.handlers.a aVar, @Y61.k C0 c02, @W int i12, @Y61.k InterfaceC33535v interfaceC33535v) {
        this.f236645a = aVar;
        this.f236646b = c02;
        this.f236647c = i12;
        this.f236648d = interfaceC33535v;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC44385b> b(InterfaceC44384a interfaceC44384a, C44387d c44387d) {
        VinScanner vinScanner;
        ManualVin manualVin;
        C43210w c43210w;
        String vinId;
        InterfaceC44384a interfaceC44384a2 = interfaceC44384a;
        C44387d c44387d2 = c44387d;
        if (interfaceC44384a2 instanceof InterfaceC44384a.e) {
            return new C43210w(new InterfaceC44385b.g(((InterfaceC44384a.e) interfaceC44384a2).f415226a));
        }
        if (interfaceC44384a2 instanceof InterfaceC44384a.C11865a) {
            ItemWithAdditionalButton itemWithAdditionalButton = ((InterfaceC44384a.C11865a) interfaceC44384a2).f415222a;
            ItemWithAdditionalButton.AdditionalButton f117488m = itemWithAdditionalButton.getF117488m();
            if (f117488m != null) {
                this.f236648d.j(f117488m.f173892d);
            }
            return new C43210w(new InterfaceC44385b.a(itemWithAdditionalButton));
        }
        if (interfaceC44384a2.equals(InterfaceC44384a.b.f415223a)) {
            c43210w = new C43210w(InterfaceC44385b.C11866b.f415231a);
        } else if (interfaceC44384a2.equals(InterfaceC44384a.c.f415224a)) {
            c43210w = new C43210w(InterfaceC44385b.c.f415232a);
        } else {
            if (interfaceC44384a2 instanceof InterfaceC44384a.d) {
                return new C43210w(new InterfaceC44385b.l(((InterfaceC44384a.d) interfaceC44384a2).f415225a));
            }
            if (interfaceC44384a2.equals(InterfaceC44384a.f.f415227a)) {
                return this.f236645a.a(c44387d2);
            }
            boolean z12 = interfaceC44384a2 instanceof InterfaceC44384a.g;
            value = null;
            value = null;
            String value = null;
            C0 c02 = this.f236646b;
            int i12 = this.f236647c;
            if (z12) {
                CategoryPublishStep categoryPublishStepRe = c02.re(Integer.valueOf(i12));
                CategoryPublishStep.Vin vin = categoryPublishStepRe instanceof CategoryPublishStep.Vin ? (CategoryPublishStep.Vin) categoryPublishStepRe : null;
                VinConfig config = vin != null ? vin.getConfig() : null;
                VinScanner vinScanner2 = config != null ? config.getVinScanner() : null;
                if (vinScanner2 == null) {
                    return C43175k.w();
                }
                PhotoDimension.f239274d.getClass();
                return new C43210w(new InterfaceC44385b.n(i12, new ScannerOpenParams(vinScanner2, ScannerFromPage.f239333f, PhotoDimension.f239275e)));
            }
            if (!interfaceC44384a2.equals(InterfaceC44384a.h.f415228a)) {
                if (!(interfaceC44384a2 instanceof InterfaceC44384a.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                CategoryPublishStep categoryPublishStepRe2 = c02.re(Integer.valueOf(i12));
                CategoryPublishStep.Vin vin2 = categoryPublishStepRe2 instanceof CategoryPublishStep.Vin ? (CategoryPublishStep.Vin) categoryPublishStepRe2 : null;
                VinConfig config2 = vin2 != null ? vin2.getConfig() : null;
                return (config2 == null || (vinScanner = config2.getVinScanner()) == null || (manualVin = vinScanner.getManualVin()) == null) ? C43175k.w() : new C43210w(new InterfaceC44385b.k(manualVin));
            }
            CategoryPublishStep categoryPublishStepRe3 = c02.re(Integer.valueOf(i12));
            CategoryPublishStep.Vin vin3 = categoryPublishStepRe3 instanceof CategoryPublishStep.Vin ? (CategoryPublishStep.Vin) categoryPublishStepRe3 : null;
            VinConfig config3 = vin3 != null ? vin3.getConfig() : null;
            ParametersTree parametersTreePe = c02.pe(i12);
            if (config3 != null && (vinId = config3.getVinId()) != null) {
                ParameterSlot parameterSlotFindParameter = parametersTreePe.findParameter(vinId);
                CharParameter charParameter = parameterSlotFindParameter instanceof CharParameter ? (CharParameter) parameterSlotFindParameter : null;
                if (charParameter != null) {
                    value = charParameter.getValue();
                }
            }
            if (value == null) {
                value = "";
            }
            c43210w = new C43210w(new InterfaceC44385b.l(value));
        }
        return c43210w;
    }
}
