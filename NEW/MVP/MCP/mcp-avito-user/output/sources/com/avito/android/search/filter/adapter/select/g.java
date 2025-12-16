package com.avito.android.search.filter.adapter.select;

import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.Metadata;

/* compiled from: SelectItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00020\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f262581b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v f262582c;

    public g(i iVar, ParameterElement.v vVar) {
        this.f262581b = iVar;
        this.f262582c = vVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f262581b.f262584b.accept(this.f262582c);
    }
}
