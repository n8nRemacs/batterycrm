package com.avito.android.widget_filters.analytics;

import java.util.LinkedHashSet;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WidgetFiltersItemsVisibilityTracker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/widget_filters/analytics/j;", "Lcom/avito/android/widget_filters/analytics/e;", "<init>", "()V", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f329730a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.d f329731b = new kotlinx.coroutines.sync.d();

    @Inject
    public j() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.widget_filters.analytics.e
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.widget_filters.analytics.g
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.widget_filters.analytics.g r0 = (com.avito.android.widget_filters.analytics.g) r0
            int r1 = r0.f329721v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f329721v = r1
            goto L18
        L13:
            com.avito.android.widget_filters.analytics.g r0 = new com.avito.android.widget_filters.analytics.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f329719t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f329721v
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            kotlinx.coroutines.sync.d r5 = r0.f329718s
            java.lang.String r1 = r0.f329717r
            com.avito.android.widget_filters.analytics.j r0 = r0.f329716q
            kotlin.C42729a0.b(r6)
            r6 = r5
            r5 = r1
            goto L4e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.sync.d r6 = r4.f329731b
            r0.f329716q = r4
            r0.f329717r = r5
            r0.f329718s = r6
            r0.f329721v = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            r1 = 0
            java.util.LinkedHashSet r0 = r0.f329730a     // Catch: java.lang.Throwable -> L5a
            r0.add(r5)     // Catch: java.lang.Throwable -> L5a
            r6.d(r1)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L5a:
            r5 = move-exception
            r6.d(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.widget_filters.analytics.j.a(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.widget_filters.analytics.e
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.widget_filters.analytics.f
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.widget_filters.analytics.f r0 = (com.avito.android.widget_filters.analytics.f) r0
            int r1 = r0.f329715v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f329715v = r1
            goto L18
        L13:
            com.avito.android.widget_filters.analytics.f r0 = new com.avito.android.widget_filters.analytics.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f329713t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f329715v
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            kotlinx.coroutines.sync.d r5 = r0.f329712s
            java.lang.String r1 = r0.f329711r
            com.avito.android.widget_filters.analytics.j r0 = r0.f329710q
            kotlin.C42729a0.b(r6)
            r6 = r5
            r5 = r1
            goto L4e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.sync.d r6 = r4.f329731b
            r0.f329710q = r4
            r0.f329711r = r5
            r0.f329712s = r6
            r0.f329715v = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            r1 = 0
            java.util.LinkedHashSet r0 = r0.f329730a     // Catch: java.lang.Throwable -> L5a
            r0.remove(r5)     // Catch: java.lang.Throwable -> L5a
            r6.d(r1)
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L5a:
            r5 = move-exception
            r6.d(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.widget_filters.analytics.j.b(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.widget_filters.analytics.e
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.avito.android.widget_filters.analytics.i
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.widget_filters.analytics.i r0 = (com.avito.android.widget_filters.analytics.i) r0
            int r1 = r0.f329729v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f329729v = r1
            goto L18
        L13:
            com.avito.android.widget_filters.analytics.i r0 = new com.avito.android.widget_filters.analytics.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f329727t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f329729v
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            kotlinx.coroutines.sync.d r5 = r0.f329726s
            java.lang.String r1 = r0.f329725r
            com.avito.android.widget_filters.analytics.j r0 = r0.f329724q
            kotlin.C42729a0.b(r6)
            r6 = r5
            r5 = r1
            goto L4e
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.C42729a0.b(r6)
            kotlinx.coroutines.sync.d r6 = r4.f329731b
            r0.f329724q = r4
            r0.f329725r = r5
            r0.f329726s = r6
            r0.f329729v = r3
            java.lang.Object r0 = r6.b(r0)
            if (r0 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            r1 = 0
            java.util.LinkedHashSet r0 = r0.f329730a     // Catch: java.lang.Throwable -> L5d
            boolean r5 = r0.contains(r5)     // Catch: java.lang.Throwable -> L5d
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)     // Catch: java.lang.Throwable -> L5d
            r6.d(r1)
            return r5
        L5d:
            r5 = move-exception
            r6.d(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.widget_filters.analytics.j.c(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
