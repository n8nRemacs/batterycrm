package com.avito.android.esia_redirect_screen.buttons_list;

import Y61.k;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: EsiaRedirectButtonsBaseItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/esia_redirect_screen/buttons_list/EsiaRedirectButtonsBaseItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EsiaRedirectButtonsBaseItem extends com.avito.conveyor_item.a, Parcelable {

    /* compiled from: EsiaRedirectButtonsBaseItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    DeepLink getDeepLink();
}
