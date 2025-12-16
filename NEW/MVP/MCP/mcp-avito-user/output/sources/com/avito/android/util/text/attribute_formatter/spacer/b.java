package com.avito.android.util.text.attribute_formatter.spacer;

import PK0.h;
import PK0.n;
import Y61.k;
import android.content.Context;
import android.text.Editable;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.SpacerAttribute;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SpacerAttributeFormatterV1.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/text/attribute_formatter/spacer/b;", "Lcom/avito/android/util/text/attribute_formatter/spacer/a;", "<init>", "()V", "a", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.util.text.attribute_formatter.spacer.a {

    /* compiled from: SpacerAttributeFormatterV1.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/util/text/attribute_formatter/spacer/b$a;", "", "<init>", "()V", "", "SPACER_PLACEHOLDER", "Ljava/lang/String;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b() {
    }

    @Override // CK0.a
    public final void a(Context context, n nVar, boolean z12, Editable editable, int i12, String str, Attribute attribute, AttributedText attributedText) {
        Integer numValueOf;
        SpacerAttribute spacerAttribute = (SpacerAttribute) attribute;
        editable.replace(i12, str.length() + i12, " ");
        if (L.f(spacerAttribute.getType(), "textIcon")) {
            FV.a.f4720a.getClass();
            numValueOf = Integer.valueOf(FV.a.f4721b);
        } else {
            Integer value = spacerAttribute.getValue();
            numValueOf = value != null ? Integer.valueOf(y6.b(value.intValue())) : null;
        }
        if (numValueOf != null) {
            editable.setSpan(new h(numValueOf.intValue()), i12, i12 + 1, 33);
        }
    }

    @Override // CK0.a
    public final boolean b(@k Attribute attribute) {
        return attribute instanceof SpacerAttribute;
    }
}
