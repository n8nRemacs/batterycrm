package com.avito.android.comfortable_deal.comment.di;

import Y41.l;
import Y61.k;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.comfortable_deal.comment.CommentDialog;
import com.avito.android.comfortable_deal.comment.model.CommentArguments;
import com.avito.android.di.B;
import h31.d;
import kotlin.G0;
import kotlin.Metadata;
import mp.InterfaceC44113a;

/* compiled from: CommentComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/comment/di/a;", "", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CommentComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/comment/di/a$a;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.comment.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC3546a {
        @k
        a a(@k com.avito.android.comfortable_deal.di.a aVar, @h31.b @k C28478k c28478k, @h31.b @k CommentArguments commentArguments, @h31.b @k l<? super InterfaceC44113a, G0> lVar);
    }

    void a(@k CommentDialog commentDialog);
}
