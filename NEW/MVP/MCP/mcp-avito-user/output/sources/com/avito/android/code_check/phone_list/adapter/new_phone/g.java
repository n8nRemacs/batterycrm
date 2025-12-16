package com.avito.android.code_check.phone_list.adapter.new_phone;

import Mo.C14514a;
import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.calltracking.item.m;
import com.avito.android.code_check.phone_list.adapter.PhoneListItemView;
import com.avito.android.code_check_public.screen.PhoneList;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NewPhoneItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/phone_list/adapter/new_phone/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/code_check/phone_list/adapter/new_phone/f;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f118940c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PhoneListItemView f118941b;

    public g(@k View view) {
        super(view);
        this.f118941b = (PhoneListItemView) view;
    }

    @Override // com.avito.android.code_check.phone_list.adapter.new_phone.f
    public final void a(@k Y41.a<G0> aVar) {
        this.f118941b.setOnClickListener(new m(14, aVar));
    }

    @Override // com.avito.android.code_check.phone_list.adapter.new_phone.f
    public final void up(@l PhoneList.ItemIcon itemIcon) {
        this.f118941b.n(C14514a.a(itemIcon), true);
    }

    @Override // com.avito.android.code_check.phone_list.adapter.new_phone.f
    public final void y(@k PrintableText printableText) {
        PhoneListItemView phoneListItemView = this.f118941b;
        phoneListItemView.setText(printableText.k0(phoneListItemView.getContext()));
    }
}
