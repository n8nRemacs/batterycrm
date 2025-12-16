package com.avito.android.code_check.phone_list.adapter.phone;

import Mo.C14514a;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.appcompat.app.r;
import com.avito.android.calltracking.item.m;
import com.avito.android.code_check.phone_list.adapter.PhoneListItemView;
import com.avito.android.code_check_public.screen.PhoneList;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.FontStyleKt;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/phone_list/adapter/phone/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/code_check/phone_list/adapter/phone/g;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f118960d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f118961b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PhoneListItemView f118962c;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f118961b = aVar;
        this.f118962c = (PhoneListItemView) view;
    }

    @Override // com.avito.android.code_check.phone_list.adapter.phone.g
    public final void E7(@k String str) {
        this.f118962c.setText(str);
    }

    @Override // com.avito.android.code_check.phone_list.adapter.phone.g
    public final void FS(@l PhoneList.ItemIcon itemIcon, boolean z12) {
        this.f118962c.n(C14514a.a(itemIcon), z12);
    }

    @Override // com.avito.android.code_check.phone_list.adapter.phone.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f118962c.setOnClickListener(new m(15, aVar));
    }

    @Override // com.avito.android.code_check.phone_list.adapter.phone.g
    public final void m30(int i12, int i13, @k String str) {
        int i14 = i13 + 1;
        AttributedText attributedText = new AttributedText(r.r(str.substring(0, i12), "{{b}}", str.substring(i14, str.length())), Collections.singletonList(new FontAttribute("b", str.substring(i12, i14), Collections.singletonList(new FontParameter.StyleParameter(FontStyleKt.BOLD)))), 1);
        PhoneListItemView phoneListItemView = this.f118962c;
        CharSequence charSequenceC = this.f118961b.c(phoneListItemView.getContext(), attributedText);
        if (charSequenceC == null) {
            charSequenceC = "";
        }
        phoneListItemView.setText(charSequenceC);
    }
}
