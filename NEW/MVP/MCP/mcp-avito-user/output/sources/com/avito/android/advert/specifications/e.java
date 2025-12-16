package com.avito.android.advert.specifications;

import U9.a;
import U9.g;
import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.specifications.SpecificationsFragment;
import com.avito.android.advert_core.specifications.SchemeView;
import com.avito.android.advert_core.specifications.SpecificationView;
import com.avito.android.advert_core.specifications.a;
import com.avito.android.remote.model.ModelSpecifications;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;

/* compiled from: SpecificationsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/specifications/e;", "Lcom/avito/android/advert/specifications/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final ModelSpecifications f80995a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final U9.b f80996b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public g f80997c;

    @Inject
    public e(@l ModelSpecifications modelSpecifications, @k U9.b bVar) {
        this.f80995a = modelSpecifications;
        this.f80996b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.ArrayList] */
    @Override // com.avito.android.advert.specifications.d
    public final void a(@k g gVar, @k Y41.a aVar) {
        View viewInflate;
        View viewInflate2;
        int size;
        int childCount;
        g gVar2;
        this.f80997c = gVar;
        ModelSpecifications modelSpecifications = this.f80995a;
        if (modelSpecifications == null) {
            ((SpecificationsFragment.b) aVar).invoke();
            return;
        }
        Q qA2 = this.f80996b.a(modelSpecifications);
        String title = modelSpecifications.getTitle();
        if (title != null && (gVar2 = this.f80997c) != null) {
            gVar2.f16230b.setTitle(title);
        }
        g gVar3 = this.f80997c;
        if (gVar3 != null) {
            int iIntValue = ((Number) qA2.f406619b).intValue();
            List<? extends com.avito.android.advert_core.specifications.a> list = (List) qA2.f406620c;
            SpecificationView specificationView = gVar3.f16232d;
            if (iIntValue < 1) {
                specificationView.getClass();
                throw new IllegalArgumentException(G.e(iIntValue, "Column (", ") not less zero"));
            }
            specificationView.f84382i = iIntValue;
            Integer[] numArr = new Integer[iIntValue];
            boolean z12 = false;
            for (int i12 = 0; i12 < iIntValue; i12++) {
                numArr[i12] = 0;
            }
            specificationView.f84384k = numArr;
            Integer[] numArr2 = new Integer[iIntValue];
            for (int i13 = 0; i13 < iIntValue; i13++) {
                numArr2[i13] = 0;
            }
            specificationView.f84385l = numArr2;
            Integer[] numArr3 = new Integer[iIntValue];
            for (int i14 = 0; i14 < iIntValue; i14++) {
                numArr3[i14] = 0;
            }
            specificationView.f84386m = numArr3;
            specificationView.removeAllViews();
            for (com.avito.android.advert_core.specifications.a aVar2 : list) {
                boolean z13 = aVar2 instanceof a.C2501a;
                LayoutInflater layoutInflater = specificationView.f84378e;
                if (z13) {
                    ModelSpecifications.Block block = ((a.C2501a) aVar2).f84390b;
                    viewInflate2 = layoutInflater.inflate(R.layout.block_item, specificationView, z12);
                    U9.a aVar3 = new U9.a(viewInflate2);
                    aVar3.f16219b.setText(block.getTitle());
                    List<ModelSpecifications.Parameter> params = block.getParams();
                    LinearLayout linearLayout = aVar3.f16220c;
                    int childCount2 = linearLayout.getChildCount();
                    int size2 = params.size();
                    ?? r12 = aVar3.f16222e;
                    if (childCount2 > size2 && (childCount = linearLayout.getChildCount()) <= (size = params.size() - 1)) {
                        while (true) {
                            linearLayout.removeViewAt(size);
                            r12.remove(size);
                            if (size == childCount) {
                                break;
                            } else {
                                size--;
                            }
                        }
                    }
                    if (linearLayout.getChildCount() < params.size()) {
                        int size3 = params.size();
                        for (int childCount3 = linearLayout.getChildCount(); childCount3 < size3; childCount3++) {
                            View viewInflate3 = aVar3.f16221d.inflate(R.layout.block_parameter_item, linearLayout, z12);
                            linearLayout.addView(viewInflate3);
                            r12.add(new a.C1103a(viewInflate3));
                        }
                    }
                    ?? r102 = z12;
                    for (Object obj : params) {
                        int i15 = r102 + 1;
                        if (r102 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        ModelSpecifications.Parameter parameter = (ModelSpecifications.Parameter) obj;
                        a.C1103a c1103a = (a.C1103a) r12.get(r102);
                        c1103a.f16224b.setText(parameter.getName());
                        c1103a.f16225c.setText(parameter.getValue());
                        ((LinearLayout.LayoutParams) c1103a.f16223a.getLayoutParams()).bottomMargin = r102 == params.size() - 1 ? 0 : aVar3.f16218a;
                        r102 = i15;
                    }
                } else {
                    if (aVar2 instanceof a.c) {
                        String str = ((a.c) aVar2).f84392b;
                        viewInflate = layoutInflater.inflate(R.layout.spec_title_item, (ViewGroup) specificationView, false);
                        ((TextView) viewInflate).setText(str);
                    } else {
                        if (!(aVar2 instanceof a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ModelSpecifications.Scheme scheme = ((a.b) aVar2).f84391b;
                        viewInflate = layoutInflater.inflate(R.layout.spec_scheme_item, (ViewGroup) specificationView, false);
                        ((SchemeView) viewInflate).setScheme(scheme);
                    }
                    viewInflate2 = viewInflate;
                }
                specificationView.addView(viewInflate2);
                z12 = false;
            }
            specificationView.f84383j = list;
            int size4 = list.size();
            Integer[] numArr4 = new Integer[size4];
            for (int i16 = 0; i16 < size4; i16++) {
                numArr4[i16] = 0;
            }
            specificationView.f84387n = numArr4;
            int size5 = list.size();
            Integer[] numArr5 = new Integer[size5];
            for (int i17 = 0; i17 < size5; i17++) {
                numArr5[i17] = 0;
            }
            specificationView.f84388o = numArr5;
            specificationView.f84381h = true;
        }
    }

    @Override // com.avito.android.advert.specifications.d
    public final void e0() {
        this.f80997c = null;
    }
}
