package com.avito.android.tariff_lf_constructor.configure.checkbox_selector;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: Comparisons.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class i<T> implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f299530b;

    public i(String str) {
        this.f299530b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t12, T t13) {
        String f299460b = ((d) t12).getF299460b();
        String str = this.f299530b;
        return kotlin.comparisons.a.b(Integer.valueOf(C43066x.I(f299460b, str, 0, true, 2)), Integer.valueOf(C43066x.I(((d) t13).getF299460b(), str, 0, true, 2)));
    }
}
