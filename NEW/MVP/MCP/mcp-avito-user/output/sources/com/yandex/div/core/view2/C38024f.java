package com.yandex.div.core.view2;

import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: CompositeLogId.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/f;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38024f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f369106a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f369107b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f369108c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f369109d = C42727D.c(new a());

    /* compiled from: CompositeLogId.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.yandex.div.core.view2.f$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<String> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            C38024f c38024f = C38024f.this;
            sb2.append(c38024f.f369106a);
            sb2.append('#');
            sb2.append(c38024f.f369107b);
            sb2.append('#');
            sb2.append(c38024f.f369108c);
            return sb2.toString();
        }
    }

    public C38024f(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        this.f369106a = str;
        this.f369107b = str2;
        this.f369108c = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C38024f.class.equals(obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.core.view2.CompositeLogId");
        }
        C38024f c38024f = (C38024f) obj;
        return kotlin.jvm.internal.L.f(this.f369106a, c38024f.f369106a) && kotlin.jvm.internal.L.f(this.f369108c, c38024f.f369108c) && kotlin.jvm.internal.L.f(this.f369107b, c38024f.f369107b);
    }

    public final int hashCode() {
        return this.f369107b.hashCode() + androidx.compose.foundation.H.d(this.f369106a.hashCode() * 31, 31, this.f369108c);
    }

    @Y61.k
    public final String toString() {
        return (String) this.f369109d.getValue();
    }
}
