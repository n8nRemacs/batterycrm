package com.avito.android.inline_filters.dialog.group;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.WidgetType;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: GroupFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/group/b;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/group/r;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b extends AbstractC30998a<r> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    @SuppressLint({"InflateParams"})
    public final View f171556d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f171557e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final y f171558f;

    /* compiled from: GroupFilterDialog.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171559a;

        static {
            int[] iArr = new int[WidgetType.values().length];
            try {
                iArr[WidgetType.Multiselect.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WidgetType.NumericRange.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f171559a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(@Y61.k android.content.Context r18, @Y61.k com.avito.android.remote.model.search.Filter r19, @Y61.l android.os.Parcelable r20, @Y61.k com.avito.android.inline_filters.dialog.s r21, @Y61.l com.avito.android.inline_filters.InlineFiltersCommonViewInfo r22, @Y61.l Y41.l r23, @Y61.k Y41.a r24, @Y61.l com.avito.android.deeplink_handler.handler.composite.a r25) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.inline_filters.dialog.group.b.<init>(android.content.Context, com.avito.android.remote.model.search.Filter, android.os.Parcelable, com.avito.android.inline_filters.dialog.s, com.avito.android.inline_filters.InlineFiltersCommonViewInfo, Y41.l, Y41.a, com.avito.android.deeplink_handler.handler.composite.a):void");
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    public final void a() {
        y yVar = this.f171558f;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    @Y61.k
    public final Parcelable b() {
        Bundle bundle = new Bundle();
        LinkedHashMap linkedHashMap = this.f171557e;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Q(((Filter) entry.getKey()).getId(), entry.getValue()));
        }
        bundle.putParcelable("inlineGroupFilter", new GroupFilterState(arrayList));
        return bundle;
    }
}
