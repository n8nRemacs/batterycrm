package com.yandex.div.core.view2.divs;

import android.text.Editable;
import com.yandex.div.core.expression.variables.h;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DivInputBinder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/view2/divs/k1;", "Lcom/yandex/div/core/expression/variables/h$a;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.divs.k1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37973k1 implements h.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0.h<com.yandex.div.core.util.mask.a> f368534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.j f368535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, kotlin.G0> f368536c;

    /* compiled from: DivInputBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/text/Editable;", "editable", "Lkotlin/G0;", "invoke", "(Landroid/text/Editable;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.yandex.div.core.view2.divs.k1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Editable, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h<com.yandex.div.core.util.mask.a> f368537l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, kotlin.G0> f368538m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.yandex.div.core.view2.divs.widgets.j f368539n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, kotlin.G0> f368540o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l0.h<com.yandex.div.core.util.mask.a> hVar, Y41.l<? super String, kotlin.G0> lVar, com.yandex.div.core.view2.divs.widgets.j jVar, Y41.l<? super String, kotlin.G0> lVar2) {
            super(1);
            this.f368537l = hVar;
            this.f368538m = lVar;
            this.f368539n = jVar;
            this.f368540o = lVar2;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Editable editable) {
            String string;
            String string2;
            Editable editable2 = editable;
            String str = "";
            if (editable2 == null || (string = editable2.toString()) == null) {
                string = "";
            }
            l0.h<com.yandex.div.core.util.mask.a> hVar = this.f368537l;
            com.yandex.div.core.util.mask.a aVar = hVar.f406842b;
            if (aVar != null && !aVar.h().equals(string)) {
                com.yandex.div.core.view2.divs.widgets.j jVar = this.f368539n;
                Editable text = jVar.getText();
                if (text != null && (string2 = text.toString()) != null) {
                    str = string2;
                }
                aVar.a(Integer.valueOf(jVar.getSelectionStart()), str);
                jVar.setText(aVar.h());
                jVar.setSelection(aVar.f367803d);
                ((C37976l1) this.f368540o).invoke(aVar.h());
            }
            com.yandex.div.core.util.mask.a aVar2 = hVar.f406842b;
            if (aVar2 != null) {
                string = aVar2.g().replace(',', '.');
            }
            this.f368538m.invoke(string);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37973k1(l0.h<com.yandex.div.core.util.mask.a> hVar, com.yandex.div.core.view2.divs.widgets.j jVar, Y41.l<? super String, kotlin.G0> lVar) {
        this.f368534a = hVar;
        this.f368535b = jVar;
        this.f368536c = lVar;
    }

    @Override // com.yandex.div.core.expression.variables.j.a
    public final void a(String str) {
        String strH = str;
        com.yandex.div.core.util.mask.a aVar = this.f368534a.f406842b;
        if (aVar != null) {
            if (strH == null) {
                strH = "";
            }
            aVar.j(strH);
            ((C37976l1) this.f368536c).invoke(aVar.h());
            strH = aVar.h();
        }
        this.f368535b.setText(strH);
    }

    @Override // com.yandex.div.core.expression.variables.j.a
    public final void b(@Y61.k Y41.l<? super String, kotlin.G0> lVar) {
        l0.h<com.yandex.div.core.util.mask.a> hVar = this.f368534a;
        Y41.l<String, kotlin.G0> lVar2 = this.f368536c;
        com.yandex.div.core.view2.divs.widgets.j jVar = this.f368535b;
        jVar.setBoundVariableChangeAction(new a(hVar, lVar, jVar, lVar2));
    }
}
