package com.avito.android.blueprints.chips_multiselect;

import JO.m;
import com.avito.android.category_parameters.ParameterElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsMultiselectItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_publish-common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h {

    /* compiled from: ChipsMultiselectItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105881a;

        static {
            int[] iArr = new int[ParameterElement.DisplayType.Chips.Style.values().length];
            try {
                ParameterElement.DisplayType.Chips.Style style = ParameterElement.DisplayType.Chips.Style.f117248b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ParameterElement.DisplayType.Chips.Style style2 = ParameterElement.DisplayType.Chips.Style.f117248b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ParameterElement.DisplayType.Chips.Style style3 = ParameterElement.DisplayType.Chips.Style.f117248b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ParameterElement.DisplayType.Chips.Style style4 = ParameterElement.DisplayType.Chips.Style.f117248b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f105881a = iArr;
        }
    }

    public static final ArrayList a(ParameterElement.v vVar) {
        List<m> list = vVar.f117545f;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (m mVar : list) {
            arrayList.add(new com.avito.android.blueprints.chips.a(mVar.f8961b, mVar.f8962c));
        }
        return arrayList;
    }
}
