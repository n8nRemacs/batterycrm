package com.avito.android.advert_core.contactbar;

import android.os.Parcelable;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.credits.installments.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertContactsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/avito/android/component/advert_contact_bar/ContactBar$InfoStickyBlock;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_core.contactbar.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28269h extends N implements Y41.l<List<? extends ContactBar.InfoStickyBlock>, List<? extends ContactBar.InfoStickyBlock>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.c f83233l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28269h(a.c cVar) {
        super(1);
        this.f83233l = cVar;
    }

    @Override // Y41.l
    public final List<? extends ContactBar.InfoStickyBlock> invoke(List<? extends ContactBar.InfoStickyBlock> list) {
        List<? extends ContactBar.InfoStickyBlock> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (Parcelable parcelableA : list2) {
            if (parcelableA instanceof ContactBar.InfoStickyBlock.InstallmentsActionToggle) {
                parcelableA = ContactBar.InfoStickyBlock.InstallmentsActionToggle.a((ContactBar.InfoStickyBlock.InstallmentsActionToggle) parcelableA, this.f83233l.f128863a);
            }
            arrayList.add(parcelableA);
        }
        return arrayList;
    }
}
