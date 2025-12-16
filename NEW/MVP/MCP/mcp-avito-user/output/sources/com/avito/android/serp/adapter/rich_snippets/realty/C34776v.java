package com.avito.android.serp.adapter.rich_snippets.realty;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DevelopmentRichItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.rich_snippets.realty.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34776v {
    public static final DeepLink a(AdvertActions advertActions) {
        Object next;
        Iterator<T> it = advertActions.getActions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AdvertAction) next) instanceof AdvertAction.Messenger) {
                break;
            }
        }
        AdvertAction advertAction = (AdvertAction) next;
        if (advertAction != null) {
            return advertAction.getDeepLink();
        }
        return null;
    }

    public static final DeepLink b(AdvertActions advertActions) {
        Object next;
        Iterator<T> it = advertActions.getActions().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((AdvertAction) next) instanceof AdvertAction.Phone) {
                break;
            }
        }
        AdvertAction advertAction = (AdvertAction) next;
        if (advertAction != null) {
            return advertAction.getDeepLink();
        }
        return null;
    }
}
