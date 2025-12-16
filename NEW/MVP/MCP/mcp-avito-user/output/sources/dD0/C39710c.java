package dd0;

import Y61.k;
import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBar;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBarData;
import com.avito.android.progress_info_toast_bar.presenter.ProgressInfoToastBarPresenter;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ProgressInfoToastBarAnalyticsFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldd0/c;", "Ldd0/b;", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dd0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C39710c implements InterfaceC39709b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f393980a;

    /* compiled from: ProgressInfoToastBarAnalyticsFactoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dd0.c$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ProgressInfoToastBarPresenter.RequestType.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProgressInfoToastBarPresenter.RequestType requestType = ProgressInfoToastBarPresenter.RequestType.f231550b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public C39710c(@k InterfaceC28373a interfaceC28373a) {
        this.f393980a = interfaceC28373a;
    }

    @Override // dd0.InterfaceC39709b
    @k
    public final InterfaceC39708a a(@k ProgressInfoToastBarData progressInfoToastBarData) {
        Parcelable.Creator<ProgressInfoToastBar.InitialFlow> creator = ProgressInfoToastBar.InitialFlow.CREATOR;
        int iOrdinal = progressInfoToastBarData.f231498g.ordinal();
        InterfaceC28373a interfaceC28373a = this.f393980a;
        if (iOrdinal == 0) {
            return new C39714g(interfaceC28373a);
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        return new C39713f(interfaceC28373a, progressInfoToastBarData.f231497f, Integer.valueOf(progressInfoToastBarData.f231494c));
    }
}
