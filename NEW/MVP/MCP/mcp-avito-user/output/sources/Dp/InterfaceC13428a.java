package Dp;

import Y61.k;
import Y61.l;
import android.net.Uri;
import com.avito.android.comfortable_deal.api.model.AgentRoomDealResponse;
import com.avito.android.comfortable_deal.deal.item.callrecord.PlaySpeed;
import com.avito.android.comfortable_deal.repository.model.CommentsFilter;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DealItemListBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDp/a;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC13428a {

    /* compiled from: DealItemListBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Dp.a$a, reason: collision with other inner class name */
    public static final class C0195a {
    }

    @k
    ArrayList a(@k List list, @k PlaySpeed playSpeed);

    @k
    ArrayList b(@k List list);

    @k
    ArrayList c(@k List list);

    @k
    ArrayList d(@k List list, @k Uri uri);

    @k
    ArrayList e(@k List list);

    @k
    kotlin.collections.builders.b f(@k AgentRoomDealResponse agentRoomDealResponse, @l List list, @l DeepLink deepLink, boolean z12);

    @k
    ArrayList g(@k List list, @k CommentsFilter commentsFilter);

    @k
    ArrayList h(@k List list, @k List list2);

    @k
    ArrayList i(@k List list);
}
