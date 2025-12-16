package com.avito.android.publish.screen.wrongcategory.ui;

import Y41.p;
import com.avito.android.lib.deprecated_design.radio_button.b;
import com.avito.android.publish.screen.wrongcategory.ui.SelectListWidget;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectListWidget.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/lib/deprecated_design/radio_button/b;", "<anonymous parameter 0>", "", "selected", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/deprecated_design/radio_button/b;Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class a extends N implements p<b, Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectListWidget f242619l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f242620m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p<SelectListWidget.Data, Boolean, G0> f242621n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SelectListWidget.Data f242622o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(SelectListWidget selectListWidget, b bVar, p<? super SelectListWidget.Data, ? super Boolean, G0> pVar, SelectListWidget.Data data) {
        super(2);
        this.f242619l = selectListWidget;
        this.f242620m = bVar;
        this.f242621n = pVar;
        this.f242622o = data;
    }

    @Override // Y41.p
    public final G0 invoke(b bVar, Boolean bool) {
        Boolean bool2 = bool;
        boolean zBooleanValue = bool2.booleanValue();
        SelectListWidget selectListWidget = this.f242619l;
        b bVar2 = selectListWidget.f242615c;
        if (bVar2 != null) {
            bVar2.setChecked(false);
        }
        if (zBooleanValue) {
            selectListWidget.f242615c = this.f242620m;
        }
        this.f242621n.invoke(this.f242622o, bool2);
        return G0.f406611a;
    }
}
