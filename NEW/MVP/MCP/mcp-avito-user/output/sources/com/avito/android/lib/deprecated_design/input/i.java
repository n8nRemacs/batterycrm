package com.avito.android.lib.deprecated_design.input;

import Y61.k;
import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: Delegates.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/properties/a", "Lkotlin/properties/e;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends kotlin.properties.e<CharSequence> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f178035b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super("");
        this.f178035b = jVar;
    }

    @Override // kotlin.properties.e
    public final void afterChange(@k n<?> nVar, CharSequence charSequence, CharSequence charSequence2) {
        j jVar = this.f178035b;
        float f12 = jVar.f178044h;
        Paint paint = jVar.f178043g;
        float textSize = paint.getTextSize();
        paint.setTextSize(f12);
        float f13 = paint.getFontMetrics().descent;
        paint.setTextSize(textSize);
        float textSize2 = paint.getTextSize();
        paint.setTextSize(jVar.f178045i);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f14 = fontMetrics.descent - fontMetrics.ascent;
        paint.setTextSize(textSize2);
        jVar.f178054r = f14;
        int i12 = jVar.f178041e;
        jVar.f178055s = i12 != 0 ? (jVar.f178044h / 4.0f) + (i12 / 2.0f) : 0.0f;
        jVar.f178056t = i12 != 0 ? jVar.f178046j + f14 : 0.0f;
    }
}
