package com.avito.android.serp.adapter.rich_snippets.service.order_request;

import Y61.k;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import com.avito.android.service_order_widget.domain.f;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceItemOrderRequestInteractor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/service/order_request/i;", "Lcom/avito/android/serp/adapter/rich_snippets/service/order_request/h;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements h {
    @Inject
    public i() {
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.service.order_request.h
    public final void a(@k AdvertItem advertItem) {
        Parcelable parcelable;
        List<AdvertAction> actions;
        Object next;
        AdvertActions advertActions = advertItem.f268408U;
        if (advertActions == null || (actions = advertActions.getActions()) == null) {
            parcelable = null;
        } else {
            Iterator<T> it = actions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((AdvertAction) next) instanceof AdvertAction.ServiceOrderRequest) {
                        break;
                    }
                }
            }
            parcelable = (AdvertAction) next;
        }
        AdvertAction.ServiceOrderRequest serviceOrderRequest = parcelable instanceof AdvertAction.ServiceOrderRequest ? (AdvertAction.ServiceOrderRequest) parcelable : null;
        if (serviceOrderRequest != null) {
            serviceOrderRequest.setLoading(false);
        }
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.service.order_request.h
    public final void b(@k AdvertXlItem advertXlItem, @k f.a aVar) {
        Parcelable parcelable;
        List<AdvertAction> actions;
        Object next;
        AdvertActions advertActions = advertXlItem.f268752E;
        if (advertActions == null || (actions = advertActions.getActions()) == null) {
            parcelable = null;
        } else {
            Iterator<T> it = actions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((AdvertAction) next) instanceof AdvertAction.ServiceOrderRequest) {
                        break;
                    }
                }
            }
            parcelable = (AdvertAction) next;
        }
        AdvertAction.ServiceOrderRequest serviceOrderRequest = parcelable instanceof AdvertAction.ServiceOrderRequest ? (AdvertAction.ServiceOrderRequest) parcelable : null;
        if (serviceOrderRequest != null) {
            serviceOrderRequest.setTitle(aVar.f278838a);
            serviceOrderRequest.setDeepLink(aVar.f278840c);
            serviceOrderRequest.setLoading(false);
        }
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.service.order_request.h
    public final void c(@k AdvertItem advertItem, @k f.a aVar) {
        Parcelable parcelable;
        List<AdvertAction> actions;
        Object next;
        AdvertActions advertActions = advertItem.f268408U;
        if (advertActions == null || (actions = advertActions.getActions()) == null) {
            parcelable = null;
        } else {
            Iterator<T> it = actions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((AdvertAction) next) instanceof AdvertAction.ServiceOrderRequest) {
                        break;
                    }
                }
            }
            parcelable = (AdvertAction) next;
        }
        AdvertAction.ServiceOrderRequest serviceOrderRequest = parcelable instanceof AdvertAction.ServiceOrderRequest ? (AdvertAction.ServiceOrderRequest) parcelable : null;
        if (serviceOrderRequest != null) {
            serviceOrderRequest.setTitle(aVar.f278838a);
            serviceOrderRequest.setDeepLink(aVar.f278840c);
            serviceOrderRequest.setLoading(false);
        }
    }

    @Override // com.avito.android.serp.adapter.rich_snippets.service.order_request.h
    public final void d(@k AdvertXlItem advertXlItem) {
        Parcelable parcelable;
        List<AdvertAction> actions;
        Object next;
        AdvertActions advertActions = advertXlItem.f268752E;
        if (advertActions == null || (actions = advertActions.getActions()) == null) {
            parcelable = null;
        } else {
            Iterator<T> it = actions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((AdvertAction) next) instanceof AdvertAction.ServiceOrderRequest) {
                        break;
                    }
                }
            }
            parcelable = (AdvertAction) next;
        }
        AdvertAction.ServiceOrderRequest serviceOrderRequest = parcelable instanceof AdvertAction.ServiceOrderRequest ? (AdvertAction.ServiceOrderRequest) parcelable : null;
        if (serviceOrderRequest != null) {
            serviceOrderRequest.setLoading(false);
        }
    }
}
