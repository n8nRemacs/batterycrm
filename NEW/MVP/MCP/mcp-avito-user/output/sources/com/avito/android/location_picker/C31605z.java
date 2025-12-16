package com.avito.android.location_picker;

import com.avito.android.location.analytics.FindLocationPage;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "apply", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.z, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31605z<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f182838b;

    public C31605z(x0 x0Var) {
        this.f182838b = x0Var;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String str;
        x0 x0Var = this.f182838b;
        if (x0Var.f182807a.f182375t.f182395p != null) {
            FindLocationPage findLocationPage = FindLocationPage.f181725c;
            str = "radius";
        } else {
            FindLocationPage findLocationPage2 = FindLocationPage.f181725c;
            str = "add_map";
        }
        x0Var.f182815i.e(str);
        return kotlin.G0.f406611a;
    }
}
