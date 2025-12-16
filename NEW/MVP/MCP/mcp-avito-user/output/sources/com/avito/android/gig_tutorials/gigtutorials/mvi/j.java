package com.avito.android.gig_tutorials.gigtutorials.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.gig_tutorials.gigtutorials.mvi.entity.GigTutorialsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GigTutorialsReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_tutorials/gigtutorials/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/gig_tutorials/gigtutorials/mvi/entity/GigTutorialsInternalAction;", "LOH/c;", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements u<GigTutorialsInternalAction, OH.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f161160b;

    @Inject
    public j(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f161160b = aVar;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.u
    public final OH.c a(GigTutorialsInternalAction gigTutorialsInternalAction, OH.c cVar) {
        GigTutorialsInternalAction gigTutorialsInternalAction2 = gigTutorialsInternalAction;
        OH.c cVar2 = cVar;
        if (gigTutorialsInternalAction2 instanceof GigTutorialsInternalAction.OpenDeeplink) {
            b.a.a(this.f161160b, ((GigTutorialsInternalAction.OpenDeeplink) gigTutorialsInternalAction2).f161154b, null, null, 6);
            return cVar2;
        }
        if (gigTutorialsInternalAction2 instanceof GigTutorialsInternalAction.ContentLoaded) {
            GigTutorialsInternalAction.ContentLoaded contentLoaded = (GigTutorialsInternalAction.ContentLoaded) gigTutorialsInternalAction2;
            return new OH.c(false, false, contentLoaded.f161149b, contentLoaded.f161150c, contentLoaded.f161151d);
        }
        if (gigTutorialsInternalAction2 instanceof GigTutorialsInternalAction.Error) {
            return OH.c.a(cVar2, false, true);
        }
        if (gigTutorialsInternalAction2 instanceof GigTutorialsInternalAction.Loading) {
            return OH.c.a(cVar2, true, false);
        }
        throw new NoWhenBranchMatchedException();
    }
}
