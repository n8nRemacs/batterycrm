package ru.cyberity.cbr.core.presentation.screen.imageviewer;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.view.AbstractC22993a;
import androidx.view.C23060r0;
import androidx.view.InterfaceC23487e;
import androidx.view.M0;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CBRImageViewerViewModel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00182\u00020\u0001:\u0001\u0014B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/cyberity/cbr/core/presentation/screen/imageviewer/c;", "Landroidx/lifecycle/a;", "Landroidx/savedstate/e;", SearchParamsConverterKt.OWNER, "Landroid/os/Bundle;", "args", "Lru/cyberity/cbr/core/b;", "serviceLocator", "<init>", "(Landroidx/savedstate/e;Landroid/os/Bundle;Lru/cyberity/cbr/core/b;)V", "Landroidx/lifecycle/M0;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/r0;", VoiceInfo.STATE, "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/r0;)Landroidx/lifecycle/M0;", "a", "Landroid/os/Bundle;", "b", "Lru/cyberity/cbr/core/b;", "c", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c extends AbstractC22993a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final Bundle args;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final ru.cyberity.cbr.core.b serviceLocator;

    public /* synthetic */ c(InterfaceC23487e interfaceC23487e, Bundle bundle, ru.cyberity.cbr.core.b bVar, int i12, C42822w c42822w) {
        this(interfaceC23487e, (i12 & 2) != 0 ? null : bundle, bVar);
    }

    @Override // androidx.view.AbstractC22993a
    @k
    public <T extends M0> T create(@k String key, @k Class<T> modelClass, @k C23060r0 state) {
        return new b(this.args, this.serviceLocator.k(), this.serviceLocator.m());
    }

    public c(@k InterfaceC23487e interfaceC23487e, @l Bundle bundle, @k ru.cyberity.cbr.core.b bVar) {
        super(interfaceC23487e, bundle);
        this.args = bundle;
        this.serviceLocator = bVar;
    }
}
