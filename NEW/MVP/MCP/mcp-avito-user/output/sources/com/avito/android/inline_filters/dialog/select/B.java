package com.avito.android.inline_filters.dialog.select;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.inline_filters.InterfaceC31046f;
import com.avito.android.inline_filters.dialog.AbstractC30998a;
import com.avito.android.remote.model.SearchParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RadioSelectFilterDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/B;", "Lcom/avito/android/inline_filters/dialog/a;", "Lcom/avito/android/inline_filters/dialog/select/D;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class B extends AbstractC30998a<D> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final InterfaceC31046f f171999d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final SearchParams f172000e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    @SuppressLint({"InflateParams"})
    public final View f172001f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f172002g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f172003h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final View f172004i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public String f172005j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f172006k;

    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public B(@Y61.k android.content.Context r16, @Y61.k com.avito.android.remote.model.search.Filter r17, @Y61.l com.avito.android.inline_filters.InterfaceC31046f r18, @Y61.l com.avito.android.remote.model.SearchParams r19, @Y61.k java.util.List r20, @Y61.l android.os.Parcelable r21, @Y61.k Y41.p r22, @Y61.k Y41.a r23) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.inline_filters.dialog.select.B.<init>(android.content.Context, com.avito.android.remote.model.search.Filter, com.avito.android.inline_filters.f, com.avito.android.remote.model.SearchParams, java.util.List, android.os.Parcelable, Y41.p, Y41.a):void");
    }

    public static final void e(B b12, List list, ArrayList arrayList) {
        b12.getClass();
        List list2 = list;
        Iterator it = list2.iterator();
        Iterator it2 = arrayList.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(C42745f0.q(list2, 10), C42745f0.q(arrayList, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            ((com.avito.android.inline_filters.dialog.select.adapter.i) next).f172094e = ((com.avito.android.inline_filters.dialog.select.adapter.i) it2.next()).f172094e;
            arrayList2.add(G0.f406611a);
        }
    }

    @Override // com.avito.android.inline_filters.dialog.AbstractC30998a
    @Y61.k
    public final Parcelable b() {
        Bundle bundle = new Bundle();
        bundle.putString("inlineRadioSelect", this.f172005j);
        return bundle;
    }

    public final void f(D d12) {
        d12.Ud(!kotlin.jvm.internal.L.f(this.f172005j, this.f172006k));
    }

    public final void g() {
        SearchParams searchParams;
        InterfaceC31046f interfaceC31046f = this.f171999d;
        if (interfaceC31046f != null && (searchParams = this.f172000e) != null) {
            interfaceC31046f.a(searchParams, null).u0(new z(this), A.f171998b);
        } else {
            ((D) this.f171147c).f172008n.setText(this.f172001f.getContext().getString(R.string.apply_inline_filter));
        }
    }
}
