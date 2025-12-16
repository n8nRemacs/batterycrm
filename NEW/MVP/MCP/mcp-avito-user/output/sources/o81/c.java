package O81;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import hw.InterfaceC41178c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PaymentMethodItem.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LO81/c;", "Lcom/avito/conveyor_item/a;", "LO81/a;", "LO81/b;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f12031b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12032c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f12033d;

    public c(String str, boolean z12, String str2, DeepLink deepLink, C42822w c42822w) {
        this.f12031b = str;
        this.f12032c = z12;
        this.f12033d = str2;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322716b() {
        return getF12031b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF12031b() {
        return this.f12031b;
    }
}
