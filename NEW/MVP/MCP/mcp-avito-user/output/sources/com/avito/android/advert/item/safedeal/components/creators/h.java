package com.avito.android.advert.item.safedeal.components.creators;

import Rh.C15041a;
import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.safedeal.u;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TextSafeDealViewCreator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/safedeal/components/creators/h;", "Lcom/avito/android/advert_core/safedeal/u;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$Text;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements u<SafeDeal.Component.Text> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f78796a;

    /* compiled from: TextSafeDealViewCreator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f78797a;

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
            f78797a = iArr;
        }
    }

    public h(@k com.avito.android.util.text.a aVar) {
        this.f78796a = aVar;
    }

    @Override // com.avito.android.advert_core.safedeal.u
    public final boolean a(@k SafeDeal.Component component) {
        return component instanceof SafeDeal.Component.Text;
    }

    @Override // com.avito.android.advert_core.safedeal.u
    public final View b(ViewGroup viewGroup, SafeDeal.Component component, com.avito.android.advert_core.safedeal.a aVar) {
        SafeDeal.Component.Text text = (SafeDeal.Component.Text) component;
        com.avito.android.lib.design.text_view.a aVar2 = new com.avito.android.lib.design.text_view.a(viewGroup.getContext(), null, 0, 0, 14, null);
        aVar2.setTextAppearance(com.avito.android.lib.util.f.r(aVar2.getContext(), text.getStyle()));
        SafeDeal.Alignment alignment = text.getAlignment();
        int i12 = alignment == null ? -1 : a.f78797a[alignment.ordinal()];
        aVar2.setGravity(i12 != 1 ? i12 != 2 ? 8388611 : 8388613 : 1);
        aVar2.setMovementMethod(LinkMovementMethod.getInstance());
        j.a(aVar2, text.getAttributedText(), this.f78796a);
        text.getAttributedText().setOnDeepLinkClickListener(new C15041a(aVar, 3));
        String id2 = text.getId();
        if (id2 != null) {
            aVar2.setTag(id2);
        }
        return aVar2;
    }
}
