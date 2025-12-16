package com.avito.android.search.filter.adapter.double_input;

import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.Metadata;

/* compiled from: DoubleInputPayloadItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "keyboardShown", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class z<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f262265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C f262266c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.g f262267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f262268e;

    public z(s sVar, s sVar2, C c12, ParameterElement.g gVar) {
        this.f262265b = sVar;
        this.f262266c = c12;
        this.f262267d = gVar;
        this.f262268e = sVar2;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        if (((Boolean) obj).booleanValue() || !this.f262265b.Et()) {
            return;
        }
        C.k(this.f262268e, this.f262266c, this.f262267d);
    }
}
