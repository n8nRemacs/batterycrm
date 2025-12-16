package com.avito.android.rating_form.select_item.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.rating_form.select_item.RatingFormSelectItemArguments;
import com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction;
import com.avito.android.rating_form.y;
import com.avito.android.rating_ui.loading.RatingLoadingItem;
import fh0.C40423b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RatingFormSelectItemReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/select_item/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/rating_form/select_item/mvi/entity/RatingFormSelectItemInternalAction;", "Lfh0/b;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l implements u<RatingFormSelectItemInternalAction, C40423b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RatingFormSelectItemArguments f249110b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final y f249111c;

    /* compiled from: RatingFormSelectItemReducer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/select_item/mvi/l$a;", "", "<init>", "()V", "", "ADVERT_ITEMS_COUNT_SEARCH_INPUT_VISIBLE", "I", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public l(@Y61.k RatingFormSelectItemArguments ratingFormSelectItemArguments, @Y61.k y yVar) {
        this.f249110b = ratingFormSelectItemArguments;
        this.f249111c = yVar;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) obj;
            if (!(aVar instanceof RatingLoadingItem) && !(aVar instanceof com.avito.android.rating_form.select_item.adapter.loading_error.a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018a  */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.List] */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final fh0.C40423b a(com.avito.android.rating_form.select_item.mvi.entity.RatingFormSelectItemInternalAction r25, fh0.C40423b r26) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.select_item.mvi.l.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
