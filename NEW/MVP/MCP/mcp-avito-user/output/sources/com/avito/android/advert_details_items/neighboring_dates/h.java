package com.avito.android.advert_details_items.neighboring_dates;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f84904b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f84905c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsNeighboringDatesItem.State.Content f84906d;

    public /* synthetic */ h(AdvertDetailsNeighboringDatesItem.State.Content content, i iVar) {
        this.f84906d = content;
        this.f84905c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArrC;
        AdvertDetailsNeighboringDatesItem.State.Content content = this.f84906d;
        i iVar = this.f84905c;
        switch (this.f84904b) {
            case 0:
                int i12 = i.f84907n;
                Integer num = ((AdvertDetailsNeighboringDatesItem.State.Content.MultiplyChips) content).f84877e;
                if (num != null) {
                    int iIntValue = num.intValue();
                    RecyclerView recyclerView = iVar.f84917k;
                    recyclerView.A0(iIntValue);
                    recyclerView.post(new h(iVar, content));
                    break;
                }
                break;
            default:
                LinearLayoutManager linearLayoutManager = iVar.f84911e;
                View viewZ = linearLayoutManager.Z(((AdvertDetailsNeighboringDatesItem.State.Content.MultiplyChips) content).f84877e.intValue());
                if (viewZ != null && (iArrC = iVar.f84910d.c(linearLayoutManager, viewZ)) != null) {
                    iVar.f84917k.C0(iArrC[0], iArrC[1]);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h(i iVar, AdvertDetailsNeighboringDatesItem.State.Content content) {
        this.f84905c = iVar;
        this.f84906d = content;
    }
}
