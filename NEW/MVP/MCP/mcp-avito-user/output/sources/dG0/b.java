package DG0;

import Y61.k;
import Y61.l;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.L;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.universal_transaction.navigation.TransactionFragmentData;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TransactionIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDG0/b;", "LDG0/a;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final L f3126a;

    @Inject
    public b(@k L l12) {
        this.f3126a = l12;
    }

    @Override // DG0.a
    @k
    public final Intent a(@k String str, @k String str2, @k String str3, @l String str4, @l String str5, @k NavigationTabSetItem navigationTabSetItem) {
        return this.f3126a.d(new TransactionFragmentData(str, str3, str2, str4, str5, navigationTabSetItem));
    }
}
