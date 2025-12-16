package com.avito.android.wallet.history.mvi.components;

import GO0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.x;
import com.avito.android.wallet.history.generated.api.get_wallet_history_v_2.HistoryItemV2;
import com.avito.android.wallet.history.mvi.remote.dto.WalletHistoryItemStatus;
import com.avito.android.wallet.history.mvi.remote.dto.WalletHistoryItemType;
import java.util.List;
import java.util.ListIterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: WalletHistoryItemsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/history/mvi/components/k;", "", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x f327603a;

    /* compiled from: WalletHistoryItemsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f327604a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f327605b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f327606c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f327607d;

        static {
            int[] iArr = new int[WalletHistoryItemType.values().length];
            try {
                iArr[WalletHistoryItemType.OPERATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletHistoryItemType.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f327604a = iArr;
            int[] iArr2 = new int[HistoryItemV2.Type.values().length];
            try {
                iArr2[HistoryItemV2.Type.Operation.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[HistoryItemV2.Type.Info.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f327605b = iArr2;
            int[] iArr3 = new int[WalletHistoryItemStatus.values().length];
            try {
                iArr3[WalletHistoryItemStatus.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[WalletHistoryItemStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[WalletHistoryItemStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f327606c = iArr3;
            int[] iArr4 = new int[HistoryItemV2.Status.values().length];
            try {
                iArr4[HistoryItemV2.Status.Success.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[HistoryItemV2.Status.Failed.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[HistoryItemV2.Status.Pending.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f327607d = iArr4;
        }
    }

    @Inject
    public k(@Y61.k x xVar) {
        this.f327603a = xVar;
    }

    public static List a(List list) {
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!(((GO0.b) listIterator.previous()) instanceof b.a)) {
                    return C42745f0.E0(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return C42784z0.f406748b;
    }
}
