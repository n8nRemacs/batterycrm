package com.avito.android.short_term_rent.utils;

import android.os.Parcelable;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItem;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItemSize;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BadgeRowsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/utils/b;", "Lcom/avito/android/short_term_rent/utils/a;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.short_term_rent.utils.a {

    /* compiled from: BadgeRowsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[RetroBadgeItemSize.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<RetroBadgeItemSize> creator = RetroBadgeItemSize.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public b() {
    }

    @Override // com.avito.android.short_term_rent.utils.a
    @Y61.k
    public final ArrayList a(@Y61.k Y41.l lVar, @Y61.k List list) {
        RetroBadgeItem retroBadgeItem;
        RetroBadgeItem retroBadgeItem2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        loop0: while (true) {
            retroBadgeItem = null;
            while (it.hasNext()) {
                retroBadgeItem2 = (RetroBadgeItem) lVar.invoke(it.next());
                int iOrdinal = retroBadgeItem2.f283045b.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        if (retroBadgeItem != null) {
                            arrayList.add(C42745f0.U(retroBadgeItem, null));
                            retroBadgeItem = null;
                        }
                        arrayList.add(Collections.singletonList(retroBadgeItem2));
                    }
                } else if (retroBadgeItem == null) {
                    retroBadgeItem = retroBadgeItem2;
                }
            }
            arrayList.add(C42745f0.U(retroBadgeItem, retroBadgeItem2));
        }
        if (retroBadgeItem != null) {
            arrayList.add(C42745f0.U(retroBadgeItem, null));
        }
        return arrayList;
    }
}
