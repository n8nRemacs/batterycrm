package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper;

import Tv.C15410a;
import Tv.InterfaceC15412c;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.delivery_tarifikator.domain.Y;
import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.AlertReason;
import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: AlertDialogDataMapper.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/mapper/b;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/mapper/a;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Sv.h
/* loaded from: classes12.dex */
public final class b implements com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f135682a;

    /* compiled from: AlertDialogDataMapper.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/mapper/b$a;", "", "<init>", "()V", "", "DISPLAYED_LOCATIONS_NAME_COUNT", "I", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AlertDialogDataMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C4105b {
        static {
            int[] iArr = new int[AlertReason.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AlertReason alertReason = AlertReason.f135635b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: AlertDialogDataMapper.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LOv/d;", "it", "", "invoke", "(LOv/d;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Ov.d, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f135683l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(Ov.d dVar) {
            return dVar.f12681b;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@Y61.k Context context) {
        this.f135682a = context;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper.a
    @Y61.k
    public final C15410a a(@Y61.k TarifikatorMainInternalAction.ShowAlertDialog showAlertDialog) {
        int i12;
        int i13;
        int i14;
        AlertReason alertReason = showAlertDialog.f135647b;
        int iOrdinal = alertReason.ordinal();
        if (iOrdinal == 0) {
            i12 = R.string.unsaved_changes_exit_dialog_title;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.string.unsaved_changes_refresh_dialog_title;
        }
        int iOrdinal2 = alertReason.ordinal();
        if (iOrdinal2 == 0) {
            i13 = R.string.unsaved_changes_exit_dialog_positive;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = R.string.unsaved_changes_refresh_dialog_positive;
        }
        int iOrdinal3 = alertReason.ordinal();
        if (iOrdinal3 == 0) {
            i14 = R.string.unsaved_changes_exit_dialog_negative;
        } else {
            if (iOrdinal3 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i14 = R.string.unsaved_changes_refresh_dialog_negative;
        }
        Context context = this.f135682a;
        return new C15410a(context.getString(i12), context.getString(R.string.unsaved_changes_dialog_subtitle), context.getString(i13), context.getString(i14), showAlertDialog.f135648c);
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.mapper.a
    @Y61.k
    public final C15410a b(@Y61.k TarifikatorMainInternalAction.ShowDeleteTariffDialog showDeleteTariffDialog) {
        Y y12 = showDeleteTariffDialog.f135651d;
        boolean z12 = y12 instanceof Y.b;
        Context context = this.f135682a;
        if (!z12) {
            if (L.f(y12, Y.a.f135265a)) {
                return new C15410a(context.getString(R.string.custom_tariff_delete_dialog_title), null, context.getString(R.string.custom_tariff_delete_dialog_positive), context.getString(R.string.custom_tariff_delete_dialog_negative), InterfaceC15412c.q.a(showDeleteTariffDialog.f135649b), 2, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        String string = context.getString(R.string.custom_tariff_delete_reject_title);
        Y.b bVar = (Y.b) y12;
        String strO = C42745f0.O(C42745f0.E0(bVar.f135266a, 5), ", ", null, null, c.f135683l, 30);
        int size = bVar.f135266a.size();
        if (size > 5) {
            strO = context.getString(R.string.custom_tariff_used_in_many_regions, strO);
        }
        return new C15410a(string, context.getResources().getQuantityString(R.plurals.custom_tariff_used_in_current_settings_delete_reject_description, size, Integer.valueOf(size), strO, showDeleteTariffDialog.f135650c), null, null, null, 28, null);
    }
}
