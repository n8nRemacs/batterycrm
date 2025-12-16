package com.avito.android.publish.slots.fashion_authentication_check_banner.item;

import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: FashionAuthenticationCheckBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/fashion_authentication_check_banner/item/k;", "Lcom/avito/android/publish/slots/fashion_authentication_check_banner/item/j;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: f, reason: collision with root package name */
    public static final int f243887f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f243888g;

    /* renamed from: b, reason: collision with root package name */
    public final Banner f243889b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f243890c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f243891d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.a<G0> f243892e;

    /* compiled from: FashionAuthenticationCheckBannerView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/fashion_authentication_check_banner/item/k$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f243887f = y6.b(12);
        f243888g = y6.b(12);
    }

    public k(@Y61.k View view) {
        super(view);
        Banner banner = (Banner) view.findViewById(R.id.notification_banner);
        this.f243889b = banner;
        this.f243890c = (TextView) banner.findViewById(R.id.notification_banner_content);
        this.f243891d = view.getContext();
    }

    @Override // com.avito.android.publish.slots.fashion_authentication_check_banner.item.j
    public final void Jt(@Y61.k String str) throws Resources.NotFoundException {
        this.f243889b.setAppearance(com.avito.android.lib.util.f.s(com.avito.android.lib.util.f.b(str), this.f243891d));
    }

    @Override // com.avito.android.publish.slots.fashion_authentication_check_banner.item.j
    public final void Sq() {
        this.f243892e = null;
    }

    @Override // com.avito.android.publish.slots.fashion_authentication_check_banner.item.j
    public final void b(@Y61.k String str) {
        this.f243889b.setTitle(str);
    }

    @Override // com.avito.android.publish.slots.fashion_authentication_check_banner.item.j
    public final void d(@Y61.k Y41.a<G0> aVar) {
        this.f243892e = aVar;
    }

    @Override // com.avito.android.publish.slots.fashion_authentication_check_banner.item.j
    public final void hide() {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }
        RecyclerView.n nVar = (RecyclerView.n) layoutParams;
        ((ViewGroup.MarginLayoutParams) nVar).height = 0;
        ((ViewGroup.MarginLayoutParams) nVar).width = 0;
        view.setLayoutParams(nVar);
        D6.c(this.itemView, null, 0, null, 0, 5);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f243892e;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f243892e = null;
    }

    @Override // com.avito.android.publish.slots.fashion_authentication_check_banner.item.j
    public final void q(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f243890c, attributedText, null);
    }

    @Override // com.avito.android.publish.slots.fashion_authentication_check_banner.item.j
    public final void show() {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        }
        RecyclerView.n nVar = (RecyclerView.n) layoutParams;
        ((ViewGroup.MarginLayoutParams) nVar).height = -2;
        ((ViewGroup.MarginLayoutParams) nVar).width = -1;
        view.setLayoutParams(nVar);
        D6.c(this.itemView, null, Integer.valueOf(f243887f), null, Integer.valueOf(f243888g), 5);
    }
}
