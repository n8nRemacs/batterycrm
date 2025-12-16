package com.avito.android.beduin.common.actionhandler.option_selector;

import com.avito.android.beduin.common.action.OpenOptionSelectorAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectorResolver.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/option_selector/d;", "invoke", "()Lcom/avito/android/beduin/common/actionhandler/option_selector/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class n extends N implements Y41.a<d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.view.d f100338l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f100339m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ List<OpenOptionSelectorAction.Option> f100340n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<OpenOptionSelectorAction.Option, G0> f100341o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(androidx.appcompat.view.d dVar, String str, List<OpenOptionSelectorAction.Option> list, Y41.l<? super OpenOptionSelectorAction.Option, G0> lVar) {
        super(0);
        this.f100338l = dVar;
        this.f100339m = str;
        this.f100340n = list;
        this.f100341o = lVar;
    }

    @Override // Y41.a
    public final d invoke() {
        return new d(this.f100338l, this.f100339m, this.f100340n, this.f100341o);
    }
}
