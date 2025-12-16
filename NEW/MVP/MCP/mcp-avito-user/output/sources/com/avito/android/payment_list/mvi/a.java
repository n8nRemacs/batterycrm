package com.avito.android.payment_list.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.gig.payment_list.generated.api.get_gig_worker_payments.GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem;
import com.avito.android.payment_list.ui.list.shift_item.PaymentItem;
import com.avito.android.payment_list.ui.list.title_item.PaymentTitleItem;
import fG.C40286a;
import fG.C40287b;
import fG.C40288c;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: GetGigWorkerPaymentsResponseToItemsMapper.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/payment_list/mvi/a;", "Lkotlin/Function1;", "LfG/c;", "", "Lcom/avito/conveyor_item/a;", "<init>", "()V", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements Y41.l<C40288c, List<? extends com.avito.conveyor_item.a>> {

    /* compiled from: GetGigWorkerPaymentsResponseToItemsMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.payment_list.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C6447a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f214980a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f214981b;

        static {
            int[] iArr = new int[GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem.Icon.values().length];
            try {
                iArr[GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem.Icon.Sbp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem.Icon.Card.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f214980a = iArr;
            int[] iArr2 = new int[GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem.Status.values().length];
            try {
                iArr2[GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem.Status.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem.Status.Failed.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f214981b = iArr2;
        }
    }

    @Inject
    public a() {
    }

    @Y61.k
    public static ArrayList a(@Y61.k C40288c c40288c) {
        PaymentItem.IconType iconType;
        PaymentItem.Status status;
        PaymentItem.Status status2;
        PaymentItem.IconType iconType2;
        ArrayList arrayList = new ArrayList();
        List<C40287b> listB = c40288c.b();
        if (listB != null) {
            for (C40287b c40287b : listB) {
                String title = c40287b.getTitle();
                if (title != null) {
                    arrayList.add(new PaymentTitleItem(String.valueOf(title.hashCode()), title));
                }
                for (GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem getGigWorkerPaymentsRespSuccessDaysItemPaymentsItem : c40287b.a()) {
                    String title2 = getGigWorkerPaymentsRespSuccessDaysItemPaymentsItem.getTitle();
                    String subtitle = getGigWorkerPaymentsRespSuccessDaysItemPaymentsItem.getSubtitle();
                    if (subtitle == null) {
                        subtitle = "";
                    }
                    String str = subtitle;
                    C40286a action = getGigWorkerPaymentsRespSuccessDaysItemPaymentsItem.getAction();
                    DeepLink uri = action != null ? action.getUri() : null;
                    GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem.Icon icon = getGigWorkerPaymentsRespSuccessDaysItemPaymentsItem.getIcon();
                    int i12 = icon == null ? -1 : C6447a.f214980a[icon.ordinal()];
                    if (i12 != -1) {
                        if (i12 == 1) {
                            iconType2 = PaymentItem.IconType.f215051b;
                        } else {
                            if (i12 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iconType2 = PaymentItem.IconType.f215052c;
                        }
                        iconType = iconType2;
                    } else {
                        iconType = null;
                    }
                    String logoUrl = getGigWorkerPaymentsRespSuccessDaysItemPaymentsItem.getLogoUrl();
                    String trailingText = getGigWorkerPaymentsRespSuccessDaysItemPaymentsItem.getTrailingText();
                    GetGigWorkerPaymentsRespSuccessDaysItemPaymentsItem.Status status3 = getGigWorkerPaymentsRespSuccessDaysItemPaymentsItem.getStatus();
                    int i13 = status3 == null ? -1 : C6447a.f214981b[status3.ordinal()];
                    if (i13 != -1) {
                        if (i13 == 1) {
                            status2 = PaymentItem.Status.f215055b;
                        } else {
                            if (i13 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            status2 = PaymentItem.Status.f215056c;
                        }
                        status = status2;
                    } else {
                        status = null;
                    }
                    arrayList.add(new PaymentItem(title2, str, uri, iconType, logoUrl, trailingText, status, String.valueOf(getGigWorkerPaymentsRespSuccessDaysItemPaymentsItem.hashCode())));
                }
            }
        }
        return arrayList;
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ List<? extends com.avito.conveyor_item.a> invoke(C40288c c40288c) {
        return a(c40288c);
    }
}
