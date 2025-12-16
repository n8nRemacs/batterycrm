package com.avito.android.feedback_adverts;

import android.net.Uri;
import com.avito.android.C35995v2;
import com.avito.android.feedback_adverts.g;
import com.avito.android.feedback_adverts.h;
import com.avito.android.remote.feedback.FeedbackAdvertItem;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35837l2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.api.entity.Images;
import ru.avito.messenger.api.entity.body.item.Item;

/* compiled from: FeedbackAdvertsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lru/avito/messenger/api/entity/body/item/Item;", "items", "Lcom/avito/android/feedback_adverts/g$c;", "apply", "(Ljava/util/List;)Lcom/avito/android/feedback_adverts/g$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.c f157838b;

    public k(h.c cVar) {
        this.f157838b = cVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        C35995v2 c35995v2 = this.f157838b.f157833d;
        List<Item> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (Item item : list2) {
            String id2 = item.getId();
            String title = item.getTitle();
            String formattedPrice = item.getFormattedPrice();
            String location = item.getLocation();
            Images images = item.getImages();
            List listSingletonList = null;
            if (images != null) {
                Map<String, Uri> variants = images.getImage().getVariants();
                LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(variants.size()));
                Iterator<T> it = variants.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(C35837l2.a((String) entry.getKey()), entry.getValue());
                }
                LinkedHashMap linkedHashMapB = C35755b0.b(linkedHashMap);
                Image image = !linkedHashMapB.isEmpty() ? new Image(linkedHashMapB) : null;
                if (image != null) {
                    listSingletonList = Collections.singletonList(image);
                }
            }
            arrayList.add(new FeedbackAdvertItem(id2, title, formattedPrice, location, listSingletonList));
        }
        return new g.c.C4611c(c35995v2, new g.b(arrayList, list.size() == 20), null, 4, null);
    }
}
