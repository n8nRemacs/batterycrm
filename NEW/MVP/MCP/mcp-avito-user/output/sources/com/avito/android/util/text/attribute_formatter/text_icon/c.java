package com.avito.android.util.text.attribute_formatter.text_icon;

import Y61.k;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.TextIconAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TextIconAttributeFormatterV1.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/text/attribute_formatter/text_icon/c;", "Lcom/avito/android/util/text/attribute_formatter/text_icon/a;", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IK0.a f319065a;

    public c(@k IK0.a aVar) {
        this.f319065a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // CK0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r16, PK0.n r17, boolean r18, android.text.Editable r19, int r20, java.lang.String r21, com.avito.android.remote.model.text.Attribute r22, com.avito.android.remote.model.text.AttributedText r23) {
        /*
            r15 = this;
            r2 = r16
            r7 = r19
            r5 = r20
            r1 = r22
            com.avito.android.remote.model.text.TextIconAttribute r1 = (com.avito.android.remote.model.text.TextIconAttribute) r1
            java.lang.Integer r0 = r1.getTextIconStyle()
            r3 = 0
            if (r0 == 0) goto L22
            int r0 = r0.intValue()
            if (r2 == 0) goto L1c
            java.lang.String r0 = com.avito.android.lib.util.f.p(r0, r2)
            goto L1d
        L1c:
            r0 = r3
        L1d:
            if (r0 != 0) goto L20
            goto L22
        L20:
            r4 = r0
            goto L32
        L22:
            if (r2 == 0) goto L2d
            java.lang.String r0 = r1.getTitle()
            java.lang.String r0 = com.avito.android.lib.util.f.o(r2, r0)
            goto L2e
        L2d:
            r0 = r3
        L2e:
            if (r0 != 0) goto L20
            r8 = r15
            goto L92
        L32:
            int r0 = r21.length()
            int r0 = r0 + r5
            r7.replace(r5, r0, r4)
            java.util.Map r0 = r23.getClickListeners()
            java.lang.String r6 = r1.getName()
            java.lang.Object r0 = r0.get(r6)
            r10 = r0
            com.avito.android.remote.model.text.OnClickListener r10 = (com.avito.android.remote.model.text.OnClickListener) r10
            if (r10 == 0) goto L59
            com.avito.android.util.text.attribute_formatter.text_icon.b r3 = new com.avito.android.util.text.attribute_formatter.text_icon.b
            java.lang.String r13 = "onClick()V"
            r14 = 0
            r9 = 0
            java.lang.Class<com.avito.android.remote.model.text.OnClickListener> r11 = com.avito.android.remote.model.text.OnClickListener.class
            java.lang.String r12 = "onClick"
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
        L59:
            PK0.j r0 = new PK0.j
            r0.<init>(r3)
            int r3 = r4.length()
            int r3 = r3 + r5
            OK0.e r6 = new OK0.e
            r6.<init>(r5, r3, r0)
            com.avito.android.util.Z0.a(r7, r6)
            int r0 = r4.length()
            int r6 = r0 + r5
            r8 = r15
            IK0.a r0 = r8.f319065a
            r2 = r16
            r3 = r18
            r5 = r20
            java.util.ArrayList r0 = r0.a(r1, r2, r3, r4, r5, r6)
            java.util.Iterator r0 = r0.iterator()
        L82:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L92
            java.lang.Object r1 = r0.next()
            OK0.e r1 = (OK0.e) r1
            com.avito.android.util.Z0.a(r7, r1)
            goto L82
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.util.text.attribute_formatter.text_icon.c.a(android.content.Context, PK0.n, boolean, android.text.Editable, int, java.lang.String, com.avito.android.remote.model.text.Attribute, com.avito.android.remote.model.text.AttributedText):void");
    }

    @Override // CK0.a
    public final boolean b(@k Attribute attribute) {
        return attribute instanceof TextIconAttribute;
    }
}
