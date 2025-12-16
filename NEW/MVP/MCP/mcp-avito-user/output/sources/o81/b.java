package O81;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import hw.InterfaceC41178c;
import kotlin.Metadata;
import ru.avito.component.payments.method.PaymentLabel;

/* compiled from: PaymentMethodItem.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LO81/b;", "LO81/c;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b extends c {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f12026e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final PaymentLabel f12027f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f12028g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f12029h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f12030i;

    public b(@k String str, @k String str2, @k DeepLink deepLink, @k String str3, @k PaymentLabel paymentLabel, boolean z12, @k String str4, @l String str5) {
        super(str, true, str2, deepLink, null);
        this.f12026e = str3;
        this.f12027f = paymentLabel;
        this.f12028g = z12;
        this.f12029h = str4;
        this.f12030i = str5;
    }
}
