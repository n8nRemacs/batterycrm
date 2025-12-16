package com.yandex.div.core.view2;

import android.graphics.Typeface;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div2.DivFontFamily;
import com.yandex.div2.DivFontWeight;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: DivTypefaceResolver.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0011\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/J;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class J {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.font.a f367859a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.yandex.div.core.font.a f367860b;

    /* compiled from: DivTypefaceResolver.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f367861a;

        static {
            int[] iArr = new int[DivFontFamily.values().length];
            DivFontFamily.b bVar = DivFontFamily.f371440c;
            iArr[1] = 1;
            f367861a = iArr;
        }
    }

    @Inject
    public J(@Y61.k com.yandex.div.core.font.a aVar, @Y61.k @Named("typeface_display") com.yandex.div.core.font.a aVar2) {
        this.f367859a = aVar;
        this.f367860b = aVar2;
    }

    @Y61.k
    public final Typeface a(@Y61.k DivFontFamily divFontFamily, @Y61.k DivFontWeight divFontWeight) {
        return C37931a.x(divFontWeight, a.f367861a[divFontFamily.ordinal()] == 1 ? this.f367860b : this.f367859a);
    }
}
