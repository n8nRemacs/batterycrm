package com.avito.android.advert.item.note;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsNoteView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/note/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/note/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f77824b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f77825c;

    /* renamed from: d, reason: collision with root package name */
    public final View f77826d;

    /* renamed from: e, reason: collision with root package name */
    public final View f77827e;

    /* compiled from: AdvertDetailsNoteView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c<G0> cVar = h.this.f77824b;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    public h(@k View view) {
        super(view);
        this.f77824b = new com.jakewharton.rxrelay3.c<>();
        this.f77825c = (TextView) view.findViewById(R.id.text);
        com.avito.android.lib.deprecated_design.button.c cVar = new com.avito.android.lib.deprecated_design.button.c(view.findViewById(R.id.button));
        this.f77826d = view.findViewById(R.id.content);
        this.f77827e = view.findViewById(R.id.bottom_divider);
        cVar.c(new a());
    }

    @Override // com.avito.android.advert.item.note.g
    /* renamed from: IT, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF77824b() {
        return this.f77824b;
    }

    @Override // com.avito.android.advert.item.note.g
    public final void s6(@k String str) {
        this.f77825c.setText(str);
    }

    @Override // com.avito.android.advert.item.note.g
    public final void tv(boolean z12) {
        D6.G(this.f77826d, z12);
    }
}
