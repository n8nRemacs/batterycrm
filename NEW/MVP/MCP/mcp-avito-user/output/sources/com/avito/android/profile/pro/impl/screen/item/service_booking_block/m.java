package com.avito.android.profile.pro.impl.screen.item.service_booking_block;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.lib.design.header_button.HeaderButton;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.service_booking_user_profile.view.item.a;
import java.util.Collection;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ProfileProSbBlockItem.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/m;", "LTV0/d;", "Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/q;", "Lcom/avito/android/service_booking_user_profile/view/item/a;", "<init>", "()V", "a", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes16.dex */
public final class m implements TV0.d<q, com.avito.android.service_booking_user_profile.view.item.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public a f223510b;

    /* compiled from: ProfileProSbBlockItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/service_booking_block/m$a;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@Y61.k DeepLink deepLink);
    }

    @Inject
    public m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.C] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        q qVar = (q) eVar;
        com.avito.android.service_booking_user_profile.view.item.a aVar2 = (com.avito.android.service_booking_user_profile.view.item.a) aVar;
        qVar.f223529n = new n(this);
        PrintableText printableText = aVar2.f278174c;
        Context context = qVar.f223528m;
        qVar.f223520e.setText(printableText.k0(context));
        com.avito.android.profile.pro.impl.a.a(qVar.f223521f, aVar2.f278175d.k0(context));
        View view = qVar.f223523h;
        a.b bVar = aVar2.f278176e;
        if (bVar != null) {
            view.setVisibility(0);
            Integer numM = com.avito.android.lib.util.f.m(bVar.f278182a);
            int iIntValue = numM != null ? numM.intValue() : R.attr.textIconHeaderbuttonArrow;
            HeaderButton headerButton = qVar.f223522g;
            headerButton.setTextIcon(iIntValue);
            headerButton.setOnClickListener(new p(1, aVar2, qVar));
        } else {
            view.setVisibility(8);
        }
        a.C8261a c8261a = aVar2.f278177f;
        CharSequence charSequenceC = qVar.f223517b.c(context, c8261a != null ? c8261a.f278181b : null);
        qVar.f223525j.setText(charSequenceC);
        int i13 = (charSequenceC == null || charSequenceC.length() == 0) ? 8 : 0;
        ViewGroup viewGroup = qVar.f223524i;
        viewGroup.setVisibility(i13);
        viewGroup.setOnClickListener(new p(0, aVar2, qVar));
        ?? r02 = aVar2.f278178g;
        qVar.f223526k.setVisibility(!((Collection) r02).isEmpty() ? 0 : 8);
        ((com.avito.konveyor.adapter.d) qVar.f223530o.getValue()).l(r02, null);
        qVar.f223527l.setVisibility(aVar2.f278179h ? 0 : 8);
    }
}
