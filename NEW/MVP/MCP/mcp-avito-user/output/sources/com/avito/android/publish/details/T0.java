package com.avito.android.publish.details;

import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishDetailsInfoProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/T0;", "Lcom/avito/android/publish/details/S0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class T0 implements S0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.C0 f233162b;

    /* renamed from: c, reason: collision with root package name */
    public final int f233163c;

    @Inject
    public T0(@Y61.k com.avito.android.publish.C0 c02, @com.avito.android.publish.di.W int i12) {
        this.f233162b = c02;
        this.f233163c = i12;
    }

    @Override // com.avito.android.details.a
    @Y61.l
    public final CategoryParameters C0() {
        return this.f233162b.f231873k0;
    }

    @Override // com.avito.android.publish.details.S0
    public final boolean Ma() {
        return false;
    }

    @Override // com.avito.android.publish.InterfaceC34155z
    @Y61.k
    public final Navigation U() {
        return this.f233162b.f231861Y.getNavigation();
    }

    @Override // com.avito.android.publish.details.S0
    @Y61.l
    public final String Y7() {
        return this.f233162b.f231865c0;
    }

    @Override // com.avito.android.publish.details.InterfaceC33675a
    @Y61.l
    public final CategoryPublishStep a() {
        return this.f233162b.re(Integer.valueOf(this.f233163c));
    }

    @Override // com.avito.android.details.e
    @Y61.k
    public final ParametersTree wa() {
        return this.f233162b.pe(this.f233163c);
    }
}
