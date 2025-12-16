package com.yandex.div.core.resources;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ContextThemeWrapperWithResourceCache.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/yandex/div/core/resources/c;", "invoke", "()Lcom/yandex/div/core/resources/c;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class a extends N implements Y41.a<c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f367641l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(0);
        this.f367641l = bVar;
    }

    @Override // Y41.a
    public final c invoke() {
        return new c(super/*androidx.appcompat.view.d*/.getResources());
    }
}
