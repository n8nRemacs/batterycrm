package com.avito.android.search.filter.adapter.double_input;

import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.Metadata;

/* compiled from: DoubleInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class o<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.g f262239b;

    public o(ParameterElement.g gVar) {
        this.f262239b = gVar;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        return r.a(this.f262239b.f262753e, (String) obj);
    }
}
