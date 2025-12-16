package com.avito.android.publish.details.historical_suggest;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.search.Theme;
import kotlin.Metadata;
import nF.C44245a;

/* compiled from: HistoricalSuggestItemFactory.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/details/historical_suggest/a;", "Lcom/avito/android/category_parameters/e;", "Lcom/avito/android/publish/details/historical_suggest/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends com.avito.android.category_parameters.e implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C44245a f234642a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public JO.d f234643b;

    public a(@Y61.k C44245a c44245a) {
        this.f234642a = c44245a;
    }

    @Override // com.avito.android.publish.details.historical_suggest.b
    public final void b(@Y61.k JO.d dVar) {
        this.f234643b = dVar;
    }

    @Override // com.avito.android.category_parameters.e
    @Y61.l
    public final com.avito.conveyor_item.a d(@Y61.k CategoryParameter categoryParameter, @Y61.l Theme theme) {
        if (!(categoryParameter instanceof AddressParameter) || this.f234642a.v().invoke().booleanValue()) {
            return null;
        }
        return this.f234643b;
    }

    @Override // com.avito.android.publish.details.historical_suggest.b
    @Y61.l
    /* renamed from: getItem, reason: from getter */
    public final JO.d getF234643b() {
        return this.f234643b;
    }
}
