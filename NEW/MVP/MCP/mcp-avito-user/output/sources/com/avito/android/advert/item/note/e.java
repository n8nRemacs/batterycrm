package com.avito.android.advert.item.note;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.di.C27710t;
import com.avito.android.advert.item.W0;
import com.avito.android.advert_core.analytics.toolbar.NoteAction;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsNotePresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/note/e;", "Lcom/avito/android/advert/item/note/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f77813b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.analytics.a f77814c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f77815d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public y f77816e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public AdvertDetails f77817f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public g f77818g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public AdvertDetailsNoteItem f77819h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public W0 f77820i;

    @Inject
    public e(@k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.advert_core.analytics.a aVar, @C27710t.InterfaceC2166t @l String str) {
        this.f77813b = interfaceC35745a5;
        this.f77814c = aVar;
        this.f77815d = str;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        this.f77819h = (AdvertDetailsNoteItem) aVar;
        this.f77818g = gVar;
        y yVar = this.f77816e;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f77816e = (y) gVar.getF77824b().j0(this.f77813b.e()).t0(new d(this));
        AdvertDetails advertDetails = this.f77817f;
        k(advertDetails != null ? advertDetails.getNote() : null);
    }

    @Override // com.avito.android.advert.item.note.c
    public final void c0() {
        this.f77820i = null;
    }

    @Override // com.avito.android.advert.item.note.c
    public final void e0() {
        y yVar = this.f77816e;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f77816e = null;
        this.f77818g = null;
    }

    public final void k(String str) {
        if (str == null || str.length() == 0) {
            g gVar = this.f77818g;
            if (gVar != null) {
                gVar.tv(false);
                return;
            }
            return;
        }
        g gVar2 = this.f77818g;
        if (gVar2 != null) {
            gVar2.tv(true);
        }
        g gVar3 = this.f77818g;
        if (gVar3 != null) {
            gVar3.s6(str);
        }
    }

    @Override // com.avito.android.advert.item.note.c
    public final void s6(@l String str) {
        AdvertDetails advertDetails = this.f77817f;
        if (advertDetails != null) {
            String note = advertDetails.getNote();
            boolean z12 = true;
            boolean z13 = ((note != null && note.length() != 0) || str == null || str.length() == 0) ? false : true;
            String note2 = advertDetails.getNote();
            boolean z14 = (note2 == null || note2.length() == 0 || str == null || str.length() == 0) ? false : true;
            String note3 = advertDetails.getNote();
            if (note3 == null || note3.length() == 0 || (str != null && str.length() != 0)) {
                z12 = false;
            }
            com.avito.android.advert_core.analytics.a aVar = this.f77814c;
            if (z13) {
                aVar.d3(advertDetails, NoteAction.f82885b, str);
            } else if (z14) {
                aVar.d3(advertDetails, NoteAction.f82886c, str);
            } else if (z12) {
                aVar.d3(advertDetails, NoteAction.f82887d, str);
            }
        }
        AdvertDetails advertDetails2 = this.f77817f;
        if (advertDetails2 != null) {
            advertDetails2.setNote(str);
        }
        AdvertDetailsNoteItem advertDetailsNoteItem = this.f77819h;
        if (advertDetailsNoteItem != null) {
            advertDetailsNoteItem.f77804d = str;
        }
        k(str);
    }

    @Override // com.avito.android.advert.item.note.c
    public final void t6(@k AdvertDetails advertDetails) {
        this.f77817f = advertDetails;
        k(advertDetails.getNote());
    }

    @Override // com.avito.android.advert.item.note.c
    public final void v6(@k W0 w02) {
        this.f77820i = w02;
    }
}
