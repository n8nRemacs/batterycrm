package com.avito.android.rating.utils.span_decorator;

import Y61.k;
import android.content.Context;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import zw0.InterfaceC50637a;

/* compiled from: InlineFilterSpanDecoratorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/utils/span_decorator/c;", "Lzw0/a;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements InterfaceC50637a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f247873a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f247874b = new e();

    /* renamed from: c, reason: collision with root package name */
    public final int f247875c = y6.b(10);

    public c(@k Context context) {
        this.f247873a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    @Override // zw0.InterfaceC50637a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence a(@Y61.k java.lang.String r12, boolean r13) {
        /*
            r11 = this;
            com.avito.android.rating.utils.span_decorator.e r0 = r11.f247874b
            java.util.regex.Pattern r0 = r0.f247880a
            java.util.regex.Matcher r0 = r0.matcher(r12)
            boolean r1 = r0.find()
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L92
            int r1 = r0.start()
            java.lang.String r5 = r0.group(r2)
            if (r5 != 0) goto L1d
            java.lang.String r5 = ""
        L1d:
            java.lang.String r6 = " "
            java.lang.String r0 = r0.replaceAll(r6)
            java.lang.String r6 = ";"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            r7 = 6
            java.util.List r5 = kotlin.text.C43066x.f0(r5, r6, r3, r7)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r8 = kotlin.collections.C42745f0.q(r5, r7)
            r6.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L3f:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L5a
            java.lang.Object r8 = r5.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "="
            java.lang.String[] r9 = new java.lang.String[]{r9}
            r10 = 2
            java.util.List r8 = kotlin.text.C43066x.f0(r8, r9, r10, r10)
            r6.add(r8)
            goto L3f
        L5a:
            int r5 = kotlin.collections.C42745f0.q(r6, r7)
            int r5 = kotlin.collections.P0.f(r5)
            r7 = 16
            if (r5 >= r7) goto L67
            r5 = r7
        L67:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L70:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L88
            java.lang.Object r6 = r5.next()
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r8 = r6.get(r3)
            java.lang.Object r6 = kotlin.collections.C42745f0.K(r2, r6)
            r7.put(r8, r6)
            goto L70
        L88:
            java.lang.String r5 = "iconName"
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L94
        L92:
            r7 = r4
            goto La1
        L94:
            java.lang.String r6 = "iconColor"
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            com.avito.android.rating.utils.span_decorator.d r7 = new com.avito.android.rating.utils.span_decorator.d
            r7.<init>(r0, r1, r5, r6)
        La1:
            if (r7 != 0) goto La4
            return r12
        La4:
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            java.lang.String r0 = r7.f247876a
            r12.<init>(r0)
            java.lang.String r0 = r7.f247878c
            java.lang.String r1 = "InlineFilterStarIcon"
            boolean r1 = r0.equals(r1)
            android.content.Context r5 = r11.f247873a
            if (r1 == 0) goto Lbf
            r0 = 2130972216(0x7f040e38, float:1.7553192E38)
            android.graphics.drawable.Drawable r0 = com.avito.android.util.C35835l0.h(r0, r5)
            goto Lcf
        Lbf:
            java.lang.Integer r0 = com.avito.android.lib.util.q.a(r0)
            if (r0 == 0) goto Lce
            int r0 = r0.intValue()
            android.graphics.drawable.Drawable r0 = com.avito.android.util.C35835l0.h(r0, r5)
            goto Lcf
        Lce:
            r0 = r4
        Lcf:
            if (r0 != 0) goto Ld2
            goto Lec
        Ld2:
            if (r13 == 0) goto Ld8
            r13 = 2130975933(0x7f041cbd, float:1.7560731E38)
            goto Ldb
        Ld8:
            r13 = 2130969131(0x7f04022b, float:1.7546935E38)
        Ldb:
            int r13 = com.avito.android.util.C35835l0.d(r13, r5)
            r0.setTint(r13)
            int r13 = r11.f247875c
            r0.setBounds(r3, r3, r13, r13)
            android.text.style.ImageSpan r4 = new android.text.style.ImageSpan
            r4.<init>(r0, r2)
        Lec:
            if (r4 == 0) goto Lf7
            int r13 = r7.f247877b
            int r0 = r13 + 1
            r1 = 33
            r12.setSpan(r4, r13, r0, r1)
        Lf7:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.utils.span_decorator.c.a(java.lang.String, boolean):java.lang.CharSequence");
    }
}
