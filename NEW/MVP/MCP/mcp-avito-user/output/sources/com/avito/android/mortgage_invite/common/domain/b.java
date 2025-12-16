package com.avito.android.mortgage_invite.common.domain;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import g20.C40522c;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ContactInfoRemoteValidationMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/common/domain/b;", "Lcom/avito/android/mortgage_invite/common/domain/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.mortgage_invite.common.domain.a
    @k
    public final kotlin.collections.builders.d a(@k List list) {
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C40522c c40522c = (C40522c) it.next();
            ContactInfoFieldId.a aVar = ContactInfoFieldId.f205524b;
            String fieldName = c40522c.getFieldName();
            aVar.getClass();
            ContactInfoFieldId contactInfoFieldId = L.f(fieldName, "fullName") ? ContactInfoFieldId.f205532j : L.f(fieldName, "phone") ? ContactInfoFieldId.f205533k : null;
            if (contactInfoFieldId != null && c40522c.getErrMessage() != null) {
                dVar.put(contactInfoFieldId, com.avito.android.printable_text.b.f(c40522c.getErrMessage()));
            }
        }
        return dVar.b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    @Override // com.avito.android.mortgage_invite.common.domain.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.collections.builders.d b(@Y61.k java.util.List r5) {
        /*
            r4 = this;
            kotlin.collections.builders.d r0 = new kotlin.collections.builders.d
            r0.<init>()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        Lb:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r5.next()
            k20.c r1 = (k20.C42479c) r1
            com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId$a r2 = com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId.f205524b
            java.lang.String r3 = r1.getFieldName()
            r2.getClass()
            if (r3 == 0) goto L65
            int r2 = r3.hashCode()
            switch(r2) {
                case -1459599807: goto L59;
                case -818219584: goto L4d;
                case 96619420: goto L42;
                case 106642798: goto L36;
                case 132835675: goto L2a;
                default: goto L29;
            }
        L29:
            goto L65
        L2a:
            java.lang.String r2 = "firstName"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L33
            goto L65
        L33:
            com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId r2 = com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId.f205527e
            goto L66
        L36:
            java.lang.String r2 = "phone"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L3f
            goto L65
        L3f:
            com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId r2 = com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId.f205530h
            goto L66
        L42:
            java.lang.String r2 = "email"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L65
            com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId r2 = com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId.f205531i
            goto L66
        L4d:
            java.lang.String r2 = "middleName"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L56
            goto L65
        L56:
            com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId r2 = com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId.f205528f
            goto L66
        L59:
            java.lang.String r2 = "lastName"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L62
            goto L65
        L62:
            com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId r2 = com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId.f205529g
            goto L66
        L65:
            r2 = 0
        L66:
            if (r2 == 0) goto Lb
            java.lang.String r3 = r1.getErrMessage()
            if (r3 == 0) goto Lb
            java.lang.String r1 = r1.getErrMessage()
            com.avito.android.printable_text.PrintableText r1 = com.avito.android.printable_text.b.f(r1)
            r0.put(r2, r1)
            goto Lb
        L7a:
            kotlin.collections.builders.d r5 = r0.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage_invite.common.domain.b.b(java.util.List):kotlin.collections.builders.d");
    }
}
