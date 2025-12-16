package com.avito.android.messenger.search.adapter.supportchannel;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import fZ.AbstractC40377a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SupportChannelItemView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/adapter/supportchannel/e;", "LTV0/e;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface e extends TV0.e {

    /* compiled from: SupportChannelItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: SupportChannelItemView.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/search/adapter/supportchannel/e$b;", "Lcom/avito/android/messenger/search/adapter/supportchannel/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.konveyor.adapter.b implements e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.messenger.widget.chat_list_element.e f197065b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Y41.a<G0> f197066c;

        public b(@k View view) {
            super(view);
            this.f197065b = new com.avito.android.messenger.widget.chat_list_element.e(view);
        }

        @Override // com.avito.android.messenger.search.adapter.supportchannel.e
        public final void aK(@k AbstractC40377a.c cVar) {
            boolean z12 = cVar.f395936d;
            com.avito.android.messenger.widget.chat_list_element.e eVar = this.f197065b;
            eVar.a(z12);
            eVar.f197510b.setText(cVar.f395937e);
            Image image = cVar.f395938f;
            if (image != null) {
                com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(image);
                D6.H(eVar.f197512d);
                C35949t5.c(eVar.f197512d, aVarB, null, null, null, 14);
            }
            eVar.f197509a.setOnClickListener(new com.avito.android.messenger.widget.chat_list_element.a(1, this.f197066c));
        }

        @Override // com.avito.android.messenger.search.adapter.supportchannel.e
        public final void c(@l Y41.a<G0> aVar) {
            this.f197066c = aVar;
        }
    }

    void aK(@k AbstractC40377a.c cVar);

    void c(@l Y41.a<G0> aVar);
}
