package com.avito.android.publish.slots.contact_method.item;

import Y41.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ContactMethodItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/contact_method/item/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/contact_method/item/i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ListItemSwitcher f243310b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ListItemSwitcher f243311c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f243312d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f243313e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public N f243314f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public N f243315g;

    /* compiled from: ContactMethodItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f243316l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Boolean bool) {
            bool.booleanValue();
            return G0.f406611a;
        }
    }

    /* compiled from: ContactMethodItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f243317l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Boolean bool) {
            bool.booleanValue();
            return G0.f406611a;
        }
    }

    /* compiled from: ContactMethodItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f243318l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Boolean bool) {
            bool.booleanValue();
            return G0.f406611a;
        }
    }

    /* compiled from: ContactMethodItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f243319l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Boolean bool) {
            bool.booleanValue();
            return G0.f406611a;
        }
    }

    public k(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.contact_method_messenger);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) viewFindViewById;
        this.f243310b = listItemSwitcher;
        View viewFindViewById2 = view.findViewById(R.id.contact_method_phone);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        ListItemSwitcher listItemSwitcher2 = (ListItemSwitcher) viewFindViewById2;
        this.f243311c = listItemSwitcher2;
        View viewFindViewById3 = view.findViewById(R.id.contact_method_error);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243312d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.contact_method_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243313e = (TextView) viewFindViewById4;
        this.f243314f = a.f243316l;
        this.f243315g = b.f243317l;
        final int i12 = 0;
        listItemSwitcher.e(new ListItemCompoundButton.a(this) { // from class: com.avito.android.publish.slots.contact_method.item.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f243309b;

            {
                this.f243309b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [Y41.l, kotlin.jvm.internal.N] */
            /* JADX WARN: Type inference failed for: r1v5, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
            public final void a(ListItemCompoundButton listItemCompoundButton, boolean z12) {
                switch (i12) {
                    case 0:
                        this.f243309b.f243314f.invoke(Boolean.valueOf(z12));
                        break;
                    default:
                        this.f243309b.f243315g.invoke(Boolean.valueOf(z12));
                        break;
                }
            }
        });
        final int i13 = 1;
        listItemSwitcher2.e(new ListItemCompoundButton.a(this) { // from class: com.avito.android.publish.slots.contact_method.item.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f243309b;

            {
                this.f243309b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [Y41.l, kotlin.jvm.internal.N] */
            /* JADX WARN: Type inference failed for: r1v5, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
            public final void a(ListItemCompoundButton listItemCompoundButton, boolean z12) {
                switch (i13) {
                    case 0:
                        this.f243309b.f243314f.invoke(Boolean.valueOf(z12));
                        break;
                    default:
                        this.f243309b.f243315g.invoke(Boolean.valueOf(z12));
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.publish.slots.contact_method.item.i
    public final void CF(@Y61.l String str) {
        I5.a(this.f243313e, str, false);
    }

    @Override // com.avito.android.publish.slots.contact_method.item.i
    public final void Ev(@Y61.k String str) {
        this.f243311c.setTitle(str);
    }

    @Override // com.avito.android.publish.slots.contact_method.item.i
    public final void dO(@Y61.k String str) {
        this.f243310b.setTitle(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.publish.slots.contact_method.item.i
    public final void f80(@Y61.k l<? super Boolean, G0> lVar) {
        this.f243314f = (N) lVar;
    }

    @Override // com.avito.android.publish.slots.contact_method.item.i
    public final void ge(boolean z12) {
        D6.G(this.f243312d, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.publish.slots.contact_method.item.i
    public final void jk(@Y61.k l<? super Boolean, G0> lVar) {
        this.f243315g = (N) lVar;
    }

    @Override // com.avito.android.publish.slots.contact_method.item.i
    public final void ot(boolean z12) {
        N n12 = this.f243314f;
        this.f243314f = c.f243318l;
        this.f243310b.setChecked(z12);
        this.f243314f = n12;
    }

    @Override // com.avito.android.publish.slots.contact_method.item.i
    public final void vO(boolean z12) {
        N n12 = this.f243315g;
        this.f243315g = d.f243319l;
        this.f243311c.setChecked(z12);
        this.f243315g = n12;
    }

    @Override // com.avito.android.publish.slots.contact_method.item.i
    public final void xI() {
        D6.h(this.f243311c);
    }
}
