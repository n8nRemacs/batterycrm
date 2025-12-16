package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.serp.adapter.vertical_main.VerticalFilterData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFiltersErrorsDelegate.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/c;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/b;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.vertical_main.vertical_filter.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34867c implements InterfaceC34866b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public Object f273527a = C42784z0.f406748b;

    @Inject
    public C34867c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.InterfaceC34866b
    public final void a(@Y61.l VerticalFilterData verticalFilterData) {
        ?? arrayList;
        List<Filter> list;
        Filter.Config config;
        Filter.Displaying displaying;
        if (verticalFilterData == null || (list = verticalFilterData.f272512c) == null) {
            arrayList = C42784z0.f406748b;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean zF2 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Filter.Widget widget = ((Filter) next).getWidget();
                if (widget != null && (config = widget.getConfig()) != null && (displaying = config.getDisplaying()) != null) {
                    zF2 = kotlin.jvm.internal.L.f(displaying.isRequired(), Boolean.TRUE);
                }
                if (zF2) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                InlineFilterValue value = ((Filter) next2).getValue();
                if ((value == null || value.isEmpty()) ? false : true) {
                    arrayList3.add(next2);
                }
            }
            arrayList = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                String title = ((Filter) it3.next()).getTitle();
                if (title != null) {
                    arrayList.add(title);
                }
            }
        }
        Iterable iterable = (Iterable) this.f273527a;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : iterable) {
            if (!arrayList.contains(((C34865a) obj).f273428a)) {
                arrayList4.add(obj);
            }
        }
        this.f273527a = arrayList4;
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.InterfaceC34866b
    public final boolean b() {
        return !((Collection) this.f273527a).isEmpty();
    }

    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.InterfaceC34866b
    @Y61.l
    public final C34865a c(@Y61.l Filter filter) {
        String title = filter.getTitle();
        Object obj = null;
        if (title == null) {
            return null;
        }
        Iterator it = ((Iterable) this.f273527a).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C34865a) next).f273428a.equals(title)) {
                obj = next;
                break;
            }
        }
        return (C34865a) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    @Override // com.avito.android.serp.adapter.vertical_main.vertical_filter.InterfaceC34866b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(@Y61.l com.avito.android.serp.adapter.vertical_main.VerticalFilterData r6) {
        /*
            r5 = this;
            if (r6 == 0) goto Lc0
            java.util.List<com.avito.android.remote.model.search.Filter> r6 = r6.f272512c
            if (r6 == 0) goto Lc0
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L11:
            boolean r1 = r6.hasNext()
            r2 = 0
            if (r1 == 0) goto L41
            java.lang.Object r1 = r6.next()
            r3 = r1
            com.avito.android.remote.model.search.Filter r3 = (com.avito.android.remote.model.search.Filter) r3
            com.avito.android.remote.model.search.Filter$Widget r3 = r3.getWidget()
            if (r3 == 0) goto L3b
            com.avito.android.remote.model.search.Filter$Config r3 = r3.getConfig()
            if (r3 == 0) goto L3b
            com.avito.android.remote.model.search.Filter$Displaying r3 = r3.getDisplaying()
            if (r3 == 0) goto L3b
            java.lang.Boolean r2 = r3.isRequired()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
        L3b:
            if (r2 == 0) goto L11
            r0.add(r1)
            goto L11
        L41:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L4a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r0.next()
            r3 = r1
            com.avito.android.remote.model.search.Filter r3 = (com.avito.android.remote.model.search.Filter) r3
            com.avito.android.remote.model.search.InlineFilterValue r3 = r3.getValue()
            if (r3 == 0) goto L65
            boolean r3 = r3.isEmpty()
            r4 = 1
            if (r3 != r4) goto L65
            goto L66
        L65:
            r4 = r2
        L66:
            if (r4 == 0) goto L4a
            r6.add(r1)
            goto L4a
        L6c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L75:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lc2
            java.lang.Object r1 = r6.next()
            com.avito.android.remote.model.search.Filter r1 = (com.avito.android.remote.model.search.Filter) r1
            com.avito.android.serp.adapter.vertical_main.vertical_filter.a$a r3 = com.avito.android.serp.adapter.vertical_main.vertical_filter.C34865a.f273427c
            r3.getClass()
            java.lang.String r3 = r1.getTitle()
            if (r3 != 0) goto L8e
            r1 = 0
            goto Lba
        L8e:
            com.avito.android.remote.model.search.Filter$Widget r1 = r1.getWidget()
            if (r1 == 0) goto Lab
            com.avito.android.remote.model.search.Filter$Config r1 = r1.getConfig()
            if (r1 == 0) goto Lab
            com.avito.android.remote.model.search.Filter$Displaying r1 = r1.getDisplaying()
            if (r1 == 0) goto Lab
            java.lang.String r1 = r1.getError()
            if (r1 == 0) goto Lab
            com.avito.android.printable_text.PrintableText r1 = com.avito.android.printable_text.b.f(r1)
            goto Lb4
        Lab:
            java.io.Serializable[] r1 = new java.io.Serializable[r2]
            r4 = 2131953933(0x7f13090d, float:1.954435E38)
            com.avito.android.printable_text.PrintableText r1 = com.avito.android.printable_text.b.c(r4, r1)
        Lb4:
            com.avito.android.serp.adapter.vertical_main.vertical_filter.a r4 = new com.avito.android.serp.adapter.vertical_main.vertical_filter.a
            r4.<init>(r3, r1)
            r1 = r4
        Lba:
            if (r1 == 0) goto L75
            r0.add(r1)
            goto L75
        Lc0:
            kotlin.collections.z0 r0 = kotlin.collections.C42784z0.f406748b
        Lc2:
            r5.f273527a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.serp.adapter.vertical_main.vertical_filter.C34867c.d(com.avito.android.serp.adapter.vertical_main.VerticalFilterData):void");
    }
}
