package com.avito.android.beduin.common.form.actionbus;

import Ui.InterfaceC15523b;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.utils.C28806b;
import com.avito.android.beduin_models.BeduinAction;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC49066a;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import nj.InterfaceC44433a;

/* compiled from: FormsUpdateObserverImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/form/actionbus/b;", "Lnj/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements InterfaceC44433a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f103324a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC49066a f103325b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.form.store.b f103326c;

    /* renamed from: e, reason: collision with root package name */
    @l
    public String f103328e;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f103327d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final p<String, List<? extends BeduinAction>, G0> f103329f = new a();

    /* compiled from: FormsUpdateObserverImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "formId", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<String, List<? extends BeduinAction>, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, List<? extends BeduinAction> list) {
            String str2 = str;
            List<? extends BeduinAction> list2 = list;
            b bVar = b.this;
            if (bVar.f103326c.get(str2) != null || C43066x.t(str2, bVar.f103328e)) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    if (((BeduinAction) obj) instanceof Ui.e) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                C28806b.a(bVar.f103324a, arrayList);
                bVar.f103327d.addAll(arrayList2);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k InterfaceC49066a interfaceC49066a, @k com.avito.android.beduin.common.form.store.b bVar) {
        this.f103324a = interfaceC15523b;
        this.f103325b = interfaceC49066a;
        this.f103326c = bVar;
    }

    @Override // nj.InterfaceC44433a
    public final void a() {
        ArrayList arrayList = this.f103327d;
        C28806b.a(this.f103324a, arrayList);
        arrayList.clear();
    }

    @Override // nj.InterfaceC44433a
    public final void b() {
        this.f103325b.c(this.f103329f);
    }

    @Override // nj.InterfaceC44433a
    public final void c(@l String str) {
        this.f103328e = str;
    }
}
