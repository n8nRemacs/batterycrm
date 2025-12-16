package com.avito.android.publish.premoderation;

import com.avito.android.publish.premoderation.SelectListWidget;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectListWidget.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/deprecated_design/radio_button/b;", "<anonymous parameter 0>", "", "selected", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/deprecated_design/radio_button/b;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class n extends N implements Y41.p<com.avito.android.lib.deprecated_design.radio_button.b, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectListWidget f238325l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.deprecated_design.radio_button.b f238326m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<SelectListWidget.a, Boolean, G0> f238327n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SelectListWidget.a f238328o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(SelectListWidget selectListWidget, com.avito.android.lib.deprecated_design.radio_button.b bVar, Y41.p<? super SelectListWidget.a, ? super Boolean, G0> pVar, SelectListWidget.a aVar) {
        super(2);
        this.f238325l = selectListWidget;
        this.f238326m = bVar;
        this.f238327n = pVar;
        this.f238328o = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(com.avito.android.lib.deprecated_design.radio_button.b bVar, Boolean bool) {
        Boolean bool2 = bool;
        boolean zBooleanValue = bool2.booleanValue();
        SelectListWidget selectListWidget = this.f238325l;
        com.avito.android.lib.deprecated_design.radio_button.b bVar2 = selectListWidget.f238266c;
        if (bVar2 != null) {
            bVar2.setChecked(false);
        }
        if (zBooleanValue) {
            selectListWidget.f238266c = this.f238326m;
        }
        this.f238327n.invoke(this.f238328o, bool2);
        return G0.f406611a;
    }
}
