package com.avito.android.util.text.attribute_formatter.tooltip;

import OK0.e;
import PK0.n;
import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.util.q;
import com.avito.android.lib.util.y;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.util.C35835l0;
import com.avito.android.util.Z0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TooltipAttributeFormatterV1.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/util/text/attribute_formatter/tooltip/b;", "Lcom/avito/android/util/text/attribute_formatter/tooltip/a;", "<init>", "()V", "a", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.util.text.attribute_formatter.tooltip.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f319066a = 0;

    /* compiled from: TooltipAttributeFormatterV1.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/util/text/attribute_formatter/tooltip/b$a;", "", "<init>", "()V", "", "TOOLTIP_PLACEHOLDER", "Ljava/lang/String;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
        Drawable drawableH;
        TooltipAttribute tooltipAttribute = (TooltipAttribute) attribute;
        Integer numA = q.a(tooltipAttribute.getTitle());
        if (numA != null) {
            int iIntValue = numA.intValue();
            if (context == null || (drawableH = C35835l0.h(iIntValue, context)) == null) {
                return;
            }
            drawableH.setBounds(0, 0, drawableH.getIntrinsicWidth(), drawableH.getIntrinsicHeight());
            drawableH.setTint(C35835l0.d(R.attr.gray28, context));
            editable.replace(i12, str.length() + i12, " ");
            DeepLink deepLink = tooltipAttribute.getDeepLink();
            FK0.b bVar = new FK0.b(2, attributedText);
            boolean z13 = nVar == null || nVar.f12993g != null;
            int i13 = i12 + 1;
            Z0.a(editable, new e(i12, i13, new OK0.b(deepLink, bVar, z13)));
            Z0.a(editable, new e(i12, i13, new y(drawableH)));
        }
    }

    @Override // CK0.a
    public final boolean b(@k Attribute attribute) {
        return attribute instanceof TooltipAttribute;
    }
}
