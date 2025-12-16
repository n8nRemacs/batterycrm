package JM;

import Y61.l;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.B;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImportantAddressesLoadingRenderer.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJM/d;", "Lcom/avito/android/deeplink_handler/view/a$g;", "<init>", "()V", "_avito_important-addresses_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@B
/* loaded from: classes14.dex */
public final class d implements a.g {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Button f8926b;

    @Inject
    public d() {
    }

    @Override // com.avito.android.deeplink_handler.view.a.g
    public final void g(@l com.avito.android.deeplink_handler.handler.bundle.a aVar, boolean z12) {
        Button button = this.f8926b;
        if (button != null) {
            button.setMinimumWidth(z12 ? D6.s(button) : 0);
            button.setLoading(z12);
        }
    }
}
