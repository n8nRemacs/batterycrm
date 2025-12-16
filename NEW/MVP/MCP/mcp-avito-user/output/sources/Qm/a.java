package QM;

import C11.b;
import Y41.l;
import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.important_addresses_selection.domain.model.ImportantAddressesSelectionData;
import com.avito.android.important_addresses_selection.presentation.ImportantAddressesSelectionDialogFragment;
import cv.d;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ImportantAddressesSelectionComponent.kt */
@B
@C11.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LQM/a;", "", "a", "b", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: ImportantAddressesSelectionComponent.kt */
    @b.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQM/a$a;", "", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: QM.a$a, reason: collision with other inner class name */
    public interface InterfaceC0899a {
        @k
        a a(@k d dVar, @h31.b @k ImportantAddressesSelectionData importantAddressesSelectionData, @h31.b @k l<? super SM.a, G0> lVar, @h31.b @k C28478k c28478k, @h31.b @k Resources resources, @h31.b @k r rVar);
    }

    /* compiled from: ImportantAddressesSelectionComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQM/a$b;", "Lcom/avito/android/di/h;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @C11.c
    public interface b extends InterfaceC29971h {
        @k
        InterfaceC0899a Ni();
    }

    void a(@k ImportantAddressesSelectionDialogFragment importantAddressesSelectionDialogFragment);
}
