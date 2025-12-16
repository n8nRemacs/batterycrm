package com.avito.android.cart_snippet_actions.utils;

import Y41.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ItemQuantityChanges.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "Response", "", "it", "", "", "Lcom/avito/android/cart_snippet_actions/utils/Change;", "invoke", "(Ljava/util/Map;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class b extends N implements l<Map<String, Change>, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final b f116280l = new b();

    public b() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(Map<String, Change> map) {
        return Boolean.valueOf(map.isEmpty());
    }
}
