package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.C29253t0;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;

/* compiled from: BxContentSavedSearchPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/L0;", "", "b", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface L0 {

    /* compiled from: BxContentSavedSearchPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: BxContentSavedSearchPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/L0$b;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: BxContentSavedSearchPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }
    }

    void a(@Y61.k PresentationType presentationType, @Y61.l SearchParams searchParams, boolean z12, @Y61.l String str, @Y61.l String str2, @Y61.l String str3);

    void b(@Y61.k C29253t0 c29253t0, @Y61.l String str);

    void clear();
}
