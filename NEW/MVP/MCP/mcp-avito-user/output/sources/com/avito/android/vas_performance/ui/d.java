package com.avito.android.vas_performance.ui;

import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PerformanceVasFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PerformanceVasFragment f321530l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PerformanceVasFragment performanceVasFragment) {
        super(1);
        this.f321530l = performanceVasFragment;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        Button button = this.f321530l.f321394v0;
        if (button == null) {
            button = null;
        }
        com.avito.android.lib.design.button.b.a(button, str2, false);
        return G0.f406611a;
    }
}
