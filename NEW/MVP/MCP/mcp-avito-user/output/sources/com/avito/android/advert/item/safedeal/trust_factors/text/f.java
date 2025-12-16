package com.avito.android.advert.item.safedeal.trust_factors.text;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.safedeal.trust_factors.i;
import com.avito.android.advert.item.safedeal.trust_factors.n;
import com.avito.android.remote.safedeal.SafeDeal;
import kotlin.Metadata;

/* compiled from: TrustFactorsTextView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/text/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/safedeal/trust_factors/n;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f79245b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f79246c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final i f79247d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f79248e;

    /* compiled from: TrustFactorsTextView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79249a;

        static {
            int[] iArr = new int[SafeDeal.Alignment.values().length];
            try {
                iArr[SafeDeal.Alignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SafeDeal.Alignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f79249a = iArr;
        }
    }

    public f(@k TextView textView, @k com.avito.android.util.text.a aVar, @l i iVar) {
        super(textView);
        this.f79245b = textView;
        this.f79246c = aVar;
        this.f79247d = iVar;
        this.f79248e = textView.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        i iVar = this.f79247d;
        if (iVar != null) {
            iVar.a();
        }
    }
}
