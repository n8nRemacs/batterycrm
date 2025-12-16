package com.avito.android.crm_paid_cvs.view.list_items.select_filter;

import com.avito.android.crm_paid_cvs.dto.FilterItem;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectFilterPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/view/list_items/select_filter/h;", "Lcom/avito/android/crm_paid_cvs/view/list_items/select_filter/e;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<FilterItem, G0> f131018b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f131019c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@Y61.k Y41.l<? super FilterItem, G0> lVar, @Y61.k @Named("DROP_CLICK") Y41.l<? super String, G0> lVar2) {
        this.f131018b = lVar;
        this.f131019c = lVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    @Override // TV0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O5(TV0.e r6, TV0.a r7, int r8) {
        /*
            r5 = this;
            com.avito.android.crm_paid_cvs.view.list_items.select_filter.j r6 = (com.avito.android.crm_paid_cvs.view.list_items.select_filter.j) r6
            com.avito.android.crm_paid_cvs.dto.FilterItem r7 = (com.avito.android.crm_paid_cvs.dto.FilterItem) r7
            java.lang.String r8 = r7.f130359d
            r6.setTitle(r8)
            com.avito.android.crm_paid_cvs.dto.FilterItem$FilterType r8 = com.avito.android.crm_paid_cvs.dto.FilterItem.FilterType.f130364e
            com.avito.android.crm_paid_cvs.dto.FilterItem$FilterType r0 = r7.f130358c
            java.util.List<com.avito.android.crm_paid_cvs.dto.OptionItem> r1 = r7.f130360e
            if (r0 != r8) goto L3a
            r8 = r1
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L1d:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r8.next()
            r3 = r2
            com.avito.android.crm_paid_cvs.dto.OptionItem r3 = (com.avito.android.crm_paid_cvs.dto.OptionItem) r3
            boolean r3 = r3.f130371c
            if (r3 == 0) goto L1d
            r0.add(r2)
            goto L1d
        L32:
            int r8 = r0.size()
            r0 = 1
            if (r8 <= r0) goto L3a
            goto L3b
        L3a:
            r0 = 0
        L3b:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r8 = r1.iterator()
        L41:
            boolean r2 = r8.hasNext()
            r3 = 0
            if (r2 == 0) goto L54
            java.lang.Object r2 = r8.next()
            r4 = r2
            com.avito.android.crm_paid_cvs.dto.OptionItem r4 = (com.avito.android.crm_paid_cvs.dto.OptionItem) r4
            boolean r4 = r4.f130371c
            if (r4 == 0) goto L41
            goto L55
        L54:
            r2 = r3
        L55:
            com.avito.android.crm_paid_cvs.dto.OptionItem r2 = (com.avito.android.crm_paid_cvs.dto.OptionItem) r2
            if (r2 == 0) goto L5c
            java.lang.String r8 = r2.f130370b
            goto L5d
        L5c:
            r8 = r3
        L5d:
            r6.N9(r8, r0)
            com.avito.android.crm_paid_cvs.view.list_items.select_filter.f r8 = new com.avito.android.crm_paid_cvs.view.list_items.select_filter.f
            r8.<init>(r5, r7)
            r6.A0(r8)
            com.avito.android.crm_paid_cvs.view.list_items.select_filter.g r8 = new com.avito.android.crm_paid_cvs.view.list_items.select_filter.g
            r8.<init>(r5, r7)
            boolean r7 = r1 instanceof java.util.Collection
            if (r7 == 0) goto L7b
            r7 = r1
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L7b
            goto L90
        L7b:
            java.util.Iterator r7 = r1.iterator()
        L7f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r7.next()
            com.avito.android.crm_paid_cvs.dto.OptionItem r0 = (com.avito.android.crm_paid_cvs.dto.OptionItem) r0
            boolean r0 = r0.f130371c
            if (r0 == 0) goto L7f
            r3 = r8
        L90:
            r6.uc(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_paid_cvs.view.list_items.select_filter.h.O5(TV0.e, TV0.a, int):void");
    }
}
