package com.avito.android.publish.items.iac_for_pro_enabled;

import Y41.l;
import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacForProEnabledItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/items/iac_for_pro_enabled/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/items/iac_for_pro_enabled/h;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f236953b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ListItemSwitcher f236954c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f236955d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f236956e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public N f236957f;

    /* compiled from: IacForProEnabledItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f236958l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Boolean bool) {
            bool.booleanValue();
            return G0.f406611a;
        }
    }

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f236953b = aVar;
        View viewFindViewById = view.findViewById(R.id.iac_for_pro_banner_enabled_switcher);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        ListItemSwitcher listItemSwitcher = (ListItemSwitcher) viewFindViewById;
        this.f236954c = listItemSwitcher;
        View viewFindViewById2 = view.findViewById(R.id.iac_for_pro_enabled_item_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f236955d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.iac_for_pro_enabled_item_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById3;
        this.f236956e = textView;
        this.f236957f = a.f236958l;
        listItemSwitcher.setToggleByClickEnabled(false);
        listItemSwitcher.setOnClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(this, 15));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.publish.items.iac_for_pro_enabled.h
    public final void C7(boolean z12) {
        this.f236954c.setChecked(z12);
    }

    @Override // com.avito.android.publish.items.iac_for_pro_enabled.h
    public final void Ka(@k String str) {
        this.f236954c.setTitle(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.publish.items.iac_for_pro_enabled.h
    public final void hJ(@k l<? super Boolean, G0> lVar) {
        this.f236957f = (N) lVar;
    }

    @Override // com.avito.android.publish.items.iac_for_pro_enabled.h
    public final void r(@k AttributedText attributedText) {
        TextView textView = this.f236956e;
        textView.setText(this.f236953b.c(textView.getContext(), attributedText));
    }

    @Override // com.avito.android.publish.items.iac_for_pro_enabled.h
    public final void setTitle(@k String str) {
        this.f236955d.setText(str);
    }
}
