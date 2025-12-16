package ru.cyberity.cbr.core.presentation.support;

import Y61.k;
import androidx.view.M0;
import androidx.view.P0;
import kotlin.Metadata;
import ru.cyberity.cbr.core.b;

/* compiled from: CBRSupportViewModel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/presentation/support/CBRSupportViewModelFactory;", "Landroidx/lifecycle/P0$c;", "Lru/cyberity/cbr/core/b;", "serviceLocator", "<init>", "(Lru/cyberity/cbr/core/b;)V", "Landroidx/lifecycle/M0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/M0;", "Lru/cyberity/cbr/core/b;", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRSupportViewModelFactory implements P0.c {

    @k
    private final b serviceLocator;

    public CBRSupportViewModelFactory(@k b bVar) {
        this.serviceLocator = bVar;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public <T extends M0> T create(@k Class<T> modelClass) {
        return new CBRSupportViewModel(this.serviceLocator.getExtensionProvider(), this.serviceLocator.k(), this.serviceLocator.m());
    }
}
