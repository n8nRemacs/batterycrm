package com.avito.android.advert.item.beduin_block;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.remote.model.AdvertDetailsBlockId;
import com.avito.android.util.InterfaceC35745a5;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsBeduinFormBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/beduin_block/a;", "LTV0/b;", "Lcom/avito/android/advert/item/beduin_block/AdvertDetailsBeduinFormView;", "Lcom/avito/android/advert/item/beduin_block/AdvertDetailsBeduinFormItem;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class a implements TV0.b<AdvertDetailsBeduinFormView, AdvertDetailsBeduinFormItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C2203a f73398a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.util.b f73399b = com.avito.android.actions_sheet.a.r(com.avito.konveyor.util.c.f338562a);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f73400c = new g.a<>(R.layout.advert_details_beduin_block, new b());

    /* compiled from: AdvertDetailsBeduinFormBlueprint.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/beduin_block/a$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.beduin_block.a$a, reason: collision with other inner class name */
    public static final class C2203a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC25659b f73401a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC35745a5 f73402b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final InterfaceC40691b f73403c;

        @Inject
        public C2203a(@k InterfaceC25659b interfaceC25659b, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC40691b interfaceC40691b) {
            this.f73401a = interfaceC25659b;
            this.f73402b = interfaceC35745a5;
            this.f73403c = interfaceC40691b;
        }
    }

    /* compiled from: AdvertDetailsBeduinFormBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/advert/item/beduin_block/AdvertDetailsBeduinFormView;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<ViewGroup, View, AdvertDetailsBeduinFormView> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final AdvertDetailsBeduinFormView invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            a aVar = a.this;
            com.avito.android.beduin.common.component.adapter.a aVarB = aVar.f73398a.f73401a.b(null);
            C2203a c2203a = aVar.f73398a;
            return new AdvertDetailsBeduinFormView(view2, c2203a.f73403c.B0(), aVarB, c2203a.f73403c, c2203a.f73402b);
        }
    }

    public a(@k C2203a c2203a) {
        this.f73398a = c2203a;
    }

    @Override // TV0.b
    @k
    public final TV0.d<AdvertDetailsBeduinFormView, AdvertDetailsBeduinFormItem> a() {
        return this.f73399b;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f73400c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof AdvertDetailsBeduinFormItem) {
            if (((AdvertDetailsBeduinFormItem) aVar).f73387b == getF73413d()) {
                return true;
            }
        }
        return false;
    }

    @k
    /* renamed from: e */
    public abstract AdvertDetailsBlockId getF73413d();
}
