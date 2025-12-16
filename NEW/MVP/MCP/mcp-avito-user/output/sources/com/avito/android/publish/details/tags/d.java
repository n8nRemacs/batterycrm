package com.avito.android.publish.details.tags;

import com.avito.android.publish.details.tags.e;
import com.avito.android.remote.model.publish.BubbleSuggest;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import com.avito.android.ui.widget.tagged_input.TagItem;
import com.avito.android.ui.widget.tagged_input.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import l41.o;

/* compiled from: PublishTagsViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00000\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/remote/model/publish/BubbleSuggest;", "bubbles", "Lkotlin/Q;", "", "Lcom/avito/android/ui/widget/tagged_input/TagItem;", "apply", "(Ljava/util/List;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e.d f235021b;

    public d(e.d dVar) {
        this.f235021b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        TagItem.Type type;
        String str = this.f235021b.f235028a;
        List<BubbleSuggest> list = (List) obj;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (BubbleSuggest bubbleSuggest : list) {
            String title = bubbleSuggest.getTitle();
            SuggestAnalyticsEvent suggestAnalyticsEvent = null;
            TagItem.Value value = new TagItem.Value(bubbleSuggest.getReplacementText(), false, 2, null);
            int i12 = b.a.f304704a[bubbleSuggest.getType().ordinal()];
            if (i12 == 1) {
                type = TagItem.Type.f304697b;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                type = TagItem.Type.f304698c;
            }
            List<SuggestAction> actions = bubbleSuggest.getActions();
            if (actions != null) {
                ArrayList arrayList2 = new ArrayList();
                for (T t12 : actions) {
                    if (t12 instanceof SuggestAnalyticsEvent) {
                        arrayList2.add(t12);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((SuggestAnalyticsEvent) next).getId() == 4448) {
                        suggestAnalyticsEvent = next;
                        break;
                    }
                }
                suggestAnalyticsEvent = suggestAnalyticsEvent;
            }
            arrayList.add(new TagItem(title, value, type, suggestAnalyticsEvent));
        }
        return new Q(str, arrayList);
    }
}
