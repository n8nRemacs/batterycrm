package Q81;

import Y61.k;
import kotlin.Metadata;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AsyncPhoneItemView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ81/a;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface a {

    /* compiled from: AsyncPhoneItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Q81.a$a, reason: collision with other inner class name */
    public static final class C0890a {
        public static void a(@k a aVar, boolean z12) {
            aVar.setPhoneLoadingState(z12 ? PhoneLoadingState.f430442c : PhoneLoadingState.f430441b);
        }
    }

    void Ii(boolean z12);

    void setPhoneLoadingState(@k PhoneLoadingState phoneLoadingState);
}
