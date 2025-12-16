package ru.tinkoff.core.tinkoffId;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TinkoffPartnerApiService.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
final class n extends N implements Y41.l<String, Integer> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f437046l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar) {
        super(1);
        this.f437046l = oVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer invoke(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r2 = (java.lang.String) r2
            ru.tinkoff.core.tinkoffId.o r0 = r1.f437046l
            r0.getClass()
            int r0 = r2.hashCode()
            switch(r0) {
                case -2054838772: goto L51;
                case -1562584233: goto L46;
                case -847806252: goto L3b;
                case -632018157: goto L30;
                case -190904121: goto L25;
                case 1330404726: goto L1a;
                case 2117379143: goto Lf;
                default: goto Le;
            }
        Le:
            goto L59
        Lf:
            java.lang.String r0 = "invalid_request"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L18
            goto L59
        L18:
            r2 = 1
            goto L5d
        L1a:
            java.lang.String r0 = "unauthorized_client"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L23
            goto L59
        L23:
            r2 = 4
            goto L5d
        L25:
            java.lang.String r0 = "unsupported_grant_type"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2e
            goto L59
        L2e:
            r2 = 5
            goto L5d
        L30:
            java.lang.String r0 = "invalid_client"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L39
            goto L59
        L39:
            r2 = 2
            goto L5d
        L3b:
            java.lang.String r0 = "invalid_grant"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L44
            goto L59
        L44:
            r2 = 3
            goto L5d
        L46:
            java.lang.String r0 = "limit_exceeded"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4f
            goto L59
        L4f:
            r2 = 7
            goto L5d
        L51:
            java.lang.String r0 = "server_error"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5c
        L59:
            r2 = 8
            goto L5d
        L5c:
            r2 = 6
        L5d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.tinkoff.core.tinkoffId.n.invoke(java.lang.Object):java.lang.Object");
    }
}
