package com.avito.android.search.filter.adapter.chips;

import com.avito.android.lib.design.chips.Chips;
import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsSingleSelectItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_search_filter_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v {

    /* compiled from: ChipsSingleSelectItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f262186a;

        static {
            int[] iArr = new int[ParameterElement.DisplayType.Chips.Style.values().length];
            try {
                ParameterElement.DisplayType.Chips.Style style = ParameterElement.DisplayType.Chips.Style.f262700b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ParameterElement.DisplayType.Chips.Style style2 = ParameterElement.DisplayType.Chips.Style.f262700b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ParameterElement.DisplayType.Chips.Style style3 = ParameterElement.DisplayType.Chips.Style.f262700b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ParameterElement.DisplayType.Chips.Style style4 = ParameterElement.DisplayType.Chips.Style.f262700b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f262186a = iArr;
        }
    }

    @Y61.k
    public static final Chips.DisplayType a(@Y61.l ParameterElement.DisplayType.Chips.Style style) {
        int i12 = style == null ? -1 : a.f262186a[style.ordinal()];
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? Chips.DisplayType.f178701b : Chips.DisplayType.f178704e : Chips.DisplayType.f178703d : Chips.DisplayType.f178702c : Chips.DisplayType.f178701b;
    }
}
