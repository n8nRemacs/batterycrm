package ru.cyberity.cbr.geo.presentation;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import ru.cyberity.cbr.core.CBRCoreModule;
import ru.cyberity.cbr.core.CBRModule;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.data.model.Document;

/* compiled from: CBRGeoViewModel.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/cyberity/cbr/geo/presentation/c;", "Landroidx/lifecycle/a;", "Landroidx/savedstate/e;", SearchParamsConverterKt.OWNER, "Lru/cyberity/cbr/core/b;", "serviceLocator", "Landroid/os/Bundle;", "args", "Lru/cyberity/cbr/core/data/model/Document;", "document", "<init>", "(Landroidx/savedstate/e;Lru/cyberity/cbr/core/b;Landroid/os/Bundle;Lru/cyberity/cbr/core/data/model/Document;)V", "Landroidx/lifecycle/M0;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/r0;", "handle", "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/r0;)Landroidx/lifecycle/M0;", "a", "Lru/cyberity/cbr/core/b;", "b", "Lru/cyberity/cbr/core/data/model/Document;", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c extends AbstractC22993a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.b serviceLocator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final Document document;

    public /* synthetic */ c(InterfaceC23487e interfaceC23487e, ru.cyberity.cbr.core.b bVar, Bundle bundle, Document document, int i12, C42822w c42822w) {
        this(interfaceC23487e, bVar, (i12 & 4) != 0 ? null : bundle, document);
    }

    @Override // androidx.view.AbstractC22993a
    @k
    public <T extends M0> T create(@k String key, @k Class<T> modelClass, @k C23060r0 handle) {
        ru.cyberity.cbr.core.data.source.common.a aVarK = this.serviceLocator.k();
        ru.cyberity.cbr.core.data.source.dynamic.c cVarM = this.serviceLocator.m();
        ru.cyberity.cbr.geo.domain.b bVar = new ru.cyberity.cbr.geo.domain.b(this.serviceLocator.e(), this.serviceLocator.k(), this.serviceLocator.m(), this.serviceLocator.getJson());
        ru.cyberity.cbr.geo.domain.c cVar = new ru.cyberity.cbr.geo.domain.c(this.serviceLocator.e(), this.serviceLocator.z(), this.serviceLocator.k());
        CBRModule pluggedModule = n0.f432787a.getPluggedModule(CBRCoreModule.class.getName());
        CBRCoreModule cBRCoreModule = pluggedModule instanceof CBRCoreModule ? (CBRCoreModule) pluggedModule : null;
        return new b(handle, aVarK, cVarM, bVar, cVar, cBRCoreModule != null && cBRCoreModule.isSkipGeolocationForm(), new ru.cyberity.cbr.core.domain.b(this.serviceLocator.k(), this.serviceLocator.m()), this.document);
    }

    public c(@k InterfaceC23487e interfaceC23487e, @k ru.cyberity.cbr.core.b bVar, @l Bundle bundle, @k Document document) {
        super(interfaceC23487e, bundle);
        this.serviceLocator = bVar;
        this.document = document;
    }
}
