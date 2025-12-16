package com.avito.android.profile.remove.screen.items;

import Y61.k;
import com.avito.android.deep_linking.RemovalOnboardingBottomSheetData;
import com.avito.android.deep_linking.RemoveActionDeeplink;
import com.avito.android.remote.model.profile_removal.ProfileRemovalScreen;
import com.avito.android.remote.model.profile_removal.RemovalButton;
import com.avito.android.remote.model.profile_removal.RemovalOnboarding;
import com.avito.android.remote.model.profile_removal.RemovalProcessItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;

/* compiled from: RemoveScreenItemsConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/remove/screen/items/b;", "Lcom/avito/android/profile/remove/screen/items/a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    public static L90.a c(RemovalButton removalButton, RemovalOnboarding removalOnboarding) {
        if (removalButton == null) {
            return null;
        }
        if (removalButton instanceof RemovalButton.External) {
            RemovalButton.External external = (RemovalButton.External) removalButton;
            return new L90.a(external.getTitle(), external.getDeepLink(), external.getType());
        }
        if (!(removalButton instanceof RemovalButton.Internal)) {
            return null;
        }
        RemovalButton.Internal internal = (RemovalButton.Internal) removalButton;
        return new L90.a(internal.getTitle(), new RemoveActionDeeplink(internal.getHasPassword(), internal.getRestoreDeeplink(), removalOnboarding != null ? new RemovalOnboardingBottomSheetData(removalOnboarding.getTitle(), removalOnboarding.getDescription(), removalOnboarding.getButtonTitle()) : null), null);
    }

    @Override // com.avito.android.profile.remove.screen.items.a
    @k
    public final ArrayList a(@k ProfileRemovalScreen profileRemovalScreen) {
        List<RemovalProcessItem> items = profileRemovalScreen.getItems();
        ArrayList arrayList = new ArrayList(C42745f0.q(items, 10));
        int i12 = 0;
        for (Object obj : items) {
            int i13 = i12 + 1;
            com.avito.conveyor_item.a aVar = null;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            RemovalProcessItem removalProcessItem = (RemovalProcessItem) obj;
            String strValueOf = String.valueOf(i12);
            if (removalProcessItem instanceof RemovalProcessItem.Title) {
                RemovalProcessItem.Title title = (RemovalProcessItem.Title) removalProcessItem;
                aVar = new com.avito.android.profile.remove.screen.items.title.a(strValueOf, title.getTitle(), title.getDescription());
            } else if (removalProcessItem instanceof RemovalProcessItem.Link) {
                RemovalProcessItem.Link link = (RemovalProcessItem.Link) removalProcessItem;
                aVar = new com.avito.android.profile.remove.screen.items.link.a(strValueOf, link.getTitle(), link.getDeeplink());
            } else if (removalProcessItem instanceof RemovalProcessItem.Text) {
                aVar = new com.avito.android.profile.remove.screen.items.text.a(strValueOf, ((RemovalProcessItem.Text) removalProcessItem).getTitle());
            } else if (removalProcessItem instanceof RemovalProcessItem.Subtitle) {
                aVar = new com.avito.android.profile.remove.screen.items.subtitle.a(strValueOf, ((RemovalProcessItem.Subtitle) removalProcessItem).getTitle());
            } else if (removalProcessItem instanceof RemovalProcessItem.Header) {
                RemovalProcessItem.Header header = (RemovalProcessItem.Header) removalProcessItem;
                aVar = new com.avito.android.profile.remove.screen.items.header.a(strValueOf, header.getTitle(), header.getDescription());
            } else if (removalProcessItem instanceof RemovalProcessItem.Banner) {
                RemovalProcessItem.Banner banner = (RemovalProcessItem.Banner) removalProcessItem;
                aVar = new com.avito.android.profile.remove.screen.items.banner.a(strValueOf, banner.getTitle(), banner.getDescription(), banner.getLink());
            } else if (removalProcessItem instanceof RemovalProcessItem.TextArea) {
                aVar = new com.avito.android.profile.remove.screen.items.text_area_item.c(strValueOf, ((RemovalProcessItem.TextArea) removalProcessItem).getText());
            } else if (removalProcessItem instanceof RemovalProcessItem.ListItem) {
                RemovalProcessItem.ListItem listItem = (RemovalProcessItem.ListItem) removalProcessItem;
                aVar = new com.avito.android.profile.remove.screen.items.list_item.a(strValueOf, listItem.getTitle(), listItem.getNext());
            } else if (removalProcessItem instanceof RemovalProcessItem.SpacerItem) {
                aVar = new com.avito.android.profile.remove.screen.items.spacer.a(strValueOf, ((RemovalProcessItem.SpacerItem) removalProcessItem).getValue().getHeight());
            }
            arrayList.add(aVar);
            i12 = i13;
        }
        return C42745f0.C(arrayList);
    }

    @Override // com.avito.android.profile.remove.screen.items.a
    @k
    public final ArrayList b(@k ProfileRemovalScreen profileRemovalScreen) {
        return C42756l.B(new L90.a[]{c(profileRemovalScreen.getButton(), profileRemovalScreen.getRemoveOnboarding()), c(profileRemovalScreen.getExtraButton(), profileRemovalScreen.getRemoveOnboarding())});
    }
}
