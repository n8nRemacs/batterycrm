package com.avito.android.publish.slots.check_verification.item;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VerificationItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/check_verification/item/h;", "LTV0/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface h extends TV0.e {

    /* compiled from: VerificationItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void Jn(@k l lVar, @Y61.l AttributedText attributedText);

    void P(@k String str, @k Y41.a<G0> aVar);

    void h(@k String str);

    void i(@k UniversalImage universalImage);

    void setTitle(@k String str);

    void setVisible(boolean z12);
}
