package com.avito.android.publish.input_imei;

import androidx.compose.runtime.internal.P;
import com.avito.android.publish.C0;
import com.avito.android.publish.di.W;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.util.O2;
import com.avito.android.validation.InterfaceC36030r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;

/* compiled from: InputImeiLoader.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/input_imei/h;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category_parameters.a f236344a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.items.e f236345b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36030r0 f236346c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C0 f236347d;

    /* renamed from: e, reason: collision with root package name */
    public final int f236348e;

    /* compiled from: InputImeiLoader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f236349a;

        static {
            int[] iArr = new int[CategoryPublishStep.Params.ScanButtonData.Position.values().length];
            try {
                iArr[CategoryPublishStep.Params.ScanButtonData.Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CategoryPublishStep.Params.ScanButtonData.Position.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f236349a = iArr;
        }
    }

    @Inject
    public h(@Y61.k com.avito.android.category_parameters.a aVar, @Y61.k com.avito.android.publish.items.e eVar, @Y61.k InterfaceC36030r0 interfaceC36030r0, @Y61.k C0 c02, @W int i12) {
        this.f236344a = aVar;
        this.f236345b = eVar;
        this.f236346c = interfaceC36030r0;
        this.f236347d = c02;
        this.f236348e = i12;
    }

    @Y61.k
    public final List<com.avito.conveyor_item.a> a(@Y61.k ParametersTree parametersTree, int i12, @Y61.l com.avito.conveyor_item.a aVar) {
        CategoryPublishStep.Params.Config config;
        CategoryPublishStep.Params.ScanButtonData scanButtonData;
        ArrayList arrayListH0;
        List<com.avito.conveyor_item.a> listC = com.avito.android.category_parameters.a.c(this.f236344a, parametersTree, null, null, null, 30);
        CategoryPublishStep categoryPublishStepRe = this.f236347d.re(Integer.valueOf(i12));
        CategoryPublishStep.Params params = categoryPublishStepRe instanceof CategoryPublishStep.Params ? (CategoryPublishStep.Params) categoryPublishStepRe : null;
        if (params == null || (config = params.getConfig()) == null || (scanButtonData = config.getScanButtonData()) == null) {
            return listC;
        }
        com.avito.android.publish.input_imei.items.scan_button.c cVar = new com.avito.android.publish.input_imei.items.scan_button.c(scanButtonData.getTitle());
        com.avito.android.publish.view.divider.c cVar2 = new com.avito.android.publish.view.divider.c();
        int i13 = a.f236349a[scanButtonData.getPosition().ordinal()];
        if (i13 == 1) {
            arrayListH0 = C42745f0.h0(listC, C42745f0.U(cVar, cVar2));
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            arrayListH0 = C42745f0.h0(C42745f0.U(cVar2, cVar), listC);
        }
        return aVar != null ? O2.b(Collections.singletonList(aVar), arrayListH0) : arrayListH0;
    }

    public final void b(@Y61.k ParametersTree parametersTree) {
        List<com.avito.conveyor_item.a> listA = a(parametersTree, this.f236348e, this.f236345b.a());
        CategoryParameters categoryParameters = this.f236347d.f231873k0;
        InterfaceC36030r0 interfaceC36030r0 = this.f236346c;
        interfaceC36030r0.f(parametersTree, categoryParameters);
        interfaceC36030r0.c().accept(listA);
    }
}
