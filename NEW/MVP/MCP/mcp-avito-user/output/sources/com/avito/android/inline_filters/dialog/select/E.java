package com.avito.android.inline_filters.dialog.select;

import android.content.Context;
import android.os.Parcelable;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.remote.model.search.Filter;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SelectFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/E;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/select/SelectFilterView;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class E extends AbstractC30998a<SelectFilterView> {

    /* compiled from: SelectFilterDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Integer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f172013l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(1);
            this.f172013l = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            this.f172013l.invoke();
            return G0.f406611a;
        }
    }

    public /* synthetic */ E(Context context, Filter filter, List list, Parcelable parcelable, Y41.p pVar, Y41.a aVar, Y41.l lVar, com.avito.android.deeplink_handler.handler.composite.a aVar2, int i12, int i13, C42822w c42822w) {
        this(context, filter, list, parcelable, pVar, aVar, (i13 & 64) != 0 ? new a(aVar) : lVar, aVar2, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public E(@Y61.k android.content.Context r17, @Y61.k com.avito.android.remote.model.search.Filter r18, @Y61.k java.util.List<com.avito.android.inline_filters.dialog.select.adapter.i> r19, @Y61.l android.os.Parcelable r20, @Y61.k Y41.p<? super com.avito.android.remote.model.search.Filter, ? super com.avito.android.remote.model.search.InlineFilterValue, kotlin.G0> r21, @Y61.k Y41.a<kotlin.G0> r22, @Y61.k Y41.l<? super java.lang.Integer, kotlin.G0> r23, @Y61.l com.avito.android.deeplink_handler.handler.composite.a r24, int r25) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.inline_filters.dialog.select.E.<init>(android.content.Context, com.avito.android.remote.model.search.Filter, java.util.List, android.os.Parcelable, Y41.p, Y41.a, Y41.l, com.avito.android.deeplink_handler.handler.composite.a, int):void");
    }
}
