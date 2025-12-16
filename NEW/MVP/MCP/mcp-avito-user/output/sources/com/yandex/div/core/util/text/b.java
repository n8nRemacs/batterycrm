package com.yandex.div.core.util.text;

import Y61.k;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import com.yandex.div.core.view2.divs.DivBackgroundSpan;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DivTextRangesBackgroundHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/util/text/b;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f367832a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.yandex.div.json.expressions.e f367833b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList<DivBackgroundSpan> f367834c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC42726C f367835d = C42727D.c(new C10865b());

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC42726C f367836e = C42727D.c(new a());

    /* compiled from: DivTextRangesBackgroundHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/yandex/div/core/util/text/e;", "invoke", "()Lcom/yandex/div/core/util/text/e;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.a<e> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final e invoke() {
            b bVar = b.this;
            return new e(bVar.f367832a, bVar.f367833b);
        }
    }

    /* compiled from: DivTextRangesBackgroundHelper.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/yandex/div/core/util/text/f;", "invoke", "()Lcom/yandex/div/core/util/text/f;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.util.text.b$b, reason: collision with other inner class name */
    public static final class C10865b extends N implements Y41.a<f> {
        public C10865b() {
            super(0);
        }

        @Override // Y41.a
        public final f invoke() {
            b bVar = b.this;
            return new f(bVar.f367832a, bVar.f367833b);
        }
    }

    public b(@k View view, @k com.yandex.div.json.expressions.e eVar) {
        this.f367832a = view;
        this.f367833b = eVar;
    }

    public final void a(@k Canvas canvas, @k Spanned spanned, @k Layout layout) {
        Iterator<DivBackgroundSpan> it = this.f367834c.iterator();
        while (it.hasNext()) {
            DivBackgroundSpan next = it.next();
            int spanStart = spanned.getSpanStart(next);
            int spanEnd = spanned.getSpanEnd(next);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            ((c) (lineForOffset == lineForOffset2 ? this.f367835d.getValue() : this.f367836e.getValue())).a(canvas, layout, lineForOffset, lineForOffset2, (int) layout.getPrimaryHorizontal(spanStart), (int) layout.getPrimaryHorizontal(spanEnd), next.f368039b, next.f368040c);
        }
    }
}
