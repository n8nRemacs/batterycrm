package com.avito.android.vas_planning.domain;

import android.content.res.Resources;
import bM0.C25529a;
import bM0.C25531c;
import com.avito.android.J0;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.vas_planning.model.VasAdvantage;
import com.avito.android.vas_planning.model.VasButton;
import com.avito.android.vas_planning.model.VasPlannerState;
import com.avito.android.vas_planning.model.VasPlanningItem;
import com.avito.android.vas_planning.remote.model.Action;
import com.avito.android.vas_planning.remote.model.VasRadioType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: VasPlannerConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning/domain/f;", "Lcom/avito/android/vas_planning/domain/e;", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f322326a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final J0 f322327b;

    /* compiled from: VasPlannerConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/vas_planning/domain/f$a;", "", "<init>", "()V", "", "DEPENDENT_ITEM_ID", "Ljava/lang/String;", "RADIO_ITEM_ID", "TITLE_ITEM_ID", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VasPlannerConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f322328a;

        static {
            int[] iArr = new int[VasRadioType.values().length];
            try {
                iArr[VasRadioType.Now.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VasRadioType.Plan.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f322328a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f(@Y61.k Resources resources, @Y61.k J0 j02) {
        this.f322326a = resources;
        this.f322327b = j02;
    }

    @Override // com.avito.android.vas_planning.domain.e
    @Y61.k
    public final VasPlannerState a(@Y61.k C25529a c25529a) throws Resources.NotFoundException {
        Object next;
        DeepLink noMatchLink;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("title_item_");
        J0 j02 = this.f322327b;
        arrayList.add(new VasPlanningItem.VasPlanningTitle(com.avito.android.bxcontent.mvi.entity.f.k(j02, sb2), true, 0, c25529a.getTitle(), 4, null));
        List<C25531c> listA = c25529a.a();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (true) {
            VasPlanningItem.VasPlanningRadioItem vasPlanningRadioItem = null;
            if (!it.hasNext()) {
                break;
            }
            C25531c c25531c = (C25531c) it.next();
            VasRadioType type = c25531c.getType();
            int i12 = type == null ? -1 : b.f322328a[type.ordinal()];
            if (i12 == 1) {
                vasPlanningRadioItem = new VasPlanningItem.VasPlanningRadioItem(com.avito.android.bxcontent.mvi.entity.f.k(j02, new StringBuilder("radio_item_")), true, VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType.f322437b, c25531c.getTitle(), c25531c.getDescription(), c25531c.getLabel(), c25531c.getAction().getUri(), c25531c.getAction().getTitle(), true, C42784z0.f406748b);
            } else if (i12 == 2) {
                vasPlanningRadioItem = new VasPlanningItem.VasPlanningRadioItem(com.avito.android.bxcontent.mvi.entity.f.k(j02, new StringBuilder("radio_item_")), true, VasPlanningItem.VasPlanningRadioItem.VasPlanningRadioType.f322438c, c25531c.getTitle(), c25531c.getDescription(), c25531c.getLabel(), c25531c.getAction().getUri(), c25531c.getAction().getTitle(), false, Collections.singletonList(new VasPlanningItem.VasPlanningDateTime(com.avito.android.bxcontent.mvi.entity.f.k(j02, new StringBuilder("dependent_item_")), false, null, null, false, true, 30, null)));
            }
            if (vasPlanningRadioItem != null) {
                arrayList2.add(vasPlanningRadioItem);
            }
        }
        arrayList.addAll(arrayList2);
        Action planningAdvantage = c25529a.getPlanningAdvantage();
        VasAdvantage vasAdvantage = (planningAdvantage == null || planningAdvantage.getUri() == null) ? null : new VasAdvantage(c25529a.getPlanningAdvantage().getTitle(), c25529a.getPlanningAdvantage().getUri());
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            VasPlanningItem vasPlanningItem = (VasPlanningItem) next;
            if ((vasPlanningItem instanceof VasPlanningItem.VasPlanningRadioItem) && ((VasPlanningItem.VasPlanningRadioItem) vasPlanningItem).f322435j) {
                break;
            }
        }
        VasPlanningItem.VasPlanningRadioItem vasPlanningRadioItem2 = next instanceof VasPlanningItem.VasPlanningRadioItem ? (VasPlanningItem.VasPlanningRadioItem) next : null;
        String string = this.f322326a.getString(R.string.vas_planning_default_continue_button_title);
        if (vasPlanningRadioItem2 == null || (noMatchLink = vasPlanningRadioItem2.f322433h) == null) {
            noMatchLink = new NoMatchLink();
        }
        return new VasPlannerState(arrayList, vasAdvantage, new VasButton(string, noMatchLink, vasPlanningRadioItem2 != null ? vasPlanningRadioItem2.f322429d : null));
    }
}
