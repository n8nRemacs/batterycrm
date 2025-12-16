package com.avito.android.user_advert.advert.items.auto_publish;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.avito.android.lib.design.list_item.ListItemCompoundButton;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AutoPublishItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/auto_publish/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/auto_publish/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f309256b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f309257c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ListItemSwitcher f309258d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public a f309259e;

    /* compiled from: AutoPublishItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/user_advert/advert/items/auto_publish/j$a", "Lcom/avito/android/lib/design/list_item/ListItemCompoundButton$a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ListItemCompoundButton.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ N f309260a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Boolean, G0> lVar) {
            this.f309260a = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // com.avito.android.lib.design.list_item.ListItemCompoundButton.a
        public final void a(@k ListItemCompoundButton listItemCompoundButton, boolean z12) {
            this.f309260a.invoke(Boolean.valueOf(z12));
        }
    }

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f309256b = aVar;
        this.f309257c = view.getContext();
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) view;
        this.f309258d = listItemSwitcher;
        listItemSwitcher.setLinkMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.user_advert.advert.items.auto_publish.i
    public final void CI(@k String str) {
        this.f309258d.setTitle(str);
    }

    @Override // com.avito.android.user_advert.advert.items.auto_publish.i
    public final void FV(boolean z12) {
        this.f309258d.setLoading(z12);
    }

    @Override // com.avito.android.user_advert.advert.items.auto_publish.i
    public final void Oi(boolean z12) {
        this.f309258d.setChecked(z12);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        a aVar = this.f309259e;
        if (aVar != null) {
            this.f309258d.j(aVar);
        }
        this.f309259e = null;
    }

    @Override // com.avito.android.user_advert.advert.items.auto_publish.i
    public final void p60(@l AttributedText attributedText) {
        this.f309258d.setLink(this.f309256b.c(this.f309257c, attributedText));
    }

    @Override // com.avito.android.user_advert.advert.items.auto_publish.i
    public final void s40(@l Y41.l<? super Boolean, G0> lVar) {
        ListItemSwitcher listItemSwitcher = this.f309258d;
        if (lVar != null) {
            a aVar = new a(lVar);
            this.f309259e = aVar;
            listItemSwitcher.e(aVar);
        } else {
            a aVar2 = this.f309259e;
            if (aVar2 != null) {
                listItemSwitcher.j(aVar2);
            }
            this.f309259e = null;
        }
    }
}
