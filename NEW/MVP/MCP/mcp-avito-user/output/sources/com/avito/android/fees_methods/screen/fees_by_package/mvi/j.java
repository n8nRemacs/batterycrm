package com.avito.android.fees_methods.screen.fees_by_package.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fees_methods.generated.api.api_1_fees_by_package_get.OkResponseSuccessButton;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageInternalAction;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: FeesByPackageReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageInternalAction;", "Lcom/avito/android/fees_methods/screen/fees_by_package/mvi/entity/FeesByPackageState;", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements u<FeesByPackageInternalAction, FeesByPackageState> {

    /* compiled from: FeesByPackageReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f158062a;

        static {
            int[] iArr = new int[OkResponseSuccessButton.Style.values().length];
            try {
                iArr[OkResponseSuccessButton.Style.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OkResponseSuccessButton.Style.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f158062a = iArr;
        }
    }

    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final FeesByPackageState a(FeesByPackageInternalAction feesByPackageInternalAction, FeesByPackageState feesByPackageState) {
        ArrayList arrayList;
        FeesByPackageState.a aVar;
        FeesByPackageState.Button.Style style;
        FeesByPackageInternalAction feesByPackageInternalAction2 = feesByPackageInternalAction;
        FeesByPackageState feesByPackageState2 = feesByPackageState;
        if (feesByPackageInternalAction2 instanceof FeesByPackageInternalAction.Loading) {
            return FeesByPackageState.a(feesByPackageState2, false, true, false, null, null, null, null, null, null, null, 1013);
        }
        if (feesByPackageInternalAction2 instanceof FeesByPackageInternalAction.Error) {
            return FeesByPackageState.a(feesByPackageState2, false, false, false, ((FeesByPackageInternalAction.Error) feesByPackageInternalAction2).f158020b, null, null, null, null, null, null, 1013);
        }
        if (feesByPackageInternalAction2 instanceof FeesByPackageInternalAction.DeepLinkLoading) {
            return FeesByPackageState.a(feesByPackageState2, false, false, ((FeesByPackageInternalAction.DeepLinkLoading) feesByPackageInternalAction2).f158019b, null, null, null, null, null, null, null, 1019);
        }
        if (!(feesByPackageInternalAction2 instanceof FeesByPackageInternalAction.Content)) {
            return feesByPackageState2;
        }
        BE.a aVar2 = ((FeesByPackageInternalAction.Content) feesByPackageInternalAction2).f158018b;
        String price = aVar2.getSnippet().getPrice();
        String str = price.length() == 0 ? null : price;
        BE.e snippet = aVar2.getSnippet();
        FeesByPackageState.e eVar = new FeesByPackageState.e(snippet.getImage(), snippet.getTitle(), str, snippet.getCategory(), snippet.getRegion());
        List<BE.c> listB = aVar2.b();
        if (listB != null) {
            List<BE.c> list = listB;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
            for (BE.c cVar : list) {
                com.akita.compose.theme.re23.g gVar = com.akita.compose.theme.re23.g.f65049a;
                String iconName = cVar.getIconName();
                gVar.getClass();
                String strA = com.akita.compose.theme.re23.g.a(iconName);
                String title = cVar.getTitle();
                BE.d hint = cVar.getHint();
                arrayList2.add(new FeesByPackageState.b(strA, title, hint != null ? new FeesByPackageState.d(com.akita.compose.theme.re23.g.a(hint.getIconName()), hint.getUri()) : null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        BE.b banner = aVar2.getBanner();
        if (banner != null) {
            com.akita.compose.theme.re23.g gVar2 = com.akita.compose.theme.re23.g.f65049a;
            String iconName2 = banner.getIconName();
            gVar2.getClass();
            aVar = new FeesByPackageState.a(com.akita.compose.theme.re23.g.a(iconName2), banner.getText());
        } else {
            aVar = null;
        }
        OkResponseSuccessButton button = aVar2.getButton();
        String title2 = button.getTitle();
        DeepLink uri = button.getUri();
        int i12 = a.f158062a[button.getStyle().ordinal()];
        if (i12 == 1) {
            style = FeesByPackageState.Button.Style.f158039b;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            style = FeesByPackageState.Button.Style.f158040c;
        }
        return FeesByPackageState.a(feesByPackageState2, false, false, false, null, aVar2.getTitle(), eVar, arrayList, aVar, new FeesByPackageState.Button(title2, uri, style), aVar2.getOfferInfo(), 1);
    }
}
