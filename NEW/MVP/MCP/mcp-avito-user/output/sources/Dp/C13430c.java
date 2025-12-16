package Dp;

import Ip.C14141a;
import Y61.k;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.deal.item.callrecord.PlaySpeed;
import com.avito.android.comfortable_deal.deal.item.commenttabs.CommentTab;
import com.avito.android.comfortable_deal.repository.model.CommentsFilter;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C;
import com.avito.android.util.C35793f6;
import dp.f;
import dp.g;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import up.C49088a;
import vp.C49363a;

/* compiled from: DealItemListBuilder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDp/c;", "LDp/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dp.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13430c implements InterfaceC13428a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C35793f6 f3461a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C14141a f3462b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C f3463c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.P f3464d;

    @Inject
    public C13430c(@k C35793f6 c35793f6, @k C14141a c14141a, @k C c12, @k com.avito.android.P p12) {
        this.f3461a = c35793f6;
        this.f3462b = c14141a;
        this.f3463c = c12;
        this.f3464d = p12;
    }

    public static LocalDateTime j(String str) {
        return LocalDateTime.ofInstant((Instant) DateTimeFormatter.ISO_OFFSET_DATE_TIME.parse(str, new C13429b(0)), ZoneId.of(TimeZone.getDefault().getID()));
    }

    public static boolean k(com.avito.conveyor_item.a aVar) {
        return (aVar instanceof com.avito.android.comfortable_deal.deal.item.commentplaceholder.c) || (aVar instanceof com.avito.android.comfortable_deal.deal.item.comment.d) || (aVar instanceof com.avito.android.comfortable_deal.deal.item.commenterror.c);
    }

    public static com.avito.android.comfortable_deal.deal.item.comment.d l(f fVar) {
        String id2 = fVar.getId();
        String id3 = fVar.getId();
        String id4 = fVar.getAuthor().getId();
        Image avatar = fVar.getAuthor().getAvatar();
        String name = fVar.getAuthor().getName();
        if (name == null) {
            name = "";
        }
        com.avito.android.comfortable_deal.deal.item.comment.a aVar = new com.avito.android.comfortable_deal.deal.item.comment.a(id4, avatar, name);
        LocalDateTime localDateTimeJ = j(fVar.getPublishedAt());
        String editedAt = fVar.getEditedAt();
        ArrayList arrayList = null;
        LocalDateTime localDateTimeJ2 = editedAt != null ? j(editedAt) : null;
        List<g> listE = fVar.e();
        if (listE != null) {
            List<g> list = listE;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            for (g gVar : list) {
                arrayList.add(new com.avito.android.comfortable_deal.deal.item.comment.e(gVar.getId(), gVar.getTitle(), gVar.getValue()));
            }
        }
        return new com.avito.android.comfortable_deal.deal.item.comment.d(id2, id3, aVar, localDateTimeJ, localDateTimeJ2, arrayList == null ? C42784z0.f406748b : arrayList, fVar.getComment());
    }

    @Override // Dp.InterfaceC13428a
    @k
    public final ArrayList a(@k List list, @k PlaySpeed playSpeed) {
        List<TV0.a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (TV0.a aVarA : list2) {
            if (aVarA instanceof C49088a) {
                aVarA = C49088a.a((C49088a) aVarA, null, playSpeed, 63);
            }
            arrayList.add(aVarA);
        }
        return arrayList;
    }

    @Override // Dp.InterfaceC13428a
    @k
    public final ArrayList b(@k List list) {
        List<TV0.a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (TV0.a aVarA : list2) {
            if (aVarA instanceof C49088a) {
                aVarA = C49088a.a((C49088a) aVarA, null, null, 95);
            }
            arrayList.add(aVarA);
        }
        return arrayList;
    }

    @Override // Dp.InterfaceC13428a
    @k
    public final ArrayList c(@k List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!L.f(((com.avito.conveyor_item.a) obj).getF121424b(), "mortgage_banner_item")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a c49363a = (com.avito.conveyor_item.a) it.next();
            if ((c49363a instanceof C49363a) && L.f(((C49363a) c49363a).f440966b, "digital_registration_item")) {
                C49363a c49363a2 = (C49363a) c49363a;
                c49363a = new C49363a(c49363a2.f440966b, c49363a2.f440968d, c49363a2.f440967c, true);
            }
            arrayList2.add(c49363a);
        }
        return arrayList2;
    }

    @Override // Dp.InterfaceC13428a
    @k
    public final ArrayList d(@k List list, @k Uri uri) {
        List<TV0.a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (TV0.a aVarA : list2) {
            if (aVarA instanceof C49088a) {
                aVarA = C49088a.a((C49088a) aVarA, uri, null, 95);
            }
            arrayList.add(aVarA);
        }
        return arrayList;
    }

    @Override // Dp.InterfaceC13428a
    @k
    public final ArrayList e(@k List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!k((com.avito.conveyor_item.a) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = arrayList2.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (((com.avito.conveyor_item.a) it.next()) instanceof com.avito.android.comfortable_deal.deal.item.commenttabs.f) {
                break;
            }
            i12++;
        }
        if (i12 >= 0) {
            arrayList2.add(i12 + 1, new com.avito.android.comfortable_deal.deal.item.commenterror.c());
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a4  */
    @Override // Dp.InterfaceC13428a
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.collections.builders.b f(@Y61.k com.avito.android.comfortable_deal.api.model.AgentRoomDealResponse r33, @Y61.l java.util.List r34, @Y61.l com.avito.android.deep_linking.links.DeepLink r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dp.C13430c.f(com.avito.android.comfortable_deal.api.model.AgentRoomDealResponse, java.util.List, com.avito.android.deep_linking.links.DeepLink, boolean):kotlin.collections.builders.b");
    }

    @Override // Dp.InterfaceC13428a
    @k
    public final ArrayList g(@k List list, @k CommentsFilter commentsFilter) {
        CommentTab commentTab;
        List<com.avito.conveyor_item.a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (com.avito.conveyor_item.a fVar : list2) {
            if (fVar instanceof com.avito.android.comfortable_deal.deal.item.commenttabs.f) {
                com.avito.android.comfortable_deal.deal.item.commenttabs.f fVar2 = (com.avito.android.comfortable_deal.deal.item.commenttabs.f) fVar;
                int iOrdinal = commentsFilter.ordinal();
                if (iOrdinal == 0) {
                    commentTab = CommentTab.f121308c;
                } else if (iOrdinal == 1) {
                    commentTab = CommentTab.f121309d;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    commentTab = CommentTab.f121310e;
                }
                fVar = new com.avito.android.comfortable_deal.deal.item.commenttabs.f(fVar2.f121320b, fVar2.f121321c, commentTab);
            }
            arrayList.add(fVar);
        }
        return arrayList;
    }

    @Override // Dp.InterfaceC13428a
    @k
    public final ArrayList h(@k List list, @k List list2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!k((com.avito.conveyor_item.a) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = arrayList2.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (((com.avito.conveyor_item.a) it.next()) instanceof com.avito.android.comfortable_deal.deal.item.commenttabs.f) {
                break;
            }
            i12++;
        }
        if (i12 >= 0) {
            int i13 = i12 + 1;
            List list3 = list2;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList3.add(l((f) it2.next()));
            }
            arrayList2.addAll(i13, arrayList3);
        }
        return arrayList2;
    }

    @Override // Dp.InterfaceC13428a
    @k
    public final ArrayList i(@k List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!k((com.avito.conveyor_item.a) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = arrayList2.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (((com.avito.conveyor_item.a) it.next()) instanceof com.avito.android.comfortable_deal.deal.item.commenttabs.f) {
                break;
            }
            i12++;
        }
        if (i12 >= 0) {
            int i13 = i12 + 1;
            ArrayList arrayList3 = new ArrayList(3);
            for (int i14 = 0; i14 < 3; i14++) {
                arrayList3.add(new com.avito.android.comfortable_deal.deal.item.commentplaceholder.c(AK.c.g(i14, "comment_placeholder_item")));
            }
            arrayList2.addAll(i13, arrayList3);
        }
        return arrayList2;
    }
}
