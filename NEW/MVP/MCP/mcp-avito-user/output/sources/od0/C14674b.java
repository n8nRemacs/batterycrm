package Od0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.historical_suggests.model.AddressType;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.analytics.events.AddressChoiceType;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: HistoricalSuggestsAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOd0/b;", "LOd0/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Od0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C14674b implements InterfaceC14673a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC33535v f12438a;

    /* compiled from: HistoricalSuggestsAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Od0.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12439a;

        static {
            int[] iArr = new int[AddressType.values().length];
            try {
                AddressType addressType = AddressType.f161963b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AddressType addressType2 = AddressType.f161963b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12439a = iArr;
        }
    }

    @Inject
    public C14674b(@k InterfaceC33535v interfaceC33535v) {
        this.f12438a = interfaceC33535v;
    }

    @Override // Od0.InterfaceC14673a
    public final void a(@k AddressParameter.Value value, @l AddressType addressType) {
        AddressChoiceType addressChoiceType;
        int i12 = addressType == null ? -1 : a.f12439a[addressType.ordinal()];
        if (i12 == -1) {
            addressChoiceType = AddressChoiceType.f232211c;
        } else if (i12 == 1) {
            addressChoiceType = AddressChoiceType.f232212d;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            addressChoiceType = AddressChoiceType.f232215g;
        }
        this.f12438a.n0(addressChoiceType, value);
    }

    @Override // Od0.InterfaceC14673a
    public final void b(@k AddressParameter.Value value) {
        this.f12438a.n0(AddressChoiceType.f232211c, value);
    }

    @Override // Od0.InterfaceC14673a
    public final void c(@k AddressParameter.Value value) {
        this.f12438a.n0(AddressChoiceType.f232216h, value);
    }
}
