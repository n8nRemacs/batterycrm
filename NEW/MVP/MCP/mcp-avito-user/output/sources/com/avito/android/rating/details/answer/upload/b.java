package com.avito.android.rating.details.answer.upload;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ReviewReplyConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/answer/upload/b;", "Lcom/avito/android/rating/details/answer/upload/a;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    @Override // com.avito.android.rating.details.answer.upload.a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.ratings.ReviewReply a(@Y61.k com.avito.android.remote.model.review_reply.ReviewReplyResult r14) {
        /*
            r13 = this;
            com.avito.android.ratings.ReviewReply r12 = new com.avito.android.ratings.ReviewReply
            java.lang.Long r1 = r14.getId()
            java.lang.String r2 = r14.getTitle()
            java.lang.String r3 = r14.getAnswerDate()
            com.avito.android.remote.model.Image r4 = r14.getAvatar()
            java.lang.String r5 = r14.getText()
            java.util.List r6 = r14.getImages()
            java.lang.Boolean r0 = r14.getIsShop()
            if (r0 == 0) goto L26
            boolean r0 = r0.booleanValue()
        L24:
            r7 = r0
            goto L28
        L26:
            r0 = 0
            goto L24
        L28:
            java.lang.String r0 = r14.getStatus()
            if (r0 == 0) goto L67
            int r8 = r0.hashCode()
            r9 = -2016287450(0xffffffff87d1e526, float:-3.1581506E-34)
            if (r8 == r9) goto L5b
            r9 = -1422950650(0xffffffffab2f7f06, float:-6.234877E-13)
            if (r8 == r9) goto L4f
            r9 = 568196142(0x21ddfc2e, float:1.5042294E-18)
            if (r8 == r9) goto L42
            goto L67
        L42:
            java.lang.String r8 = "declined"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L4b
            goto L67
        L4b:
            com.avito.android.ratings.ReviewReplyStatus r0 = com.avito.android.ratings.ReviewReplyStatus.f250521d
        L4d:
            r8 = r0
            goto L69
        L4f:
            java.lang.String r8 = "active"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L58
            goto L67
        L58:
            com.avito.android.ratings.ReviewReplyStatus r0 = com.avito.android.ratings.ReviewReplyStatus.f250520c
            goto L4d
        L5b:
            java.lang.String r8 = "moderation"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L64
            goto L67
        L64:
            com.avito.android.ratings.ReviewReplyStatus r0 = com.avito.android.ratings.ReviewReplyStatus.f250519b
            goto L4d
        L67:
            r0 = 0
            goto L4d
        L69:
            java.lang.String r9 = r14.getStatusText()
            java.lang.String r10 = r14.getRejectMessage()
            com.avito.android.deep_linking.links.DeepLink r11 = r14.getLink()
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating.details.answer.upload.b.a(com.avito.android.remote.model.review_reply.ReviewReplyResult):com.avito.android.ratings.ReviewReply");
    }
}
