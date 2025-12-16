package com.avito.android.select.bottom_sheet.blueprints;

import androidx.compose.runtime.internal.P;
import cE.C27025b;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.select.Arguments;
import dq0.InterfaceC39781c;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CheckableItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/o;", "Lcom/avito/android/select/bottom_sheet/blueprints/m;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o implements m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.l<InterfaceC39781c, G0> f265174b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.select.variant.a> f265175c = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: d, reason: collision with root package name */
    public final int f265176d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public o(@Y61.k Arguments arguments, @Y61.k C27025b c27025b, @Y61.l Y41.l<? super InterfaceC39781c, G0> lVar) {
        this.f265174b = lVar;
        kotlin.reflect.n<Object> nVar = C27025b.f57796d[0];
        this.f265176d = (((Boolean) c27025b.f57797b.a().invoke()).booleanValue() && arguments.getMultiSelect()) ? R.layout.checkbox_list_item : R.layout.checkable_list_item;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        G0 g03;
        q qVar = (q) eVar;
        com.avito.android.select.variant.a aVar2 = (com.avito.android.select.variant.a) aVar;
        qVar.setTitle(aVar2.f266835c);
        String str = aVar2.f266836d;
        qVar.f(str);
        qVar.iw(str != null ? BaseListItem.Alignment.f179501c : BaseListItem.Alignment.f179500b);
        UniversalImage universalImage = aVar2.f266841i;
        if (universalImage != null) {
            qVar.gA(universalImage, aVar2.f266850r);
            g02 = G0.f406611a;
        } else {
            Image image = aVar2.f266837e;
            if (image != null) {
                qVar.l(image);
                g02 = G0.f406611a;
            } else {
                g02 = null;
                String str2 = aVar2.f266839g;
                if (str2 != null) {
                    qVar.l00(str2);
                    g03 = G0.f406611a;
                } else {
                    g03 = null;
                }
                if (g03 == null) {
                    Integer num = aVar2.f266838f;
                    if (num != null) {
                        qVar.setImage(num.intValue());
                        g02 = G0.f406611a;
                    }
                } else {
                    g02 = g03;
                }
            }
        }
        if (g02 == null) {
            qVar.p0();
        }
        qVar.setChecked(aVar2.f266842j);
        qVar.Kd(aVar2.f266844l);
        qVar.HC(aVar2.f266846n);
        qVar.a(new n(this, aVar2));
        String str3 = aVar2.f266843k;
        if (str3 != null) {
            qVar.s(str3);
        }
        qVar.c3(aVar2.f266847o);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.m
    /* renamed from: q4, reason: from getter */
    public final int getF265176d() {
        return this.f265176d;
    }
}
